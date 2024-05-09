package com.example.fragmentweather;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class WeatherViewModel extends ViewModel {

    private final MutableLiveData<String> searchQuery = new MutableLiveData<>();
    private final List<String> recentSearches = new ArrayList<>();

    public LiveData<String> getSearchQuery() {
        return searchQuery;
    }

    public void setSearchQuery(String query) {
        searchQuery.setValue(query);
    }

    public void addSearchQuery(String query) {
        recentSearches.add(query);
        setSearchQuery(query);
    }

    public List<String> getRecentSearches() {
        return recentSearches;
    }


}

