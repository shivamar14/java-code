import java.util.HashSet;
import java.util.LinkedHashSet;
class coll11
{
	public static void main(String[] args)
	{
		HashSet<String> h = new HashSet<>(5,0.65f);
		h.add("aaa");
		h.add("bbb");
		h.add("ccc");
		h.add("ddd");
		h.add("eee");
		h.add("fff");
		System.out.println(h);
		LinkedHashSet<Object> lh = new LinkedHashSet<Object>();
		lh.add("aaa");
		lh.add("bbb");
		lh.add("ccc");
		lh.add("ddd");
		lh.add("eee");
		lh.add("fff");
		System.out.println(lh);
	}
}