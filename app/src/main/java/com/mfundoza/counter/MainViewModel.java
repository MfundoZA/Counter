package com.mfundoza.counter;

import android.util.Log;
import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private MutableLiveData<Integer> count = new MutableLiveData<Integer>(0);

    public MutableLiveData<Integer> getCount() {
        return count;
    }

    public void setCount(MutableLiveData<Integer> count) {
        this.count = count;
    }

    public void increment(View view) {
        count.setValue(count.getValue() + 1);

        Log.d("MainViewModel", "Button incremented! Count: " + count.getValue());
    }

    public void decrement(View view) {
        count.setValue(count.getValue() - 1);

        Log.d("MainViewModel", "Button decremented! Count: " + count.getValue());
    }
}
