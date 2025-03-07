package mx.edu.itesca.examenp2

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Regalos : AppCompatActivity() {

    val adaptador=RegalosAdapter()
    val detalles=ArrayList<Detalles>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_regalos)

        val titulo=findViewById<TextView>(R.id.tvTitulo)
        val bundle=intent.extras
        if (bundle!=null){
            titulo.setText(bundle.getString("titulo"))
        }
        cargarDetalles(titulo.text.toString())

        val gridView=findViewById<GridView>(R.id.gridView)
        gridView.adapter=adaptador

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun cargarDetalles(titulo:String){
        when(titulo){
            "Detalles"-> {
                detalles.add(Detalles(R.drawable.cumplebotanas,"280"))
                detalles.add(Detalles(R.drawable.cumplecheve,"320"))
                detalles.add(Detalles(R.drawable.cumpleescolar,"330"))
                detalles.add(Detalles(R.drawable.cumplepaletas,"190"))
                detalles.add(Detalles(R.drawable.cumplesnack,"150"))
                detalles.add(Detalles(R.drawable.cumplevinos,"370"))
            }
            "Globos"->{
                detalles.add(Detalles(R.drawable.globoamor,"240"))
                detalles.add(Detalles(R.drawable.globocumple,"820"))
                detalles.add(Detalles(R.drawable.globofestejo,"260"))
                detalles.add(Detalles(R.drawable.globonum,"760"))
                detalles.add(Detalles(R.drawable.globoregalo,"450"))
                detalles.add(Detalles(R.drawable.globos,"240"))
            }
            "Peluches"->{
                detalles.add(Detalles(R.drawable.peluchemario,"320"))
                detalles.add(Detalles(R.drawable.pelucheminecraft,"320"))
                detalles.add(Detalles(R.drawable.peluchepeppa,"290"))
                detalles.add(Detalles(R.drawable.peluches,"100"))
                detalles.add(Detalles(R.drawable.peluchesony,"330"))
                detalles.add(Detalles(R.drawable.peluchestich,"280"))
                detalles.add(Detalles(R.drawable.peluchevarios,"195"))
            }
            "Regalos"->{
                detalles.add(Detalles(R.drawable.regaloazul,"80"))
                detalles.add(Detalles(R.drawable.regalobebe,"290"))
                detalles.add(Detalles(R.drawable.regalocajas,"140"))
                detalles.add(Detalles(R.drawable.regalocolores,"85"))
                detalles.add(Detalles(R.drawable.regalos,"300"))
                detalles.add(Detalles(R.drawable.regalovarios,"75"))
            }
            "Tazas"->{
                detalles.add(Detalles(R.drawable.tazaabuela,"120"))
                detalles.add(Detalles(R.drawable.tazalove,"120"))
                detalles.add(Detalles(R.drawable.tazaquiero,"260"))
                detalles.add(Detalles(R.drawable.tazas,"280"))
            }
        }
    }
}

class RegalosAdapter:BaseAdapter(){
    val detalles=ArrayList<Detalles>()
    val context=this

    override fun getCount(): Int {
        return detalles.size
    }

    override fun getItem(position: Int): Any {
        return detalles[position]
    }

    override fun getItemId(position: Int): Long {
        return detalles[position].imagen.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val detalle=detalles[position]
        val vista=layoutInflater.inflate(R.layout.activity_regalos,null)


        detalle.imagen
        detalle.precio
        return vista
    }

}