package Exam;

public class Numbers {
    public void happyTicket(String number){
        String str = number;
        String firstChar = str.substring(0,1);
        String secondChar = str.substring(1,2);
        String thirdChar = str.substring(2,3);
        String fourthChar = str.substring(3,4);
        String fifthChar = str.substring(4,5);
        String sixthChar = str.substring(5,6);

        int intForFirstChar = Integer.parseInt(firstChar);
        int intForSecondChar = Integer.parseInt(secondChar);
        int intForThirdChar = Integer.parseInt(thirdChar);
        int intForFourthChar = Integer.parseInt(fourthChar);
        int intForFifthChar = Integer.parseInt(fifthChar);
        int intForSixthChar = Integer.parseInt(sixthChar);

        int a = intForFirstChar+intForSecondChar+intForThirdChar;
        int b = intForFourthChar+intForFifthChar+intForSixthChar;

        if (a == b){

            System.out.println("щасливы билет");
        }else{

            System.out.println("попробуй снова");
        }


    }
}
