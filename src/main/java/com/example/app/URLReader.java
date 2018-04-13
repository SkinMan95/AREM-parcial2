/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author 2110137
 */
public class URLReader {

    public static final String BASE_URL = "https://calm-plateau-62657.herokuapp.com";
    
    public static String response(String url) throws Exception {
        StringBuilder res = new StringBuilder();
        URL google = new URL(url);
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(google.openStream()))) {
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                res.append(inputLine);
                //System.out.println(inputLine);
            }
        } catch (IOException x) {
            System.err.println(x);
        }
        
        return res.toString();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
//        List<String> terms = new ArrayList<>(Arrays.asList("/", "/cuadrado?valor=7", "/db"));
//        
//        for (String term : terms) {
//            System.out.println(response(BASE_URL + term));
//        }

        for (int i = 0; i < 20; i++) {
            (new ConcurrentCallThread()).start();
        }
        
    }

}
