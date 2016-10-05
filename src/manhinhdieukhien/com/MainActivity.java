package manhinhdieukhien.com;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import manhinhdieukhienen.com.R;
import nhungltpk00606_lab1.com.lab1;
import nhungltpk00606_lab2.com.lab2;
import nhungltpk00606_lab3.com.lab3;
import nhungltpk00606_lab4.com.lab4;
import nhungltpk00606_lab5.com.lab5;
import nhungltpk00606_lab6.com.lab6;
import nhungltpk00606_lab7.com.lab7;
import nhungltpk00606_lab8.com.lab8;

public class MainActivity extends Activity implements OnClickListener{
	Button btnlab1,btnlab2,btnlab3,btnlab4,btnlab5,btnlab6,btnlab7,btnlab8;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnlab1=(Button)findViewById(R.id.btnlab1);
		btnlab2=(Button)findViewById(R.id.btnlab2);
		btnlab3=(Button)findViewById(R.id.btnlab3);
		btnlab4=(Button)findViewById(R.id.btnlab4);
		btnlab5=(Button)findViewById(R.id.btnlab5);
		btnlab6=(Button)findViewById(R.id.btnlab66);
		btnlab7=(Button)findViewById(R.id.btnlab7);
		btnlab8=(Button)findViewById(R.id.btnlab8);
		
		btnlab1.setOnClickListener(this);
		btnlab2.setOnClickListener(this);
		btnlab3.setOnClickListener(this);
		btnlab4.setOnClickListener(this);
		btnlab5.setOnClickListener(this);
		btnlab6.setOnClickListener(this);
		btnlab7.setOnClickListener(this);
		btnlab8.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		if(v==btnlab1){
			Toast.makeText(getApplicationContext(),
					"Lab 1", Toast.LENGTH_LONG).show();
			Intent intent=new Intent(getApplicationContext(),lab1.class);
			startActivity(intent);
		}
		if(v==btnlab2){
			Toast.makeText(getApplicationContext(),
					"Lab 2", Toast.LENGTH_LONG).show();
			Intent intent=new Intent(getApplicationContext(),lab2.class);
			startActivity(intent);
		}
		if(v==btnlab3){
			Toast.makeText(getApplicationContext(),
					"Lab 3", Toast.LENGTH_LONG).show();
			Intent intent=new Intent(getApplicationContext(),lab3.class);
			startActivity(intent);
		}
		if(v==btnlab4){
			Toast.makeText(getApplicationContext(),
					"Lab 4", Toast.LENGTH_LONG).show();
			Intent intent=new Intent(getApplicationContext(),lab4.class);
			startActivity(intent);
		}
		if(v==btnlab5){
			Toast.makeText(getApplicationContext(),
					"Lab 5", Toast.LENGTH_LONG).show();
			Intent intent=new Intent(getApplicationContext(),lab5.class);
			startActivity(intent);
		}
		if(v==btnlab6){
			Toast.makeText(getApplicationContext(),
					"Lab 6", Toast.LENGTH_LONG).show();
			Intent intent=new Intent(getApplicationContext(),lab6.class);
			startActivity(intent);
		}
		if(v==btnlab7){
			Toast.makeText(getApplicationContext(),
					"Lab 7", Toast.LENGTH_LONG).show();
			Intent intent=new Intent(getApplicationContext(),lab7.class);
			startActivity(intent);
		}
		if(v==btnlab8){
			Toast.makeText(getApplicationContext(),
					"Lab 8", Toast.LENGTH_LONG).show();
			Intent intent=new Intent(getApplicationContext(),lab8.class);
			startActivity(intent);
		}
	}	
}
