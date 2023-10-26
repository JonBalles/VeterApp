package Entidades;

import java.util.ArrayList;

public class Tratamiento {
    
    private int idTratamiento;
    private String tipoDeTratamiento;
    private String descripcion;
    private ArrayList<Medicamento> medicamento;
    private double precio;
    private double importeTotal;
    private boolean activo;

    public Tratamiento() {
    }

    public Tratamiento(int idTratamiento, String tipoDeTratamiento, String descripcion, ArrayList<Medicamento> medicamento, double precio, double importeTotal, boolean activo) {
        this.idTratamiento = idTratamiento;
        this.tipoDeTratamiento = tipoDeTratamiento;
        this.descripcion = descripcion;
        this.medicamento = medicamento;
        this.precio = precio;
        this.importeTotal = importeTotal;
        this.activo = activo;
    }

    public Tratamiento(String tipoDeTratamiento, String descripcion, ArrayList<Medicamento> medicamento, double precio, double importeTotal, boolean activo) {
        this.tipoDeTratamiento = tipoDeTratamiento;
        this.descripcion = descripcion;
        this.medicamento = medicamento;
        this.precio = precio;
        this.importeTotal = importeTotal;
        this.activo = activo;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTRatamiento) {
        this.idTratamiento = idTRatamiento;
    }

    public String getTipoDeTratamiento() {
        return tipoDeTratamiento;
    }

    public void setTipoDeTratamiento(String tipoDeTratamiento) {
        this.tipoDeTratamiento = tipoDeTratamiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Medicamento> getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(ArrayList<Medicamento> medicamento) {
        this.medicamento = medicamento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }


    @Override
    public String toString(){
        return tipoDeTratamiento;
    }
    
    
    public double precioTotal(){
        double total = precio;
        
        for(Medicamento m : medicamento){
            total = total + m.getPrecio();
        }
        
        return total;
    }
    
    public double totalMedicamento(){
        double total = 0;
        
        for(Medicamento m : medicamento){
            total =total + m.getPrecio();
        }
        
        return total;
    }
    
}
