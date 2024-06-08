package JavaCore_bai03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLNS
{
    private List<Nguoi> dsns;

    public QLNS()
    {
        dsns = new ArrayList<Nguoi>(100);
    }

    public void themNhanSu(Nguoi ns)
    {
        dsns.add(ns);
    }
    public void nhapDanhSach(Scanner sc)
    {
        System.out.print("Nhập số lượng nhân sự n = ");
        int n = sc.nextInt(); sc.nextLine();

        int chon = 0;
        Nguoi ns = null;
        for(int i = 0; i<n; i++)
        {
            System.out.print("Chọn loại ns mun nhập (0: hs, 1: sv): ");
            chon = sc.nextInt(); sc.nextLine();
            switch (chon)
            {
                case 0:
                    ns = new HocSinh();
                    break;
                case 1:
                    ns = new SinhVien();
                    break;
            }
            ns.nhapThongTin(sc);
            themNhanSu(ns);
        }
    }

    public void inDanhSach()
    {
        for(Nguoi ns: dsns)
        {
            ns.inThongTin();
        }
    }

    public void timKiemTheoMSV(String msv)
    {
        for(Nguoi ns: dsns)
        {
            if(ns instanceof SinhVien)
            {
                SinhVien sv = (SinhVien)ns;
                if(msv.equals(sv.getMaSv()))
                {
                    System.out.println("Thông tin sinh viên cần tìm:");
                    sv.inThongTin();
                    return;
                }
            }
            System.out.println("Không tìm thấy sinh viên có mã sinh viên \'"+msv +"\' trong danh sach.");
        }
    }
    public static void main(String[] args)
    {
        QLNS qlns = new QLNS();
        Scanner sc = new Scanner(System.in);
        qlns.nhapDanhSach(sc);
        qlns.inDanhSach();
        qlns.timKiemTheoMSV("sv5");
    }
}
