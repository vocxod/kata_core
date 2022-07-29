/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ru.odybo.universal;

/**
 *
 * @author vragos
 */
public class MonitorsByProgrammers {

    /*
    Требования:
    1) Сигнатура метода содержит только примитивные типы размерностью в 32 бита
    2) Название метода должно быть drawisMonitorsCounter
    3) Метод должен быть виден из любого пакета
    4) Сигнатура метода должна быть: drawisMonitorsCounter(int monitors, int programmers)
    */
    public static int drawisMonitorsCounter(int monitors, int programmers) {
        int iResult = 0;
        iResult = monitors % programmers;
        return iResult;
    }

    
}
