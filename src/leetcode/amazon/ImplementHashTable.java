package leetcode.amazon;

import java.util.*;

public class ImplementHashTable<K, V> {
	class HashNode<K, V> {
		K key;
		V value;

		HashNode(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}
	int CAPACITY = 16;
	LinkedList<HashNode<K, V>>[] buckets = new LinkedList[CAPACITY];

	void putEntry(K key, V value) {
		int index = getHashCode(key) % buckets.length;
		if (buckets[index] != null && getEntry(key) != null) {
			int i = searchEntry(buckets[index], key);
			buckets[index].get(i).value = value;
		} else {
			HashNode<K, V> node = new HashNode(key, value);
			if (buckets[index] == null) {
				LinkedList<HashNode<K, V>> list = new LinkedList();
				list.add(node);
				buckets[index] = list;
			} else {
				buckets[index].add(node);
			}
		}
	}

	V getEntry(K key) {
		int index = getHashCode(key) % buckets.length;
		for (HashNode n : buckets[index]) {
			if (key.equals(n.key)) {
				return (V) n.value;
			}
		}
		return (V) null;
	}

	int getHashCode(K key) {
		return key.hashCode();
	}

	int searchEntry(LinkedList<HashNode<K, V>> list, K key) {
		for (int i = 0; i < list.size(); i++) {
			if (key.equals(list.get(i).key)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		ImplementHashTable<String, Integer> obj = new ImplementHashTable<String, Integer>();
		obj.putEntry("king", 100);
		obj.putEntry("king", 200);
		obj.putEntry("ward", 300);
	}
}
