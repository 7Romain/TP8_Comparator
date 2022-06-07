package fr.oz;

public class Salarie extends Etudiant {
    int identifiant;

    public Salarie(String nom, String prenom, int age, int identifiant) {
        super(nom, prenom, age);
        this.identifiant = identifiant;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    @Override
    public String toString() {
        return "Salarié N°" + identifiant + " : " + nom + " " + prenom + " " + age + " " + "ans.";
    }

}
