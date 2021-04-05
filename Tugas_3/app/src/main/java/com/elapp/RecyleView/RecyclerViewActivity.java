package com.elapp.RecyleView;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private MahasiswaAdapter mAdapter;
    private RecyclerView rvMahasiswa;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);

        mAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        rvMahasiswa.setAdapter(mAdapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("DaroQutnie Alfarizy", "E41191975", "jember"));
        mahasiswaArrayList.add(new Mahasiswa("Figo Fajar Yulianto", "E41191965", "Trenggalek"));
        mahasiswaArrayList.add(new Mahasiswa("M. Devan Ferdiansyah", "E41191971", "Jember"));
        mahasiswaArrayList.add(new Mahasiswa("Alga Saputra", "E41192340", "Banyuwangi"));
        mahasiswaArrayList.add(new Mahasiswa("Rifqi Rosyid Erdiansyah", "E41192306", "Jember"));
        mahasiswaArrayList.add(new Mahasiswa("Rifky Roudana Imani Cahya", "E41192307", "Jember"));
        mahasiswaArrayList.add(new Mahasiswa("Ilmi Azmi Iradiyah", "E41192330", "Jember"));
        mahasiswaArrayList.add(new Mahasiswa("Mita Unziah Fajrina", "E41192433", "Surabaya"));
        mahasiswaArrayList.add(new Mahasiswa("Indra Prasetya", "E41192478", "Banyuwangi"));
        mahasiswaArrayList.add(new Mahasiswa("Dimas Cahya Ramadhan", "E41192208", "Jember"));
    }
}