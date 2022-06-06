package fr.oz;

public class Principale {
    public static void main(String[] args) {

        // Etudiant etudiant1 = new Etudiant("Dupont", "Albert", 22);
        // Etudiant etudiant2 = new Etudiant("DUPONT", "albert", 22);
        // Etudiant etudiant3 = new Etudiant("Mercier", "Jean", 55);
        // Etudiant etudiant4 = new Etudiant("MERCIER", "Jean", 55);
        // etudiant1.equals(etudiant3);
        // etudiant1.equals(etudiant2);
        // etudiant1.equals(etudiant4);
        // etudiant1.equals(etudiant4);
        // etudiant3.equals(etudiant4);
        // System.out.println(etudiant1);
        // System.out.println(etudiant2);
        // System.out.println(etudiant3);
        // System.out.println(etudiant4);

        Societe entreprise = new Societe();
        Etudiant pers = new Etudiant("Durand", "Michel", 55);
        entreprise.recruter(new Etudiant("Mercier", "Jean", 50));
        entreprise.recruter(new Etudiant("Morin", "Nathalie", 35));
        entreprise.recruter(new Etudiant("Martin", "Louis", 35));
        entreprise.recruter(new Etudiant("Dupont", "Josette", 25));
        entreprise.recruter(new Etudiant("Charpentier", "Pierre", 25));
        entreprise.recruter(pers);
        entreprise.afficher();
        entreprise.congedier(pers);

    }

}
