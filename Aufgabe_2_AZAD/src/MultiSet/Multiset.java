package MultiSet;

public interface Multiset<E> extends MultiSet.Collection<E> {
	/**
	 * Liefert die anzahl eines Elements
	 * @param e	Das Element von dem die Anzahl gebraucht wird
	 * @return	Die Anzahl eines Elements
	 */
	int count(E e); 
	/**
	 * Gibt die Anzahl der verschiedenen Elemente zurück
	 * @return	Die Anzahl der verschiedenen Elemente
	 */
	int distinct();
	/**
	 * Die Liste als String mit Anzahl der Elemente 
	 * Bps. Hallo:3 
	 * @return	Die Elemente in der Liste plus deren anzahl 
	 */
	String toString();
}

