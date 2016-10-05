package nhungltpk00606_lab7.com;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import manhinhdieukhienen.com.R;

public class lab7 extends  Activity{
	EditText editTextSoa, editTextSob, editTextSoc;
	TextView textViewKqptbh;
	Button buttonTinhptbh;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab7);
		editTextSoa=(EditText)findViewById(R.id.editTextSoa);
		editTextSob=(EditText)findViewById(R.id.editTextSob);
		editTextSoc=(EditText)findViewById(R.id.editTextSoc);
		textViewKqptbh=(TextView)findViewById(R.id.textViewKqptbh);
		buttonTinhptbh=(Button)findViewById(R.id.buttonTinhptbh);
		
		buttonTinhptbh.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				int a, b, c;
		        double x1,x2;
		        a = Integer.valueOf(editTextSoa.getText().toString());
		        b = Integer.valueOf(editTextSob.getText().toString());   
		        c = Integer.valueOf(editTextSoc.getText().toString());
		        double dental;
		        dental=(b*b) -(4*a*c);
		      
		        if(a==0){
		            x1=c/b;
		            x2=x1;
		            textViewKqptbh.setText(String.valueOf(x1)+" , "+String.valueOf(x2));
		        }
		        if(dental>0){
		            x1=(-b +Math.sqrt(dental))/(2*a);

		            x2=(-b- Math.sqrt(dental))/(2*a);
		            x1=Math.round(x1);
		            x2=Math.round(x2);
		            textViewKqptbh.setText(String.valueOf(x1)+" , "+String.valueOf(x2));
		        }else
		        if(dental==0){
		            x1= -b/(2*a);
		            x2=x1;
		            x1=Math.round(x1);
		            x2=Math.round(x2);
		           textViewKqptbh.setText(String.valueOf(x1)+" , "+String.valueOf(x2));
		        }else
		        if(dental<0)
		        {
		            Toast.makeText(
		                    getApplicationContext(),
		                    "phương trình vô nghiệm!",
		                    Toast.LENGTH_SHORT).show();
		        }


		    }
		   
		});
	}
	

}
