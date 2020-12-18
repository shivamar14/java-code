import java.util.LinkedList;
import java.util.ListIterator;
class coll10
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
		
		
		
		ListIterator ii = l.listIterator();
		while(ii.hasNext())
		{
			System.out.println(ii.nextIndex()+"-----"+ii.next());
		}
		System.out.println();
		while(ii.hasPrevious())
		{
			System.out.println(ii.previousIndex()+"-----"+ii.previous());
		}
		System.out.println();
		
		
		
		ListIterator i = l.listIterator();
		while(i.hasNext())
		{
			String element = (String)i.next();
			if(element.equals("bbb"))
			{
				i.add("xxx");
			}
			if(element.equals("eee"))
			{
				i.set("yyy");
			}
			if(element.equals("fff"))
			{
				i.remove();
			}
			System.out.println(element);
		}
		
		
		
		System.out.println(l);
	}
}