package com.example.asynctaskloader;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import java.util.ArrayList;

/**
 * Created by Sheeraz on 1/6/2024.
 */

public class NamesAsyncTaskLoader extends AsyncTaskLoader<ArrayList<String>> {

    public NamesAsyncTaskLoader(@NonNull Context context) {
        super(context);
    }

    @Nullable
    @Override
    public ArrayList<String> loadInBackground() {
        return loadNamesFromDB();
    }

    //This method simulates a call to a local database
    private ArrayList<String> loadNamesFromDB() {

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mary");
        names.add("Emma");
        names.add("Yosef");
        names.add("Noah");
        names.add("Andrea");

        return names;

    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }
}
