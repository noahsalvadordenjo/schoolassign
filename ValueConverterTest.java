public class ValueConverterTest {
    public static void main(String[] args) {
        ValueConverter vc = new ValueConverter();
        System.out.println("db air pressure value 30084");
        System.out.println("real air pressure value " + vc.airPressure((short) 30084));
        System.out.println("db temperature value 763");
        System.out.println("real temperature value " + vc.temperature((short)763));
        System.out.println("db humidity value 32");
        System.out.println("real humidity " + vc.humidity((short) 32));
        System.out.println("db windspeed 14");
        System.out.println("real windspeed " + vc.windSpeed((short) 14));
        System.out.println("db winddirection 30");
        System.out.println("real winddirection " + vc.windSpeed((short) 30));
        System.out.println("db rainmeter value 1");
        System.out.println("real rainmeter value in mm " + vc.rainRate((short)1));
        System.out.println("db uvIndex 66");
        System.out.println("real uv index " + vc.uvIndex((short)66));
        System.out.println("db batterylevel 193");
        System.out.println("real batterylevel " + vc.batteryLevel((short)193));
        System.out.println("db sunrise 526");
        System.out.println("real sunrise " + vc.sunRiseSet((short)526));

    }
}