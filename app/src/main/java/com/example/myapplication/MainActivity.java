package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.model.Bike;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // เก็บ bike 2 อย่างไว้ใน ArrayList<Bike> ชื่อว่า Bikes
        //
        List<Bike> bikes = new ArrayList<Bike>();
        Bike bike = new Bike();
        bike.setBike_name("Specialized S-Works Aethos");
        bike.setBike_image("https://www.duckingtiger.com/wp-content/uploads/2020/10/Specialized-S-Works-Aethos-Driveside_3_4-Copy.jpg");
        bike.setBike_price(478047);
        bikes.add(bike);

        Bike bike2 = new Bike();
        bike2.setBike_name("TRINX TDO 1.1");
        bike2.setBike_image("https://filebroker-cdn.lazada.co.th/kf/S89a19507d8e04653858ccdf05083a37ai.jpg");
        bike2.setBike_price(44000);
        bikes.add(bike2);

        Bike bike3 = new Bike();
        bike3.setBike_name("Bianchi Aria Disc 2021");
        bike3.setBike_image("https://www.serviziocorsa.com/media/image/product/25100/md/en-bianchi-aria-campagnolo-chorus-2021.jpg");
        bike3.setBike_price(150900);
        bikes.add(bike3);

        Bike bike4 = new Bike();
        bike4.setBike_name("ริวบิดซิ่ง");
        bike4.setBike_image("https://scontent-bkk1-2.xx.fbcdn.net/v/t39.30808-6/273658113_2115556781937846_2574392847367048890_n.jpg?_nc_cat=102&ccb=1-7&_nc_sid=6ee11a&_nc_ohc=485ouEJ2BkQQ7kNvgExNG7B&_nc_ht=scontent-bkk1-2.xx&_nc_gid=ANrMXggdOePpXP-TfCXvlzq&oh=00_AYC4S3rs_QeAHm44j-y390wULVNK3MyquXG3oDYdcdlRpQ&oe=66DED912");
        bike4.setBike_price(10000);
        bikes.add(bike4);


        // ส่ง bikes ไปให้ MyAdapter
        //
        mAdapter = new MyAdapter(bikes, this);
        recyclerView.setAdapter(mAdapter);
    }
}