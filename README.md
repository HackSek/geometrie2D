# geometrie2D
Ali a besoin d'aide ce hmar


import java.util.ArrayList;

// METHODE MAIN + METHODE ENTREFIGURE

public static void main(String[] args) {  
        ArrayList<Figure> liste;
        liste = new ArrayList <Figure>();
        menu(liste);
    }
    public static Figure entreFigure() 
 {   char choix; 
     Figure F;
        F = null;
     System.out.println("tapez s si vous voulez créer un segment et p si vous voulez créer un point, x si vous voulez créer un polygone");
     choix = Lire.c();
     if ((int)choix == (int)'p' || (int)choix == (int)'P')  
     {
     F = new Point();
     } 
     
     if ((int)choix == (int)'s' || (int)choix == (int)'S')  
     {
     F = new segment();
     } 
     }
   



    public static void menu(ArrayList<Figure> liste)  {
        int choix;
        Figure F;
        Point Point1;
        
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Menu:");
        System.out.println("1) Entrer une figure") ;
        System.out.println("2) Afficher toutes les figures") ;
        System.out.println("3) Selectionner une figure et calculer sa distance à un point") ;
        System.out.println("-----------------------------------------------------------------------------------------");
        choix = Lire.i();
        
      
        if (choix == 1) {
        int i = 0;
        liste.add(entreFigure());
        menu(liste);     
        }
        
        
        if (choix == 2) {
            for (int l=0; liste.size()> l; l++) 
            {
                System.out.println(liste.get(l).toString());
                System.out.println("MaxX : "+liste.get(l).MaxX());
                System.out.println("MaxY : "+liste.get(l).MaxY()); 
                System.out.println("MinX : "+liste.get(l).MinX());
                System.out.println("MinY : "+liste.get(l).MinY());
                System.out.println("--------------------------------------------------");
            }
            menu(liste);
        }
        
        if (choix == 3) {
            System.out.println("Entrez l'abcisse et l'ordonnée du point");
            Point1 = new Point();
            String nomfigure;
            System.out.println("Entrez l'identifiant de la figure cherchee :");
            nomfigure = Lire.S();
            for (int l = 0; liste.size()>l ; l++)
            {
                if (liste.get(l).idFig.equals(nomfigure))
                { System.out.println(liste.get(l).distancePoint(Point1)); }
            }  
            menu(liste);
        }
        
        
        
        
        
        }
    }
    
