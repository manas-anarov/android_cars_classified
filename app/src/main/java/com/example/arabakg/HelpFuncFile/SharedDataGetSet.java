package com.example.arabakg.HelpFuncFile;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedDataGetSet {




    public static String getMySavedToken(Context context){
        SharedPreferences preferences = context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE);
        String token_in_func = preferences.getString("token","");

        String token_result = "Token " + token_in_func;

        return token_result;
    }


    public static void setLogout( Context context){
        SharedPreferences.Editor editor = context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE).edit();
        editor.clear();
        editor.commit();
    }





//        Registration


    public static Boolean CheckforRegistration(Context context) {

        SharedPreferences preferences = context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE);
        Boolean reg_status = preferences.getBoolean("registration",false);

        return reg_status;

    }


//    проверка авторизован ли пользователь

    public static Boolean CheckForLogin(Context context) {

        SharedPreferences preferences = context.getSharedPreferences("myPrefs", Context.MODE_PRIVATE);
        Boolean s = preferences.getBoolean("loggedin",false);

        return s;

    }




// Очистить данные города в Редактировать пост
    public static void setGorodEditClear( Context context){
        SharedPreferences.Editor editor = context.getSharedPreferences("EditPrefs", Context.MODE_PRIVATE).edit();
        editor.clear();
        editor.commit();
    }

    // Очистить данные города в Добавить пост
    public static void setGorodAddClear( Context context){
        SharedPreferences.Editor editor = context.getSharedPreferences("myAddPrefs", Context.MODE_PRIVATE).edit();
        editor.clear();
        editor.commit();
    }


    // С какого фрагмента нажат на выбор города установить

    public static void setOtkudaNajatNaGorod( Context context, Integer otkuda){
        SharedPreferences preferences = context.getSharedPreferences("OtkudaNajat", Context.MODE_PRIVATE);
        SharedPreferences.Editor prefLoginEdit = preferences.edit();
        prefLoginEdit.putInt("otkuda_najat", otkuda);
        prefLoginEdit.commit();
    }

    //С какого фрагмента нажат на выбор города принять данные
    public static Integer getOtkudaNajatNaGorod(Context context) {

        SharedPreferences preferences = context.getSharedPreferences("OtkudaNajat", Context.MODE_PRIVATE);
        Integer s = preferences.getInt("otkuda_najat",0);

        return s;

    }

}
