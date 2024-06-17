import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

         TransporteAereo transporteAereo = new TransporteAereo("parcial.json");
         transporteAereo.ShowJson();

    //   List<Aeropuertos> a = transporteAereo.listaPorCapacidad(30);

        System.out.println("CAPACIDAD:");

       transporteAereo.listaPorCapacidad(30);
       transporteAereo.ShowListPorCap();

        System.out.println("------------------------");
        ArrayPyT arrayPyT = new ArrayPyT();

        List<Aeropuertos> aeropuertos = transporteAereo.getAlist();

        System.out.println(" AGREGAR ");
        for (Aeropuertos aereo : aeropuertos){
            arrayPyT.agregar(aereo.getEtiquetas());
            arrayPyT.agregar(aereo.GetPilotos());
        }

        arrayPyT.ShouList();
        System.out.println(" ELIMINAR ");
        arrayPyT.eliminar("Workman Solis");
        arrayPyT.ShouList();
        System.out.println(" RECUPERAR ");
        System.out.println(arrayPyT.recuperar(0));

        System.out.println(" PASAR List a HashMap ");
        System.out.println(arrayPyT.HashSetTags());

        Aviones avion1 = new Aviones(6," Matias", 40);
        transporteAereo.AgregarAvion( avion1, "JIMBIES");

    }
}