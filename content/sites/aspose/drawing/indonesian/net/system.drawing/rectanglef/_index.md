---
title: Struct RectangleF
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.RectangleF struct. Menyimpan sekumpulan empat angka floatingpoint yang mewakili lokasi dan ukuran persegi panjang. Untuk fungsi wilayah yang lebih lanjut gunakan objek Wilayah.
type: docs
weight: 1050
url: /id/net/system.drawing/rectanglef/
---
## RectangleF structure

Menyimpan sekumpulan empat angka floating-point yang mewakili lokasi dan ukuran persegi panjang. Untuk fungsi wilayah yang lebih lanjut, gunakan objek Wilayah.

```csharp
public struct RectangleF : IEquatable<RectangleF>
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [RectangleF](rectanglef/#constructor_1)(PointF, SizeF) | Menginisialisasi instance baru dari struktur RectangleF dengan lokasi dan ukuran yang ditentukan. |
| [RectangleF](rectanglef/#constructor)(float, float, float, float) | Menginisialisasi instance baru dari struktur RectangleF dengan lokasi dan ukuran yang ditentukan. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Bottom](../../system.drawing/rectanglef/bottom/) { get; } | Mendapat koordinat y yang merupakan jumlah dari Y dan Tinggi dari struktur RectangleF ini. |
| [Height](../../system.drawing/rectanglef/height/) { get; set; } | Mendapat atau mengatur tinggi struktur RectangleF ini. |
| [IsEmpty](../../system.drawing/rectanglef/isempty/) { get; } | Mendapat nilai yang menunjukkan apakahWidth atauHeight properti iniRectangleF memiliki nilai nol. |
| [Left](../../system.drawing/rectanglef/left/) { get; } | Mendapatkan koordinat x dari tepi kiri struktur RectangleF ini. |
| [Location](../../system.drawing/rectanglef/location/) { get; set; } | Mendapat atau menetapkan koordinat sudut kiri atas iniRectangleF struktur. |
| [Right](../../system.drawing/rectanglef/right/) { get; } | Mendapatkan koordinat x yang merupakan jumlah dari X dan Lebar dari struktur RectangleF ini. |
| [Size](../../system.drawing/rectanglef/size/) { get; set; } | Mendapat atau menyetel ukuran iniRectangleF . |
| [Top](../../system.drawing/rectanglef/top/) { get; } | Mendapatkan koordinat y dari tepi atas struktur RectangleF ini. |
| [Width](../../system.drawing/rectanglef/width/) { get; set; } | Mendapat atau mengatur lebar dari struktur RectangleF ini. |
| [X](../../system.drawing/rectanglef/x/) { get; set; } | Mendapat atau menyetel koordinat x sudut kiri atas struktur RectangleF ini. |
| [Y](../../system.drawing/rectanglef/y/) { get; set; } | Mendapat atau menyetel koordinat x sudut kiri atas struktur RectangleF ini. |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [FromLTRB](../../system.drawing/rectanglef/fromltrb/)(float, float, float, float) | Membuat struktur RectangleF dengan sudut kiri atas dan sudut kanan bawah pada lokasi yang ditentukan. |
| static [Inflate](../../system.drawing/rectanglef/inflate/)(RectangleF, float, float) | Membuat dan mengembalikan salinan yang digelembungkan dari yang ditentukanRectangleF structure. Salinan digelembungkan dengan jumlah yang ditentukan. Persegi panjang asli tetap tidak diubah. |
| static [Intersect](../../system.drawing/rectanglef/intersect/)(RectangleF, RectangleF) | Mengembalikan aRectangleF struktur yang mewakili persimpangan dua persegi panjang. Jika tidak ada persimpangan, dan kosongRectangleF dikembalikan. |
| static [Union](../../system.drawing/rectanglef/union/)(RectangleF, RectangleF) | Membuat persegi panjang ketiga sekecil mungkin yang dapat memuat kedua persegi panjang yang membentuk gabungan. |
| [Contains](../../system.drawing/rectanglef/contains/#contains_1)(PointF) | Menentukan apakah titik yang ditentukan terkandung di dalamnyaRectangleF struktur. |
| [Contains](../../system.drawing/rectanglef/contains/#contains_2)(RectangleF) | Menentukan apakah wilayah persegi panjang diwakili oleh*rect* sepenuhnya terkandung dalam iniRectangleF struktur. |
| [Contains](../../system.drawing/rectanglef/contains/#contains)(float, float) | Menentukan apakah titik yang ditentukan terkandung di dalamnyaRectangleF struktur. |
| override [Equals](../../system.drawing/rectanglef/equals/#equals_1)(object) | Menentukan apakah yang ditentukanObject , sama dengan instance ini. |
| [Equals](../../system.drawing/rectanglef/equals/#equals)(RectangleF) | Tes apakah lainnya`RectangleF` struktur memiliki lokasi dan ukuran yang sama ini`RectangleF` struktur. |
| override [GetHashCode](../../system.drawing/rectanglef/gethashcode/)() | Mengembalikan kode hash untuk instance ini. |
| [Inflate](../../system.drawing/rectanglef/inflate/#inflate_1)(SizeF) | Mengembang iniRectangleF dengan jumlah yang ditentukan. |
| [Inflate](../../system.drawing/rectanglef/inflate/#inflate)(float, float) | Mengembang iniRectangleF struktur dengan jumlah yang ditentukan. |
| [Intersect](../../system.drawing/rectanglef/intersect/)(RectangleF) | Menggantikan iniRectangleF struktur dengan persimpangan dirinya sendiri dan yang ditentukan RectangleF struktur. |
| [IntersectsWith](../../system.drawing/rectanglef/intersectswith/)(RectangleF) | Menentukan apakah persegi panjang ini berpotongan dengan*rect* . |
| [Offset](../../system.drawing/rectanglef/offset/#offset_1)(PointF) | Menyesuaikan lokasi persegi panjang ini dengan jumlah yang ditentukan. |
| [Offset](../../system.drawing/rectanglef/offset/#offset)(float, float) | Menyesuaikan lokasi persegi panjang ini dengan jumlah yang ditentukan. |
| override [ToString](../../system.drawing/rectanglef/tostring/)() | Mengubah atribut ini[`Rectangle`](../rectangle/) ke string yang dapat dibaca manusia. |
| [operator ==](../../system.drawing/rectanglef/op_equality/) | Menguji apakah duaRectangleF struktur memiliki lokasi dan ukuran yang sama. |
| [implicit operator](../../system.drawing/rectanglef/op_implicit/) | Mengubah struktur Rectangle yang ditentukan menjadi struktur RectangleF. |
| [operator !=](../../system.drawing/rectanglef/op_inequality/) | Menguji apakah duaRectangleF struktur berbeda dalam lokasi atau ukuran. |

## Bidang

| Nama | Keterangan |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectanglef/empty/) | Merupakan turunan dariRectangleFkelas dengan anggotanya tidak diinisialisasi. |

### Lihat juga

* ruang nama [System.Drawing](../../system.drawing/)
* perakitan [Aspose.Drawing](../../)


