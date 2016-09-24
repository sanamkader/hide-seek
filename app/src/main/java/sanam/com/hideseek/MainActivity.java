package sanam.com.hideseek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button hideBtn;
    private ImageView hideImg;
    boolean chkstatus=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hideBtn= (Button) findViewById(R.id.button);
        hideImg = (ImageView) findViewById(R.id.imageView);
        hideBtn .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(chkstatus)
                {
                    hideImg.setVisibility(View.INVISIBLE);
                    hideBtn.setText("Show");
                    chkstatus=false;
                }
                else if(!chkstatus)
                {
                    hideImg.setVisibility(View.VISIBLE);
                    hideBtn.setText("Hide");
                    chkstatus=true;

                }

            }
        });

    }
}
