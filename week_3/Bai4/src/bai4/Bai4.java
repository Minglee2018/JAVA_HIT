
package bai4;

import java.util.Scanner; 

public class Bai4 {

    static Scanner input = new Scanner(System.in); 
    
    public static void main(String[] args) {
        int a[][]= new int[100][100]; 
        int m,n; 
        System.out.println("nhap kich thuoc m*n cua ma tran");
        n = input.nextInt(); 
        m = input.nextInt(); 
        System.out.println("nhap tung phan tu cua mang");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = input.nextInt(); 
            }
        }
        System.out.println("xuat ma tran vua nhap");
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.printf( a[i][j]  + " ");
            }
            System.out.printf("\n");
        }
    }
}
