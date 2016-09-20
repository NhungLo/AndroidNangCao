package nhungltpk00606_lab2.com;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import manhinhdieukhienen.com.R;

public class lab2 extends Activity{
//	private static final BroadcastReceiver Receiver = null;
//	Button btnLoginlab2;
//	@Override
//	protected void onCreate(Bundle savedInstanceState) {
//		// TODO Auto-generated method stub
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_lab2);
//		//bài tập lab 2
//		
//		
//				btnLoginlab2=(Button)findViewById(R.id.btnLoginlab2);
//				
//				//tạo broadcast receiver 
//				
//				BroadcastReceiver receiver=new BroadcastReceiver(){
//
//					@Override
//					public void onReceive(Context context, Intent intent) {
//						ConnectivityManager connectivityManager =(ConnectivityManager)context.getSystemService(context.CONNECTIVITY_SERVICE);
//						if(connectivityManager.getActiveNetworkInfo()!=null){
//							btnLoginlab2.setEnabled(true);
//							Toast.makeText(getBaseContext(), "wifi true", Toast.LENGTH_LONG).show();
//						}else{
//							btnLoginlab2.setEnabled(false);
//							Toast.makeText(getBaseContext(), "wifi false", Toast.LENGTH_LONG).show();
//						}
//						
//					}
//					
//				
//			};
//	}
//
//	@Override
//	protected void onResume() {
//		// TODO Auto-generated method stub
//		super.onResume();
//		IntentFilter filterWifi=new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
//		registerReceiver(Receiver, filterWifi);
//	}
//	
//	@Override
//	protected void onPause() {
//		// TODO Auto-generated method stub
//		super.onPause();
//		if(Receiver!=null)
//			unregisterReceiver(Receiver);
//	}
}

