---
title: "kelas System::Globalization::IdnMapping"
linktitle: "IdnMapping"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Globalization::IdnMapping. IdnMapping digunakan untuk memetakan nama ke Punycode. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1300
url: /id/cpp/system.globalization/idnmapping/
---
## IdnMapping class


[IdnMapping](./) used to map names to Punycode. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class IdnMapping : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Membandingkan dua objek [IdnMapping](./). |
| [get_AllowUnassigned](./get_allowunassigned/)() const | Mendapatkan flag yang menunjukkan apakah titik kode yang tidak ditetapkan digunakan dalam operasi. |
| [get_UseStd3AsciiRules](./get_usestd3asciirules/)() const | Mendapatkan flag yang menunjukkan apakah konvensi penamaan standar digunakan dalam operasi. |
| [GetAscii](./getascii/)(const String\&) const | [Convert](../../system/convert/) nama domain unicode ke ekuivalen ascii. |
| [GetAscii](./getascii/)(const String\&, int) const | [Convert](../../system/convert/) nama domain unicode ke ekuivalen ascii. |
| [GetAscii](./getascii/)(const String\&, int, int) const | [Convert](../../system/convert/) nama domain unicode ke ekuivalen ascii. |
| [GetHashCode](./gethashcode/)() const override | Mendapatkan kode hash untuk objek [IdnMapping](./) saat ini. |
| [GetUnicode](./getunicode/)(const String\&) const | [Convert](../../system/convert/) nama domain ascii ke ekuivalen unicode. |
| [GetUnicode](./getunicode/)(const String\&, int) const | [Convert](../../system/convert/) nama domain ascii ke ekuivalen unicode. |
| [GetUnicode](./getunicode/)(const String\&, int, int) const | [Convert](../../system/convert/) nama domain ascii ke ekuivalen unicode. |
| [IdnMapping](./idnmapping/)() | Informasi RTTI. |
| [IdnMapping](./idnmapping/)(const IdnMapping\&) |  |
| [operator=](./operator=/)(const IdnMapping\&) |  |
| [set_AllowUnassigned](./set_allowunassigned/)(bool) | Mengatur flag yang menunjukkan apakah titik kode yang tidak ditetapkan digunakan dalam operasi. |
| [set_UseStd3AsciiRules](./set_usestd3asciirules/)(bool) | Mengatur flag yang menunjukkan apakah konvensi penamaan standar digunakan dalam operasi. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
