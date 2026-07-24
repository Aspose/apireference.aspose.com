---
title: "Kelas System::StringComparer"
linktitle: "StringComparer"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::StringComparer. Membandingkan string menggunakan mode perbandingan yang berbeda. Objek kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 5900
url: /id/cpp/system/stringcomparer/
---
## StringComparer class


Membandingkan string menggunakan mode perbandingan yang berbeda. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class StringComparer : public virtual System::Object,
                       public System::Collections::Generic::IComparer<String>,
                       public System::Collections::Generic::IEqualityComparer<String>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | Membandingkan dua string menggunakan pengaturan saat ini. |
| static [Create](./create/)(const System::SharedPtr\<System::Globalization::CultureInfo\>\&, bool) | Membuat pembanding khusus budaya. |
| [Equals](./equals/)(String, String) const override | Memeriksa apakah dua string sama menggunakan pengaturan saat ini. |
| static [get_CurrentCulture](./get_currentculture/)() | Singleton pembanding budaya saat ini. |
| static [get_CurrentCultureIgnoreCase](./get_currentcultureignorecase/)() | Singleton pembanding budaya yang mengabaikan huruf besar/kecil. |
| static [get_InvariantCulture](./get_invariantculture/)() | Singleton pembanding budaya invarian. |
| static [get_InvariantCultureIgnoreCase](./get_invariantcultureignorecase/)() | Singleton pembanding budaya invarian yang mengabaikan huruf besar/kecil. |
| static [get_Ordinal](./get_ordinal/)() | Singleton pembanding ordinal. |
| static [get_OrdinalIgnoreCase](./get_ordinalignorecase/)() | Singleton pembanding ordinal yang mengabaikan huruf besar/kecil. |
| [GetHashCode](./gethashcode/)(String) const override | Mendapatkan kode hash string. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [args_type](./args_type/) | Informasi RTTI. |
## Lihat Juga

* Class [Object](../object/)
* Class [IComparer](../../system.collections.generic/icomparer/)
* Class [IEqualityComparer](../../system.collections.generic/iequalitycomparer/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
