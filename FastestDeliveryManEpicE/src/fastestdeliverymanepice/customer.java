
package fastestdeliverymanepice;

public class customer {
    private int ID;
    private String CUSTOMERNAME;
    private String CONTACTNO;
    private String ADDRESS;
   
    
    public customer(int ID,String CUSTOMERNAME, String CONTACTNO,String ADDRESS){
        this.ID = ID;
        this.CUSTOMERNAME = CUSTOMERNAME;
        this.CONTACTNO = CONTACTNO;
        this.ADDRESS = ADDRESS;
    }
    
    public int getID()
    {
        return ID;
    }
    public String getCustomerName()
    {
        return CUSTOMERNAME;
    }
    public String getContactno()
    {
        return CONTACTNO;
    }
    public String getAddress ()
    {
        return ADDRESS;
    }
}
