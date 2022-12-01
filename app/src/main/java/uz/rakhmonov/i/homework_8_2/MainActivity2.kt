package uz.rakhmonov.i.homework_8_2

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.rakhmonov.i.homework_8_2.databinding.ActivityMain2Binding
import uz.rakhmonov.i.homework_8_2.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnBlue.setOnClickListener {
            Data.color = "#4C70F1"
            binding.bMirror.setBackgroundColor(Color.parseColor(Data.color))
        }
        binding .btnGreen. setOnClickListener {
            Data.color = "#FF48D611"
            binding.bMirror.setBackgroundColor(Color.parseColor(Data.color))
        }
        binding . btnBlack . setOnClickListener {
            Data.color = "#FF000000"
            binding.bMirror.setBackgroundColor(Color.parseColor(Data.color))
        }
        binding . btnWhite . setOnClickListener {
            Data.color = "#FFFFFF"
            binding.bMirror.setBackgroundColor(Color.parseColor(Data.color))
        }
        binding . btnRed . setOnClickListener {
            Data.color = "#B71C1C"
            binding.bMirror.setBackgroundColor(Color.parseColor(Data.color))
        }
        binding . btnYellow . setOnClickListener {
            Data.color = "#F1D206"
            binding.bMirror.setBackgroundColor(Color.parseColor(Data.color))
        }


    }
}