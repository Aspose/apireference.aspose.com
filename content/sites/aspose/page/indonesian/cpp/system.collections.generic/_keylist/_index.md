---
title: "kelas System::Collections::Generic::_KeyList"
linktitle: "_KeyList"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Collections::Generic::_KeyList. Mengimplementasikan daftar kunci kamus. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 200
url: /id/cpp/system.collections.generic/_keylist/
---
## _KeyList class


Mengimplementasikan daftar kunci kamus. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
template<typename Dict>class _KeyList : public System::Collections::Generic::_KeyCollection<Dict>
```


| Parameter | Deskripsi |
| --- | --- |
| Dict | [Dictionary](../dictionary/) tipe. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [_KeyList](./_keylist/)(const typename Dict::Ptr\&) | Menginisialisasi koleksi yang merujuk pada kamus yang ditentukan. |
| [Contains](./contains/)(const TKey\&) const override | Memeriksa apakah kunci yang ditentukan ada dalam koleksi. |
| [idx_get](./idx_get/)(int) const override | Mendapatkan kunci pada posisi yang ditentukan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [TKey](./tkey/) | Tipe kunci. |

## Lihat Juga

* Class [_KeyCollection](../_keycollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
