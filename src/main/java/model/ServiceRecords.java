/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Ariel
 */
public class ServiceRecords {
    
    private ArrayList<CarService> records;
    
    public ServiceRecords ( ) {
        this.records = new ArrayList<CarService>();
    }

    public ArrayList<CarService> getRecords() {
        return records;
    }

    public void setRecords(ArrayList<CarService> records) {
        this.records = records;
    }
    
    public CarService addNewRecords(){
        CarService newCars = new CarService();
        records.add(newCars);
        return newCars;
    }
    
    public void deleteRecords(CarService cs){
        records.remove(cs);
    }
    
}
