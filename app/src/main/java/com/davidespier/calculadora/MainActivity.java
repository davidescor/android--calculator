package com.davidespier.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.NumberFormat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public TextView view_number, guide;
    public double operan1, operan2, res;
    int operation;
    double fix_operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view_number=(TextView)findViewById(R.id.view_number);
        guide=(TextView) findViewById(R.id.guide);

    }

    public void btpunt (View v){
        String cap=view_number.getText().toString();
        cap=cap+".";
        view_number.setText(cap);
    }

    public void bt0 (View v){
        String cap= view_number.getText().toString();
        cap=cap+"0";
        view_number.setText(cap);
    }

    public void bt1 (View v){
        String cap= view_number.getText().toString();
        cap=cap+"1";
        view_number.setText(cap);
    }
    public void bt2 (View v){
        String cap= view_number.getText().toString();
        cap=cap+"2";
        view_number.setText(cap);
    }

    public void bt3 (View v){
        String cap= view_number.getText().toString();
        cap=cap+"3";
        view_number.setText(cap);
    }

    public void bt4 (View v){
        String cap= view_number.getText().toString();
        cap=cap+"4";
        view_number.setText(cap);
    }
    public void bt5 (View v){
        String cap= view_number.getText().toString();
        cap=cap+"5";
        view_number.setText(cap);
    }

    public void bt6 (View v){
        String cap= view_number.getText().toString();
        cap=cap+"6";
        view_number.setText(cap);
    }

    public void bt7 (View v){
        String cap= view_number.getText().toString();
        cap=cap+"7";
        view_number.setText(cap);
    }

    public void bt8 (View v){
        String cap= view_number.getText().toString();
        cap=cap+"8";
        view_number.setText(cap);
    }

    public void bt9 (View v){
        String cap= view_number.getText().toString();
        cap=cap+"9";
        view_number.setText(cap);
    }

    public void suma(View v){
     try{
         if(operan1 != 0){
             String aux2= view_number.getText().toString();
             operan2= Double.parseDouble(aux2);
             result();
         }else{
             String aux1= view_number.getText().toString();
             operan1= Double.parseDouble(aux1);
             guide.setText((int) operan1+" + ");
             view_number.setText("");
         }

      }catch(NumberFormatException nfe){};
         operation=1;
    }

    public void resta(View v){
        try{
            if(operan1 != 0){
                String aux2= view_number.getText().toString();
                operan2= Double.parseDouble(aux2);
                result();
            }else{
                String aux1= view_number.getText().toString();
                operan1= Double.parseDouble(aux1);
                guide.setText((int) operan1+" - ");
                view_number.setText("");
            }

        }catch(NumberFormatException nfe){};
        operation=2;
    }

    public void multiplicacion (View v){
        try{
            if(operan1 != 0){
                String aux2= view_number.getText().toString();
                operan2= Double.parseDouble(aux2);
                result();
            }else{
                String aux1= view_number.getText().toString();
                operan1= Double.parseDouble(aux1);
                guide.setText((int) operan1+" x ");
                view_number.setText("");
            }

        }catch(NumberFormatException nfe){};
        operation=3;
    }

    public void division (View v){
        try{
            if(operan1 != 0){
                String aux2= view_number.getText().toString();
                operan2= Double.parseDouble(aux2);
                result();
            }else{
                String aux1= view_number.getText().toString();
                operan1= Double.parseDouble(aux1);
                guide.setText((int) operan1+" / ");
                view_number.setText("");
            }

        }catch(NumberFormatException nfe){};
        operation=4;
    }

    public void porcentaje (View v) {
        try{
            String aux1= view_number.getText().toString();
            operan1= Double.parseDouble(aux1);
            guide.setText(" result = y ( "+operan1+" / 100 )");
        }catch(NumberFormatException nfe){};
        view_number.setText("");
        operation=5;
    }

    public void igual(View v){
        result();
    }

    public void result (){
        try{
            String aux2= view_number.getText().toString();
            operan2= Double.parseDouble(aux2);
        }catch(NumberFormatException nfe){};
         view_number.setText("");

        if (operation==1){

            if (operan1% 1 == 0 && operan2%1 ==0) {
                double aux3 = operan1+operan2;
                view_number.setText(""+(int) aux3);
                guide.setText((int) operan1+" + "+(int) operan2+" = "+(int) aux3);

            } else {
               res=operan1+operan2;
               view_number.setText(""+res);
               guide.setText(operan1+" + "+operan2+" = "+res);

            }
            operation=0;
        }else if (operation==2){
            if (operan1% 1 == 0 && operan2%1 ==0) {
                double aux3 = operan1-operan2;
                view_number.setText(""+(int) aux3);
                guide.setText((int) operan1+" - "+(int) operan2+" = "+(int) aux3);
            } else {
                res=operan1-operan2;
                view_number.setText(""+res);
                guide.setText(operan1+" + "+operan2+" = "+res);
            }
            operation=0;
        }else if (operation==3){
            if (operan1% 1 == 0 && operan2%1 ==0) {
                double aux3 = operan1*operan2;
                view_number.setText(""+(int) aux3);
                guide.setText((int) operan1+" x "+(int) operan2+" = "+(int) aux3);

            } else {
                res=operan1*operan2;
                view_number.setText(""+res);
                guide.setText(operan1+" + "+operan2+" = "+res);
            }
            operation=0;

        }else if (operation==4){
            if(operan2==0){
                view_number.setText("No se puede dividir entre 0");
                operation=0;
            }else{

                if (operan1% 1 == 0 && operan2%1 ==0) {

                    double aux3 = operan1/operan2;
                    view_number.setText(""+(int) aux3);
                    guide.setText((int) operan1+" / "+(int) operan2+" = "+(int) aux3);

                } else {
                    res=operan1/operan2;
                    view_number.setText(""+res);
                    guide.setText(operan1+" / "+operan2+" = "+res);
                }
                operation=0;
            }

        }else if (operation==5){

            res=operan2*(operan1/100.0);
            operation=0;
            view_number.setText(""+res);
            guide.setText(res +" = "+operan2+" ( "+operan1+" / 100 )");
        }
        operan1=res;
    }

    public void clear (View v){
        guide.setText("");
        view_number.setText("");
        operan1=0.0;
        operan2=0.0;
        res=0.0;
    }

}
