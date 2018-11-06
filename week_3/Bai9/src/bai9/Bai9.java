
package bai9;

import java.util.Scanner;

public class Bai9 {

    static Scanner input = new Scanner(System.in); 
    
    public static void main(String[] args) {
         String s;
        s=input.nextLine();
        int k=0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)=='.')
                k++;
        for(int i=0;i<=k;i++)
            s+=' ';
        char[] x=s.toCharArray();
        k=0;
        for (int i = 0; i <x.length; i++) {
            if(x[i]>='A'&&x[i]<='Z')
                x[i]+=32;
            if(x[i]>='a'&&x[i]<='z'&&k==0){
                x[i]-=32;
                k=1;
            }
        }
        for(int i=0;i<x.length-1;i++)
        {
            k=0;
            if(x[i]=='.')
            {
                for(int k1=i;k1<x.length;k1++)
                {
                    if(k==0&&((x[k1]>='a'&&x[k1]<='z')||(x[k1]>='A'&&x[k1]<='Z')))
                    {
                        k=1;
                        if(x[k1]>='a'&&x[k1]<='z')
                            x[k1]-=32;
                    }
                }
                for(int j=x.length-1;j>i+1;j--)
                        x[j]=x[j-1];
                x[i+1]=' ';
            }
        }
        k=x.length-1;
        for(int i=0;i<x.length-1;i++)
        {
            if(x[i]==' '&&x[i+1]==' '){
                for(int j=i;j<x.length-1;j++)
                {
                    x[j]=x[j+1];
                }
            }
        }
        s=new String(x);
        s=s.trim();
        System.out.println(s);
    }
    
}
