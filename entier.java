package tp_3;

public class entier {
	static int valeur=0;
	public static int facto(int a)
	{
		int f=1;
		for(int i=1;i<=a;i++)
		{
			f=f*i;
		}
		return f;
	}
	public static int absolu(int a)
	{
		if (a<0)
			return (a*-1);
		else
			return (a);
	}
	public static  void comparer(int a,int b)
	{
		if (a<b)
		{
			System.out.print(b+" est supérieur a "+a);
		}
		else if (a>b)
		{
			System.out.print(a+" est supérieur a "+b);
		}
		else
		{
			System.out.print(a+" et "+b+" sont egaux");
		}
	}
	public static boolean premier(int a)
	{
		int c=0;
		for(int i=2;i<a;i++)
		{
			if (a%i==0)
				c++;
		}
		return (c==0);
	}
	
}
