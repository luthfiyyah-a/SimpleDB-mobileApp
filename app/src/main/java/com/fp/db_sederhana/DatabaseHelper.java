package com.fp.db_sederhana;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String nama_database = "NamaDatabase.db";
    private static final int versi_database = 1;

    public DatabaseHelper(Context context) {
        super(context, nama_database, null, versi_database);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Tambahkan logika pembuatan tabel jika diperlukan
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Tambahkan logika pembaruan database jika diperlukan
    }
}
