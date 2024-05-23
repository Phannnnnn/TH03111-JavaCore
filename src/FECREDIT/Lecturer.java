package FECREDIT;

import java.util.Scanner;

public class Lecturer extends Human
{
    private String password;

    public Lecturer()
    {
    }

    public Lecturer(String code,String password)
    {
        super(code);
        this.password = password;
    }

    public Lecturer(String code,String fullName,String address)
    {
        super(code,fullName,address);
    }

    @Override
    public void enterInfo(Scanner sc)
    {
        System.out.println("Nhap thong tin cho giang vien.");
        super.enterInfo(sc);
        System.out.print("Password :");
        password = sc.nextLine();
    }

    @Override
    public String toString()
    {
        return (super.toString()+"-"+password);
    }
}