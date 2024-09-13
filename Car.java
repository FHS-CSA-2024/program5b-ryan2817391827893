public class Car{
    private String carName;
    private double milesDriven;
    private double gallonsUsed;
    public Car(){
        carName = "";
        milesDriven = 0;
        gallonsUsed = 0;
    }
    public Car(String a, double b, double c){
        carName = a;
        milesDriven = b;
        gallonsUsed = c;
    }
    public void setName(String n){
        carName = n;
    }
    public void setMiles(double n){
        milesDriven = n;
    }
    public void setGallons(double n){
        gallonsUsed = n;
    }
    public String getName(){
        return carName;
    }
    public double getMiles(){
        return milesDriven;
    }
    public double getGallons(){
        return gallonsUsed;
    }
    public double calculateAverage(){
        double mpg = milesDriven/gallonsUsed;
        mpg = (10*mpg)+.5;
        mpg = Math.floor(mpg);
        mpg = (double)mpg/10.0;
        return mpg;
    }
    public String toString(){
        double a = calculateAverage();
        String o = carName+" averaged "+a+" m/g";
        return o;
    }
}

