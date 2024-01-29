package fr.daron.louis;

public class compteBancaire {
    private String nomProprio;
    public double solde;

    compteBancaire(String nomProprio, double solde){
        this.solde = solde;
        this.nomProprio = nomProprio;
    }

    public String getNomProprio() {
        return this.nomProprio;
    }

    public void setNomProprio(String nomProprio) {
        this.nomProprio = nomProprio;
    }

    public double getSolde() {
        return this.solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void retirerArgent(double somme){
        if (somme <= solde){
            solde = solde - somme;
            System.out.println("Vous avez retiré "+ somme + " euro(s), il vous reste donc " + solde + " euro(s).");
        }else{
            System.out.println("Vous ne pouvez pas retirer "+somme+" euro(s) car votre solde est de "+solde+" euro(s)");
        }
    }


    public void deposerArgent(double somme){
        solde = solde + somme;
        System.out.println("Vous avez deposé "+somme+" euro(s), il vous reste donc " + solde + " euro(s).");
    }

    public void informationsCompte(){
        System.out.println(" Votre nom est : "+nomProprio+" \n Votre solde est de : "+solde);
    }

    public String virement(compteBancaire c1, compteBancaire c2, int somme){
        c1.solde -= somme;
        c2.solde += somme;
        return "Vous avez virez la somme de "+somme +" euro(s)";
    }
}
