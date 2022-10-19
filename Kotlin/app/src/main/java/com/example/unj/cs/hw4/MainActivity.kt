package com.example.unj.cs.hw4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.unj.cs.hw4.fragment.FavoriteCoffeeFragment
import com.example.unj.cs.hw4.fragment.ListCoffeeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val coffeeList = listOf<Coffee>(
            Coffee(
                R.drawable.arabika,
                "Arabika",
                "Kopi yang paling populer di dunia.",
                "Kopi arabika ini adalah kopi pertama yang ditemukan oleh bangsa Arab di Ethiopia. Karena bangsa Arab yang menemukan dan menyebarluaskan ke seluruh dunia maka kopi ini dinamakan kopi arabika.\n" +
                        "\n" +
                        "Kopi arabika ini kopi yang paling populer di dunia. Pedagang kopi di dunia lebih banyak menjual kopi arabika dibandingkan kopi yang populer lainnya. Harga kopi ini juga terbilang mahal. Hal ini disebabkan karena perawatan dan penanamannya yang tidak mudah.\n" +
                        "\n" +
                        "Kopi arabika ini memiliki karakteristiknya sendiri. Kopi ini warna hasil seduhannya tidak terlalu kental. Lalu rasanya pun dari tingkat keasaman kopi lebih tinggi daripada tingkat kafein di dalamnya. Kemudian kopi ini lebih wangi dan lebih kaya daripada kopi lainnya."
            ),
            Coffee(
                R.drawable.robusta,
                "Robusta",
                "Kopi ini memiliki aroma yang kuat dan terasa kasar.",
                "Kopi robusta ini adalah varietas dari kopi canephora. Selain robusta, varietas dari canephora ini adalah kopi nganda. Karena sebagian besar kopi canephora adalah varietas kopi robusta maka nama kopi robusta ini digunakan secara umum untuk kopi canephora.\n" +
                        "\n" +
                        "Karakter kopi robusta ini memiliki aroma yang kuat dan terasa kasar. Rasa dari kopi robusta ini juga lebih pahit daripada kopi lainnya. Oleh karena itu, kopi ini cocok untuk dicampur dengan susu dan coklat saat penyajiannya. Dapat dicampur susu dan coklat karena rasa kopi ini tidak akan kalah dengan rasa lainnya."
            ),
            Coffee(
                R.drawable.liberika,
                "Liberika",
                "Kopi ini memiliki ukuran lebih besar daripada kopi arabika dan kopi robusta.",
                "Mungkin penikmat kopi sering mendengar kopi arabika dan robusta. Namun ada kopi lain yang juga populer dan diproduksi di komoditas dunia, yaitu kopi liberika.\n" +
                        "\n" +
                        "Kopi liberika ini memiliki ukuran lebih besar daripada kopi arabika dan kopi robusta. Namun, setelah selesai dengan proses penjemuran, berat buah kering pada kopi ini hanya 10% dari buah basahnya.\n" +
                        "\n" +
                        "Pada awalnya kopi liberika ini memiliki nama kopi excelsa yang hanya ada satu spesies. Namun pada tahun 2006 excelsa diresmikan sebagai subspesies dari liberika dan dikenal dengan nama ilmiah coffea liberica var. Dewwrei."
            ),
            Coffee(
                R.drawable.balikintanami,
                "Bali Kintanami",
                "Kopi yang memiliki daya tarik berasal dari daerah Bali.",
                "Bali juga daerah penghasil kopi yang memiliki daya tarik di dunia. Daerah utama penghasil kopi di Bali adalah Kintamani, Kabupaten Bangli. Kopi Bali Kintamani ini juga tidak kalah dengan kopi-kopi lainnya.\n" +
                        "\n" +
                        "Petani kopi di perkebunan Kintamani menggunakan sistem pertanian tradisional yang bernama subak abian. Subak abian ini memegang filosofi dari agama Hindu yaitu Tri Hita Karana. Filosofi ini mengartikan bahwa ada keharmonisan dalam alam, sehingga kopi yang dibuat ini tidak menggunakan agrokimia dan hasil kopi ini menjadi kopi organik."
            ),
            Coffee(
                R.drawable.gayo,
                "Gayo",
                "Kopi yang kaya cita rasanya yang berasal dari tanah Gayo, Aceh.",
                "Kopi Gayo ini ditanam di tanah Gayo, Aceh. Perkebunan kopi ini terletak di bukit-bukit di sekitar kota Takengon dan berada dekat Danau Tawar. Daerah ini dikenal dengan produksi kopi yang kaya cita rasanya karena didukung dengan tanah yang subur.\n" +
                        "\n" +
                        "Kopi Gayo ini sempat mendapat Fair Trade Certified dari organisasi Internasional Fair Trade Coffee pada tahun 2010. Sebelum nama kopi ini menjadi nama Gayo, sempat ada beberapa masalah karena nama tersebut telah menjadi hak paten dari perusahaan Belanda, yaitu, Holland Coffee. Namun, usaha keras dari masyarakat untuk mendapatkan sertifikasi nama tersebut sehingga masalah dapat terselesaikan, dan nama Gayo resmi dijadikan sebagai salah satu single origin."
            ),
            Coffee(
                R.drawable.papuawamena,
                "Papua Wamena",
                "Aroma pada kopi ini juga memiliki ciri khas dengan sensasi dari bunga yang wangi.",
                "Kopi Papua Wamena ini dibudidayakan di sekitar perkebunan sepanjang lembah Baliem. Lembah tersebut berada di Timur Gunung Jayawijaya yang mengelilingi kota Wamena.\n" +
                        "\n" +
                        "Kopi ini memilik cita rasa yang tidak kalah dengan kopi-kopi lain. Bahkan tingkat adiksi kopi ini juga rendah, sehingga tidak mengakibatkan sakit lambung bagi orang yang baru pertama kali mencoba kopi. Aroma pada kopi ini juga memiliki ciri khas dengan sensasi dari bunga yang wangi."
            ),
            Coffee(
                R.drawable.sidikalang,
                "Sidakalang",
                "kopi Sidikalang ini turunan langsung dari varietas typica.",
                "Kopi Sidikalang ini dibudidayakan di daerah pegunungan Kabupaten Dairi, Sumatra Utara. Nama Sidikalang ini diambil dari daerah tersebut, nama Sidikalang ini cukup terkenal di kalangan pecinta kopi single origin.\n" +
                        "\n" +
                        "Sidikalang ini juga terkenal sebagai varietas dari kopi arabika. Hal yang menarik adalah kopi Sidikalang ini turunan langsung dari varietas typica yang dibudidayakan di Indonesia hasil dari bibit kopi yang pertama kali dibawa oleh Belanda dari sistem tanam paksa."
            ),
            Coffee(
                R.drawable.javapreanger,
                "Java Preanger",
                "Kopi yang dibudidayakan di daerah sekitar Priangan, Jawa Barat.",
                "Kopi Java Preanger ini juga sering disebut sebagai kopi malabar atau juga kopi priangan. Kopi ini adalah kopi pertama yang didatangkan oleh Belanda ke Indonesia. Awal penanaman kopi ini berada di Jakarta, kemudian lama kelamaan dibudidayakan di daerah sekitar Priangan, Jawa Barat.\n" +
                        "\n" +
                        "Nama preanger ini sebenarnya diambil dari nama priangan. Orang Belanda pada masa itu menyebut priangan dengan preanger. Oleh karena itu kopi priangan pada masa sekarang disebut dengan kopi Java Preanger."
            ),
            Coffee(
                R.drawable.mandailing,
                "Mandailing",
                "Salah satu jenis kopi arabika yang ditanam di daerah Sumatera Utara.",
                "Kopi Mandailing ini ditanam di tanah Kabupaten Mandailing Natal, pegunungan Bukit Barisan, Sumatra Utara. Kopi ini termasuk salah satu jenis kopi arabika. Produksi kopi ini sudah berlangsung sejak tahun 1800-an yang bermula dari sistem tanam paksa dari pemerintahan Hindia Belanda."
            ),
            Coffee(
                R.drawable.toraja,
                "Toraja",
                "Kopi dari hasil produksi Toraja ini terkenal dengan tingkat keasaman yang relatif tinggi.",
                "Kopi dari perkebunan tanah Toraja ini juga tidak kalah dengan single origin lainnya. Kopi dari hasil produksi Toraja ini terkenal dengan tingkat keasaman yang relatif tinggi. Beberapa orang menyukai kopi dengan tingkat keasaman yang tinggi seperti ini.\n" +
                        "\n" +
                        "Cita rasa yang didapat dari kopi ini berasal dari pascapanen kopi. Para petani di Toraja menggunakan sistem pertanian tradisional untuk memroses hasil panen kopi dengan proses giling basah. Proses giling basah ini juga terkenal di kalangan internasional dengan nama wet hulling atau semi wet."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_coffee)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = CoffeeAdapter(this, coffeeList){
            val intent = Intent(this, DetailCoffeeActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }

        val listcoffeeFragment = ListCoffeeFragment()
        val favoritecoffeeFragment = FavoriteCoffeeFragment()

        makeCurrentFragment (listcoffeeFragment)

        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_list_coffee -> makeCurrentFragment(listcoffeeFragment)
                R.id.menu_favorite_coffee -> makeCurrentFragment(favoritecoffeeFragment)
            }
            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame_nav, fragment)
            commit()
        }
    }
}