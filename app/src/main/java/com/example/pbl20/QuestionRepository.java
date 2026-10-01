package com.example.pbl20;

import java.util.ArrayList;
import java.util.List;

public class QuestionRepository {

    public static List<Question> getSet1Questions() {
        List<Question> list = new ArrayList<>();

        // --- BAB 1: WARISAN NEGARA BANGSA ---
        list.add(new Question(
                1,
                "Bab 1: Warisan Negara Bangsa",
                "Apakah ciri utama pembentukan kerajaan Kesultanan Melayu Melaka yang menjadi asas warisan negara bangsa?",
                new String[]{"Sistem feudal barat", "Wilayah pengaruh, rakyat, kedaulatan, dan undang-undang", "Pemerintahan tentera", "Sistem demokrasi mutlak"},
                1,
                "Ciri-ciri negara bangsa Kesultanan Melayu Melaka meliputi Kerajaan, Rakyat, Kedaulatan, Wilayah Pengaruh, Undang-undang, dan Lambang Kebesaran."
        ));

        // --- BAB 2: KEBANGKITAN NASIONALISME ---
        list.add(new Question(
                2,
                "Bab 2: Kebangkitan Nasionalisme",
                "Apakah maksud nasionalisme secara umum?",
                new String[]{"Perasaan cinta yang mendalam terhadap bangsa dan negara", "Keinginan meluaskan wilayah jajahan", "Semangat kerjasama perdagangan antarabangsa", "Penolakan terhadap agama tempatan"},
                0,
                "Nasionalisme ialah gerakan menzahirkan perasaan cinta mendalam terhadap bangsa dan negara demi kebebasan daripada penjajahan."
        ));

        // --- BAB 3: KONFLIK DUNIA DAN PENDUDUKAN JEPUN ---
        list.add(new Question(
                3,
                "Bab 3: Konflik Dunia & Pendudukan Jepun",
                "Apakah faktor serta-merta yang mencetuskan Perang Dunia Pertama pada tahun 1914?",
                new String[]{"Serangan ke atas Pearl Harbour", "Pembunuhan Archduke Franz Ferdinand dari Austria-Hungary", "Krisis Terusan Suez", "Penandatanganan Perjanjian Versailles"},
                1,
                "Pembunuhan Archduke Franz Ferdinand dan isterinya oleh nasionalis Serbia menjadi pemangkin letusan Perang Dunia Pertama."
        ));

        // --- BAB 4: ERA PERALIHAN KUASA & MALAYAN UNION ---
        list.add(new Question(
                4,
                "Bab 4: Era Peralihan Kuasa & Malayan Union",
                "Pentadbiran Tentera British (BMA) diperkenalkan di Tanah Melayu selepas kekalahan Jepun bertujuan untuk:",
                new String[]{"Mengembalikan keamanan dan pulihkan kepercayaan rakyat", "Memberi kemerdekaan terus", "Menjual ladang getah", "Mengharamkan semua persatuan Melayu"},
                0,
                "BMA bermatlamat mengembalikan ketenteraman, memulihkan infrastruktur, dan memulihkan kepercayaan rakyat terhadap British."
        ));

        // --- BAB 5: PEMBINAAN PERSEKUTUAN TANAH MELAYU 1948 ---
        list.add(new Question(
                5,
                "Bab 5: Pembinaan PTM 1948",
                "Jawatankuasa Kerja ditubuhkan pada Julai 1946 dengan tujuan utama untuk:",
                new String[]{"Merangka perjanjian baharu menggantikan Malayan Union", "Menubuhkan pasukan polis tempatan", "Mengumpul dana pilihan raya", "Membangunkan kawasan luar bandar"},
                0,
                "Jawatankuasa Kerja merangkumi wakil British, Raja-Raja Melayu, dan UMNO untuk merangka Persekutuan Tanah Melayu."
        ));

        // --- BAB 6: ANCAMAN KOMUNIS DAN PERISYTIHARAN DARURAT ---
        list.add(new Question(
                6,
                "Bab 6: Ancaman Komunis & Darurat",
                "Parti Komunis Malaya (PKM) ditubuhkan pada tahun 1930 di:",
                new String[]{"Kuala Pilah, Negeri Sembilan", "Singapore", "Ipoh, Perak", "Pulau Pinang"},
                1,
                "PKM ditubuhkan di Kuala Pilah/Singapura pada April 1930 untuk menyebarkan fahaman komunis."
        ));

        // --- BAB 7: USAHA KE ARAH KEMERDEKAAN ---
        list.add(new Question(
                7,
                "Bab 7: Usaha Ke Arah Kemerdekaan",
                "Jawatankuasa Hubungan Antara Kaum (CLC) ditubuhkan pada tahun 1949 dengan objektif:",
                new String[]{"Menyelesaikan isu perkauman dan membina persefahaman antara pemimpin kaum", "Mengendalikan syarikat perkapalan", "Menguruskan pendaftaran sekolah awam", "Memungut cukai pendapatan"},
                0,
                "CLC membolehkan pemimpin pelbagai kaum berbincang dan bertolak ansur berkaitan politik, ekonomi, dan pendidikan."
        ));

        // --- BAB 8: PILIHAN RAYA ---
        list.add(new Question(
                8,
                "Bab 8: Pilihan Raya",
                "Pilihan raya pertama di Tanah Melayu diadakan pada peringkat tempatan di:",
                new String[]{"George Town, Pulau Pinang (1951)", "Johor Bahru", "Melaka", "Kuala Lumpur"},
                0,
                "Pilihan Raya Majlis Perbandaran George Town pada tahun 1951 adalah pilihan raya tempatan pertama diadakan."
        ));

        // --- BAB 9: PERLEMBAGAAN PERSEKUTUAN TANAH MELAYU 1957 ---
        list.add(new Question(
                9,
                "Bab 9: Perlembagaan PTM 1957",
                "Rombongan Kemerdekaan Tanah Melayu bertolak ke London pada tahun 1956 bagi menandatangani:",
                new String[]{"Perjanjian London 1956", "Perjanjian Versailles", "Perjanjian Manila", "Perjanjian Pangkor"},
                0,
                "Perjanjian London 1956 menetapkan tarikh kemerdekaan PTM pada 31 Ogos 1957."
        ));

        // --- BAB 10: PEMASYHURAN KEMERDEKAAN ---
        list.add(new Question(
                10,
                "Bab 10: Pemasyhuran Kemerdekaan",
                "Apakah maksud kemerdekaan menurut Tunku Abdul Rahman?",
                new String[]{"Berkhidmat untuk negara asing", "Stesen akhir perjuangan untuk kebebasan dan kedaulatan tanah air", "Pertukaran gabenor baharu", "Kebebasan tanpa sebarang undang-undang"},
                1,
                "Tunku Abdul Rahman menegaskan kemerdekaan menandakan hak menentukan nasib sendiri dan kedaulatan tanah air."
        ));

        return list;
    }

    public static List<Question> getSet2Questions() {
        List<Question> list = new ArrayList<>();

        // --- BAB 1: WARISAN NEGARA BANGSA (SKENARIO & APLIKASI / KBAT) ---
        list.add(new Question(
                11,
                "Bab 1: Warisan Negara Bangsa (Aplikasi)",
                "Situasi: Sebuah negara jiran cuba menceroboh perairan negara. Berdasarkan konsep kedaulatan Kesultanan Melayu Melaka, apakah tindakan terbaik kerajaan?",
                new String[]{"Menyerahkan wilayah untuk elak konflik", "Mempunyai undang-undang tegas dan pertahanan berwibawa bagi mempertahankan kedaulatan", "Meminta bantuan kuasa asing tanpa syarat", "Membiarkan rakyat menentukan sendiri"},
                1,
                "Kedaulatan ialah kekuasaan tertinggi. Mempertahankan kedaulatan negara memerlukan ketegasan undang-undang dan kesiapsiagaan pertahanan."
        ));

        // --- BAB 2: KEBANGKITAN NASIONALISME (SKENARIO & APLIKASI / KBAT) ---
        list.add(new Question(
                12,
                "Bab 2: Kebangkitan Nasionalisme (Aplikasi)",
                "Situasi: Generasi muda hari ini terdedah kepada pengaruh budaya luar yang pesat melalui media sosial. Bagaimanakah semangat nasionalisme dapat diterapkan?",
                new String[]{"Menutup terus akses internet", "Memanfaatkan media digital untuk menghasilkan kandungan kreatif bertemakan sejarah dan patriotisme", "Mengharamkan bahasa asing di sekolah", "Memaksa semua pelajar menyertai tentera"},
                1,
                "Nasionalisme moden memerlukan pendekatan kreatif menggunakan media digital untuk memupuk kecintaan terhadap warisan tanah air."
        ));

        // --- BAB 3: KONFLIK DUNIA DAN PENDUDUKAN JEPUN (SKENARIO & APLIKASI / KBAT) ---
        list.add(new Question(
                13,
                "Bab 3: Pendudukan Jepun (Aplikasi)",
                "Pendudukan Jepun menyebabkan krisis bekalan makanan yang teruk. Apakah iktibar yang boleh diambil oleh rakyat Malaysia hari ini?",
                new String[]{"Mengharapkan import makanan dari luar", "Mengamalkan sikap berdikari dan memperkasakan sekuriti makanan tempatan", "Mengurangkan saiz populasi negara", "Menghadkan pengeluaran pertanian"},
                1,
                "Pengalaman pahit pendudukan Jepun mengajar pentingnya ketahanan dan sekuriti makanan tempatan."
        ));

        // --- BAB 4: ERA PERALIHAN KUASA & MALAYAN UNION (SKENARIO & APLIKASI / KBAT) ---
        list.add(new Question(
                14,
                "Bab 4: Penentangan Malayan Union (Situasi)",
                "Penentangan terhadap Malayan Union menyaksikan penyatuan rakyat menerusi demonstrasi aman dan kongres. Apakah pengajaran utama daripada peristiwa ini?",
                new String[]{"Perpaduan dan muafakat adalah kunci kejayaan menentang ketidakadilan", "Kekerasan senjata adalah jalan terbaik", "Boikot ekonomi lebih berkesan", "Perubahan undang-undang tidak memerlukan sokongan"},
                0,
                "Muafakat dan penyatuan persatuan-persatuan Melayu berjaya menggagalkan Malayan Union."
        ));

        // --- BAB 5: PEMBINAAN PTM 1948 (SKENARIO & APLIKASI / KBAT) ---
        list.add(new Question(
                15,
                "Bab 5: Pembinaan PTM 1948 (Aplikasi)",
                "Kejayaan pembentukan PTM 1948 adalah hasil perundingan meja bulat. Apakah iktibar kaedah rundingan dalam menyelesaikan pertikaian hari ini?",
                new String[]{"Mengelakkan pertumpahan darah dan mencapai penyelesaian menang-menang", "Melengahkan masa pentadbiran", "Menunjukkan kelemahan pemimpin", "Membazirkan perbelanjaan awam"},
                0,
                "Rundingan dan toleransi cara paling matang mencapai keharmonian tanpa kestabilan terjejas."
        ));

        // --- BAB 6: ANCAMAN KOMUNIS DAN DARURAT (SKENARIO & APLIKASI / KBAT) ---
        list.add(new Question(
                16,
                "Bab 6: Perang Saraf (Aplikasi)",
                "Strategi Perang Saraf Templer berjaya memenangi hati dan fikiran rakyat. Bagaimanakah strategi ini diaplikasikan dalam pengurusan krisis hari ini?",
                new String[]{"Pendekatan prihatin, kebajikan, diplomasi dan komunikasi telus dengan rakyat", "Menggunakan ancaman ketenteraan berterusan", "Mengenakan perintah berkurung tanpa had", "Menutup sekolah awam"},
                1,
                "Keperihatinan, komunikasi telus, dan bantuan kebajikan cara paling berkesan memenangi sokongan rakyat."
        ));

        // --- BAB 7: USAHA KE ARAH KEMERDEKAAN (SKENARIO & APLIKASI / KBAT) ---
        list.add(new Question(
                17,
                "Bab 7: Jawatankuasa Hubungan Kaum (Aplikasi)",
                "CLC menunjukkan teladan toleransi antara pemimpin Melayu, Cina dan India. Bagaimanakah pemikiran dialog ini dapat diterapkan dalam persekitaran sekolah/ipg?",
                new String[]{"Mengadakan aktiviti silang budaya dan menghormati perbezaan rakan", "Mengelompokkan murid mengikut kaum sahaja", "Mengharamkan bahasa ibunda", "Mengabaikan perayaan kaum lain"},
                0,
                "Aktiviti silang budaya di sekolah memupuk persefahaman dan integrasi sejak awal umur."
        ));

        // --- BAB 8: PILIHAN RAYA (SKENARIO & APLIKASI / KBAT) ---
        list.add(new Question(
                18,
                "Bab 8: Tanggungjawab Pengundi (Aplikasi)",
                "Kelayakan mengundi kini diturunkan kepada umur 18 tahun (Undi18). Apakah tanggungjawab belia 18 tahun apabila berada di pusat undi?",
                new String[]{"Memilih calon yang berwibawa dan berintegriti berdasarkan maklumat sahih", "Ikut-ikutan kawan tanpa mengkaji calon", "Menjual undi untuk wang ringgit", "Rosakkan kertas undi sengaja"},
                0,
                "Undi adalah amanah demokrasi untuk menentukan hala tuju kepimpinan negara."
        ));

        // --- BAB 9: PERLEMBAGAAN PTM 1957 (SKENARIO & APLIKASI / KBAT) ---
        list.add(new Question(
                19,
                "Bab 9: Perlembagaan Persekutuan (Aplikasi)",
                "Perlembagaan Persekutuan merupakan undang-undang tertinggi negara. Apakah implikasi sekiranya sebarang undang-undang bertentangan dengannya?",
                new String[]{"Undang-undang baharu tersebut adalah terbatal setakat yang bertentangan", "Perlembagaan akan dibubarkan", "Mahkamah ditutup serta merta", "Rakyat boleh mengabaikan undang-undang"},
                0,
                "Prinsip Keluhuran Perlembagaan menetapkan mana-mana undang-undang yang bertentangan adalah terbatal."
        ));

        // --- BAB 10: PEMASYHURAN KEMERDEKAAN (SKENARIO & APLIKASI / KBAT) ---
        list.add(new Question(
                20,
                "Bab 10: Pengisian Kemerdekaan (Aplikasi)",
                "Generasi terdahulu berjuang membebaskan tanah air. Apakah cara paling berkesan generasi hari ini mengisi kemerdekaan?",
                new String[]{"Menguasai ilmu, berinovasi dalam teknologi dan menyumbang kemajuan ekonomi", "Sekadar bercuti pada hari kemerdekaan", "Mengharapkan bantuan asing", "Mengingkari undang-undang negara"},
                0,
                "Mengisi kemerdekaan bermaksud memajukan negara menerusi ilmunya, kecemerlangan, dan integriti."
        ));

        return list;
    }
}