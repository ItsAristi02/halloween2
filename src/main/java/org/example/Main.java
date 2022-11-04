package org.example;

import jdk.swing.interop.SwingInterOpUtils;
import org.example.clasesHalloween.Fiesta;
import org.example.clasesHalloween.Invitado;
import org.example.clasesHalloween.Lugar;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner entradaPorTeclado = new Scanner(System.in);
        Invitado objetoInvitado = new Invitado();
        Lugar objetoLugar = new Lugar();
        Fiesta objetoFiesta = new Fiesta();

        System.out.println("FIESTA");

        System.out.println("1. Gastos de comida: ");
        objetoFiesta.setCostosAlimentos(entradaPorTeclado.nextDouble());
        System.out.println("El costo de los alimento fue: "+objetoFiesta.getCostosAlimentos());

        System.out.println("2. Gastos de bebidas: ");
        objetoFiesta.setCostosBebidas(entradaPorTeclado.nextDouble());
        System.out.println("El costo de las bebidas fue: "+objetoFiesta.getCostosBebidas());

        System.out.println("3. Gastos de lugar: ");
        objetoFiesta.setCostosLugar(entradaPorTeclado.nextDouble());
        System.out.println("El costo de las bebidas fue: "+objetoFiesta.getCostosLugar());

        System.out.println("4. Gastos de equipos: ");
        objetoFiesta.setCostosEquipos(entradaPorTeclado.nextDouble());
        System.out.println("El costo de las bebidas fue: "+objetoFiesta.getCostosEquipos());



    }
}