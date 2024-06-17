import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.beans.Customizer;
import java.io.File;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.List;

public class TransporteAereo {

    private String pathname;

    List<Aeropuertos> Alist = new ArrayList<>();
    List<Aeropuertos> listCapacidad = new ArrayList<>();

    public TransporteAereo(String pathname) {
        this.pathname = pathname;
      //  this.LeerJson();  // levanta json y guarda en lista

    }

    private void LeerJson() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Alist = mapper.readValue(new File(this.pathname), new TypeReference<List<Aeropuertos>>() {
            });

        } catch (StreamReadException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private void guardarEnJson() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File(this.pathname), Alist);
        } catch (StreamWriteException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ShowJson() {
        System.out.println(Alist);

    }
//2. De la lista anterior de aeropuertos generar otra lista pasando los aeropuertos
//cuya capacidad sea mayor a una enviada por parámetro. Cuando la capacidad sea
//menor o igual a la enviada, lanzar una excepción custom almacenando la capacidad
//del aeropuerto.


    public void listaPorCapacidad(Integer capacidad) {

        List<Integer> cap = new ArrayList<>();
        try {
            for (Aeropuertos aeropuertos : Alist) {
                if (aeropuertos.getCapacidad() > capacidad) {
                    listCapacidad.add(aeropuertos);
                } else {
                    cap.add(aeropuertos.getCapacidad());
                }
            }
            if (cap.size() >= 0) {

                throw new IllegalArgumentException("la capacidad es: " + cap);
            }

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public void ShowListPorCap() {
        for (Aeropuertos a : listCapacidad) {

            System.out.println(a.ToStringName());
        }
    }

    public List<Aeropuertos> getAlist() {
       this.LeerJson();
        return Alist;
    }

    public void AgregarAvion(Aviones avion, String nombreAeropuerto) {
        try {
            for (Aeropuertos a : Alist) {
                if (a.getNombre().trim().equals(nombreAeropuerto.trim())) {
                    a.getAviones().add(avion);
                } else {
                    throw new InvalidObjectException(" no exist ese aeropuerto ");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            guardarEnJson();
        }


    }
}
