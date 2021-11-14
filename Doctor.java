public class Doctor extends HospitalEmployee{

    protected String speciality;

    public Doctor(){

    }

    public Doctor(String name,int number, String speciality){
        super(name,number);
        this.speciality = speciality;
    }

    public String toString()
    {

        return "Their is is " + name + "their speciality is " + speciality;
    }

    public void work()
    {

        System.out.println("Your doctors name is " + name);
    }
}