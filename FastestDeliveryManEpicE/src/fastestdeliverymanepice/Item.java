package fastestdeliverymanepice;


public class Item {
    
    private String itemName;
    private int schedule_Quantity;
   
    public Item(String itemName, int schedule_Quantity)
    {
        this.itemName = itemName;
        this.schedule_Quantity = schedule_Quantity;
    }
    
    public String getItemName()
    {
        return itemName;
    }
    
    public int getSchedule_Quantity()
    {
        return schedule_Quantity;
    }
}
