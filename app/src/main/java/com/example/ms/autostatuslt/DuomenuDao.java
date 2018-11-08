package com.example.ms.autostatuslt;


import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
    public interface DuomenuDao {

        @Insert
        void insert(Duomenys.Litrai litrai, Duomenys.Kaina kaina, Duomenys.Kilometrai kilometrai);

        @Query("DELETE FROM Duomenys_table")
        void deleteAll();

        @Query("SELECT * from Duomenys_table")
        LiveData<List<Duomenys>> getAllDuomenys();
    }

