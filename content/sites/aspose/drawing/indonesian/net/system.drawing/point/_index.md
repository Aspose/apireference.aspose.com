---
title: Struct Point
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Point struct. Mewakili pasangan terurut bilangan bulat koordinat x dan y yang mendefinisikan sebuah titik dalam bidang dua dimensi.
type: docs
weight: 930
url: /id/net/system.drawing/point/
---
## Point structure

Mewakili pasangan terurut bilangan bulat koordinat x dan y yang mendefinisikan sebuah titik dalam bidang dua dimensi.

```csharp
public struct Point : IEquatable<Point>
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Point](point/#constructor)(int) | Menginisialisasi instance baru dari`Point` struct menggunakan koordinat yang ditentukan oleh nilai integer. |
| [Point](point/#constructor_2)(Size) | Menginisialisasi instance baru dari`Point` struktur dari a[`Size`](../size/) . |
| [Point](point/#constructor_1)(int, int) | Menginisialisasi instance baru dari`Point` struct dengan koordinat yang ditentukan. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [IsEmpty](../../system.drawing/point/isempty/) { get; } | Mendapat nilai yang menunjukkan apakah iniPoint kosong. |
| [X](../../system.drawing/point/x/) { get; set; } | Mendapat atau menetapkan koordinat x dari Titik ini. |
| [Y](../../system.drawing/point/y/) { get; set; } | Mendapat atau menetapkan koordinat y dari Titik ini. |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [Add](../../system.drawing/point/add/)(Point, Size) | Menambahkan yang ditentukanSize ke yang ditentukanPoint . |
| static [Ceiling](../../system.drawing/point/ceiling/)(PointF) | Mengonversi a[`PointF`](../pointf/) ke a`Point` dengan melakukan operasi plafon pada semua koordinat. |
| static [Round](../../system.drawing/point/round/)(PointF) | Mengonversi yang ditentukanPointF ke objek Point dengan membulatkanPoint nilai ke bilangan bulat terdekat. |
| static [Subtract](../../system.drawing/point/subtract/)(Point, Size) | Menerjemahkan a`Point` oleh negatif dari yang diberikan[`Size`](../size/) . |
| static [Truncate](../../system.drawing/point/truncate/)(PointF) | Mengubah PointF menjadi Titik dengan melakukan operasi pemotongan pada semua koordinat. |
| override [Equals](../../system.drawing/point/equals/#equals_1)(object) | Menentukan apakah iniPoint berisi koordinat yang sama seperti yang ditentukanObject . |
| [Equals](../../system.drawing/point/equals/#equals)(Point) | Tes apakah lainnya`Point` struktur memiliki lokasi yang sama ini`Point` struktur. |
| override [GetHashCode](../../system.drawing/point/gethashcode/)() | Mengembalikan kode hash untuk iniPoint . |
| [Offset](../../system.drawing/point/offset/#offset_1)(Point) | Menerjemahkan iniPoint oleh yang ditentukanPoint . |
| [Offset](../../system.drawing/point/offset/#offset)(int, int) | Menerjemahkan iniPoint dengan jumlah yang ditentukan. |
| override [ToString](../../system.drawing/point/tostring/)() | Mengubah atribut ini`Point` ke string yang dapat dibaca manusia. |
| [operator +](../../system.drawing/point/op_addition/) | Menerjemahkan a`Point` oleh yang diberikan[`Size`](../size/) . |
| [operator ==](../../system.drawing/point/op_equality/) | Membandingkan duaPoint objek. Hasil menentukan apakah nilai-nilai dariX DanY properties dari keduanyaPoint objek sama. |
| [explicit operator](../../system.drawing/point/op_explicit/) | Membuat a[`Size`](../size/)dengan koordinat yang ditentukan`Point` . |
| [implicit operator](../../system.drawing/point/op_implicit/) | Mengonversi yang ditentukanPoint struktur ke aPointF struktur. |
| [operator !=](../../system.drawing/point/op_inequality/) | Membandingkan duaPoint objek. Hasil menentukan apakah nilai-nilai dariX atauY properties dari keduanyaPoint objek tidak sama. |
| [operator -](../../system.drawing/point/op_subtraction/) | Menerjemahkan a`Point` oleh negatif dari yang diberikan[`Size`](../size/) . |

## Bidang

| Nama | Keterangan |
| --- | --- |
| static readonly [Empty](../../system.drawing/point/empty/) | Mewakili aPoint yang mempunyaiX DanY nilai disetel ke nol. |

### Lihat juga

* ruang nama [System.Drawing](../../system.drawing/)
* perakitan [Aspose.Drawing](../../)


