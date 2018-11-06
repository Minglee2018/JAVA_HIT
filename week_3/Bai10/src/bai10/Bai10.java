
package bai10;

import java.util.Scanner; 

public class Bai10 {

 Scanner input = new Scanner(System.in); 
    
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s=in.nextLine();
        int length=s.length();
        int n,m;
        System.out.print("Nhap n va m: ");
        n=in.nextInt();
        m=in.nextInt();
        if(length<n*m)
        {
            for(int i=1;i<=n*m-length;i++)
                s+='.';
        }
        int x1=0,x2=0,y1=n-1,d=0,y2=m-1;
        char x[][]=new char[n+1][m+1];
        while(d!=n*m)
        {
            for(int i=x1;i<=y2;i++)
                x[x2][i]=s.charAt(d++);
            for(int i=x2+1;i<=y1;i++)
                x[i][y2]=s.charAt(d++);
            for(int i=y2-1;i>=x1;i--)
                x[y1][i]=s.charAt(d++);
            for(int i=y1-1;i>x2;i--)
                x[i][x1]=s.charAt(d++);
            x1++;x2++;y1--;y2--;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(x[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
