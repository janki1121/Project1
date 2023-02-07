package pojo;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class TransactionPojo implements List<TransactionPojo>  {
	private int transaction_id;
	private int transaction_date;
	private int transfer_amount;
	private int transferTo;
	private int transferFrom;
	public TransactionPojo(int transaction_id, int transaction_date, int transfer_amount, int transferTo,
			int transferFrom) {
		super();
		this.transaction_id = transaction_id;
		this.transaction_date = transaction_date;
		this.transfer_amount = transfer_amount;
		this.transferTo = transferTo;
		this.transferFrom = transferFrom;
	}
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public int getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(int transaction_date) {
		this.transaction_date = transaction_date;
	}
	public int getTransfer_amount() {
		return transfer_amount;
	}
	public void setTransfer_amount(int transfer_amount) {
		this.transfer_amount = transfer_amount;
	}
	public int getTransferTo() {
		return transferTo;
	}
	public void setTransferTo(int transferTo) {
		this.transferTo = transferTo;
	}
	public int getTransferFrom() {
		return transferFrom;
	}
	public void setTransferFrom(int transferFrom) {
		this.transferFrom = transferFrom;
	}
	@Override
	public String toString() {
		return "TransactionPojo [transaction_id=" + transaction_id + ", transaction_date=" + transaction_date
				+ ", transfer_amount=" + transfer_amount + ", transferTo=" + transferTo + ", transferFrom="
				+ transferFrom + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(transaction_date, transaction_id, transferFrom, transferTo, transfer_amount);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		TransactionPojo other = (TransactionPojo) obj;
		return transaction_date == other.transaction_date && transaction_id == other.transaction_id
				&& transferFrom == other.transferFrom && transferTo == other.transferTo
				&& transfer_amount == other.transfer_amount;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Iterator<TransactionPojo> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean add(TransactionPojo e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(Collection<? extends TransactionPojo> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(int index, Collection<? extends TransactionPojo> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public TransactionPojo get(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public TransactionPojo set(int index, TransactionPojo element) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void add(int index, TransactionPojo element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public TransactionPojo remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ListIterator<TransactionPojo> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ListIterator<TransactionPojo> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<TransactionPojo> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
