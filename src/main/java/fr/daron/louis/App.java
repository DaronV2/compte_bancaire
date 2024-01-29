package fr.daron.louis;

public class App {
    
    public static void main(String[] args) {
        compteBancaire compte1 = new compteBancaire("Antoine",1000);
        compte1.retirerArgent(600.0);
        compte1.deposerArgent(150.0);
        compte1.informationsCompte();
        compte1.retirerArgent(600.0);
        compte1.informationsCompte();
    }
    
}
