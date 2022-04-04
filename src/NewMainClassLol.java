
class DataStr<T extends Comparable<T>> implements Comparable<T>{
	private T myVar;

	public DataStr(T myVar) {
		super();
		this.myVar = myVar;
	}

	public T getMyVar() {
		return myVar;
	}

	public void setMyVar(T myVar) {
		this.myVar = myVar;
	}

	@Override
	public String toString() {
		return "DataStr [myVar=" + myVar + "]";
	}

	@Override
	public int compareTo(T o) {
		
		return getMyVar().compareTo(o);
	}
	
	
}

public class NewMainClassLol {

	public static void main(String[] args) {
		
		DataStr<Integer> data = new DataStr<Integer>(1);
		
		System.out.println(data.compareTo(3));
		System.out.println(data.compareTo(0));

	}

}
