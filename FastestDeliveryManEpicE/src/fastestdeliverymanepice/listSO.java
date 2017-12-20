package fastestdeliverymanepice;

import java.util.Date;

public class listSO {
    private int Schedule_OrderID;
    private Date Delivery_Date;
    private String Delivery_Time;
    private String Total_Price;
    private String Status;
    private int CustomerID;
    
    public listSO(int Schedule_OrderID, Date Delivery_Date,String Delivery_Time,String Total_Price, String Status,int CustomerID){
        this.Schedule_OrderID = Schedule_OrderID;
        this.Delivery_Date = Delivery_Date;
        this.Delivery_Time = Delivery_Time;
        this.Total_Price = Total_Price;
        this.Status = Status;
        this.CustomerID = CustomerID;
    }
    
    public int getSchedule_OrderID()
    {
        return Schedule_OrderID;
    }
    public Date getDelivery_Date()
    {
        return Delivery_Date;
    }
    public String getDelivery_Time()
    {
        return Delivery_Time;
    }
    public String getTotal_Price ()
    {
        return Total_Price;
    }
    public String getStatus()
    {
        return Status;
    }
    public int getCustomerID()
    {
        return CustomerID;
    }
}
