package programmer.zaman.now.data;

public class Bus implements Car {

    public void drive() {
        System.out.println("Drive Bus");
    }

    public int getTire() {
        return 8;
    }

    public String getBrand() {
        return "HINO";
    }

    // override default method dari interface
    public boolean isMaintenace() {
        return true;
    }
}
