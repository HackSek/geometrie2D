/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author YOUNES
 */
public class Figure {
    private String nom;
    private List<Point> points;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void entreFigure(String nom, List <Point> points) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vouliez vous créer un point ou un segment? (1 pour point/2 pour segment)");
        valeur = scanner.next();
        System.out.print(valeur);
    }

    @Override
    public String toString() {
        return "Figure{" + "nom=" + nom + ", points=" + points + '}';
    }
    
    
    
    
}
