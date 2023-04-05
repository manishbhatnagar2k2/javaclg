class Generic
{
    public static void main(String ...args)
    {
        GenericClass<Integer> intob = new GenericClass<>(7);
        System.out.println(intob.getData());
        GenericClass<String> strob = new GenericClass<>("Hello Mani");
        System.out.println(strob.getData());
        strob.<String>genericsMethod("Bhatnagar");
        intob.<Integer>genericsMethod(7);
    }
}
class GenericClass<T>
{
    T data;
    public GenericClass(T data)
    {
        this.data = data;
    }
    public T getData()
    {
        return data;
    }
    public void genericsMethod(T data)
    {
        System.out.println(data);
    }
}