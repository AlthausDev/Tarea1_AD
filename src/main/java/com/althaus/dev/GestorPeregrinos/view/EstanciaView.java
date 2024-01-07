package com.althaus.dev.GestorPeregrinos.view;

import com.althaus.dev.GestorPeregrinos.model.Estancia;

import java.time.LocalDate;
import java.util.List;

public class EstanciaView {

    public void mostrarEstancias(List<Estancia> estancias, long idParada, LocalDate fechaInicio, LocalDate fechaFin) {
        if (estancias.isEmpty()) {
            System.out.println("No hay estancias en el rango de fechas especificado para la parada.");
            return;
        }

        System.out.println("Datos:");
        System.out.println("Parada ID: " + idParada);
        System.out.println("Rango de fechas: " + fechaInicio + " - " + fechaFin);

        for (Estancia estancia : estancias) {
            System.out.println("ID Estancia: " + estancia.getId());
            System.out.println("Nombre Peregrino: " + estancia.getPeregrino().getNombre());
            System.out.println("Fecha: " + estancia.getFecha());
            System.out.println("VIP: " + (estancia.getVip() ? "S" : "N"));
            System.out.println();
        }

        System.out.println("Datos exportados correctamente.");
    }
}
