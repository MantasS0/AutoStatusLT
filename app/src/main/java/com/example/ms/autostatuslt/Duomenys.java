package com.example.ms.autostatuslt;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;


@Entity(tableName = "Duomenys_table")
public class Duomenys {

    @PrimaryKey(autoGenerate = true)
    private int id;

    public class Litrai {
        @NonNull
        @ColumnInfo(name = "litrai")
        private Float mLitrai;

        public Litrai(Float litrai) {
            this.mLitrai = litrai;
        }

        public Float getLitrai() {
            return this.mLitrai;
        }
    }

    public class Kaina {
        @NonNull
        @ColumnInfo(name = "kaina")
        private Float mKaina;

        public Kaina(Float kaina) {
            this.mKaina = kaina;
        }

        public Float getKaina() {
            return this.mKaina;
        }
    }

    public class Kilometrai {
        @NonNull
        @ColumnInfo(name = "kilometrai")
        private Integer mKilometrai;

        public Kilometrai(Integer kilometrai) {this.mKilometrai = kilometrai;}

        public Integer getKilometrai(){return this.mKilometrai;}
    }


}