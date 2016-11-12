package MultiSet;

import java.util.Iterator;

import LinkedListSet.LinkedListSet;
import LinkedListSet.Set;

public class LinkedListMultiSet<E extends Comparable<E>> implements Multiset<E> {

	private Set<Entry<E>> s;
	private int count;

	public LinkedListMultiSet() {
		s = new LinkedListSet<Entry<E>>();
		count=0;

	}

	@Override
	public int size() {
		

		return this.count;
	}

	@Override
	public boolean isEmpty() {
		return this.s.isEmpty();
	}

	public boolean contains(E e) {
		return this.s.contains(new EntryImpl<E>(e));
	}

	@Override
	public boolean add(E e) {
		Entry<E> entry = new EntryImpl<E>(e);
		if (!this.s.add(entry)) {
			this.s.getMatch(entry).incCount();
		}
		this.count++;
		return true;
	}

	@Override
	public boolean remove(E e) {
		Entry<E> en = (EntryImpl<E>) this.s.getMatch(new EntryImpl<E>(e));
		if(en==null) return false;
		if(en.getCount()>1){
			en.decCount();
			this.count--;
			return true;
		}else{
			if(this.s.remove(en)){
				this.count--;
				return true;
			}
			return false;
		}
	}

	@Override
	public void clear() {
		this.count=0;
		this.s.clear();
	}

	@Override
	public E getMatch(E e) {
		return  this.s.getMatch(new EntryImpl<E>(e)).getElement();
	}

	@Override
	public Iterator<E> iterator() {
		return new Cursor(this.s.iterator());
	}

	@Override
	public int count(E e) {
		Entry<E> en = this.s.getMatch(new EntryImpl<E>(e));
		if(en!=null){
			return en.getCount();
		}
		return 0;
	}

	@Override
	public int distinct() {
		return this.s.size();
	}

	public String toString() {
		StringBuilder string = new StringBuilder();
		for (Entry<E> entry : s) {
			string.append(entry.getElement());
			string.append(":");
			string.append(entry.getCount());
			string.append("\n");
		}
		return string.toString();
		
	}

	private class Cursor implements Iterator<E> {
		private int counter;;
		private Iterator<E> it;
		private Entry<E> en;

		public Cursor(Iterator<Entry<E>> iterator) {
			this.it = (Iterator<E>) iterator;
			this.en = null;
			this.counter=1;
		}

		private int getCounter() {
			return this.counter;
		}

		public boolean hasNext() {
			if(!this.it.hasNext()){
				if(this.en.getCount()>this.getCounter()){
					return true;
				}
				else{
					return false;
				}
			}
			return true;
		}
		
		@Override
		public E next() {
			if (this.en == null) {
				this.en = (Entry<E>) this.it.next();
				return this.en.getElement();
			}
			if (this.en.getCount() > this.getCounter()) {
				this.counter++;
				return this.en.getElement();
			}
			this.counter=1;
			this.en=(Entry<E>) this.it.next();
			return this.en.getElement();
		}

	}
}
