---
title: "System::Collections::Generic::IEqualityComparer kelas"
linktitle: "IEqualityComparer"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::IEqualityComparer kelas. Antarmuka yang menyediakan cara untuk membandingkan dua objek untuk kesetaraan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2400
url: /id/cpp/system.collections.generic/iequalitycomparer/
---
## IEqualityComparer class


Antarmuka yang menyediakan cara untuk membandingkan dua objek untuk kesetaraan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen.

```cpp
template<typename T>class IEqualityComparer : public virtual System::Object
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe yang dibandingkan. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Equals](./equals/)(T, T) const | Informasi RTTI. |
| virtual [GetHashCode](./gethashcode/)(T) const | Mendapatkan kode hash untuk suatu objek. |

## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
