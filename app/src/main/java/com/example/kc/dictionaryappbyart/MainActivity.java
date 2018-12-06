package com.example.kc.dictionaryappbyart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.lis);
        final ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Alliteration");
        arrayList.add("Ambigious");
        arrayList.add("Benevolent");
        arrayList.add("Bypass");
        arrayList.add("Capricious");
        arrayList.add("Disposition");
        arrayList.add("Empathy");
        arrayList.add("Fervent");
        arrayList.add("Gallivant");
        arrayList.add("Hypnosis");
        arrayList.add("Irony");
        arrayList.add("Jurisdiction");
        arrayList.add("Karma");
        arrayList.add("Lucid");
        arrayList.add("Misanthrope");
        arrayList.add("Nostalgic");
        arrayList.add("Optimistically");
        arrayList.add("Paradigm");
        arrayList.add("Quell");
        arrayList.add("Tangible");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               switch (position){
                   case 0:
                       Intent i1=new Intent(getApplicationContext(),Alliteration.class);
                       startActivity(i1);
                       break;
                   case 1:
                       Intent i2=new Intent(getApplicationContext(),Ambigious.class);
                       startActivity(i2);
                       break;
                   case 2:
                       Intent i3=new Intent(getApplicationContext(),Benevolent.class);
                       startActivity(i3);
                       break;
                   case 3:
                       Intent i4=new Intent(getApplicationContext(),Bypass.class);
                       startActivity(i4);
                       break;
                   case 4:
                       Intent i5=new Intent(getApplicationContext(),Capricious.class);
                       startActivity(i5);
                       break;
                   case 5:
                       Intent i6=new Intent(getApplicationContext(),Disposition.class);
                       startActivity(i6);
                       break;
                   case 6:
                       Intent i7=new Intent(getApplicationContext(),Empathy.class);
                       startActivity(i7);
                       break;
                   case 7:
                       Intent i8=new Intent(getApplicationContext(),Fervent.class);
                       startActivity(i8);
                       break;
                   case 8:
                       Intent i9=new Intent(getApplicationContext(),Gallivant.class);
                       startActivity(i9);
                       break;
                   case 9:
                       Intent i10=new Intent(getApplicationContext(),Hypnosis.class);
                       startActivity(i10);
                       break;
                   case 10:
                       Intent i11=new Intent(getApplicationContext(),Irony.class);
                       startActivity(i11);
                       break;
                   case 11:
                       Intent i12=new Intent(getApplicationContext(),Jurisdiction.class);
                       startActivity(i12);
                       break;
                   case 12:
                       Intent i13=new Intent(getApplicationContext(),Karma.class);
                       startActivity(i13);
                       break;
                   case 13:
                       Intent i14=new Intent(getApplicationContext(),Lucid.class);
                       startActivity(i14);
                       break;
                   case 14:
                       Intent i15=new Intent(getApplicationContext(),Misanthrope.class);
                       startActivity(i15);
                       break;
                   case 15:
                       Intent i16=new Intent(getApplicationContext(),Nostalgic.class);
                       startActivity(i16);
                       break;
                   case 16:
                       Intent i17=new Intent(getApplicationContext(),Optimistically.class);
                       startActivity(i17);
                       break;
                   case 17:
                       Intent i18=new Intent(getApplicationContext(),Paradigm.class);
                       startActivity(i18);
                       break;
                   case 18:
                       Intent i19=new Intent(getApplicationContext(),Quell.class);
                       startActivity(i19);
                       break;
                   case 19:
                       Intent i20=new Intent(getApplicationContext(),Tangible.class);
                       startActivity(i20);
                       break;

               }
           }
       });
    }
}