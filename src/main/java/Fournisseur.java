public class Fournisseur {
    private String nom;
    private String typeService;
    private String coordonnees;

    public Fournisseur(String nom, String typeService, String coordonnees) {
        this.nom = nom;
        this.typeService = typeService;
        this.coordonnees = coordonnees;
    }

    public String getNom() {
        return nom;
    }

    public void modifierFournisseur(String nouveauNom, String nouveauTypeService, String nouvellesCoordonnees) {
        this.nom = nouveauNom;
        this.typeService = nouveauTypeService;
        this.coordonnees = nouvellesCoordonnees;
    }

    @Override
    public String toString() {
        return "Fournisseur: " + nom + ", Service: " + typeService + ", Coordonnées: " + coordonnees;
    }
}
