/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package etkinlikonerme;

/**
 *
 * @author Samsung
 */
import java.util.Scanner;
public class EtkinlikOnerme {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.print("Sicaklik Giriniz:");
        int temperature=input.nextInt();
        
        if(temperature<5){
            System.out.println("Kayak Yapabilirsiniz");
        }else if(temperature>=5&&temperature<15){
            
                System.out.println("Sinemaya Gidebilirsiniz");
        }else if(temperature>=15&&temperature<=25){
                System.out.println("Piknige Gidebilirsiniz");
            
           
        }else {
                System.out.println("Yüzmeye Gidebilirsiniz");
            
        }
        
        
    }
    
}
