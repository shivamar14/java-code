import java.util.Vector;
import java.util.Enumeration;
class coll7
{
	public static void main(String[] args)
	{
		Vector<String> v = new Vector<String>();
		v.addElement("aaa");
		v.addElement("bbb");
		v.addElement("ccc");
		v.addElement("ddd");
		v.addElement("eee");
		v.addElement("fff");
		System.out.println(v);
		
		Enumeration <String> e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}