package swe.sofolab.myaddtwonumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Addclick(View a){

        if(a.getId()==R.id.clickbuttn){

            EditText a1=(EditText)findViewById(R.id.editText);

            EditText a2=(EditText)findViewById(R.id.editText2);
            int num1,num2;
            num1=Integer.parseInt(a1.getText().toString());
            num2=Integer.parseInt(a2.getText().toString());

            int ans3;
            ans3=num1*50;
            TextView ttt=(TextView)findViewById(R.id.txtanswer3);
            ttt.setText("Third answer:"+ans3);



            int ans=num1*num2;
            TextView t=(TextView)findViewById(R.id.txtanswer);
            t.setText("Total coast is::"+ans);



            if(ans>=100){
                int answer2=ans+5;
                TextView tt=(TextView)findViewById(R.id.txtanswer2);
                tt.setText("Second Answer is here:"+answer2);
            }

            else {
                TextView tt=(TextView)findViewById(R.id.txtanswer2);
                tt.setText("SORRY!");
            }

        }

    }

}
