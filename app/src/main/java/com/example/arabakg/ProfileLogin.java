package com.example.arabakg;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;


import com.example.arabakg.HelpFuncFile.InternetUtil;
import com.example.arabakg.model.Client;
import com.example.arabakg.model.Login;
import com.example.arabakg.model.PostApi;
import com.example.arabakg.model.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ProfileLogin extends Fragment  implements View.OnClickListener {


    EditText Edlog_username;
    EditText Edlog_password;

    private PostApi postApi;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {



        View rootView = inflater.inflate(R.layout.profile_login, container, false);


        LinearLayout logBtn = (LinearLayout) rootView.findViewById(R.id.login_button);
        LinearLayout to_reg_Btn = (LinearLayout) rootView.findViewById(R.id.to_registration_button);


        Edlog_username = (EditText) rootView.findViewById(R.id.log_username);
        Edlog_password = (EditText) rootView.findViewById(R.id.log_password);



        logBtn.setOnClickListener(this);
        to_reg_Btn.setOnClickListener(this);

        return rootView;


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login_button:
                LogButtonClick();
                break;
            case R.id.to_registration_button:
                RegButtonClick();
                break;
        }
    }



    public void replaceFragment(Fragment someFragment) {

        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, someFragment);
        transaction.addToBackStack(null);
        transaction.commit();

    }


    public void RegButtonClick()
    {

//        Fragment fragment = null;
//        fragment = new ProfileChoice();
//        replaceFragment(fragment);

    }


    public void LogButtonClick()
    {

        if (!IsEmptyEditTextLogin() & IsSize()){

            if ( InternetUtil.isInternetOnline(getActivity()) ){
                login();
            }

        }



    }


    private void login(){


        postApi = Client.getClient().create(PostApi.class);


        String add1      =  Edlog_username.getText().toString();
        String add2      =  Edlog_password.getText().toString();

        Login login = new Login(add1, add2);

        Call<User> call = postApi.login(login);
        call.enqueue(new Callback<User>() {

            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if(response.isSuccessful()){


                    if (response.body() != null) {

                        String token = response.body().getKey();

                        SharedPreferences preferences = getActivity().getSharedPreferences("myPrefs", Context.MODE_PRIVATE);
                        SharedPreferences.Editor prefLoginEdit = preferences.edit();
                        prefLoginEdit.putBoolean("loggedin", true);
                        prefLoginEdit.putString("token", token);

                        prefLoginEdit.commit();

                        String log_message_success = getResources().getString(R.string.t_login_sucсess);
                        Toast.makeText(getContext(), log_message_success, Toast.LENGTH_SHORT).show();

                        Fragment fragment = null;
                        fragment = new Create();
                        replaceFragment(fragment);

                    }

                }else {
                    String err_toast = getResources().getString(R.string.toast_log_network);
                    Toast.makeText(getContext(), err_toast, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                String err_toast_fail = getResources().getString(R.string.toast_log_network_fail);
                Toast.makeText(getActivity(), err_toast_fail, Toast.LENGTH_SHORT).show();
            }
        });
    }



    private Boolean IsEmptyEditTextLogin(){

        String err_empty = getResources().getString(R.string.log_doctor_empty);

        if(        Edlog_username.getText().toString().isEmpty()
                || Edlog_password.getText().toString().isEmpty()
        )
        {

            if (Edlog_username.getText().toString().isEmpty()){
                Edlog_username.setError(err_empty);
            }

            if (Edlog_password.getText().toString().isEmpty()){
                Edlog_password.setError(err_empty);
            }

            return true;

        }else{
            return false;
        }

    }


    private Boolean IsSize(){


        String err_doctor_size = getResources().getString(R.string.error_log_doctor_size);

        String ed_username = Edlog_username.getText().toString();
        String ed_password = Edlog_password.getText().toString();


        int size_username = ed_username.length();
        int size_password = ed_password.length();

        if (size_username > 3 & size_password > 3){
            return true;
        }
        else {

            if (size_username <= 3){
                Edlog_username.setError(err_doctor_size);
            }

            if (size_password <= 3){
                Edlog_password.setError(err_doctor_size);
            }

            return false;

        }



    }



    @Override
    public void onResume(){
        super.onResume();


        getView().setFocusableInTouchMode(true);
        getView().requestFocus();
        getView().setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_UP && keyCode == KeyEvent.KEYCODE_BACK){

                    getActivity().finish();

                    return true;
                }
                return false;
            }
        });

    }







}
