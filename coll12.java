import java.util.SortedSet;
import java.util.TreeSet;
class coll12
{
	public static void main(String[] args)
	{
		SortedSet<String> ss = new TreeSet<String>();
		ss.add("aaa");
		ss.add("eee");
		ss.add("fff");
		ss.add("ggg");
		ss.add("jjj");
		ss.add("kkk");
		System.out.println(ss);
		System.out.println(ss.first());
		System.out.println(ss.last());
		System.out.println(ss.headSet("fff"));
		System.out.println(ss.tailSet("fff"));
		System.out.println(ss.subSet("fff","kkk"));
		System.out.println(ss);
	}
}