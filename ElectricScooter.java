 /**
  * this is ElectricScooter class with its attributes plus it is another subclass of vehicle
  * author@ Rewat Acharya
  * ID: NP05CP4S220043
  */
  
public class ElectricScooter extends Vehicle
{
    //declaration of attributes
    private int range;
    private int batteryCapacity;
    private int price;
    private String chargingTime;
    private String brand;
    private String mileage;
    private boolean hasPurchased;
    private boolean hasSold;

    // making constructor and passing parameters
    public ElectricScooter(int vehicleID, String vehicleName, String vehicleWeight, String vehicleSpeed, String vehicleColor, int batteryCapacity)
    {
        
          //initializing the parameters and the attributes----->
        super(vehicleID,vehicleName,vehicleWeight,vehicleColor);
        super.setVehicleSpeed(vehicleSpeed);
        super.setVehicleColor(vehicleColor);
        this.batteryCapacity = batteryCapacity;
        this.range = 0;
        this.price = 0;
        this.chargingTime = "";
        this.brand = "";
        this.mileage = "";
        this.hasPurchased = false;
        this.hasSold = false;
    }

     // making accessor methods--->    
    public int getRange()
    {
        return this.range;
    }
    public int getBatteryCapacity()
    {
        return this.batteryCapacity;
    }
    public int getPrice()
    {
        return this.price;
    }
    public String getChargingTime()
    {
        return this.chargingTime;
    }
    public String getBrand()
    {
        return this.brand;
    }
    public String getMileage()
    {
        return this.mileage;
    }
    public boolean getHasPurchased()
    {
        return this.hasPurchased;
    }
    public boolean getHasSold()
    {
        return this.hasSold;
    }

    //setter method to set brand---->
    public void setBrand(String brand)
    {
        if(this.getHasPurchased() == false) {
            this.brand = brand;
        }
        else {
            System.out.println("Your brand can not be changed.");
        }
    }

    // purchase method----->
    public void purchase(String brand, int price, String chargingTime, String mileage, int range)
    {
        if(this.getHasPurchased() == false) {
            setBrand(brand);
            this.price = price;
            this.chargingTime = chargingTime;
            this.mileage = mileage;
            this.range = range;
            this.hasPurchased = true;
        }
    }
         
        //sell method----->
    public void sell(int price)
    {
        if(this.getHasSold() == false) { 
            this.price = price;
            this.range = 0;
            this.chargingTime = "";
            this.mileage = "";
            this.batteryCapacity = 0;
            this.hasSold = true;
            this.hasPurchased = false;
        }
        else {
            System.out.println("The Scooter is already Sold");
        }
    }

    //Display method-------->>
    public void display()
    {
        super.display();
        if(this.getHasPurchased() == true) {    
            System.out.println("Brand = "+this.getBrand());
            System.out.println("Battery Capacity = "+this.getBatteryCapacity());
            System.out.println("Mileage = "+this.getMileage());
            System.out.println("Range = "+this.getRange());
            System.out.println("Recharge time = "+this.getChargingTime());
        }
    }
}