import java.util.LinkedList;
import java.util.List;

class Data {
	private Object obj;

	public Data(Object obj) {
		
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
	
	
	
}

class GenericClass<T> {
	private T data;

	public GenericClass(T data) {
		
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "GenericClass [data=" + data + "]";
	}
	
	
	
}
class GenericsWithTwoGenerics<T,R>
{
	private T firstVar;
	private R secondVar;
	public GenericsWithTwoGenerics(T firstVar, R secondVar) {
		
		this.firstVar = firstVar;
		this.secondVar = secondVar;
	}
	@Override
	public String toString() {
		return "GenericsWithTwoGenerics [firstVar=" + firstVar + ", secondVar=" + secondVar + "]";
	}
	
	
	
}

public class MainClass {

	public static void main(String[] args) {
		/*
		Data data = new Data("string");
		Data data1 = new Data(2);
		
		System.out.println(data);
		System.out.println(data1);
           */
		//typecasting reduces performance application
		GenericClass<String> x = new GenericClass<String>("hi");
		GenericClass<Integer> y = new GenericClass<Integer>(3);
		String dx = x.getData();
		int dy = y.getData();
		System.out.println(dx);
		System.out.println(dy);
		System.out.println("-------------------");
		
		List<GenericClass<String>> elems = new LinkedList<>();
		elems.add(new GenericClass<String>("hi"));
		elems.add(new GenericClass<String>("3"));
		elems.add(new GenericClass<String>("333"));
		System.out.println(elems);
		
		
		List<GenericClass<Integer>> elems2 = new LinkedList<>();
		elems2.add(new GenericClass<Integer>(5));
		elems2.add(new GenericClass<Integer>(22));
		elems2.add(new GenericClass<Integer>(44));
		System.out.println(elems2);
		
		display("hi","bye");
		display(2,3);
		
		System.out.println("-------------------");
		
		GenericsWithTwoGenerics<String,String> firstVariable= new GenericsWithTwoGenerics<String,String>("hey","uo");
		GenericsWithTwoGenerics<Integer,Integer> secondVariable= new GenericsWithTwoGenerics<Integer,Integer>(3,5);
		GenericsWithTwoGenerics<Double,Character> thirdVariable= new GenericsWithTwoGenerics<Double,Character>(3.66,'Y');
		
		System.out.println(firstVariable);
		System.out.println(secondVariable);
		System.out.println(thirdVariable);
		
	}
	
	
	public static <Roman, Reigns> void display (Roman element, Reigns number)
	{
		System.out.println("here here");
		System.out.println(element);
		System.out.println(number);
	}

}
