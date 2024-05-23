package FECREDIT;

import java.util.Scanner;

public class Human
{
    private String code;
    private String address;
    private String fullName;

    public Human()
    {
    }

    public Human(String code)
    {
        this.code = code;
    }

    public Human(String code, String fullName)
    {
        this(code);
        this.fullName = fullName;
    }

    public Human(String code, String address, String fullName)
    {
        this(code,fullName);
        this.fullName = fullName;
    }

    public void enterInfo(Scanner sc)
    {
        System.out.print("Code     :");
        code = sc.nextLine();
        System.out.print("FullName :");
        fullName = sc.nextLine();
        System.out.print("Address  :");
        address = sc.nextLine();
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getFullName()
    {
        return fullName;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    @Override
    public String toString()
    {
        return (code+"-"+fullName+"-"+address);
    }
}