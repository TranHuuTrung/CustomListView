package com.example.admin.customlistview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.lv);

        ArrayList<Item> arrayList = new ArrayList<>();

        Item item1 = new Item(Color.BLUE, "Viet Nam");
        Item item2 = new Item(Color.GRAY, "Han Quoc");
        Item item3 = new Item(Color.GREEN, "Nhat Ban");
        Item item4 = new Item(Color.BLUE, "My");
        Item item5 = new Item(Color.GRAY, "Han Quoc");
        Item item6 = new Item(Color.GREEN, "Nhat Ban");
        Item item7 = new Item(Color.BLUE, "My");
        Item item8 = new Item(Color.GRAY, "Han Quoc");
        Item item9 = new Item(Color.GREEN, "Nhat Ban");
        Item item10 = new Item(Color.BLUE, "My");

        arrayList.add(item1);
        arrayList.add(item2);
        arrayList.add(item3);
        arrayList.add(item4);
        arrayList.add(item5);
        arrayList.add(item6);
        arrayList.add(item7);
        arrayList.add(item8);
        arrayList.add(item9);
        arrayList.add(item10);

      CustomAdapter customAdapter = new CustomAdapter(this, R.layout.row_item,arrayList);
      lv.setAdapter(customAdapter);
    }
}
