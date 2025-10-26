package aplikasiperhitunganhari;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HitungHariHelper {

    // Menghitung selisih hari antara dua tanggal
    public long hitungSelisihHari(LocalDate tglAwal, LocalDate tglAkhir) {
        return ChronoUnit.DAYS.between(tglAwal, tglAkhir);
    }
}
