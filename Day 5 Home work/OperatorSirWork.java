class OperatorSirWork
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println("Arithmetic Oper");
		int d = a+b;
		int e = c-b;
		int f = b*a;
		int g = f/b;
		int h = f%d;
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		System.out.println("*********************");
		System.out.println("Assignment Oper");
		
		a+=d;
		b-=e;
		c*=f;
		d/=g;
		g%=f;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(g);
		
		System.out.println("*********************");
		System.out.println("Relational Oper");
		
		boolean z = (a==b);
		boolean y = (a!=b);
		boolean x = (a>c);
		boolean w = (g<h);
		boolean v = (e<=f);
		boolean u = (d>=a);
		
		System.out.println(z);
		System.out.println(y);
		System.out.println(x);
		System.out.println(w);
		System.out.println(v);
		System.out.println(u);
		
		System.out.println("*********************");
		System.out.println("Logical Oper");
		
		boolean p = (d<=e)&&(x)&&(5>10)&&(u);
		boolean q = (d<=e)||(x)||(5>10)||(u);
		boolean r = (d<=e)&&(x)||(5>10)&&(u);
		boolean s = !((d<=e)&&!(x)||!(5>10)&&(u));
	
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(s);
		
		
		
		
		
	}
}