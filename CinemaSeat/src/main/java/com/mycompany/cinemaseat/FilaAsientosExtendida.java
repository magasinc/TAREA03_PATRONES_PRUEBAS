/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinemaseat;

/**
 *
 * @author mateo
 */
import java.util.ArrayList;
import java.util.List;

public class FilaAsientosExtendida extends FilaAsientos {
    private List<Asiento> asientos;

    public FilaAsientosExtendida() {
        super();
        this.asientos = new ArrayList<>();
    }

    public void agregarAsiento(Asiento asiento) {
        super.agregar(asiento);      // OK porque Asiento implementa ElementoSala
        asientos.add(asiento);       // También lo agregas a tu propia lista
    }

    public boolean hayAsientosDisponibles() {
        for (Asiento a : asientos) {
            if (a.estaDisponible()) return true;
        }
        return false;
    }

    @Override
    public void mostrar() {
        for (Asiento a : asientos) {
            a.mostrar();
        }
    }
}