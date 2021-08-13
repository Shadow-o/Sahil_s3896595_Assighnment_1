

import java.util.Scanner; //defines scanner


public class Assighnment1 {


    public static double celsiusToFahrenheit(double DegreeCelsius) {     //Code to convert Celsius to Fahrenheit
        return 9 * DegreeCelsius / 5 + 32;              // Calculation from degree to celsius
    }

    public static double fahrenheitToCelsius(double DegreeFahrenheit) {     // Code to convert to Fahrenheit To Celsius
        return 5 * (DegreeFahrenheit - 32) / 9;                       //Degree from Fahrenheit to Celsius
    }



    public static void init(){                          //Defines the Variables
        Scanner scan = new Scanner(System.in);
        double result;                                  //Input type
        char quit= 'z';                                 //Input type
        char type;                                      //Input type


        while (quit!='q' && quit!='Q')                 //defines the letter to quit
        {
            System.out.println("Please enter the temperature (e.g. 10 C or 20 F:)");    //Tells the user how and what should be outputted
            double degree = scan.nextDouble(); //read value from user


            type = scan.next().charAt(0); //reads next variable

            if(type!='c' && type!='C' & type!='f' && type!='F')        //Lets the user type in a degree freely so if they want the can type with a lowercase or uppercase
            {
                System.out.println("Please Enter a valid Degree!"); //asks the user to enter a valid degree
                System.out.println("Please enter a valid selection (Type C for celsius and F for fahrenheit"); //Tells the user what they should type
                type = scan.next().charAt(0);
            }
            if (type == 'F' || type =='f') //Type uppercase or lowercase for the letter F allows the user to type either
            {
                result = fahrenheitToCelsius(degree);
                System.out.println("The conversion of "+ degree+"°F "+ "to Celsius is: " + result + "°C");//reveals result for Farenheit ot Celcius

            }
            if (type == 'C' || type =='c') //Type uppercase or lowercase for the letter C allows the user to type either
            {
                result = celsiusToFahrenheit(degree);
                System.out.println("The conversion of "+ degree+"°C "+ "to Fahrenheit is: " + result + "°F"); //Reveals the result for Celsius to farenheit
            }


            System.out.println("To Quit Type the letter q to contiune conversion type any letter:"); //Tells the user on how to quit a program
            quit = scan.next().charAt(0);
        }
        scan.close();
    }

    public static void main(String[] args)
    {
        init();
    }


}
