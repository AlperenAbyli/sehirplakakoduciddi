package com.uysalapp.sehirplakakodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.uysalapp.sehirplakakodu.databinding.ActivityGezilecekyerBinding

class gezilecekyer : AppCompatActivity() {
    private lateinit var binding: ActivityGezilecekyerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGezilecekyerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun geri(view: View) {
        val intent = Intent(this@gezilecekyer, baslangic::class.java)
        startActivity(intent)

    }

    fun ist(view: View) {
        val intent = Intent(this@gezilecekyer, istanbul1::class.java)
        startActivity(intent)
    }
    fun ankara(view: View) {
        val intent = Intent(this@gezilecekyer, ankara::class.java)
        startActivity(intent)
    }
    fun malatya(view: View) {
        val intent = Intent(this@gezilecekyer, malatya::class.java)
        startActivity(intent)
    }
    fun yozgat(view: View) {
        val intent = Intent(this@gezilecekyer, yozgat::class.java)
        startActivity(intent)
    }
    fun samsun(view: View) {
        val intent = Intent(this@gezilecekyer, samsun::class.java)
        startActivity(intent)
    }
    fun antalya(view: View) {
        val intent = Intent(this@gezilecekyer, antalya::class.java)
        startActivity(intent)
    }
    fun konya(view: View) {
        val intent = Intent(this@gezilecekyer, konya::class.java)
        startActivity(intent)
    }
    fun giresun(view: View) {
        val intent = Intent(this@gezilecekyer, giresun::class.java)
        startActivity(intent)
    }
    fun denizli(view: View) {
        val intent = Intent(this@gezilecekyer, denizli::class.java)
        startActivity(intent)
    }
    fun sivas(view: View) {
        val intent = Intent(this@gezilecekyer, sivas::class.java)
        startActivity(intent)
    }
    fun amasya(view: View) {
        val intent = Intent(this@gezilecekyer, amasya::class.java)
        startActivity(intent)
    }
    fun adapazari(view: View) {
        val intent = Intent(this@gezilecekyer, adapazari::class.java)
        startActivity(intent)
    }
    fun adiyaman(view: View) {
        val intent = Intent(this@gezilecekyer, adiyaman::class.java)
        startActivity(intent)
    }
    fun afyon(view: View) {
        val intent = Intent(this@gezilecekyer, afyon::class.java)
        startActivity(intent)
    }
    fun agri(view: View) {
        val intent = Intent(this@gezilecekyer, agri::class.java)
        startActivity(intent)
    }
    fun aksaray(view: View) {
        val intent = Intent(this@gezilecekyer, aksaray::class.java)
        startActivity(intent)
    }
    fun edirne(view: View) {
        val intent = Intent(this@gezilecekyer, edirne::class.java)
        startActivity(intent)
    }
    fun canakkale(view: View) {
        val intent = Intent(this@gezilecekyer, canakkale::class.java)
        startActivity(intent)
    }
    fun ordu(view: View) {
        val intent = Intent(this@gezilecekyer, ordu::class.java)
        startActivity(intent)
    }
    fun izmir(view: View) {
        val intent = Intent(this@gezilecekyer, izmir::class.java)
        startActivity(intent)
    }
    fun rize(view: View) {
        val intent = Intent(this@gezilecekyer, rize::class.java)
        startActivity(intent)
    }
    fun nevsehir(view: View) {
        val intent = Intent(this@gezilecekyer, nevsahir::class.java)
        startActivity(intent)
    }
    fun kutahya(view: View) {
        val intent = Intent(this@gezilecekyer, kutahya::class.java)
        startActivity(intent)
    }
    fun trabzon(view: View) {
        val intent = Intent(this@gezilecekyer, trabzon::class.java)
        startActivity(intent)
    }
    fun ardihan(view: View) {
        val intent = Intent(this@gezilecekyer, ardihan::class.java)
        startActivity(intent)
    }
    fun bursa(view: View) {
        val intent = Intent(this@gezilecekyer, bursa::class.java)
        startActivity(intent)
    }
    fun gaziantep(view: View) {
        val intent = Intent(this@gezilecekyer, gaziantep::class.java)
        startActivity(intent)
    }
    fun kars(view: View) {
        val intent = Intent(this@gezilecekyer, kars::class.java)
        startActivity(intent)
    }
    fun kayseri(view: View) {
        val intent = Intent(this@gezilecekyer, kayseri::class.java)
        startActivity(intent)
    }
    fun sinop(view: View) {
        val intent = Intent(this@gezilecekyer, sinop::class.java)
        startActivity(intent)
    }
    fun bartin(view: View) {
        val intent = Intent(this@gezilecekyer, bartin::class.java)
        startActivity(intent)
    }
    fun sakarya(view: View) {
        val intent = Intent(this@gezilecekyer, sakarya::class.java)
        startActivity(intent)
    }
    fun adana(view: View) {
        val intent = Intent(this@gezilecekyer, adana::class.java)
        startActivity(intent)
    }
    fun artvin(view: View) {
        val intent = Intent(this@gezilecekyer, artvin::class.java)
        startActivity(intent)
    }
    fun aydin(view: View) {
        val intent = Intent(this@gezilecekyer, aydin::class.java)
        startActivity(intent)
    }
    fun balikesir(view: View) {
        val intent = Intent(this@gezilecekyer, balikesir::class.java)
        startActivity(intent)
    }
    fun batman(view: View) {
        val intent = Intent(this@gezilecekyer, batman::class.java)
        startActivity(intent)
    }
    fun bayburt(view: View) {
        val intent = Intent(this@gezilecekyer, bayburt::class.java)
        startActivity(intent)
    }
    fun bilecik(view: View) {
        val intent = Intent(this@gezilecekyer, bilecik::class.java)
        startActivity(intent)
    }
    fun bingol(view: View) {
        val intent = Intent(this@gezilecekyer, bingol::class.java)
        startActivity(intent)
    }
    fun bolu(view: View) {
        val intent = Intent(this@gezilecekyer, bolu::class.java)
        startActivity(intent)
    }
    fun cankiri(view: View) {
        val intent = Intent(this@gezilecekyer, cankiri::class.java)
        startActivity(intent)
    }
    fun corum(view: View) {
        val intent = Intent(this@gezilecekyer, corum::class.java)
        startActivity(intent)
    }
    fun diyarbakir(view: View) {
        val intent = Intent(this@gezilecekyer, diyarbakir::class.java)
        startActivity(intent)
    }
    fun duzce(view: View) {
        val intent = Intent(this@gezilecekyer, duzce::class.java)
        startActivity(intent)
    }
    fun elazig(view: View) {
        val intent = Intent(this@gezilecekyer, elazig::class.java)
        startActivity(intent)
    }
    fun erzincan(view: View) {
        val intent = Intent(this@gezilecekyer, erzincan::class.java)
        startActivity(intent)
    }
    fun erzurum(view: View) {
        val intent = Intent(this@gezilecekyer, erzurum::class.java)
        startActivity(intent)
    }
    fun eskisehir(view: View) {
        val intent = Intent(this@gezilecekyer, eskisehir::class.java)
        startActivity(intent)
    }
    fun gumushane(view: View) {
        val intent = Intent(this@gezilecekyer, gumushane::class.java)
        startActivity(intent)
    }
    fun hakkari(view: View) {
        val intent = Intent(this@gezilecekyer, hakkari::class.java)
        startActivity(intent)
    }
    fun hatay(view: View) {
        val intent = Intent(this@gezilecekyer, hatay::class.java)
        startActivity(intent)
    }
    fun igdir(view: View) {
        val intent = Intent(this@gezilecekyer, igdir::class.java)
        startActivity(intent)
    }
    fun isparta(view: View) {
        val intent = Intent(this@gezilecekyer, isparta::class.java)
        startActivity(intent)
    }
    fun kahramanmaras(view: View) {
        val intent = Intent(this@gezilecekyer, kahramanmaras::class.java)
        startActivity(intent)
    }
    fun karabuk(view: View) {
        val intent = Intent(this@gezilecekyer, karabuk::class.java)
        startActivity(intent)
    }
    fun karaman(view: View) {
        val intent = Intent(this@gezilecekyer, karaman::class.java)
        startActivity(intent)
    }
    fun kastamonu(view: View) {
        val intent = Intent(this@gezilecekyer, kastamonu::class.java)
        startActivity(intent)
    }
    fun kirikkale(view: View) {
        val intent = Intent(this@gezilecekyer, kirikkale::class.java)
        startActivity(intent)
    }
    fun kirklareli(view: View) {
        val intent = Intent(this@gezilecekyer, kirklareli::class.java)
        startActivity(intent)
    }
    fun kirsehir(view: View) {
        val intent = Intent(this@gezilecekyer, kirsehir::class.java)
        startActivity(intent)
    }
    fun kocaeli(view: View) {
        val intent = Intent(this@gezilecekyer, kocaeli::class.java)
        startActivity(intent)
    }
    fun manisa(view: View) {
        val intent = Intent(this@gezilecekyer, manisa::class.java)
        startActivity(intent)
    }
    fun mardin(view: View) {
        val intent = Intent(this@gezilecekyer, mardin::class.java)
        startActivity(intent)
    }
    fun mersin(view: View) {
        val intent = Intent(this@gezilecekyer, mersin::class.java)
        startActivity(intent)
    }
    fun mugla(view: View) {
        val intent = Intent(this@gezilecekyer, mugla::class.java)
        startActivity(intent)
    }
    fun mus(view: View) {
        val intent = Intent(this@gezilecekyer, mus::class.java)
        startActivity(intent)
    }
    fun nigde(view: View) {
        val intent = Intent(this@gezilecekyer, nigde    ::class.java)
        startActivity(intent)
    }
    fun osmaniye(view: View) {
        val intent = Intent(this@gezilecekyer, osmaniye    ::class.java)
        startActivity(intent)
    }
    fun sanliurfa(view: View) {
        val intent = Intent(this@gezilecekyer, sanliurfa    ::class.java)
        startActivity(intent)
    }
    fun siirt(view: View) {
        val intent = Intent(this@gezilecekyer, siirt    ::class.java)
        startActivity(intent)
    }
    fun sirnak(view: View) {
        val intent = Intent(this@gezilecekyer, sirnak    ::class.java)
        startActivity(intent)
    }
    fun tekirdag(view: View) {
        val intent = Intent(this@gezilecekyer, tekirdag    ::class.java)
        startActivity(intent)
    }
    fun tokat(view: View) {
        val intent = Intent(this@gezilecekyer, tokat   ::class.java)
        startActivity(intent)
    }
    fun tunceli(view: View) {
        val intent = Intent(this@gezilecekyer, tunceli   ::class.java)
        startActivity(intent)
    }
    fun usak(view: View) {
        val intent = Intent(this@gezilecekyer, usak   ::class.java)
        startActivity(intent)
    }
    fun van(view: View) {
        val intent = Intent(this@gezilecekyer, van   ::class.java)
        startActivity(intent)
    }
    fun yalova(view: View) {
        val intent = Intent(this@gezilecekyer, yalova   ::class.java)
        startActivity(intent)
    }
    fun zonguldak(view: View) {
        val intent = Intent(this@gezilecekyer, zonguldak   ::class.java)
        startActivity(intent)
    }
}

