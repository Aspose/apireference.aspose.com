---
title: "System::Globalization::CompareInfo kelas"
linktitle: "CompareInfo"
second_title: "Aspose.Page untuk C++"
description: "System::Globalization::CompareInfo kelas. Membuat perbandingan string yang sensitif budaya. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 400
url: /id/cpp/system.globalization/compareinfo/
---
## CompareInfo class


Membuat perbandingan string yang sensitif budaya. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class CompareInfo : public virtual System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Compare](./compare/)(const String\&, const String\&) const | Membandingkan string. Tidak diimplementasikan. |
| virtual [Compare](./compare/)(const String\&, const String\&, CompareOptions) const | Membandingkan string. Hanya mode Ordinal dan OrdinalIgnoreCase yang didukung. |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int) const | Membandingkan bagian dari satu string dengan bagian dari string kedua. Tidak diimplementasikan. |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int, CompareOptions) const | Membandingkan bagian akhir dari satu string dengan bagian akhir dari string kedua menggunakan metode perbandingan string. Tidak diimplementasikan. |
| virtual [Compare](./compare/)(const String\&, int, const String\&, int) const | Membandingkan bagian akhir dari satu string dengan bagian akhir dari string kedua. Tidak diimplementasikan. |
| virtual [Compare](./compare/)(const String\&, int, int, const String\&, int, int, CompareOptions) const | Membandingkan bagian dari satu string dengan bagian dari string kedua menggunakan metode perbandingan string. Tidak diimplementasikan. |
| [CompareInfo](./compareinfo/)(const CompareInfo\&) | Informasi RTTI. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [get_LCID](./get_lcid/)() const | Mendapatkan LCID budaya yang terkait dengan pembanding. |
| virtual [get_Name](./get_name/)() const | Mendapatkan nama budaya yang terkait dengan pembanding. |
| [get_Version](./get_version/)() const | Mendapatkan informasi tentang versi pengurutan. |
| static [GetCompareInfo](./getcompareinfo/)(int, const SharedPtr\<Reflection::Assembly\>\&) | Mendapatkan [CompareInfo](./) yang terkait dengan budaya yang ditentukan dan menggunakan metode perbandingan string dalam assembly yang ditentukan. |
| static [GetCompareInfo](./getcompareinfo/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | Mendapatkan [CompareInfo](./) yang terkait dengan budaya yang ditentukan dan menggunakan metode perbandingan string dalam assembly yang ditentukan. |
| static [GetCompareInfo](./getcompareinfo/)(int) | Mendapatkan [CompareInfo](./) yang terkait dengan budaya yang ditentukan. |
| static [GetCompareInfo](./getcompareinfo/)(const String\&) | Mendapatkan [CompareInfo](./) yang terkait dengan budaya yang ditentukan. |
| virtual [GetHashCode](./gethashcode/)(const String\&, CompareOptions) const | Mendapatkan kode hash string berdasarkan opsi perbandingan yang ditentukan. |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| virtual [GetSortKey](./getsortkey/)(const String\&, CompareOptions) const | Mendapatkan objek [SortKey](../sortkey/) untuk string yang ditentukan menggunakan opsi perbandingan yang ditentukan. |
| virtual [GetSortKey](./getsortkey/)(const String\&) const | Mendapatkan objek [SortKey](../sortkey/) untuk string yang ditentukan. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int) const | Mencari substring. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, CompareOptions) const | Mencari substring. Hanya mode Ordinal yang didukung. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int, int, CompareOptions) const | Mencari substring. Hanya mode Ordinal yang didukung. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int, CompareOptions) const | Mencari karakter yang ditentukan. Hanya mode Ordinal yang didukung. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, int) const | Mencari substring. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t) const | Mencari karakter yang ditentukan. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&) const | Mencari substring. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, CompareOptions) const | Mencari karakter yang ditentukan. Hanya mode Ordinal yang didukung. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int, int) const | Mencari karakter yang ditentukan. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, int) const | Mencari karakter yang ditentukan. |
| virtual [IndexOf](./indexof/)(const String\&, const String\&, CompareOptions) const | Mencari substring. Hanya mode Ordinal yang didukung. |
| virtual [IndexOf](./indexof/)(const String\&, char16_t, CompareOptions) const | Mencari karakter yang ditentukan. Hanya mode Ordinal yang didukung. |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&, CompareOptions) const | Memeriksa apakah string yang ditentukan dimulai dengan awalan yang ditentukan menggunakan opsi perbandingan yang ditentukan. |
| virtual [IsPrefix](./isprefix/)(const String\&, const String\&) const | Memeriksa apakah string yang ditentukan dimulai dengan awalan yang ditentukan. |
| static [IsSortable](./issortable/)(char16_t) | Memeriksa apakah karakter yang ditentukan dapat diurutkan. |
| static [IsSortable](./issortable/)(const String\&) | Memeriksa apakah string yang ditentukan dapat diurutkan. |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&, CompareOptions) const | Memeriksa apakah string yang ditentukan diakhiri dengan akhiran yang ditentukan menggunakan opsi perbandingan yang ditentukan. |
| virtual [IsSuffix](./issuffix/)(const String\&, const String\&) const | Memeriksa apakah string yang ditentukan diakhiri dengan akhiran yang ditentukan. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&) const | Mencari kejadian terakhir dari substring yang ditentukan. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int, CompareOptions) const | Mencari kejadian terakhir dari substring yang ditentukan menggunakan opsi perbandingan yang ditentukan. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int, CompareOptions) const | Mencari kejadian terakhir dari karakter yang ditentukan menggunakan opsi perbandingan yang ditentukan. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, int) const | Mencari kejadian terakhir dari string yang ditentukan. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int, CompareOptions) const | Mencari kejadian terakhir dari string yang ditentukan menggunakan opsi perbandingan yang ditentukan. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, CompareOptions) const | Mencari kejadian terakhir dari karakter yang ditentukan menggunakan opsi perbandingan yang ditentukan. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, int) const | Mencari kejadian terakhir dari string yang ditentukan. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int) const | Mencari kejadian terakhir dari karakter yang ditentukan. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, const String\&, CompareOptions) const | Mencari kejadian terakhir dari string yang ditentukan menggunakan opsi perbandingan yang ditentukan. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, CompareOptions) const | Mencari kejadian terakhir dari karakter yang ditentukan menggunakan opsi perbandingan yang ditentukan. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t) const | Mencari kejadian terakhir dari karakter yang ditentukan. |
| virtual [LastIndexOf](./lastindexof/)(const String\&, char16_t, int, int) const | Mencari kejadian terakhir dari karakter yang ditentukan. |
| [operator=](./operator=/)(const CompareInfo\&) |  |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
