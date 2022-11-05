package BridgeModel.OperationSystem;


import BridgeModel.Sout.Sout;
import BridgeModel.Video.Language;

public abstract class Logger {

    private Language language;
    private Sout sout;

    public void useLanguage(Language language){
        this.language = language;
    }
    public void useSout(Sout sout){
        this.sout = sout;
    }

    public abstract void useSystem();

    public void create(){
        useSystem();
        language.create();
        sout.create();
    }
}
