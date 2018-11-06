
package bai2;

import java.util.Scanner; 

public class Bai2 {

    static Scanner input = new Scanner(System.in); 
    static int n; 
    static void Nhap(int a[]){
        for(int i=0; i<n ;i++)
            a[i] = input.nextInt();
    }
    static void Xoa(int a[],int index){
        for(int i=index; i<n-1; i++)
            a[i]=a[i+1]; 
        n--; 
    }
    static void Chen(int a[],int index,int val){
        n++; 
        for(int i=n; i>index; i--)
            a[i]=a[i-1]; 
        a[index] = val; 
    }
    static void Xuat(int a[]){
        for(int i=0; i<n; i++){
            System.out.printf(a[i]+ " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("nhap phan tu cua mang @@");
        n = input.nextInt(); 
        int a[]= new int[n+1]; 
        System.out.println("nhap cac phan tu cua mang a");
        Nhap(a); 
        System.out.println("nhap vi tri can xoa");
        int x = input.nextInt(); 
        Xoa(a,x-1); 
        System.out.println("nhap vi tri can them va gia tri can them");
        x = input.nextInt();
        int val = input.nextInt(); 
        Chen(a,x-1,val); 
        System.out.println("xuat cac phan tu cua mang");
        Xuat(a); 
    }
    
}
