public abstract class Kendaraan {
    protected int roda;
    public Kendaraan(int roda){
        this.roda=roda;
    }
    public abstract void bergerak();
    public abstract void berhenti();
    public int getRoda(){
        return this.roda;
    }
    public void setRoda(int roda){
        this.roda=roda;
    }
}
