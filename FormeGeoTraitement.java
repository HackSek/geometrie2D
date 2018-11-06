/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

import java.util.List;

/**
 *
 * @author YOUNES
 */
public class FormeGeoTraitement {

    public Point calcMax(Point p1, Point p2) {
        double maxX = calcMax(p1.getAbscisse(), p2.getAbscisse());
        double maxY = calcMax(p1.getOrdonnee(), p2.getOrdonnee());
        Point resultat = new Point("MAX", maxX, maxY);
        return resultat;
    }

    public Point calcMin(Point p1, Point p2) {
        double minX = calcMin(p1.getAbscisse(), p2.getAbscisse());
        double minY = calcMin(p1.getOrdonnee(), p2.getOrdonnee());
        Point resultat = new Point("Min", minX, minY);
        return resultat;
    }

    public Point calcMin(Segment segment) {
        return calcMin(segment.getDebut(), segment.getFin());
    }

    public Point calcMax(Segment segment) {
        return calcMax(segment.getDebut(), segment.getFin());
    }

    

    public Point calcMax(Figure figure) {
        Point max=figure.getPoints().get(0);
       List<Point> points =figure.getPoints();
        for (int i = 1; i < points.size(); i++) {
            max = calcMax(points.get(i),max);
        }
        return max;
    }

    public Point calcMin(Figure figure) {
      Point min=figure.getPoints().get(0);
       List<Point> points =figure.getPoints();
        for (int i = 1; i < points.size(); i++) {
            min = calcMin(points.get(i),min);
        }
        return min;
    }

    public double calcMax(double x1, double x2) {
        if (x1 > x2) {
            return x1;
        } else {
            return x2;
        }
    }

    public double calcMin(double x1, double x2) {
        if (x1 > x2) {
            return x2;
        } else {
            return x1;
        }
    }
}
