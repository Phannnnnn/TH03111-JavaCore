package FECREDIT;


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HRM hr = new HRM();
        hr.initDemoData(sc);
//        System.out.println("Danh sach HR:");
//        hr.printHRList();
        System.out.println("Danh sach giang vien:");
        hr.printLecturerInfo();
        System.out.println("Danh sach sinh vien:");
        hr.printStudentInfo();

        System.out.print("Nhap id can tim :");
        String code = sc.nextLine();
        System.out.println("Ket qua tim kiem");
        if(hr.searchHuman(code)!=null)
        {
            System.out.println(hr.searchHuman(code));
        }
        else
        {
            System.out.println("Id vua nhap khong ton tai!");
        }
    }
}