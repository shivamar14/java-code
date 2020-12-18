import java.util.LinkedList;
import java.util.Iterator;
class coll9
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
		Iterator i = l.iterator();
		while(i.hasNext())
		{
			String element = (String)i.next();
			if(element.equals("ccc"))
			{
				i.remove();
			}
			System.out.println(element);
		}
	}
}