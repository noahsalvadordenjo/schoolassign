import java.util.Scanner; 
public class ValueConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hoi");
        sunRiseSet((short)2201);
    }
    public static double airPressure(short rawValue) {
        double devidedBy = (double) rawValue / 100;
        double Hg = devidedBy * 2.54;
        return Hg * 1.33322;
    }
    public static double temperature(short rawValue)
    {
        double temperature;
        temperature = (((double)rawValue / 10) - 32) / 1.8;
        System.out.println("Temperature: " + temperature);
        return temperature;
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
        return (double) (rawValue / 100.00) * 2.54 * 100;
    }
    public static double uvIndex(short rawValue)
    {
        double uvIndex;
        uvIndex = ((double)rawValue / 10);
        System.out.println("uvIndex: " + uvIndex);
        return uvIndex;
    }
    public static double batteryLevel(short rawValue) {
        return (double) ((rawValue * 300.00) / 512.00) / 100.00;
    }
 
    public static String sunRiseSet(short rawValue)
    {
        String time;
        time = String.valueOf(rawValue);
        String time1 = time.substring(0, (time.length()/2));
        String time2 = time.substring((time.length()/2));
        return time1 + ":" + time2;
    }
}