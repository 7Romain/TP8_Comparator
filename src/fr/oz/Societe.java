package fr.oz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Societe {
    ArrayList<Etudiant> listePersonnel;
    int dernierId;

    CompareEtudiant comparaison = new CompareEtudiantSalarie();

    public Societe() {
        listePersonnel = new ArrayList<>();
    }

    void congedier(Etudiant etudiant) {
        listePersonnel.remove(etudiant);
    }

    void afficher() {
        afficher(true);
    }

    void afficher(boolean ordre) {
        if (ordre) {
            Collections.sort(listePersonnel, comparaison);
        } else {
            Collections.sort(listePersonnel, comparaison.reversed());
        }
        Iterator<Etudiant> iterateur = listePersonnel.iterator();
        while (iterateur.hasNext()) {
            System.out.println(iterateur.next());
        }

    }

    public Salarie recruter(Etudiant etudiant) {

        int id = ++dernierId;
        Salarie salarie = new Salarie(etudiant.getNom(), etudiant.getPrenom(), etudiant.getAge(), id);
        listePersonnel.add(salarie);
        listePersonnel.remove(etudiant);
        return salarie;
    }

    public void congedier(Salarie employe) {

        Etudiant etudiant = new Etudiant(employe.getNom(), employe.getPrenom(), employe.getAge());
        listePersonnel.add(etudiant);
        listePersonnel.remove(employe);
    }

}
