import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;
class coll4
{
	public static void main(String[] args)
	{
		Vector<String> h1 = new Vector<>(20,4);
		h1.add("ppp");
		h1.add("qqq");
		h1.add("rrr");
		h1.add("sss");
		System.out.println(h1);
		System.out.println(h1.capacity());
		for(int i=0;i<=21;i++)
		{
			h1.add("ggg");
		}
		System.out.println(h1);
		System.out.println(h1.capacity());
		HashSet<String> h2 = new HashSet<>();
		h2.add("aaa");
		h2.add("bbb");
		h2.add("ccc");
		h2.add("ddd");
		System.out.println(h2);
		Vector<String> h3 = new Vector<>(h2);
		System.out.println(h3);
	}
}