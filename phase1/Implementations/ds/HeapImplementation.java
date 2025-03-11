package Implementations.ds;

import java.util.Arrays;

public class HeapImplementation {
	int capacity = 10, size = 0;
	int [] minHeap = new int[capacity];
	
	int getLeftChildIndex(int parentIndex){
		return parentIndex * 2 + 1;
	}
	int getRightChildIndex(int parentIndex){
		return parentIndex * 2 + 2;
	}
	int getParentIndex(int childIndex){
		return (childIndex - 1)/2;
	}
	boolean hasLeftChild(int parentIndex){
		return getLeftChildIndex(parentIndex) < size;
	}
	boolean hasRightChild(int parentIndex){
		return getRightChildIndex(parentIndex) < size;
	}
	boolean hasParent(int childIndex){
		return getParentIndex(childIndex) >= 0;
	}
	int getLeftChild(int parentIndex){
		return minHeap[getLeftChildIndex(parentIndex)];
	}
	int getRightChild(int parentIndex){
		return minHeap[getRightChildIndex(parentIndex)];
	}
	int getParent(int childIndex){
		return minHeap[getParentIndex(childIndex)];
	}
	void swap(int index1,int index2){
		int temp = minHeap[index1];
		minHeap[index1] = minHeap[index2];
		minHeap[index2] = temp;
	}
	int peek(){
		if(size == 0) throw new IllegalStateException();
		return minHeap[0];
	}
	void adjustCapacity(){
		if(size == capacity){
			minHeap = Arrays.copyOf(minHeap,2 * capacity);
			capacity *= 2;
		}
	}
	void addNode(int node){
		adjustCapacity();
		minHeap[size] = node;
		size ++;
		heapifyUp();
	}
	void heapifyUp(){
		int index = size -1;
		while(hasParent(index) && getParent(index) > minHeap[index]){
			swap(getParentIndex(index) , index);
			index = getParentIndex(index);
		}
	}
	int poll(){
		if(size == 0) throw new IllegalStateException();
		int remove = minHeap[0];
		minHeap[0] = minHeap[size -1];
		size --;
		heapifyDown();
		return remove;
	}
	void heapifyDown(){
		int index = 0;
		while(hasLeftChild(index)){
			int smallerIndex = getLeftChildIndex(index);
			if(hasRightChild(index) && getRightChild(index) < getLeftChild(index)){
				smallerIndex = getRightChildIndex(index);
			}
			if(minHeap[index] < minHeap[smallerIndex]){
				break;
			}
			else{
				swap(index,smallerIndex);
			}
			index = smallerIndex;
		}
	}
	public static void main(String[] args) {
	}

}
