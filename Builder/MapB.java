package Builder;

public class MapB extends MapBuilder{
    @Override
    public void setFly() {
        super.map.setFly("地图B的天空");
    }

    @Override
    public void setGround() {
        super.map.setGround("地图B的地面");
    }

    @Override
    public void setBackGround() {
        super.map.setBackGround("地图B的背景");
    }
}
