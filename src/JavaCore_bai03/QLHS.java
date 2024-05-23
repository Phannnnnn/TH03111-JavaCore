package JavaCore_bai03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLHS
{
    private List<HocSinh> dshs = new ArrayList<HocSinh>();

    public QLHS()
    {

    }

    public void themHocSinh(HocSinh hs)
    {
        dshs.add(hs);
    }

    public void nhapDanhSach()
    {
        String chon = null;
        Scanner sc = new Scanner(System.in);
        do
        {
            HocSinh hs = new HocSinh();
            System.out.println("Nhập vào thông tin sinh viên.");
            hs.nhapThongTin(sc);
            this.themHocSinh(hs);
            System.out.print("Tiếp tục nhập? (c/k):");
            chon = sc.nextLine();
        }
        while(chon.equalsIgnoreCase("c"));
    }

    public void inDanhSach()
    {
        for(HocSinh hs : dshs)
        {
            hs.inThongTin();
        }
    }

    public void timKiemHocSinh(int namSinh, String queQuan)
    {
        for(HocSinh hs : dshs)
        {
            if(hs.ngaySinh.getYear() == namSinh && hs.queQuan.equalsIgnoreCase(queQuan))
            {
                System.out.println("Thông tin học sinh đang tìm:");
                hs.inThongTin();
            }
            System.out.println("Không tìm thấy học sinh có năm sinh "+namSinh +" và quê quán "+queQuan +".");
        }
    }

    public void timKiemHocSinh(String lop)
    {
        for(HocSinh hs : dshs)
        {
            if(hs.getLop().equalsIgnoreCase(lop))
            {
                System.out.println("Thông tin học sinh đang tìm:");
                hs.inThongTin();
            }
        }
        System.out.println("Không tìm thấy học sinh thuộc lớp "+lop);
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        QLHS qlhs  = new QLHS();
        qlhs.nhapDanhSach();
        qlhs.inDanhSach();
    }
}
