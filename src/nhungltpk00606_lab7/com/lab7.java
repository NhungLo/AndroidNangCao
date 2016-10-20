package nhungltpk00606_lab7.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import manhinhdieukhienen.com.R;

public class lab7 extends  Activity{
	EditText editTextSoa, editTextSob, editTextSoc;
	TextView txtkqptbh,kkq;
	Button buttonTinhptbh;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab7);
		editTextSoa=(EditText)findViewById(R.id.editTextSoa);
		editTextSob=(EditText)findViewById(R.id.editTextSob);
		editTextSoc=(EditText)findViewById(R.id.editTextSoc);
		kkq=(TextView)findViewById(R.id.txtKqlabbb7);
		txtkqptbh=(TextView)findViewById(R.id.txtKqlabb7);
		buttonTinhptbh=(Button)findViewById(R.id.btntinhkq);
		buttonTinhptbh.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			    Intent intent=new Intent(getApplication(),lab7_ketqua.class);
				int a, b, c;
		        double x1,x2;
		        a = Integer.valueOf(editTextSoa.getText().toString());
		        b = Integer.valueOf(editTextSob.getText().toString());   
		        c = Integer.valueOf(editTextSoc.getText().toString());
		        double dental;
		        dental=(b*b) -(4*a*c);
		      
		        if(dental>0){
		            x1=(-b +Math.sqrt(dental))/(2*a);
		            x2=(-b- Math.sqrt(dental))/(2*a);
		            x1=Math.round(x1);
		            x2=Math.round(x2);
		            intent.putExtra("kq", "pt có 2 nghiệm x1= "+x1+"\nx2="+x2);
			        startActivity(intent);
		        }else
		        if(dental==0){
		            x1= -b/(2*a);
		            x2=x1;
		            x1=Math.round(x1);
		            x2=Math.round(x2);		          
		           intent.putExtra("kq", "pt có 2 nghiệm phân biệt x1="+x1+"\n x2= "+x2);
			        startActivity(intent);
		        }else
		        if(dental<0){   
		            intent.putExtra("kq", "PT vô nghiệm");
			        startActivity(intent);
		        }
		    }  
		});
	}
	

}
