import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aeropuertos implements Serializable {

    private String _id ;
    private boolean activo ;
    private String balance;
    private String imagen;
    private Integer capacidad;
    private String nombre;
    private String email;
    private String phone;
    private String direccion;
    private String acerca;
    private String fecha_inicio;
    private Double latitud;
    private Double longitud;
    private List<Etiqueta> etiquetas;

    private List<Aviones> aviones = new ArrayList<>();
    public Aeropuertos() {
    }

    public Aeropuertos(String _id,boolean activo, String balance, String imagen, Integer capacidad, String nombre, String email, String phone, String direccion, String acerca, String fecha_inicio, Double latitud, Double longitud, List<Etiqueta> etiquetas, List<Aviones> aviones) {
        this._id = _id;
        this.activo = activo;
        this.balance = balance;
        this.imagen = imagen;
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.email = email;
        this.phone = phone;
        this.direccion = direccion;
        this.acerca = acerca;
        this.fecha_inicio = fecha_inicio;
        this.latitud = latitud;
        this.longitud = longitud;
        this.etiquetas = etiquetas;
        this.aviones = aviones;
    }


    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAcerca() {
        return acerca;
    }

    public void setAcerca(String acerca) {
        this.acerca = acerca;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public String get_id() {
        return _id;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public List<Etiqueta> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(List<Etiqueta> etiquetas) {
        this.etiquetas = etiquetas;
    }

    public List<Aviones> getAviones() {
        return aviones;
    }

    public void setAviones(List<Aviones> aviones) {
        this.aviones = aviones;
    }

    @Override
    public String toString() {
        return "Aeropuertos{" +
                "id=" + _id +
                ", activo=" + activo +
                ", balance=" + balance +
                ", imagen='" + imagen + '\'' +
                ", capacidad=" + capacidad +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", direccion='" + direccion + '\'' +
                ", acerca='" + acerca + '\'' +
                ", fecha_inicio=" + fecha_inicio +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", etiquetas=" + etiquetas +
                ", avionesList=" + aviones +
                '}';
    }

    public String ToStringName (){
        return (" Nombre de aeropuerto: " + this.nombre + " Capacidad: "+ getCapacidad());

    }

    public List<String>GetPilotos (){
        List <String> pilotos= new ArrayList<>();
        for (Aviones a : this.getAviones()){
            pilotos.add(a.getPiloto());
        }
        return pilotos;
    }
}
