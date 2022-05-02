package programa05proyectopoo;

import javax.swing.JOptionPane;

public class PROGRAMA05ProyectoPoo {

    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("ismael", "santiago", 10, 1000.0);
        ///object2
        Cuenta cuenta02 = new Cuenta();
        cuenta02.setApellido("Santiago");
        cuenta02.setNombre("Ismael");
        cuenta02.setEdad(23);
        cuenta02.setCantidad(4000);

        System.out.println(cuenta02.getApellido()+cuenta02.getNombre()+cuenta02.getEdad());
                

    }

}
