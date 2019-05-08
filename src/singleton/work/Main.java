package singleton.work;


public class Main {

    public static void main(String[] args) {
        // Thread safe 
        ThreadSafeCalcTool instance = ThreadSafeCalcTool.getInstance();

        System.out.println("Bob weighs " + 195 + " pounds and is " + 70 + " inches tall with a BMI of " + instance.calcBMI(70, 195, MeasurementSystem.ENGLISH));
       
        System.out.println("Christy weighs " + 84 + " kilograms and is " + 1.7 + " meters tall with a BMI of " + instance.calcBMI(1.7, 84, MeasurementSystem.METRIC));

        System.out.println("Sue weighs " + 135 + " pounds and is " + 63 + " inches tall with a BMI of " + instance.calcBMI(63, 135, MeasurementSystem.ENGLISH));

        System.out.println("Ricky weighs " + 141 + " kilograms and is " + 2.1 + " meters tall with a BMI of " + instance.calcBMI(2.1, 141, MeasurementSystem.METRIC));
   

        System.out.println("The Average BMI Calcuated in this Run is " + instance.averageBMI());
        
        // Enum
        
        CalcToolEnum tool = CalcToolEnum.INSTANCE;
        
        System.out.println("\n\n\n");
        
        System.out.println("Bob weighs " + 195 + " pounds and is " + 70 + " inches tall with a BMI of " + tool.calcBMI(70, 195, MeasurementSystem.ENGLISH));
        System.out.println(System.identityHashCode(tool));
        System.out.println("Christy weighs " + 84 + " kilograms and is " + 1.7 + " meters tall with a BMI of " + tool.calcBMI(1.7, 84, MeasurementSystem.METRIC));
        System.out.println(System.identityHashCode(tool));

        System.out.println("Sue weighs " + 135 + " pounds and is " + 63 + " inches tall with a BMI of " + tool.calcBMI(63, 135, MeasurementSystem.ENGLISH));
        System.out.println(System.identityHashCode(tool));

        System.out.println("Ricky weighs " + 141 + " kilograms and is " + 2.1 + " meters tall with a BMI of " + tool.calcBMI(2.1, 141, MeasurementSystem.METRIC));
           System.out.println(System.identityHashCode(tool));


        System.out.println("The Average BMI Calcuated in this Run is " + tool.averageBMI());
        
        
    }
}