package com.bangbangas.extend;

/**
 * ClassName: Kids
 * Package: com.bangbangas.extend
 * Description:
 *
 * @Author 王少波
 * @Create 2023/9/12 16:02
 * @Version 1.0
 */

public class KidsTest{
    public static void main(String[] args) {
        Kids kids = new Kids();
        kids.setYearsOld(10);
        kids.getYearsOld();
    }
}

class Kids extends ManKind{
    private int yearsOld;

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    @Override
    public ManKind employeed() {
        System.out.println("重写父类方法");
        return null;
    }

    public void employeed(int a ) {
        System.out.println("重写父类方法");
    }
}
