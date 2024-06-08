package OnThi_De02;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class CongNhan extends CanBo
{
    private int capBac;

    public CongNhan()
    {}

    public CongNhan(String hoTen, Date ngaySinh, int gioiTinh, String address, int capBac)
    {
        super(hoTen,ngaySinh, gioiTinh, address);
        this.capBac = capBac;
    }

    @Override
    public void nhapThongTin(Scanner sc) throws ParseException
    {
        super.nhapThongTin(sc);
        System.out.println("Nhap cap bac cong nhan : ");
        this.capBac = sc.nextInt(); sc.nextLine();
    }

    @Override
    public String toString()
    {
        return super.toString() +"Cap bac cong nhan : " + this.capBac +"/7";
    }
}
