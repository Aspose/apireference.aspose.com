---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas class"
linktitle: "XpsCanvas"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas class. Kelas yang mengenkapsulasi fitur elemen Canvas. Elemen ini mengelompokkan elemen‑elemen bersama. Misalnya, elemen Glyphs dan Path dapat dikelompokkan dalam sebuah canvas untuk diidentifikasi sebagai satu unit (sebagai tujuan hyperlink) atau untuk menerapkan nilai properti yang digabungkan ke setiap elemen anak dan leluhur dalam C++."
type: docs
weight: 500
url: /id/cpp/aspose.page.xps.xpsmodel/xpscanvas/
---
## XpsCanvas class


Kelas yang mengenkapsulasi fitur elemen Canvas. Elemen ini mengelompokkan elemen bersama-sama. Misalnya, elemen Glyphs dan Path dapat dikelompokkan dalam sebuah kanvas untuk diidentifikasi sebagai satu unit (sebagai tujuan hyperlink) atau untuk menerapkan nilai properti yang digabungkan ke setiap elemen anak dan nenek moyang.

```cpp
class XpsCanvas : public Aspose::Page::XPS::XpsModel::XpsContentElement
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(T) | Menambahkan sebuah elemen ke daftar anak canvas ini. |
| [AddCanvas](./addcanvas/)() | Menambahkan sebuah canvas baru ke daftar anak canvas ini. |
| [AddGlyphs](./addglyphs/)(System::String, float, System::Drawing::FontStyle, float, float, System::String) | Menambahkan glyph baru ke daftar anak canvas ini. |
| [AddPath](./addpath/)(System::SharedPtr\<XpsPathGeometry\>) | Menambahkan sebuah path baru ke daftar anak canvas ini. |
| [Clone](./clone/)() | Menggandakan canvas ini. |
| [get_EdgeMode](./get_edgemode/)() const | Mengembalikan/mengatur nilai yang mengontrol bagaimana tepi path dalam canvas dirender. |
| [Insert](./insert/)(int32_t, T) | Menyisipkan sebuah elemen ke daftar anak canvas ini pada posisi *index*. |
| [InsertCanvas](./insertcanvas/)(int32_t) | Menyisipkan sebuah canvas baru ke daftar anak canvas ini pada posisi *index*. |
| [InsertGlyphs](./insertglyphs/)(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) | Menyisipkan glyph baru ke daftar anak canvas ini pada posisi *index*. |
| [InsertPath](./insertpath/)(int32_t, System::SharedPtr\<XpsPathGeometry\>) | Menyisipkan sebuah path baru ke daftar anak canvas ini pada posisi *index*. |
| [set_EdgeMode](./set_edgemode/)(XpsEdgeMode) | Mengembalikan/mengatur nilai yang mengontrol bagaimana tepi path dalam canvas dirender. |
## Lihat Juga

* Class [XpsContentElement](../xpscontentelement/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
