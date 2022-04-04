import java.util.ArrayList;
import java.util.List;

class Data {
	public <E> void printListData (List<E> list)
	{
		for(E element: list)
		{
			System.out.println(element);
		}
	}
	
	public <E> E returnShit(E var)
	{
		return var;
	}
}

class dummyClass {
	private int h= 8008;

	@Override
	public String toString() {
		return "dummyClass [h=" + h + "]";
	}
	
	
	
	
}

public class MainClass {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(50);
		
		List<String> listString = new ArrayList<>();
		listString.add("one");
		listString.add("tw");
		listString.add("thr");
		
		Data data = new Data();
		data.printListData(list);
		data.printListData(listString);

		
		System.out.println(data.returnShit(3));
		System.out.println(data.returnShit("heu"));
		System.out.println(data.returnShit(new dummyClass()));
		
	}

}
