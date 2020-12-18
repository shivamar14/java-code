import java.util.Vector;
class coll5
{
	public static void main(String[] args)
	{
		Vector<String> v1 = new Vector<>();
		v1.addElement("ppp");
		v1.addElement("qqq");
		v1.addElement("rrr");
		v1.addElement("sss");
		v1.addElement("ttt");
		System.out.println(v1);
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
		System.out.println(v1);
		v1.removeElement("ppp");
		System.out.println(v1);
		v1.removeElementAt(3);
		System.out.println(v1);
		v1.removeAllElements();
		System.out.println(v1);
	}
}