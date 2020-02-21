/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 
 * @author Skaylee
 */
public class fungsi {

    /**
     *
     */
    public static void kelipatan(){
        int k=0;
        System.err.printf("Deret kelipatan 16\t:\n");
    for (int i = 0; i < 10; i++) {
    k+=16;
        if (k!=64) {
            System.out.print(k);
            System.out.printf("\n");
        }
    
}    
    }
    public static void genap(){
        int g=2;
        for (int i = 0; i < 10; i++) {
        g+=2;
        System.out.print(g);
        System.out.print("\n");
        
        }
       
    }
    
    
    public static void segit(){
        int i, j, k=1;     
            for(i=0; i<5; i++){           
                for(j=0; j<k; j++){              
         System.out.print("* ");}
                k = k + 2;
                System.out.println(); 
            }
        }
    public static void prima(){
     
       String  prima = "";

       for (int i = 1; i <= 25; i++)         
       { 		  	  
          int p=0; 	  
          for(int num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		p = p + 1;
	     }
	  }
	  if (p ==2)
	  {
	     prima = prima + i + " ";
	  }	
       }	
       System.out.print(prima);
       }	
        }
 


