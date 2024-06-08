package OnThi_De02;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class NhanVienPhucVu extends CanBo
{
    private String congViec;

    public NhanVienPhucVu()
    {

    }

    public NhanVienPhucVu(String hoTen, Date ngaySinh, int gioiTinh, String address, String congViec)
    {
        super(hoTen,ngaySinh, gioiTinh, address);
        this.congViec = congViec;
    }

    @Override
    public void nhapThongTin(Scanner sc) throws ParseException
    {
        super.nhapThongTin(sc);
        System.out.print("Nhap cong viec : ");
        this.congViec = sc.nextLine();
    }

    @Override
    public String toString()
    {
        return super.toString()  + "Cong viec :" + this.congViec;
    }
}
