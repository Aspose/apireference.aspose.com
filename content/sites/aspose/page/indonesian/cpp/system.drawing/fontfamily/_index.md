---
title: "kelas System::Drawing::FontFamily"
linktitle: "FontFamily"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Drawing::FontFamily. Mewakili sekelompok tipe huruf yang berbagi desain dasar yang serupa. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 900
url: /id/cpp/system.drawing/fontfamily/
---
## FontFamily class


Mewakili sekelompok tipe huruf yang berbagi desain dasar yang serupa. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class FontFamily : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() | Mengembalikan salinan objek [FontFamily](./) saat ini. |
| [Dispose](./dispose/)() | Melepaskan semua sumber daya sistem operasi yang diperoleh oleh objek saat ini. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Menentukan apakah objek saat ini dan objek yang ditentukan identik. |
| [FontFamily](./fontfamily/)(const String\&) | Membuat instance baru dari kelas [FontFamily](./) yang mewakili keluarga font dengan nama yang ditentukan. |
| [FontFamily](./fontfamily/)(const String\&, const SharedPtr\<Text::FontCollection\>\&) | Membuat instance baru dari [FontFamily](./) dalam FontCollection yang ditentukan dengan nama yang ditentukan. |
| [FontFamily](./fontfamily/)(Text::GenericFontFamilies) | Membuat instance baru dari [FontFamily](./) dari keluarga font generik yang ditentukan. |
| static [get_Families](./get_families/)() | Mengembalikan array yang berisi semua objek [FontFamily](./) yang terkait dengan konteks grafis saat ini. |
| static [get_GenericMonospace](./get_genericmonospace/)() | Mengembalikan objek [FontFamily](./) yang mewakili keluarga font Generic Monospace. |
| static [get_GenericSansSerif](./get_genericsansserif/)() | Mengembalikan objek [FontFamily](./) yang mewakili keluarga font Generic Sans Serif. |
| static [get_GenericSerif](./get_genericserif/)() | Mengembalikan objek [FontFamily](./) yang mewakili keluarga font Generic Serif. |
| [get_Name](./get_name/)() const | Mengembalikan nama keluarga font yang diwakili oleh objek saat ini. |
| [GetCellAscent](./getcellascent/)(FontStyle) | Mengembalikan kenaikan sel (cell ascent) dari keluarga font yang diwakili oleh objek saat ini untuk gaya font yang ditentukan. |
| [GetCellDescent](./getcelldescent/)(FontStyle) | Mengembalikan penurunan sel (cell descent) dari keluarga font yang diwakili oleh objek saat ini untuk gaya font yang ditentukan. |
| [GetEmHeight](./getemheight/)(FontStyle) | Mengembalikan tinggi kotak em dalam satuan desain font untuk gaya yang ditentukan. |
| [GetLineSpacing](./getlinespacing/)(FontStyle) | Mengembalikan jarak baris (line spacing) dari keluarga font yang diwakili oleh objek saat ini untuk gaya font yang ditentukan. |
| [GetName](./getname/)(int) const | Mengembalikan nama keluarga font yang diwakili oleh objek saat ini. |
| [IsStyleAvailable](./isstyleavailable/)(FontStyle) | Menentukan apakah gaya font yang ditentukan tersedia. |
| virtual [~FontFamily](./~fontfamily/)() | Destruktor. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
