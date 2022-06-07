
package fr.oz;

public class CompareEtudiantSalarie extends CompareEtudiant {
    @Override
    public int compare(Etudiant p1, Etudiant p2) {
        if (p1 instanceof Salarie && !(p2 instanceof Salarie)) {
            return -1;
        } else if (p1 instanceof Salarie && p2 instanceof Salarie) {

            return ((((Salarie) p1).getIdentifiant()) - (((Salarie) p2).getIdentifiant()));

        }

        return super.compare(p1, p2);
    }
}
