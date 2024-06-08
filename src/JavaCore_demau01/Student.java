package JavaCore_demau01;

public class Student extends Person
{
    private int numCourses;
    private String[] courses = new String[30];
    private int[] grades = new int[30];

    public Student(String name, String address)
    {
        super(name, address);
    }

    @Override
    public String toString()
    {
        return "Student : "+getName() +"(" +""+getAddress() +")";
    }

    public void addCourseGrade(String course, int grade)
    {
        for(int i=0;i<30;i++)
        {
            if(courses[i] == null)
            {
                this.courses[i] = course;
                this.grades[i] = grade;
                return;
            }
        }
        System.out.println("Danh sách đầy!");
    }

    public double getAverageGrades()
    {
        double average = 0;
        int nho = 0;
        for(int i=0;i<30;i++)
        {
            if(courses[i] != null)
            {
                average += grades[i];
                nho++;
            }
        }

        if((nho - 1) >= 0)
        {
            return average / (nho);
        }
        return -1;
    }
}
