public class Cash extends Payment{
    private float cashTendered;
    public Cash(float amount, float cashTendered){
        super(amount);
        this.cashTendered=cashTendered;
    }
    public boolean authorized(){
        if(cashTendered<amount){
            return false;
        }else{
            return true;
        }
    }
}
