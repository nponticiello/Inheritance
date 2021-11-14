public class Surgeon extends Doctor{

    protected boolean operating;

    public Surgeon(){

    }
    public Surgeon(String name, int number,String speciality,Boolean operating){
        super(name, number, speciality );
        this.operating = operating;
    }

    public String toString()
    {

        return "Their is is" + name + "their speciality is " + speciality + " is operating " + operating;
    }

    public void work()
    {

        System.out.println("The surgeons name is " + name +"." );
    }




}
