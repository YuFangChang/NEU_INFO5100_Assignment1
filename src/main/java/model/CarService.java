/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.ImageIcon;

/**
 *
 * @author Ariel
 */
public class CarService {

    private String brand;
    private String model;
    private String color;
    private int year;
    private int engineNo;
    private int seatsNum;
    private String licenseplate;
    private String ownerName;
    private String ownerPhone;
    private String ownerEmail;
    private String ownerlicense;
    private int ownerSSN;
    private String ownerAddress;
    private String serviceDate;                 
    private int warrantyYear;
    private ImageIcon photo;                            

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(int engineNo) {
        this.engineNo = engineNo;
    }

    public int getSeatsNum() {
        return seatsNum;
    }

    public void setSeatsNum(int seatsNum) {
        this.seatsNum = seatsNum;
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerPhone() {
        return ownerPhone;
    }

    public void setOwnerPhone(String ownerPhone) {
        this.ownerPhone = ownerPhone;
    }

    public String getOwnerEmail() {
        return ownerEmail;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmail = ownerEmail;
    }

    public String getOwnerlicense() {
        return ownerlicense;
    }

    public void setOwnerlicense(String ownerlicense) {
        this.ownerlicense = ownerlicense;
    }

    public int getOwnerSSN() {
        return ownerSSN;
    }

    public void setOwnerSSN(int ownerSSN) {
        this.ownerSSN = ownerSSN;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }

    public String getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(String serviceDate) {
        this.serviceDate = serviceDate;
    }

    public int getWarrantyYear() {
        return warrantyYear;
    }

    public void setWarrantyYear(int warrantyYear) {
        this.warrantyYear = warrantyYear;
    }

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }


    
    @Override
    public String toString(){
        return serviceDate;
    }
    
}
