import java.util.TreeSet;
import java.util.*;
class employee implements Comparable<employee>
{
	int eid;
	String ename;
	int esal;
	employee(int eid,String ename,int esal)
	{
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}
	
	public int compareTo(employee emp)
	{
		int val=0;
		val=this.ename.compareTo(emp.ename);
		return val;
	}
	
	public String toString()
	{
		return "["+eid+","+ename+","+esal+"]\n";
	}
}
class coll14
{
	public static void main(String[] args)
	{
		employee e1 = new employee(11,"aaa",2000000);
		employee e2 = new employee(25,"eee",3000000);
		employee e3 = new employee(99,"ccc",4000000);
		employee e4 = new employee(88,"bbb",5000000);
		employee e5 = new employee(12,"ddd",6000000);
		
		TreeSet<employee> t = new TreeSet<>();
		t.add(e3);
		t.add(e2);
		t.add(e1);
		t.add(e5);
		t.add(e4);
		System.out.println(t);
	}
}