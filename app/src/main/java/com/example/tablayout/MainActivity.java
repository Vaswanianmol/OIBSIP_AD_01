package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt1 , edt2;
    Spinner sp1 , sp2;
    TextView formTxt , toTxt , ansTxt;
    Button resBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1=findViewById(R.id.edtfrom);


        sp1=findViewById(R.id.spinFrom);
        sp2=findViewById(R.id.spinTo);

        formTxt=findViewById(R.id.selectFrom);
        toTxt=findViewById(R.id.selectTo);
        ansTxt=findViewById(R.id.restxt);

        resBtn=findViewById(R.id.button);

        String[] from={"kg","cm","m","gm","mm"};
        ArrayAdapter fad=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , from);
        sp1.setAdapter(fad);

        String[] to={"gm","cm", "m","kg","mm"};
        ArrayAdapter tad=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , to);
        sp2.setAdapter(tad);



        resBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double n1= Double.parseDouble(edt1.getText().toString());


                Double res;
                if(sp1.getSelectedItem().toString() == "kg" && sp2.getSelectedItem().toString() == "gm" ){
                    res= n1*1000;

                    ansTxt.setText(res+" gm".toString());
                }
                if(sp1.getSelectedItem().toString() == "gm" && sp2.getSelectedItem().toString() == "kg" ){
                    res= n1*0.001;

                    ansTxt.setText(res+" kg".toString());
                }
                if(sp1.getSelectedItem().toString() == "cm" && sp2.getSelectedItem().toString() == "m" ){
                    res= n1*0.01;

                    ansTxt.setText(res+" m".toString());
                }
                if(sp1.getSelectedItem().toString() == "m" && sp2.getSelectedItem().toString() == "cm" ){
                    res= n1*100;

                    ansTxt.setText(res+" cm".toString());
                }
                if(sp1.getSelectedItem().toString() == "cm" && sp2.getSelectedItem().toString() == "mm" ){
                    res= n1*10;

                    ansTxt.setText(res+" mm".toString());
                }
                if(sp1.getSelectedItem().toString() == "mm" && sp2.getSelectedItem().toString() == "cm" ){
                    res= n1*0.1;

                    ansTxt.setText(res+" mm".toString());
                }
                if(sp1.getSelectedItem().toString() == "m" && sp2.getSelectedItem().toString() == "mm" ){
                    res= n1*1000;

                    ansTxt.setText(res+" mm".toString());
                }
                if(sp1.getSelectedItem().toString() == "mm" && sp2.getSelectedItem().toString() == "m" ){
                    res= n1*0.001;

                    ansTxt.setText(res+" mm".toString());
                }


            }
        });
//-By Anmol Vaswani
    }
}