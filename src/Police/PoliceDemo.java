package Police;

public class PoliceDemo {

    void speadtest(int speed, boolean dateOfBirth) {


        if (dateOfBirth == true) {

            if (speed <= 65){

                System.out.println("No Problem");
            }else if (speed >65 && speed <= 85) {
                System.out.println(300);

            }else{
                System.out.println(1000);
            }

        }else{
            if (speed <= 60){

                System.out.println("No Problem");
            }else if (speed >60 && speed <= 80) {
                System.out.println(300);

            }else{
                System.out.println(1000);
            }

        }

    }





}
