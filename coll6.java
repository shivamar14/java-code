import java.util.Stack;
class coll6
{
	public static void main(String[] args)
	{
		Stack<String> s = new Stack<>();
		s.push("ppp");
		s.push("qqq");
		s.push("rrr");
		s.push("sss");
		System.out.println(s);
		System.out.println(s.pop());
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.search("ppp"));
		System.out.println(s);
		System.out.println(s.search("sss"));
		System.out.println(s);
	}
}