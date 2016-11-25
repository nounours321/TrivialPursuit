import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import model.*;
import view.*;

public class Main {
	
	public static void main(String[] args) {
		
		//LANCEMENT DE L'IHM
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                IHM frame = new IHM();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
        
        //INITIALISATION DE LA DATABASE
        Database e = new Database();
        e.Derby();
        
        //TESTS
        Pion p1 = new Pion("Bleu", 1, new Coord(5, 4));
		System.out.println(p1.toString());
		p1.seDeplacer(6, 3);
		System.out.println(p1.toString());
		p1.seDeplacer(6, 3);
		System.out.println(p1.toString());
		
		
		De d1 = new De();
		d1.lancer();
		System.out.println(d1.toString());
        Pion p2 = new Pion("Bleu", 1, new Coord(1, 6));
		System.out.println(p2.toString());
        System.out.println("1"+p2.isMoveOk(0, 1, d1));
        System.out.println("2"+p2.isMoveOk(0, 2, d1));
        System.out.println("3"+p2.isMoveOk(0, 3, d1));
        System.out.println("4"+p2.isMoveOk(0, 4, d1));
        System.out.println("5"+p2.isMoveOk(0, 5, d1));
        System.out.println("6"+p2.isMoveOk(0, 6, d1));
        System.out.println("7"+p2.isMoveOk(1, 6, d1));
        System.out.println("8"+p2.isMoveOk(2, 6, d1));
        System.out.println("9"+p2.isMoveOk(3, 6, d1));
        System.out.println("10"+p2.isMoveOk(4, 6, d1));
        System.out.println("11"+p2.isMoveOk(5, 6, d1));
        System.out.println("12"+p2.isMoveOk(6, 6, d1));
        System.out.println("13"+p2.isMoveOk(6, 5, d1));
        System.out.println("13"+p2.isMoveOk(6, 4, d1));
        System.out.println("14"+p2.isMoveOk(6, 2, d1));
        
        /*
        Pion p3 = new Pion("Bleu", 1, new Coord(3, 0));
    	System.out.println(p3.toString());
     
        
        Pion p4 = new Pion("Bleu", 1, new Coord(5, 0));
    	System.out.println(p4.toString());
        
        
        
        System.out.println(d1.toString());
        Pion p5 = new Pion("Bleu", 1, new Coord(4, 6));
		System.out.println(p5.toString());z
      
      
        Pion p6 = new Pion("Bleu", 1, new Coord(3, 6));
    	System.out.println(p6.toString());
       
        
        Pion p7 = new Pion("Bleu", 1, new Coord(5, 6));
    	System.out.println(p7.toString());
        System.out.println(p7.isMoveOk(6, 2, d1));*/
        
      //CREATION DES CASES
        int[][] in = {
        		{0,1,1},{0,2,3},
        		{1,0,2},{1,3,2},{1,6,2},
        		{2,0,5},{2,3,2},{2,6,0},
        		{3,0,3},{3,1,4},{3,2,5},{3,4,0},{3,5,2},{3,6,1},
        		{4,0,1},{4,3,4},{4,6,3},
        		{5,0,0},{5,3,5},{5,6,5},
        		{6,1,4},{6,2,5},{6,4,1},{6,5,0}
        		
        };
        
     /*   System.out.println(in.length);
        Map<Coord,Couleur> map = new HashMap<>();
        for (int x = 0 ; x <= 23 ; x++) {
        	map.put(new Coord(in[x][0], in[x][1]), Couleur.getCouleur(in[x][2]));
        }
        
        System.out.println(map);*/
	}

}