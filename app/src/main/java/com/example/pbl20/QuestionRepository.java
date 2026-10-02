package com.example.pbl20;

import java.util.ArrayList;
import java.util.List;

public class QuestionRepository {

    public static List<Question> getQuestions() {
        List<Question> list = new ArrayList<>();

        // ===== BAHAGIAN A: SOALAN OBJEKTIF =====

        // --- BAB 1: WARISAN NEGARA BANGSA ---
        list.add(new Question(
                1,
                "Objektif · Bab 1: Warisan Negara Bangsa",
                "Apakah ciri utama pembentukan kerajaan Kesultanan Melayu Melaka yang menjadi asas warisan negara bangsa?",
                new String[]{"Sistem feudal barat", "Wilayah pengaruh, rakyat, kedaulatan, dan undang-undang", "Pemerintahan tentera", "Sistem demokrasi mutlak"},
                1,
                "Ciri-ciri negara bangsa Kesultanan Melayu Melaka meliputi Kerajaan, Rakyat, Kedaulatan, Wilayah Pengaruh, Undang-undang, dan Lambang Kebesaran."
        ));

        // --- BAB 3: KONFLIK DUNIA DAN PENDUDUKAN JEPUN ---
        list.add(new Question(
                2,
                "Objektif · Bab 3: Konflik Dunia & Pendudukan Jepun",
                "Apakah faktor serta-merta yang mencetuskan Perang Dunia Pertama pada tahun 1914?",
                new String[]{"Serangan ke atas Pearl Harbour", "Pembunuhan Archduke Franz Ferdinand dari Austria-Hungary", "Krisis Terusan Suez", "Penandatanganan Perjanjian Versailles"},
                1,
                "Pembunuhan Archduke Franz Ferdinand dan isterinya oleh nasionalis Serbia menjadi pemangkin letusan Perang Dunia Pertama."
        ));

        // --- BAB 5: PEMBINAAN PERSEKUTUAN TANAH MELAYU 1948 ---
        list.add(new Question(
                3,
                "Objektif · Bab 5: Pembinaan PTM 1948",
                "Jawatankuasa Kerja ditubuhkan pada Julai 1946 dengan tujuan utama untuk:",
                new String[]{"Merangka perjanjian baharu menggantikan Malayan Union", "Menubuhkan pasukan polis tempatan", "Mengumpul dana pilihan raya", "Membangunkan kawasan luar bandar"},
                0,
                "Jawatankuasa Kerja merangkumi wakil British, Raja-Raja Melayu, dan UMNO untuk merangka Persekutuan Tanah Melayu."
        ));

        // --- BAB 7: USAHA KE ARAH KEMERDEKAAN ---
        list.add(new Question(
                4,
                "Objektif · Bab 7: Usaha Ke Arah Kemerdekaan",
                "Jawatankuasa Hubungan Antara Kaum (CLC) ditubuhkan pada tahun 1949 dengan objektif:",
                new String[]{"Menyelesaikan isu perkauman dan membina persefahaman antara pemimpin kaum", "Mengendalikan syarikat perkapalan", "Menguruskan pendaftaran sekolah awam", "Memungut cukai pendapatan"},
                0,
                "CLC membolehkan pemimpin pelbagai kaum berbincang dan bertolak ansur berkaitan politik, ekonomi, dan pendidikan."
        ));

        // --- BAB 9: PERLEMBAGAAN PERSEKUTUAN TANAH MELAYU 1957 ---
        list.add(new Question(
                5,
                "Objektif · Bab 9: Perlembagaan PTM 1957",
                "Rombongan Kemerdekaan Tanah Melayu bertolak ke London pada tahun 1956 bagi menandatangani:",
                new String[]{"Perjanjian London 1956", "Perjanjian Versailles", "Perjanjian Manila", "Perjanjian Pangkor"},
                0,
                "Perjanjian London 1956 menetapkan tarikh kemerdekaan PTM pada 31 Ogos 1957."
        ));

        // ===== BAHAGIAN B: SOALAN SUBJEKTIF =====

        // --- BAB 2: KEBANGKITAN NASIONALISME ---
        list.add(new Question(
                6,
                "Subjektif · Bab 2: Kebangkitan Nasionalisme",
                "Namakan akhbar Melayu pertama yang diterbitkan di Singapura pada tahun 1876.",
                "Jawi Peranakan",
                new String[]{"jawi peranakan"},
                "Jawi Peranakan ialah akhbar Melayu pertama, diterbitkan di Singapura pada tahun 1876. Akhbar seperti ini membantu menyebarkan kesedaran nasionalisme dalam kalangan masyarakat Melayu."
        ));

        // --- BAB 4: ERA PERALIHAN KUASA & MALAYAN UNION ---
        list.add(new Question(
                7,
                "Subjektif · Bab 4: Era Peralihan Kuasa & Malayan Union",
                "Siapakah yang dilantik sebagai Gabenor pertama Malayan Union pada tahun 1946?",
                "Sir Edward Gent",
                new String[]{"edward gent", "gent"},
                "Sir Edward Gent dilantik sebagai Gabenor Malayan Union pada 1 April 1946. Majlis perlantikannya dipulaukan oleh Raja-Raja Melayu sebagai tanda bantahan terhadap Malayan Union."
        ));

        // --- BAB 6: ANCAMAN KOMUNIS DAN PERISYTIHARAN DARURAT ---
        list.add(new Question(
                8,
                "Subjektif · Bab 6: Ancaman Komunis & Darurat",
                "Siapakah Pesuruhjaya Tinggi British yang memperkenalkan strategi 'memenangi hati dan fikiran rakyat' semasa Darurat?",
                "Sir Gerald Templer",
                new String[]{"templer"},
                "Sir Gerald Templer menjadi Pesuruhjaya Tinggi pada tahun 1952. Beliau menggabungkan tindakan ketenteraan dengan usaha memenangi hati dan fikiran rakyat bagi melemahkan pengaruh komunis."
        ));

        // --- BAB 8: PILIHAN RAYA ---
        list.add(new Question(
                9,
                "Subjektif · Bab 8: Pilihan Raya",
                "Nyatakan parti yang memenangi Pilihan Raya Umum Majlis Perundangan Persekutuan pada tahun 1955.",
                "Parti Perikatan (UMNO-MCA-MIC)",
                new String[]{"perikatan", "alliance"},
                "Parti Perikatan memenangi 51 daripada 52 kerusi. Kemenangan ini membuktikan kerjasama antara kaum dan mengukuhkan tuntutan kemerdekaan."
        ));

        // --- BAB 10: PEMASYHURAN KEMERDEKAAN ---
        list.add(new Question(
                10,
                "Subjektif · Bab 10: Pemasyhuran Kemerdekaan",
                "Di manakah Pemasyhuran Kemerdekaan dibacakan oleh Tunku Abdul Rahman pada 31 Ogos 1957?",
                "Stadium Merdeka, Kuala Lumpur",
                new String[]{"stadium merdeka"},
                "Tunku Abdul Rahman membacakan Pemasyhuran Kemerdekaan di Stadium Merdeka dan melaungkan 'MERDEKA!' sebanyak 7 kali."
        ));

        return list;
    }
}
