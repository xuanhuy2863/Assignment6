/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package misuseofif;

/**
 *
 * @author ADMIN
 */
public class Misuseofif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("What percentage did you earn? ");
       int percent = sc.nextInt();
       if (percent >= 90) {
           System.out.println("You got an A!");
       }
       else if (percent >= 80) {
           System.out.println("You got an B!");
       }
       else if (percent >= 70) {
           System.out.println("You got an C!");
       }
       else if (percent >= 60) {
           System.out.println("You got an D!");
       }
       else if (percent < 60) {
           System.out.println("You got an F!");
       }
    }
    
}
