package Builder;

public class MapA extends MapBuilder{
    @Override
    public void setFly() {
        super.map.setFly("地图A的天空");
    }

    @Override
    public void setGround() {
        super.map.setGround("地图A的地面");
    }

    @Override
    public void setBackGround() {
        super.map.setBackGround("地图A的背景");
    }
}
