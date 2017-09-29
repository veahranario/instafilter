package co.blackfintech.instafilter.activities

import android.content.Intent
import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import co.blackfintech.instafilter.R
import kotlinx.android.synthetic.main.activity_splash.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.startActivity

////////////////////////////////////////////////////////////////////////////////////////////////////
class SplashActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_splash)

    val billabong = Typeface.createFromAsset(assets, "font/billabong.ttf")
    logoText.typeface = billabong

    Handler().postDelayed({

      val intent = intentFor<MainActivity>()
      intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
      startActivity(intent)
      finish()
    }, 2000)
  }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
