import java.util.ArrayList;
import java.util.LinkedList;


// TODO: comment and complete your HashTableADT implementation
// DO ADD UNIMPLEMENTED PUBLIC METHODS FROM HashTableADT and DataStructureADT TO YOUR CLASS
// DO IMPLEMENT THE PUBLIC CONSTRUCTORS STARTED
// DO NOT ADD OTHER PUBLIC MEMBERS (fields or methods) TO YOUR CLASS
//
// TODO: implement all required methods
//
// TODO: describe the collision resolution scheme you have chosen
// identify your scheme as open addressing or bucket
//
// TODO: explain your hashing algorithm here 
// NOTE: you are not required to design your own algorithm for hashing,
//       since you do not know the type for K,
//       you must use the hashCode provided by the <K key> object
//       and one of the techniques presented in lecture
//
public class HashTable<K extends Comparable<K>, V> implements HashTableADT<K, V> {
	
	private class Pair<K extends Comparable<K>,V> extends Object {
		private K key;
		private V value;
		
		private Pair(K key, V value) {
			this.key = key;
			this.value = value;
		}
	}
	
	private int numKeys = 0;
	private int tableSize;
	private double loadFactorThreshold;  
	private double loadFactor = (double)numKeys() / (double)tableSize;
	LinkedList<Pair>[] hashArray;
	
	
	// TODO: ADD and comment DATA FIELD MEMBERS needed for your implementation
		
	// TODO: comment and complete a default no-arg constructor
	public HashTable() {
		tableSize = 1000;
		loadFactorThreshold = .75;
		hashArray = new LinkedList[tableSize];
	}
	
	// TODO: comment and complete a constructor that accepts 
	// initial capacity and load factor threshold
        // threshold is the load factor that causes a resize and rehash
	public HashTable(int initialCapacity, double loadFactorThreshold) {
		this.tableSize = initialCapacity;
		this.loadFactorThreshold = loadFactorThreshold;
		hashArray = new LinkedList[tableSize];
		
	
	}

	@Override
	public void insert(K key, V value) throws IllegalNullKeyException {
		if (key == null) {
			throw new IllegalNullKeyException();
		}
		int hashIndex = hash(key);	
		Pair newPair = new Pair(key, value);	//create object to hold key, value pair
		
		if (hashArray[hashIndex] == null) {
			LinkedList<Pair> bucket = new LinkedList<Pair>();	//create new bucket
			hashArray[hashIndex] = bucket;		//point the empty hashArray element to newly created bucket
			bucket.addFirst(newPair);
			numKeys++;
		}
		else {
			boolean found = false;
			int i = 0;
			while (!found && i < hashArray.length) {
				
			}
		}
	}
	
	private int hash(K key) {
		return Math.abs(key.hashCode() % tableSize);
	}

	@Override
	public boolean remove(K key) throws IllegalNullKeyException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(K key) throws IllegalNullKeyException, KeyNotFoundException {
		return null;
	}

	@Override
	public int numKeys() {
		// TODO Auto-generated method stub
		return numKeys;
	}

	@Override
	public double getLoadFactorThreshold() {
		return loadFactorThreshold;
	}

	@Override
	public double getLoadFactor() {
		return loadFactor;
	}

	@Override
	public int getCapacity() {
		return tableSize;
	}

	@Override
	public int getCollisionResolution() {
		// TODO Auto-generated method stub
		return 5;
	}

	// TODO: implement all unimplemented methods so that the class can compile

		
}
