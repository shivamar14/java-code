import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collection;
class coll1
{
	public static void main(String[] args)
	{
		Collection<String> c1 = new HashSet<>();
		c1.add("sss");
		c1.add("qqq");
		c1.add("rrr");
		c1.add("ttt");
		System.out.println(c1.add("ppp"));
		System.out.println(c1);
		System.out.println(c1.remove("ppp"));
		System.out.println(c1);
		Collection<String> c2 = new HashSet<>();
		c2.add("xxx");
		c2.add("yyy");
		c2.add("zzz");
		c2.add("iii");
		System.out.println(c2);
		System.out.println(c2.addAll(c1));
		System.out.println(c2);
		System.out.println(c2.removeAll(c1));
		System.out.println(c2);
		System.out.println(c2.size());
		System.out.println(c2.contains("xxx"));
		System.out.println(c2.contains("xxa"));
		System.out.println(c2.containsAll(c1));
		System.out.println(c2.addAll(c1));
		System.out.println(c2.containsAll(c1));
		c1.clear();
		System.out.println(c1);
		System.out.println(c1.isEmpty());
		HashSet<String> h = new HashSet<String>();
		HashSet<String> h1 = (HashSet<String>)h.clone();
		System.out.println(h);
		System.out.println(h1);
		Object [] str = c2.toArray();
		for(Object s:str)
		{
			System.out.println(s);
		}
	}
}
