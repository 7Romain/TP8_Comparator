package fr.oz;

import java.util.ArrayList;
import java.util.Iterator;

public class Societe {
    ArrayList<Etudiant> listePersonnel;

    public Societe() {
        listePersonnel = new ArrayList<>();
    }

    void recruter(Etudiant etudiant) {

        listePersonnel.add(etudiant);

    }

    void congedier(Etudiant etudiant) {
        listePersonnel.remove(etudiant);
    }

    void afficher() {
        Iterator<Etudiant> iterateur = listePersonnel.iterator();
        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }

    }
}
