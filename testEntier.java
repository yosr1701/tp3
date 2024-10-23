package tp_3;

public class testEntier {
	public static void main(String[] args) {
		System.out.println("le factorielle : "+entier.facto(5));
		System.out.println("valeur absolue :"+entier.absolu(0));
		entier.comparer(3, 7);
		int a=7;
		if (entier.premier(a))
			System.out.println("\n"+a+" est premier");
		else
			System.out.println("\n"+a+" n'est pas premier");
		entier.valeur+=10;
		System.out.println("la valeur aprés l'incrémentation "+entier.valeur);
	}
}
