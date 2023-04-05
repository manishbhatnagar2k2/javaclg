interface print
{
    void print();
}
interface show
{
    void show();
}
class Multi implements print,show
{
    public void print()
    {
        System.out.println("hello");
    }
    public void show()
    {
        System.out.println("Manish");
    }
    public static void main(String ...args)
    {
        Multi m=new Multi();
        m.print();
        m.show();
    }
}