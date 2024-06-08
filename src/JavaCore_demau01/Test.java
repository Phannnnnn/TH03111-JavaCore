package JavaCore_demau01;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin cho sinh viên:");
        System.out.print("Nhập vào họ tên :");
        String name = sc.nextLine();
        System.out.print("Nhập vào địa chỉ :");
        String address = sc.nextLine();
        Student sv = new Student(name, address);

        System.out.print("\nSố lượng môn học n = ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhập vào thông tin " + n + " môn học:");
        String course = null;
        for (int i = 0; i < n; i++)
        {
            System.out.println("Môn học thứ " + (i + 1));
            System.out.print("Tên môn học :");
            course = sc.nextLine();
            System.out.print("Điểm môn học :");
            int grade = sc.nextInt();
            sc.nextLine();

            //Them mon hoc vao danh sach
            sv.addCourseGrade(course, grade);
        }

        //Dua ra thong tin sinh vien
        System.out.println("Thông tin sinh viên :" + sv.toString());
        System.out.println("Điểm trung bình các môn học: " + sv.getAverageGrades());

        //Them 1 mon hoc
        System.out.println("Thêm thông tin một một học:");
        System.out.print("Nhập tên môn học :");
        course = sc.nextLine();
        int grade = sc.nextInt();
        sv.addCourseGrade(course, grade);

        System.out.println("Thông tin sinh viên :" + sv.toString());
        System.out.println("Điểm trung bình các môn học: " + sv.getAverageGrades());
    }
}
