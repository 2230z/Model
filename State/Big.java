package State;

public class Big {
    private int level;
    private BigLevel state;

    public void setState(BigLevel bigLevel){
        state = bigLevel;
    }
    public void click(Big big){
        state.becomeBig(big);
    }



}
