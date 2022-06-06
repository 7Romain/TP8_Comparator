package fr.oz;

public class Etudiant {
    String prenom;

    @Override
    public String toString() {
        return "Identité de l'étudiant -----> " + nom + " " + prenom + " " + age + " " + "ans.";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
        return result;
    }

    public Etudiant(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {

            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {

            return false;
        }

        Etudiant other = (Etudiant) obj;
        if (age != other.age) {

            return false;
        }
        if (nom == null) {
            if (other.nom != null)
                return false;

        } else if (!nom.equalsIgnoreCase(other.nom))

            return false;
        if (prenom == null) {
            if (other.prenom != null)

                return false;
        } else if (!prenom.equalsIgnoreCase(other.prenom))

            return false;

        return true;

    }

    String nom;
    int age;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
