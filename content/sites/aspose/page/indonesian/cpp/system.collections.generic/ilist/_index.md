---
title: "System::Collections::Generic::IList class"
linktitle: "IList"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::IList class. Antarmuka kontainer berindeks dari elemen. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2600
url: /id/cpp/system.collections.generic/ilist/
---
## IList class


Antarmuka kontainer berindeks dari elemen. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
template<typename T>class IList : public System::Collections::Generic::ICollection<T>
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_IsFixedSize](./get_isfixedsize/)() | Memeriksa apakah koleksi berukuran tetap. |
| virtual [idx_get](./idx_get/)(int) const | Mendapatkan elemen pada indeks yang ditentukan. |
| virtual [idx_set](./idx_set/)(int, T) | Menetapkan elemen pada indeks yang ditentukan. |
| virtual [IndexOf](./indexof/)(const T\&) const | Mendapatkan indeks kemunculan pertama item dalam kontainer. |
| virtual [Insert](./insert/)(int, const T\&) | Menyisipkan elemen ke posisi yang ditentukan, menggeser elemen lain. |
| virtual [RemoveAt](./removeat/)(int) | Menghapus elemen pada indeks yang ditentukan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [BaseType](./basetype/) | Informasi RTTI. |
| [ThisType](./thistype/) | Tipe ini. |
| [ValueType](./valuetype/) | Tipe nilai. |

## Lihat Juga

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
