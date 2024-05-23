package FECREDIT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends Human
{
    private String class_;
    private List<Subject> subjectList = new ArrayList<Subject>();

    public Student()
    {

    }

    public Student(String code)
    {
        super(code);
    }

    public Student(String code,String fullName)
    {
        super(code,fullName);
    }

    public Student(String code,String fullName,String class_)
    {
        super(code,fullName);
        this.class_ = class_;
    }

    public Student(String code,String fullName,String class_,String address)
    {
        super(code,fullName,address);
        this.class_ = class_;
    }

    public void addSubject(Subject sub)
    {
        this.subjectList.add(sub);
    }

    public float calTermAverageMark()
    {
        float ts = 0;
        float ms = 0;

        for(Subject sub : subjectList)
        {
            ts += sub.calSubjectMark() * sub.getSoTinChi();
            ms += sub.getSoTinChi();
        }

        if(ms!=0)
        {
            return ts/ms;
        }
        return -1;
    }

    @Override
    public void enterInfo(Scanner sc)
    {
        System.out.println("Nhap thong tin cho sinh vien.");
        super.enterInfo(sc);
        System.out.print("Class    :");
        class_ = sc.nextLine();
    }

    @Override
    public String toString()
    {
        return (super.toString()+"-"+class_);
    }

    public String getClass_()
    {
        return class_;
    }

    public void setClass_(String class_)
    {
        this.class_ = class_;
    }
}