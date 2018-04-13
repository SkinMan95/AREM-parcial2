/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.app;

import java.util.Random;

/**
 *
 * @author 2110137
 */
public class ConcurrentCallThread extends Thread {
    
    private static int idStatic = 0;
    private int id;
    
    public ConcurrentCallThread() {
        this.id = idStatic++;
    }
    
    @Override
    public void run() {
        try {
            int val = Math.max((new Random()).nextInt(1000), 1);
            System.out.println("[" + id + "] Probando con valor: " + val);
            System.out.println("[" + id +"] " + URLReader.response(URLReader.BASE_URL + "/cuadrado?valor=" + val));
        } catch (Exception ex) {
            System.err.println("Error: " + ex);
        }
    }
    
}
