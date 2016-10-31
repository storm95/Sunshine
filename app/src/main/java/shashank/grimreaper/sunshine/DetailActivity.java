package shashank.grimreaper.sunshine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    TextView detailedForecast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        detailedForecast = (TextView)findViewById(R.id.detailedForecast);
        String forecast = getIntent().getCharSequenceExtra("dailyForecast").toString();
        detailedForecast.setText(forecast);
        Toast.makeText(this,forecast,Toast.LENGTH_LONG).show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.forecast_fragment,menu);
        //system.out.println("Hello there!");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.action_settings){
            startActivity(new Intent(this,Settings_activity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}
