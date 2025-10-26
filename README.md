# Aplikasi Perhitungan Hari

Aplikasi ini dibuat untuk menghitung selisih jumlah hari antara dua tanggal yang dipilih oleh pengguna.  
Aplikasi dibuat menggunakan **Java** dan **NetBeans**, serta menggunakan komponen **JDateChooser** dari library **JCalendar**.

---

## Tujuan
- Memahami penggunaan komponen tanggal (`JDateChooser`)
- Mengimplementasikan `LocalDate` dan `ChronoUnit` untuk perhitungan waktu
- Mendesain GUI menggunakan `JFrame` pada NetBeans
- Melakukan event handling pada tombol (Hitung & Keluar)

---

## Tools & Teknologi
| Tools / Library | Versi |
|----------------|------|
| Java JDK        | 8 / 11 / 17 (bebas) |
| NetBeans        | 8.2 / 11 / 12 / 17 (bebas) |
| JCalendar       | 1.4 |
| Swing GUI       | Default NetBeans |

---
Cara Menambahkan Library JCalendar
1. Download `jcalendar-1.4.jar` dari: https://toedter.com/jcalendar/
2. Ekstrak dan ambil file `jcalendar-1.4.jar`
3. Buat folder **lib** di dalam folder project
4. Pindahkan `jcalendar-1.4.jar` ke folder **lib**
5. Di NetBeans → Klik kanan **Libraries** → **Add JAR/Folder** → pilih file tersebut

---

Struktur Project

AplikasiPerhitunganHari
│
├── src/aplikasiperhitunganhari
│ ├── HitungHariFrame.java
│ └── HitungHariHelper.java
│
└── lib
└── jcalendar-1.4.jar


---

## Cara Menggunakan Aplikasi
1. Jalankan program
2. Pilih **Tanggal Pertama**
3. Pilih **Tanggal Kedua**
4. Klik tombol **Hitung**
5. Hasil selisih hari akan muncul pada kotak teks
6. Klik **Keluar** jika ingin menutup aplikasi

---

## Tampilan Aplikasi
*(Tambahkan screenshot kalau sudah menjalankan aplikasinya)*

---

Dibuat oleh
**Nama:** *[Regina Faradila]*  
**NPM:** *[2310010641]*  
**Kelas:** *[5B Reg Bjm]*  
**Mata Kuliah:** *Pemrograman Berorientasi Objek / PBO*  
**Dosen Pengampu:** *[opsional]*

---

Status
Project ini telah **selesai** dan **siap dikumpulkan.**


