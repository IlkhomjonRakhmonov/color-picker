package uz.rakhmonov.i.homework_8_2

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.rakhmonov.i.homework_8_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener{
            var intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)


        }

    }

    override fun onResume() {
        super.onResume()

        binding.root.setBackgroundColor(Color.parseColor(Data.color))

    }

}