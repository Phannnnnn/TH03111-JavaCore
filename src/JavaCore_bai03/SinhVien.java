package JavaCore_bai03;

import java.util.Scanner;

public class SinhVien extends Nguoi
{
    private String maSv;

    public SinhVien()
    {

    }

    public SinhVien(String hoTen, String maSv)
    {
        this.hoTen = hoTen;
        this.maSv = maSv;
    }

    @Override
    public void nhapThongTin(Scanner sc)
    {
        System.out.print("Nhập mã sinh viên :");
        maSv = sc.nextLine();
        super.nhapThongTin(sc);
    }

    @Override
    public void inThongTin()
    {
        System.out.println(maSv+" - "+hoTen +" - "+ngaySinh +" - "+queQuan);
    }

    public String getMaSv()
    {
        return maSv;
    }
}
