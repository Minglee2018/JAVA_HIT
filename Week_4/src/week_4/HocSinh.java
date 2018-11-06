
package week_4;

import java.util.Scanner;

public class HocSinh {
    Scanner input = new Scanner(System.in); 
    String MaHocSinh;
    String TenHocSinh;
    int Namsinh;
    float Toan;
    float van;
    float anh;
 
    public HocSinh(String Mhs, String name,int NS,float T,float V,float A){
        MaHocSinh = Mhs;
        TenHocSinh = name;
        Namsinh = NS; 
        Toan = T;
        van = V;
        anh = A;
    }

    HocSinh() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void Nhap()
    {
        System.out.println("nhap ma hoc sinh ");
        this.MaHocSinh = input.nextLine();
        System.out.println("nhap ten hoc sinh");
        this.TenHocSinh = input.nextLine(); 
        System.out.println("nam sinh");
        this.Namsinh = input.nextInt(); 
        System.out.println("diem toan");
        this.Toan = input.nextFloat();
        System.out.println("diem van");
        this.van = input.nextFloat(); 
        System.out.println("diem anh");
        this.anh = input.nextFloat();
    }
    public void Intuoi(){
        int z = 2018 - Namsinh;
        System.out.printf("Tuoi cua hoc sinh la: %d",z);
        
    }
    public float TBCdiem(){
        float tbc=(Toan+van+anh)/3;
        return tbc;
    }

    void nhap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
