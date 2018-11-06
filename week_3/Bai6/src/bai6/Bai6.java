
package bai6;

import java.util.Scanner; 

public class Bai6 {

    static Scanner input = new Scanner(System.in); 
    
    public static void main(String[] args) {
        int a[][]=new int[100][100]; 
        int m,n; 
        System.out.println("nhap  ma tran a 2*2");
	for(int i=0;i<2;i++)
		for(int j=0;j<2;j++)
                                        a[i][j] = input.nextInt(); 
	
         int b[][] = new int[100][100]; 
         int x,y;
        System.out.println("Nhap  ma tran B: 2*2 ");
 
         int c[][] = new int[100][100]; 
         for(int i=0;i<2;i++)
	for(int j=0;j<2;j++)
                           b[i][j] = input.nextInt(); 
	
        for(int i = 0; i < 2; i++){
	for(int j = 0; j < 2; j++){
	c[i][j] = 0;
                            for(int k = 0; k < 2; k++)
                                    c[i][j] += a[i][k] * b[k][j];
				
	}
        }

        for(int i = 0; i < 2; i++)
        {
	for(int j = 0; j < 2; j++) 
                    System.out.printf(c[i] [j] + " ");
            System.out.println("");
         }
	
    }
    
}
