import java.util.ArrayList;
import java.util.Collection;
class coll2
{
	public static void main(String[] args)
	{
		ArrayList<String> a1 = new ArrayList<>();
		a1.add(0,"ppp");
		a1.add(1,"qqq");
		a1.add(2,"rrr");
		a1.add(3,"sss");
		a1.add(4,"sss");
		System.out.println(a1);
		System.out.println(a1.get(0));
		a1.add(1,"ttt");
		System.out.println(a1);
		a1.set(3,"uuu");
		System.out.println(a1);
		System.out.println(a1.set(2,"mmm"));
		System.out.println(a1);
		System.out.println(a1.indexOf("sss"));
		System.out.println(a1);
		System.out.println(a1.lastIndexOf("sss"));
		System.out.println(a1.remove(4));
		System.out.println(a1);
		System.out.println("---------------------");
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		System.out.println("---------------------");
		for(String s:a1)
		{
			System.out.println(s);
		}
		System.out.println("---------------------");
		int j = 0;
		while(j<a1.size())
		{
			System.out.println(a1.get(j));
			j = j+1;
		}
		System.out.println("---------------------");
		int k = 0;
		do
		{
			System.out.println(a1.get(k));
			k = k+1;
		}while(k<a1.size());
	}
}