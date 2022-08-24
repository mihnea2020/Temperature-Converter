import java.util.Scanner;

class Temperature {
    Scanner in = new Scanner(System.in);

    public void enterTemp() {
        float temp = in.nextInt();
    }

    public void celsiusToFahrenheit(int temp) {
        float x = (float)9/5;
        float newTemp;
        newTemp = (temp * x) + 32;
        System.out.println(temp + " Celsius = " + newTemp + " Fahrenheit");
    }

    public void fahrenheitToCelsius(int temp) {
        float x = (float)5/9;
        float newTemp;
        newTemp = (temp - 32) * x;
        System.out.println(temp + " Fahrenheit = " + newTemp + " Celsius");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Temperature temperature = new Temperature();
        int ch;
        int exit;

        do {
            System.out.println("\n1. Enter temperature \n2. Exit");
            exit = in.nextInt();
            switch (exit) {
                case 1:
                    System.out.print("Enter the temperature: ");
                    int temp = in.nextInt();
                    System.out.println("1. Celsius \n2. Fahrenheit \n3. Exit");
                    ch = in.nextInt();
                    switch (ch) {
                        case 1:
                            temperature.celsiusToFahrenheit(temp);
                            break;

                        case 2:
                            temperature.fahrenheitToCelsius(temp);
                            break;
                    }
                    break;

                case 2:
                    break;
            }
        }while(exit!=2);
    }
}