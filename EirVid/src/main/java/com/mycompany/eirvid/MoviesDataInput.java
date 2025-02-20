/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eirvid;

import Interfaces.MoviesDataInputInterface;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diese
 */
public class MoviesDataInput implements MoviesDataInputInterface {
    BufferedReader myReader;
    String fileName = "C:\\Diesel\\2 - AADP\\AAPD-OOAD-CA\\AAPD-OOAD-CA\\EirVid\\input\\Movie_Metadata_Edited_2.csv";
    public MoviesDataInput() throws FileNotFoundException, IOException {
        this.myReader = new BufferedReader(new FileReader(fileName));
    }
    
    @Override
    public List<String> ReadMoviesData() throws FileNotFoundException, IOException {
        List<String> movieData = new ArrayList<>();
        String inputLine = myReader.readLine();
        while ((inputLine = myReader.readLine()) != null) {
            movieData.add(inputLine);
        }
        return movieData;
    }
}
