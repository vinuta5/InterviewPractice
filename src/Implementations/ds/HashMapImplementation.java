package Implementations.ds;
import java.util.*;

class HashNode<K,V>{
	K key;
	V value;
	HashNode(K key, V value){
		this.key = key;
		this.value = value;
	}
}
public class HashMapImplementation<K,V> {
	int CAPACITY = 16;
	LinkedList<HashNode> [] buckets = new LinkedList[CAPACITY];
	
	void putEntry(K key, V value){
		int index = getHashCode(key) % buckets.length;
		if(buckets[index] != null  && getEntry(key) != null){
			int searchIndex = searchEntry(buckets[index], key);
			buckets[index].get(searchIndex).value = value;
		}
		else{
			HashNode<K,V> node = new HashNode(key,value);
			if(buckets[index] == null){
				LinkedList<HashNode> list = new LinkedList();
				list.add(node);
				buckets[index] = list;
			}
			else{
				buckets[index].add(node); 
			}
		}
	}
	int getHashCode(K key){
		return key.hashCode();
	}
	int searchEntry(LinkedList<HashNode> list, K key){
		for(int i = 0; i < list.size(); ++ i){
			if(list.get(i).key.equals(key)){
				return i;
			}
		}
		return -1;
	}
	V getEntry(K key){
		int index = getHashCode(key) % buckets.length;
		if(buckets[index] == null) return null;
		for(HashNode h : buckets[index]){
			if(h.key.equals(key)){
				return (V)h.value;
			}
		}
		return null;
	}
 
	
	public static void main(String[] args) {

	}

}
