package tp_3;

public class maison {
	private String type;
	private String adr;
	private int nbchambre;
	private float surface;
	
	public maison(String adr, String t, int n)
	{
		this.adr=adr;
		this.type=t;
		this.nbchambre=n;
	}
	public maison(String adr, String t, int n,float s)
	{
		this.adr=adr;
		this.type=t;
		this.nbchambre=n;
		this.surface=s;
	}
	public void setSurface(float s)
	{
		this.surface=s;
	}
	public float calculPrix(float pmc)
	{
		return pmc*this.surface;
	}
	public float calculPrix()
	{
		return 2100*surface;
	}
	public String tochaine()
	{
		String msg="un "+this.type+" de "+this.surface+" a "+this.adr+" avec "+this.nbchambre+" chambres";
		return msg;
	}
	public static void main(String[] args) {
		maison m1=new maison("tunis","duplex",4,210);
		maison m2=new maison("nabeul","villa",5);
		System.out.println(m1.tochaine());
		System.out.println(m2.tochaine());
		m2.setSurface(250);
		System.out.println("prix de m1 "+m1.calculPrix());
		System.out.println("prix de m2 est "+m2.calculPrix(2000));
}}



