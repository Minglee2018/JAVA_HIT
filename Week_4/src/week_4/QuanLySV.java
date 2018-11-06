
package week_4;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.ArrayList;
import java.util.Scanner; 

public class QuanLySV {

    public  static ArrayList<LopHoc> B = new ArrayList<>();
    public static Scanner input = new Scanner(System.in); 
    
    public static void nhap()
    {
        System.out.println("nhap 1 lop hoc: ");
        LopHoc d; 
        d = new LopHoc();
        d.Nhap();
        B.add(d);
    }
    public static void xoa()
    {
        String s; 
        System.out.println("nhap ma lop can xoa");
        s = input.nextLine();
        for (int i=0; i<B.size(); i++) {
            if(B.get(i).MaLop.equals(s)){
                B.remove(i);
            }
        }
    }
    public static void TSV_1lop(){
        
        for(int i=0; i<B.size(); i++){
            int z;
            z = B.get(i).SoSinhVien();
            System.out.printf("lop hoc thu %d co so hoc sinh la %d \n",i+1,z);
        }
    }
    public static void TB_phay(){
        float ans=0;
        int ssv=0;
        for(int i=0; i<B.size(); i++){
            float z=0;
            int dem=0;
            for(int j=0; j<B.get(i).SoSinhVien(); j++){
                z= z + B.get(i).TTB_phay();
                dem++;
            }
            ssv+=B.get(i).SoSinhVien();
            ans+=z/dem;
        }
        System.out.printf("Tong TB phay cua toan bo sv la:%5.0f \n ",ans);
        System.out.println("toan bo so sv la: "+ssv);
        
    }
        public static void main(String[] args) {
        int n;
        System.out.println("nhap so luong lop ");
        n = input.nextInt(); 
        for(int i=0; i<n; i++){
            int m;
            System.out.printf("nhap so hoc sinh lop thu %d \n",i+1);
            m = input.nextInt(); 
            for(int j=0; j<m ;j++){
                LopHoc z; 
                z = new LopHoc();
                z.Nhap();
                B.add(z);
            }
        }
         TB_phay();
    }               
}
