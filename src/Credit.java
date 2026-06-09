public class Credit extends Payment{
    private String no;
    public Credit(float amount, String no){
        super(amount);
        this.no=no;
    }
    public boolean authorized(){
        if(no.length()==16){
            return true;
        }else{
            return false;
        }
    }
}
