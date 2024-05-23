package JavaCore_bai02;

public class TamGiac
{
    private Diem A;
    private Diem B;
    private Diem C;
    private float AB;
    private float BC;
    private float CA;

    public TamGiac()
    {

    }

    public TamGiac(Diem a, Diem b, Diem c)
    {
        A = a;
        B = b;
        C = c;

        AB = A.kc(B);
        BC = B.kc(C);
        CA = C.kc(A);
    }

    public float dienTich()
    {
        if(AB + BC > CA && BC + CA > AB && CA + AB > BC)
        {
            float p = this.chuVi()/2;
            return (float)Math.sqrt(p*(p - AB)*(p - BC)*(p - CA));
        }
        return -1;
    }

    public float chuVi()
    {
        if(AB + BC > CA && BC + CA > AB && CA + AB > BC)
        {
            return AB + BC + CA;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Diem A = new Diem();
        Diem B = new Diem(0,0);
        Diem C = new Diem(0,4);

        TamGiac T = new TamGiac(A,B,C);

        System.out.println("Điểm A :");    A.inDiem();
        System.out.println("Điểm B :");    B.inDiem();
        System.out.println("Điểm C :");    C.inDiem();

        System.out.println("\nĐộ dài cạnh AB "+A.kc(B));
        System.out.println("Độ dài cạnh BC "+B.kc(C));
        System.out.println("Độ dài cạnh CA "+C.kc(A));

        System.out.println("\nDiện tích tam giác : "+T.dienTich());
        System.out.println("Chu vi tam giác : "+T.chuVi());
    }
}
