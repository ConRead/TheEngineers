package com.example.faithanalie.conread;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.StrictMode;

/**
 * Created by faithanalie on 13/09/2017.
 */

public class MyDatabase extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "MyDatabase.db";
    private static final String TABLE_NAME = "User_Table";
    private static final String COL_1 = "ID";
    private static final String COL_2 = "Username";
    private static final String COL_3 = "First Name";
    private static final String COL_4 = "Last Name";
    private static final String COL_5 = "Password";
    private static final String COL_6 = "Age";
    private static final String COL_7 = "Contact No.";

    public MyDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_USER_TABLE = "CREATE TABLE " + TABLE_NAME + "(" + COL_1 + "INTEGER PRIMARY KEY AUTOINCREMENT " +
                COL_2 + " STRING, " + COL_3 + " STRING, " + COL_4 + " STRING, " + COL_5 + " STRING, " + COL_6 + " INTEGER, " + COL_7 + " STRING" + ")";

        db.execSQL(CREATE_USER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        onCreate(db);
    }

    public void addUser(UserData user){
        ContentValues values = new ContentValues();
        values.put(COL_2, user.getUsername());
        values.put(COL_3, user.getFirstName());
        values.put(COL_4, user.getLastName());
        values.put(COL_5, user.getPassword());
        values.put(COL_6, user.getAge());
        values.put(COL_7, user.getContactNo());

        SQLiteDatabase db = this.getReadableDatabase();
        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    public UserData findUser(String username){
        String query = "Select * FROM " + TABLE_NAME + " WHERE " + COL_2 + " = \"" + username + "\"";

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        UserData user = new UserData();

        if(cursor.moveToFirst()){
            cursor.moveToFirst();
            user.setId(Integer.parseInt(cursor.getString(0)));
            user.setUsername(cursor.getString(1));
            user.setFirstName(cursor.getString(2));
            user.setLastName(cursor.getString(3));
            user.setPassword(cursor.getString(4));
            user.setAge(Integer.parseInt(cursor.getString(5)));
            user.setContactNo(cursor.getString(6));
            cursor.close();
        }
        else {
            user = null;
        }

        return user;
    }


}
