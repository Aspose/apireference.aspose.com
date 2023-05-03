---
title: Class Pen
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Pen kelas. Menentukan objek yang digunakan untuk menggambar garis dan kurva.
type: docs
weight: 910
url: /id/net/system.drawing/pen/
---
## Pen class

Menentukan objek yang digunakan untuk menggambar garis dan kurva.

```csharp
public class Pen : IDisposable
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Pen](pen/#constructor)(Brush) | Menginisialisasi instance baru dari`Pen` kelas dengan yang ditentukanBrush . |
| [Pen](pen/#constructor_2)(Color) | Menginisialisasi instance baru dari`Pen` kelas dengan yang ditentukanColor . |
| [Pen](pen/#constructor_1)(Brush, float) | Menginisialisasi instance baru dari kelas Pen dengan Kuas dan Lebar yang ditentukan. |
| [Pen](pen/#constructor_3)(Color, float) | Menginisialisasi instance baru dari kelas Pen dengan properti Warna dan Lebar yang ditentukan. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Alignment](../../system.drawing/pen/alignment/) { get; set; } | Mendapat atau menyetel perataan untuk iniPen . |
| [Brush](../../system.drawing/pen/brush/) { get; set; } | Mendapat atau menyetel Kuas yang menentukan atribut iniPen . |
| [Color](../../system.drawing/pen/color/) { get; set; } | Mendapat atau menyetel warna iniPen . |
| [CompoundArray](../../system.drawing/pen/compoundarray/) { get; set; } | Mendapat atau menetapkan array nilai yang menentukan pena majemuk. Pena majemuk menggambar garis majemuk yang terdiri dari garis dan spasi paralel. |
| [CustomEndCap](../../system.drawing/pen/customendcap/) { get; set; } | Mendapat atau menyetel batas khusus untuk digunakan di akhir garis yang digambar dengan iniPen . |
| [CustomStartCap](../../system.drawing/pen/customstartcap/) { get; set; } | Mendapat atau menyetel batas khusus untuk digunakan di awal garis yang digambar dengan iniPen . |
| [DashCap](../../system.drawing/pen/dashcap/) { get; set; } | Mendapat atau menyetel gaya topi yang digunakan di akhir tanda hubung yang membentuk garis putus-putus yang digambar dengan this Pen . |
| [DashOffset](../../system.drawing/pen/dashoffset/) { get; set; } | Mendapat atau mengatur jarak dari awal garis ke awal pola garis putus-putus. |
| [DashPattern](../../system.drawing/pen/dashpattern/) { get; set; } | Mendapat atau menyetel larik tanda hubung dan spasi khusus. |
| [DashStyle](../../system.drawing/pen/dashstyle/) { get; set; } | Mendapat atau menyetel gaya yang digunakan untuk garis putus-putus yang digambar dengan iniPen . |
| [EndCap](../../system.drawing/pen/endcap/) { get; set; } | Mendapat atau menyetel gaya tutup yang digunakan pada akhir garis yang digambar dengan Pena ini. |
| [LineJoin](../../system.drawing/pen/linejoin/) { get; set; } | Mendapat atau menyetel gaya gabungan untuk ujung dua garis berurutan yang digambar dengan Pena ini. |
| [MiterLimit](../../system.drawing/pen/miterlimit/) { get; set; } | Mendapat atau menetapkan batas ketebalan gabungan pada sudut yang disematkan. |
| [PenType](../../system.drawing/pen/pentype/) { get; } | Mendapat gaya garis yang digambar dengan Pena ini. |
| [StartCap](../../system.drawing/pen/startcap/) { get; set; } | Mendapat atau menyetel gaya topi yang digunakan pada awal garis yang digambar dengan Pena ini. |
| [Transform](../../system.drawing/pen/transform/) { get; set; } | Mendapatkan atau menyetel salinan transformasi geometrik untuk iniPen . |
| [Width](../../system.drawing/pen/width/) { get; set; } | Mendapat atau mengatur lebar Pena ini, dalam satuan objek Grafik yang digunakan untuk menggambar. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Clone](../../system.drawing/pen/clone/)() | Membuat salinan persis dari iniPen . |
| [Dispose](../../system.drawing/pen/dispose/)() | Melepaskan semua sumber daya yang digunakan oleh Pena ini. |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform/#multiplytransform)(Matrix) | Mengalikan matriks transformasi untuk iniPen oleh yang ditentukanMatrix . |
| [MultiplyTransform](../../system.drawing/pen/multiplytransform/#multiplytransform_1)(Matrix, MatrixOrder) | Mengalikan matriks transformasi untuk iniPen oleh yang ditentukanMatrix dalam urutan yang ditentukan. |
| [ResetTransform](../../system.drawing/pen/resettransform/)() | Mereset matriks transformasi geometrik untuk iniPen ke identitas. |
| [RotateTransform](../../system.drawing/pen/rotatetransform/#rotatetransform)(float) | Memutar transformasi geometris lokal dengan sudut yang ditentukan. Metode ini menambahkan rotasi ke transformasi. |
| [RotateTransform](../../system.drawing/pen/rotatetransform/#rotatetransform_1)(float, MatrixOrder) | Memutar transformasi geometris lokal dengan sudut yang ditentukan dalam urutan yang ditentukan. |
| [ScaleTransform](../../system.drawing/pen/scaletransform/#scaletransform)(float, float) | Menskalakan transformasi geometris lokal dengan faktor yang ditentukan. Metode ini menambahkan matriks penskalaan ke transformasi. |
| [ScaleTransform](../../system.drawing/pen/scaletransform/#scaletransform_1)(float, float, MatrixOrder) | Menskalakan transformasi geometris lokal dengan faktor yang ditentukan dalam urutan yang ditentukan. |
| [SetLineCap](../../system.drawing/pen/setlinecap/)(LineCap, LineCap, DashCap) | Menetapkan nilai yang menentukan gaya tutup yang digunakan untuk mengakhiri garis yang digambar oleh ini`Pen` . |
| [TranslateTransform](../../system.drawing/pen/translatetransform/#translatetransform)(float, float) | Menerjemahkan transformasi geometris lokal dengan dimensi yang ditentukan. Metode ini menambahkan terjemahan ke transformasi. |
| [TranslateTransform](../../system.drawing/pen/translatetransform/#translatetransform_1)(float, float, MatrixOrder) | Menerjemahkan transformasi geometris lokal dengan dimensi yang ditentukan dalam urutan yang ditentukan. |

### Lihat juga

* ruang nama [System.Drawing](../../system.drawing/)
* perakitan [Aspose.Drawing](../../)


