package nhungltpk00606_lab5.com;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import nhungltpk00606_lab5_adapter.com.*;
import nhungltpk00606_lab5_model.com.DBModel;
import manhinhdieukhienen.com.R;

public class lab5 extends Activity {
	ListView lvDb;
	ArrayList<DBModel> danhsachdanhba;
	DBAdapter danhbaadapter;
	@Override
	protected void onChildTitleChanged(Activity childActivity, CharSequence title) {
		// TODO Auto-generated method stub
		super.onChildTitleChanged(childActivity, title);
		setContentView(R.layout.activity_lab5);
		lvDb=(ListView)findViewById(R.id.listViewDanhba);
		danhsachdanhba=new ArrayList<DBModel>();
		danhsachdanhba.add(new DBModel( 1,"BABY","0193364523"));
		danhsachdanhba.add(new DBModel(2,"LALALLA","0193364523"));
		danhsachdanhba.add(new DBModel(3,"KKKK","0193364523"));
		danhsachdanhba.add(new DBModel(4,"HHHH","0193364523"));
		danhbaadapter=new DBAdapter(lab5.this,R.layout.item_new,danhsachdanhba);
		lvDb.setAdapter(danhbaadapter);
	}
}
