package JavaCore_bai03;

import java.util.Date;
import java.util.Scanner;

public class HocSinh extends Nguoi
{
    private String lop;
    private String khoaHoc;
    private String kyHoc;

    public HocSinh()
    {

    }

    public HocSinh(String hoTen, Date ngaySinh, String lop, String khoaHoc)
    {
        super(hoTen, ngaySinh);
        this.lop = lop;
        this.khoaHoc = khoaHoc;
    }

    public HocSinh(String hoTen, String lop, String khoaHoc)
    {
        this.hoTen = hoTen;
        this.lop = lop;
        this.khoaHoc = khoaHoc;
    }

    @Override
    public void nhapThongTin(Scanner sc)
    {
        super.nhapThongTin(sc);
        System.out.print("Nhập lớp :");
        lop = sc.nextLine();
        System.out.print("Nhập  khóa học :");
        khoaHoc = sc.nextLine();
        System.out.print("Nhập kỳ học :");
        kyHoc = sc.nextLine();
    }

    @Override
    public void inThongTin()
    {
        System.out.println(hoTen +" - "+ngaySinh +" - "+queQuan +" - "+lop +" - "+khoaHoc +" - "+kyHoc);
    }

    public String getLop()
    {
        return lop;
    }
}
