package com.example.mydemodatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;

import java.sql.SQLClientInfoException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        SQLiteDatabase myDatabase = this.openOrCreateDatabase("Users", MODE_PRIVATE, null); // perintah ini untuk membuat database dengan nama table users
//        myDatabase.execSQL("CREATE TABLE IF NOT EXISTS Users (name VARCHAR, age INT(3))"); // disini kita bikin isi dari tabelnya dan variabel untuk table tsb
//        myDatabase.execSQL("INSERT INTO Users (name, age) VALUES ('peter', 30)");
//        myDatabase.execSQL("INSERT INTO Users (name, age) VALUES ('noah', 27)");  // perintah ini untuk menambahkan is dari table tersebut.
//
//        // mengambil data dari database , untuk itu kita menggunakan Cursor
//        Cursor c = myDatabase.rawQuery("SELECT * FROM Users", null);// quey untuk memanggil data dari database
//        // membuat indeks untuk dari qury diatas
//        int nameIndex = c.getColumnIndex("name"); // untuk mendapakan isi dari kolom nama
//        int ageIndex = c.getColumnIndex("age"); //  mengambil data dari kolom c untuk kolom age
//
//        c.moveToFirst(); // mulai mengambil data dari awal
//
//        while (c != null){ // jika c tidak sama dengan null perintah akan di ulang sampai c sama dengan null
//
//            Log.i("name " , c.getString(nameIndex)); //  mengambil nama dari database dengan sesuai dengan kolom c
//            Log.i("age ", c.getString(ageIndex));
//            c.moveToNext();
//
//
//
//        }

 // chalangge ke 2

        SQLiteDatabase myDatabase = this.openOrCreateDatabase("Event", MODE_PRIVATE, null); // perintah ini untuk membuat database dengan nama table users
         myDatabase.execSQL("CREATE TABLE IF NOT EXISTS Event (nameevent VARCHAR, years INT(4), type VARCHAR)"); // disini kita bikin isi dari tabelnya dan variabel untuk table tsb
//        myDatabase.execSQL("INSERT INTO Event (nameevent, years, type) VALUES ('holiday', 2002, 'Have fun' )");
//        myDatabase.execSQL("INSERT INTO Event (nameevent, years, type) VALUES ('War', 2010, 'killing enemy')");

        Cursor c = myDatabase.rawQuery("SELECT * FROM Event", null);// quey untuk memanggil data dari database
        // membuat indeks untuk dari qury diatas
        int nameevent = c.getColumnIndex("nameevent"); // untuk mendapakan isi dari kolom nama
        int year = c.getColumnIndex("years"); //  mengambil data dari kolom c untuk kolom age
        int type = c.getColumnIndex("type");

        c.moveToFirst(); // mulai mengambil data dari awal

        while (c != null){ // jika c tidak sama dengan null perintah akan di ulang sampai c sama dengan null

            Log.i("nameevent " , c.getString(nameevent)); //  mengambil nama dari database dengan sesuai dengan kolom c
            Log.i("year ", c.getString(year));
            Log.i("type ", c.getString(type));

            c.moveToNext();



        }

    }
}
