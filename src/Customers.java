public class Customers
{

    //this class represents Bank customer with attributes
    private String name ;
    private String contact;
    private String address;

    //constructors
    public Customers(String name, String contact, String address)
    {
        this.name = name;
        this.contact = contact;
        this.address = address;
    }
    // default constructor
    public Customers( )
    {
        this.name = null;
        this.contact=null;
        this.address=null;
    }
    // getters
    public String getName()
    {
        return name;
    }

    public String getContact()
    {
        return contact;
    }

    public String getAddress()
    {
        return address;
    }


}
