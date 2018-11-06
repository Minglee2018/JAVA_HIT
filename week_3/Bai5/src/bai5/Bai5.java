
package bai5;

import java.util.Scanner; 

public class Bai5 {

   static Scanner input = new Scanner(System.in); 
    
    public static void main(String[] args) {
        int a[][] = new int[100][100]; 
        int n,m; 
        System.out.println("nhap kich thuoc cua ma tran ");
        n = input.nextInt();
        m = input.nextInt();
        System.out.println("nhap cac phan tu cua mang");
        for(int i=0;  i<n ; i++){
            for(int j=0;  j<m;  j++){
                a[i][j] = input.nextInt(); 
            }
        }
        System.out.println("xuat mang dao");
        for(int i=0;  i<m;  i++){
            for(int j=0;  j<n;  j++){
                System.out.print( a[j][i] + " ");
            }
            System.out.println("");
        }
    }
    
}
