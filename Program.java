//Dynamic Polymorphism : overriding

abstract class Doctor{
    abstract void treatPatient();
}

class Physician extends Doctor{
    void treatPatient(){
        System.out.println("Hi! I am Physician \nI Treat Patients using Medicines.");
    }
}

class Surgeon extends Doctor{
    void treatPatient() {
        System.out.println("Hi! I am Surgeon \nI Treat Patients using Surgery.");
    }
}

class Dentist extends Doctor{
    void treatPatient() {
        System.out.println("Hi! I am Dentist \nI Treat patients Teeth");
    }

}
public class Program {

    public static void main(String[] args) {
        System.out.println("Hi! I am Lucky! Receptionist at Max Care");
        System.out.println("Who are you looking for");
        System.out.println("Press 1. Physician\2. Surgeon\3. Dentist");

        int choice = new java.util.Scanner(System.in).nextInt();

        Doctor doc= null;

        switch(choice) {
        
        case1:
            doc= new Physician();
            break;

        case2:
            doc= new Surgeon();
            break;

        case3:
            doc= new Dentist();
            break;

        default:
            System.out.println("A Oh! Invalid Choice ");
            break;
        }

        if (choice<0 || choice>3) {
            System.exit(0);
        }
        else {
            doc.treatPatient();
        }
    }

}