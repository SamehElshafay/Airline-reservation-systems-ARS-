/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author sameh
 */
public class Flight {
    private int FlightID ;
    private int PlaneID ;
    private String S_From ;
    private String D_To ;
    private String Time ;
    private String Day ;
    private String Price ;
    
    public int getFlightID() {
        return FlightID;
    }

    public void setFlightID(int FlightID) {
        this.FlightID = FlightID;
    }

    public int getPlaneID() {
        return PlaneID;
    }

    public void setPlaneID(int PlaneID) {
        this.PlaneID = PlaneID;
    }

    public String getS_From() {
        return S_From;
    }

    public void setS_From(String S_From) {
        this.S_From = S_From;
    }

    public String getD_To() {
        return D_To;
    }

    public void setD_To(String D_To) {
        this.D_To = D_To;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String Day) {
        this.Day = Day;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }
}
