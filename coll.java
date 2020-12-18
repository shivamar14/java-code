import java.util.HashSet;
class coll
{
	public static void main (String [] args)
	{
		HashSet<String> h = new HashSet<String>();
		System.out.println(h.add("hello"));
		System.out.println(h.add("hello"));
		System.out.println(h.add("hellos"));
		h.add("bye");
		System.out.println(h);
	}
}