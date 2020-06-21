package com.example.arabakg;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


import retrofit2.converter.gson.GsonConverterFactory;
import com.example.arabakg.HelpFuncFile.InternetUtil;
import com.example.arabakg.HelpFuncFile.SharedDataGetSet;
import com.example.arabakg.model.BrandModel;
import com.example.arabakg.model.CarModel;
import com.example.arabakg.model.CityModel;
import com.example.arabakg.model.Client;
import com.example.arabakg.model.PostApi;

public class Create extends Fragment implements View.OnClickListener {


    private EditText e_title;
    private EditText e_description;

    private EditText e_price;
    private EditText e_year;


    private PostApi postApi;







    private Spinner spinner_city;
    private ArrayList<CityModel> ListCity = new ArrayList<>();
    private Integer choice_city = 1;



    private Spinner spinner_brand;
    private ArrayList<BrandModel> listBrand = new ArrayList<>();
    private Integer choice_brand = 1;





    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.create, container, false);

        LinearLayout add_save = (LinearLayout) rootView.findViewById(R.id.add_save);

        add_save.setOnClickListener(this);



        e_title = (EditText) rootView.findViewById(R.id.title);
        e_description = (EditText) rootView.findViewById(R.id.description);
        e_price = (EditText) rootView.findViewById(R.id.price);

        e_year = (EditText) rootView.findViewById(R.id.year);


//        e_car_pic = (EditText) rootView.findViewById(R.id.car_pic);
//        e_car_pic2 = (EditText) rootView.findViewById(R.id.car_pic2);
//        e_car_pic3 = (EditText) rootView.findViewById(R.id.car_pic3);




        spinner_city = rootView.findViewById(R.id.spinner_create_city);
        spinner_brand = rootView.findViewById(R.id.spinner_create_brand);



        ListCity.add(new CityModel(0,1, "Чуй"));
        ListCity.add(new CityModel(1, 2, "Ош"));
        ListCity.add(new CityModel(2, 3, "Жалал-Абад"));
        ListCity.add(new CityModel(3,4, "Ыссык-Кол"));
        ListCity.add(new CityModel(4,5, "Нарын"));
        ListCity.add(new CityModel(5,6, "Талас"));
        ListCity.add(new CityModel(6,7, "Баткен"));


        listBrand.add(new BrandModel(0,"Все"));
        listBrand.add(new BrandModel(1,"Honda"));
        listBrand.add(new BrandModel(2,"Toyota"));


        FillSpinnerCity();
        FillSpinnerBrand();


        return rootView;


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.add_save:
                onMyButtonClick();
                break;
        }
    }




    public void onMyButtonClick()
    {
        if ( InternetUtil.isInternetOnline(getActivity()) ){
            editProfile();
        }

    }


    private void editProfile() {

        String toast_load = getResources().getString(R.string.toast_load);
        final ProgressDialog mProgressDialog = new ProgressDialog(getContext());
        mProgressDialog.setIndeterminate(true);
        mProgressDialog.setMessage(toast_load);
        mProgressDialog.show();


        String  add_title = e_title.getText().toString();
        String  add_description = e_description.getText().toString();

        int add_price = Integer.parseInt(e_price.getText().toString());
        int add_year = Integer.parseInt(e_year.getText().toString());




        postApi = Client.getClient().create(PostApi.class);
        String token_ex_ap = SharedDataGetSet.getMySavedToken(getActivity());


        Call<ResponseBody> call = postApi.createPost(
                token_ex_ap,
                choice_city,
                1,
                add_title,
                add_description,
                add_price,
                true,
                2,
                add_year,
                choice_brand
        );



        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Log.d("good", "good");

                if (mProgressDialog.isShowing())
                    mProgressDialog.dismiss();

                if(response.isSuccessful()){

//                    String success_edit = getResources().getString(R.string.t_edit_success_edit);
//                    Toast toast = Toast.makeText(getActivity(),success_edit, Toast.LENGTH_LONG);
//                    toast.show();
//
//                    getActivity().getSupportFragmentManager().popBackStack();

                }else {

//                    String err_doctor_inet = getResources().getString(R.string.reg_doctor_fail_register);
//                    Toast toast = Toast.makeText(getActivity(),err_doctor_inet, Toast.LENGTH_LONG);
//                    toast.show();

                }


            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d("fail1", "fail1");
//                String err_doctor_inet = getResources().getString(R.string.reg_doctor_fail_register);
//                Toast toast = Toast.makeText(getActivity(), err_doctor_inet, Toast.LENGTH_LONG);
//                toast.show();

                if (mProgressDialog.isShowing())
                    mProgressDialog.dismiss();
            }

        });


    }




    public void FillSpinnerCity() {

        ArrayAdapter<CityModel> adapter = new ArrayAdapter<CityModel>(getActivity(),
                android.R.layout.simple_spinner_item, ListCity);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner_city.setAdapter(adapter);

        spinner_city.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                CityModel user = (CityModel) parent.getSelectedItem();
                choice_city = user.getGorod_id();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }





    public void FillSpinnerBrand() {

        ArrayAdapter<BrandModel> adapter = new ArrayAdapter<BrandModel>(getActivity(),
                android.R.layout.simple_spinner_item, listBrand);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner_brand.setAdapter(adapter);

        spinner_brand.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                BrandModel user = (BrandModel) parent.getSelectedItem();
                choice_brand = user.getId_brand();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }







}