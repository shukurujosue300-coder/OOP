import java.util.*;
public class Truck extends Vehicle{

    

    public Truck() {
        //this.loadSize = loadSize;
    }

    private String loadSize;


    public String getLoadSize() {
        return loadSize;
    }

    public void setLoadSize(String loadSize) {
        this.loadSize = loadSize;
    }
    //constructor chaining
    public Truck(int id, String name, String modal, int seat, String loadSize) {
        super(id, name, modal, seat);
        this.loadSize = loadSize;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        super.display();
        //System.out.println("Type: Truck");

    }



    @Override
    public void save() {
        Scanner sc = new Scanner(System.in);
        // TODO Auto-generated method stub
        System.out.println("Enter id");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name");
        String name = sc.nextLine();
         System.out.println("Enter modal");
        String modal = sc.nextLine();
         System.out.println("Enter seat");
        int seat = sc.nextInt();
        sc.nextLine();
            System.out.println("Enter loadSize");
        String loadSize = sc.nextLine();

        
        //Truck v = new Truck(id, name, modal, id, loadSize);
        Vehicle v = new Truck(id, name, modal, seat, loadSize);
        ls.add(v);
    }

    
    
}
