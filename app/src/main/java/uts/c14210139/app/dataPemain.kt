package uts.c14210139.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class dataPemain : AppCompatActivity() {
    lateinit var btn_permainan : Button
    lateinit var nama : TextView
    lateinit var no_hp : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_data_pemain)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        nama = findViewById(R.id.textfield_nama)
        no_hp = findViewById(R.id.textfield_nohp)
        btn_permainan = findViewById(R.id.btn_permainan)
        btn_permainan.setOnClickListener {
            if (nama.text != null && no_hp.text != null) {
                val intentDataPemain = Intent(this@dataPemain, Permainan::class.java).apply {
                    putExtra("nama", nama.text)
                    putExtra("no_hp", no_hp.text)
                }
                startActivity(intentDataPemain)
            }
        }
    }


}