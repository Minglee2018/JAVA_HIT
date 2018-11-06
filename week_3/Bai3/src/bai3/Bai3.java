
package bai3;

import java.util.Scanner;

public class Bai3 {
   static void Sort(int a[],int n){
       for(int i=0; i<n; i++){
           for(int j=i+1; j<n; j++){
               if(a[i]>a[j]){
                   int x = a[i]; 
                   a[i] = a[j]; 
                   a[j] = x; 
               }
           }
       }
   }
    static Scanner input = new Scanner(System.in); 
   
    public static void main(String[] args) {
        int n; 
        System.out.println("nhap so phan tu cua mang");
        n =input.nextInt(); 
        int even[]=new int[1000];
        int odd[]=new int[1000]; 
        int i=0,j=0;
        System.out.println("nhap tung phan tu cua mang");
        for(int k=0; k<n ;k++){
            int x;  
            x = input.nextInt(); 
            if(x%2==0)  even[i++]=x; 
            else odd[j++]=x; 
        }
        Sort(even, i);
        Sort(odd,j); 
        for(int t = 0; t<i; t++)
            System.out.print(even[t] + " ");
        for(int t = j-1; t>=0; t--)
            System.out.print(odd[t] + " ");
    }
    
}
