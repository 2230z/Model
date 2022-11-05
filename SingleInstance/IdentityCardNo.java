package SingleInstance;

import java.util.ArrayList;
import java.util.List;

public class IdentityCardNo {
    private static List<IdentityCardNo> lists = new ArrayList<>(3);
    private static Integer length = 3;
    private static Integer nowLen = 0;
    private static List<String> nos = new ArrayList<>(3);
    private IdentityCardNo() { }
    public static IdentityCardNo getInstance(int i) {
         IdentityCardNo card = null;
         if(i <= nowLen && i > 0){
             card = lists.get(i);
         }
         else if(i > nowLen && i<= length) {
             for(int j=nowLen+1; j<=i; j++) {
                 card = new IdentityCardNo();
                 lists.add(card);
                 setNo(j-1);
             }
         }
         else System.out.println("做多生成3个实例");
         return card;
    }
    private static void setNo(int index){
         String no = "";
        for(int i=0; i<14; i++){
            no += (int)Math.ceil(Math.random()*9);
        }
        nos.add(no);
    }
    public String getNo(int index) {
        return nos.get(index-1);
    }


}
