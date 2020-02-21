
package program;
import java.io.IOException;
import java.util.Scanner;
import static program.fungsi.genap;
import static program.fungsi.kelipatan;
import static program.fungsi.prima;
import static program.fungsi.segit;




public class main{
    
 
  public static void main(String[] args) throws IOException, InterruptedException{
      Scanner sc = new Scanner(System.in);
       int menu, l;
       do{
      System.out.printf("\n1.Deret kelipatan 16\n2.Deret bilangan genap komposit\n3.Segitiga siku siku\n4.Deret bilangan prima\n5.Keluar \n");
      menu=sc.nextInt();
      switch(menu){
          case 1:
              kelipatan();
              break;
          case 2:
              genap();
              break;
          case 3:
              segit();
              break;
          case 4:
              prima();
             break; 
          default:
              System.out.print("Invalid\n");
              break;
      }
       }while(menu!=5);
}  
}
