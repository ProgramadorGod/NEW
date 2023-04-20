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
            System.out.println("4. Exit the program");
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
                    int TrucksMount = 0;
                    System.out.print("Trucks: ");
                    for (int i = 0; i < Trucks.size(); i++) {
                        TrucksMount += 1;
                    }
                    System.out.println(TrucksMount);
                    System.out.println(Trucks);

                    int VansMount = 0;
                    System.out.print("Vans: ");
                    for (int i = 0; i < Vans.size(); i++) {
                        VansMount += 1;
                    }
                    System.out.println(VansMount);
                    System.out.println(Vans);

                    int CarsMount = 0;
                    System.out.print("Cars: ");
                    for (int i = 0; i < Cars.size(); i++) {
                        CarsMount += 1;
                    }
                    System.out.println(CarsMount);
                    System.out.println(Cars);
                    break;

                case 3:
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
                        }

                    }

                    for (int i = 0; i < Vans.size(); i++) {
                        String ae = Vans.get(i).get(Vans.get(i).size()-1);
                        String aefinal = ae.substring(ae.length()-1);

                        if(Integer.parseInt(aefinal) == Asker){
                            Vans.remove(Vans.get(i));
                            System.out.println("Car removed successfully.");
                        }

                    }

                    for (int i = 0; i < Trucks.size(); i++) {
                        String ae = Trucks.get(i).get(Trucks.get(i).size()-1);
                        String aefinal = ae.substring(ae.length()-1);

                        if(Integer.parseInt(aefinal) == Asker){
                            Trucks.remove(Trucks.get(i));
                            System.out.println("Car removed successfully.");
                        }

                    }


                    break;

                default:
                    System.out.println("Thanks by use 'Zephyr Motors Company', we expect you've got a great experience.");
                    System.out.println("Closing...");
                    System.exit(0);

            }
        }
    }
}