package tp_3;

public class banque {
	public static void main(String[] args) {
	compte c1=new compte();
	compte c2=new compte();
	System.out.println("compte numero :"+c1.getNum()+" solde : "+c1.avoirSolde());
	System.out.println("compte numero :"+c2.getNum()+" solde : "+c2.avoirSolde());
	c1.augmenter(1200);
	c2.augmenter(500);
	System.out.println("compte numero :"+c1.getNum()+" solde : "+c1.avoirSolde());
	System.out.println("compte numero :"+c2.getNum()+" solde : "+c2.avoirSolde());
	c2.transferer(700, c1);
	System.out.println("apres la transfert");
	System.out.println("compte numero :"+c1.getNum()+" solde : "+c1.avoirSolde());
	System.out.println("compte numero :"+c2.getNum()+" solde : "+c2.avoirSolde());
	if ((c2.avoirSolde())<=0)
		System.out.println("compte c2 est en rouge");
	if (c1.avoirSolde()<=0)
		System.out.println("compte c1 est en rouge");
	}
}
