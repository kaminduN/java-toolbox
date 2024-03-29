package com.demo.j8.streams;

public class StaffPublic {

    @Override
    public String toString() {
        return "StaffPublic [age=" + age + ", extra=" + extra + ", name=" + name + "]";
    }
    
    private String name;
    private int age;
    private String extra;

    
    public StaffPublic(String name, int age, String extra) {
        this.name = name;
        this.age = age;
        this.extra = extra;
    }

    public StaffPublic() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getExtra() {
        return extra;
    }
    public void setExtra(String extra) {
        this.extra = extra;
    }


    
}