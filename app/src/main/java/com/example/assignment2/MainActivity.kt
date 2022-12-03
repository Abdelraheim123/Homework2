package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ratingTV : TextView = findViewById(R.id.TVrating)
        ratingTV.setOnClickListener{
            var dialog_var = CustomDialogFragment()
            dialog_var.show(supportFragmentManager, "Custom Dialog")
        }

    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
     val inflater = menuInflater
     inflater.inflate(R.menu.my_menu, menu)
     return super.onCreateOptionsMenu(menu)
    }
    fun receiveFeedback(feedback: String){
        val ratingTV : TextView = findViewById(R.id.TVrating)
        ratingTV.text = feedback;
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1 ->Toast.makeText(this, "item 1 selected", Toast.LENGTH_SHORT).show()
            R.id.Drinksmenu -> Toast.makeText(this, "Drinks selected", Toast.LENGTH_SHORT).show()
            R.id.subitem1 -> Toast.makeText(this, "pepsi selected", Toast.LENGTH_SHORT).show()
            R.id.subitem2 -> Toast.makeText(this, "7up  selected", Toast.LENGTH_SHORT).show()
            R.id.subitem3 -> Toast.makeText(this, "mirinda  selected", Toast.LENGTH_SHORT).show()
            R.id.subitem4 -> Toast.makeText(this, "mountain dew selected", Toast.LENGTH_SHORT).show()
            R.id.snacksmenu -> Toast.makeText(this, "Snacks selected", Toast.LENGTH_SHORT).show()
            R.id.subitem5 -> Toast.makeText(this, "shawirma selected", Toast.LENGTH_SHORT).show()
            R.id.subitem6 -> Toast.makeText(this, "flafel selected", Toast.LENGTH_SHORT).show()
            R.id.subitem7 -> Toast.makeText(this, "pizza selected", Toast.LENGTH_SHORT).show()
            R.id.subitem8 -> Toast.makeText(this, "Burger selected", Toast.LENGTH_SHORT).show()

        }
        return true;
    }


}
