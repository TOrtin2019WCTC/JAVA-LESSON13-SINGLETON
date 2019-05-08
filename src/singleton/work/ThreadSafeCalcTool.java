/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton.work;

/**
 *
 * @author tim
 */
public class ThreadSafeCalcTool {
 private static int totalBMICalculated = 0;
    private static int numberOfCaculations = 0;
    private static ThreadSafeCalcTool instance = null;

    private ThreadSafeCalcTool(){};
    
    public static double calcBMI(double height, double weight, MeasurementSystem measurementSystem) {
        
        double bmi = weight / Math.pow(height, 2);
        if (measurementSystem == MeasurementSystem.ENGLISH) {
            bmi *= 703;
        }
        totalBMICalculated += bmi;
        numberOfCaculations++;

        return bmi;
    }

    public static double averageBMI() {
        return totalBMICalculated / numberOfCaculations;
    }
    
     public static ThreadSafeCalcTool getInstance() {
        if (instance == null) {
            synchronized(ThreadSafeCalcTool.class){
                if (instance == null){
                     instance = new ThreadSafeCalcTool();
                }
               
            }
            
        }
        return instance;
     }
}
    


