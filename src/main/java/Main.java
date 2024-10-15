import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mariage> mariages = new ArrayList<>();
        ArrayList<Invite> invites = new ArrayList<>();
        ArrayList<Fournisseur> fournisseurs = new ArrayList<>();
        ArrayList<Tache> taches = new ArrayList<>();

        while (true) {
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
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consomme la nouvelle ligne

            switch (choix) {
                case 1: // Ajouter un mariage
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
                    break;

                case 2: // Modifier un mariage
                    System.out.print("Entrez le nom des mariés à modifier: ");
                    String nomAModifier = scanner.nextLine();
                    boolean mariageTrouve = false;

                    for (Mariage m : mariages) {
                        if (m.getNomMaries().equalsIgnoreCase(nomAModifier)) {
                            mariageTrouve = true;
                            System.out.print("Nouveau nom des mariés: ");
                            String nouveauNom = scanner.nextLine();
                            System.out.print("Nouvelle date: ");
                            String nouvelleDate = scanner.nextLine();
                            System.out.print("Nouveau lieu: ");
                            String nouveauLieu = scanner.nextLine();
                            System.out.print("Nouveau budget total: ");
                            double nouveauBudget = scanner.nextDouble();
                            scanner.nextLine(); // Consomme la nouvelle ligne

                            m.modifierMariage(nouveauNom, nouvelleDate, nouveauLieu, nouveauBudget);
                            System.out.println("Mariage modifié : " + m.getNomMaries());
                            break;
                        }
                    }

                    if (!mariageTrouve) {
                        System.out.println("Mariage non trouvé.");
                    }
                    break;

                case 3: // Supprimer un mariage
                    System.out.print("Entrez le nom des mariés à supprimer: ");
                    String nomASupprimer = scanner.nextLine();
                    mariageTrouve = false;

                    for (int i = 0; i < mariages.size(); i++) {
                        if (mariages.get(i).getNomMaries().equalsIgnoreCase(nomASupprimer)) {
                            mariages.remove(i);
                            System.out.println("Mariage supprimé : " + nomASupprimer);
                            mariageTrouve = true;
                            break;
                        }
                    }

                    if (!mariageTrouve) {
                        System.out.println("Mariage non trouvé.");
                    }
                    break;

                case 4: // Afficher tous les mariages
                    System.out.println("Liste des mariages :");
                    for (Mariage m : mariages) {
                        System.out.println(m);
                    }
                    break;

                case 5: // Ajouter un invité
                    System.out.print("Nom de l'invité: ");
                    String nomInvite = scanner.nextLine();
                    System.out.print("Email: ");
                    String emailInvite = scanner.nextLine();
                    System.out.print("Numéro de téléphone: ");
                    String telInvite = scanner.nextLine();
                    System.out.print("Statut de présence (confirmé/non confirmé): ");
                    String statutPresence = scanner.nextLine();

                    Invite invite = new Invite(nomInvite, emailInvite, telInvite, statutPresence);
                    invites.add(invite);
                    System.out.println("Invité ajouté : " + invite.getNom());
                    break;

                case 6: // Modifier un invité
                    System.out.print("Entrez le nom de l'invité à modifier: ");
                    String nomInviteAModifier = scanner.nextLine();
                    boolean inviteTrouve = false;

                    for (Invite i : invites) {
                        if (i.getNom().equalsIgnoreCase(nomInviteAModifier)) {
                            inviteTrouve = true;
                            System.out.print("Nouveau nom: ");
                            String nouveauNom = scanner.nextLine();
                            System.out.print("Nouvelle email: ");
                            String nouvelEmail = scanner.nextLine();
                            System.out.print("Nouveau numéro de téléphone: ");
                            String nouveauTel = scanner.nextLine();
                            System.out.print("Nouveau statut de présence: ");
                            String nouveauStatut = scanner.nextLine();

                            i.modifierInvite(nouveauNom, nouvelEmail, nouveauTel, nouveauStatut);
                            System.out.println("Invité modifié : " + i.getNom());
                            break;
                        }
                    }

                    if (!inviteTrouve) {
                        System.out.println("Invité non trouvé.");
                    }
                    break;

                case 7: // Supprimer un invité
                    System.out.print("Entrez le nom de l'invité à supprimer: ");
                    String nomInviteASupprimer = scanner.nextLine();
                    inviteTrouve = false;

                    for (int i = 0; i < invites.size(); i++) {
                        if (invites.get(i).getNom().equalsIgnoreCase(nomInviteASupprimer)) {
                            invites.remove(i);
                            System.out.println("Invité supprimé : " + nomInviteASupprimer);
                            inviteTrouve = true;
                            break;
                        }
                    }

                    if (!inviteTrouve) {
                        System.out.println("Invité non trouvé.");
                    }
                    break;

                case 8: // Afficher tous les invités
                    System.out.println("Liste des invités :");
                    for (Invite i : invites) {
                        System.out.println(i);
                    }
                    break;

                case 9: // Ajouter un fournisseur
                    System.out.print("Nom du fournisseur: ");
                    String nomFournisseur = scanner.nextLine();
                    System.out.print("Type de service: ");
                    String typeService = scanner.nextLine();
                    System.out.print("Coordonnées: ");
                    String coordonnees = scanner.nextLine();

                    Fournisseur fournisseur = new Fournisseur(nomFournisseur, typeService, coordonnees);
                    fournisseurs.add(fournisseur);
                    System.out.println("Fournisseur ajouté : " + fournisseur.getNom());
                    break;

                case 10: // Modifier un fournisseur
                    System.out.print("Entrez le nom du fournisseur à modifier: ");
                    String nomFournisseurAModifier = scanner.nextLine();
                    boolean fournisseurTrouve = false;

                    for (Fournisseur f : fournisseurs) {
                        if (f.getNom().equalsIgnoreCase(nomFournisseurAModifier)) {
                            fournisseurTrouve = true;
                            System.out.print("Nouveau nom: ");
                            String nouveauNomFournisseur = scanner.nextLine();
                            System.out.print("Nouveau type de service: ");
                            String nouveauTypeService = scanner.nextLine();
                            System.out.print("Nouvelles coordonnées: ");
                            String nouvellesCoordonnees = scanner.nextLine();

                            f.modifierFournisseur(nouveauNomFournisseur, nouveauTypeService, nouvellesCoordonnees);
                            System.out.println("Fournisseur modifié : " + f.getNom());
                            break;
                        }
                    }

                    if (!fournisseurTrouve) {
                        System.out.println("Fournisseur non trouvé.");
                    }
                    break;

                case 11: // Supprimer un fournisseur
                    System.out.print("Entrez le nom du fournisseur à supprimer: ");
                    String nomFournisseurASupprimer = scanner.nextLine();
                    fournisseurTrouve = false;

                    for (int i = 0; i < fournisseurs.size(); i++) {
                        if (fournisseurs.get(i).getNom().equalsIgnoreCase(nomFournisseurASupprimer)) {
                            fournisseurs.remove(i);
                            System.out.println("Fournisseur supprimé : " + nomFournisseurASupprimer);
                            fournisseurTrouve = true;
                            break;
                        }
                    }

                    if (!fournisseurTrouve) {
                        System.out.println("Fournisseur non trouvé.");
                    }
                    break;



                case 12: // Afficher tous les fournisseurs
                    System.out.println("Liste des fournisseurs :");
                    for (Fournisseur f : fournisseurs) {
                        System.out.println(f);
                    }
                    break;

                case 13: // Ajouter une tâche
                    System.out.print("Description de la tâche: ");
                    String descriptionTache = scanner.nextLine();
                    System.out.print("Date limite (ex: JJ/MM/AAAA): ");
                    String dateLimite = scanner.nextLine();
                    System.out.print("Statut (terminée/en cours): ");
                    String statutTache = scanner.nextLine();
                    System.out.print("Priorité (haute/moyenne/faible): ");
                    String prioriteTache = scanner.nextLine();

                    Tache tache = new Tache(descriptionTache, dateLimite, statutTache, prioriteTache);
                    taches.add(tache);
                    System.out.println("Tâche ajoutée : " + tache.getDescription());
                    break;

                case 14: // Modifier une tâche
                    System.out.print("Entrez la description de la tâche à modifier: ");
                    String descriptionTacheAModifier = scanner.nextLine();
                    boolean tacheTrouvee = false;

                    for (Tache t : taches) {
                        if (t.getDescription().equalsIgnoreCase(descriptionTacheAModifier)) {
                            tacheTrouvee = true;
                            System.out.print("Nouvelle description: ");
                            String nouvelleDescription = scanner.nextLine();
                            System.out.print("Nouvelle date limite: ");
                            String nouvelleDateLimite = scanner.nextLine();
                            System.out.print("Nouveau statut: ");
                            String nouveauStatut = scanner.nextLine();
                            System.out.print("Nouvelle priorité: ");
                            String nouvellePriorite = scanner.nextLine();

                            t.modifierTache(nouvelleDescription, nouvelleDateLimite, nouveauStatut, nouvellePriorite);
                            System.out.println("Tâche modifiée : " + t.getDescription());
                            break;
                        }
                    }

                    if (!tacheTrouvee) {
                        System.out.println("Tâche non trouvée.");
                    }
                    break;

                case 15: // Supprimer une tâche
                    System.out.print("Entrez la description de la tâche à supprimer: ");
                    String descriptionTacheASupprimer = scanner.nextLine();
                    tacheTrouvee = false;

                    for (int i = 0; i < taches.size(); i++) {
                        if (taches.get(i).getDescription().equalsIgnoreCase(descriptionTacheASupprimer)) {
                            taches.remove(i);
                            System.out.println("Tâche supprimée : " + descriptionTacheASupprimer);
                            tacheTrouvee = true;
                            break;
                        }
                    }

                    if (!tacheTrouvee) {
                        System.out.println("Tâche non trouvée.");
                    }
                    break;

                case 16: // Afficher toutes les tâches
                    System.out.println("Liste des tâches :");
                    for (Tache t : taches) {
                        System.out.println(t);
                    }
                    break;

                case 17: // Quitter
                    System.out.println("Merci d'avoir utilisé l'application de planification de mariage !");
                    scanner.close();
                    return;

                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
    }
}
