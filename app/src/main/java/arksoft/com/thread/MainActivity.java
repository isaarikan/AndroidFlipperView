package arksoft.com.thread;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
Button btngeri,btnileri,btnoto;
    ViewFlipper flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flipper=(ViewFlipper)findViewById(R.id.flipper);
        btngeri=(Button)findViewById(R.id.bgeri);
        btnileri=(Button)findViewById(R.id.bileri);
        btnoto=(Button)findViewById(R.id.botomatik);

        
      btngeri.setOnClickListener(this);
        btnileri.setOnClickListener(this);
        btnoto.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.bgeri:
                //Eğer otomatik durumdaysa önce durdur sonra geri durumu göster
                if(flipper.isFlipping()){
                    flipper.stopFlipping();
                    flipper.showPrevious();

                }
                break;

            case R.id.bileri:
                //Eğer otomatik durumdaysa durdur sonra ileri durumu göster
                if(flipper.isFlipping())
                    flipper.stopFlipping();
                    flipper.showPrevious();
                flipper.showNext();

            case R.id.botomatik:
                //2 saniyede bir içeriği değiştir
                flipper.setFlipInterval(2000);
                flipper.startFlipping();
                break;

        }

    }
}
