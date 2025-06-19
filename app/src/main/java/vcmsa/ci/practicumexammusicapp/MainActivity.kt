package vcmsa.ci.practicumexammusicapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Parallel Arrays
    var songsTitle= arrayOf( "Hade","WOZA","Jandas1","KabzaChants")
    var artistName= arrayOf("Mr JazziQ","Lady Du","Jandas"," Kabza De Samll")
    var ratings= arrayOf(2,4,3,5)
    var comments=arrayOf("Amaptiano Love Song, 2019"
        ,"Amaptiano ,2019"
        ,"Amapiano Goove song "
        ,"Amapiano Spiritual song , 2024 " )

    lateinit var txtSongs: TextView
    lateinit var txtArtistName: TextView
    lateinit var txtRating: TextView
    lateinit var txtComments: TextView



    var butPlayList_: Button? =null
    var butSearch_: Button? =null
    lateinit var butExit_: Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        // Initialize input
        txtSongs = findViewById<TextView>(R.id.txtSong_)
        txtArtistName = findViewById<TextView>(R.id.txtArtistName_)
        txtRating =findViewById<TextView>(R.id.txtRatings_)
        txtComments =findViewById<TextView>(R.id.txtComments_)

        butPlayList_=findViewById<Button>(R.id.butPlayList)
        butSearch_=findViewById<Button>(R.id.butSearch)
        butExit_=findViewById<Button>(R.id.exitAppBut)


        //Add the Artist Name and song Title
        butPlayList_!!.setOnClickListener {

            val song = txtSongs.toString()
            val  artistName_ = txtArtistName.toString()
            val comments = txtComments.toString()
            val ratings = ratings.toString()



            if (song.isEmpty() || artistName_.isEmpty()){
                Toast.makeText(this,"Please fill in the Artist Name ande Name/Tiltle of Song",
                    Toast.LENGTH_SHORT).show()

            }




            // Handle Next button click
            butSearch_!!.setOnClickListener {
            }

            if ( song == null) {
                Toast.makeText(this, "Please Enter the song titler.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

                if (artistName == null) {
                    Toast.makeText(this, "Please Enter the Artist Name.", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener

                }

                // Exit app button
                butExit_!!.setOnClickListener {
                    finishAffinity() // Closes all Activities and exits
                }
            }


                ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main1)) { v, insets ->
                    val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                    v.setPadding(
                        systemBars.left,
                        systemBars.top,
                        systemBars.right,
                        systemBars.bottom
                    )
                    insets
                }
            }
