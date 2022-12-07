import com.openbootcamp.SmartDevice;
import com.openbootcamp.SmartPhone;
import com.openbootcamp.SmartWatch;
import com.openbootcamp.classes.Car;
import com.openbootcamp.implementations.CarRepositoryImpl;
import com.openbootcamp.interfaces.CarRepository;

public class Main {
    public static void main(String[] args) {

        SmartDevice iPhone11 = new SmartDevice();
        SmartDevice SamsungS22 = new SmartPhone("Samsung", "Galaxy S22", "2022", 1499.99, 6.06, 1080, 1920, "Qualcomm Snapdragon", "USB-C", 64);
        SmartDevice AppleWatchGen5 = new SmartWatch("Apple", "Watch Gen 5", "2020", 599.00);

        iPhone11.brand = "Apple";

        // System.out.println(iPhone11.brand);
        // System.out.println(SamsungS22.brand);
        // System.out.println(AppleWatchGen5.price);

        CarRepository carRepository = new CarRepositoryImpl();

        Car toyotaSupraMKIV = new Car("Toyota", "Supra MK.IV", "1993", "2JZ inline 6", 100000.00);

        Car nissanSkylineR32 = new Car("Nissan", "Skyline R32", "1989", "RB26DETT", 100000.00);

        System.out.println(carRepository.save(toyotaSupraMKIV));

        System.out.println(carRepository.save(nissanSkylineR32));

        System.out.println(carRepository.findAll());

        System.out.println(carRepository.findBy(toyotaSupraMKIV));

        System.out.println(carRepository.delete(toyotaSupraMKIV));
    }
}