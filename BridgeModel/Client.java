package BridgeModel;

import BridgeModel.OperationSystem.Logger;
import BridgeModel.OperationSystem.SystemA;
import BridgeModel.OperationSystem.SystemB;
import BridgeModel.Sout.Sout;
import BridgeModel.Sout.SoutA;
import BridgeModel.Sout.SoutB;
import BridgeModel.Video.LanA;
import BridgeModel.Video.Language;
import BridgeModel.Video.LanB;

public class Client {
    public static void main(String[] args) {
        Logger logger = new SystemA();
        Language language = new LanB();
        Sout sout = new SoutA();
        logger.useLanguage(language);
        logger.useSout(sout);
        logger.create();
        System.out.println("------------------");
        Logger logger2 = new SystemB();
        Language language2 = new LanA();
        Sout sout2 = new SoutB();
        logger2.useLanguage(language2);
        logger2.useSout(sout2);
        logger2.create();
    }
}
