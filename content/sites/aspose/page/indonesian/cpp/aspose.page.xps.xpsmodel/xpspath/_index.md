---
title: "Aspose::Page::XPS::XpsModel::XpsPath kelas"
linktitle: "XpsPath"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsModel::XpsPath kelas. Kelas yang mengenkapsulasi fitur elemen Path. Elemen ini adalah satu-satunya cara untuk menambahkan grafik vektor dan gambar ke halaman tetap. Ia mendefinisikan satu grafik vektor yang akan dirender pada halaman dalam C++."
type: docs
weight: 3000
url: /id/cpp/aspose.page.xps.xpsmodel/xpspath/
---
## XpsPath class


Kelas yang mengenkapsulasi fitur elemen Path. Elemen ini adalah satu-satunya cara untuk menambahkan grafik vektor dan gambar ke halaman tetap. Elemen ini mendefinisikan satu grafik vektor yang akan dirender pada halaman.

```cpp
class XpsPath : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() | Mengkloning jalur ini. |
| [get_Data](./get_data/)() | Mengembalikan/mengatur geometri jalur. |
| [get_Fill](./get_fill/)() | Mengembalikan/mengatur kuas yang digunakan untuk melukis geometri yang ditentukan oleh properti Data dari jalur. |
| [get_Stroke](./get_stroke/)() | Mengembalikan/mengatur kuas yang digunakan untuk menggambar goresan. |
| [get_StrokeDashArray](./get_strokedasharray/)() const | Mengembalikan/mengatur array yang menentukan panjang garis putus-putus dan celah dari goresan outline. |
| [get_StrokeDashCap](./get_strokedashcap/)() const | Mengembalikan/mengatur nilai yang menentukan bagaimana ujung setiap garis putus-putus digambar. |
| [get_StrokeDashOffset](./get_strokedashoffset/)() const | Mengembalikan/mengatur titik awal untuk mengulang pola array garis putus-putus. Jika nilai ini dihilangkan, array garis putus-putus akan selaras dengan asal goresan. |
| [get_StrokeEndLineCap](./get_strokeendlinecap/)() const | Mengembalikan/mengatur nilai yang mendefinisikan bentuk ujung garis putus-putus terakhir dalam sebuah goresan. |
| [get_StrokeLineJoin](./get_strokelinejoin/)() const | Mengembalikan/mengatur nilai yang mendefinisikan bentuk awal garis putus-putus pertama dalam sebuah goresan. |
| [get_StrokeMiterLimit](./get_strokemiterlimit/)() const | Mengembalikan/mengatur rasio antara panjang miter maksimum dan setengah ketebalan goresan. Nilai ini signifikan hanya jika atribut **StrokeLineJoin** menentukan **Miter**. |
| [get_StrokeStartLineCap](./get_strokestartlinecap/)() const | Mengembalikan/mengatur nilai yang mendefinisikan bentuk awal garis putus-putus pertama dalam sebuah goresan. |
| [get_StrokeThickness](./get_strokethickness/)() const | Mengembalikan/mengatur ketebalan goresan, dalam satuan ruang koordinat efektif (termasuk transformasi render jalur). Goresan digambar di atas batas geometri yang ditentukan oleh properti Data elemen Path. Setengah dari StrokeThickness berada di luar geometri yang ditentukan oleh properti Data dan setengah lainnya berada di dalam geometri. |
| [set_Data](./set_data/)(System::SharedPtr\<XpsPathGeometry\>) | Mengembalikan/mengatur geometri jalur. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | Mengembalikan/mengatur kuas yang digunakan untuk melukis geometri yang ditentukan oleh properti Data dari jalur. |
| [set_Stroke](./set_stroke/)(System::SharedPtr\<XpsBrush\>) | Mengembalikan/mengatur kuas yang digunakan untuk menggambar goresan. |
| [set_StrokeDashArray](./set_strokedasharray/)(System::ArrayPtr\<float\>) | Mengembalikan/mengatur array yang menentukan panjang garis putus-putus dan celah dari goresan outline. |
| [set_StrokeDashCap](./set_strokedashcap/)(XpsDashCap) | Mengembalikan/mengatur nilai yang menentukan bagaimana ujung setiap garis putus-putus digambar. |
| [set_StrokeDashOffset](./set_strokedashoffset/)(float) | Mengembalikan/mengatur titik awal untuk mengulang pola array garis putus-putus. Jika nilai ini dihilangkan, array garis putus-putus akan selaras dengan asal goresan. |
| [set_StrokeEndLineCap](./set_strokeendlinecap/)(XpsLineCap) | Mengembalikan/mengatur nilai yang mendefinisikan bentuk ujung garis putus-putus terakhir dalam sebuah goresan. |
| [set_StrokeLineJoin](./set_strokelinejoin/)(XpsLineJoin) | Mengembalikan/mengatur nilai yang mendefinisikan bentuk awal garis putus-putus pertama dalam sebuah goresan. |
| [set_StrokeMiterLimit](./set_strokemiterlimit/)(float) | Mengembalikan/mengatur rasio antara panjang miter maksimum dan setengah ketebalan goresan. Nilai ini signifikan hanya jika atribut **StrokeLineJoin** menentukan **Miter**. |
| [set_StrokeStartLineCap](./set_strokestartlinecap/)(XpsLineCap) | Mengembalikan/mengatur nilai yang mendefinisikan bentuk awal garis putus-putus pertama dalam sebuah goresan. |
| [set_StrokeThickness](./set_strokethickness/)(float) | Mengembalikan/mengatur ketebalan goresan, dalam satuan ruang koordinat efektif (termasuk transformasi render jalur). Goresan digambar di atas batas geometri yang ditentukan oleh properti Data elemen Path. Setengah dari StrokeThickness berada di luar geometri yang ditentukan oleh properti Data dan setengah lainnya berada di dalam geometri. |
## Lihat Juga

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
