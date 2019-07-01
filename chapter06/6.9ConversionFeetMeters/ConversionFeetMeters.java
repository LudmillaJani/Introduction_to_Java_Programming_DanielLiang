
public class ConversionFeetMeters {
    public static void main(String[] args){

        System.out.println("Feet" + "   " + "Meters" + "   |  " + "Meters" + "    " + "Feet");
        System.out.println("_____________________________________");
        for(double feet = 1.0,  metters = 20.0; feet <=10; feet++, metters+=5){
            System.out.printf("%5.1f   %5.3f   |   %5.1f   %5.3f\n",feet, footToMeter(feet), metters, metterToFoot(metters));
        }

    }

    public static double footToMeter(double foot){
        return(0.305 * foot);
    }

    public static double metterToFoot(double meter){
        return(3.279 * meter);
    }
}
