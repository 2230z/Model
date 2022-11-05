package Builder;

public class UserA extends UserBuilder{

    @Override
    public void setBody() {
        super.person.setBody("用户A的人体");
    }

    @Override
    public void setCloth() {
        super.person.setCloth("用户A的服装");
    }

    @Override
    public void setEquipment() {
        super.person.setEquipment("用户A的装备");
    }
}
