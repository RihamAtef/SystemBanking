import java.util.ArrayList;
import java.util.List;

public class Bank
{
    private List<Accounts> accounts;


    public Bank() {

        this.accounts=new ArrayList<>();
    }
    public void addAccount(Accounts account) {
        accounts.add(account);
    }
    public Accounts getnumber(int accountnum)
    {
        for (Accounts value: accounts)
        {
           if(value.getAccountNum()==accountnum)
               return value;
        }
        return null;
    }
}
