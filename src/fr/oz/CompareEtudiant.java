package fr.oz;

import java.util.Comparator;

public class CompareEtudiant implements Comparator<Etudiant> {
    @Override
    public int compare(Etudiant p1, Etudiant p2){
        int diff =p1.getNom().compareTo(p2.getNom());
        if (diff != 0) {
            return diff;
        }
        diff =p1.getPrenom().compareTo(p2.getPrenom());
        if (diff != 0) {
            return diff;
        }
        diff = Integer.comparep1.getAge(), p2.getAge());
        if (diff != 0) {
            return diff;
        }
    }
}
