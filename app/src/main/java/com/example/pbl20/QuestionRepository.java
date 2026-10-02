package com.example.pbl20;

import java.util.ArrayList;
import java.util.List;

public class QuestionRepository {

    public static List<Question> getQuestions() {
        List<Question> list = new ArrayList<>();

        // --- BAB 1: WARISAN NEGARA BANGSA ---
        list.add(new Question(
                1,
                "Bab 1: Warisan Negara Bangsa",
                "Rajah menunjukkan kota dan pelabuhan Kesultanan Melayu Melaka. Kerajaan, rakyat, kedaulatan, wilayah pengaruh dan undang-undang merupakan ciri utama pembentukan kerajaan Kesultanan Melayu Melaka yang menjadi asas warisan negara bangsa.",
                true,
                "Ciri-ciri negara bangsa Kesultanan Melayu Melaka meliputi Kerajaan, Rakyat, Kedaulatan, Wilayah Pengaruh, Undang-undang, dan Lambang Kebesaran. Rajah menggambarkan Melaka sebagai pusat pemerintahan dan pelabuhan entrepot yang maju.",
                R.drawable.img_kota_melaka
        ));

        // --- BAB 2: KEBANGKITAN NASIONALISME ---
        list.add(new Question(
                2,
                "Bab 2: Kebangkitan Nasionalisme",
                "Jawi Peranakan ialah akhbar Melayu pertama yang diterbitkan di Singapura pada tahun 1876.",
                true,
                "Jawi Peranakan ialah akhbar Melayu pertama, diterbitkan di Singapura pada tahun 1876. Akhbar seperti ini membantu menyebarkan kesedaran nasionalisme dalam kalangan masyarakat Melayu."
        ));

        // --- BAB 3: KONFLIK DUNIA DAN PENDUDUKAN JEPUN ---
        list.add(new Question(
                3,
                "Bab 3: Konflik Dunia & Pendudukan Jepun",
                "Perang Dunia Pertama pada tahun 1914 tercetus akibat serangan Jepun ke atas Pearl Harbour.",
                false,
                "Perang Dunia Pertama tercetus akibat pembunuhan Archduke Franz Ferdinand dari Austria-Hungary oleh nasionalis Serbia. Serangan ke atas Pearl Harbour berlaku pada tahun 1941 semasa Perang Dunia Kedua."
        ));

        // --- BAB 4: ERA PERALIHAN KUASA & MALAYAN UNION ---
        list.add(new Question(
                4,
                "Bab 4: Era Peralihan Kuasa & Malayan Union",
                "Sir Edward Gent dilantik sebagai Gabenor pertama Malayan Union pada tahun 1946.",
                true,
                "Sir Edward Gent dilantik sebagai Gabenor Malayan Union pada 1 April 1946. Majlis perlantikannya dipulaukan oleh Raja-Raja Melayu sebagai tanda bantahan terhadap Malayan Union."
        ));

        // --- BAB 5: PEMBINAAN PERSEKUTUAN TANAH MELAYU 1948 ---
        list.add(new Question(
                5,
                "Bab 5: Pembinaan PTM 1948",
                "Persekutuan Tanah Melayu 1948 ditubuhkan untuk mengekalkan dan mengukuhkan Malayan Union.",
                false,
                "Persekutuan Tanah Melayu 1948 ditubuhkan untuk menggantikan Malayan Union. Perlembagaannya dirangka oleh Jawatankuasa Kerja yang dianggotai wakil British, Raja-Raja Melayu dan UMNO."
        ));

        // --- BAB 6: ANCAMAN KOMUNIS DAN PERISYTIHARAN DARURAT ---
        list.add(new Question(
                6,
                "Bab 6: Ancaman Komunis & Darurat",
                "Sir Gerald Templer memperkenalkan strategi 'memenangi hati dan fikiran rakyat' semasa Darurat.",
                true,
                "Sir Gerald Templer menjadi Pesuruhjaya Tinggi pada tahun 1952. Beliau menggabungkan tindakan ketenteraan dengan usaha memenangi hati dan fikiran rakyat bagi melemahkan pengaruh komunis."
        ));

        // --- BAB 7: USAHA KE ARAH KEMERDEKAAN ---
        list.add(new Question(
                7,
                "Bab 7: Usaha Ke Arah Kemerdekaan",
                "Jawatankuasa Hubungan Antara Kaum (CLC) ditubuhkan pada tahun 1949 untuk memungut cukai pendapatan.",
                false,
                "CLC ditubuhkan untuk menyelesaikan isu perkauman dan membina persefahaman antara pemimpin pelbagai kaum dalam hal politik, ekonomi dan pendidikan."
        ));

        // --- BAB 8: PILIHAN RAYA ---
        list.add(new Question(
                8,
                "Bab 8: Pilihan Raya",
                "Parti Perikatan memenangi 51 daripada 52 kerusi dalam Pilihan Raya Umum Majlis Perundangan Persekutuan 1955.",
                true,
                "Kemenangan besar Parti Perikatan (UMNO-MCA-MIC) membuktikan kerjasama antara kaum dan mengukuhkan tuntutan kemerdekaan."
        ));

        // --- BAB 9: PERLEMBAGAAN PERSEKUTUAN TANAH MELAYU 1957 ---
        list.add(new Question(
                9,
                "Bab 9: Perlembagaan PTM 1957",
                "Rombongan Kemerdekaan ke London pada tahun 1956 telah menandatangani Perjanjian Pangkor.",
                false,
                "Rombongan Kemerdekaan menandatangani Perjanjian London 1956 yang menetapkan tarikh kemerdekaan pada 31 Ogos 1957. Perjanjian Pangkor ditandatangani pada tahun 1874."
        ));

        // --- BAB 10: PEMASYHURAN KEMERDEKAAN ---
        list.add(new Question(
                10,
                "Bab 10: Pemasyhuran Kemerdekaan",
                "Pemasyhuran Kemerdekaan dibacakan oleh Tunku Abdul Rahman di Dataran Merdeka pada 31 Ogos 1957.",
                false,
                "Pemasyhuran Kemerdekaan dibacakan di Stadium Merdeka, Kuala Lumpur. Tunku Abdul Rahman kemudian melaungkan 'MERDEKA!' sebanyak 7 kali."
        ));

        return list;
    }
}
