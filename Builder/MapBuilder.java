package Builder;

public abstract class MapBuilder {
    Map map = new Map();

    public abstract void setFly();
    public abstract void setGround();
    public abstract void setBackGround();

    public Map create() {
        return map;
    }
}
