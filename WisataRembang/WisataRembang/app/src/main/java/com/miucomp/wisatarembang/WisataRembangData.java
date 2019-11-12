package com.miucomp.wisatarembang;

import java.util.ArrayList;

public class WisataRembangData {
    private static String[] wisataNama = {
            "Karang Jahe Beach"
            , "Pantai Caruban"
            , "Jembatan Merah Hutan Mangrove"
            , "Gunung Lasem"
            , "Air Terjun Pasucen"
            , "Museum RA Kartini"
            , "Petilasan Sunan Bonang"
            , "Pulau Gede Rembang"
            , "Pulau Karang Gosong"
            , "Kelenteng Cu An Kiong"
    };
    private static String[] wisataLokasi = {
            "Jl. Rembang-Lasem, Punjulharjo, Kecamatan Rembang, Kabupaten Rembang"
            , "Desa Gedong Mulyo, Kecamatan Lasem, Kabupaten Rembang"
            , "Pasarbanggi, Kecamatan Rembang"
            , "Kecamatan Lasem Kabupaten Rembang"
            , "Pasucen, Gunem, Kabupaten Rembang"
            , "Daerah Kutoharjo, Kec. Rembang, Kab. Rembang"
            , "Desa Bonang, Kecamatan Lasem, Kabupaten Rembang"
            , "Desa Wates kecamatan Kaliori Kabupaten Rembang"
            , "Desa Bonang – Lasem – Rembang, Wisata pantai Pulau Gosong Rembang"
            , "Jalan Dasun nomor 19, Lasem, Rembang"
    };
    private static String[] wisataHarga = {
            "Rp 5000 / Orang"
            , "Rp 8000 / Orang"
            , "Rp 10.000 / Mobil"
            , "Gratis"
            , "Rp 5000 / Orang"
            , "Rp 2000 / Orang"
            , "Rp 2000 / Orang"
            , "Rp 250.000"
            , " - "
            , " - "
    };
    private static int[] wisataFoto = {
            R.drawable.karang_jaeh
            , R.drawable.pantai_caruban
            ,R.drawable.jembatan_merah
            ,R.drawable.gunung_lasem
            ,R.drawable.air_terjun_pasucen
            ,R.drawable.museum_ra_kartini
            ,R.drawable.petilasan_sunan_bonang
            ,R.drawable.pulau_gede
            ,R.drawable.pulau_karang
            ,R.drawable.klenteng_cuankiong
    };
    private static String[] wisataDetail={
            "Pantai ini sering disebut sebagai 'Pantai Kuta – nya' Kab. Rembang. Dilengkapi dengan berbagai macam fasilitas dan wahana permainan, Pantai Karang Jahe cocok untuk dikunjungi oleh semua kalangan usia. Penamaan Pantai Karang Jahe ini ditengarai oleh keberadaan batu karang berukuran besar di areal perairan pantai ini yang warnanya mirip seperti warna jahe. ",
            "Garis pantainya tergolong cukup lebar dan panjang. Ombaknya pun relatif cukup tenang, sehingga sangat aman untuk dijadikan sebagai spot untuk berenang dan bermain air. Di bagian pinggirnya Anda akan menemui jajaran pohon cemara yang rimbun dan tertanam dengan rapi. Selain itu ada juga areal saung yang bisa dimanfaatkan sebagai tempat duduk.",
            "Tempat ini menawarkan daya tarik utama berupa jembatan kayu yang membentang di tengah hutan mangrove. Di sini Anda bisa berkeliling areal hutan mangrove sembari melakukan beberapa take foto. Bagi Anda yang hobi memancing, areal jembatan di hutan ini juga sangat pas untuk dijadikan sebagai spot untuk meyalurkan hobi Anda.",
            "Gunung ini memiliki ketinggian sekitar 800 – an meter dengan panorama alam yang luar biasa indah. Dari puncak gunung ini pendaki bisa melihat pemandangan alam dengan view yang sangat luas, yaitu terdiri atas laut jawa di sebelah utara, gunung Muria di sebelah barat dan gunung Lawu di sebelah selatan.",
            "Selain wisata pantai dan pegunungan, Kab. Rembang juga memiliki objek wisata air terjun. Air Terjun Pasucen ini contohnya. Air terjun ini terletak di Daerah Gunem, Desa Pasucen, Kec. Rembang, Kab. Rembang, Jawa Tengah.",
            "Anda tentu sudah tidak asing lagi dengan nama RA Kartini bukan? Ya, beliau merupakan salah seorang pahlawan yang sangat berjasa bagi kaum wanita Indonesia. Nah, seperti yang telah kami sebutkan di atas, Rembang merupakan tempat kelahiran Ibu Kartini. Di sini Anda bisa melihat berbagai macam benda yang pernah digunakan oleh RA Kartini. Bangunan museum ini sendiri bahkan merupakan rumah milik keluarga Beliau yang tentunya merupakan saksi bisu perjuangan beliau.",
            "Petilasan ini menawarkan daya tarik utama berupa makam Sunan Bonang. Untuk Anda yang belum tahu, Sunan Bonang merupakan satu dari sembilan wali yang sangat berjasa dalam proses penyebaran Agama Islam di Pulau Jawa. Nah, jika Anda ingin berziarah ke makam beliau, Anda bisa datang ke tempat ini.",
            "Meskipun dinamai Pulau Gede namun pulau ini hanya berukuran sekitar 1 km persegi saja. Namun dibalik itu terdapat pesona alam yang benar-benar memukau yang sayang untuk dilewatkan jika Anda sedang berada di Rembang mulai dari keindahan pantai pasir putihnya hingga hutan tembakau yang ada disekitarnya. Harga tiket untuk menyebrang ke pulau ini dipatok sebesar Rp. 250.000 dan jika ingin menyewa kapal sendiri akan dikenai biaya Rp. 450.000 dan biaya tersebut sudah termasuk camping. Berikut adalah beberapa informasi lebih lanjut tentang Pulau Gede.",
            "Wisata Pulau Karang Gosong di Lasem Rembang Jawa Tengah merupakan tempat wisata yang harus anda kunjungi karena pesona keindahannya tidak ada duanya. Penduduk lokal daerah  lasem juga sangat ramah tamah terhadap wisatawan lokal maupun wisatawan asing. Pulau Karang Gosong ini juga mempunyai panorama bawah laut yang menawan. Banyak Ikan-ikan karang dengan bentuk yang unik dan cantik berlalu lalang di dalam air yang mana sangat jelas terlihat dari permukaan, biasanya wisatawan senang bersantai diatas perahu sambil melihat ikan-ikan dibawah air laut. Ini bisa dilakukan karena pantai karang Gosong hanya berkedalaman kurang dari 2 m. ",
            "Dibangun dengan sentuhan seni tinggi, Klenteng Cu An Kiong tampak kokoh walau telah berusia ratusan tahun. Tak ada catatan pasti kapan klenteng tertua di Lasem, Rembang, Jawa Tengah itu dibangun. Penjarahan oleh tentara Belanda pada masa penjajahan diyakini turut menghilangkan bukti sejarah tersebut. Namun, menurut cerita bio kong (penjaga klenteng) di Klenteng Cu An Kiong, Irawan, 49 tahun, klenteng ini diperkirakan dibangun sekitar abad ke-16 oleh orang-orang Cina yang berlabuh di Lasem. Menurutnya, untuk material bangunan tidak menggunakan kayu pada kapal, melainkan kayu jati yang kala itu banyak tumbuh di Lasem."
    };
    static ArrayList<WisataRembang> getListData(){
        ArrayList<WisataRembang> list = new ArrayList<>();
        for (int position = 0; position<wisataNama.length;position++){
            WisataRembang wisataRembang = new WisataRembang();
            wisataRembang.setNamaW(wisataNama[position]);
            wisataRembang.setLokasiW(wisataLokasi[position]);
            wisataRembang.setHargaW(wisataHarga[position]);
            wisataRembang.setDetailW(wisataDetail[position]);
            wisataRembang.setFotoW(wisataFoto[position]);
            list.add(wisataRembang);
        }
        return list;
    }
}