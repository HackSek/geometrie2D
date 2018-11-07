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
        String noun;
        List<New_point> new_points;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vouliez vous créer un point ou un segment? (1 pour point/2 pour segment)\n");
        valeur = scanner.next();
        if ( valeur == 1 ) {
            System.out.print("Quel est le nom de votre point?\n");
            noun = scanner.next();
            this.nom = noun;
            System.out.print("Quel sont les coordonnées de votre point?\n");
            new_points = scanner.next();
            this.points = new_points;
        } else if ( valeur == 2 ) {
            System.out.print("Quel est le nom de votre segment?\n");
            noun = scanner.next();
            this.nom = noun;
            System.out.print("Quel sont les coordonnées des extremités de votre segment?\n");
            new_points = scanner.next();
            this.points = new_points;
        } else {
            System.out.print("Erreur! Veuillez choisir soit 1 soit 2...");
            break;
        }
    }

    @Override
    public String toString() {
        return "Figure{" + "nom=" + nom + ", points=" + points + '}';
    }
    
    
    
    
}
