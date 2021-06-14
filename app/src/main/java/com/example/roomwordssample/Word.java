package com.example.roomwordssample;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "word_table")


public class Word {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String palabra;

    public Word(@NonNull String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }
}
