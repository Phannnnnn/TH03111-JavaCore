package FECREDIT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HRM
{
    private List<Human> hrList = new ArrayList<Human>();

    public HRM()
    {
    }

    public void addHR(Human hm)
    {
        this.hrList.add(hm);
    }

    public void addHR(Scanner sc)
    {
        String tiep = "";
        do
        {
            System.out.print("Chon nhan su de nhap thong tin (0-sv : 1-gv) :");
            int chon = sc.nextInt();
            sc.nextLine();
            Human hm = null;
            switch (chon)
            {
                case 0:
                    hm = new Student();
                    break;
                case 1:
                    hm = new Lecturer();
                    break;
                default:
                    System.out.println("Lua chon khong hop le (0-sv : 1-gv)!");
            }
            if (hm != null)
            {
                hm.enterInfo(sc);
                this.hrList.add(hm);
            }
            System.out.print("Tiep tuc nhap ?(y/n): ");
            tiep = sc.nextLine();
        }
        while ("y".equalsIgnoreCase(tiep));
    }

    public void printHRList()
    {
        for(Human hm : hrList)
        {
            System.out.println(hm.toString());
        }
    }

    public void printLecturerInfo()
    {
        for(Human hm : hrList)
        {
            if(hm instanceof Lecturer)
            {
                System.out.println(hm.toString());
            }
        }
    }

    public void printStudentInfo()
    {
        for(Human hm : hrList)
        {
            if(hm instanceof Student)
            {
                System.out.println(hm.toString());
            }
        }
    }

    public String searchHuman(String code)
    {
        for(Human hm : hrList)
        {
            if(code.equalsIgnoreCase(hm.getCode()))
                return hm.toString();
        }
        return null;
    }

    public void initDemoData()
    {

    }

    public void initDemoData(Scanner sc)
    {
        this.addHR(sc);
    }
}