import java.util.ArrayList;
import java.util.Collections;

public class MyStudent {

	
	String name;
	int ID;
	double CGPA;
	
	public MyStudent(int a , String name, double CGPA ) {
		// TODO Auto-generated constructor stub
	
		this.name=name.toLowerCase();
		this.ID = a;
		this.CGPA = CGPA;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<MyStudent> myObj = new ArrayList<>();
		myObj.add(new MyStudent(33, "A", 3.68));
		myObj.add(new MyStudent(85, "A", 3.68));
		myObj.add(new MyStudent(56, "C", 23.68));
		myObj.add(new MyStudent(57, "C", 23.68));
		myObj.add(new MyStudent(22, "E", 3.68));

		Collections.sort(myObj, new SortByComparator());

		for (int ii = myObj.size() - 1; ii >= 0; ii--)
			System.out.println(myObj.get(ii).PrintNow());

	}
	
	
	public String PrintNow()
	{
		return this.ID+" "+this.name+" "+this.CGPA;
		
	}

}
