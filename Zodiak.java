public class Zodiak {

    public static void main(String[] args) {

        // ===== DATA DIRI =====
        String nama        = "Mila Ulia Sari";
        int tanggalLahir   = 2;
        int bulanLahir     = 12;
        int tahunLahir     = 2005;
        int umur           = 20;
        String bintang     = "Sagitarius";

        // ===== OUTPUT =====
        System.out.println("\n============================================");
        System.out.println("              DATA DIRI                     ");
        System.out.println("============================================");
        System.out.println("Nama           : " + nama);
        System.out.println("Tanggal Lahir  : " + tanggalLahir + "/" + bulanLahir + "/" + tahunLahir);
        System.out.println("Umur           : " + umur + " tahun");
        System.out.println("Bintang        : " + bintang);
        System.out.println("============================================");
        tampilkanKarakter(bintang);
        System.out.println("============================================");

    }

    // ===== TENTUKAN BINTANG =====
    static String tentukanBintang(int bulan, int tanggal) {
        if      ((bulan == 3  && tanggal >= 21) || (bulan == 4  && tanggal <= 19)) return "Aries";
        else if ((bulan == 4  && tanggal >= 20) || (bulan == 5  && tanggal <= 20)) return "Taurus";
        else if ((bulan == 5  && tanggal >= 21) || (bulan == 6  && tanggal <= 20)) return "Gemini";
        else if ((bulan == 6  && tanggal >= 21) || (bulan == 7  && tanggal <= 22)) return "Cancer";
        else if ((bulan == 7  && tanggal >= 23) || (bulan == 8  && tanggal <= 22)) return "Leo";
        else if ((bulan == 8  && tanggal >= 23) || (bulan == 9  && tanggal <= 22)) return "Virgo";
        else if ((bulan == 9  && tanggal >= 23) || (bulan == 10 && tanggal <= 22)) return "Libra";
        else if ((bulan == 10 && tanggal >= 23) || (bulan == 11 && tanggal <= 21)) return "Scorpio";
        else if ((bulan == 11 && tanggal >= 22) || (bulan == 12 && tanggal <= 21)) return "Sagitarius";
        else if ((bulan == 12 && tanggal >= 22) || (bulan == 1  && tanggal <= 19)) return "Capricorn";
        else if ((bulan == 1  && tanggal >= 20) || (bulan == 2  && tanggal <= 18)) return "Aquarius";
        else return "Pisces";
    }

    // ===== TAMPILKAN KARAKTER BINTANG LENGKAP =====
    static void tampilkanKarakter(String bintang) {
        System.out.println("\nKarakter Bintang : " + bintang);

        switch (bintang) {

            case "Aries":
                System.out.println("Tanggal Kalender    : 21 Maret - 19 April");
                System.out.println("Elemen              : Api");
                System.out.println("Warna               : Merah");
                System.out.println("Kualitas            : Kardinal");
                System.out.println("Penguasa Planet     : Mars");
                System.out.println("Kecocokan           : Leo dan Sagitarius");
                System.out.println("Angka Keberuntungan : 1, 8, 17");
                System.out.println("Batu Kelahiran      : Diamond");
                System.out.println("Simbol              : Domba");
                System.out.println("\nDeskripsi:");
                System.out.println("Aries sangat berani dan penuh semangat. Mereka adalah");
                System.out.println("pemimpin alami yang tidak takut mengambil risiko.");
                System.out.println("Mereka selalu bersemangat memulai hal baru.");
                System.out.println("\nKepribadian Aries:");
                System.out.println("- Berani");
                System.out.println("- Energik");
                System.out.println("- Percaya Diri");
                System.out.println("- Optimis");
                System.out.println("- Antusias");
                System.out.println("- Tegas");
                System.out.println("- Spontan");
                break;

            case "Taurus":
                System.out.println("Tanggal Kalender    : 20 April - 20 Mei");
                System.out.println("Elemen              : Tanah");
                System.out.println("Warna               : Hijau");
                System.out.println("Kualitas            : Tetap");
                System.out.println("Penguasa Planet     : Venus");
                System.out.println("Kecocokan           : Virgo dan Capricorn");
                System.out.println("Angka Keberuntungan : 2, 6, 9, 12, 24");
                System.out.println("Batu Kelahiran      : Emerald");
                System.out.println("Simbol              : Banteng");
                System.out.println("\nDeskripsi:");
                System.out.println("Taurus sangat tekun dan sabar. Mereka menghargai");
                System.out.println("kestabilan, kenyamanan, dan keindahan dalam hidup.");
                System.out.println("\nKepribadian Taurus:");
                System.out.println("- Tekun");
                System.out.println("- Sabar");
                System.out.println("- Setia");
                System.out.println("- Dapat Diandalkan");
                System.out.println("- Praktis");
                System.out.println("- Bertanggung Jawab");
                System.out.println("- Stabil");
                break;

            case "Gemini":
                System.out.println("Tanggal Kalender    : 21 Mei - 20 Juni");
                System.out.println("Elemen              : Udara");
                System.out.println("Warna               : Kuning");
                System.out.println("Kualitas            : Mutable");
                System.out.println("Penguasa Planet     : Merkurius");
                System.out.println("Kecocokan           : Libra dan Aquarius");
                System.out.println("Angka Keberuntungan : 5, 7, 14, 23");
                System.out.println("Batu Kelahiran      : Pearl");
                System.out.println("Simbol              : Kembar");
                System.out.println("\nDeskripsi:");
                System.out.println("Gemini sangat cerdas dan komunikatif. Mereka mudah");
                System.out.println("beradaptasi dan selalu ingin tahu tentang segalanya.");
                System.out.println("\nKepribadian Gemini:");
                System.out.println("- Cerdas");
                System.out.println("- Komunikatif");
                System.out.println("- Fleksibel");
                System.out.println("- Kreatif");
                System.out.println("- Ceria");
                System.out.println("- Ingin Tahu");
                System.out.println("- Ekspresif");
                break;

            case "Cancer":
                System.out.println("Tanggal Kalender    : 21 Juni - 22 Juli");
                System.out.println("Elemen              : Air");
                System.out.println("Warna               : Putih");
                System.out.println("Kualitas            : Kardinal");
                System.out.println("Penguasa Planet     : Bulan");
                System.out.println("Kecocokan           : Taurus dan Virgo");
                System.out.println("Angka Keberuntungan : 2, 3, 15, 20");
                System.out.println("Batu Kelahiran      : Ruby");
                System.out.println("Simbol              : Kepiting");
                System.out.println("\nDeskripsi:");
                System.out.println("Cancer sangat emosional dan sentimental. Mereka menghargai");
                System.out.println("rumah, keluarga, dan kenyamanan, yang sering kali membuat");
                System.out.println("mereka menjadi pengasuh dan pengasuh terbaik. Namun, ini");
                System.out.println("bukan hanya tentang orang lain; mereka juga memastikan bahwa");
                System.out.println("mereka merasa aman dan nyaman. Mereka memiliki intuisi yang");
                System.out.println("kuat, membuat mereka menjadi teman yang sangat baik yang");
                System.out.println("dapat memahami dan menawarkan bantuan di saat krisis.");
                System.out.println("\nDengan kualitas utama mereka, Cancer adalah pemimpin yang");
                System.out.println("sangat baik dalam membuat semua orang merasa menjadi bagian");
                System.out.println("dari keluarga. Meskipun mereka mungkin tidak mencari");
                System.out.println("kepemimpinan, mereka menggunakannya untuk melindungi dan");
                System.out.println("merawat orang lain saat mereka berada di posisi tersebut.");
                System.out.println("\nKepribadian Cancer:");
                System.out.println("- Sangat Intuitif");
                System.out.println("- Sangat Emosional");
                System.out.println("- Protektif");
                System.out.println("- Penyayang");
                System.out.println("- Ulet");
                System.out.println("- Imajinatif");
                System.out.println("- Simpatik");
                System.out.println("- Kekuatan Kanker");
                break;

            case "Leo":
                System.out.println("Tanggal Kalender    : 23 Juli - 22 Agustus");
                System.out.println("Elemen              : Api");
                System.out.println("Warna               : Emas, Oranye");
                System.out.println("Kualitas            : Tetap");
                System.out.println("Penguasa Planet     : Matahari");
                System.out.println("Kecocokan           : Aries dan Sagitarius");
                System.out.println("Angka Keberuntungan : 1, 3, 10, 19");
                System.out.println("Batu Kelahiran      : Peridot");
                System.out.println("Simbol              : Singa");
                System.out.println("\nDeskripsi:");
                System.out.println("Leo adalah pemimpin yang karismatik dan percaya diri.");
                System.out.println("Mereka menyukai sorotan dan memiliki semangat besar");
                System.out.println("dalam menginspirasi orang lain.");
                System.out.println("\nKepribadian Leo:");
                System.out.println("- Percaya Diri");
                System.out.println("- Karismatik");
                System.out.println("- Dermawan");
                System.out.println("- Loyal");
                System.out.println("- Ambisius");
                System.out.println("- Antusias");
                System.out.println("- Bersemangat");
                break;

            case "Virgo":
                System.out.println("Tanggal Kalender    : 23 Agustus - 22 September");
                System.out.println("Elemen              : Tanah");
                System.out.println("Warna               : Abu-abu, Biru Muda");
                System.out.println("Kualitas            : Mutable");
                System.out.println("Penguasa Planet     : Merkurius");
                System.out.println("Kecocokan           : Taurus dan Capricorn");
                System.out.println("Angka Keberuntungan : 5, 14, 15, 23, 32");
                System.out.println("Batu Kelahiran      : Sapphire");
                System.out.println("Simbol              : Gadis");
                System.out.println("\nDeskripsi:");
                System.out.println("Virgo sangat teliti dan analitis. Mereka selalu");
                System.out.println("berusaha mencapai kesempurnaan dalam setiap hal.");
                System.out.println("\nKepribadian Virgo:");
                System.out.println("- Teliti");
                System.out.println("- Analitis");
                System.out.println("- Praktis");
                System.out.println("- Setia");
                System.out.println("- Rendah Hati");
                System.out.println("- Pekerja Keras");
                System.out.println("- Terorganisir");
                break;

            case "Libra":
                System.out.println("Tanggal Kalender    : 23 September - 22 Oktober");
                System.out.println("Elemen              : Udara");
                System.out.println("Warna               : Merah Muda, Hijau");
                System.out.println("Kualitas            : Kardinal");
                System.out.println("Penguasa Planet     : Venus");
                System.out.println("Kecocokan           : Gemini dan Aquarius");
                System.out.println("Angka Keberuntungan : 4, 6, 13, 15, 24");
                System.out.println("Batu Kelahiran      : Opal");
                System.out.println("Simbol              : Timbangan");
                System.out.println("\nDeskripsi:");
                System.out.println("Libra sangat adil dan suka harmoni. Mereka pandai");
                System.out.println("berdiplomasi dan selalu berusaha menyeimbangkan setiap situasi.");
                System.out.println("\nKepribadian Libra:");
                System.out.println("- Adil");
                System.out.println("- Diplomatis");
                System.out.println("- Ramah");
                System.out.println("- Kooperatif");
                System.out.println("- Idealis");
                System.out.println("- Sosial");
                System.out.println("- Anggun");
                break;

            case "Scorpio":
                System.out.println("Tanggal Kalender    : 23 Oktober - 21 November");
                System.out.println("Elemen              : Air");
                System.out.println("Warna               : Merah, Hitam");
                System.out.println("Kualitas            : Tetap");
                System.out.println("Penguasa Planet     : Pluto");
                System.out.println("Kecocokan           : Cancer dan Pisces");
                System.out.println("Angka Keberuntungan : 8, 11, 18, 22");
                System.out.println("Batu Kelahiran      : Topaz");
                System.out.println("Simbol              : Kalajengking");
                System.out.println("\nDeskripsi:");
                System.out.println("Scorpio sangat intens dan penuh tekad. Mereka adalah");
                System.out.println("pemikir yang dalam dan sangat setia kepada orang yang mereka percaya.");
                System.out.println("\nKepribadian Scorpio:");
                System.out.println("- Intens");
                System.out.println("- Misterius");
                System.out.println("- Berani");
                System.out.println("- Setia");
                System.out.println("- Gigih");
                System.out.println("- Intuitif");
                System.out.println("- Bersemangat");
                break;

            case "Sagitarius":
                System.out.println("Tanggal Kalender    : 22 November - 21 Desember");
                System.out.println("Elemen              : Api");
                System.out.println("Warna               : Biru, Ungu");
                System.out.println("Kualitas            : Mutable");
                System.out.println("Penguasa Planet     : Jupiter");
                System.out.println("Kecocokan           : Aries dan Leo");
                System.out.println("Angka Keberuntungan : 3, 7, 9, 12, 21");
                System.out.println("Batu Kelahiran      : Turquoise");
                System.out.println("Simbol              : Pemanah");
                System.out.println("\nDeskripsi:");
                System.out.println("Sagitarius sangat optimis dan suka berpetualang.");
                System.out.println("Mereka mencintai kebebasan dan selalu jujur dalam setiap hal.");
                System.out.println("\nKepribadian Sagitarius:");
                System.out.println("- Optimis");
                System.out.println("- Petualang");
                System.out.println("- Jujur");
                System.out.println("- Bebas");
                System.out.println("- Humoris");
                System.out.println("- Antusias");
                System.out.println("- Bijaksana");
                break;

            case "Capricorn":
                System.out.println("Tanggal Kalender    : 22 Desember - 19 Januari");
                System.out.println("Elemen              : Tanah");
                System.out.println("Warna               : Hitam, Coklat");
                System.out.println("Kualitas            : Kardinal");
                System.out.println("Penguasa Planet     : Saturnus");
                System.out.println("Kecocokan           : Taurus dan Virgo");
                System.out.println("Angka Keberuntungan : 4, 8, 13, 22");
                System.out.println("Batu Kelahiran      : Garnet");
                System.out.println("Simbol              : Kambing Laut");
                System.out.println("\nDeskripsi:");
                System.out.println("Capricorn sangat disiplin dan ambisius. Mereka adalah");
                System.out.println("pekerja keras yang selalu merencanakan masa depan dengan matang.");
                System.out.println("\nKepribadian Capricorn:");
                System.out.println("- Disiplin");
                System.out.println("- Ambisius");
                System.out.println("- Bertanggung Jawab");
                System.out.println("- Sabar");
                System.out.println("- Mandiri");
                System.out.println("- Terorganisir");
                System.out.println("- Gigih");
                break;

            case "Aquarius":
                System.out.println("Tanggal Kalender    : 20 Januari - 18 Februari");
                System.out.println("Elemen              : Udara");
                System.out.println("Warna               : Biru Muda, Perak");
                System.out.println("Kualitas            : Tetap");
                System.out.println("Penguasa Planet     : Uranus");
                System.out.println("Kecocokan           : Gemini dan Libra");
                System.out.println("Angka Keberuntungan : 4, 7, 11, 22, 29");
                System.out.println("Batu Kelahiran      : Amethyst");
                System.out.println("Simbol              : Pembawa Air");
                System.out.println("\nDeskripsi:");
                System.out.println("Aquarius sangat inovatif dan mandiri. Mereka adalah");
                System.out.println("pemikir maju yang peduli terhadap kemanusiaan.");
                System.out.println("\nKepribadian Aquarius:");
                System.out.println("- Inovatif");
                System.out.println("- Mandiri");
                System.out.println("- Humanis");
                System.out.println("- Cerdas");
                System.out.println("- Unik");
                System.out.println("- Idealis");
                System.out.println("- Progresif");
                break;

            case "Pisces":
                System.out.println("Tanggal Kalender    : 19 Februari - 20 Maret");
                System.out.println("Elemen              : Air");
                System.out.println("Warna               : Hijau Laut, Ungu");
                System.out.println("Kualitas            : Mutable");
                System.out.println("Penguasa Planet     : Neptunus");
                System.out.println("Kecocokan           : Cancer dan Scorpio");
                System.out.println("Angka Keberuntungan : 3, 9, 12, 15, 18, 24");
                System.out.println("Batu Kelahiran      : Aquamarine");
                System.out.println("Simbol              : Ikan");
                System.out.println("\nDeskripsi:");
                System.out.println("Pisces sangat kreatif dan penuh empati. Mereka sangat peka");
                System.out.println("terhadap perasaan orang lain dan memiliki imajinasi yang luar biasa.");
                System.out.println("\nKepribadian Pisces:");
                System.out.println("- Kreatif");
                System.out.println("- Empati");
                System.out.println("- Imajinatif");
                System.out.println("- Penyayang");
                System.out.println("- Intuitif");
                System.out.println("- Lembut");
                System.out.println("- Berbakat Seni");
                break;

            default:
                System.out.println("Bintang tidak dikenali.");
        }
    }
}
