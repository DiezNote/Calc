package com.dieznote.calc;

import android.media.VolumeShaper;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double opr1 = 0;
    double opr2 = 0;
    boolean firstOpr = true;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonDev;
    Button buttonPlu;
    Button buttonMin;
    Button buttonMult;
    Button buttonPoint;
    Button buttonRavno;
    Button buttonClear;
    Button buttonDelete;
    TextView textView;
    String sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //находим элементы
        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        buttonDev = (Button)findViewById(R.id.buttonDev);
        buttonPlu = (Button)findViewById(R.id.buttonPlu);
        buttonMin = (Button)findViewById(R.id.buttonMin);
        buttonMult = (Button)findViewById(R.id.buttonMult);
        buttonPoint = (Button)findViewById(R.id.ButtonPoint);
        buttonRavno = (Button)findViewById(R.id.buttonRavno);
        buttonClear = (Button)findViewById(R.id.buttonClear);
        buttonDelete = (Button)findViewById(R.id.buttonDelete);
        textView = (TextView)findViewById(R.id.textView);
    }
    public void NumClick0(View view){
        String str = textView.getText().toString();
        str += button0.getText().toString();
        textView.setText(str);
    }
    public void NumClick1(View view){
        String str = textView.getText().toString();
        str += button1.getText().toString();
        textView.setText(str);
    }
    public void NumClick2(View view){
        String str = textView.getText().toString();
        str += button2.getText().toString();
        textView.setText(str);
    }
    public void NumClick3(View view){
        String str = textView.getText().toString();
        str += button3.getText().toString();
        textView.setText(str);
    }
    public void NumClick4(View view){
        String str = textView.getText().toString();
        str += button4.getText().toString();
        textView.setText(str);
    }
    public void NumClick5(View view){
        String str = textView.getText().toString();
        str += button5.getText().toString();
        textView.setText(str);
    }
    public void NumClick6(View view){
        String str = textView.getText().toString();
        str += button6.getText().toString();
        textView.setText(str);
    }
    public void NumClick7(View view){
        String str = textView.getText().toString();
        str += button7.getText().toString();
        textView.setText(str);
    }
    public void NumClick8(View view){
        String str = textView.getText().toString();
        str += button8.getText().toString();
        textView.setText(str);
    }
    public void NumClick9(View view){
        String str = textView.getText().toString();
        str += button9.getText().toString();
        textView.setText(str);
    }
    public void ClickClear(View view){
        textView.setText("");
        firstOpr = true;
        opr1 = 0;
        opr2 = 0;
    }
    public void ClickPoint(View view){
        String str = textView.getText().toString();
        if(str.contains("."))return;
        str += buttonPoint.getText().toString();
        if(str.length() == 1)
            str = "0" + str;
        textView.setText(str);
    }
    public void ClickSum(View view){
        sign = "+";
        Operation();
    }
    public void ClickMinus(View view){
        sign = "-";
        Operation();
    }
    public void ClickDelit(View view){
        sign = "/";
        Operation();
    }
    public void ClickUmnojit(View view){
        sign = "*";
        Operation();
    }
    public void ClickRavno(View view){
        if(sign.equals(""))return;
        Operation();
    }
    public void ClickDelete(View view){
        if(textView.getText().toString().length() == 0)return;
        textView.setText(textView.getText().toString().substring(0,(textView.getText().toString().length() - 1)));
    }
    public void Operation(){
        if(textView.getText().toString().equals(""))return;
        if(firstOpr){
            opr1 = Double.parseDouble(textView.getText().toString());
            textView.setText("");
        }else{
            opr2 = Double.parseDouble(textView.getText().toString());
            switch (sign){
                case "+":
                    textView.setText("" + (opr1+opr2));
                    break;
                case "-":
                    textView.setText("" + (opr1-opr2));
                    break;
                case "*":
                    textView.setText("" + (opr1*opr2));
                    break;
                case "/":
                    textView.setText("" + (opr1/opr2));
                    break;
            }
        }
        firstOpr = !firstOpr;
    };
}
