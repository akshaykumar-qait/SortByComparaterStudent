import java.util.Comparator;

public class SortByComparator implements Comparator<MyStudent> 
{

	
	@Override
	public int compare(MyStudent o1, MyStudent o2) {
		if (o1.CGPA < o2.CGPA)
			return -1;
		else if (o1.CGPA > o2.CGPA)
			return 1;
		
		else
		{
		   if(o1.name.equals(o2.name))
			{return o1.ID - o2.ID;
			}
			else
			{	return o2.name.compareTo(o1.name);	
			}
			
		}
	}
	
}
