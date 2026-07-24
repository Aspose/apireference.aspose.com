---
title: "kelas System::Collections::Generic::_ValueList"
linktitle: "_ValueList"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Collections::Generic::_ValueList. Mengimplementasikan daftar nilai kamus. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 400
url: /id/cpp/system.collections.generic/_valuelist/
---
## _ValueList class


Mengimplementasikan daftar nilai kamus. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
template<typename Dict>class _ValueList : public System::Collections::Generic::_ValueCollection<Dict>
```


| Parameter | Deskripsi |
| --- | --- |
| Dict | [Dictionary](../dictionary/) tipe. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [_ValueList](./_valuelist/)(const typename Dict::Ptr\&) | Menginisialisasi koleksi yang merujuk pada kamus yang ditentukan. |
| virtual [idx_get](./idx_get/)(int) const | Mendapatkan nilai pada posisi yang ditentukan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [TValue](./tvalue/) | Tipe nilai. |

## Lihat Juga

* Class [_ValueCollection](../_valuecollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
