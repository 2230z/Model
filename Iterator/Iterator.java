package Iterator;

public abstract class Iterator {
    protected String str;

    public void setStr(String str) {
        this.str = str;
    }

    public abstract char First();
    public abstract char Last();
    public abstract char next();
    public abstract char prior();
    public abstract int currentIndex();
    public abstract Boolean isDone();

}
