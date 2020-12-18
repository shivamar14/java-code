import java.util.NavigableSet;
import java.util.TreeSet;
class coll13
{
	public static void main(String[] args)
	{
		NavigableSet<String> s = new TreeSet<String>();
		s.add("aaa");
		s.add("bbb");
		s.add("ccc");
		s.add("ddd");
		s.add("eee");
		System.out.println(s);
		System.out.println(s.descendingSet());
		System.out.println(s.ceiling("ccc"));
		System.out.println(s.floor("ccc"));
		System.out.println(s.lower("ccc"));
		System.out.println(s.higher("ccc"));
		System.out.println(s.pollLast());
		System.out.println(s.pollFirst());
		System.out.println(s);
	}
}