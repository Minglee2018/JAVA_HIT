
package week_4;

import java.util.Scanner; 
import java.util.ArrayList;

public class LopHoc {
     Scanner input = new Scanner(System.in);
    String TenLop;
    String MaLop;
    String LopTruong;
    ArrayList <HocSinh> a;
    public LopHoc(){
    
    }
    public void Nhap(){
        System.out.println("nhap ten lop");
        this.TenLop = input.nextLine(); 
        System.out.println("nhap Ma lop");
        this.MaLop = input.nextLine(); 
        System.out.println("Ten Lop Truong");
        this.LopTruong=input.nextLine(); 
        System.out.println("nhap so sinh vien n=");
        int n = input.nextInt();
        System.out.println("nhap tung sinh vien");
        for(int i=0; i<n ;i++)
        {
            HocSinh p; 
            p = new HocSinh();
            p.Nhap();
            a.add(p);
        }
          
    }
    public float TTB_phay()
    {
        int dem=0;
        float d=0;
        for (int i=0; i<a.size(); i++){
            d +=(float)(a.get(i).Toan+a.get(i).anh+a.get(i).van)/3;
            dem++;
        }
        return d/dem;
    }
   public int SoSinhVien(){
        return a.size();
   }
   public void TenLopTruong()
   {
       System.out.println(LopTruong);
   }
   public int Count_tbc(){
       int count = 0; 
       for(int i=0; i<a.size(); i++){
           if(a.get(i).TBCdiem >5)
               count++;
       }
       return count;
   }
   public void hienSV()
   {
       int indexmax=0,indexmin=0;
       for(int i=0; i<a.size(); i++)
       {
           if(a.get(indexmax).TBCdiem() < a.get(i).TBCdiem()) {
               indexmax=i; 
           }
           if(a.get(indexmin).TBCdiem() > a.get(i).TBCdiem()) {
               indexmin=i; 
           }
       }
       System.out.println("sinh vien co diem cao nhat la:" + a.get(indexmax).TBCdiem());
       System.out.println("sinh vien co diem thap nhat la:"+a.get(indexmin).TBCdiem());
   }
   public void add_sv(){
       HocSinh p; 
       p = new HocSinh();
       System.out.println("nhap 1 hoc sinh can them");
       p.nhap();
       a.add(p); 
   }
   public void remove_sv(){
       String s; 
       System.out.println("nhap ma sinh vien can xoa");
       s = input.nextLine();
       for(int i=0; i<a.size(); i++){
           if(a.get(i).MaHocSinh.equals(s))
           {
               a.remove(i);
               break;
           }
       }
   }

    float TTB_phay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void add(LopHoc z) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
