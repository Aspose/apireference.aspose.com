---
title: "System::Collections::Generic::DefaultComparer kelas"
linktitle: "DefaultComparer"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::DefaultComparer kelas. Kelas pembanding default. Menggunakan operator < dan operator == untuk membandingkan nilai. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1000
url: /id/cpp/system.collections.generic/defaultcomparer/
---
## DefaultComparer class


Kelas pembanding default. Menggunakan operator < dan operator == untuk membandingkan nilai. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen.

```cpp
template<class T>class DefaultComparer : public System::Collections::Generic::IComparer<T>
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe yang dibandingkan. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [Compare](./compare/)(typename ThisType::args_type, typename ThisType::args_type) const override | Informasi RTTI. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [BaseType](./basetype/) | Antarmuka yang diimplementasikan. |
| [ThisType](./thistype/) | Tipe saat ini. |

## Lihat Juga

* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
