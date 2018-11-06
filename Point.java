/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

/**
 *
 * @author YOUNES
 */
public class Point {
    private String nom;
    private double abscisse;
    private double ordonnee;

    public Point(String nom, double abscisse, double ordonnee) {
        this.nom = nom;
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }
    
    
  

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    
    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public double getOrdonnee() {
        return ordonnee;
    }

    public void setOrdonnee(double ordonnee) {
        this.ordonnee = ordonnee;
    }

    @Override
    public String toString() {
        return    nom + "( abscisse=" + abscisse + ", ordonnee=" + ordonnee + ")";
    }

   
           
}
