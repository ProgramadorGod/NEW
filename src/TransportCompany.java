import java.util.ArrayList;
import java.util.Scanner;


public class TransportCompany {
    public static class IDGenerator{
        private static int ID = 0 ;

        public static int GetID(){
            return ID++;
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        IDGenerator visaje = new IDGenerator();
        Scanner in = new Scanner(System.in);
        ArrayList<String> Vehicles = new ArrayList<>();
        ArrayList<ArrayList<String>> Trucks = new ArrayList<>();
        ArrayList<ArrayList<String>> Vans = new ArrayList<>();
        ArrayList<ArrayList<String>> Cars = new ArrayList<>();
        System.out.println("This is a Vehicles Creator Software of 'Zephyr Motors Company'");
        while (true){
            System.out.println("\nSelect: ");
            System.out.println("1. Add Vehicle. ");
            System.out.println("2. Check Vehicles List. ");
            System.out.println("3. Delete Vehicle. ");
            System.out.println("4. Update Vehicle. ");
            System.out.println("5. Exit the program");
            int Selection = 0;
            while (true){
                try {
                    Selection = in.nextInt();
                    break;
                }catch (Exception e){
                    System.out.print("Try again with a valid option : ");
                    in.nextLine();  //clean the buffer
                }
            }
            switch (Selection){
                case 1:
                    int Option = 0;
                    System.out.println("Please choose an option: ");
                    System.out.println("1. Truck");
                    System.out.println("2. Van");
                    System.out.println("3. Car");
                    while (true) {
                        try {
                            Option = in.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.print("Try again with a valid option : ");
                            in.nextLine();  //clean the buffer
                        }
                    }
                    switch (Option){
                        case 1:
                            Truck a = new Truck();
                            ArrayList<String> aid = a.TruckSet();
                            aid.add(" ID :"+ String.valueOf(visaje.GetID()));
                            Trucks.add(aid);


                            break;

                        case 2:
                            Van b = new Van();
                            ArrayList<String> axd = b.VanSet();
                            axd.add(" ID :"+ String.valueOf(visaje.GetID()));
                            Vans.add(axd);
                            break;

                        case 3:
                            Car c = new Car();
                            ArrayList<String> xddd = c.CarSet();
                            xddd.add(" ID :"+ String.valueOf(visaje.GetID()));
                            Cars.add(xddd);
                            break;

                        default:
                            System.out.println("Try again with a valid option.");
                            break;
                    }
                    break;
                case 2:
                    int TrucksMount = Trucks.size();
                    System.out.print("Trucks: ");

                    System.out.println(TrucksMount);
                    System.out.println(Trucks);

                    int VansMount = Vans.size();
                    System.out.print("Vans: ");

                    System.out.println(VansMount);
                    System.out.println(Vans);

                    int CarsMount = Cars.size();
                    System.out.print("Cars: ");

                    System.out.println(CarsMount);
                    System.out.println(Cars);
                    break;

                case 3:
                    boolean done = false;
                    System.out. println("What's the ID of the Vehicle ? : ");
                    int Asker = 0;
                    try {
                        Asker = in.nextInt();
                    }catch (Exception e){
                        System.out.println("We couldn't find the Vehicle. Try again later with a valid ID...");
                    }

                    for (int i = 0; i < Cars.size(); i++) {
                        String ae = Cars.get(i).get(Cars.get(i).size()-1);
                        String aefinal = ae.substring(ae.length()-1);

                        if(Integer.parseInt(aefinal) == Asker){
                            Cars.remove(Cars.get(i));
                            System.out.println("Car removed successfully.");
                            done = true;
                        }

                    }

                    for (int i = 0; i < Vans.size(); i++) {
                        String ae = Vans.get(i).get(Vans.get(i).size()-1);
                        String aefinal = ae.substring(ae.length()-1);

                        if(Integer.parseInt(aefinal) == Asker){
                            Vans.remove(Vans.get(i));
                            System.out.println("Car removed successfully.");
                            done = true;
                        }

                    }

                    for (int i = 0; i < Trucks.size(); i++) {
                        String ae = Trucks.get(i).get(Trucks.get(i).size()-1);
                        String aefinal = ae.substring(ae.length()-1);

                        if(Integer.parseInt(aefinal) == Asker){
                            Trucks.remove(Trucks.get(i));
                            System.out.println("Car removed successfully.");
                            done = true;
                        }
                    }
                    if(done == false){
                        System.out.println("We couldn't find the Vehicle. Try again later with a valid ID...");
                    }

                    break;


                case 4:
                    done = false;
                    System.out. println("What's the ID of the Vehicle ? : ");
                    Asker = 0;
                    try {
                        Asker = in.nextInt();
                    }catch (Exception e){
                        System.out.println("We couldn't find the Vehicle. Try again later with a valid ID...");
                    }

                    for (int i = 0; i < Cars.size(); i++) {
                        String ae = Cars.get(i).get(Cars.get(i).size()-1);
                        String aefinal = ae.substring(ae.length()-1);

                        if(Integer.parseInt(aefinal) == Asker){
                            //updater
                            Car c = new Car();
                            ArrayList<String> xddd = c.CarSet();
                            xddd.add(" ID :"+ String.valueOf(Asker));
                            Cars.set(i,xddd);
                            System.out.println("Car updated successfully");

                            done = true;
                        }

                    }

                    for (int i = 0; i < Vans.size(); i++) {
                        String ae = Vans.get(i).get(Vans.get(i).size()-1);
                        String aefinal = ae.substring(ae.length()-1);

                        if(Integer.parseInt(aefinal) == Asker){
                            //updater
                            Van c = new Van();
                            ArrayList<String> xddd = c.VanSet();
                            xddd.add(" ID :"+ String.valueOf(Asker));
                            Vans.set(i,xddd);
                            System.out.println("Car updated successfully");


                            done = true;
                        }

                    }

                    for (int i = 0; i < Trucks.size(); i++) {
                        String ae = Trucks.get(i).get(Trucks.get(i).size()-1);
                        String aefinal = ae.substring(ae.length()-1);

                        if(Integer.parseInt(aefinal) == Asker){
                            //updater
                            Truck c = new Truck();
                            ArrayList<String> xddd = c.TruckSet();
                            xddd.add(" ID :"+ String.valueOf(Asker));
                            Trucks.set(i,xddd);
                            System.out.println("Car updated successfully");
                            done = true;
                        }
                    }
                    if(done == false){
                        System.out.println("We couldn't find the Vehicle. Try again later with a valid ID...");
                    }


                    break;


                case 5:

                    

                    break;



                default:
                    System.out.println("Thanks by use 'Zephyr Motors Company', we expect you've got a great experience.");
                    System.out.println("Closing...");
                    System.exit(0);
            }
        }
    }
}