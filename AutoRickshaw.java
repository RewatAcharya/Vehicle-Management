 /**
  * this is AutoRickshaw class which stores its attributes plus it is a subclass of vehicle parent class
  * author@ Rewat Acharya
  * ID: NP05CP4S220043
  */

public class AutoRickshaw extends Vehicle
{
    //Declaration of the attributes:
    private int engineDisplacement;
    private String torque;
    private int numberOfSeats;
    private int fuelTankCapacity;
    private String groundClearance;
    private int chargeAmount;
    private String bookedDate;
    private boolean isBooked;
  
    //Constructor with parameters   >>
    public AutoRickshaw(int vehicleID, String vehicleName, String vehicleWeight, String vehicleColor, String vehicleSpeed, int engineDisplacement, String torque,int fuelTankCapacity,String groundClearance)
    {
         //Initializing the parameters   >>
        super(vehicleID,vehicleName,vehicleWeight,vehicleColor);
        super.setVehicleSpeed(vehicleSpeed);
        super.setVehicleColor(vehicleColor);
        this.engineDisplacement = engineDisplacement;
        this.torque = torque;
        this.fuelTankCapacity = fuelTankCapacity;
        this.groundClearance = groundClearance;
        this.isBooked = false;
    }
     
       //making accessor methods    >>>
    public int getEngineDisplacement()
    {
        return this.engineDisplacement;
    }
    public String getTorque()
    {
        return this.torque;
    }
    public int getNumberOfSeats()
    {
        return this.numberOfSeats;
    }
    public int getFuelTankCapacity()
    {
        return this.fuelTankCapacity;
    }
    public String getGroundClearance()
    {
        return this.groundClearance;
    }
    public int getChargeAmount()
    {
        return this.chargeAmount;
    }
    public String getBookedDate()
    {
        return this.bookedDate;
    }
    public boolean getIsBooked()
    {
        return this.isBooked;
    }
  
     // making setters methods   >>
    public void setChargeAmount(int chargeAmount)
    {
        this.chargeAmount = chargeAmount;
    }
    public void setNumberOfSeats(int numberOfSeats)
    {
        this.numberOfSeats = numberOfSeats;
    }
    
       // method to book autoRickshaw >>>>
    public void book(String bookedDate, int chargeAmount, int numberOfSeats)
    {
        if(this.getIsBooked() == false) {
            this.bookedDate = bookedDate;
            this.setChargeAmount(chargeAmount);
            this.setNumberOfSeats(numberOfSeats);
            isBooked = true;
            System.out.println("Your vehicle ID is "+super.getVehicleID()+" & Your booking is done for "+bookedDate);
        }
        else { 
            System.out.println("Already booked on "+this.getBookedDate());
        }
    }
      
       //  method to display the attributes values .>>>
    public void display()
    {
        super.display();
        if(this.getIsBooked() == true) {
            System.out.println("Engine Displacement = "+this.getEngineDisplacement());
            System.out.println("Torque = "+this.getTorque());
            System.out.println("Fuel Tank Capacity = "+this.getFuelTankCapacity());
            System.out.println("Ground Clearance = "+this.getGroundClearance());
            System.out.println("Booked Date = "+this.getBookedDate());
            if(this.getChargeAmount() == 0) {
                System.out.println("Charged Amount = Not Charged Yet");
            }
            else {
                System.out.println("Charged Amount = "+this.getChargeAmount());
            }
            if(this.getNumberOfSeats() == 0) {
                System.out.println("Number of Seats = Not Yet Set");
            }
            else {
                System.out.println("Number of Seats = "+this.getNumberOfSeats());
            }
        }
    }
}   
