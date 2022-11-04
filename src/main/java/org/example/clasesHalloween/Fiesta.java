package org.example.clasesHalloween;

public class Fiesta {
    //ATRIBUTOS
    private String fecha;
    private double costosAlimentos;
    private double costosBebidas;
    private double costosLugar;
    private double costosEquipos;
    private final double VALORENTRADA=50000;

    // CONSTRUCTOR

    public Fiesta() {

    }

    public Fiesta(String fecha, double costosAlimentos, double costosBebidas, double costosLugar, double costosEquipos) {
        this.fecha = fecha;
        this.costosAlimentos = costosAlimentos;
        this.costosBebidas = costosBebidas;
        this.costosLugar = costosLugar;
        this.costosEquipos = costosEquipos;
    }

//METODOS DE ENCAPSULADO
    //(PARA ACCEDER A MODIFICARO A MOSTRAR NUETROS ATRIBUTOS PRIVADOS)

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getCostosAlimentos() {
        return costosAlimentos;
    }

    public void setCostosAlimentos(double costosAlimentos) {

        if (costosAlimentos>0){
            this.costosAlimentos = costosAlimentos;
        }else {
            this.costosAlimentos=0;
            System.out.println("No aceptamos valores negativos");
        }

    }

    public double getCostosBebidas() {
        return costosBebidas;
    }

    public void setCostosBebidas(double costosBebidas) {
        if (costosBebidas>0){
            this.costosBebidas = costosBebidas;
        }else {
            this.costosBebidas=0;
            System.out.println("No aceptamos valores negativos");
        }
    }

    public double getCostosLugar() {
        return costosLugar;
    }

    public void setCostosLugar(double costosLugar) {
        if (costosLugar>0){
            this.costosLugar = costosLugar;
        }else {
            this.costosLugar=0;
            System.out.println("No aceptamos valores negativos");
        }
    }

    public double getCostosEquipos() {
        return costosEquipos;
    }

    public void setCostosEquipos(double costosEquipos) {
        if (costosEquipos>0){
            this.costosEquipos = costosEquipos;
        }else {
            this.costosEquipos=0;
            System.out.println("No aceptamos valores negativos");
        }
    }


    

    //METODOS

    public void mostrarFiesta(){
        System.out.println("Fecha: "+this.fecha);

    }

    public double calcularCostos(){
      return (this.costosAlimentos+this.costosBebidas+this.costosLugar+this.costosEquipos);
    }
}
