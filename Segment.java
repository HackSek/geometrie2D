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
public class Segment {
    private Point debut;
    private Point fin;

    public Point getDebut() {
        return debut;
    }

    public void setDebut(Point debut) {
        this.debut = debut;
    }

    public Point getFin() {
        return fin;
    }

    public void setFin(Point fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "Segment{" + "debut=" + debut + ", fin=" + fin + '}';
    }
    
    
    
}
