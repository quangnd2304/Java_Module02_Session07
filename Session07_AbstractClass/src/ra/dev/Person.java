package ra.dev;

public abstract class Person {
    private String name;
    private int age;
    private boolean sex;
    private String address;

    public void hello(){
        System.out.println("Xin chao ban");
    }

    public int add(int num1, int num2){
        return num1+num2;
    }

    //Phuong thuc truu tuong
    //Declare
    public abstract void inputData();

    public abstract void displayData();

}
