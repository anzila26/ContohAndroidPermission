package anzila.binar.contohandroidpermission

import android.content.Context
import android.net.wifi.WifiManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import anzila.binar.contohandroidpermission.databinding.ActivityWifiBinding

class WifiActivity : AppCompatActivity() {
    lateinit var binding : ActivityWifiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWifiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "NormalPermission(Wifi)"

        binding.buttonOn.setOnClickListener {
            val wifiManager = applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
            wifiManager.isWifiEnabled = true
            Toast.makeText(this, "Wifi enabled", Toast.LENGTH_SHORT).show()
        }

        binding.buttonOff.setOnClickListener {
            val wifiManager = applicationContext.getSystemService(Context.WIFI_SERVICE) as WifiManager
            wifiManager.isWifiEnabled = false
            Toast.makeText(this, "Wifi disabled", Toast.LENGTH_SHORT).show()
        }
    }
}