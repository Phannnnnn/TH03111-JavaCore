package OnThi_De02;

/*
Đề 2:
Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên.
+ Mỗi cán bộ cần quản lý lý các thuộc tính: Họ tên, ngày sinh, giới tính, địa chỉ
+ Các công nhân cần quản lý: Bậc (công nhân bậc 3/7, bậc 4/7 ...)
+ Các kỹ sư cần quản lý: Ngành đào tạo
+ Các nhân viên phục vụ cần quản lý thông tin: công việc
1. Xây dựng các lớp NhanVien, CongNhan, KySu kế thừa từ lớp CanBo
2. Xây dựng các hàm để truy nhập (get), thay đổi (set) và hiển thị thông tin về các thuộc tính của các lớp.
3. Xây dựng lớp QLCB cài đặt các phương thức thực hiện các chức năng sau:
- Nhập thông tin mới cho cán bộ
- Tìm kiếm theo họ tên
- Hiển thị thông tin cán bộ tìm được
Gợi ý: Thuộc tính bậc công nhân có thể để kiểu String.
Xây dựng constructor cho các lớp, trong đó constructor của các lớp con gọi lại constructor từ lớp cha để
tránh việc lặp lại code
Phương thức hiển thị thông tin của các lớp con cần ghi đè phương thức của lớp cha (cùng tên phương
thức + gọi lại phương thức lớp cha để lấy thông tin chung về cán bộ)
Lớp QLCB cần có một mảng chứa các phần tử có kiểu CanBo, nhập thông tin mới cho các cán bộ cụ thể
(Nhân Viên, Công Nhân, Kỹ Sư) và đưa vào mảng sau đó tìm kiếm, hiển thị thông tin của cán bộ tìm
được. Chú ý tính đa hình khi xử lý mảng.
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CanBo
{
    private String hoTen;
    private Date ngaySinh;
    private int gioiTinh;
    private String address;

    public CanBo()
    {

    }

    public CanBo(String hoTen, Date ngaySinh, int gioiTinh, String address)
    {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.address = address;
    }

    public void nhapThongTin(Scanner sc) throws ParseException
    {
        System.out.print("Nhap ho ten :");
        this.hoTen = sc.nextLine();

        System.out.print("Nhap ngay sinh (dd/mm/yyyy) :");
        String ngaySinhStr = sc.nextLine();
        this.ngaySinh = stringToDate(ngaySinhStr);

        System.out.print("Nhap goi tinh (0-nam : 1-nu) :");
        this.gioiTinh = sc.nextInt();   sc.nextLine();

        System.out.print("Nhap dia chi : ");
        this.address = sc.nextLine();
    }

    public Date stringToDate(String ngaySinhStr) throws ParseException
    {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        date = dateFormat.parse(ngaySinhStr);

        return date;
    }

    @Override
    public String toString()
    {
        return "Ho ten :"+this.hoTen +"\nNgay sinh :"+this.ngaySinh +"\nGioi tinh :" +(this.gioiTinh == 1 ? "Nu" : "Nam") +"\nDia chi : "+this.address+"\n";
    }

    public String getHoTen()
    {
        return hoTen;
    }

    public void setHoTen(String hoTen)
    {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh()
    {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh)
    {
        this.ngaySinh = ngaySinh;
    }

    public int getGioiTinh()
    {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh)
    {
        this.gioiTinh = gioiTinh;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}
