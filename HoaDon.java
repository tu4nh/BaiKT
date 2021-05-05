import java.util.Scanner;

public abstract class HoaDon {
    private int SoHD;
    private String NgayBan;
    private String TenKH;

    public int getSoHD(){
        return SoHD;
    }
    public void setSoHD(int SoHD){
        this.SoHD = SoHD;
    }

    public String getNgayBan(){
        return NgayBan;
    }
    public void setNgayBan(String NgayBan){
        this.NgayBan = NgayBan;
    }

    public String getTenKH(){
        return TenKH;
    }
    public void setTenKH(String TenKH){
        this.TenKH = TenKH;
    }

   // @Override
   // public void NhapHD(){
       // Scanner sc = new Scanner(System.in);
       // System.out.print("Nhap so hoa don: ");
       // setSoHD(sc.nextInt());
       // System.out.print("Nhap ngay ban: ");
       // setNgayBan(sc.nextLine());
       // System.out.print("Nhap ten khach hang: ");
       // setTenKH(sc.nextLine());
   // }
    public abstract void Nhap();
    public abstract void In();
}
