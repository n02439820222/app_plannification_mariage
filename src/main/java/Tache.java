public class Tache {
    private String description;
    private String dateLimite;
    private String statut;
    private String priorite;

    // Constructeur
    public Tache(String description, String dateLimite, String statut, String priorite) {
        this.description = description;
        this.dateLimite = dateLimite;
        this.statut = statut;
        this.priorite = priorite;
    }

    // Getter pour la description
    public String getDescription() {
        return description;
    }

    // Méthode pour modifier les informations de la tâche
    public void modifierTache(String nouvelleDescription, String nouvelleDateLimite, String nouveauStatut, String nouvellePriorite) {
        this.description = nouvelleDescription;
        this.dateLimite = nouvelleDateLimite;
        this.statut = nouveauStatut;
        this.priorite = nouvellePriorite;
    }

    @Override
    public String toString() {
        return "Tache{" +
                "description='" + description + '\'' +
                ", dateLimite='" + dateLimite + '\'' +
                ", statut='" + statut + '\'' +
                ", priorite='" + priorite + '\'' +
                '}';
    }
}

