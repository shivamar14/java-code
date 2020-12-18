import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
class coll3
{
	public static void main(String[] args)
	{
		HashSet<String> h1 = new HashSet<>();
		h1.add("ppp");
		h1.add("qqq");
		h1.add("rrr");
		h1.add("sss");
		System.out.println(h1);
		ArrayList<String> a1 = new ArrayList<>(h1);
		a1.add("ttt");
		a1.add("uuu");
		a1.add("vvv");
		System.out.println(a1);
	}
}
