class MixedOperators
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 5;
		int c = 15;
		
		int d = a+b;
		int e = b-c;
		int f = c*a;
		int g = a/b;
		int h = b%c;
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		a+=c;
		f-=g;
		e*=b;
		g/=h;
		h%=b;
		
		System.out.println(a);
		System.out.println(f);
		System.out.println(e);
		System.out.println(g);
		System.out.println(h);
		
		boolean u = (a==b);
		boolean v = (a!=c);
		boolean w = (d>=f);
		boolean x = (b<=c);
		boolean y = (f<g);
		boolean z = (d>a);
		
		System.out.println(u);
		System.out.println(v);
		System.out.println(w);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		boolean m = (d<=a)&&(f>=b)&&(c<a);
		boolean n = (a>=b)||(c<=b)||(d>a);
		boolean o = (b>c)&&(a>=d)||(c<=a);
		boolean p = !(a>=c);
		
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}