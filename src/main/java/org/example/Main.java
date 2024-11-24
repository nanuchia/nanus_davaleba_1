package org.example;

public class Main {
    public static void main(String[] args) {

//        evenOddTask();
//        While();
//        Length();
//        checkNumber(1);
//        hasTeen(11,10,12);
    }

        static void evenOddTask(){

            int [] numbers = {1, 3, 5, 7, 9, 11, 13};
            int evenNumber = 0 ;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 ==0 ) {
                    evenNumber++;
                }
            }

            if (evenNumber == 0 ) {
                System.out.println("მასივში არ არის ლუწი რიცხვი");
            }

            else {
                System.out.println("მასივში არის " + evenNumber + " ლუწი რიცხვი");
            }
        }

        static void While(){

            String s = "nanuka ar aris zoro";

            int i =0 ;

            while (i < s.length()){
                System.out.println(s.charAt(i));
                i = i +3;

                if(s.charAt(i) == 'z'){
                    break;
                }
            }

        }

        static void Length(){
            String strikoni = "შვებულება მინდა";
            int length = strikoni.length();

            if (length % 2 == 0 ) {
                System.out.println("სტრიქონის სიგრძე ლუწია");
            }
            else {
                System.out.println("სტრიქონის სიგრძე კენტია");
            }
        }

        static void checkNumber(int number){

            if (number > 0) {
                System.out.println("დადებითი");
            } else if (number < 0) {
                System.out.println("უარყოფითი");
            } else {
                System.out.println("ნული");
            }



        }

         static void hasTeen(int a, int b, int c) {
            if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            System.out.println("True");
            } else {
            System.out.println("False");
        }
    }

}