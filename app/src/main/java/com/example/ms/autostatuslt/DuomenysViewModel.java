package com.example.ms.autostatuslt;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import java.util.List;

public class DuomenysViewModel extends AndroidViewModel {

    private DuomenysRepository mRepository;
    private LiveData<List<Duomenys>> mAllWords;

    public DuomenysViewModel(Application application) {
        super(application);
        mRepository = new DuomenysRepository(application);
        mAllWords = mRepository.getAllDuomenys();
    }

    LiveData<List<Duomenys>> getAllWords() {
        return mAllWords;
    }

    public void insert(Duomenys duomenys) {
        mRepository.insert(duomenys);
    }
}