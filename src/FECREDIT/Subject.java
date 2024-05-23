package FECREDIT;

public class Subject
{
    private String maMonHoc;
    private String tenMonHoc;
    private int soTinChi;
    private float diemCC;
    private float diemKT;
    private float diemCK;

    public Subject()
    {
    }

    public Subject(String maMonHoc, String tenMonHoc, int soTinChi)
    {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
    }

    public float calConversionMark()
    {
        float ccm = calSubjectMark();
        float csm = -1;

        if(ccm<4)
            csm = 0;
        else if(ccm<4.9)
            csm = 1;
        else if(ccm<5.4)
            csm = 1.5f;
        else if(ccm<6.4)
            csm = 2;
        else if(ccm<6.9)
            csm = 2.5f;
        else if(ccm<7.4)
            csm = 3;
        else if(ccm<8.4)
            csm = 3.5f;
        else if(ccm<=10)
            csm = 4;

        return csm;
    }

    public float calConversionMark(String grade)
    {
        float csm =-1;

        switch(grade)
        {
            case "F":
                csm = 0;
                break;
            case "D":
                csm = 1;
                break;
            case "D+":
                csm = 1.5f;
                break;
            case "C":
                csm = 2;
                break;
            case "C+":
                csm = 2.5f;
                break;
            case "B":
                csm = 3;
                break;
            case "B+":
                csm = 3.5f;
                break;
            case "A":
                csm = 4;
                break;
        }

        return csm;
    }

    public String calGrade()
    {
        String csm="";
        float ccm = calSubjectMark();

        if(ccm<4)
            csm = "F";
        else if(ccm<4.9)
            csm = "D";
        else if(ccm<5.4)
            csm = "D+";
        else if(ccm<6.4)
            csm = "C";
        else if(ccm<6.9)
            csm = "C+";
        else if(ccm<7.4)
            csm = "B";
        else if(ccm<8.4)
            csm = "B+";
        else if(ccm<=10)
            csm = "A";
        return csm;
    }

    public float calSubjectMark()
    {
        return (float)(diemCC*0.1+diemKT*0.3+diemCK*0.6);
    }

    public int getSoTinChi()
    {
        return soTinChi;
    }

    public void setDiemCC(float diemCC)
    {
        this.diemCC = diemCC;
    }

    public void setDiemKT(float diemKT)
    {
        this.diemKT = diemKT;
    }

    public void setDiemCK(float diemCK)
    {
        this.diemCK = diemCK;
    }

    @Override
    public String toString()
    {
        return (maMonHoc+"-"+tenMonHoc+"-"+diemCC+"-"+diemKT+"-"+diemCK+"-"+calSubjectMark());
    }
}
