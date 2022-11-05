package Builder;

public class UserB extends UserBuilder{
    @Override
    public void setBody() {
        super.person.setBody("用户B的人体");
    }

    @Override
    public void setCloth() {
        super.person.setCloth("用户B的服装");
    }

    @Override
    public void setEquipment() {
        super.person.setEquipment("用户B的装备");
    }
}
