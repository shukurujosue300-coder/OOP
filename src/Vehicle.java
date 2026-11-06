import java.util.LinkedList;
import java.util.List;

public class Vehicle{
    int id;
    String name;
    String modal;
    int seat;
    List<Vehicle> ls = new LinkedList<>();//you cant create object of an abstract class.  correction type
    //constructor chaining
    public Vehicle(int id, String name, String modal, int seat) {
        this.id = id;
        this.name = name;
        this.modal = modal;
        this.seat = seat;
    }
    public Vehicle() {
    }
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getModal() {
        return modal;
    }
    public void setModal(String modal) {
        this.modal = modal;
    }
    public int getSeat() {
        return seat;
    }
    public void setSeat(int seat) {
        this.seat = seat;
    }
    public void display(){
        for (Vehicle v : ls)//for (int i = 0; i<ls.size();i++){}
            {
                System.out.println("Car Id:" + v.getId());
                System.out.println("Name:" + v.getName());
                System.out.println("type:" + v.getClass().getSimpleName());
        }
    }
    public void save(){

    }
    
}