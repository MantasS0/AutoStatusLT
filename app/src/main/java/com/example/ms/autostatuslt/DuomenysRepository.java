package com.example.ms.autostatuslt;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

public class DuomenysRepository {
    private DuomenuDao mDuomenuDao;
    private LiveData<List<Duomenys>> mAllDuomenys;

    DuomenysRepository(Application application) {
        DuomenysRoomDatabase db = DuomenysRoomDatabase.getDatabase(application);
        mDuomenuDao = db.duomenuDao();
        mAllDuomenys = mDuomenuDao.getAllDuomenys();
    }

    LiveData<List<Duomenys>> getAllDuomenys() {
        return mAllDuomenys;
    }
    public void insert (Duomenys duomenys) {
        new insertAsyncTask(mDuomenuDao).execute(duomenys);
    }

    private static class insertAsyncTask extends AsyncTask<Duomenys, Void, Void> {

        private DuomenuDao mAsyncTaskDao;

        insertAsyncTask(DuomenuDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Duomenys... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }
}
