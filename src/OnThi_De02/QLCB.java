package OnThi_De02;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB
{
    private List<CanBo> dscb;

    public QLCB()
    {
        dscb = new ArrayList<CanBo>();
    }

    public void themCanBo(CanBo cb)
    {
        dscb.add(cb);
    }

    public void nhapDanhSachCanBo(Scanner sc) throws ParseException
    {
        CanBo cb = new CanBo();
        String chon1 = "";

        do
        {
            System.out.println("Chon can bo de nhap thong tin :");
            System.out.println("1-Cong nhan\n2-Ky su\n3-Nhan vien phuc vu\nChon : ");
            int chon2 = sc.nextInt(); sc.nextLine();
            switch (chon2)
            {
                case 1:
                    System.out.println("Nhan thong cho cong nhan:");
                    cb = new CongNhan();
                    break;

                case 2:
                    System.out.println("Nhan thong cho ky su:");
                    cb = new KySu();
                    break;

                case 3:
                    System.out.println("Nhan thong cho nhan vien phuc vu:");
                    cb = new NhanVienPhucVu();
                    break;
            }

            cb.nhapThongTin(sc);
            dscb.add(cb);
            System.out.println("Tiep tuc nhap (c-k) :");
            chon1 = sc.nextLine();
        }
        while(chon1.equalsIgnoreCase("c"));
    }

    public void danhSachCanBo()
    {
        int i = 1;
        for(CanBo cb : dscb)
        {
            System.out.println("Can bo "+i++ +" :");
            System.out.println(cb.toString());
        }
    }

    public void timKiemCanBo(Scanner sc)
    {
        System.out.println("Nhao vao ten can bo can tim kiem :");
        String name = sc.nextLine();

        for(CanBo cb : dscb)
        {
            if(cb.getHoTen().equalsIgnoreCase(name))
            {
                System.out.println(cb.toString());
                return;
            }
        }
        System.out.println("Khong co can bo co ten '"+name +"' trong danh sach.");
    }
}
