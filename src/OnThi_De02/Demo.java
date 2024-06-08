package OnThi_De02;

import java.text.ParseException;
import java.util.Scanner;

public class Demo
{
    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        QLCB qlcb = new QLCB();

        qlcb.nhapDanhSachCanBo(sc);
        qlcb.danhSachCanBo();
        qlcb.timKiemCanBo(sc);
    }
}
