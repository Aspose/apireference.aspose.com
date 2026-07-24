---
title: "Aspose::Page::XPS::XpsModel::XpsGlyphs kelas"
linktitle: "XpsGlyphs"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsModel::XpsGlyphs kelas. Kelas yang mengenkapsulasi fitur elemen Glyphs. Elemen ini mewakili rangkaian teks yang diformat secara seragam dari satu font. Ia menyediakan informasi yang diperlukan untuk rendering yang akurat dan mendukung fitur pencarian serta pemilihan dalam penampil konsumen di C++."
type: docs
weight: 1500
url: /id/cpp/aspose.page.xps.xpsmodel/xpsglyphs/
---
## XpsGlyphs class


Kelas yang mengenkapsulasi fitur elemen Glyphs. Elemen ini mewakili rangkaian teks yang diformat secara seragam dari satu font. Elemen ini menyediakan informasi yang diperlukan untuk rendering yang akurat dan mendukung fitur pencarian serta pemilihan pada konsumen tampilan.

```cpp
class XpsGlyphs : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() | Klon glyph ini. |
| [get_BidiLevel](./get_bidilevel/)() const | Mengembalikan/mengatur nilai yang menentukan tingkat penyusunan bersarang algoritma Unicode bidirectional. Nilai genap menunjukkan tata letak kiri-ke-kanan, nilai ganjil menunjukkan tata letak kanan-ke-kiri. Tata letak kanan-ke-kiri menempatkan asal run di sisi kanan glyph pertama, dengan lebar maju positif (mewakili kemajuan ke kiri) menempatkan glyph berikutnya ke kiri glyph sebelumnya. |
| [get_Fill](./get_fill/)() | Mengembalikan/mengatur kuas yang digunakan untuk mengisi bentuk glyph yang dirender. |
| [get_Font](./get_font/)() | Mengembalikan sumber daya font untuk font **TrueType** yang digunakan untuk menyusun teks elemen. |
| [get_FontRenderingEmSize](./get_fontrenderingemsize/)() const | Mengembalikan/mengatur ukuran font dalam satuan permukaan gambar, dinyatakan sebagai float dalam satuan ruang koordinat yang efektif. |
| [get_Indices](./get_indices/)() |  |
| [get_IsSideways](./get_issideways/)() const | Mengembalikan/mengatur nilai yang menunjukkan bahwa sebuah glyph diputar ke samping, dengan asal yang didefinisikan sebagai pusat atas glyph yang tidak diputar. |
| [get_OriginX](./get_originx/)() const | Mengembalikan/mengatur koordinat x glyph pertama dalam run, dalam satuan ruang koordinat yang efektif. |
| [get_OriginY](./get_originy/)() const | Mengembalikan/mengatur koordinat y glyph pertama dalam run, dalam satuan ruang koordinat yang efektif. |
| [get_StyleSimulations](./get_stylesimulations/)() const | Mengembalikan/mengatur nilai yang menentukan simulasi gaya. |
| [get_UnicodeString](./get_unicodestring/)() const | Mengembalikan/mengatur string teks yang dirender oleh elemen Glyphs. Teks tersebut ditentukan sebagai titik kode Unicode. |
| [set_BidiLevel](./set_bidilevel/)(int32_t) | Mengembalikan/mengatur nilai yang menentukan tingkat penyusunan bersarang algoritma Unicode bidirectional. Nilai genap menunjukkan tata letak kiri-ke-kanan, nilai ganjil menunjukkan tata letak kanan-ke-kiri. Tata letak kanan-ke-kiri menempatkan asal run di sisi kanan glyph pertama, dengan lebar maju positif (mewakili kemajuan ke kiri) menempatkan glyph berikutnya ke kiri glyph sebelumnya. |
| [set_Fill](./set_fill/)(System::SharedPtr\<XpsBrush\>) | Mengembalikan/mengatur kuas yang digunakan untuk mengisi bentuk glyph yang dirender. |
| [set_FontRenderingEmSize](./set_fontrenderingemsize/)(float) | Mengembalikan/mengatur ukuran font dalam satuan permukaan gambar, dinyatakan sebagai float dalam satuan ruang koordinat yang efektif. |
| [set_Indices](./set_indices/)(System::SharedPtr\<System::Collections::Generic::SortedList\<int32_t, System::SharedPtr\<XpsGlyphMapping\>\>\>) |  |
| [set_IsSideways](./set_issideways/)(bool) | Mengembalikan/mengatur nilai yang menunjukkan bahwa sebuah glyph diputar ke samping, dengan asal yang didefinisikan sebagai pusat atas glyph yang tidak diputar. |
| [set_OriginX](./set_originx/)(float) | Mengembalikan/mengatur koordinat x glyph pertama dalam run, dalam satuan ruang koordinat yang efektif. |
| [set_OriginY](./set_originy/)(float) | Mengembalikan/mengatur koordinat y glyph pertama dalam run, dalam satuan ruang koordinat yang efektif. |
| [set_StyleSimulations](./set_stylesimulations/)(XpsStyleSimulations) | Mengembalikan/mengatur nilai yang menentukan simulasi gaya. |
| [set_UnicodeString](./set_unicodestring/)(System::String) | Mengembalikan/mengatur string teks yang dirender oleh elemen Glyphs. Teks tersebut ditentukan sebagai titik kode Unicode. |
## Lihat Juga

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
