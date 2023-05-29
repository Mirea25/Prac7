package com.example.prac4.UI.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.prac4.R;
import com.example.prac4.data.Item;
import com.example.prac4.data.Repository;

public class ViewModel extends androidx.lifecycle.ViewModel{
    private final MutableLiveData<Repository> itemId =
            new MutableLiveData(new Repository(new Item(null, null)));

    public LiveData<Repository> getItemId(){
        return itemId;
    }

    public void addItem(Integer imageId, String itemText){
        itemId.setValue(new Repository(new Item(imageId, itemText)));
    }
}
