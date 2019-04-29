package Banque_Strategy;

public class CarteBancaire {
	private PaiementStrategy Paiement;

	/*public CarteBancaire(PaiementStrategy paiement) {
		Paiement = paiement;
	}*/

	public PaiementStrategy getPaiement() {
		return Paiement;
	}

	public void setPaiement(PaiementStrategy paiement) {
		Paiement = paiement;
	}
	public void afficher(String chaine) {
		this.setPaiement(new AmericanStrategy(chaine));
		if(Paiement.estValide(chaine)==1) {
			System.out.println("cette carte est une AMERICAN CARD");
		}
		else {
			this.setPaiement(new VisaStrategy(chaine));
			if(Paiement.estValide(chaine)==1) {
				System.out.println("cette carte est une VISA CARD");
			}
			else {
				this.setPaiement(new EcobankStrategy(chaine));
				if(Paiement.estValide(chaine)==1) {
					System.out.println("cette carte est de ECOBANK CARD");
				}
				else {
					System.out.println("FORMAT CARTE NON RECONNU");
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
        String s="418254697531254";
        String str="391526487950";
        String str1="A8164975234", str2="51348250";
        CarteBancaire carte = new CarteBancaire();
        carte.afficher(s);
        System.out.println("********************************************************************");
        carte.afficher(str);
        System.out.println("********************************************************************");
        carte.afficher(str1);
        System.out.println("********************************************************************");
        carte.afficher(str2);
        
        
    }

}
