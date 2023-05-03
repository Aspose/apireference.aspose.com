---
title: Struct Size
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Size struct. Menyimpan sepasang bilangan bulat terurut biasanya lebar dan tinggi persegi panjang.
type: docs
weight: 1080
url: /id/net/system.drawing/size/
---
## Size structure

Menyimpan sepasang bilangan bulat terurut, biasanya lebar dan tinggi persegi panjang.

```csharp
public struct Size : IEquatable<Size>
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Size](size/#constructor_1)(Point) | Menginisialisasi instance baru dari`Size` struct dari yang ditentukanPoint . |
| [Size](size/#constructor)(int, int) | Menginisialisasi instance baru dari`Size` struct dari dimensi yang ditentukan. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Height](../../system.drawing/size/height/) { get; set; } | Mendapat atau menyetel komponen vertikal iniSize . |
| [IsEmpty](../../system.drawing/size/isempty/) { get; } | Mendapat nilai yang menunjukkan apakah iniSize memiliki lebar dan tinggi 0. |
| [Width](../../system.drawing/size/width/) { get; set; } | Mendapat atau menyetel komponen horizontal iniSize . |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [Add](../../system.drawing/size/add/)(Size, Size) | Menambahkan lebar dan tinggi dari satuSize struktur dengan lebar dan tinggi lainnyaSize struktur. |
| static [Ceiling](../../system.drawing/size/ceiling/)(SizeF) | Mengonversi yang ditentukanSizeF struktur ke aSize struktur dengan membulatkan values dariSize struktur ke nilai integer berikutnya yang lebih tinggi. |
| static [Round](../../system.drawing/size/round/)(SizeF) | Mengonversi yang ditentukanSizeF struktur ke aSizestructure dengan membulatkan nilai dariSizeF struktur ke nilai integer terdekat. |
| static [Subtract](../../system.drawing/size/subtract/)(Size, Size) | Mengurangi lebar dan tinggi satuSize struktur dari lebar dan tinggi lainnyaSize struktur. |
| static [Truncate](../../system.drawing/size/truncate/)(SizeF) | Mengonversi yang ditentukanSizeF struktur ke aSize structure dengan memotong nilai-nilaiSizeF struktur ke nilai integer yang lebih rendah berikutnya. |
| override [Equals](../../system.drawing/size/equals/#equals_1)(object) | Tes untuk melihat apakah objek yang ditentukan adalah aSize dengan dimensi yang sama seperti iniSize . |
| [Equals](../../system.drawing/size/equals/#equals)(Size) | Tes apakah lainnya`Size` struktur memiliki ukuran yang sama ini`Size` struktur. |
| override [GetHashCode](../../system.drawing/size/gethashcode/)() | Mengembalikan kode hash untuk iniSize struktur. |
| override [ToString](../../system.drawing/size/tostring/)() | Mengubah atribut ini`Size` ke string yang dapat dibaca manusia. |
| [operator +](../../system.drawing/size/op_addition/) | Menambahkan lebar dan tinggi dari satuSize struktur dengan lebar dan tinggi lainnyaSize struktur. |
| [operator /](../../system.drawing/size/op_division/#op_division) | Membagi`Size` oleh sebuahInt32 memproduksi`Size` . (2 operators) |
| [operator ==](../../system.drawing/size/op_equality/) | Menguji apakah duaSize strukturnya sama. |
| [explicit operator](../../system.drawing/size/op_explicit/) | Mengonversi yang ditentukanSize ke aPoint . |
| [implicit operator](../../system.drawing/size/op_implicit/) | Mengonversi yang ditentukanSize ke aSizeF . |
| [operator !=](../../system.drawing/size/op_inequality/) | Menguji apakah duaSize strukturnya berbeda. |
| [operator *](../../system.drawing/size/op_multiply/#op_multiply) | Perkalian a`Size` oleh sebuahInt32 memproduksi`Size` . (4 operators) |
| [operator -](../../system.drawing/size/op_subtraction/) | Mengurangi lebar dan tinggi satuSize struktur dari lebar dan tinggi lainnyaSize struktur. |

## Bidang

| Nama | Keterangan |
| --- | --- |
| static readonly [Empty](../../system.drawing/size/empty/) | Mendapat aSize struktur yang memiliki aHeight DanWidth nilai 0. |

### Lihat juga

* ruang nama [System.Drawing](../../system.drawing/)
* perakitan [Aspose.Drawing](../../)


