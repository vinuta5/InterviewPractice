package com.interviewasked;
import java.util.*;

public class ProfitOrLoss {
	public static Map<String,Integer> profitOrLossLookup = new HashMap();
	static class StockDetails{
		String date,action;
		int noOfStocks, costPerStock;
		StockDetails(String date, String action,int noOfStocks,int costPerStock){
			this.date = date;
			this.action = action;
			this.noOfStocks = noOfStocks;
			this.costPerStock = costPerStock;
		}
	}
	static int getProfitOrLoss(int sell_price, int sell_units, int buy_price,int buy_units){
		return (sell_price * sell_units) - (buy_price * buy_units);
	}
	static void calculateProfitOrLoss(ArrayList<StockDetails> list){	
		Map<Integer,Integer> costToStocksMap = new TreeMap();
		for(StockDetails s : list){
			if(s.action.equals("buy")){
				costToStocksMap.put(s.costPerStock, costToStocksMap.containsKey(s.costPerStock) ? costToStocksMap.get(s.costPerStock) + s.noOfStocks : s.noOfStocks);
			}
			else{
				Set<Integer> set = costToStocksMap.keySet();
				int counter = set.size();
				for(int key : set){
					if(costToStocksMap.get(key) >= s.noOfStocks){
						costToStocksMap.put(key,costToStocksMap.get(key) - s.noOfStocks); // update the costToStocks map
						int profit_or_loss = getProfitOrLoss( s.costPerStock,s.noOfStocks,key,s.noOfStocks);
						profitOrLossLookup.put(s.date, profit_or_loss);
						break;
					}
					counter --;
				}
			}
		}
	}
	
	static void getResultForADate(String date){
		if(!profitOrLossLookup.containsKey(date)) {
			System.out.println("There are no required stocks bought ");
			return;
		}
		int result = profitOrLossLookup.get(date);
		if( result > 0){
			System.out.println("Profit of : $" + result);
		}
		else if(result < 0){
			System.out.println("Loss of : $" + result);
		}
		else{
			System.out.println("No Profit No Loss on that day");
		}
	}
	public static void main(String[] args) {
		StockDetails stock1 = new StockDetails("1-Jan-2018","buy",100,5);
		StockDetails stock2 = new StockDetails("2-Jan-2018","buy",100,6);
		StockDetails stock3 = new StockDetails("3-Jan-2018","buy",50,5);
		StockDetails stock4 = new StockDetails("4-Jan-2018","sell",100,7);
		StockDetails stock5 = new StockDetails("5-Jan-2018","sell",50,5);
		StockDetails stock6 = new StockDetails("6-Jan-2018","sell",100,2);
		ArrayList<StockDetails> list = new ArrayList<StockDetails>();
		list.add(stock1);list.add(stock2);list.add(stock3);list.add(stock4);list.add(stock5);list.add(stock6);
		calculateProfitOrLoss(list);
		getResultForADate("6-Jan-2018");
	}

}
