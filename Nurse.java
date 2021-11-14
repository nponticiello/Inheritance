public class Nurse extends HospitalEmployee{

    protected int numOfPatients;


    public Nurse(String name, int number, int numOfPatients){
        super(name,number);
        this.numOfPatients = numOfPatients;
    }

    public String toString()
    {

        return "Their is is " + name + "t hey have " + numOfPatients + " patients";
    }

    public void work()
    {

        System.out.println("Your nurses name is " + name);
    }
}