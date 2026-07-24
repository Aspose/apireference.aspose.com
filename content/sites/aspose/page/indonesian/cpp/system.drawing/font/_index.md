---
title: "Kelas System::Drawing::Font"
linktitle: "Font"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Drawing::Font. Mewakili format khusus untuk teks, termasuk jenis huruf, ukuran, dan gaya. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 700
url: /id/cpp/system.drawing/font/
---
## Font class


Mewakili format khusus untuk teks, termasuk jenis huruf, ukuran, dan gaya. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class Font : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() | Mengembalikan salinan font saat ini. |
| [Dispose](./dispose/)() | Melepaskan semua sumber daya sistem operasi yang diperoleh oleh objek saat ini. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Menentukan apakah objek saat ini dan objek yang ditentukan identik. |
| [Font](./font/)(const SharedPtr\<Font\>\&, FontStyle) | Membuat instance baru dari kelas [Font](./) yang mewakili font yang ada dengan gaya font yang ditentukan. |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | Membuat instance baru dari kelas [Font](./). |
| [Font](./font/)(const SharedPtr\<FontFamily\>\&, float, GraphicsUnit) | Membuat instance baru dari kelas [Font](./). |
| [Font](./font/)(const String\&, float, FontStyle, GraphicsUnit, uint8_t, bool) | Membuat instance baru dari kelas [Font](./). |
| [Font](./font/)(const String\&, float, GraphicsUnit) | Membuat instance baru dari kelas [Font](./). |
| static [FromLogFont](./fromlogfont/)(const SharedPtr\<Object\>\&) | BELUM DIIMPLEMENTASIKAN. |
| [get_Bold](./get_bold/)() | Menentukan apakah font yang diwakili oleh objek saat ini memiliki gaya tebal yang diterapkan. |
| [get_FontFamily](./get_fontfamily/)() | Mengembalikan keluarga font dari font yang diwakili oleh objek saat ini. |
| [get_FontStyle](./get_fontstyle/)() | Mengembalikan gaya font dari font yang diwakili oleh objek saat ini. |
| [get_GdiCharSet](./get_gdicharset/)() | Mengembalikan nilai yang menunjukkan set karakter GDI yang digunakan oleh font yang diwakili oleh objek saat ini. |
| [get_Height](./get_height/)() | Mengembalikan jarak baris font yang diwakili oleh objek saat ini dalam piksel. |
| [get_Italic](./get_italic/)() | Menentukan apakah font yang diwakili oleh objek saat ini memiliki gaya miring yang diterapkan. |
| [get_Name](./get_name/)() | Mengembalikan nama wajah font yang diwakili oleh objek saat ini. |
| [get_OriginalFontName](./get_originalfontname/)() | Mengembalikan nama font yang awalnya ditentukan. |
| [get_Size](./get_size/)() | Mengembalikan ukuran em font yang diwakili oleh objek saat ini yang diukur dalam satuan yang ditentukan oleh properti Unit. |
| [get_SizeInPoints](./get_sizeinpoints/)() | Mengembalikan ukuran em font yang diwakili oleh objek saat ini dalam poin. |
| [get_Strikeout](./get_strikeout/)() | Menentukan apakah font yang diwakili oleh objek saat ini memiliki gaya coret yang diterapkan. |
| [get_Style](./get_style/)() | Mengembalikan gaya font dari font yang diwakili oleh objek saat ini. |
| [get_Underline](./get_underline/)() | Menentukan apakah font yang diwakili oleh objek saat ini memiliki gaya garis bawah yang diterapkan. |
| [get_Unit](./get_unit/)() | Mengembalikan satuan pengukuran untuk font yang diwakili oleh objek saat ini. |
| [GetHeight](./getheight/)(const SharedPtr\<Graphics\>\&) | Mengembalikan jarak baris font yang diwakili oleh objek saat ini, dalam satuan saat ini dari objek [Graphics](../graphics/) yang ditentukan. |
| [GetHeight](./getheight/)(float) | Mengembalikan tinggi font yang diwakili oleh objek saat ini ketika digambar pada perangkat tampilan dengan resolusi vertikal yang ditentukan. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
