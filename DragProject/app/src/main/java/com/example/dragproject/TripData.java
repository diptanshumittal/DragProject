package com.example.dragproject;

public class TripData {
    private String data ;
    TripData(int i){
        if(i==0){
            data = "Payment Successfull";
        }
        else if(i==1){
            data = "Payment in progress";
        }
        else{
            data = "Payment failed";
        }
    }

    public String getData() {
        return data;
    }
}
