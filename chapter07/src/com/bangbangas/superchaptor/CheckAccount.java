package com.bangbangas.superchaptor;

/**
 * ClassName: CheckAccount
 * Package: com.bangbangas.superchaptor
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/14 10:41
 * @Version 1.0
 */
public class CheckAccount extends Account {
    private double overdraft;
    public CheckAccount(int id, double balance, double annuallnterestRate,double overdraft) {
        super(id, balance, annuallnterestRate);
        this.overdraft=overdraft;
    }

    @Override
    public void withdraw(double amount) {
//        如果（取款金额<账户余额），
//        可直接取款
//        如果（取款金额>账户余额），
//        计算需要透支的额度
//        判断可透支额overdraft是否足够支付本次透支需要，如果可以
//        将账户余额修改为0，冲减可透支金额
//                如果不可以
//        提示用户超过可透支额的限额
        if(amount<=this.getBalance()){
            this.balance-=amount;
        }else{
            double amount_tmp = amount-this.getBalance();
            if(amount_tmp<=this.overdraft){
               this.setBalance(0);
               this.overdraft-=amount_tmp;
            }else{
                System.out.println("超过可透支额的限额");
            }

        }

    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}
