package com.bangbangas;

/**
 * ClassName: Person
 * Package: com.bangbangas
 * Description:
 *
 * @Author 王少波
 * @Create 2023/10/9 17:38
 * @Version 1.0
 */
public class Person {
    private String name;
    private int lifeValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) throws NoLifeValueException{
        if (lifeValue < 0)
            throw new NoLifeValueException("生命值不能为负值");
        this.lifeValue = lifeValue;
    }

    public Person(String name, int lifeValue) {
        this.setName(name);
        this.setLifeValue(lifeValue);
    }

    public Person() {
    }
}
