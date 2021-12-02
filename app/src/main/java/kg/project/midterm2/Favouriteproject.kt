package kg.project.midterm2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Favouriteproject : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favouriteproject)
        val imageView = findViewById<ImageView>(R.id.Product)
        imageView.setOnClickListener {
            startActivity(Intent(this, Favouriteproject2::class.java))
    }}
}