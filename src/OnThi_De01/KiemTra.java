package OnThi_De01;

import java.sql.SQLOutput;

public class KiemTra
{
    public static void main(String[] args)
    {
        //Tao doi tuong phan so
        //Khong tham so
        PhanSo P = new PhanSo();

        //Co tham so
        PhanSo P2 = new PhanSo(6,8);
        PhanSo P3 = new PhanSo(7,5);

        //Dua ra man hinh
        System.out.println(P);
        System.out.println(P2);
        System.out.println(P3);

        //Cong tru nhan chia
        System.out.println("\nP2 + P3 = "+P2.cong(P3).toString());
        System.out.println("P2 - P3 = "+P2.tru(P3).toString());
        System.out.println("P2 * P3 = "+P2.nhan(P3).toString());
        System.out.println("P2 : P3 = "+P2.chia(P3).toString()+"\n");

        //Kiem tra phan so toi gian
        if(P2.isSimple())
        {
            System.out.println("P2 da toi gian.");
        }
        else
        {
            //Rut gon phan so
            System.out.println("P2 sau khi rut gon "+P2.rutGon().toString());
        }

        System.out.println("Uoc chung lon nhat cua 10 va 6 la : "+ucln(10,6));
        System.out.println("Boi chung nho nhat cua 10 va 6 la : "+bcnl(10,6));
    }

    public static int ucln(int a, int b)
    {
        while(b!=0)
        {
            int r = b;
            b = a % b;
            a = r;
        }
        return a;
    }

    public static int bcnl(int a, int b)
    {
        return (Math.abs(a*b)/ucln(a,b));
    }
}
