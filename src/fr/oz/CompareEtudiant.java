package fr.oz;

import java.util.Comparator;

public class CompareEtudiant implements Comparator<Etudiant> {
    @Override
    public int compare(Etudiant p1, Etudiant p2) {
        if (p1.getNom().compareTo(p2.getNom()) == 0) {

            if (p1.getPrenom().compareTo(p2.getPrenom()) == 0) {
                return p1.getAge() - p2.getAge();
            }
            return p1.getPrenom().compareTo(p2.getPrenom());
        }
        return p1.getNom().compareTo(p2.getNom());

    }

}
