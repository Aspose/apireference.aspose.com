---
title: Class XpsPath
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.XPS.XpsModel.XpsPath kelas. Kelas yang merangkum fitur elemen Path. Elemen ini adalah satusatunya cara untuk menambahkan grafik vektor dan gambar ke halaman tetap. Mendefinisikan satu grafik vektor untuk dirender pada halaman.
type: docs
weight: 3260
url: /id/net/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class

Kelas yang merangkum fitur elemen Path. Elemen ini adalah satu-satunya cara untuk menambahkan grafik vektor dan gambar ke halaman tetap. Mendefinisikan satu grafik vektor untuk dirender pada halaman.

```csharp
public sealed class XpsPath : XpsContentElement
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | Mengembalikan/mengatur instance geometri jalur yang membatasi wilayah yang dirender dari elemen. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | Mengembalikan jumlah elemen anak. |
| [Data](../../aspose.page.xps.xpsmodel/xpspath/data/) { get; set; } | Mengembalikan/mengatur geometri jalur. |
| [Fill](../../aspose.page.xps.xpsmodel/xpspath/fill/) { get; set; } | Mengembalikan/mengatur kuas yang digunakan untuk melukis geometri yang ditentukan dengan properti Data dari jalur. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | Mengembalikan/mengatur objek target hyperlink. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | Menyediakan akses ke elemen turunan berdasarkan indeks*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | Mengembalikan/mengatur nilai yang menentukan transparansi seragam elemen. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | Mengembalikan/mengatur kuas yang menentukan topeng nilai alfa yang diterapkan ke elemen dengan cara yang sama seperti atribut Opacity, tetapi mengizinkan nilai alfa yang berbeda untuk area elemen yang berbeda. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | Mengembalikan/mengatur matriks transformasi affine yang membentuk bingkai koordinat baru untuk semua atribut elemen dan untuk semua elemen turunan (jika ada). |
| [Stroke](../../aspose.page.xps.xpsmodel/xpspath/stroke/) { get; set; } | Mengembalikan/mengatur kuas yang digunakan untuk menggambar goresan. |
| [StrokeDashArray](../../aspose.page.xps.xpsmodel/xpspath/strokedasharray/) { get; set; } | Mengembalikan/mengatur larik yang menentukan panjang garis putus-putus dan celah garis tepi. |
| [StrokeDashCap](../../aspose.page.xps.xpsmodel/xpspath/strokedashcap/) { get; set; } | Mengembalikan/mengatur nilai yang menentukan bagaimana ujung setiap tanda hubung digambar. |
| [StrokeDashOffset](../../aspose.page.xps.xpsmodel/xpspath/strokedashoffset/) { get; set; } | Mengembalikan/mengatur titik awal untuk mengulangi pola larik tanda hubung. Jika nilai ini dihilangkan, larik tanda hubung sejajar dengan asal goresan. |
| [StrokeEndLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokeendlinecap/) { get; set; } | Mengembalikan/mengatur nilai yang menentukan bentuk akhir garis putus-putus terakhir dalam sebuah coretan. |
| [StrokeLineJoin](../../aspose.page.xps.xpsmodel/xpspath/strokelinejoin/) { get; set; } | Mengembalikan/mengatur nilai yang menentukan bentuk awal tanda hubung pertama dalam goresan. |
| [StrokeMiterLimit](../../aspose.page.xps.xpsmodel/xpspath/strokemiterlimit/) { get; set; } | Mengembalikan/mengatur rasio antara panjang adu manis maksimum dan setengah ketebalan goresan. Nilai ini signifikan hanya jika`StrokeLineJoin` atribut menentukan`Gelar uskup` . |
| [StrokeStartLineCap](../../aspose.page.xps.xpsmodel/xpspath/strokestartlinecap/) { get; set; } | Mengembalikan/mengatur nilai yang menentukan bentuk awal tanda hubung pertama dalam goresan. |
| [StrokeThickness](../../aspose.page.xps.xpsmodel/xpspath/strokethickness/) { get; set; } | Mengembalikan/mengatur ketebalan goresan, dalam satuan ruang koordinat efektif (termasuk transformasi render jalur). Goresan digambar di atas batas geometri yang ditentukan oleh properti Data elemen Path. Setengah dari StrokeThickness extends di luar geometri yang ditentukan oleh properti Data dan setengah lainnya meluas di dalam geometri. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpspath/clone/)() | Menggandakan jalur ini. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | Implementasi dariIEnumerable antarmuka. |

### Lihat juga

* class [XpsContentElement](../xpscontentelement/)
* ruang nama [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* perakitan [Aspose.Page](../../)


