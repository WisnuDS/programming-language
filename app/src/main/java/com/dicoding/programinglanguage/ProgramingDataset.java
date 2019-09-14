package com.dicoding.programinglanguage;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

public class ProgramingDataset extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 2;
    private static final String DATABASE_NAME ="bahasa_pemrograman.db";
    private static final String TABLE_NAME = "profile_bahasa_pemrograman";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME  = "nama";
    private static final String COLUMN_DESC = "deskripsi";
    private static final String COLUMN_PICT = "gambar";
    private static final String COLUMN_REFERENCE = "referensi";

    public ProgramingDataset(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public static String[][] data = new String[][]{
            {"PYTHON", "Python adalah bahasa pemrograman interpretatif multiguna dengan filosofi perancangan yang berfokus pada tingkat keterbacaan kode.[10] Python diklaim sebagai bahasa yang menggabungkan kapabilitas, kemampuan, dengan sintaksis kode yang sangat jelas,[11] dan dilengkapi dengan fungsionalitas pustaka standar yang besar serta komprehensif. Python juga didukung oleh komunitas yang besar.\n" +
                    "\n" +
                    "Python mendukung multi paradigma pemrograman, utamanya; namun tidak dibatasi; pada pemrograman berorientasi objek, pemrograman imperatif, dan pemrograman fungsional. Salah satu fitur yang tersedia pada python adalah sebagai bahasa pemrograman dinamis yang dilengkapi dengan manajemen memori otomatis. Seperti halnya pada bahasa pemrograman dinamis lainnya, python umumnya digunakan sebagai bahasa skrip meski pada praktiknya penggunaan bahasa ini lebih luas mencakup konteks pemanfaatan yang umumnya tidak dilakukan dengan menggunakan bahasa skrip. Python dapat digunakan untuk berbagai keperluan pengembangan perangkat lunak dan dapat berjalan di berbagai platform sistem operasi. ", "http://romillyhills.co.uk/images/python%20logo.jpg","https://www.dicoding.com/academies/86"},
            {"JAVA", "Java adalah bahasa pemrograman yang dapat dijalankan di berbagai komputer termasuk telepon genggam. Bahasa ini awalnya dibuat oleh James Gosling saat masih bergabung di Sun Microsystems saat ini merupakan bagian dari Oracle dan dirilis tahun 1995. Bahasa ini banyak mengadopsi sintaksis yang terdapat pada C dan C++ namun dengan sintaksis model objek yang lebih sederhana serta dukungan rutin-rutin aras bawah yang minimal. Aplikasi-aplikasi berbasis java umumnya dikompilasi ke dalam p-code (bytecode) dan dapat dijalankan pada berbagai Mesin Virtual Java (JVM). Java merupakan bahasa pemrograman yang bersifat umum/non-spesifik (general purpose), dan secara khusus didisain untuk memanfaatkan dependensi implementasi seminimal mungkin. Karena fungsionalitasnya yang memungkinkan aplikasi java mampu berjalan di beberapa platform sistem operasi yang berbeda, java dikenal pula dengan slogannya, \"Tulis sekali, jalankan di mana pun\". Saat ini java merupakan bahasa pemrograman yang paling populer digunakan, dan secara luas dimanfaatkan dalam pengembangan berbagai jenis perangkat lunak aplikasi ataupun aplikasi ", "https://wiki.faforever.com/images/2/21/Java_logo.jpg","https://www.dicoding.com/academies/60"},
            {"C++", "C++ adalah bahasa pemrograman komputer yang di buat oleh Bjarne Stroustrup, yang merupakan perkembangan dari bahasa C dikembangkan di Bong Labs (Dennis Ritchie) pada awal tahun 1970-an, Bahasa itu diturunkan dari bahasa sebelumnya, yaitu B, Pada awalnya, bahasa tersebut dirancang sebagai bahasa pemrograman yang dijalankan pada sistem Unix, Pada perkembangannya, versi ANSI (American National Standart Institute) Bahasa pemrograman C menjadi versi dominan, Meskipun versi tersebut sekarang jarang dipakai dalam pengembangan sistem dan jaringan maupun untuk sistem embedded, Bjarne Stroustrup pada Bel labs pertama kali mengembangkan C++ pada awal 1980-an. Untuk mendukung fitur-fitur pada C++, dibangun efisiensi dan sistem support untuk pemrograman tingkat rendah (low level coding). Pada C++ ditambahkan konsep-konsep baru seperti class dengan sifat-sifatnya seperti inheritance dan overloading. Salah satu perbedaan yang paling mendasar dengan bahasa C adalah dukungan terhadap konsep pemrograman berorientasi objek (Object Oriented Programming).", "https://getintopc.com/wp-content/uploads/2014/02/CPlusPlus.jpg","https://www.kodedasar.com/belajar-cpp/"},
            {"PHP", "PHP adalah bahasa pemrograman script server-side yang didesain untuk pengembangan web. Selain itu, PHP juga bisa digunakan sebagai bahasa pemrograman umum (wikipedia). PHP di kembangkan pada tahun 1995 oleh Rasmus Lerdorf, dan sekarang dikelola oleh The PHP Group. Situs resmi PHP beralamat di http://www.php.net.\n" +
                    "\n" +
                    "PHP disebut bahasa pemrograman server side karena PHP diproses pada komputer server. Hal ini berbeda dibandingkan dengan bahasa pemrograman client-side seperti JavaScript yang diproses pada web browser (client).\n" +
                    "\n" +
                    "Pada awalnya PHP merupakan singkatan dari Personal Home Page. Sesuai dengan namanya, PHP digunakan untuk membuat website pribadi. Dalam beberapa tahun perkembangannya, PHP menjelma menjadi bahasa pemrograman web yang powerful dan tidak hanya digunakan untuk membuat halaman web sederhana, tetapi juga website populer yang digunakan oleh jutaan orang seperti wikipedia, wordpress, joomla, dll.\n" +
                    "\n" +
                    "Saat ini PHP adalah singkatan dari PHP: Hypertext Preprocessor, sebuah kepanjangan rekursif, yakni permainan kata dimana kepanjangannya terdiri dari singkatan itu sendiri: PHP: Hypertext Preprocessor.\n" +
                    "\n" +
                    "PHP dapat digunakan dengan gratis (free) dan bersifat Open Source. PHP dirilis dalam lisensi PHP License, sedikit berbeda dengan lisensi GNU General Public License (GPL) yang biasa digunakan untuk proyek Open Source.", "https://blog.zend.com/wp-content/uploads/2013/10/php.jpg","https://www.youtube.com/playlist?list=PLFIM0718LjIUqXfmEIBE3-uzERZPh3vp6"},
            {"JAVA SCRIPT", "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis. JavaScript populer di internet dan dapat bekerja di sebagian besar penjelajah web populer seperti Google Chrome, Internet Explorer (IE), Mozilla Firefox, Netscape dan Opera. Kode JavaScript dapat disisipkan dalam halaman web menggunakan tag SCRIPT. JavaScript merupakan salah satu teknologi inti World Wide Web selain HTML dan CSS. JavaScript membantu membuat halaman web interaktif dan merupakan bagian aplikasi web yang esensial.\n" +
                    "\n" +
                    "Awalnya hanya diimplementasi sebagai client-side dalam penjelajah web, kini engine JavaScript disisipkan ke dalam perangkat lunak lain seperti dalam server-side dalam server web dan basis data, dalam program non web seperti perangkat lunak pengolah kata dan pembaca PDF, dan sebagai runtime environment yang memungkinkan penggunaan JavaScript untuk membuat aplikasi desktop maupun mobile. ", "https://www.i-programmer.info/images/stories/prof/iprogrammer/JavascriptName/JSlogo.jpg","https://www.petanikode.com/tutorial/javascript/"},
            {"C#", "C# (dibaca: C sharp) merupakan sebuah bahasa pemrograman yang berorientasi objek yang dikembangkan oleh Microsoft sebagai bagian dari inisiatif kerangka .NET Framework. Bahasa pemrograman ini dibuat berbasiskan bahasa C++ yang telah dipengaruhi oleh aspek-aspek ataupun fitur bahasa yang terdapat pada bahasa-bahasa pemrograman lainnya seperti Java, Delphi, Visual Basic, dan lain-lain) dengan beberapa penyederhanaan. Menurut standar ECMA-334 C# Language Specification, nama C# terdiri atas sebuah huruf Latin C (U+0043) yang diikuti oleh tanda pagar yang menandakan angka # (U+0023). Tanda pagar # yang digunakan memang bukan tanda kres dalam seni musik (U+266F), dan tanda pagar # (U+0023) tersebut digunakan karena karakter kres dalam seni musik tidak terdapat di dalam keyboard standar. ", "https://3.bp.blogspot.com/-TVn9zpwc9VQ/WWipx278zLI/AAAAAAAABBg/OXiNaOm8J3Igo3hJ2eDEx1zfGl2pSNU1gCEwYBhgL/s1600/c-sharp-tutors-online.png","https://www.petanikode.com/cs-sintaks/"},
            {"KOTLIN", "Kotlin adalah sebuah bahasa pemrograman dengan pengetikan statis yang berjalan pada Mesin Virtual Java ataupun menggunakan kompiler LLVM yang dapat pula dikompilasikan kedalam bentuk kode sumber JavaScript. Pengembang utamanya berasal dari tim programer dari JetBrains yang bermarkas di Rusia.[2] Meskipun sintaksisnya tidak kompatibel dengan bahasa Java, Kotlin didesain untuk dapat bekerja sama dengan kode bahasa Java dan bergantung kepada kode bahasa Java dari Kelas Pustaka Java yang ada, seperti berbagai framework Java yang ada. Tim Pengembang memutuskan menamakannya Kotlin dengan mengambil nama dari sebuah pulau di Rusia, sebagaimana Java yang mengambil nama dari pulau Jawa di Indonesia.[3] Setelah Google mengumumkan bahwa Kotlin menjadi bahasa kelas satu bagi Android, maka bersama Java dan C++, Kotlin menjadi bahasa resmi untuk pengembangan aplikasi-aplikasi Android.", "https://upload.wikimedia.org/wikipedia/commons/b/b5/Kotlin-logo.png","https://www.dicoding.com/academies/80"},
            {"SWIFT", "Swift adalah bahasa pemrograman objek fungsional untuk pengembangan iOS dan OS X yang dibuat oleh Apple.[3] Didesain untuk berdampingan dengan Objective-C dan menghindari program dari kode yang salah. Swift diperkenalkan oleh Apple pada acara tahunan WWDC 2014.[3] Ini dibangun dengan compiler LLVM yang termasuk dalam Xcode 6 beta. Sebuah buku berisi 500 halaman petunjuk, The Swift Programming Language, dirilis bersamaan dengan WWDC, dan tersedia secara gratis di iBooks", "https://upload.wikimedia.org/wikipedia/id/4/43/Apple_Swift_Logo.png","https://code.tutsplus.com/id/tutorials/swift-from-scratch-an-introduction-to-classes-and-structures--cms-23197"},
            {"GOLANG", "Go (sering disebut sebagai Golang) adalah sebuah bahasa pemrograman yang dibuat di Google[11] pada tahun 2009 oleh Robert Griesemer, Rob Pike, dan Ken Thompson.[9] ini adalah bahasa pemrograman yang dihimpun, ..... diketik dalam bahasa tradisi Algol dan C, dengan pengumpulan sampah, terbatas struktural mengetik, memori keselamatan fitur dan CSP-gaya konkuren pemrograman fitur yang ditambahkan.[12] compiler dan lainnya alat-alat bahasa yang awalnya dikembangkan oleh Google adalah semua yang gratis dan open source.", "https://blog.golang.org/go-brand/Go-Logo/PNG/Go-Logo_Blue.png","https://dasarpemrogramangolang.novalagung.com/1-berkenalan-dengan-golang.html"},
            {"C", "Bahasa pemrograman C merupakan salah satu bahasa pemrograman komputer. Dibuat pada tahun 1972 oleh Dennis Ritchie untuk Sistem Operasi Unix di Bell Telephone Laboratories.\n" +
                    "\n" +
                    "Meskipun C dibuat untuk memprogram sistem dan jaringan komputer namun bahasa ini juga sering digunakan dalam mengembangkan software aplikasi. C juga banyak dipakai oleh berbagai jenis platform sistem operasi dan arsitektur komputer, bahkan terdapat beberepa compiler yang sangat populer telah tersedia. C secara luar biasa memengaruhi bahasa populer lainnya, terutama C++ yang merupakan extensi dari C. ", "https://static.cdn-cdpl.com/source/b9a5514dc9fc5b70ff85311558a3cd27/C.png","https://www.dicoding.com/academies/120"},
    };


    @Override
    public void onCreate(SQLiteDatabase db) {
        final String CREATE_SQL_TABLE_NAME = "CREATE TABLE "+TABLE_NAME+" ("
                +COLUMN_ID+" INTEGER PRIMARY KEY autoincrement, "
                +COLUMN_NAME+" TEXT NOT NULL, "
                +COLUMN_DESC+" TEXT NOT NULL, "
                +COLUMN_PICT+" TEXT NOT NULL, "
                +COLUMN_REFERENCE+" TEXT NOT NULL)";
        db.execSQL(CREATE_SQL_TABLE_NAME);
        Log.d("data", "onCreate: database");
        insertDummy();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public ArrayList<ProgramingLanguage> getListData(){
        ArrayList<ProgramingLanguage> list = new ArrayList<>();
        Log.d("data", "getListData: jalan");
        String selectQuery = "SELECT * FROM " + TABLE_NAME;
        Log.d("data", "getListData: jalan1");
        SQLiteDatabase database = this.getWritableDatabase();
        Log.d("data", "getListData: jalan2");
        Cursor cursor = database.rawQuery(selectQuery, null);
        Log.d("data", "getListData: jalan3");
        if (cursor.moveToFirst()) {
            Log.d("data", "getListData: query berhasil");
            do {
                ProgramingLanguage programingLanguage = new ProgramingLanguage();
                programingLanguage.setReference(cursor.getString(4));
                programingLanguage.setName(cursor.getString(1));
                programingLanguage.setDescription(cursor.getString(2));
                programingLanguage.setPhoto(cursor.getString(3));

                list.add(programingLanguage);
            } while (cursor.moveToNext());
        }else {
            Log.d("data", "getListData: query gagal");
        }
        if (list != null){
            Log.d("data", "getListData: ada data");
        } else {
            Log.d("data", "getListData: data kosong");
        }
        database.close();
        return list;
    }

    public void insert(String name, String desc, String pict, String reference) {
        SQLiteDatabase database = this.getWritableDatabase();
        String queryValues = "INSERT INTO " + TABLE_NAME + " (" + COLUMN_NAME+","+COLUMN_DESC+","+COLUMN_PICT+","+COLUMN_REFERENCE+") " +
                "VALUES ('"+name+"','"+desc+"','"+pict+"','"+reference+"')";
        Log.d("data", "insert data " + queryValues);
        database.execSQL(queryValues);
        database.close();
    }

    public void insertDummy(){
        for(String[] dData : data){
            insert(dData[0],dData[1],dData[2],dData[3]);
        }
        Log.d("data", "insertDummy: succees");
    }

}
