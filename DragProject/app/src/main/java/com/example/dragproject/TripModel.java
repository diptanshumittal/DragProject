package com.example.dragproject;
import android.util.Log;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;
public class TripModel extends ViewModel {
    private ArrayList<TripData> cards ;
    TripModel(){
        cards = new ArrayList<>(0);
        for(int i=0 ; i<3 ; i++){
            TripData data = new TripData(i);
            Log.d("fsg",data.getData());
            cards.add(data);
        }
    }
    public List<TripData> getCards() {
        return cards;
    }
}
