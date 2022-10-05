package ra.dev;

public interface IPerson {
    public static final float BASIC_SALARY = 1300000;
    //Bo tu truy cap la public
    final int A = 10;

    //Phuong thuc truu tuong
    //public abstract void inputData()
    void inputData();
    abstract void displayData();
}
