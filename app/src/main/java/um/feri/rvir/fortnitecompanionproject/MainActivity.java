package um.feri.rvir.fortnitecompanionproject;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;

import org.json.JSONObject;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import um.feri.rvir.fortnitecompanionproject.parserUtils.IgralecFull;
import um.feri.rvir.fortnitecompanionproject.parserUtils.IgralecSimplifier;
import um.feri.rvir.fortnitecompanionproject.parserUtils.IgralecSimple;


public class MainActivity extends AppCompatActivity {

    private TextView textViewStatus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewStatus = findViewById(R.id.textViewStatus);
        /*
        * Zapa malo mi nekaj
         */

        List<IgralecSimple> igralecSimpleList = IgralecSimple.listAll(IgralecSimple.class);
        if(igralecSimpleList == null || igralecSimpleList.size() == 0){
            new IgralecSimple().save();
        }
    }

    public void poizveduj(View view) {

        final String IGRALEC = "Podpli";

        PoizvedujPoIgralcuTash task = new PoizvedujPoIgralcuTash();
        task.execute(IGRALEC);

    }

    private class PoizvedujPoIgralcuTash extends AsyncTask<String, Integer, Object> {

        @Override
        protected Object doInBackground(String... strings) {
            try {
                OkHttpClient client = new OkHttpClient();

                Request request = new Request.Builder()
                        .header("TRN-Api-Key", "7e63c718-ce95-41bb-a9fa-231358040752")
                        .url("https://api.fortnitetracker.com/v1/profile/pc/"+strings[0])
                        .build();

                Response response = client.newCall(request).execute();
                String jsonData = response.body().string();

                IgralecFull igralec = new Gson().fromJson(jsonData, IgralecFull.class);
                IgralecSimple igralecSimple = IgralecSimplifier.vPreprostegaIgralca(igralec);
                igralecSimple.save();

                //IgralecSimple igralecPridobljen = (IgralecSimple) IgralecSimple.find(IgralecSimple.class, "accountId = ?", "87dccf37-41bc-42f5-918d-4ff871106a68");

                System.out.println(igralecSimple);

                /*
                JSONObject jsonObject = new JSONObject(jsonData);
                Log.i("INFO JSON:", jsonObject.toString(2));
                */
                return Integer.toString(response.code());
            }catch (Exception e){
                Log.e("NAPAKA", e.getMessage());
                e.printStackTrace();
                return "Neuspelo...";
            }
        }

        @Override
        protected void onPostExecute(Object o) {
            String koda = (String) o;
            textViewStatus.setText(koda);
        }
    }
}
