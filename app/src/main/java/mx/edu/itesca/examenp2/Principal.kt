package mx.edu.itesca.examenp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_principal)

        val btnDetalles=findViewById<Button>(R.id.btnDetalles)
        btnDetalles.setOnClickListener{
            val intent = Intent(this,Regalos::class.java)
            intent.putExtra("titulo","Detalles")
            startActivity(intent)
        }
        val btnGlobos=findViewById<Button>(R.id.btnGlobos)
        btnGlobos.setOnClickListener{
            val intent = Intent(this,Regalos::class.java)
            intent.putExtra("titulo","Globos")
            startActivity(intent)
        }
        val btnPeluches=findViewById<Button>(R.id.btnPeluches)
        btnPeluches.setOnClickListener{
            val intent = Intent(this,Regalos::class.java)
            intent.putExtra("titulo","Peluches")
            startActivity(intent)
        }
        val btnRegalos=findViewById<Button>(R.id.btnRegalos)
        btnRegalos.setOnClickListener{
            val intent = Intent(this,Regalos::class.java)
            intent.putExtra("titulo","Regalos")
            startActivity(intent)
        }
        val btnTazas=findViewById<Button>(R.id.btnTazas)
        btnTazas.setOnClickListener{
            val intent = Intent(this,Regalos::class.java)
            intent.putExtra("titulo","Tazas")
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}