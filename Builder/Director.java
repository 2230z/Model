package Builder;

import java.util.Locale;

public class Director {
    public Map createMap(MapBuilder b) {
        b.setFly();
        b.setGround();
        b.setBackGround();
        return b.create();
    }

    public Person createPerson(UserBuilder builder){
        builder.setBody();
        builder.setCloth();
        builder.setEquipment();
        return builder.create();
    }
}
