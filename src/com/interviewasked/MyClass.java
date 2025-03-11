package com.interviewasked;
class Point{
	int x,y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
class MyClass{

	public void Swap(Point arg1, Point arg2)
	{
	  arg1.x = 100;
	  arg1.y = 100;
	  Point temp = arg1;
	  arg1 = arg2;
	  arg2 = temp;
	}
	public static void main(String [] args)
	{
		MyClass c = new MyClass();
	  Point pnt1 = new Point(0,0);
	  Point pnt2 = new Point(0,0);
	  c.Swap(pnt1,pnt2); 
	  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);  
	}
}
    