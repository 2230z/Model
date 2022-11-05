package ModelMethod;

public abstract class Bank {
    private void selectID(){
        System.out.println("根据账号查询用户信息");
    }
    private void judgeUser(){
        System.out.println("根据用户信息判断用户类型");
    }
    abstract void countBalance();

    public void operation(){
        selectID();
        judgeUser();
        countBalance();
    }
}
