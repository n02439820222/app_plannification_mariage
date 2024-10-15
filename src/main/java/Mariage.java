public class Mariage {
    private String nomMaries;
    private String date;
    private String lieu;
    private double budgetTotal;

    // Constructeur
    public Mariage(String nomMaries, String date, String lieu, double budgetTotal) {
        this.nomMaries = nomMaries;
        this.date = date;
        this.lieu = lieu;
        this.budgetTotal = budgetTotal;
    }

    // Getter pour le nom des mariés
    public String getNomMaries() {
        return nomMaries;
    }

    // Méthode pour modifier les informations du mariage
    public void modifierMariage(String nouveauNom, String nouvelleDate, String nouveauLieu, double nouveauBudget) {
        this.nomMaries = nouveauNom;
        this.date = nouvelleDate;
        this.lieu = nouveauLieu;
        this.budgetTotal = nouveauBudget;
    }

    @Override
    public String toString() {
        return "Mariage{" +
                "nomMaries='" + nomMaries + '\'' +
                ", date='" + date + '\'' +
                ", lieu='" + lieu + '\'' +
                ", budgetTotal=" + budgetTotal +
                '}';
    }
}

