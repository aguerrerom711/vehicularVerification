/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.ipn.cidetec.model;

/**
 *
 * @author andres
 */
public class Ticket {
    
    private String color;
    private char lastDigit;
    private String period;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getLastDigit() {
        return lastDigit;
    }

    public void setLastDigit(char lastDigit) {
        this.lastDigit = lastDigit;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
    
    
    
    
    
}
