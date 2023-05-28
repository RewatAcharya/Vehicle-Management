 /**
  * this is Vehicle class which stores vehicle attributes
  * author@ Rewat Acharya
  * ID: NP05CP4S220043
  */
public class Vehicle
{
           //Declaration of the attributes--->
    private int vehicleID;
    private String vehicleName; 
    private String vehicleWeight;
    private String vehicleColor;
    private String vehicleSpeed;
    
     //making constructor to initialize the attributes with parameters ---->>
    public Vehicle(int vehicleID, String vehicleName, String vehicleWeight, String vehicleColor)
    {
        this.vehicleID = vehicleID;
        this.vehicleName = vehicleName;
        this.vehicleWeight = vehicleWeight;
        this.vehicleColor = vehicleColor;
    }

        //making accessor method--->
    public int getVehicleID()
    {
        return this.vehicleID;
    }
    public String getVehicleName()
    {
        return this.vehicleName;
    }
    public String getVehicleWeight()
    {
        return this.vehicleWeight;
    }
    public String getVehicleColor()
    {
        return this.vehicleColor;
    }
    public String getVehicleSpeed()
    {
        return this.vehicleSpeed; 
    }

          //making setter to set new speed--->
    public void setVehicleSpeed(String vehicleSpeed)
    {
        this.vehicleSpeed = vehicleSpeed;
    }
    public void setVehicleColor(String vehicleColor)
    {
        this.vehicleColor = vehicleColor;
    }
      
           //display method to display the values of all attributes---->
    public void display()
    {
        System.out.println("Vehicle ID = "+this.getVehicleID());
        System.out.println("Vehicle Name = "+this.getVehicleName());
        if(this.getVehicleWeight().equals("")) {
            System.out.println("Vehicle Weight is Unknown");
        }
        else {
            System.out.println("Vehicle Weight = "+this.getVehicleWeight());
        }
        System.out.println("Color of Vehicle = "+this.getVehicleColor());
        System.out.println("Speed of Vehicle = "+this.getVehicleSpeed());
    }
}