package Boletin32;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Barco> RentBoat= new ArrayList<>();

        Barco ll= new Velero("2222", 5, 3);

        RentBoat.add(ll);

        for (Barco rent: RentBoat) {
            System.out.println(rent.getClass()+" "+ rent.calcularPrecio(5));

        }
    }

}
