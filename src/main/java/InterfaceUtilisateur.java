import java.util.ArrayList;
import java.util.Scanner;

public class InterfaceUtilisateur {
    private Scanner scanner;
    private final ArrayList<Mariage> mariages;
    private final ArrayList<Invite> invites;
    private final ArrayList<Fournisseur> fournisseurs;
    private final ArrayList<Tache> taches;

    public InterfaceUtilisateur() {
        this.scanner = new Scanner(System.in);
        this.mariages = new ArrayList<>();
        this.invites = new ArrayList<>();
        this.fournisseurs = new ArrayList<>();
        this.taches = new ArrayList<>();
    }

    public void demarrer() {
        while (true) {
            afficherMenu();
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consomme la nouvelle ligne

            switch (choix) {
                case 1: ajouterMariage(); break;
                case 2: modifierMariage(); break;
                case 3: supprimerMariage(); break;
                case 4: afficherMariages(); break;
                case 5: ajouterInvite(); break;
                case 6: modifierInvite(); break;
                case 7: supprimerInvite(); break;
                case 8: afficherInvites(); break;
                case 9: ajouterFournisseur(); break;
                case 10: modifierFournisseur(); break;
                case 11: supprimerFournisseur(); break;
                case 12: afficherFournisseurs(); break;
                case 13: ajouterTache(); break;
                case 14: modifierTache(); break;
                case 15: supprimerTache(); break;
                case 16: afficherTaches(); break;
                case 17: quitter(); return;
                default: System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
    }

    private void quitter() {
        System.out.println("Merci d'avoir utilisé l'application de planification de mariage !");
        scanner.close();
    }

    private void afficherTaches() {
        System.out.println("Liste des tâches :");
        for (Tache t : taches) {
            System.out.println(t);
        }
    }

    private void afficherMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Ajouter un mariage");
        System.out.println("2. Modifier un mariage");
        System.out.println("3. Supprimer un mariage");
        System.out.println("4. Afficher tous les mariages");
        System.out.println("5. Ajouter un invité");
        System.out.println("6. Modifier un invité");
        System.out.println("7. Supprimer un invité");
        System.out.println("8. Afficher tous les invités");
        System.out.println("9. Ajouter un fournisseur");
        System.out.println("10. Modifier un fournisseur");
        System.out.println("11. Supprimer un fournisseur");
        System.out.println("12. Afficher tous les fournisseurs");
        System.out.println("13. Ajouter une tâche");
        System.out.println("14. Modifier une tâche");
        System.out.println("15. Supprimer une tâche");
        System.out.println("16. Afficher toutes les tâches");
        System.out.println("17. Quitter");
        System.out.print("Choisissez une option: ");
    }

    private void ajouterMariage() {
        System.out.print("Nom des mariés: ");
        String nomMaries = scanner.nextLine();
        System.out.print("Date (ex: JJ/MM/AAAA): ");
        String dateMariage = scanner.nextLine();
        System.out.print("Lieu: ");
        String lieuMariage = scanner.nextLine();
        System.out.print("Budget total: ");
        double budgetTotalMariage = scanner.nextDouble();
        scanner.nextLine(); // Consomme la nouvelle ligne

        Mariage mariage = new Mariage(nomMaries, dateMariage, lieuMariage, budgetTotalMariage);
        mariages.add(mariage);
        System.out.println("Mariage ajouté : " + mariage.getNomMaries());
    }

    private void modifierMariage() {
        // Code de modification de mariage (similaire à ce qui est dans Main.java)
    }

    private void supprimerMariage() {
        // Code de suppression de mariage (similaire à ce qui est dans Main.java)
    }

    private void afficherMariages() {
        System.out.println("Liste des mariages :");
        for (Mariage m : mariages) {
            System.out.println(m);
        }
    }

    private void ajouterInvite() {
        // Code pour ajouter un invité (similaire à ce qui est dans Main.java)
    }

    private void modifierInvite() {
        // Code de modification d'invité (similaire à ce qui est dans Main.java)
    }

    private void supprimerInvite() {
        // Code de suppression d'invité (similaire à ce qui est dans Main.java)
    }

    private void afficherInvites() {
        System.out.println("Liste des invités :");
        for (Invite i : invites) {
            System.out.println(i);
        }
    }

    private void ajouterFournisseur() {
        // Code pour ajouter un fournisseur (similaire à ce qui est dans Main.java)
    }

    private void modifierFournisseur() {
        // Code de modification de fournisseur (similaire à ce qui est dans Main.java)
    }

    private void supprimerFournisseur() {
        // Code de suppression de fournisseur (similaire à ce qui est dans Main.java)
    }

    private void afficherFournisseurs() {
        System.out.println("Liste des fournisseurs :");
        for (Fournisseur f : fournisseurs) {
            System.out.println(f);
        }
    }

    private void ajouterTache() {
        // Code pour ajouter une tâche (similaire à ce qui est dans Main.java)
    }

    private void modifierTache() {
        // Code de modification de tâche (similaire à ce qui est dans Main.java)
    }

    private void supprimerTache() {
        // Code de suppression de tâche (similaire à ce qui est dans Main.java)
    }

    public static void main(String[] args) {
        InterfaceUtilisateur interfaceUtilisateur = new InterfaceUtilisateur();
        interfaceUtilisateur.demarrer();
    }
}
