 /**
  * this is TransportGUI class which have the GUI and implementation of the buttons and validation of the works.
  * author@ Rewat Acharya
  * ID: NP05CP4S220043
  */


import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class TransportGUI
{
    ArrayList<Vehicle> vehicle = new ArrayList<>();
    
    private JFrame autoRickshawFrame,electricScooterFrame;
    private JTextField vehicleNameEF,idEF,weightEF,colorEF,speedEF;
    private JTextField vehicleNameF,idF,weightF,colorF,speedF,displacementF,torqueF,noOfSeatsF,fuelTankCapacityF,groundClearanceF,chargeAmountF,rangeF,batteryCapacityF,priceToPurchaseF,priceToSellF,chargingTimeF,mileageF,brandF;
    private JTextField idToBookF,idToPurchaseF,idToSellF;
    private JComboBox<String> year,month,day;
    
    private JButton addAutoRickshaw,addElectricScooter,bookAutoRickShaw,purchaseScooter,sellScooter;
    
    private final static int INVALID = -1;

    /*
     * Main method<>>>>>>>>>>>>>>>>>>>
     */

    public static void main(String []args) 
    {
        new TransportGUI();        
    }

    //Constructor>>>>>>>>>>>>>>>>.
    public TransportGUI() 
    {
        JFrame cover = new JFrame("Welcome!!!!!!!");

        JPanel panel = new JPanel();
        panel.setBounds(10,20,955,760);
        panel.setBackground(new Color(35, 218, 195));

        JLabel author = new JLabel("Developed by Rewat Acharya");
        author.setBounds(660,650,300,30);
        author.setFont(new Font(null,Font.BOLD,15));
        cover.add(author);
        
        JLabel intro = new JLabel("Welcome to the Transport System");
        intro.setBounds(50,120,550,35);
        intro.setFont(new Font(null,Font.BOLD,30));
        cover.add(intro);
        
        JButton autoRickshaw = new JButton("Go to AutoRickshaw");
        autoRickshaw.setBounds(330,350,250,40);
        autoRickshaw.setFocusPainted(false);
        autoRickshaw.setFont(new Font(null,Font.BOLD,16));
        cover.add(autoRickshaw);

        JButton electricScooter = new JButton("Go to ElectricScooter");
        electricScooter.setBounds(380,420,250,40);
        electricScooter.setFocusPainted(false);
        electricScooter.setFont(new Font(null,Font.BOLD,16));
        cover.add(electricScooter);



        autoRickshawFrame = new JFrame("AutoRickshaw");
        
        //AutoRickshaw class object>>>>>>>>>>>>>>>
        JPanel pane = new JPanel();
        pane.setBounds(10,20,955,760);
        pane.setBackground(new Color(193, 230, 229));

        //vehicle name>>>>>>>>>
        JLabel vehicleName = new JLabel("Name *");
        vehicleNameF = new JTextField();
        vehicleName.setBounds(600,40,40,30);
        vehicleNameF.setBounds(650,40,200,30);
        autoRickshawFrame.add(vehicleName);autoRickshawFrame.add(vehicleNameF);

        //vehicle id>>>>>>>>>>
        JLabel id = new JLabel("Vehicle ID *");
        idF = new JTextField();
        id.setBounds(105,40,75,30);
        idF.setBounds(180,40,200,30);
        autoRickshawFrame.add(id);autoRickshawFrame.add(idF);

        //vehicle weight>>>>>>>>>>
        JLabel weight = new JLabel("Weight *");
        weightF = new JTextField();
        weight.setBounds(120,100,60,30);
        weightF.setBounds(180,100,200,30);
        autoRickshawFrame.add(weight);autoRickshawFrame.add(weightF);

        //vehicle color>>>>>>>>>.
        JLabel color = new JLabel("Color *");
        colorF = new JTextField();
        color.setBounds(600,100,50,30);
        colorF.setBounds(650,100,200,30);
        autoRickshawFrame.add(color);autoRickshawFrame.add(colorF);

        //vehicle speed>>>>>>>>>>>
        JLabel speed = new JLabel("Speed *");
        speedF = new JTextField();
        speed.setBounds(120,160,50,30);
        speedF.setBounds(180,160,200,30);
        autoRickshawFrame.add(speed);autoRickshawFrame.add(speedF);
        
        //engine displacement>>>>>>>
        JLabel displacement = new JLabel("Engine Displacement");
        displacementF = new JTextField();
        displacement.setBounds(520,160,125,30);
        displacementF.setBounds(650,160,200,30);
        autoRickshawFrame.add(displacement);autoRickshawFrame.add(displacementF);

        //torque>>>>>>
        JLabel torque = new JLabel("Torque");
        torqueF = new JTextField();
        torque.setBounds(125,220,50,30);
        torqueF.setBounds(180,220,200,30);
        autoRickshawFrame.add(torque);autoRickshawFrame.add(torqueF);

        //fuel tank
        JLabel fuelTankCapacity = new JLabel("Fuel Tank");
        fuelTankCapacityF = new JTextField();
        fuelTankCapacity.setBounds(580,220,75,30);
        fuelTankCapacityF.setBounds(650,220,200,30);
        autoRickshawFrame.add(fuelTankCapacity);autoRickshawFrame.add(fuelTankCapacityF);

        //ground clearance
        JLabel groundClearance = new JLabel("Ground Clearance");
        groundClearanceF = new JTextField();
        groundClearance.setBounds(70,280,125,30);
        groundClearanceF.setBounds(180,280,200,30);
        autoRickshawFrame.add(groundClearance);autoRickshawFrame.add(groundClearanceF);

        //addAutoRickshaw button
        addAutoRickshaw = new JButton("Add AutoRickshaw");
        addAutoRickshaw.setBounds(400,340,150,40);
        autoRickshawFrame.add(addAutoRickshaw);
        addAutoRickshaw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addAutoRickshaw();
            }
        });

        /*
         * Booking autoRickshaw
         */

        //vehicle id
        JLabel idToBook = new JLabel("Vehicle ID");
        idToBookF = new JTextField();
        idToBook.setBounds(115,420,75,30);
        idToBookF.setBounds(180,420,200,30);
        autoRickshawFrame.add(idToBook);autoRickshawFrame.add(idToBookF);

        //booked date
        JLabel bookedDate = new JLabel("Booked Date");
        bookedDate.setBounds(560,420,100,30);
        autoRickshawFrame.add(bookedDate);
        String yearCB[] = {"2020 ","2021 ","2022 ","2023 ","2024 ","2025 ","2026 ","2027 ","2028 "};
        year = new JComboBox<>(yearCB);
        year.setBounds(650,420,60,30);
        autoRickshawFrame.add(year);
        String monthCB[] = {"Jan ","Feb ","Mar ","Apr ","May ","Jun ","Jul ","Aug ","Sep ","Oct ","Nov ","Dec "};
        month = new JComboBox<>(monthCB);
        month.setBounds(710,420,50,30);
        autoRickshawFrame.add(month);
        String dayCB[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15",
        "16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        day = new JComboBox<>(dayCB);
        day.setBounds(760,420,40,30);
        autoRickshawFrame.add(day);        

        //charge amount
        JLabel chargeAmount = new JLabel("Charge Amount");
        chargeAmountF = new JTextField();
        chargeAmount.setBounds(80,480,125,30);
        chargeAmountF.setBounds(180,480,200,30);
        autoRickshawFrame.add(chargeAmount);autoRickshawFrame.add(chargeAmountF);

        //no of seats
        JLabel noOfSeats = new JLabel("Seats");
        noOfSeatsF = new JTextField();
        noOfSeats.setBounds(600,480,75,30);
        noOfSeatsF.setBounds(650,480,200,30);
        autoRickshawFrame.add(noOfSeats);autoRickshawFrame.add(noOfSeatsF);

        //book button
        bookAutoRickShaw = new JButton("Book");
        bookAutoRickShaw.setBounds(400,540,150,35);
        autoRickshawFrame.add(bookAutoRickShaw);
        bookAutoRickShaw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                book();
            }
        });


        /*
         * For electric Scooter 
         */


        electricScooterFrame = new JFrame("ElectricScooter");

        JPanel pane1 = new JPanel();
        pane1.setBounds(10,20,955,760);
        pane1.setBackground(new Color(193, 230, 229));

        //vehicle id>>>>>>>>>>
        JLabel id1 = new JLabel("Vehicle ID *");
        idEF = new JTextField();
        id1.setBounds(105,40,75,30);
        idEF.setBounds(180,40,200,30);
        electricScooterFrame.add(id1);electricScooterFrame.add(idEF);

        //vehicle name>>>>>>>>.
        JLabel vehicleName1 = new JLabel("Name *");
        vehicleNameEF = new JTextField();
        vehicleName1.setBounds(600,40,40,30);
        vehicleNameEF.setBounds(650,40,200,30);
        electricScooterFrame.add(vehicleName1);electricScooterFrame.add(vehicleNameEF);

        //vehicle weight>>>>>>>>>>
        JLabel weight1 = new JLabel("Weight *");
        weightEF = new JTextField();
        weight1.setBounds(120,100,60,30);
        weightEF.setBounds(180,100,200,30);
        electricScooterFrame.add(weight1);electricScooterFrame.add(weightEF);

        //vehicle color>>>>>>>>>.
        JLabel color1 = new JLabel("Color *");
        colorEF = new JTextField();
        color1.setBounds(600,100,50,30);
        colorEF.setBounds(650,100,200,30);
        electricScooterFrame.add(color1);electricScooterFrame.add(colorEF);

        //vehicle speed>>>>>>>>>>>
        JLabel speed1 = new JLabel("Speed *");
        speedEF = new JTextField();
        speed1.setBounds(120,160,50,30);
        speedEF.setBounds(180,160,200,30);
        electricScooterFrame.add(speed1);electricScooterFrame.add(speedEF);
        
        //battery Capacity>>>>>>>>>>>>>
        JLabel batteryCapacity = new JLabel("Battery Capacity");
        batteryCapacityF = new JTextField();
        batteryCapacity.setBounds(540,160,120,30);
        batteryCapacityF.setBounds(650,160,200,30);
        electricScooterFrame.add(batteryCapacity);electricScooterFrame.add(batteryCapacityF);

        //Button to add Electric Scooter>>>>>>>>>
        addElectricScooter = new JButton("Add ElectricScooter");
        addElectricScooter.setBounds(400,220,150,40);
        electricScooterFrame.add(addElectricScooter);
        addElectricScooter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addElectricScooter();
            }
        });


        /*
         * to purchase electric scooter 
         */

        //vehicle id>>>>>>>>>>>>>
        JLabel idElectricScooter = new JLabel("Vehicle ID");
        idToPurchaseF = new JTextField();
        idElectricScooter.setBounds(105,300,75,30);
        idToPurchaseF.setBounds(180,300,200,30);
        electricScooterFrame.add(idElectricScooter);electricScooterFrame.add(idToPurchaseF);

        //brand >>>>>>>>
        JLabel brand = new JLabel("Brand");
        brandF = new JTextField();
        brand.setBounds(600,300,75,30);
        brandF.setBounds(650,300,200,30);
        electricScooterFrame.add(brand);electricScooterFrame.add(brandF);

        //price
        JLabel priceToPurchase = new JLabel("Price");
        priceToPurchaseF = new JTextField();
        priceToPurchase.setBounds(125,360,50,30);
        priceToPurchaseF.setBounds(180,360,200,30);
        electricScooterFrame.add(priceToPurchase);electricScooterFrame.add(priceToPurchaseF);

        //charging time 
        JLabel chargingTime = new JLabel("Charging time");
        chargingTimeF = new JTextField();
        chargingTime.setBounds(560,360,100,30);
        chargingTimeF.setBounds(650,360,200,30);
        electricScooterFrame.add(chargingTime);electricScooterFrame.add(chargingTimeF);

        //mileage
        JLabel mileage = new JLabel("Mileage");
        mileageF = new JTextField();
        mileage.setBounds(120,420,75,30);
        mileageF.setBounds(180,420,200,30);
        electricScooterFrame.add(mileage);electricScooterFrame.add(mileageF);

        //range
        JLabel range = new JLabel("Range");
        rangeF = new JTextField();
        range.setBounds(605,420,75,30);
        rangeF.setBounds(650,420,200,30);
        electricScooterFrame.add(range);electricScooterFrame.add(rangeF);

        //button to purchase 
        purchaseScooter = new JButton("Purchase");
        purchaseScooter.setBounds(400,480,150,40);
        electricScooterFrame.add(purchaseScooter);
        purchaseScooter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                purchase();
            }
        });

        

        /*
         * selling the scooter 
         */

        //vehicle id 
        JLabel idScooterSelling = new JLabel("Vehicle ID");
        idToSellF = new JTextField();
        idScooterSelling.setBounds(110,550,75,30);
        idToSellF.setBounds(180,550,200,30);
        electricScooterFrame.add(idScooterSelling);electricScooterFrame.add(idToSellF);

        //price
        JLabel priceToSell = new JLabel("Price");
        priceToSellF = new JTextField();
        priceToSell.setBounds(600,550,75,30);
        priceToSellF.setBounds(650,550,200,30);
        electricScooterFrame.add(priceToSell);electricScooterFrame.add(priceToSellF);

        //button to sell
        sellScooter = new JButton("Sell");
        sellScooter.setBounds(400,610,150,40);
        electricScooterFrame.add(sellScooter);
        sellScooter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sell();
            }
        });


        //button to display>>>>>>>>
        JButton display = new JButton("Display");
        display.setBounds(30,700,100,60);
        autoRickshawFrame.add(display);
        display.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (vehicle.isEmpty()) {
                    JOptionPane.showMessageDialog(autoRickshawFrame, "Empty List","Information",JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                for(Vehicle dis : vehicle) { 
                    if (dis instanceof AutoRickshaw) {
                        AutoRickshaw ar = (AutoRickshaw)dis;
                        System.out.println();
                        ar.display();
                    } 
                    else {
                        JOptionPane.showMessageDialog(electricScooterFrame, "AutoRickshaw is not added to the List","Information",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }                                            
                }
            }
        });

        JButton display1 = new JButton("Display");
        display1.setBounds(30,700,100,60);
        electricScooterFrame.add(display1);
        display1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (vehicle.isEmpty()) {
                    JOptionPane.showMessageDialog(electricScooterFrame, "Empty List","Information",JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                for(Vehicle dis : vehicle) { 
                    if (dis instanceof ElectricScooter) {
                        ElectricScooter ar = (ElectricScooter)dis;
                        System.out.println();
                        ar.display();
                    } 
                    else {
                        JOptionPane.showMessageDialog(electricScooterFrame, "Empty List","Information",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }                        
                }
            }
        });

        //button to clear the input fields>>>>>>>>>>>>
        JButton clear = new JButton("Clear");
        clear.setBounds(830,700,100,60);
        autoRickshawFrame.add(clear);        
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearAutoRickshaw();
                JOptionPane.showMessageDialog(autoRickshawFrame, "All fields are Cleared","Clear",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JButton clear1 = new JButton("Clear");
        clear1.setBounds(830,700,100,60);        
        electricScooterFrame.add(clear1);
        clear1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearElectricScooter();
                JOptionPane.showMessageDialog(autoRickshawFrame, "All fields are Cleared","Clear",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        
        /*
         * Back buttons
         * to every frames>>>>>>>>>>
         */

        JButton toES = new JButton("Go to ElectricScooter");
        toES.setBounds(380,700,200,50);
        autoRickshawFrame.add(toES);
        toES.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                electricScooterFrame.setVisible(true);
                autoRickshawFrame.setVisible(false);
            }
        });

        JButton toAR = new JButton("Go to AutoRickshaw");
        toAR.setBounds(380,700,200,50);
        electricScooterFrame.add(toAR);
        toAR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                autoRickshawFrame.setVisible(true);
                electricScooterFrame.setVisible(false);
            }
        });
       
        
        //making frame>>>>>>>>>>>>>>>
        autoRickshawFrame.add(pane);
        autoRickshawFrame.setLayout(null);        
        autoRickshawFrame.setSize(990,850);         
        autoRickshawFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        autoRickshawFrame.setLocationRelativeTo(null);

        autoRickshaw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                autoRickshawFrame.setVisible(true);
                cover.setVisible(false);
            }
        });

        electricScooterFrame.add(pane1);
        electricScooterFrame.setLayout(null);        
        electricScooterFrame.setSize(990,850);         
        electricScooterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        electricScooterFrame.setLocationRelativeTo(null);

        electricScooter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                electricScooterFrame.setVisible(true);
                cover.setVisible(false);
            }
        });


        cover.add(panel);
        cover.setLayout(null);
        cover.setVisible(true);
        cover.setSize(990,850);         
        cover.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cover.setLocationRelativeTo(null);

    }


    //getter for the fields.........>>>>>>>>>>>>>>
    public String getVehicleName() 
    {
        String name = vehicleNameF.getText();
        return name;
    }
    public int getVehicleId() 
    {
        String vehicleID = idF.getText().trim();
        int vehicleId = INVALID;
        try {            
            vehicleId = Integer.parseInt(vehicleID);
        }
        catch (NumberFormatException e) {}
        return vehicleId;
    }
    public String getVehicleWeight() 
    {
        String vehicleWeight = weightF.getText();
        return vehicleWeight;
    }
    public String getVehicleColor() 
    {
        String vehicleColor = colorF.getText();
        return vehicleColor;
    }
    public String getVehicleSpeed() 
    {
        String vehicleSpeed = speedF.getText();
        return vehicleSpeed;
    }
    public int getEngineDisplacement() 
    {
        String displacement = displacementF.getText().trim();
        int engineDisplacement = INVALID;
        try {
            engineDisplacement = Integer.parseInt(displacement);
        }
        catch (NumberFormatException e) {}
        return engineDisplacement;
    }
    public String getTorque() 
    {
        String torque = torqueF.getText();
        return torque;
    }
    public int getFuelTankCapacity() 
    {
        String tankCapacity = fuelTankCapacityF.getText().trim();
        int fuelTankCapacity = INVALID;
        try {
            fuelTankCapacity = Integer.parseInt(tankCapacity);
        }
        catch (NumberFormatException e) {}
        return fuelTankCapacity;
    }
    public String getGroundClearance() 
    {
        String groundClearance = groundClearanceF.getText();
        return groundClearance;
    }
    public int getBookingID() 
    {
        String bookId = idToBookF.getText().trim();
        int bookingID = INVALID;
        try {
            bookingID = Integer.parseInt(bookId);
        }
        catch (NumberFormatException e) {}
        return bookingID;
    }
    public String getBookedDate() 
    {
        String year1 = year.getSelectedItem().toString();
        String month1 = month.getSelectedItem().toString();
        String day1 = day.getSelectedItem().toString();

        String date = year1 + month1 + day1;
        return date;
    }
    public int getChargeAmount() 
    {
        String chargingAmount = chargeAmountF.getText().trim();
        int chargeAmount = INVALID;
        try {
            chargeAmount = Integer.parseInt(chargingAmount);
        }
        catch(NumberFormatException e) {} 
        return chargeAmount;
    }
    public int getNumberOfSeats() 
    {
        String number = noOfSeatsF.getText().trim();
        int numberOfSeats = INVALID;
        try {
            numberOfSeats = Integer.parseInt(number);
        }
        catch(NumberFormatException e) {} 
        return numberOfSeats;
    }


    //Getter method for ElectricScooter>>>>>>>>>..
    public String getVehicleNameE () 
    {
        return vehicleNameEF.getText();
    }
    public int getVehicleIDE () 
    {
        String vehicle = idEF.getText().trim();
        int vehicleID = INVALID;
        try {
            vehicleID = Integer.parseInt(vehicle);
        }
        catch (NumberFormatException e) {}
        return vehicleID;
    }
    public String getVehicleWeightE () 
    {
        return weightEF.getText();
    }
    public String getVehicleColorE () 
    {
        return colorEF.getText();
    }
    public String getVehicleSpeedE () 
    {
        return speedEF.getText();
    }    
    public int getBatteryCapacity() 
    {
        String vehicleBattery = batteryCapacityF.getText().trim();
        int batteryCapacity = INVALID;
        try {
            batteryCapacity = Integer.parseInt(vehicleBattery);
        }
        catch (NumberFormatException e) {}
        return batteryCapacity;
    }
    public int getVehiclePurchase() 
    {
        String vehicle = idToPurchaseF.getText().trim();
        int vehicleId = INVALID;
        try {
            vehicleId = Integer.parseInt(vehicle);
        }
        catch (NumberFormatException e) {} 
        return vehicleId;
    }
    public String getBrand() 
    {
        return brandF.getText();
    }
    public int getPricePurchase() 
    {
        String prices = priceToPurchaseF.getText().trim();
        int price = INVALID;
        try {
            price = Integer.parseInt(prices);
        }
        catch (NumberFormatException e) {} 
        return price;
    }
    public String getChargingTime() 
    {
        return chargingTimeF.getText();
    }
    public String getMileage() 
    {
        return mileageF.getText();
    }
    public int getRange() 
    {
        String ranges = rangeF.getText().trim();
        int range = INVALID;
        try {
            range = Integer.parseInt(ranges);
        }
        catch (NumberFormatException e) {} 
        return range;
    }
    public int getVehicleSell() 
    {
        String vehicle = idToSellF.getText().trim();
        int vehicleId = INVALID;
        try {
            vehicleId = Integer.parseInt(vehicle);
        }
        catch (NumberFormatException e) {} 
        return vehicleId;
    }
    public int getPriceSell() 
    {
        String prices = priceToSellF.getText().trim();
        int price = INVALID;
        try {
            price = Integer.parseInt(prices);
        }
        catch (NumberFormatException e) {} 
        return price;
    }


    //Checking the vehicle if is in the list or not>>>>>>>>>>>
    public boolean checkUnique(int vehicleId) 
    {
        boolean unique = true;
        for (Vehicle id:vehicle) {
            if (id.getVehicleID() == vehicleId) {
                JOptionPane.showMessageDialog(autoRickshawFrame,"Vehicle is already in the List");
                unique = false;
                break;
            }
        }
        return unique;
    }

    
    //method to add autoRickshaw>>>>>>>>>>>
    public void addAutoRickshaw() 
    {
        String name = getVehicleName();
        int id = getVehicleId();
        String color = getVehicleColor();
        String speed = getVehicleSpeed();
        String weight = getVehicleWeight();
        int engineDisplacement = getEngineDisplacement();
        String torque = getTorque();
        int fuelTankCapacity = getFuelTankCapacity();
        String groundClearance = getGroundClearance();

        if (name.isEmpty() || color.isEmpty() || speed.isEmpty() || weight.isEmpty() || torque.isEmpty() || groundClearance.isEmpty()) {
            JOptionPane.showMessageDialog(autoRickshawFrame,"Fill the fields to Add","Not added",JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (id == INVALID || engineDisplacement == INVALID || fuelTankCapacity == INVALID) {
            JOptionPane.showMessageDialog(autoRickshawFrame,"Check ID, Engine Displacement or\nFuel Tank Capacity","Not added",JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (id <= 0 || engineDisplacement <= 0 || fuelTankCapacity <= 0) {
            JOptionPane.showMessageDialog(autoRickshawFrame,"Check ID, Engine Displacement or\nFuel Tank Capacity\ncan not be less than Zero ","Not added",JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (checkUnique(id)) {
            vehicle.add(new AutoRickshaw(id, name, weight, color, speed, engineDisplacement, torque, fuelTankCapacity, groundClearance));
            JOptionPane.showMessageDialog(autoRickshawFrame,"AutoRickshaw is added to the System","Added",JOptionPane.INFORMATION_MESSAGE);

        }
    }


    //method to add ElectricScooter>>>>>>>>>>>>>>
    public void addElectricScooter() 
    {
        String name = getVehicleNameE();
        int id = getVehicleIDE();
        String color = getVehicleColorE();
        String speed = getVehicleSpeedE();
        String weight = getVehicleWeightE();
        int batteryCapacity = getBatteryCapacity();

        if (name.isEmpty() || color.isEmpty() || speed.isEmpty() || weight.isEmpty()) {
            JOptionPane.showMessageDialog(electricScooterFrame,"Fill all the field in the form.","Not added",JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (id == INVALID || batteryCapacity == INVALID) {
            JOptionPane.showMessageDialog(electricScooterFrame,"Check Id and Battery Capacity.","Not added",JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (id <= 0 || batteryCapacity <= 0) {
            JOptionPane.showMessageDialog(electricScooterFrame,"Check Id or BatteryCapacity\ncan not be less than zero ","Not added",JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (checkUnique(id)) {
            vehicle.add(new ElectricScooter(id, name, weight, color, speed, batteryCapacity));
            JOptionPane.showMessageDialog(electricScooterFrame,"ElectricScooter Added.","Added",JOptionPane.INFORMATION_MESSAGE);
        } 
    }

    //booking method>>>>>>>>>>>>>>>>>>>>>>    
    public void book() 
    {
        int vehicleId = getBookingID();
        String bookedDate = getBookedDate();
        int chargeAmount = getChargeAmount();
        int numberOfSeats = getNumberOfSeats();

        if (idToBookF.getText().isEmpty() || chargeAmountF.getText().isEmpty() || noOfSeatsF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(autoRickshawFrame, "Field can not be empty","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(vehicleId == INVALID || vehicleId <= 0 || chargeAmount == INVALID || chargeAmount <= 0 || numberOfSeats == INVALID || numberOfSeats <= 0) {
            JOptionPane.showMessageDialog(autoRickshawFrame,"Invalid ID, Amount or Seats","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }

        for (Vehicle va: vehicle) {            
            if (getBookingID() == va.getVehicleID()) {
                if (va instanceof AutoRickshaw) {
                    AutoRickshaw obj = (AutoRickshaw)va;
                    if (obj.getIsBooked()) {
                        JOptionPane.showMessageDialog(autoRickshawFrame,"AutoRickshaw\nAlready Booked",
                        "Booked",JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                    else {
                        obj.book(bookedDate, chargeAmount, numberOfSeats);                    
                        JOptionPane.showMessageDialog(autoRickshawFrame,
                                                        "Vehicle ID: "+getBookingID()+"\n"+
                                                        "Booked Date: "+getBookedDate()+"\n"+
                                                        "Charge Amount: "+getChargeAmount()+"\n"+
                                                        "Number of Seats: "+getNumberOfSeats()+"\n"+"\n"+
                                                        "AutoRickshaw Booked",
                                                        "Book",JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                }                
                else {
                    JOptionPane.showMessageDialog(autoRickshawFrame,"You can't Book ElectricScooter\nSorry","Not Booked",JOptionPane.ERROR_MESSAGE);
                    return;
                }                  
            }
        }
        if (checkUnique(getBookingID())) {
            JOptionPane.showMessageDialog(autoRickshawFrame, "We don't have the Vehicle","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
    }


    //Purchase electric scooter >>>>>>>>>>
    public void purchase() 
    {
        int vehicleId = getVehiclePurchase();
        String brand = getBrand();
        int price = getPricePurchase();
        String chargingTime = getChargingTime();
        String mileage = getMileage();
        int range = getRange();

        if (brand.isEmpty() || chargingTime.isEmpty() || mileage.isEmpty()) {
            JOptionPane.showMessageDialog(electricScooterFrame,"Field can not be Empty","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (vehicleId == INVALID || vehicleId <= 0) {
            JOptionPane.showMessageDialog(electricScooterFrame,"Invalid Id","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (price == INVALID || price <= 0) {
            JOptionPane.showMessageDialog(electricScooterFrame,"Invalid Price","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (range == INVALID || range <= 0) {
            JOptionPane.showMessageDialog(electricScooterFrame,"Invalid Range","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }        

        for (Vehicle ve : vehicle) {
            if (getVehiclePurchase() == ve.getVehicleID()) {
                if (ve instanceof ElectricScooter) {
                    ElectricScooter es = (ElectricScooter)ve;
                    if (es.getHasPurchased()) {
                        JOptionPane.showMessageDialog(electricScooterFrame, "ElectricScooter\n\nAlready Purchased.",
                        "Purchased",JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                    else {
                        es.purchase(brand, price, chargingTime, mileage, range);
                        JOptionPane.showMessageDialog(electricScooterFrame,
                                                        "Vehicle ID: "+getVehiclePurchase()+"\n"+
                                                        "Brand: "+getBrand()+"\n"+
                                                        "Price: "+getPricePurchase()+"\n"+
                                                        "Charging Time: "+getChargingTime()+"\n"+
                                                        "Mileage: "+getMileage()+"\n"+
                                                        "Range: "+getRange()+"\n\n"+
                                                        "ElectricScooter Purchased",
                                                        "Purchase",JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                }
                else {
                    JOptionPane.showMessageDialog(electricScooterFrame,"You can't Purchase AutoRickshaw\nSorry","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        }

        if (checkUnique(getVehicleSell())) {
            JOptionPane.showMessageDialog(electricScooterFrame, "We don't have the Vehicle","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
    

    //Sell method >>>>>>>>>>>>    
    public void sell() 
    {
        if (idToSellF.getText().equals("") || priceToSellF.getText().equals("")) {
            JOptionPane.showMessageDialog(electricScooterFrame, "Field can not be Empty","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (getVehicleSell() == INVALID || getVehicleSell() <= 0 || getPriceSell() == INVALID || getPriceSell() <= 0) {
            JOptionPane.showMessageDialog(electricScooterFrame,"Invalid ID or Price","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }


        for (Vehicle ve : vehicle) {            
            if (getVehicleSell() == ve.getVehicleID()) {
                if (ve instanceof ElectricScooter) {
                    ElectricScooter es = (ElectricScooter)ve;
                    if (es.getHasSold()) {
                        JOptionPane.showMessageDialog(electricScooterFrame,"ElectricScooter \nAlready Sold.","Sold",JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                    else {
                        es.sell(getPriceSell());
                        JOptionPane.showMessageDialog(electricScooterFrame,
                                                        "Vehicle ID: "+getVehicleSell()+"\n"+
                                                        "Price: "+getPriceSell()+"\n"+"\n"+
                                                        "ElectricScooter is Sold"
                                                        ,"Sell",JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                }
                else {
                    JOptionPane.showMessageDialog(electricScooterFrame,"You can't Sell AutoRickshaw\nSorry","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
        }

        if (checkUnique(getVehicleSell())) {
            JOptionPane.showMessageDialog(electricScooterFrame, "We don't have the Vehicle","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }       
    }

   
    //clear the text fields>>>>>>>>>>>>>>>
    public void clearAutoRickshaw() 
    {        
        vehicleNameF.setText("");;
        idF.setText("");
        colorF.setText("");
        speedF.setText("");
        weightF.setText("");
        displacementF.setText("");
        torqueF.setText("");
        fuelTankCapacityF.setText("");
        groundClearanceF.setText("");        
        idToBookF.setText("");
        year.setSelectedIndex(0);
        month.setSelectedIndex(0);
        day.setSelectedIndex(0);
        noOfSeatsF.setText("");
        chargeAmountF.setText("");        
    } 

    public void clearElectricScooter() 
    {
        vehicleNameEF.setText("");
        idEF.setText("");
        weightEF.setText("");
        colorEF.setText("");
        speedEF.setText("");
        batteryCapacityF.setText("");
        idToPurchaseF.setText("");
        brandF.setText("");
        priceToPurchaseF.setText("");
        chargingTimeF.setText("");
        mileageF.setText("");
        rangeF.setText("");
        idToSellF.setText("");
        priceToSellF.setText("");
    }
}