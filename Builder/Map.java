package Builder;

public class Map {
    private String fly;
    private String ground;
    private String backGround;

    public String getFly() {
        return fly;
    }

    public void setFly(String fly) {
        this.fly = fly;
    }

    public String getGround() {
        return ground;
    }

    public void setGround(String ground) {
        this.ground = ground;
    }

    public String getBackGround() {
        return backGround;
    }

    public void setBackGround(String backGround) {
        this.backGround = backGround;
    }

    @Override
    public String toString() {
        return "Map{" +
                "fly='" + fly + '\'' +
                ", ground='" + ground + '\'' +
                ", backGround='" + backGround + '\'' +
                '}';
    }
}
