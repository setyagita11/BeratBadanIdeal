package com.zubet.bbideal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var Nama : EditText
    private lateinit var Tinggi : EditText
    private lateinit var rbPerempuan : RadioButton
    private lateinit var rbLaki : RadioButton
    private lateinit var proses : Button
    private lateinit var hasil : TextView
    private var beratBadan : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Nama = findViewById(R.id.nama)
        Tinggi = findViewById(R.id.tinggi_badan)
        rbPerempuan = findViewById(R.id.rb_perempuan)
        rbLaki = findViewById(R.id.rb_laki)
        proses = findViewById(R.id.btn_proses)
        hasil = findViewById(R.id.txt_hasil)

        proses.setOnClickListener {
            var nama = Nama.text.toString()

            //membuat variabel tinggi dan mengkonversi tipe data text menjadi integer
            var tinggi = Tinggi.text.toString().toInt()

            //percabangan
            if(rbPerempuan.isChecked ){
                //rumus berat badan ideal Perempuan
                beratBadan = (tinggi - 100) - ((tinggi - 100) * 15/100)
                hasil.setText("nama : $nama \nberat badan ideal : "+ beratBadan.toString() + "kg")
            }

            else if(rbLaki.isChecked ){
                //rumus berat badan ideal Perempuan
                beratBadan = (tinggi - 100) - ((tinggi - 100) * 10/100)
                hasil.setText("nama : $nama \nberat badan ideal : "+ beratBadan.toString() + "kg")
            }
            else {
                hasil.setText("Pilih jenis kelamin terlebih dahulu")
            }
        }
    }

    private fun test(){
        val a = 0
    }

}

