import java.util.LinkedList;
class coll8
{
	public static void main(String[] args)
	{
		LinkedList<String> l = new LinkedList<String>();
		l.add("aaa");
		l.add("bbb");
		l.add("ccc");
		l.add("ddd");
		l.add("eee");
		l.add("fff");
		System.out.println(l);
		l.addFirst("ppp");
		l.addLast("qqq");
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		System.out.println(l);
	}
}