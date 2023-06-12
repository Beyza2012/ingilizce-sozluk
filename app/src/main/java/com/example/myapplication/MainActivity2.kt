package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.example.myapplication.databinding.ActivityMain2Binding
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding2: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2 = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding2.root)
        val autoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.giris)
        val countries = arrayOf("A blessing in disguise", "Kill two birds with one stone", "Beat around the bush", "Better late than never", "Bite the bullet"
            ,"It takes one to know one","Call it a day","Cut somebody some slack","Go back to the drawing board","Get something out of your system","Don't beat a dead horse"
            ,"Haste makes waste","There are other fish in the sea","Slow and steady wins the race",
            "It's raining cats and dogs","Let the cat out of the bag","Play devil's advocate","Spill the beans")
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, countries)
        autoCompleteTextView.setAdapter(adapter)
        binding2.button.setOnClickListener{
            if(binding2.giris.text.isNotEmpty()){
                var girilenDeyim= binding2.giris.text.toString()
                when(girilenDeyim){
                    "A blessing in disguise" -> binding2.textView.text="Başta kötü gibi görünen iyi bir şey"
                    "Kill two birds with one stone" -> binding2.textView.text="Bir taşla iki kuş vurmak"
                    "Beat around the bush" -> binding2.textView.text="Lafı dolandırmak, genelde nahoş olduğundan dolayı"
                    "Better late than never" -> binding2.textView.text="Bir şeyi hiç yapmamaktansa geç yapmak daha iyi"
                    "Bite the bullet" -> binding2.textView.text="Kaçınılmaz olduğundan dolayı bir şeyi kabullenme"
                    "It takes one to know one" -> binding2.textView.text="Kişi kendinden bilir işi"
                    "Call it a day" -> binding2.textView.text="Bir eylemi sonlandırmak"
                    "Cut somebody some slack" -> binding2.textView.text="Müsamaha etmek"
                    "Go back to the drawing board" -> binding2.textView.text="Sil baştan başlamak"
                    "Get something out of your system" -> binding2.textView.text="Yapmak istediğiniz bir şeyi yapıp aklınızdan çıkarmak"
                    "Don't beat a dead horse" -> binding2.textView.text="Boşa kürek çekmek"
                    "Haste makes waste" -> binding2.textView.text="Acele işe şeytan karışır"
                    "There are other fish in the sea" -> binding2.textView.text="Bir fırsatı kaçırmak sorun değil. Başka fırsatlar doğar."
                    "Slow and steady wins the race" -> binding2.textView.text="İstikrar hızdan daha önemlidir"
                    "It's raining cats and dogs" -> binding2.textView.text="Bardaktan boşanırcasına yağmur yağıyor"
                    "Let the cat out of the bag" -> binding2.textView.text="Bir sırrı ortaya çıkarmak"
                    "Play devil's advocate" -> binding2.textView.text="Şeytanın avukatlığını yapmak"
                    "Spill the beans" -> binding2.textView.text="İyi şanslar"














                    else->{
                        binding2.textView.text="Bulunamadı"
                    }

                }
            }
            else{
                binding2.textView.text="BİR DEYİM GİRİNİZ.."

            }

        }

    }
}