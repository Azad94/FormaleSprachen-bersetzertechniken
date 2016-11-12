package MultiSet;


public class EntryImpl<E extends Comparable<E>> implements Entry<E>{
	
	private E entry;
	private int count;
	
	public EntryImpl(E e) {
		this.entry=e;
		this.count=1;
	}
	
	@Override
	public E getElement() {
		return this.entry;
	}

	@Override
	public int getCount() {
		return this.count;
	}

	@Override
	public void incCount() {
		this.count++;
		
	}

	@Override
	public void decCount() {
		this.count--;
		
	}

	@Override
	public int compareTo(Entry<E> o) {
		return this.getElement().compareTo(o.getElement());
	}
	
	public String toString() {
		return this.getElement()+":"+this.getCount();
	}
}
