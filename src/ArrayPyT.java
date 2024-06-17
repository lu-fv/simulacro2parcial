import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


//3. Crear una clase genérica para almacenar tanto los pilotos como los tags en un
//arraylist. Las opciones de esta clase genérica son agregar, eliminar y recuperar según
//posición
public class ArrayPyT<T> {
    private List<T> pilotoYetiquetas = new ArrayList<>();
    private Set<T> hashSetTags = new HashSet<>();

    public void agregar(List<T> tList) {
        for (T t : tList) {
            this.pilotoYetiquetas.add(t);
        }
    }

    public void eliminar(T t) {
        this.pilotoYetiquetas.remove(t);
    }

    public T recuperar(Integer pos) {
        if (this.pilotoYetiquetas.size() >= pos) {
            return this.pilotoYetiquetas.get(pos);
        } else {
            return null;
        }

    }

    @Override
    public String toString() {
        return "ArrayPyT{" +
                "pilotoYetiquetas=" + pilotoYetiquetas +
                '}';
    }

    public void ShouList() {

        System.out.println("PILOTOS Y TAGS " + this.pilotoYetiquetas);
    }

    //4. Desde la lista genérica pasar a un hashset todos los tags. Implementar el
    //equals en la etiqueta

    public Set<T> HashSetTags() {

        //Option 1 compara los tipos de datos utilizando instanceof
        /*for ( T t : pilotoYetiquetas){
            if (t instanceof Etiqueta){
                this.hashSetTags.add(t);
            }
        }*/
        //Option 2 compara con equal la etiqueta de cada enum que tiene
        /*for ( T t : pilotoYetiquetas){
            if (Etiqueta.in.equals(t) || Etiqueta.eu.equals(t) || Etiqueta.est.equals(t) || Etiqueta.duis.equals(t) || Etiqueta.enim.equals(t)  ){
                this.hashSetTags.add(t);
            }
        }*/
        //Option 3 se sobreescribe el metodo equal de la clase generica que compara el tipo con enum
        for ( T t : pilotoYetiquetas){
            if (this.equals(t)){
                this.hashSetTags.add(t);
            }
        }
        return this.hashSetTags;

    }

    //Se sobreescribe el metodo generico comparando el object con el tipo Enum. Si es de tipo enum el object devuelve true sino false
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Enum;
    }
}
