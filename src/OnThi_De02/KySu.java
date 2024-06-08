package OnThi_De02;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class KySu extends CanBo
{
    private String nganhDaoTao;

    public KySu()
    {

    }

    public KySu(String hoTen,Date ngaySinh, int gioiTinh, String address, String nganhDaoTao)
    {
        super(hoTen,ngaySinh, gioiTinh, address);
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public void nhapThongTin(Scanner sc) throws ParseException
    {
        super.nhapThongTin(sc);
        System.out.println("Nhap nganh dao tao :");
        nganhDaoTao = sc.nextLine();
    }

    @Override
    public String toString()
    {
        return super.toString() +"Nganh dao tao :" + nganhDaoTao;
    }
}
