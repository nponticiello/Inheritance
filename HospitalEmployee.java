public class HospitalEmployee {

    protected String name;
    protected int number;

    public HospitalEmployee(){}

    public HospitalEmployee(String names,int numbers)
    {
        name = names;
        number = numbers;
    }

    public String getName()
    {
        return name;
    }

    public int getNumber()
    {
        return number;
    }

    public void work()
    {

        System.out.println(name + " works for the hospital.");
    }

    public String toString()
    {

        return "Their is is " + name + " and number is " + number;
    }

}