package com.example.mytoolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.mytoolbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarDemo)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.toolbarDemo.setNavigationOnClickListener {
            Toast.makeText(this,"clicked on navigation button", Toast.LENGTH_SHORT).show()
        }

        supportActionBar?.title = "Hello"
        binding.toolbarDemo.subtitle = "okay"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
          R.id.title1 -> Toast.makeText(this,"clicked on title1", Toast.LENGTH_SHORT).show()
          R.id.title2 -> Toast.makeText(this,"clicked on title2", Toast.LENGTH_SHORT).show()
          R.id.title3 -> Toast.makeText(this,"clicked on title3", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}