import java.util.Scanner;

public class ChiTietHoaDon extends HoaDon {
    private String MaSP;
    private String TenSP;
    private int SoLuong;
    private int DonGia;

    public String getMaSP(){
        return MaSP;
    }
    public void setMaSP( String MaSP){
        this.MaSP = MaSP;
    }
    public String getTenSP(){
        return TenSP;
    }
    public void setTenSP( String TenSP ){
        this.TenSP = TenSP;
    }
    public int getSoLuong(){
        return SoLuong;
    }
    public void setSoLuong( int SoLuong ){
        this.SoLuong = SoLuong;
    }
    public int getDonGia(){
        return DonGia;
    }
    public void setDonGia( int DonGia ){
        this.DonGia = DonGia;
    }

    @Override 
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hoa don: ");
        setSoHD(sc.nextInt());
        System.out.print("Nhap ngay ban: ");
        setNgayBan(sc.nextLine());
        System.out.print("Nhap ten khach hang: ");
        setTenKH(sc.nextLine());
        System.out.print("Nhap ma san pham: ");
        setMaSP(sc.nextLine());
        System.out.print("Nhap ten san pham: ");
        setTenSP(sc.nextLine());
        System.out.print("Nhap so luong: ");
        setSoLuong(sc.nextInt());
        System.out.print("Nhap don gia: ");
        setDonGia(sc.nextInt());
    }
    @Override
    public void In(){
        System.out.print("So hoa don: " +getSoHD());
        System.out.print("Ngay ban: " +getNgayBan());
        System.out.print("Ten khach hang: " +getTenKH());
        System.out.print("Ma san pham: " +getMaSP());
        System.out.print("Ten san pham: " +getTenSP());
        System.out.print("So luong: " +getSoLuong());
        System.out.print("Don gia: " +getDonGia());
    }
}
