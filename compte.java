package tp_3;

public class compte {
	private static int compteur=0;
	private float solde;
	private int numero;
	public void augmenter(float solde)
	{
		this.solde+=solde;
	}
	public void diminuer(float solde)
	{
		this.solde-=solde;
	}
	public float avoirSolde()
	{
		return this.solde;		
	}
	public void transferer(float m,compte c)
	{
		this.diminuer(m);
		c.augmenter(m);
	}
	public float getNum()
	{
		return this.numero;
	}
	public compte()
	{
		compte.compteur++;
		this.numero=compteur;
		this.solde=0;
	}
}
