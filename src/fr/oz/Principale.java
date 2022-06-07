package fr.oz;

import java.util.Collections;

public class Principale {
    public static void main(String[] args) {

        Societe entreprise = new Societe();
        Etudiant pers = new Etudiant("Durand", "Michel", 55);
        entreprise.recruter(new Etudiant("Mercier", "Jean", 50));
        entreprise.recruter(new Etudiant("Morin", "Nathalie", 35));
        entreprise.recruter(new Etudiant("Martin", "Louis", 35));
        entreprise.recruter(new Etudiant("Rodriguez", "Philippe", 35));
        entreprise.recruter(new Etudiant("Rodriguez", "Evelyne", 30));
        entreprise.recruter(new Etudiant("Martin", "Josette", 25));
        entreprise.recruter(new Etudiant("Charpentier", "Pierre", 25));
        entreprise.recruter(new Etudiant("Charpentier", "Pierre", 18));
        entreprise.recruter(pers);
        entreprise.afficher();
        entreprise.congedier(pers);
        CompareEtudiant comparaison = new CompareEtudiant();
        System.out.println("------------------------------------------------------------------");
        Collections.sort(entreprise.listePersonnel, comparaison);
        entreprise.afficher(true);

    }

}
