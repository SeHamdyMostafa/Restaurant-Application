package com.example.resturant;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import java.util.ArrayList;

public class Mac_food extends AppCompatActivity {


    DatabaseHelper dbHelper;
    DatabaseManager dbManger;
    ListView macFoodList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mac_food);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("chinese Food Menu ");

        macFoodList=findViewById(R.id.lv_chineseFoodListView);
        dbHelper=new DatabaseHelper(this);
        dbManger=new DatabaseManager(dbHelper,this);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> images=new ArrayList<>();

        names.add("Big Tasty Chicken");
        names.add("Chicken Fillet");
        names.add("Grand Share Box");
        names.add("HM D Beefburger");
        names.add("HM D Chess burger");
        names.add("M2M");
        names.add("Big Mushroom");
        names.add("Share Box");
        names.add("Grand Chicken Regular");
        names.add("Little Tasty");

        images.add(R.drawable.big_tasty_chicken);
        images.add(R.drawable.chicken_fillet);
        images.add(R.drawable.grand_share);
        images.add(R.drawable.hm_d_beefburger);
        images.add(R.drawable.hm_d_chesseburger);
        images.add(R.drawable.m2m);
        images.add(R.drawable.mushroom);
        images.add(R.drawable.share_box);
        images.add(R.drawable.grand_chicken_regular);
        images.add(R.drawable.little_tasty);


        MacFoodAdapter macFoodAdapter=new MacFoodAdapter(this,names,images);
        macFoodList.setAdapter(macFoodAdapter);

        macFoodList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        big_tasty_chicken(view);
                    break;
                    case 1:
                        chicken_fillet(view);
                        break;
                    case 2:
                        grand_share(view);
                        break;
                    case 3:
                        hm_d_beefburger(view);
                        break;
                    case 4:
                        hm_d_chess_burger(view);
                        break;
                    case 5:
                        m2m(view);
                        break;
                    case 6:
                        mushroom(view);
                        break;
                    case 7:
                        share_box(view);
                        break;
                    case 8:
                        grand_chicken_regular(view);
                        break;
                    case 9:
                        little_tasty(view);
                        break;
                }
            }
        });

    }



    public void big_tasty_chicken(View view) {

        try{
            dbManger.insertFoodModel("Big Tasty Chicken",R.drawable.big_tasty_chicken,"?????? ????????! ???????? ?????? ???????? ???????? ???? 3 ?????????? ?????????? ???? ???????? ???????????????? ?????? ?????????????? ???????????? ???? ?????????? ?????? ?????????? ?????? ?????? ???????????? ????????????","70 L.E");
            Intent intent=new Intent(this,Food_Model.class);
            startActivity(intent);
        }catch(Exception e){
            Toast.makeText(this, "error when insert Record", Toast.LENGTH_SHORT).show();
        }

    }

    public void chicken_fillet(View view) {

        try{
            dbManger.insertFoodModel("Chicken Fillet",R.drawable.chicken_fillet,"?????????????????? ???????? ???????? ?????????? ?????????? ?????????????????? ???????????????? ???? ?????????????? ?????? ???? ?????? ??????????????","70 L.E");
            Intent intent=new Intent(this,Food_Model.class);
            startActivity(intent);
        }catch(Exception e){
            Toast.makeText(this, "error when insert Record", Toast.LENGTH_SHORT).show();
        }

    }

    public void grand_share(View view) {

        try{
            dbManger.insertFoodModel("Grand Share Box",R.drawable.grand_share,"?????????? ?????????????????? ???? ?????? ?????? ???????????? ???????????? ??????????  + 2 ?????????????? ???? ?????? ???????? ?????????? ???????? ???????????? ?????????? + 2 ???????????????????? ?????????? ?????? ???????? + ???????????????? 1 ??????","90 L.E");
            Intent intent=new Intent(this,Food_Model.class);
            startActivity(intent);
        }catch(Exception e){
            Toast.makeText(this, "error when insert Record", Toast.LENGTH_SHORT).show();
        }

    }

    public void hm_d_beefburger(View view) {

        try{
            dbManger.insertFoodModel("HM D Beefburger",R.drawable.hm_d_beefburger,"?????? ???????????? ???? ?????????????? ???????? ????????????. ???? ???? ???????????? ???????? ???????? ?????????????? ???????? ?????? ???????????? ?????? ???????? ???????? ???????????????? ???????? ?????????? ???????????? ???????????? ??????????! ???????? ?????? ?????????????? ???????????????? ???????????? ???????? ???? ???????? ???????? ?????? ?????????????????? ???????? ?????????????? ???????? ?????????? ???? ???????? ????????????????.. ????????????!","150 L.E");
            Intent intent=new Intent(this,Food_Model.class);
            startActivity(intent);
        }catch(Exception e){
            Toast.makeText(this, "error when insert Record", Toast.LENGTH_SHORT).show();
        }

    }

    public void hm_d_chess_burger(View view) {

        try{
            dbManger.insertFoodModel("HM D Chess burger",R.drawable.hm_d_chesseburger,"?????????? ?????? ?????????????? ???????????? ?????????????? ???????? ??????????.. ???? ???? ???????????? ???????? ???????? ?????????????? ???????? ?????? ???????????? ?????? ???????? ???????? ???????????????? ???????? ?????????? ???????????? ???????????? ??????????! ???????? ?????? ?????????????? ???????????????? ???????????? ???????? ???? ???????? ???????? ?????? ?????????????????? ???????? ?????????????? ???????? ?????????? ???? ???????? ????????????????.. ??????????????!","90 L.E");
            Intent intent=new Intent(this,Food_Model.class);
            startActivity(intent);
        }catch(Exception e){
            Toast.makeText(this, "error when insert Record", Toast.LENGTH_SHORT).show();
        }

    }

    public void m2m(View view) {

        try{
            dbManger.insertFoodModel("m2m",R.drawable.m2m,"?????????? 2 ???? ???????? ???????? ???????????? ?????????? ?? ?????? ???????? + ???????????????????? ?????????? + ??????????","100 L.E");
            Intent intent=new Intent(this,Food_Model.class);
            startActivity(intent);
        }catch(Exception e){
            Toast.makeText(this, "error when insert Record", Toast.LENGTH_SHORT).show();
        }

    }

    public void mushroom(View view) {

        try{
            dbManger.insertFoodModel("mushroom",R.drawable.mushroom,"?????????? ???????????? ?????????????? ???? ?????????? ???????? ??????????. ???? ??????????!","190 L.E");
            Intent intent=new Intent(this,Food_Model.class);
            startActivity(intent);
        }catch(Exception e){
            Toast.makeText(this, "error when insert Record", Toast.LENGTH_SHORT).show();
        }

    }

    public void share_box(View view) {

        try{
            dbManger.insertFoodModel("share_box",R.drawable.share_box,"?????????? ?????????????????? ???? ?????? ?????? ?????? ???????? ?????????? + ?????????????????? ???? ?????? ?????????? ???????? ???????? ???????????? ?????????? + 2 ???????????????????? ?????????? ?????? ???????? + ???????????????? 1 ??????","100 L.E");
            Intent intent=new Intent(this,Food_Model.class);
            startActivity(intent);
        }catch(Exception e){
            Toast.makeText(this, "error when insert Record", Toast.LENGTH_SHORT).show();
        }

    }

    public void grand_chicken_regular(View view) {

        try{
            dbManger.insertFoodModel("Grand Chicken Regular",R.drawable.grand_chicken_regular,"???????? ?????????? ?????????? ?????????????? ???????????? ???? ?????????? ?????????? ???????????? ???????? ???????????????? ??????.. ?????????? ???????? ???????????? ???????????? ???? ?????? 5 ????????","200 L.E");
            Intent intent=new Intent(this,Food_Model.class);
            startActivity(intent);
        }catch(Exception e){
            Toast.makeText(this, "error when insert Record", Toast.LENGTH_SHORT).show();
        }

    }

    public void little_tasty(View view) {

        try{
            dbManger.insertFoodModel("Little Tasty",R.drawable.little_tasty,"?????? ?????? ???????????? ???????????? .. ?????? ???????????????? ?????????????? ?????????? ?????????? ???? ???????????? ????????????","120 L.E");
            Intent intent=new Intent(this,Food_Model.class);
            startActivity(intent);
        }catch(Exception e){
            Toast.makeText(this, "error when insert Record", Toast.LENGTH_SHORT).show();
        }

    }




}