package duotai11;

import java.util.ArrayList;

public class TestArrayList {       //ArrayList存储一个对象列表
	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<>();
		
		cityList.add("London");
		cityList.add("Denver");
		cityList.add("Paris");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");
		
		System.out.println("List size? "+cityList.size());
		System.out.println("Is Miami in the list? "+cityList.contains("Miami"));
		System.out.println("The localtion od Denver in the list? "+cityList.indexOf("Denver"));
		System.out.println("Is the list empty? "+cityList.isEmpty());
		cityList.remove("Miami");
		cityList.remove("Miami");
		cityList.remove(1);
		System.out.println(cityList.toString());
		
		for(int i=cityList.size()-1;i>=0;i--)
			System.out.print(cityList.get(i)+" ");
		System.out.println();
		
		ArrayList<CircleFromSimpleGeometricObject>list=new ArrayList<>();
		list.add(new CircleFromSimpleGeometricObject(2));
		list.add(new CircleFromSimpleGeometricObject(8));
		list.remove(0);
        System.out.println("The area of the circle? "+list.get(0).getArea());
        for(int j=list.size()-1;j>=0;j--)
			System.out.println(list.get(j)+" ");
		System.out.println();
		
	}

}
