
class Datas<K, V> {
	private K key;
	private V value;

	public Datas(K key, V value) {

		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public <E extends Character,N extends Number> void display (E element, N number) {
		System.out.println(element);
		System.out.println(number);
	}
}

public class NewMainClass {

	public static void main(String[] args) {
		Datas<Integer,String> datas = new Datas<Integer,String>(1,"value");
		datas.display('R', 3);
		datas.display('^', 3.223);
		//datas.display(3, "hey");

	}

}
