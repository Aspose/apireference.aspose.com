---
title: "Kelas System::Drawing::StringFormat"
linktitle: "StringFormat"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Drawing::StringFormat. Mengenkapsulasi informasi tata letak teks, manipulasi tampilan, dan fitur OpenType. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2500
url: /id/cpp/system.drawing/stringformat/
---
## StringFormat class


Mengenkapsulasi informasi tata letak teks, manipulasi tampilan, dan fitur OpenType. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class StringFormat : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() | Mengembalikan salinan tepat dari objek saat ini. |
| [get_Alignment](./get_alignment/)() const | Mengembalikan nilai yang menunjukkan perataan horizontal string. |
| [get_DigitSubstitutionLanguage](./get_digitsubstitutionlanguage/)() const | Mengembalikan nilai yang menunjukkan bahasa yang digunakan ketika digit lokal digantikan dengan digit barat. |
| [get_DigitSubstitutionMethod](./get_digitsubstitutionmethod/)() const | Mengembalikan metode substitusi digit. |
| [get_FormatFlags](./get_formatflags/)() const | Mengembalikan kombinasi bitwise dari [StringFormatFlags](../stringformatflags/) yang menentukan format string yang diwakili oleh objek saat ini. |
| static [get_GenericDefault](./get_genericdefault/)() | Mengembalikan objek [StringFormat](./) yang mewakili format default umum. |
| static [get_GenericTypographic](./get_generictypographic/)() | Mengembalikan objek [StringFormat](./) yang mewakili format tipografi umum. |
| [get_HotkeyPrefix](./get_hotkeyprefix/)() const | Mengembalikan nilai yang menunjukkan bagaimana prefiks hot key ditampilkan. |
| [get_LineAlignment](./get_linealignment/)() const | Mengembalikan nilai yang menunjukkan perataan vertikal string. |
| [get_Trimming](./get_trimming/)() const | Mengembalikan nilai yang menunjukkan bagaimana string dipangkas. |
| [GetCharacterRangesCount](./getcharacterrangescount/)() const | Mendapatkan ukuran array [CharacterRange](../characterrange/). |
| [GetTabStops](./gettabstops/)(float\&) const | Mengembalikan posisi tab untuk objek [StringFormat](./) saat ini. |
| [set_Alignment](./set_alignment/)(StringAlignment) | Mengatur perataan horizontal string. |
| [set_FormatFlags](./set_formatflags/)(StringFormatFlags) | Mengatur flag format string. |
| [set_HotkeyPrefix](./set_hotkeyprefix/)(Text::HotkeyPrefix) | Mengatur nilai yang menentukan bagaimana prefiks hot key harus ditampilkan. |
| [set_LineAlignment](./set_linealignment/)(StringAlignment) | Mengatur perataan vertikal string. |
| [set_Trimming](./set_trimming/)(StringTrimming) | Mengatur nilai yang menentukan bagaimana string dipangkas. |
| [SetDigitSubstitution](./setdigitsubstitution/)(int32_t, StringDigitSubstitute) | Mengatur bahasa dan metode substitusi digit. |
| [SetMeasurableCharacterRanges](./setmeasurablecharacterranges/)(const ArrayPtr\<CharacterRange\>\&) | Mengatur array objek [CharacterRange](../characterrange/) yang mewakili rentang karakter yang diukur oleh pemanggilan metode MeasureCharacterRanges(). |
| [SetTabStops](./settabstops/)(float, const ArrayPtr\<float\>\&) | Mengatur posisi tab untuk objek [StringFormat](./) saat ini. |
| [StringFormat](./stringformat/)() | Membuat instance baru dari kelas [StringFormat](./). |
| [StringFormat](./stringformat/)(StringFormatFlags, int32_t) | Membuat instance baru dari kelas [StringFormat](./) dengan flag format dan bahasa yang ditentukan. |
| [StringFormat](./stringformat/)(const SharedPtr\<StringFormat\>\&) | Konstruktor penyalinan. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
