
public class Livre {
	
    String titre;
    String auteur;
    int anneePublication;
    
	public Livre(String titre, String auteur, int ansPub ) {
		
		this.titre = titre;
		this.auteur = auteur;
		this.anneePublication = ansPub;
	}
	
	public void AfficheDetails() {
		
		System.out.println("Le titre du livre est" + titre + "de L'auteur " + auteur + "publié en " + anneePublication);
		
	}
}


