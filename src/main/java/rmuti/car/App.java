package rmuti.car;
public class App 
{
    public static void main( String[] args )
    {
        Car car1 =new Car("1","TOYOTA",2000);
        Car car2 =new Car("1","TOYOTA",2000);
        System.out.println(car1.equals(car2));
        System.out.println(car1.compareTo(car2));
    }
}
