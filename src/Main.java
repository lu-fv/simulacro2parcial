import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

         TransporteAereo transporteAereo = new TransporteAereo("parcial.json");
        transporteAereo.getAlist();
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

        System.out.println(" PASAR List a HashSet ");
        System.out.println(arrayPyT.HashSetTags());

        System.out.println( " se agrega piloto ");
        Aviones avion2 = new Aviones(3,"Lucia", 31);
        transporteAereo.AgregarAvion( avion2, "JIMBIES");
        Aviones avion1 = new Aviones(3,"Matias", 30);
        transporteAereo.AgregarAvion( avion1, "AVIT");
       // transporteAereo.ShowJson();

        transporteAereo.SearchAeroport( "RAMJOB ");

    }
}