import com.openbootcamp.SmartDevice;
import com.openbootcamp.SmartPhone;
import com.openbootcamp.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartDevice iPhone11 = new SmartDevice();
        SmartDevice SamsungS22 = new SmartPhone("Samsung", "Galaxy S22", "2022", 1499.99, 6.06, 1080, 1920, "Qualcomm Snapdragon", "USB-C", 64);
        SmartDevice AppleWatchGen5 = new SmartWatch("Apple", "Watch Gen 5", "2020", 599.00);

        iPhone11.brand = "Apple";

        System.out.println(iPhone11.brand);
        System.out.println(SamsungS22.brand);
        System.out.println(AppleWatchGen5.price);
    }
}