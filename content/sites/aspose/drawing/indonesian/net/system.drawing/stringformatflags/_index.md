---
title: Enum StringFormatFlags
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.StringFormatFlags enum. Menentukan informasi tampilan dan tata letak untuk string teks.
type: docs
weight: 1140
url: /id/net/system.drawing/stringformatflags/
---
## StringFormatFlags enumeration

Menentukan informasi tampilan dan tata letak untuk string teks.

```csharp
[Flags]
public enum StringFormatFlags
```

### Nilai

| Nama | Nilai | Keterangan |
| --- | --- | --- |
| DirectionRightToLeft | `1` | Teks ditampilkan dari kanan ke kiri. |
| DirectionVertical | `2` | Teks diratakan secara vertikal. |
| FitBlackBox | `4` | Bagian karakter diperbolehkan untuk menjorok ke kotak tata letak string. Secara default, karakter diposisikan ulang untuk menghindari overhang. |
| DisplayFormatControl | `20` | Karakter kontrol seperti tanda kiri-ke-kanan ditampilkan dalam keluaran dengan mesin terbang yang representatif. |
| NoFontFallback | `400` | Penggantian font alternatif untuk karakter yang tidak didukung dalam font yang diminta dinonaktifkan. Setiap karakter yang hilang ditampilkan dengan font yang hilang, biasanya kotak terbuka. |
| MeasureTrailingSpaces | `800` | Menyertakan spasi tambahan di akhir setiap baris. Secara default, persegi panjang batas yang dikembalikan oleh metode MeasureString mengecualikan spasi di akhir setiap baris. Setel bendera ini untuk menyertakan spasi tersebut dalam pengukuran. |
| NoWrap | `1000` | Pembungkusan teks antar baris saat pemformatan dalam persegi panjang dinonaktifkan. Bendera ini tersirat saat sebuah titik dilewatkan alih-alih persegi panjang, atau saat persegi panjang yang ditentukan memiliki panjang garis nol. |
| LineLimit | `2000` | Hanya seluruh baris yang ditata dalam persegi panjang pemformatan. Secara default, tata letak berlanjut hingga akhir teks, atau hingga tidak ada lagi garis yang terlihat akibat pemotongan, mana saja yang lebih dulu. Perhatikan bahwa pengaturan default memungkinkan baris terakhir dikaburkan sebagian oleh pemformatan persegi panjang yang bukan kelipatan penuh dari tinggi baris. Untuk memastikan bahwa hanya seluruh garis yang terlihat, tentukan nilai ini dan hati-hati untuk memberikan format persegi panjang setidaknya setinggi tinggi satu baris. |
| NoClip | `4000` | Bagian glyph yang menjorok, dan teks terbuka yang mencapai luar persegi panjang pemformatan diizinkan untuk ditampilkan. Secara default, semua teks dan bagian glyph yang mencapai luar persegi panjang pemformatan akan dipotong. |

### Lihat juga

* ruang nama [System.Drawing](../../system.drawing/)
* perakitan [Aspose.Drawing](../../)


