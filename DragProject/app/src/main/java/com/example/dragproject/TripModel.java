package com.example.dragproject;

import androidx.lifecycle.ViewModel;

import java.util.List;

public class TripModel extends ViewModel {
    private List<TripData> cards ;

    TripModel(){
        for(int i=0 ; i<3 ; i++){
            TripData data = new TripData(i);
            cards.add(data);
        }
    }

    public List<TripData> getCards() {
        return cards;
    }
}
