package vcmsa.ci.practicumexammusicapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    var songsTitle= arrayOf( "Hade","WOZA","Jandas1","KabzaChants")
    var artistName= arrayOf("Mr JazziQ","Lady Du","Jandas"," Kabza De Samll")
    var ratings= arrayOf(2,4,3,5)
    var comments=arrayOf("Amaptiano Love Song, 2019"
        ,"Amaptiano ,2019"
        ,"Amapiano Goove song "
        ,"Amapiano Spiritual song , 2024 " )

    var txtAllDetails_: TextView?=null
    var txtRatings: TextView?=null
    var txtComments: TextView?=null

    var butRatings_: Button? = null
    var butReturn: Button? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        txtAllDetails_=findViewById<View>(R.id.txtAllDetails) as TextView
        txtRatings=findViewById<View>(R.id.songRatingsTxt) as TextView
        txtComments=findViewById<View>(R.id.commentsTxt) as TextView

        butReturn= findViewById<View>(R.id.returnBut) as Button
        butRatings_= findViewById<View>(R.id.ratingsBut) as Button










        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}