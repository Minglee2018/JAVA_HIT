
package bai1;

import java.util.Scanner; 

public class Bai1 {
  static Scanner input = new  Scanner (System.in);
    static int n; 
    static void Nhap(int a[]){
        for (int i=0; i<n; i++)
            a[i] = input.nextInt();
    }
    static void Xuat(int a[]){
        for (int i=0; i<n; i++){
            System.out.printf(a[i]+ " ");
        }
    }
    public static void main(String[] args) {
       
        
        System.out.println("nhap so phan tu cua mang \n");
        n = input.nextInt();
        int a[]=new int[n];
        System.out.println("nhap phan tu cua mang");
        Nhap(a);
        System.out.println("xuat mang");
        Xuat(a); 
    }
    
}
