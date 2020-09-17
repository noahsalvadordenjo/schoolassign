import java.util.Scanner; 
public class ValueConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hoi");
        sunSet((short)2201);
    }
    public static double airPressure(short rawValue) {
        double devidedBy = (double) rawValue / 100;
        double Hg = devidedBy * 2.54;
        return Hg * 1.33322;
    }
    public static double humidity(short rawValue) {
        return (double) rawValue;
    }
    public static double windSpeed(short rawValue) {
        return (double) rawValue * 1.61;
    }
    //double 0 = north
    //double 1 = east
    //double 2 = south
    // double 3 = west
    //double 4 = north
    public static double windDirection(short rawValue) {
        return (double) rawValue / 90;    
    }
    public static double rainRate(short rawValue) {
        return (double) rawValue / 100.00;
    }
    public static double batteryLevel(short rawValue) {
        return (double) ((rawValue * 300.00) / 512.00) / 100.00;
    }
}