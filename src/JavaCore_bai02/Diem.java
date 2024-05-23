package JavaCore_bai02;

public class Diem
{
    float x,y;

    public Diem()
    {
        x=y=0;
    }

    public Diem(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    public float kc(Diem d)
    {
        return (float)Math.sqrt((x-d.x)*(x-d.x) +(y-d.y)*(y-d.y));
    }

    public void inDiem()
    {
        System.out.println("("+x +","+y +")");
    }
}
