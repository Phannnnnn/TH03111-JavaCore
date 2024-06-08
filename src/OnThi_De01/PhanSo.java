package OnThi_De01;

/*
Đề 1:
1. Xây dựng lớp phân số với hai thuộc tính riêng xác định tử số và mẫu số của phân số và xây dựng các
phương thức:
- Các toán tử tạo lập (constructor) trường hợp không có tham số và trường hợp có 2 tham số tử số và mẫu
số
- Các phép toán cộng, trừ, nhân, chia các phân số
- Phép kiểm tra một phân số có phải tối giản hay không
- Phép tìm dạng tối giản của phân số
2. Viết chương trình ứng dụng kiểm tra hoạt động của các phương thức
Gợi ý: Tử số và mẫu số có thể chọn là kiểu nguyên. Phân số a/b có thể đưa về dạng tối giản bằng cách
chia cả tử số và mẫu số cho ước chung lớn nhất của (a,b). Cần có thêm một phương thức tìm ước chung
lớn nhất của 2 số (sử dụng thuật toán ocolit)
 */

import static OnThi_De01.KiemTra.ucln;

public class PhanSo
{
    //Khai bao bien
    private int a,b;

    //Constructer khong tham so
    public PhanSo()
    {
    }

    //Constructer hai tham so
    public PhanSo(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    //Ham cong hai phan so
    public PhanSo cong(PhanSo p)
    {
        PhanSo tg = new PhanSo();
        if(this.b == p.b)
        {
            tg.a = this.a + p.b;
            tg.b = this.b;
        }
        else
        {
            tg.a = this.a * p.b + this.b * p.a;
            tg.b = this.b * p.b;
        }
            return tg.rutGon();
    }

    //Ham tru hai phan so
    public PhanSo tru(PhanSo p)
    {
        PhanSo tg = new PhanSo();
        if(this.b == p.b)
        {
            tg.a = this.a - p.b;
            tg.b = this.b;
        }
        else
        {
            tg.a = this.a * p.b - this.b * p.a;
            tg.b = this.b * p.b;
        }

        return tg.rutGon();
    }

    //Ham nhan hai phan so
    public PhanSo nhan(PhanSo p)
    {
        return new PhanSo(this.a * p.a, this.b * p.b).rutGon();
    }

    public PhanSo chia(PhanSo p)
    {
        return new PhanSo(this.a * p.b, this.b * p.a).rutGon();
    }

    //Ham kiem tra phan so toi gian
    public boolean isSimple()
    {
        boolean rs = false;
        if(ucln(this.a,this.b)==1)
        {
            rs = true;
        }
        return rs;
    }

    //Ham rut gon phan so
    public PhanSo rutGon()
    {
        int ucln = ucln(this.a,this.b);

        return new PhanSo(this.a/ucln, this.b/ucln);
    }

    //Ghi de phuong thuc toString tra ve 1 phan so dang a/b
    @Override
    public String toString()
    {
        return a+"/"+b;
    }
}
