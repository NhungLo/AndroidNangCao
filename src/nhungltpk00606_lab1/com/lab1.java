package nhungltpk00606_lab1.com;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import manhinhdieukhienen.com.R;

public class lab1 extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab1);
		String doc="https://drive.google.com/a/fpt.edu.vn/file/d/0B2g1dUd4JQBBc0V6bWpweHdUT1E/view?usp=sharing";
		WebView wv =(WebView)findViewById(R.id.webViewbtlb1);
		wv.getSettings().setJavaScriptEnabled(true);
		wv.getSettings().setAllowFileAccess(true);
		wv.getSettings().setLoadsImagesAutomatically(true);
		
		wv.loadUrl(doc);
		
		
	}
}
