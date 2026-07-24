---
title: "System::Globalization::TextInfo kelas"
linktitle: "TextInfo"
second_title: "Aspose.Page untuk C++"
description: "System::Globalization::TextInfo kelas. Mendefinisikan properti teks yang spesifik untuk locale. Operasi setter hanya diaktifkan pada objek yang tidak bersifat read-only. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2800
url: /id/cpp/system.globalization/textinfo/
---
## TextInfo class


Menetapkan properti teks yang spesifik untuk locale. Operasi setter hanya diaktifkan pada objek yang tidak bersifat read-only. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class TextInfo : public System::ICloneable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() override | Informasi RTTI. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| virtual [get_ANSICodePage](./get_ansicodepage/)() const | Mendapatkan kode halaman ANSI. |
| [get_CultureName](./get_culturename/)() const | Mendapatkan nama kultur. |
| virtual [get_EBCDICCodePage](./get_ebcdiccodepage/)() const | Mendapatkan kode halaman EBCDIC. |
| [get_IsReadOnly](./get_isreadonly/)() const | Memeriksa apakah format bersifat hanya-baca. |
| [get_IsRightToLeft](./get_isrighttoleft/)() const | Memeriksa apakah teks ditulis dari kiri ke kanan. |
| [get_LCID](./get_lcid/)() const | Mendapatkan ID locale. |
| virtual [get_ListSeparator](./get_listseparator/)() const | Mendapatkan pemisah daftar. |
| virtual [get_MacCodePage](./get_maccodepage/)() const | Mendapatkan kode halaman Macintosh. |
| virtual [get_OEMCodePage](./get_oemcodepage/)() const | Mendapatkan kode halaman OEM. |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| [operator=](./operator=/)(const TextInfo\&) |  |
| static [ReadOnly](./readonly/)(const TextInfoPtr\&) | Mendapatkan versi read-only dari kultur. |
| virtual [set_ListSeparator](./set_listseparator/)(String) | Mengatur pemisah daftar. |
| [TextInfo](./textinfo/)(const TextInfo\&) | Informasi RTTI. |
| virtual [ToLower](./tolower/)(char_t) const | Mengonversi karakter menjadi huruf kecil. |
| virtual [ToLower](./tolower/)(String) const | Mengonversi string menjadi huruf kecil. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
| [ToTitleCase](./totitlecase/)(String) const | Mengonversi string menjadi format judul (kecuali akronim yang sudah dalam huruf besar). |
| virtual [ToUpper](./toupper/)(char_t) const | Mengonversi karakter menjadi huruf besar. |
| virtual [ToUpper](./toupper/)(String) const | Mengonversi string menjadi huruf besar. |
## Lihat Juga

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
