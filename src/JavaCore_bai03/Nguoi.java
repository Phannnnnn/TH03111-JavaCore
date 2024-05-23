package JavaCore_bai03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi
{
    protected String hoTen;
    protected Date ngaySinh;
    protected String queQuan;

    public Nguoi()
    {

    }

    public Nguoi(String hoTen, Date ngaySinh)
    {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public Nguoi(String hoTen, Date ngaySinh, String queQuan)
    {
        this(hoTen, ngaySinh);
        this.queQuan = queQuan;
    }

    public void nhapThongTin(Scanner sc)
    {
        System.out.print("Nhập họ tên :");
        hoTen = sc.nextLine();
        System.out.print("Nhập ngay sinh (dd/mm/yyyy) :");
        String ngaySinhStr = sc.nextLine();
        ngaySinh = this.stringToDate(ngaySinhStr);
        System.out.print("Nhập quê quán :");
        queQuan = sc.nextLine();
    }

    public void inThongTin()
    {
        System.out.println(hoTen +" - "+ngaySinh +" - "+queQuan);
    }

    public Date stringToDate(String ngaySinhStr)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date ngaySinhDate = null;
        try {
            ngaySinhDate = sdf.parse(ngaySinhStr);
        } catch (ParseException e) {
            System.out.println("Nhập sai định dạng ngày tháng!");
        }

        return ngaySinhDate;
    }

    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        Nguoi ng = new Nguoi();
        ng.nhapThongTin(sc);
        ng.inThongTin();
    }
}
