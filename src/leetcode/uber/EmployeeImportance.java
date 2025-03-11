/*
 Populate a map lookup mapping ids with employee objects from the input list
 Using bfs, add the subordinates chains to the queue and update the total result importance to current employee importance
 */

package leetcode.uber;
import java.util.*;
class Employee{
	int id, importance;
	List<Integer> subordinates;
	Employee(int id, int importance){
		this.id = id;
		this.importance = importance;
	}
}
public class EmployeeImportance {
	public static void main(String[] args) {
	}
	public static int getImportance(List<Employee> employees, int id){
		int total_imp = 0;
		HashMap<Integer,Employee> idLookup = new HashMap<Integer,Employee>();
		for(Employee emp : employees){
			idLookup.put(emp.id, emp);
		}
		Queue<Integer> bfsQueue = new LinkedList<Integer>();
		bfsQueue.add(id);
		while(!bfsQueue.isEmpty()){
			Employee curr = idLookup.get(bfsQueue.poll());
			bfsQueue.addAll(curr.subordinates);
			total_imp += curr.importance;
		}
		return total_imp;
	}
}
