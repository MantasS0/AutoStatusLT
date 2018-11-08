package com.example.ms.autostatuslt;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.os.AsyncTask;

@Database(entities = {Duomenys.class}, version = 1)
public abstract class DuomenysRoomDatabase extends RoomDatabase {
    public abstract DuomenuDao duomenuDao();

    private static volatile DuomenysRoomDatabase INSTANCE;

    static DuomenysRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (DuomenysRoomDatabase.class) {
                if (INSTANCE == null) {
                    // Create database here
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            DuomenysRoomDatabase.class, "duomenys_database")
//                            .addCallback(sRoomDatabaseCallback)
                            .build();
                }
            }
        }
        return INSTANCE;
    }

//    private static RoomDatabase.Callback sRoomDatabaseCallback =
//            new RoomDatabase.Callback(){
//
//                @Override
//                public void onOpen (@NonNull SupportSQLiteDatabase db){
//                    super.onOpen(db);
//                    new PopulateDbAsync(INSTANCE).execute();
//                }
//            };

//    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

//        private final DuomenuDao mDao;

//        PopulateDbAsync(DuomenysRoomDatabase db) {
//            mDao = db.duomenuDao();
//        }

//        @Override
//        protected Void doInBackground(final Void... params) {
////            mDao.deleteAll();
//            Duomenys duomenys = new Duomenys(Float 15.6, Float 20.3f, Integer 100);
//            mDao.insert(duomenys);
//            duomenys = new Duomenys(5.6f, 20.3f, 100);
//            mDao.insert(duomenys);
//            return null;
//        }
//    }

}
