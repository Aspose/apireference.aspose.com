---
title: Class XpsCanvas
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.XPS.XpsModel.XpsCanvas kelas. Kelas yang merangkum fitur elemen Kanvas. Elemen ini mengelompokkan elemen menjadi satu. Misalnya elemen Glyphs dan Path dapat dikelompokkan dalam kanvas untuk diidentifikasi sebagai unit sebagai tujuan hyperlink atau untuk menerapkan nilai properti gabungan ke setiap elemen anak dan leluhur.
type: docs
weight: 2970
url: /id/net/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class

Kelas yang merangkum fitur elemen Kanvas. Elemen ini mengelompokkan elemen menjadi satu. Misalnya, elemen Glyphs dan Path dapat dikelompokkan dalam kanvas untuk diidentifikasi sebagai unit (sebagai tujuan hyperlink) atau untuk menerapkan nilai properti gabungan ke setiap elemen anak dan leluhur.

```csharp
public sealed class XpsCanvas : XpsContentElement
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [Clip](../../aspose.page.xps.xpsmodel/xpscontentelement/clip/) { get; set; } | Mengembalikan/mengatur instance geometri jalur yang membatasi wilayah yang dirender dari elemen. |
| [Count](../../aspose.page.xps.xpsmodel/xpselement/count/) { get; } | Mengembalikan jumlah elemen anak. |
| [EdgeMode](../../aspose.page.xps.xpsmodel/xpscanvas/edgemode/) { get; set; } | Mengembalikan/menetapkan nilai yang mengontrol bagaimana tepi jalur dalam kanvas dirender. |
| [HyperlinkTarget](../../aspose.page.xps.xpsmodel/xpshyperlinkelement/hyperlinktarget/) { get; set; } | Mengembalikan/mengatur objek target hyperlink. |
| [Item](../../aspose.page.xps.xpsmodel/xpselement/item/) { get; } | Menyediakan akses ke elemen turunan berdasarkan indeks*i* . |
| [Opacity](../../aspose.page.xps.xpsmodel/xpscontentelement/opacity/) { get; set; } | Mengembalikan/mengatur nilai yang menentukan transparansi seragam elemen. |
| [OpacityMask](../../aspose.page.xps.xpsmodel/xpscontentelement/opacitymask/) { get; set; } | Mengembalikan/mengatur kuas yang menentukan topeng nilai alfa yang diterapkan ke elemen dengan cara yang sama seperti atribut Opacity, tetapi mengizinkan nilai alfa yang berbeda untuk area elemen yang berbeda. |
| [RenderTransform](../../aspose.page.xps.xpsmodel/xpscontentelement/rendertransform/) { get; set; } | Mengembalikan/mengatur matriks transformasi affine yang membentuk bingkai koordinat baru untuk semua atribut elemen dan untuk semua elemen turunan (jika ada). |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Add&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/add/)(T) | Menambahkan elemen ke daftar anak kanvas ini. |
| [AddCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/addcanvas/)() | Menambahkan kanvas baru ke daftar turunan kanvas ini. |
| [AddGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/addglyphs/)(string, float, FontStyle, float, float, string) | Menambahkan glyph baru ke daftar anak kanvas ini. |
| [AddPath](../../aspose.page.xps.xpsmodel/xpscanvas/addpath/)(XpsPathGeometry) | Menambahkan jalur baru ke daftar anak kanvas ini. |
| [Clone](../../aspose.page.xps.xpsmodel/xpscanvas/clone/)() | Menggandakan kanvas ini. |
| [GetEnumerator](../../aspose.page.xps.xpsmodel/xpselement/getenumerator/)() | Implementasi dariIEnumerable antarmuka. |
| [Insert&lt;T&gt;](../../aspose.page.xps.xpsmodel/xpscanvas/insert/)(int, T) | Menyisipkan elemen ke daftar anak kanvas ini di*index* posisi. |
| [InsertCanvas](../../aspose.page.xps.xpsmodel/xpscanvas/insertcanvas/)(int) | Menyisipkan kanvas baru ke daftar anak kanvas ini di*index* posisi. |
| [InsertGlyphs](../../aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/)(int, string, float, FontStyle, float, float, string) | Menyisipkan glyph baru ke daftar anak kanvas ini di*index* posisi. |
| [InsertPath](../../aspose.page.xps.xpsmodel/xpscanvas/insertpath/)(int, XpsPathGeometry) | Menyisipkan jalur baru ke daftar anak kanvas ini di*index* posisi. |

### Lihat juga

* class [XpsContentElement](../xpscontentelement/)
* ruang nama [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* perakitan [Aspose.Page](../../)


