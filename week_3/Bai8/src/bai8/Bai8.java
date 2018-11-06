
package bai8;

import java.util.Scanner; 

public class Bai8 {

 static Scanner input = new Scanner(System.in); 
 
    public static void main(String[] args) {
        
        int a[] = new int[150]; 
        for(int i=0; i<150; i++) a[i]=0; 
       String s; 
        System.out.println("nhap chuoi s");
       s = input.nextLine(); 
       for(int i=0; i<s.length(); i++){
           a[s.charAt(i)]++; 
       }
       for(int i=0; i<s.length(); i++){
           if(a[s.charAt(i)]!=0)
           {
               System.out.println(" " + s.charAt(i) + " xuat hien " + a[s.charAt(i)] + " lan \n" );
               a[s.charAt(i)]=0;
           }
       }
    }
    
}
