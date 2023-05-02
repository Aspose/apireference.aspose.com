---
title: Struct Rectangle
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Rectangle struct. Menyimpan sekumpulan empat bilangan bulat yang mewakili lokasi dan ukuran persegi panjang.
type: docs
weight: 1040
url: /id/net/system.drawing/rectangle/
---
## Rectangle structure

Menyimpan sekumpulan empat bilangan bulat yang mewakili lokasi dan ukuran persegi panjang.

```csharp
public struct Rectangle : IEquatable<Rectangle>
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Rectangle](rectangle/#constructor_1)(Point, Size) | Menginisialisasi instance baru dari`Rectangle` struct dengan lokasi dan ukuran yang ditentukan. |
| [Rectangle](rectangle/#constructor)(int, int, int, int) | Menginisialisasi instance baru dari struktur Rectangle dengan lokasi dan ukuran yang ditentukan. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Bottom](../../system.drawing/rectangle/bottom/) { get; } | Mendapatkan koordinat y yang merupakan jumlah dari nilai properti Y dan Tinggi dari struktur Persegi Panjang ini. |
| [Height](../../system.drawing/rectangle/height/) { get; set; } | Mendapat atau mengatur tinggi dari struktur Rectangle ini. |
| [IsEmpty](../../system.drawing/rectangle/isempty/) { get; } | Mendapat nilai yang menunjukkan apakah semua properti numerik ini`Rectangle` memiliki nilai nol. |
| [Left](../../system.drawing/rectangle/left/) { get; } | Mendapatkan koordinat x dari tepi kiri struktur Persegi Panjang ini. |
| [Location](../../system.drawing/rectangle/location/) { get; set; } | Mendapat atau menetapkan koordinat sudut kiri atas iniRectangle struktur. |
| [Right](../../system.drawing/rectangle/right/) { get; } | Mendapat koordinat x yang merupakan jumlah dari nilai properti X dan Lebar dari struktur Persegi Panjang ini. |
| [Size](../../system.drawing/rectangle/size/) { get; set; } | Mendapat atau menyetel ukuran iniRectangle . |
| [Top](../../system.drawing/rectangle/top/) { get; } | Mendapatkan koordinat y dari tepi atas struktur Persegi Panjang ini. |
| [Width](../../system.drawing/rectangle/width/) { get; set; } | Mendapat atau mengatur lebar dari struktur Rectangle ini. |
| [X](../../system.drawing/rectangle/x/) { get; set; } | Mendapat atau menyetel koordinat x sudut kiri atas struktur Persegi Panjang ini. |
| [Y](../../system.drawing/rectangle/y/) { get; set; } | Mendapat atau menyetel koordinat y sudut kiri atas struktur Persegi Panjang ini. |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [Ceiling](../../system.drawing/rectangle/ceiling/)(RectangleF) | Mengonversi yang ditentukanRectangleF struktur ke aRectangle struktur dengan membulatkanRectangleF nilai ke nilai integer berikutnya yang lebih tinggi. |
| static [FromLTRB](../../system.drawing/rectangle/fromltrb/)(int, int, int, int) | Membuat aRectangle struktur dengan lokasi tepi yang ditentukan. |
| static [Inflate](../../system.drawing/rectangle/inflate/)(Rectangle, int, int) | Membuat a`Rectangle` yang digelembungkan dengan jumlah yang ditentukan. |
| static [Intersect](../../system.drawing/rectangle/intersect/)(Rectangle, Rectangle) | Mengembalikan sepertigaRectangle struktur yang mewakili persimpangan dari dua lainnyaRectangle struktur. Jika tidak ada persimpangan, kosongRectangle dikembalikan. |
| static [Round](../../system.drawing/rectangle/round/)(RectangleF) | Mengonversi yang ditentukanRectangleF ke aRectangle dengan pembulatan ituRectangleF nilai ke nilai bilangan bulat terdekat. |
| static [Truncate](../../system.drawing/rectangle/truncate/)(RectangleF) | Mengonversi yang ditentukanRectangleF ke aRectangle dengan memotongRectangleF nilai. |
| static [Union](../../system.drawing/rectangle/union/)(Rectangle, Rectangle) | Mendapat aRectangle struktur yang mengandung penyatuan duaRectangle struktur. |
| [Contains](../../system.drawing/rectangle/contains/#contains_1)(Point) | Menentukan apakah titik yang ditentukan terkandung di dalamnyaRectangle struktur. |
| [Contains](../../system.drawing/rectangle/contains/#contains_2)(Rectangle) | Menentukan apakah wilayah persegi panjang diwakili oleh*rect* seluruhnya terkandung dalam wilayah persegi panjang yang diwakili oleh ini`Rectangle` . |
| [Contains](../../system.drawing/rectangle/contains/#contains)(int, int) | Menentukan apakah titik yang ditentukan terkandung di dalamnyaRectangle struktur. |
| override [Equals](../../system.drawing/rectangle/equals/#equals_1)(object) | Menguji apakah obj adalah aRectanglestruktur dengan lokasi dan ukuran yang sama iniRectangle struktur. |
| [Equals](../../system.drawing/rectangle/equals/#equals)(Rectangle) | Tes apakah lainnya`Rectangle` struktur memiliki lokasi dan ukuran yang sama ini`Rectangle` struktur. |
| override [GetHashCode](../../system.drawing/rectangle/gethashcode/)() | Mengembalikan kode hash untuk iniRectangle struktur. Untuk informasi tentang penggunaan kode hash, lihat GetHashCode . |
| [Inflate](../../system.drawing/rectangle/inflate/#inflate_1)(Size) | Memperbesar iniRectangle dengan jumlah yang ditentukan. |
| [Inflate](../../system.drawing/rectangle/inflate/#inflate)(int, int) | Memperbesar iniRectangle dengan jumlah yang ditentukan. |
| [Intersect](../../system.drawing/rectangle/intersect/)(Rectangle) | Menggantikan iniRectangle dengan perpotongan dirinya dan yang ditentukanRectangle . |
| [IntersectsWith](../../system.drawing/rectangle/intersectswith/)(Rectangle) | Menentukan apakah persegi panjang ini berpotongan dengan*rect* . |
| [Offset](../../system.drawing/rectangle/offset/#offset_1)(Point) | Menyesuaikan lokasi persegi panjang ini dengan jumlah yang ditentukan. |
| [Offset](../../system.drawing/rectangle/offset/#offset)(int, int) | Menyesuaikan lokasi persegi panjang ini dengan jumlah yang ditentukan. |
| override [ToString](../../system.drawing/rectangle/tostring/)() | Mengubah atribut ini`Rectangle` ke string yang dapat dibaca manusia. |
| [operator ==](../../system.drawing/rectangle/op_equality/) | Menguji apakah duaRectangle struktur memiliki lokasi dan ukuran yang sama. |
| [operator !=](../../system.drawing/rectangle/op_inequality/) | Menguji apakah duaRectangle struktur berbeda dalam lokasi atau ukuran. |

## Bidang

| Nama | Keterangan |
| --- | --- |
| static readonly [Empty](../../system.drawing/rectangle/empty/) | Mewakili aRectangle struktur dengan propertinya dibiarkan tidak diinisialisasi. |

### Lihat juga

* ruang nama [System.Drawing](../../system.drawing/)
* perakitan [Aspose.Drawing](../../)


