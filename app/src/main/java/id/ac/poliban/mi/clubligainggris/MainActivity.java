package id.ac.poliban.mi.clubligainggris;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Club> clubs = new ArrayList<>();
    private ListView lvClub;
    private BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //koneksikan object dengan view
        lvClub = findViewById(R.id.listview);

        //ambil data dari MakananData dan berikan ke object Clubs
        clubs.addAll(ClubData.getAllClubs());

        //buat object adapter dan kirim data makanans sebagai
        //parameter di konstruktor ClubAdapter()
        adapter = new ClubAdapter(clubs);
        //pasang object adapter sebagai adapter lvClub
        lvClub.setAdapter(adapter);

        //menambahkan kejadian ketika user mengklik salah satu item
        lvClub.setOnItemClickListener((parent, view, position, id) -> {
            new AlertDialog.Builder(this)
                    .setTitle("Info")
                    .setMessage(clubs.get(position).toString())
                    .setPositiveButton("OK", null).show();
        });
    }
}