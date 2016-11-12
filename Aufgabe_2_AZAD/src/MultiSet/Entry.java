package MultiSet;

public interface Entry<E> extends Comparable<Entry<E>>{
	/**
	 * Liefert den objekt Typ des Elements
	 * @return Das objekt des Elements 
	 */
	E getElement();
	/**
	 * Liefert die anzahl diese Elements
	 * @return Die anzahl dieses Elements
	 */
	int getCount();
	/**
	 * Erhöht die anzahl eines Elements
	 */
	void incCount();
	/**
	 * Verringert die anzahl eines Elements
	 */
	void decCount();
	/**
	 * Liefert das Element als String
	 * @return Das Element als String
	 */
	String toString();
}
