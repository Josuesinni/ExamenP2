# ExamenP2


<ImageView 
android.layout_width="300dp"
android.layout_height="300dp"
android.layout_gravity="center"

/>

<Button
android.id="@id+/btnVisitar"
android.layout_width="300dp"
android.layout_height="60dp"
android.text="Visitar"
android.backgroundTint="@color/colorPrimary"
android.textColor="@color/white"
/>

btnVisitar.setOnClickListener{
intent:Intent=Intent(this,Principal,class::java)
intent.startActivity()
}



<LinearLayout
android.layout_width="match_parent"
android.layout_height="100dp"
android.orientation="vertical"
>

<ImageView 
android.layout_width="match_parent"
android.layout_height="match_parent"
android.layout_gravity="center"
/>

<Button
android.id="@id+/btnDetalles"
android.layout_width="300dp"
android.layout_height="60dp"
android.text="Detalles"
android.backgroundTint="@color/colorPrimary"
android.textColor="@color/white"
android.layout_gravity="center"
/>
<Button
android.id="@id+/btnGlobos"
android.layout_width="300dp"
android.layout_height="60dp"
android.text="Globos"
android.backgroundTint="@color/colorPrimary"
android.textColor="@color/white"
android.layout_gravity="center"
/>
<Button
android.id="@id+/btnPeluches"
android.layout_width="300dp"
android.layout_height="60dp"
android.text="Peluches"
android.backgroundTint="@color/colorPrimary"
android.textColor="@color/white"
android.layout_gravity="center"
/>
<Button
android.id="@id+/btnRegalos"
android.layout_width="300dp"
android.layout_height="60dp"
android.text="Regalos"
android.backgroundTint="@color/colorPrimary"
android.textColor="@color/white"
android.layout_gravity="center"
/>
<Button
android.id="@id+/btnTazas"
android.layout_width="300dp"
android.layout_height="60dp"
android.text="Tazas"
android.backgroundTint="@color/colorPrimary"
android.textColor="@color/white"
android.layout_gravity="center"
/>
</LinearLayout>

