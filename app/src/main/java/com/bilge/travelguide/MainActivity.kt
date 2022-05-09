package com.bilge.travelguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.bilge.travelguide.databinding.ActivityDetailsBinding
import com.bilge.travelguide.databinding.ActivityMainBinding
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var TravelGuideList : ArrayList<TravelGuide>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        TravelGuideList = ArrayList<TravelGuide>()

        val pisa = TravelGuide("Pisa","Italy","Pisa Kulesi, İtalya'nın kuzeyindeki Pisa şehrinde Piazza dei Miracoli'de (İtalyanca Mucizeler Meydanı) yer alan ve 1063-1090 yıllarında yapılan şehir katedralinin çan kulesi, ana yapıdan ayrı olarak 1173'te yapılmıştır.\n" +
                "\n" +
                "Kule üst üste bindirilmiş yuvarlak 6 sütun dizisinden meydana gelmiştir. 56 metre yüksekliktedir. Üzerine 294 basamaklı bir merdivenle çıkılır. En üstteki çanların bulunduğu 8. kat silindir biçimindedir.\n" +
                "\n" +
                "Kule her yıl milimetrenin onda yedisi kadar (100 yılda 0,7 cm) eğilmektedir. Kulenin şu andaki eğimi 5,5° kadardır.", R.drawable.pisa )
        val colosseum = TravelGuide("Colosseum", "Italy","Kolezyum ya da Flavianus Amfitiyatro, İtalya'nın başkenti Roma'da bulunan oval bir amfitiyatrodur.\n" +
                "\n" +
                "Usta bir komutan olan Vespasianus tarafından MS 72 yılında yapımına başlandı ve MS 80 yılında Titus döneminde tamamlandı. Daha sonraki değişiklikler Domitian hükümdarlığı zamanında yapılmıştır. \n" +
                "\n" +
                "Bugün modern Roma'nın en çok turist çeken yerlerinden biridir. 7 Temmuz 2007 tarihinde, Dünyanın Yeni Yedi Harikası'ndan biri seçildi.", R.drawable.colosseum)
        val eiffel = TravelGuide("Eiffel", "France","Eyfel Kulesi (Fransızca: La tour Eiffel [la tuʀ ɛˈfɛl]), Paris'teki demir kule. Kule, aynı zamanda tüm dünyada Fransa'nın sembolü halini almıştır. İsmini, inşa ettiren Fransız mimar Gustave Eiffel'den alır.\n" +
                "\n" +
                "Eyfel Kulesi 1887 ile 1889 yılları arasında Gustave Eiffel'in firması tarafından, Fransız Devrimi'nin 100. yıl kutlamaları çerçevesinde düzenlenen Expo 1889 Paris fuarının giriş kapısı olarak inşa edilmiştir. Aslında kulenin mimarı Gustave Eiffel değil, İsviçreli Maurice Koechlin 'in siparişi üzerine tasarlayan Stephen Sauvestre'dir. Meslektaşı Emile Nouguier ile beraber ilk tasarımları yapmıştır. ", R.drawable.eiffel)
        val londonBridge = TravelGuide("London Bridge", "UK","Londra Köprüsü (İngilizce: London Bridge), Birleşik Krallık'ın başkenti Londra'da Thames Nehri üzerinde bulunan bir köprüdür. Şehir merkezi ile Southwark semti arasında yer alır.Köprünün bugün bulunduğu yerde yaklaşık 2000 yıl önce Romalılar tarafından da bir köprü inşa edilmiştir. MS 60'larda tahtadan bir köprü ile Thames Nehri'nin iki yakası ilk kez birleştirilmiştir.", R.drawable.londonbridge)
        val angkor = TravelGuide("Angkor","Cambodia","Şehir 1177'de Çampa Krallığı'nın akınlarıyla yıkıldı. Ancak birkaç yıl sonra imparator VII. Jayavarman Campaları yendi ve yeni bir kent yaptı. Buda dinini benimseyerek büyük tanrı Buda'ya adanan ve Bayon adı verilen büyük bir tapınak yaptırdı. Tapınağı çevreleyen 50 kulenin dört tarafında gülümseyen insan figürü vardır.\n"+
                "\n"+ " Kent bugün UNESCO koruması altındadır ve Kamboçya ekonomisine büyük desteği vardır.\n" +
                "\n", R.drawable.angkor)
        val petra = TravelGuide("Petra","Jordan","Petra, Ürdün'ün Lut Gölü ile Akabe Körfezi arasındaki toprakları üzerinde yer alan antik kent.MÖ 400 ile MS 106 yılları arasında Nebatiler'e başkentlik yapmıştır. Roma İmparatorluğu tarafından işgal edilene kadar başkent olarak varlığını sürdürmüştür.\n" + "\n" + "6 Aralık 1985 tarihinde UNESCO tarafından Dünya Kültürel Mirası listesine dahil edilen antik kent, 7 Temmuz 2007 tarihinde ise Dünyanın Yeni Yedi Harikası'ndan biri olarak seçilmiştir.", R.drawable.petra)
        val tacmahal = TravelGuide("Tac Mahal","India","Tac Mahal, Hindistan'ın Agra şehrinde, 1631-1654 yıllarında inşa edilmiş anıt mezardır.\n" +
                "\n" +
                "İslam türbe mimarisinin en önemli eserlerinden birisi olarak kabul edilir. Babür İmparatorluğu'nun 5. hükümdarı Şah Cihan'ın 17 Haziran 1631 tarihinde genç yaşta ölen eşi Ercümend Bânû Begüm (Mümtaz Mahal) için o zamanki imparatorluğun başkenti olan Agra'da Yamuna Nehri'nin kıyısında yaptırılmıştır. Mümtaz Mahal'in ve 1666'da ölen imparator Şah Cihan'ın mezarlarını barındırır.", R.drawable.tacmahal)
        val chillonsatosu = TravelGuide("Chillon Şatosu","Switzerland","Chillon Şatosu ya da Château de Chillon, Veytaux sınırları içerisinde, Cenevre Gölü'nün doğu kıyısında yer alan bir şatodur. Şato Montrö'ya 3 km. mesafede yer alır. Kalenin yapım tarihi kesin olarak bilinmemektedir ancak kalenin ilk yazılı kayıtlarının 1160 veya 1005 olduğu söylenmektedir.", R.drawable.chillonsatosu)
        val jetdeau = TravelGuide("Jet D'eau","Switzerland","İsviçre'nin Cenevre kentinde yer alan bir fıskiyedir. Cenevre Gölü'nün Rhône Nehri'yle birleştiği yerde bulunan Jet d'eau kentin hemen her yerinden izlenebilmektedir.\n" +
                "\n" +
                "Fıskiye 500 kilowattlık iki pompa yardımıyla saniyede 500 litre suyu 140 metre yüksekliğe çıkarmaktadır. Bu işlem sırasında harcanan enerji 1 megawattın üzerindedir.", R.drawable.jetdeau)
        val cliffsofmoher = TravelGuide("Cliffs Of Moher","Ireland","The Cliffs of Moher (İrlandaca:Aillte an Mhothair) İrlanda, Clare Kontluğu'ndaki Burren bölgesinin güneybatı ucunda yer alan deniz kayalıklarıdır. Yaklaşık 14 kilometre (9 mil) boyunca uzanır.\n"+
                "\n"+ "Kayalıklardan ve kulenin tepesinden, ziyaretçiler Galway Körfezi'ndeki Aran Adaları'nı, kuzeyde Galway Kontluğu'nda Maumturks ve Twelve Pins dağ sıralarını ve güneyde Loop Head'i görebilirler. Kayalıklar, yılda yaklaşık 1,5 milyon ziyaretle İrlanda'nın en çok ziyaret edilen turistik yerleri arasında yer almaktadır.", R.drawable.cliffsofmoher)
        val salardeuyuni = TravelGuide("Salar de Uyuni","Bolivia", "Salar de Uyuni, 10.582 km² alanıyla Dünya'nın en büyük tuz göllerinden biri. Bolivya 'nın güneybatısında, 3.653 m yükseklikte bulunur ve Titikaka Gölü ile beraber Altiplano Platosu'nun tabiat açısından doruk noktası olarak kabul edilir. Gündüz ışıldayan aydınlığı geceleri sert ayazı ile daha çok sert buz tutmuş bir göle benzer. Ancak yüründüğünde ayakların altında gıcırdayan buz değil kaba tuz kristalleridir.", R.drawable.salardeuyuni)
        TravelGuideList.add(pisa)
        TravelGuideList.add(colosseum)
        TravelGuideList.add(eiffel)
        TravelGuideList.add(londonBridge)
        TravelGuideList.add(angkor)
        TravelGuideList.add(petra)
        TravelGuideList.add(tacmahal)
        TravelGuideList.add(chillonsatosu)
        TravelGuideList.add(jetdeau)
        TravelGuideList.add(cliffsofmoher)
        TravelGuideList.add(salardeuyuni)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val TravelGuideAdapter = TravelGuideAdapter(TravelGuideList)
        binding.recyclerView.adapter = TravelGuideAdapter

    }
}