/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment2;

import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     System.out.print("Ten cua ban : ");
String name = sc.nextLine();
System.out.println("Tuoi : ");
int age = sc.nextInt();
System.out.println("Gioi tinh : ");
String sex = sc.nextLine();
sc.nextLine();
System.out.println("Chuyen nganh dang theo hoc : ");
String nganh = sc.nextLine();
System.out.println("GPA : ");
float mark = sc.nextFloat();
System.out.println("Que quan : ");
String quequan = sc.nextLine();
sc.nextLine();
    }
    
}
