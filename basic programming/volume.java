import java.util.Scanner;

class Volume {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of Earth in kilometers: ");
        double radius = input.nextDouble();

        double pi = 3.14159;

        double volumeKm = (4.0 / 3.0) * pi * radius * radius * radius;
        double volumeMiles = volumeKm * 0.239913;

        System.out.println("The volume of earth in cubic kilometers is " 
                           + volumeKm + 
                           " and cubic miles is " + volumeMiles);
    }
}