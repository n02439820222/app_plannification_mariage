public class Invite {
    private String nom;
    private String email;
    private String telephone;
    private String statutPresence;

    public Invite(String nom, String email, String telephone, String statutPresence) {
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
        this.statutPresence = statutPresence;
    }

    public String getNom() {
        return nom;
    }

    public void modifierInvite(String nouveauNom, String nouvelEmail, String nouveauTelephone, String nouveauStatut) {
        this.nom = nouveauNom;
        this.email = nouvelEmail;
        this.telephone = nouveauTelephone;
        this.statutPresence = nouveauStatut;
    }

    @Override
    public String toString() {
        return "Invité: " + nom + ", Email: " + email + ", Téléphone: " + telephone + ", Statut: " + statutPresence;
    }
}