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

        list.add(new Question(
                2,
                "Bab 1: Warisan Negara Bangsa",
                "Hukum Kanun Melaka mengandungi fasal berkaitan dengan perkara berikut, KECUALI:",
                new String[]{"Jenayah dan undang-undang keluarga", "Tanggungjawab raja dan pembesar", "Perdagangan laut dan perkapalan", "Sistem percukaian tempatan"},
                2,
                "Hal berkaitan perdagangan laut dan perkapalan dikawal khusus di bawah Undang-Undang Laut Melaka."
        ));

        list.add(new Question(
                3,
                "Bab 1: Warisan Negara Bangsa",
                "Apakah peranan utama Nakhoda mengikut Undang-Undang Laut Melaka?",
                new String[]{"Menguruskan cukai pelabuhan", "Ibarat raja dalam pelayaran kapal", "Menjaga keselamatan istana", "Melantik pembesar negeri"},
                1,
                "Nakhoda diumpamakan sebagai raja dalam kapal dan semua anak kapal perlu mematuhi arahan Nakhoda."
        ));

        list.add(new Question(
                4,
                "Bab 1: Warisan Negara Bangsa",
                "Dalam Sistem Pembesar Empat Lipatan, siapakah yang bertanggungjawab menjaga keselamatan kota Melaka dan perairan?",
                new String[]{"Bendahara", "Penghulu Bendahari", "Temenggung", "Laksamana"},
                2,
                "Temenggung bertindak sebagai ketua polis dan penjara serta menjaga keselamatan Kota Melaka."
        ));

        list.add(new Question(
                5,
                "Bab 1: Warisan Negara Bangsa",
                "Apakah konsep waadat yang dimeterai antara Demang Lebar Daun dengan Sang Sapurba?",
                new String[]{"Perjanjian perdagangan dengan asing", "Perjanjian taat setia antara raja dengan rakyat", "Sistem pengutipan cukai tanah", "Penetapan sempadan negeri"},
                1,
                "Waadat ialah perjanjian taat setia di mana rakyat berjanji taat setia kepada raja, dan raja berjanji memerintah dengan adil."
        ));

        // --- BAB 2: KEBANGKITAN NASIONALISME ---
        list.add(new Question(
                6,
                "Bab 2: Kebangkitan Nasionalisme",
                "Apakah maksud nasionalisme secara umum?",
                new String[]{"Perasaan cinta yang mendalam terhadap bangsa dan negara", "Keinginan meluaskan wilayah jajahan", "Semangat kerjasama perdagangan antarabangsa", "Penolakan terhadap agama tempatan"},
                0,
                "Nasionalisme ialah gerakan menzahirkan perasaan cinta mendalam terhadap bangsa dan negara demi kebebasan daripada penjajahan."
        ));

        list.add(new Question(
                7,
                "Bab 2: Kebangkitan Nasionalisme",
                "Revolusi Keagungan (1688) di England berlaku disebabkan oleh:",
                new String[]{"Keinginan rakyat menukar agama rasmi", "Penentangan terhadap pemerintahan raja mutlak King James II", "Pencerobohan tentera Perancis", "Krisis ekonomi sektor pertanian"},
                1,
                "Revolusi Keagungan berlaku kerana ahli parlimen menentang Raja James II yang membelakangkan parlimen dan memerintah secara mutlak."
        ));

        list.add(new Question(
                8,
                "Bab 2: Kebangkitan Nasionalisme",
                "Apakah peranan Gerakan Islah yang dipelopori oleh Kaum Muda pada awal abad ke-20?",
                new String[]{"Menubuhkan pasukan tentera", "Memajukan Islam berteraskan Al-Quran dan Hadis serta memajukan pendidikan", "Menggalakkan emigrasi ke luar negara", "Menolak pemodenan Barat sepenuhnya"},
                1,
                "Kaum Muda menerusi Gerakan Islah mengajak umat Islam kembali kepada ajaran Al-Quran dan Hadis serta mementingkan pendidikan moden."
        ));

        list.add(new Question(
                9,
                "Bab 2: Kebangkitan Nasionalisme",
                "Akhbar manakah yang memainkan peranan penting menyiarkan isu pendidikan dan sosioekonomi orang Melayu pada tahun 1930-an?",
                new String[]{"Utusan Melayu dan Majlis", "The Straits Times", "Malay Mail", "Sinar Harian"},
                0,
                "Akhbar seperti Utusan Melayu, Majlis, dan Warta Malaya menjadi lidah suara rakyat membangkitkan kesedaran kebangsaan."
        ));

        list.add(new Question(
                10,
                "Bab 2: Kebangkitan Nasionalisme",
                "Kesatuan Melayu Muda (KMM) yang ditubuhkan oleh Ibrahim Haji Yaakob bertujuan untuk:",
                new String[]{"Menyokong pentadbiran British", "Mencapai kemerdekaan Tanah Melayu melalui konsep Melayu Raya", "Meningkatkan eksport getah", "Menubuhkan kelab sukan tempatan"},
                1,
                "KMM bersifat radikal dan memperjuangkan kemerdekaan Tanah Melayu serta penyatuan dengan Indonesia di bawah konsep Melayu Raya."
        ));

        // --- BAB 3: KONFLIK DUNIA DAN PENDUDUKAN JEPUN ---
        list.add(new Question(
                11,
                "Bab 3: Konflik Dunia & Pendudukan Jepun",
                "Apakah faktor serta-merta yang mencetuskan Perang Dunia Pertama pada tahun 1914?",
                new String[]{"Serangan ke atas Pearl Harbour", "Pembunuhan Archduke Franz Ferdinand dari Austria-Hungary", "Krisis Terusan Suez", "Penandatanganan Perjanjian Versailles"},
                1,
                "Pembunuhan Archduke Franz Ferdinand dan isterinya oleh nasionalis Serbia menjadi pemangkin letusan Perang Dunia Pertama."
        ));

        list.add(new Question(
                12,
                "Bab 3: Konflik Dunia & Pendudukan Jepun",
                "Peristiwa penyerangan Jerman ke atas negara manakah yang memulakan Perang Dunia Kedua di Eropah?",
                new String[]{"Poland", "Perancis", "Britain", "Rusia"},
                0,
                "Serangan pencerobohan Jerman ke atas Poland pada September 1939 menyebabkan Britain dan Perancis mengisytiharkan perang terhadap Jerman."
        ));

        list.add(new Question(
                13,
                "Bab 3: Konflik Dunia & Pendudukan Jepun",
                "Di manakah pendaratan pertama tentera Jepun di Tanah Melayu pada 8 Disember 1941?",
                new String[]{"Kota Bharu, Kelantan", "Pulau Pinang", "Singapore", "Kuantan, Pahang"},
                0,
                "Tentera Jepun mendarat di Pantai Sabak, Kota Bharu, Kelantan serentak dengan serangan ke atas Pearl Harbour."
        ));

        list.add(new Question(
                14,
                "Bab 3: Konflik Dunia & Pendudukan Jepun",
                "Apakah slogan propaganda yang digunakan oleh tentera Jepun untuk menarik sokongan penduduk tempatan?",
                new String[]{"'Asia Untuk Orang Asia'", "'Satu Malaysia'", "'Komanwel Bersatu'", "'Merdeka Bersama British'"},
                0,
                "Jepun menggunakan slogan 'Asia Untuk Orang Asia' dan 'Lingkaran Kemakmuran Bersama Asia Timur Raya'."
        ));

        list.add(new Question(
                15,
                "Bab 3: Konflik Dunia & Pendudukan Jepun",
                "Pasukan tentera tempatan yang ditubuhkan oleh British untuk melakukan gerila menentang Jepun dikenali sebagai:",
                new String[]{"Force 136", "Peta", "Kempeitai", "Min Yuen"},
                0,
                "Force 136 ditubuhkan oleh Jabatan Operasi Khas British (SOE) untuk mengumpul maklumat dan menjalankan sabotaj terhadap Jepun."
        ));

        // --- BAB 4: ERA PERALIHAN KUASA & MALAYAN UNION ---
        list.add(new Question(
                16,
                "Bab 4: Era Peralihan Kuasa & Malayan Union",
                "Pentadbiran Tentera British (BMA) diperkenalkan di Tanah Melayu selepas kekalahan Jepun bertujuan untuk:",
                new String[]{"Mengembalikan keamanan dan pulihkan kepercayaan rakyat", "Memberi kemerdekaan terus", "Menjual ladang getah", "Mengharamkan semua persatuan Melayu"},
                0,
                "BMA bermatlamat mengembalikan ketenteraman, memulihkan infrastruktur, dan memulihkan kepercayaan rakyat terhadap British."
        ));

        list.add(new Question(
                17,
                "Bab 4: Era Peralihan Kuasa & Malayan Union",
                "Apakah ciri kerakyatan dalam Malayan Union 1946 yang ditentang oleh orang Melayu?",
                new String[]{"Prinsip Jus Soli", "Ujian bertulis Bahasa Melayu", "Syarat memiliki harta", "Persetujuan Sultan"},
                0,
                "Prinsip jus soli memberikan kerakyatan mudah kepada sesiapa sahaja yang lahir di Tanah Melayu tanpa mengambil kira asal usul."
        ));

        list.add(new Question(
                18,
                "Bab 4: Era Peralihan Kuasa & Malayan Union",
                "Mengapakah Sultan-Sultan Melayu menentang penyerahan kuasa dalam Malayan Union?",
                new String[]{"Kedaulatan dan kuasa politik Raja-Raja Melayu terhakis", "Sistem percukaian diturunkan", "Ibu negara dipindahkan ke Pulau Pinang", "Pengenalan wang kertas baharu"},
                0,
                "Sultan kehilangan kuasa pemerintahan dan hanya mempertahankan hal ehwal agama Islam serta adat istiadat Melayu sahaja."
        ));

        list.add(new Question(
                19,
                "Bab 4: Era Peralihan Kuasa & Malayan Union",
                "Apakah bentuk bantahan yang dilakukan oleh orang Melayu semasa kedatangan Ahli Parlimen British (Gammans dan Rees-Williams)?",
                new String[]{"Rapat umum, demonstrasi aman dan perhimpunan beramai-ramai", "Serangan bersenjata ke atas pejabat pentadbiran", "Mogok lapar berpanjangan", "Meninggalkan Tanah Melayu"},
                0,
                "Rakyat mengadakan perhimpunan raksasa, membawa sepanduk bantahan, dan memakai lilitan kain putih di songkok sebagai tanda berkabung."
        ));

        list.add(new Question(
                20,
                "Bab 4: Era Peralihan Kuasa & Malayan Union",
                "Apakah peristiwa tragis di Sarawak yang berlaku akibat penentangan terhadap penyerahan Sarawak kepada Mahkota British?",
                new String[]{"Pembunuhan Gabenor Sir Duncan Stewart oleh Rosli Dhoby", "Letupan kapal perang British", "Perang saudara Kuching", "Penutupan sekolah Melayu"},
                0,
                "Rosli Dhoby dari kumpulan Rukun 13 menikam Gabenor Sarawak Sir Duncan Stewart di Sibu sebagai protes penyerahan Sarawak."
        ));

        // --- BAB 5: PEMBINAAN PERSEKUTUAN TANAH MELAYU 1948 ---
        list.add(new Question(
                21,
                "Bab 5: Pembinaan PTM 1948",
                "Jawatankuasa Kerja ditubuhkan pada Julai 1946 dengan tujuan utama untuk:",
                new String[]{"Merangka perjanjian baharu menggantikan Malayan Union", "Menubuhkan pasukan polis tempatan", "Mengumpul dana pilihan raya", "Membangunkan kawasan luar bandar"},
                0,
                "Jawatankuasa Kerja merangkumi wakil British, Raja-Raja Melayu, dan UMNO untuk merangka Persekutuan Tanah Melayu."
        ));

        list.add(new Question(
                22,
                "Bab 5: Pembinaan PTM 1948",
                "Gabungan AMCJA-PUTERA telah mengemukakan draf alternatif yang dikenali sebagai:",
                new String[]{"Perlembagaan Rakyat 1947", "Perjanjian Bangkok", "Manifesto Merdeka", "Akta Kerakyatan PTM"},
                0,
                "AMCJA-PUTERA menolak cadangan Jawatankuasa Kerja dan mencadangkan Perlembagaan Rakyat 1947."
        ));

        list.add(new Question(
                23,
                "Bab 5: Pembinaan PTM 1948",
                "Apakah syarat kerakyatan secara kuat kuasa undang-undang di bawah Persekutuan Tanah Melayu 1948?",
                new String[]{"Lahir di PTM dan pemastautin tetap yang taat setia", "Bebas terbuka kepada sesiapa sahaja", "Perlu membayar yuran bulanan", "Wajib berkhidmat dalam tentera"},
                0,
                "Syarat kerakyatan PTM 1948 diperketatkan bagi menjamin hak pemastautin asal dan kesetiaan kepada Tanah Melayu."
        ));

        list.add(new Question(
                24,
                "Bab 5: Pembinaan PTM 1948",
                "Antara berikut, yang manakah institusi penting yang dibentuk semula menerusi Perjanjian PTM 1948?",
                new String[]{"Majlis Raja-Raja", "Dewan Negara moden", "Suruhanjaya Hak Asasi", "Mahkamah Antarabangsa"},
                0,
                "Majlis Raja-Raja dibentuk untuk memberikan pandangan dan nasihat kepada Pesuruhjaya Tinggi British."
        ));

        list.add(new Question(
                25,
                "Bab 5: Pembinaan PTM 1948",
                "Apakah kesan penting pembentukan Persekutuan Tanah Melayu 1948 kepada orang Melayu?",
                new String[]{"Kedudukan istimewa orang Melayu diiktiraf dan dipelihara", "Sistem kesultanan dibubarkan", "Bahasa Inggeris dijadikan bahasa tunggal", "Singapura digabungkan secara automatik"},
                0,
                "PTM 1948 mengembalikan kedaulatan Raja-Raja Melayu dan mengiktiraf kedudukan istimewa orang Melayu."
        ));

        // --- BAB 6: ANCAMAN KOMUNIS DAN PERISYTIHARAN DARURAT ---
        list.add(new Question(
                26,
                "Bab 6: Ancaman Komunis & Darurat",
                "Parti Komunis Malaya (PKM) ditubuhkan pada tahun 1930 di:",
                new String[]{"Kuala Pilah, Negeri Sembilan", "Singapore", "Ipoh, Perak", "Pulau Pinang"},
                1,
                "PKM ditubuhkan di Kuala Pilah/Singapura pada April 1930 untuk menyebarkan fahaman komunis."
        ));

        list.add(new Question(
                27,
                "Bab 6: Ancaman Komunis & Darurat",
                "Peristiwa manakah yang membawa kepada Perisytiharan Darurat di seluruh Tanah Melayu pada Jun 1948?",
                new String[]{"Pembunuhan tiga orang pengurus ladang Eropah di Sungai Siput, Perak", "Serangan ke atas Balai Polis Bukit Kepong", "Pengeboman Kereta Api Melelap", "Pembunuhan Sir Henry Gurney"},
                0,
                "Pembunuhan tiga pengurus ladang berbangsa Eropah oleh komunis di Sungai Siput memulakan undang-undang Darurat 1948."
        ));

        list.add(new Question(
                28,
                "Bab 6: Ancaman Komunis & Darurat",
                "Apakah matlamat utama komunis melakukan tindakan sabotaj ke atas pokok getah dan lombong timah?",
                new String[]{"Melumpuhkan ekonomi British di Tanah Melayu", "Memajukan sektor pertanian awam", "Memindahkan penduduk ke bandar", "Menggalakkan import bahan mentah"},
                0,
                "PKM merosakkan estet dan lombong bertujuan meruntuhkan punca pendapatan ekonomi kerajaan British."
        ));

        list.add(new Question(
                29,
                "Bab 6: Ancaman Komunis & Darurat",
                "Apakah langkah strategik di bawah Rancangan Briggs bagi memutuskan hubungan komunis dengan Min Yuen?",
                new String[]{"Pemindahan penduduk pinggir hutan ke Kampung Baru", "Pengimportan tentera dari India", "Penutupan semua sekolah awam", "Pemberian pencen kepada komunis"},
                0,
                "Rancangan Briggs memindahkan penduduk ke Kampung Baru yang dipagar dan dikawal ketat bagi menyekat bekalan makanan & maklumat kepada PKM."
        ));

        list.add(new Question(
                30,
                "Bab 6: Ancaman Komunis & Darurat",
                "Apakah pendekatan Perang Saraf yang dilaksanakan oleh Sir Gerald Templer?",
                new String[]{"Memenangi hati dan fikiran rakyat menerusi kempen, kebebasan dan kebajikan", "Menggunakan bom atom di kawasan hutan", "Menaikkan kadar cukai tanah", "Mengharamkan Bahasa Melayu"},
                0,
                "Perang Saraf bertujuan memenangi hati dan fikiran rakyat supaya bekerjasama menyalurkan maklumat memusnahkan PKM."
        ));

        // --- BAB 7: USAHA KE ARAH KEMERDEKAAN ---
        list.add(new Question(
                31,
                "Bab 7: Usaha Ke Arah Kemerdekaan",
                "Jawatankuasa Hubungan Antara Kaum (CLC) ditubuhkan pada tahun 1949 dengan objektif:",
                new String[]{"Menyelesaikan isu perkauman dan membina persefahaman antara pemimpin kaum", "Mengendalikan syarikat perkapalan", "Menguruskan pendaftaran sekolah awam", "Memungut cukai pendapatan"},
                0,
                "CLC membolehkan pemimpin pelbagai kaum berbincang dan bertolak ansur berkaitan politik, ekonomi, dan pendidikan."
        ));

        list.add(new Question(
                32,
                "Bab 7: Usaha Ke Arah Kemerdekaan",
                "Apakah kepentingan Sistem Ahli yang diperkenalkan pada tahun 1951?",
                new String[]{"Pendedahan latihan pentadbiran tempatan sebelum merdeka", "Menghapuskan jawatan gabenor", "Memilih ahli parlimen dunia", "Menukar sistem mata wang"},
                0,
                "Sistem Ahli memberi peluang kepada tokoh tempatan memegang jawatan bertaraf menteri untuk latihan berkerajaan sendiri."
        ));

        list.add(new Question(
                33,
                "Bab 7: Usaha Ke Arah Kemerdekaan",
                "Laporan Barnes 1951 mencadangkan penubuhan sekolah rendah berasaskan:",
                new String[]{"Sekolah kebangsaan menggunakan Bahasa Melayu dan Bahasa Inggeris", "Sekolah mengikut bahasa ibunda masing-masing", "Sekolah tentera khas", "Sekolah swasta antarabangsa"},
                0,
                "Laporan Barnes mencadangkan sekolah rendah kebangsaan dengan Bahasa Melayu dan Bahasa Inggeris sebagai bahasa pengantar."
        ));

        list.add(new Question(
                34,
                "Bab 7: Usaha Ke Arah Kemerdekaan",
                "Kerjasama Parti Perikatan bermula secara rasmi hasil gabungan UMNO dan MCA dalam:",
                new String[]{"Pilihan Raya Majlis Perbandaran Kuala Lumpur 1952", "Pilihan Raya Umum 1959", "Pilihan Raya Negeri Pulau Pinang", "Pilihan Raya Sabah"},
                0,
                "UMNO Kuala Lumpur dan MCA Selangor bergabung dan memenangi 9 daripada 12 kerusi Pilihan Raya Majlis Perbandaran KL 1952."
        ));

        list.add(new Question(
                35,
                "Bab 7: Usaha Ke Arah Kemerdekaan",
                "Siapakah tokoh yang mengasaskan Parti Kemerdekaan Malaya (IMP) pada tahun 1951 selepas keluar dari UMNO?",
                new String[]{"Dato' Onn Jaafar", "Tunku Abdul Rahman", "Tun Tan Cheng Lock", "Tun V.T. Sambanthan"},
                0,
                "Dato' Onn Jaafar menubuhkan IMP bagi membuka keahlian parti politik kepada semua kaum secara terbuka."
        ));

        // --- BAB 8: PILIHAN RAYA ---
        list.add(new Question(
                36,
                "Bab 8: Pilihan Raya",
                "Pilihan raya pertama di Tanah Melayu diadakan pada peringkat tempatan di:",
                new String[]{"George Town, Pulau Pinang (1951)", "Johor Bahru", "Melaka", "Kuala Lumpur"},
                0,
                "Pilihan Raya Majlis Perbandaran George Town pada tahun 1951 adalah pilihan raya tempatan pertama diadakan."
        ));

        list.add(new Question(
                37,
                "Bab 8: Pilihan Raya",
                "Berapakah jumlah kerusi yang dipertandingkan dalam Pilihan Raya Majlis Perundangan Persekutuan (MPP) 1955?",
                new String[]{"52 kerusi", "100 kerusi", "21 kerusi", "75 kerusi"},
                0,
                "Sebanyak 52 kerusi dipertandingkan dalam Pilihan Raya MPP 1955 di seluruh Persekutuan Tanah Melayu."
        ));

        list.add(new Question(
                38,
                "Bab 8: Pilihan Raya",
                "Parti Perikatan mencapai kemenangan cemerlang dalam Pilihan Raya MPP 1955 dengan memenangi:",
                new String[]{"51 daripada 52 kerusi", "30 kerusi", "25 kerusi", "Semua 52 kerusi"},
                0,
                "Parti Perikatan (UMNO-MCA-MIC) menang 51 kerusi, manakala PAS memenangi 1 kerusi."
        ));

        list.add(new Question(
                39,
                "Bab 8: Pilihan Raya",
                "Siapakah yang dilantik sebagai Ketua Menteri Pertama Tanah Melayu selepas Pilihan Raya MPP 1955?",
                new String[]{"Tunku Abdul Rahman Putra Al-Haj", "Dato' Onn Jaafar", "Tun Abdul Razak", "Tun Dr. Ismail"},
                0,
                "Tunku Abdul Rahman dilantik menjadi Ketua Menteri Pertama dan membentuk Kabinet Pertama Tanah Melayu."
        ));

        list.add(new Question(
                40,
                "Bab 8: Pilihan Raya",
                "Apakah peranan penting Kabinet Pertama 1955 pimpinan Tunku Abdul Rahman?",
                new String[]{"Bincang dan menuntut kemerdekaan daripada British", "Menaikkan tarif import getah", "Menubuhkan tentera udara baharu", "Membina empangan air persekutuan"},
                0,
                "Kabinet Pertama berperanan mengurangkan kuasa pentadbir British dan mengetuai rombongan kemerdekaan ke London."
        ));

        // --- BAB 9: PERLEMBAGAAN PERSEKUTUAN TANAH MELAYU 1957 ---
        list.add(new Question(
                41,
                "Bab 9: Perlembagaan PTM 1957",
                "Rombongan Kemerdekaan Tanah Melayu bertolak ke London pada tahun 1956 bagi menandatangani:",
                new String[]{"Perjanjian London 1956", "Perjanjian Versailles", "Perjanjian Manila", "Perjanjian Pangkor"},
                0,
                "Perjanjian London 1956 menetapkan tarikh kemerdekaan PTM pada 31 Ogos 1957."
        ));

        list.add(new Question(
                42,
                "Bab 9: Perlembagaan PTM 1957",
                "Pengerusi Suruhanjaya Bebas yang ditubuhkan untuk merangka Perlembagaan PTM 1957 ialah:",
                new String[]{"Lord Reid", "Sir Ivor Jennings", "Sir William McKell", "Mr. B. Malik"},
                0,
                "Suruhanjaya Reid dipengerusikan oleh Lord Reid bersama ahli pakar perlembagaan dari negara Komanwel."
        ));

        list.add(new Question(
                43,
                "Bab 9: Perlembagaan PTM 1957",
                "Apakah perkara utama yang menjadi dasar rujukan Suruhanjaya Reid dalam merangka perlembagaan?",
                new String[]{"Kerajaan Pusat yang kuat, kedudukan Raja-Raja, dan hak istimewa orang Melayu", "Sistem republik berpresiden", "Penghapusan bahasa kebangsaan", "Penggabungan dengan Singapura"},
                0,
                "Suruhanjaya Reid mengambil kira memorandum cadangan Parti Perikatan dan mengekalkan unsur tradisi."
        ));

        list.add(new Question(
                44,
                "Bab 9: Perlembagaan PTM 1957",
                "Unsur tradisi yang dimasukkan dalam Perlembagaan Persekutuan 1957 meliputi perkara berikut, KECUALI:",
                new String[]{"Institusi Beraja dan Agama Islam", "Bahasa Melayu sebagai Bahasa Kebangsaan", "Kedudukan istimewa orang Melayu", "Sistem pilihan raya presiden"},
                3,
                "Sistem presiden bukan unsur tradisi PTM; Tanah Melayu mengamalkan Demokrasi Berparlimen dan Raja Berperlembagaan."
        ));

        list.add(new Question(
                45,
                "Bab 9: Perlembagaan PTM 1957",
                "Apakah kesan pemeteraian Perjanjian Persekutuan Tanah Melayu 1957?",
                new String[]{"Lahirnya sebuah negara merdeka yang berdaulat mengamalkan demokrasi", "Pemerintahan tentera diperkenalkan", "Penguasaan British dikekalkan 50 tahun lagi", "Pembubaran Negeri-Negeri Melayu"},
                0,
                "Perjanjian PTM 1957 menjadi teras perlembagaan negara merdeka yang berdaulat dan adil."
        ));

        // --- BAB 10: PEMASYHURAN KEMERDEKAAN ---
        list.add(new Question(
                46,
                "Bab 10: Pemasyhuran Kemerdekaan",
                "Apakah maksud kemerdekaan menurut Tunku Abdul Rahman?",
                new String[]{"Berkhidmat untuk negara asing", "Stesen akhir perjuangan untuk kebebasan dan kedaulatan tanah air", "Pertukaran gabenor baharu", "Kebebasan tanpa sebarang undang-undang"},
                1,
                "Tunku Abdul Rahman menegaskan kemerdekaan menandakan hak menentukan nasib sendiri dan kedaulatan tanah air."
        ));

        list.add(new Question(
                47,
                "Bab 10: Pemasyhuran Kemerdekaan",
                "Stadium bersejarah yang dibina khas untuk peristiwa Pemasyhuran Kemerdekaan 1957 ialah:",
                new String[]{"Stadium Merdeka", "Stadium Nasional Bukit Jalil", "Stadium Shah Alam", "Stadium Gelora"},
                0,
                "Stadium Merdeka dibina atas cetusan idea Tunku Abdul Rahman bagi meraikan pemasyhuran kemerdekaan negara."
        ));

        list.add(new Question(
                48,
                "Bab 10: Pemasyhuran Kemerdekaan",
                "Lagu rasmi kebangsaan 'Negaraku' dicipta berasaskan lagu negeri:",
                new String[]{"Perak (Terang Bulan)", "Johor", "Selangor", "Kedah"},
                0,
                "Melodi lagu 'Terang Bulan' (Lagu Negeri Perak) dipilih oleh jawatankuasa untuk dijadikan lagu kebangsaan Negaraku."
        ));

        list.add(new Question(
                49,
                "Bab 10: Pemasyhuran Kemerdekaan",
                "Apakah peristiwa simbolik yang berlaku pada jam 12:00 tengah malam 30 Ogos 1957 di Padang Kelab Selangor?",
                new String[]{"Bendera Union Jack diturunkan dan bendera Persekutuan Tanah Melayu dikerek", "Lagu British dimainkan berulang kali", "Pengisytiharan darurat baharu", "Perarakan kenderaan berhias"},
                0,
                "Penurunan bendera Union Jack dan pengibaran bendera PTM menandakan berakhirnya penjajahan British."
        ));

        list.add(new Question(
                50,
                "Bab 10: Pemasyhuran Kemerdekaan",
                "Berapakah kali Tunku Abdul Rahman melaungkan 'MERDEKA!' di Stadium Merdeka pada pagi 31 Ogos 1957?",
                new String[]{"7 kali", "3 kali", "5 kali", "10 kali"},
                0,
                "Tunku Abdul Rahman melaungkan 'MERDEKA!' sebanyak 7 kali diiringi sorakan gemuruh ribuan rakyat."
        ));

        return list;
    }

    public static List<Question> getSet2Questions() {
        List<Question> list = new ArrayList<>();

        // --- BAB 1: WARISAN NEGARA BANGSA (SKENARIO & APLIKASI / KBAT) ---
        list.add(new Question(
                51,
                "Bab 1: Warisan Negara Bangsa (Aplikasi)",
                "Situasi: Sebuah negara jiran cuba menceroboh perairan negara. Berdasarkan konsep kedaulatan Kesultanan Melayu Melaka, apakah tindakan terbaik kerajaan?",
                new String[]{"Menyerahkan wilayah untuk elak konflik", "Mempunyai undang-undang tegas dan pertahanan berwibawa bagi mempertahankan kedaulatan", "Meminta bantuan kuasa asing tanpa syarat", "Membiarkan rakyat menentukan sendiri"},
                1,
                "Kedaulatan ialah kekuasaan tertinggi. Mempertahankan kedaulatan negara memerlukan ketegasan undang-undang dan kesiapsiagaan pertahanan."
        ));

        list.add(new Question(
                52,
                "Bab 1: Warisan Negara Bangsa (Situasi)",
                "Situasi: Kerajaan memperkenalkan undang-undang keselamatan jalan raya yang ketat. Mengapakah pematuhan rakyat terhadap undang-undang ini penting?",
                new String[]{"Meningkatkan hasil saman kerajaan", "Menjamin kesejahteraan, keselamatan dan ketenteraman awam", "Menyusahkan pengguna kenderaan", "Mencontohi negara luar sahaja"},
                1,
                "Seperti Hukum Kanun Melaka, undang-undang diwujudkan untuk mengawal ketenteraman dan menjamin keselamatan masyarakat."
        ));

        list.add(new Question(
                53,
                "Bab 1: Warisan Negara Bangsa (KBAT)",
                "Bagaimanakah prinsip 'Waadat' (perjanjian kesetiaan raja dan rakyat) boleh diaplikasikan dalam amalan demokrasi moden hari ini?",
                new String[]{"Rakyat patuh semberono tanpa teguran", "Pemimpin mentadbir secara adil dan rakyat memberikan kerjasama sokongan", "Pemimpin bebas meminda perlembagaan sesuka hati", "Rakyat tidak perlu membayar cukai"},
                1,
                "Amalan timbal balik waadat dizahirkan dalam demokrasi di mana pemimpin berkhidmat dengan jujur dan rakyat taat setia."
        ));

        list.add(new Question(
                54,
                "Bab 1: Warisan Negara Bangsa (Aplikasi)",
                "Pembesar Berempat Melaka mengamalkan pembahagian tugas yang tersusun. Apakah faedah pembahagian tugas ini kepada organisasi moden?",
                new String[]{"Mengelakkan pertindihan kuasa dan meningkatkan kecekapan pentadbiran", "Menambah kos perbelanjaan", "Membiarkan Bendahara membuat semua kerja", "Mengurangkan jawatan pegawai"},
                0,
                "Pembahagian tugas mengikut kepakaran memastikan tadbir urus lancar dan berkesan."
        ));

        list.add(new Question(
                55,
                "Bab 1: Warisan Negara Bangsa (Situasi)",
                "Sebagai warganegara Malaysia, bagaimanakah anda boleh menunjukkan rasa hormat terhadap lambang-lambang kebesaran negara seperti Jata Negara dan Jalur Gemilang?",
                new String[]{"Berdiri tegak semasa lagu kebangsaan dan tidak merosakkan bendera", "Menggunakan bendera sebagai kain alas", "Ubah warna bendera mengikut selera", "Mengabaikan etika pengibaran bendera"},
                0,
                "Lambang negara mewakili kedaulatan dan identiti bangsa yang wajib dihormati oleh setiap warga."
        ));

        // --- BAB 2: KEBANGKITAN NASIONALISME (SKENARIO & APLIKASI / KBAT) ---
        list.add(new Question(
                56,
                "Bab 2: Kebangkitan Nasionalisme (Aplikasi)",
                "Situasi: Generasi muda hari ini terdedah kepada pengaruh budaya luar yang pesat melalui media sosial. Bagaimanakah semangat nasionalisme dapat diterapkan?",
                new String[]{"Menutup terus akses internet", "Memanfaatkan media digital untuk menghasilkan kandungan kreatif bertemakan sejarah dan patriotisme", "Mengharamkan bahasa asing di sekolah", "Memaksa semua pelajar menyertai tentera"},
                1,
                "Nasionalisme moden memerlukan pendekatan kreatif menggunakan media digital untuk memupuk kecintaan terhadap warisan tanah air."
        ));

        list.add(new Question(
                57,
                "Bab 2: Kebangkitan Nasionalisme (Situasi)",
                "Tokoh Kaum Muda menggunakan akhbar Al-Imam untuk menyedarkan masyarakat. Bagaimanakah pengguna media sosial hari ini boleh meneladani peranan akhbar tersebut?",
                new String[]{"Menyebarkan fitnah dan khabar angin", "Menyebarkan maklumat sahih, ilmu pengetahuan dan mesej perpaduan", "Mengkritik tanpa bukti", "Mengabaikan Isu-isu semasa"},
                1,
                "Media hendaklah digunakan secara bertanggungjawab untuk menyampaikan ilmu, kebenaran, dan semangat kebangsaan."
        ));

        list.add(new Question(
                58,
                "Bab 2: Kebangkitan Nasionalisme (KBAT)",
                "Mengapakah ikatan persatuan dan pertubuhan belia penting dalam mempertahankan hak sosioekonomi masyarakat tempatan?",
                new String[]{"Menyediakan platform rasmi menyuarakan pandangan dan cadangan pembaharuan", "Mengadakan tindakan ganas", "Menolak pemodenan", "Memenjarakan penunjuk perasaan"},
                0,
                "Persatuan menyatukan tenaga dan pandangan masyarakat secara berstruktur demi kemajuan bersama."
        ));

        list.add(new Question(
                59,
                "Bab 2: Kebangkitan Nasionalisme (Aplikasi)",
                "Pengorbanan tokoh nasionalis silam wajar dihargai. Apakah langkah terbaik untuk memperingati jasa mereka dalam kehidupan harian?",
                new String[]{"Mempelajari sejarah dan menyumbang bakti kepada kemajuan negara", "Hanya menghafal tarikh lahir tokoh", "Mendirikan patung di setiap taman", "Menamai semua jalan dengan nama yang sama"},
                0,
                "Menghayati perjuangan mereka dizahirkan melalui usaha gigih memajukan diri dan negara."
        ));

        list.add(new Question(
                60,
                "Bab 2: Kebangkitan Nasionalisme (Situasi)",
                "Apakah peranan usahawan belia dalam menzahirkan semangat nasionalisme ekonomi?",
                new String[]{"Membeli barangan seludup", "Membangunkan produk tempatan bermutu tinggi dan menyokong barangan buatan Malaysia", "Menjual premis kepada pelabur luar", "Mengimport barangan asing secara berlebihan"},
                1,
                "Sokongan terhadap ekonomi tempatan mengukuhkan ketahanan dan kemandirian ekonomi negara."
        ));

        // --- BAB 3: KONFLIK DUNIA DAN PENDUDUKAN JEPUN (SKENARIO & APLIKASI / KBAT) ---
        list.add(new Question(
                61,
                "Bab 3: Pendudukan Jepun (Aplikasi)",
                "Pendudukan Jepun menyebabkan krisis bekalan makanan yang teruk. Apakah iktibar yang boleh diambil oleh rakyat Malaysia hari ini?",
                new String[]{"Mengharapkan import makanan dari luar", "Mengamalkan sikap berdikari dan memperkasakan sekuriti makanan tempatan", "Mengurangkan saiz populasi negara", "Menghadkan pengeluaran pertanian"},
                1,
                "Pengalaman pahit pendudukan Jepun mengajar pentingnya ketahanan dan sekuriti makanan tempatan."
        ));

        list.add(new Question(
                62,
                "Bab 3: Penentangan Bersenjata (Situasi)",
                "Keberanian anggota Force 136 menentang penceroboh asing memberikan iktibar bahawa:",
                new String[]{"Kesiapsiagaan dan keberanian rakyat penting dalam mempertahankan negara daripada ancaman", "Senjata asing sentiasa lebih canggih", "Perang adalah jalan pertama penyesaian", "Kerjasama dengan penceroboh adalah wajar"},
                0,
                "Semangat pertahanan diri dan ketahanan mental penting bagi menghadapi krisis ancaman luar."
        ));

        list.add(new Question(
                63,
                "Bab 3: Propaganda Jepun (KBAT)",
                "Tentera Jepun menggunakan slogan halus untuk memperdaya rakyat. Bagaimanakah rakyat moden boleh mengelak daripada terpengaruh dengan propaganda asing?",
                new String[]{"Menapis maklumat dan berfikir secara kritis sebelum percaya", "Menerima semua maklumat di internet secara bulat-bulat", "Mengabaikan berita rasmi", "Memusnahkan telefon pintar"},
                0,
                "Pemikiran kritis dan literasi media penting bagi mengelakkan manipulasi maklumat luar."
        ));

        list.add(new Question(
                64,
                "Bab 3: Konflik Dunia (Situasi)",
                "Perang Dunia menimbulkan kesengsaraan hidup dan nyawa terkorban. Apakah peranan Malaysia dalam memastikan keamanan dunia kekal terpelihara?",
                new String[]{"Mengamalkan dasar berkecuali dan menyokong diplomasi antarabangsa", "Menyertai pakatan ketenteraan menyerang negara lain", "Menyumbang senjata api", "Memutuskan hubungan diplomatik"},
                0,
                "Malaysia konsisten mengamalkan dasar luar yang aman, berkecuali, dan mengutamakan rundingan meja bulat."
        ));

        list.add(new Question(
                65,
                "Bab 3: Pendudukan Jepun (Aplikasi)",
                "Dasar 'Nipponisasi' Jepun cuba menghapuskan budaya tempatan. Mengapakah pemeliharaan jati diri bangsa penting bagi sesebuah negara?",
                new String[]{"Mengekalkan identiti warisan dan kedaulatan bangsa daripada lenyap", "Menolak sebarang teknologi moden", "Mengasingkan diri daripada dunia luar", "Memastikan budaya tidak berubah"},
                0,
                "Jati diri yang kukuh benteng utama pertahanan budaya daripada terhakis oleh pengaruh asing."
        ));

        // --- BAB 4: ERA PERALIHAN KUASA & MALAYAN UNION (SKENARIO & APLIKASI / KBAT) ---
        list.add(new Question(
                66,
                "Bab 4: Penentangan Malayan Union (Situasi)",
                "Penentangan terhadap Malayan Union menyaksikan penyatuan rakyat menerusi demonstrasi aman dan kongres. Apakah pengajaran utama daripada peristiwa ini?",
                new String[]{"Perpaduan dan muafakat adalah kunci kejayaan menentang ketidakadilan", "Kekerasan senjata adalah jalan terbaik", "Boikot ekonomi lebih berkesan", "Perubahan undang-undang tidak memerlukan sokongan"},
                0,
                "Muafakat dan penyatuan persatuan-persatuan Melayu berjaya menggagalkan Malayan Union."
        ));

        list.add(new Question(
                67,
                "Bab 4: Penentangan Malayan Union (Aplikasi)",
                "Mengapakah institusi Raja Berperlembagaan perlu terus dipertahankan dalam sistem pentadbiran Malaysia?",
                new String[]{"Sebagai simbol perpaduan, kestabilan politik, dan payung kedaulatan negara", "Kerana tiada pilihan pentadbiran lain", "Untuk mengurangkan tugas parlimen", "Sebagai perhiasan sejarah sahaja"},
                0,
                "Institusi Raja Berperlembagaan merupakan tonggak imbangan kuasa dan simbol perpaduan berbilang kaum."
        ));

        list.add(new Question(
                68,
                "Bab 4: Peranan Wanita (KBAT)",
                "Tokoh wanita seperti Cikgu Zaharah Taha berani berucap menentang Malayan Union. Apakah iktibar peranan wanita dalam pembangunan negara hari ini?",
                new String[]{"Wanita memainkan peranan penting dalam kepimpinan, politik, dan pembangunan sosioekonomi", "Wanita tidak perlu terlibat dalam urusan awam", "Wanita hanya fokus bidang perniagaan swasta", "Peranan wanita terhad di luar bandar"},
                0,
                "Penglibatan wanita dalam kepimpinan mengukuhkan kekuatan pembangunan sesebuah negara."
        ));

        list.add(new Question(
                69,
                "Bab 4: Penentangan di Sarawak (Situasi)",
                "Gerakan penentangan penyerahan Sarawak melibatkan saluran penulisan dan persatuan. Bagaimanakah masyarakat moden boleh menyuarakan pandangan secara berhemah?",
                new String[]{"Menggunakan saluran undang-undang, media rasmi, dan rundingan beretika", "Merosakkan harta benda awam", "Menyebarkan kebencian di media sosial", "Memboikot perkhidmatan kesihatan"},
                0,
                "Suara rakyat lebih dihormati apabila disampaikan secara berfakta, beretika, dan mengikut saluran undang-undang."
        ));

        list.add(new Question(
                70,
                "Bab 4: Malayan Union (Aplikasi)",
                "Pengenalan dasar kerakyatan yang terlalu terbuka tanpa syarat kesetiaan boleh mengancam negara. Mengapakah syarat kewarganegaraan perlu dipatuhi?",
                new String[]{"Menjamin kesetiaan yang tidak berbelah bahagi kepada negara", "Menghadkan jumlah pelancong", "Menaikkan bayaran visa", "Mengelakkan pertambahan sekolah"},
                0,
                "Kewarganegaraan bukan sekadar status hukum tetapi komitmen taat setia kepada tanah air."
        ));

        // --- BAB 5: PEMBINAAN PTM 1948 (SKENARIO & APLIKASI / KBAT) ---
        list.add(new Question(
                71,
                "Bab 5: Pembinaan PTM 1948 (Aplikasi)",
                "Kejayaan pembentukan PTM 1948 adalah hasil perundingan meja bulat. Apakah iktibar kaedah rundingan dalam menyelesaikan pertikaian hari ini?",
                new String[]{"Mengelakkan pertumpahan darah dan mencapai penyelesaian menang-menang", "Melengahkan masa pentadbiran", "Menunjukkan kelemahan pemimpin", "Membazirkan perbelanjaan awam"},
                0,
                "Rundingan dan toleransi cara paling matang mencapai keharmonian tanpa kestabilan terjejas."
        ));

        list.add(new Question(
                72,
                "Bab 5: Kerjasama Kaum (Situasi)",
                "Walaupun wujud perbezaan pandangan antara gabungan PUTERA-AMCJA dan Jawatankuasa Kerja, semangat berdialog tetap diteruskan. Mengapakah dialog penting?",
                new String[]{"Mewujudkan ruang persefahaman dan menghormati hak kepelbagaian", "Memaksa satu pihak menyerah kalah", "Menunjuk-nunjuk kekuatan pengaruh", "Menangguhkan pilihan raya"},
                0,
                "Dialog membolehkan pelbagai pihak menyampaikan hasrat dan mencari titik persamaan demi negara."
        ));

        list.add(new Question(
                73,
                "Bab 5: Persekutuan Tanah Melayu (KBAT)",
                "Mengapakah konsep Persekutuan (pembahagian kuasa Kerajaan Pusat dan Kerajaan Negeri) sesuai dengan negara kita?",
                new String[]{"Menjamin kerjasama adil antara pusat dan negeri mengikut perlembagaan", "Membolehkan negeri keluar dari persekutuan", "Memusatkan semua duit di pusat", "Menghapus kuasa kerajaan tempatan"},
                0,
                "Sistem Persekutuan memastikan pembangunan sekata dan memelihara keunikan setiap negeri."
        ));

        list.add(new Question(
                74,
                "Bab 5: PTM 1948 (Situasi)",
                "Bagaimanakah hak istimewa orang Melayu dan Bumiputera diimbangi dengan hak kaum lain dalam PTM 1948?",
                new String[]{"Melalui toleransi politik dan pengiktirafan hak pemastautin sah", "Menindas hak kaum minoriti", "Menyerahkan semua tanah kepada asing", "Mengecualikan cukai kepada satu kaum sahaja"},
                0,
                "Kontrak sosial dan perjanjian PTM 1948 mengiktiraf kedudukan istimewa tanpa mengabaikan hak kaum lain."
        ));

        list.add(new Question(
                75,
                "Bab 5: Pembinaan Negara (Aplikasi)",
                "Apakah peranan belia hari ini dalam mengekalkan warisan kestabilan yang dibina sejak PTM 1948?",
                new String[]{"Menjaga keharmonian kaum dan mematuhi Perlembagaan Persekutuan", "Mencetuskan provokasi perkauman", "Mengabaikan sejarah negara", "Menolak integrasi nasional"},
                0,
                "Tanggungjawab generasi muda adalah memelihara keharmonian dan mengisi kemerdekaan dengan kejayaan."
        ));

        // --- BAB 6: ANCAMAN KOMUNIS DAN DARURAT (SKENARIO & APLIKASI / KBAT) ---
        list.add(new Question(
                76,
                "Bab 6: Perang Saraf (Aplikasi)",
                "Strategi Perang Saraf Templer berjaya memenangi hati dan fikiran rakyat. Bagaimanakah strategi ini diaplikasikan dalam pengurusan krisis hari ini?",
                new String[]{"Pendekatan prihatin, kebajikan, diplomasi dan komunikasi telus dengan rakyat", "Menggunakan ancaman ketenteraan berterusan", "Mengenakan perintah berkurung tanpa had", "Menutup sekolah awam"},
                1,
                "Keperihatinan, komunikasi telus, dan bantuan kebajikan cara paling berkesan memenangi sokongan rakyat."
        ));

        list.add(new Question(
                77,
                "Bab 6: Ancaman Ekstremisme (Situasi)",
                "Komunis menggunakan ancaman ideologi radikal. Bagaimanakah masyarakat moden boleh membendung fahaman ekstremisme siber hari ini?",
                new String[]{"Melaporkan kandungan radikal dan menyemai nilai kesederhanaan (wasatiyyah)", "Menyertai kumpulan ekstremis", "Menggalakkan ucapan kebencian", "Membiarkan belia terpengaruh"},
                0,
                "Pendidikan kesederhanaan dan pemantauan kendiri benteng menyekat fahaman ekstremis."
        ));

        list.add(new Question(
                78,
                "Bab 6: Kerjasama Awam (KBAT)",
                "Penubuhan pasukan Home Guard semasa Darurat membuktikan pentingnya penglibatan awam. Apakah amalan moden yang setara dengannya?",
                new String[]{"Pasukan Skim Rondaan Tetangga (SRT) dan Sukarelawan Polis", "Syarikat kawalan swasta asing", "Kumpulan samseng tempatan", "Pengawal peribadi individu"},
                0,
                "Rukun Tetangga dan sukarelawan keselamatan contoh kerjasama awam menjaga ketenteraman komuniti."
        ));

        list.add(new Question(
                79,
                "Bab 6: Kad Pengenalan (Aplikasi)",
                "Pengenalan kad pengenalan semasa Darurat bertujuan mengawal pergerakan komunis. Apakah kepentingan dokumen pengenalan diri moden hari ini?",
                new String[]{"Memudahkan urusan rasmi, mengesahkan kerakyatan, dan menjamin keselamatan negara", "Mengumpul koleksi kad", "Menaikkan kos pembuatan", "Membatasi pendaftaran sekolah"},
                0,
                "Dokumen pengenalan diri penting bagi keselamatan, kawalan sempadan, dan hak kemudahan warganegara."
        ));

        list.add(new Question(
                80,
                "Bab 6: Iktibar Darurat (Situasi)",
                "Darurat menyebabkan kemerosotan ekonomi dan penderitaan rakyat. Apakah iktibar terbesar daripada zaman Darurat?",
                new String[]{"Keamanan negara adalah nikmat paling berharga yang wajib dipertahankan bersama", "Peperangan menguntungkan sesetengah pihak", "Kekerasan dapat menyelesaikan masalah ideologi", "Ekonomi tidak terjejas akibat krisis"},
                0,
                "Kestabilan dan keamanan asas kestabilan ekonomi dan kesejahteraan hidup rakyat."
        ));

        // --- BAB 7: USAHA KE ARAH KEMERDEKAAN (SKENARIO & APLIKASI / KBAT) ---
        list.add(new Question(
                81,
                "Bab 7: Jawatankuasa Hubungan Kaum (Aplikasi)",
                "CLC menunjukkan teladan toleransi antara pemimpin Melayu, Cina dan India. Bagaimanakah pemikiran dialog ini dapat diterapkan dalam persekitaran sekolah/ipg?",
                new String[]{"Mengadakan aktiviti silang budaya dan menghormati perbezaan rakan", "Mengelompokkan murid mengikut kaum sahaja", "Mengharamkan bahasa ibunda", "Mengabaikan perayaan kaum lain"},
                0,
                "Aktiviti silang budaya di sekolah memupuk persefahaman dan integrasi sejak awal umur."
        ));

        list.add(new Question(
                82,
                "Bab 7: Sistem Ahli (Situasi)",
                "Sistem Ahli memberikan pendedahan pentadbiran kepada tokoh tempatan. Mengapakah program latihan kepimpinan penting bagi belia hari ini?",
                new String[]{"Melahirkan pemimpin masa depan yang berwibawa, berintegriti dan berilmu", "Melengahkan umur bersara", "Mengurangkan persaingan kerja", "Mewajibkan ujian bertulis tahunan"},
                0,
                "Latihan praktikal pentadbiran menyediakan generasi muda menghadapi cabaran kepimpinan."
        ));

        list.add(new Question(
                83,
                "Bab 7: Pendidikan Kebangsaan (KBAT)",
                "Mengapakah sistem pendidikan kebangsaan yang seragam penting bagi sesebuah negara berbilang kaum?",
                new String[]{"Membentuk nilai sepunya, semangat patriotik, dan integrasi nasional", "Menghapuskan kepelbagaian bahasa", "Menjimatkan cetakan buku", "Memudahkan peperiksaan swasta"},
                0,
                "Pendidikan kebangsaan alat perpaduan paling berkesan menyatukan kepelbagaian latar belakang."
        ));

        list.add(new Question(
                84,
                "Bab 7: Kerjasama Politik (Situasi)",
                "Kerjasama UMNO-MCA-MIC membuktikan perpaduan politik membawa kemerdekaan. Apakah pengajaran kepada parti politik moden?",
                new String[]{"Mengutamakan kepentingan nasional dan perpaduan berbanding agenda peribadi", "Mencetuskan isu perkauman sensitif", "Memboikot dasar kerajaan", "Memecahbelahkan sokongan rakyat"},
                0,
                "Kepentingan tertinggi negara mengatasi perselisihan faham politik kepartian."
        ));

        list.add(new Question(
                85,
                "Bab 7: Toleransi Politik (Aplikasi)",
                "Tolak ansur membolehkan tuntutan kemerdekaan diterima British. Bagaimanakah anda mengamalkan sikap tolak ansur dalam kehidupan seharian?",
                new String[]{"Mendengar pandangan orang lain dan mencari penyelesaian adil bersama", "Ego dengan pandangan sendiri", "Memaksa rakan mengikut kehendak kita", "Meninggalkan perbincangan awal"},
                0,
                "Tolak ansur dan kemaafan kunci keharmonian hubungan sesama manusia dalam masyarakat."
        ));

        // --- BAB 8: PILIHAN RAYA (SKENARIO & APLIKASI / KBAT) ---
        list.add(new Question(
                86,
                "Bab 8: Tanggungjawab Pengundi (Aplikasi)",
                "Kelayakan mengundi kini diturunkan kepada umur 18 tahun (Undi18). Apakah tanggungjawab belia 18 tahun apabila berada di pusat undi?",
                new String[]{"Memilih calon yang berwibawa dan berintegriti berdasarkan maklumat sahih", "Ikut-ikutan kawan tanpa mengkaji calon", "Menjual undi untuk wang ringgit", "Rosakkan kertas undi sengaja"},
                0,
                "Undi adalah amanah demokrasi untuk menentukan hala tuju kepimpinan negara."
        ));

        list.add(new Question(
                87,
                "Bab 8: Pilihan Raya Etika (Situasi)",
                "Semasa kempen pilihan raya, wujud pihak yang menggunakan isu sensitif perkauman (3R). Apakah tindakan matang pengundi?",
                new String[]{"Menolak provokasi isu 3R dan menilai calon menerusi manifesto bernas", "Menyebarkan lagi video provokasi", "Mencetuskan pergaduhan di tempat berkempen", "Memboikot proses pilihan raya"},
                0,
                "Masyarakat matang menolak politik perkauman dan mengutamakan agenda pembangunan bernas."
        ));

        list.add(new Question(
                88,
                "Bab 8: Suruhanjaya Pilihan Raya (KBAT)",
                "Mengapakah ketelusan dan kebebasan Suruhanjaya Pilihan Raya (SPR) penting dalam amalan demokrasi?",
                new String[]{"Menjamin keadilan pilihan raya dan mengekalkan kepercayaan rakyat", "Memastikan satu parti sahaja menang", "Menaikkan kos pengundian", "Melengahkan keputusan undi"},
                0,
                "SPR yang telus dan adil menjamin keabsahan kepimpinan yang dipilih oleh rakyat."
        ));

        list.add(new Question(
                89,
                "Bab 8: Kabinet Pertama (Situasi)",
                "Kabinet Pertama 1955 terdiri daripada pelbagai kaum yang bekerjasama erat. Apakah iktibar pimpinan Kabinet Pertama ini?",
                new String[]{"Kepimpinan berbilang kaum yang bersatu padu mampu membina negara yang stabil", "Setiap menteri hanya jaga kaum masing-masing", "Tugas pentadbiran diserahkan semula ke British", "Penyatuan kaum tidak bertahan lama"},
                0,
                "Kepimpinan inklusif mewakili pelbagai kaum asas keharmonian dan kemajuan Persekutuan."
        ));

        list.add(new Question(
                90,
                "Bab 8: Keputusan Pilihan Raya (Aplikasi)",
                "Selepas keputusannya diumumkan, penyokong calon hendaklah menerima keputusan dengan tenang. Mengapakah amalan ini penting?",
                new String[]{"Mengekalkan ketenteraman awam dan menghormati proses demokrasi", "Menganjurkan rusuhan jalanan", "Memusnahkan peti undi", "Menghina pengundi parti lawan"},
                0,
                "Penerimaan matang keputusan pilihan raya lambang kematangan demokrasi sesebuah negara."
        ));

        // --- BAB 9: PERLEMBAGAAN PTM 1957 (SKENARIO & APLIKASI / KBAT) ---
        list.add(new Question(
                91,
                "Bab 9: Perlembagaan Persekutuan (Aplikasi)",
                "Perlembagaan Persekutuan merupakan undang-undang tertinggi negara. Apakah implikasi sekiranya sebarang undang-undang bertentangan dengannya?",
                new String[]{"Undang-undang baharu tersebut adalah terbatal setakat yang bertentangan", "Perlembagaan akan dibubarkan", "Mahkamah ditutup serta merta", "Rakyat boleh mengabaikan undang-undang"},
                0,
                "Prinsip Keluhuran Perlembagaan menetapkan mana-mana undang-undang yang bertentangan adalah terbatal."
        ));

        list.add(new Question(
                92,
                "Bab 9: Agama & Keharmonian (Situasi)",
                "Perlembagaan menetapkan Islam agama Persekutuan tetapi agama lain bebas diamalkan. Bagaimanakah kebebasan ini memupuk perpaduan?",
                new String[]{"Mewujudkan rasa hormat-menghormati dan keharmonian antara penganut agama", "Menyebabkan persaingan tempat ibadat", "Memaksa pertukaran agama", "Menghapuskan amalan perayaan kaum"},
                0,
                "Jaminan kebebasan beragama mengukuhkan toleransi dan keharmonian masyarakat majmuk."
        ));

        list.add(new Question(
                93,
                "Bab 9: Bahasa Kebangsaan (KBAT)",
                "Bahasa Melayu diiktiraf sebagai Bahasa Kebangsaan dalam Perlembagaan. Apakah peranan bahasa kebangsaan sebagai alat perpaduan?",
                new String[]{"Menjadi bahasa perantara utama yang menyatukan pelbagai kaum", "Menghadkan bahasa asing di universiti", "Mewajibkan satu dialek sahaja", "Menjeaskan sektor pelancongan"},
                0,
                "Bahasa kebangsaan memainkan peranan penting membina identiti bersama dan membolehkan interaksi berkesan."
        ));

        list.add(new Question(
                94,
                "Bab 9: Suruhanjaya Bebas (Aplikasi)",
                "Suruhanjaya Reid mendengar pandangan pelbagai pihak sebelum merangka perlembagaan. Mengapakah maklum balas awam penting dalam pembuat dasar?",
                new String[]{"Memastikan dasar baharu merangkumi keperluan dan hak keadilan semua rakyat", "Melengahkan kelulusan undang-undang", "Mengurangkan peranan ahli parlimen", "Menyusahkan pengerusi suruhanjaya"},
                0,
                "Penglibatan awam menjadikan sesuatu perlembagaan atau dasar lebih inklusif dan dihormati."
        ));

        list.add(new Question(
                95,
                "Bab 9: Kontrak Sosial (Situasi)",
                "Pemuafakatan dalam Perlembagaan 1957 sering dirujuk sebagai kontrak sosial. Mengapakah generasi moden perlu menghormati pencerahan kontrak sosial ini?",
                new String[]{"Memelihara keharmonian asas dan mengelakkan pertikaian sensitif yang merosakkan", "Untuk dipinda setiap lima tahun", "Kerana ia dibuat oleh penjajah", "Menyusahkan pentadbiran moden"},
                0,
                "Keseimbangan kontrak sosial yang disepakati oleh tokoh kemerdekaan ialah tiang keharmonian Malaysia."
        ));

        // --- BAB 10: PEMASYHURAN KEMERDEKAAN (SKENARIO & APLIKASI / KBAT) ---
        list.add(new Question(
                96,
                "Bab 10: Pengisian Kemerdekaan (Aplikasi)",
                "Generasi terdahulu berjuang membebaskan tanah air. Apakah cara paling berkesan generasi hari ini mengisi kemerdekaan?",
                new String[]{"Menguasai ilmu, berinovasi dalam teknologi dan menyumbang kemajuan ekonomi", "Sekadar bercuti pada hari kemerdekaan", "Mengharapkan bantuan asing", "Mengingkari undang-undang negara"},
                0,
                "Mengisi kemerdekaan bermaksud memajukan negara menerusi ilmunya, kecemerlangan, dan integriti."
        ));

        list.add(new Question(
                97,
                "Bab 10: Patriotisme (Situasi)",
                "Semasa sambutan Bulan Kemerdekaan, sekolah mengadakan pertandingan lagu patriotik dan kibar Jalur Gemilang. Apakah objektif utamanya?",
                new String[]{"Menyemai rasa bangga dan cinta yang mendalam terhadap tanah air", "Menghabiskan peruntukan sekolah", "Mengisi masa lapang murid", "Memilih pemenang hadiah sahaja"},
                0,
                "Aktiviti patriotik menyemai rasa syukur dan kecintaan terhadap warisan serta kedaulatan negara."
        ));

        list.add(new Question(
                98,
                "Bab 10: Pentas Antarabangsa (KBAT)",
                "Penyertaan Malaysia dalam PBB dan Komanwel selepas merdeka membuktikan:",
                new String[]{"Pengiktirafan kedaulatan Malaysia oleh masyarakat antarabangsa", "Malaysia bergantung kepada arahan luar", "Keanggotaan wajib untuk perdagangan", "Kemerosotan kuasa tentera tempatan"},
                0,
                "Penyertaan dalam organisasi antarabangsa menandakan kedaulatan negara diiktiraf sepenuhnya."
        ));

        list.add(new Question(
                99,
                "Bab 10: Pertahanan Kedaulatan (Aplikasi)",
                "Ancaman moden hari ini merangkumi penjajahan bentuk baharu seperti pencerobohan siber dan dominasi ekonomi. Bagaimanakah kita boleh melawannya?",
                new String[]{"Mengukuhkan ketahanan siber, menyokong barangan tempatan dan berilmu tinggi", "Menyerahkan kawalan data ke luar", "Membiarkan syarikat asing menguasai pasaran", "Mengabaikan ancaman siber"},
                0,
                "Ketahanan ilmu, kecanggihan siber, dan ekonomi yang kukuh merupakan benteng kedaulatan moden."
        ));

        list.add(new Question(
                100,
                "Bab 10: Laungan Merdeka (Situasi)",
                "Laungan 'MERDEKA!' sebanyak 7 kali oleh Tunku Abdul Rahman masih bergema sehingga hari ini. Apakah mesej utama yang perlu diingati?",
                new String[]{"Kemerdekaan adalah amanah suci yang wajib dipertahankan bersama oleh setiap rakyat", "Kemerdekaan hanya peristiwa sejarah lalu", "Laungan itu adalah gimik politik", "Tugas mempertahankan negara telah selesai"},
                0,
                "Kemerdekaan bukan pengakhiran tetapi permulaan amanah besar untuk memakmurkan dan mempertahankan tanah air."
        ));

        return list;
    }
}