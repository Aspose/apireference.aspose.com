---
title: "System::Collections::Generic::_ValueCollection class"
linktitle: "_ValueCollection"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::_ValueCollection class. Koleksi nilai-nilai Dictionary. Mengacu pada koleksi, tidak menyalin apa pun. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 300
url: /id/cpp/system.collections.generic/_valuecollection/
---
## _ValueCollection class


Koleksi nilai-nilai [Dictionary](../dictionary/). Mengacu pada koleksi, tidak menyalin apa pun. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
template<typename Dict>class _ValueCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::mapped_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Metode

| Metode | Deskripsi |
| --- | --- |
| [_ValueCollection](./_valuecollection/)(const typename Dict::Ptr\&) | Menginisialisasi koleksi yang merujuk pada kamus yang ditentukan. |
| [Contains](./contains/)(const TValue\&) const override | Memeriksa apakah item ada di dalam wadah. |
| [GetEnumerator](./getenumerator/)() override | Mendapatkan enumerator yang mengiterasi nilai-nilai. |
| [idx_get](./idx_get/)(int) const override | Mengimplementasikan metode [IList](../ilist/). Tidak didukung. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mendapatkan implementasi begin const iterator untuk kontainer saat ini. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mendapatkan implementasi begin iterator untuk kontainer saat ini. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mendapatkan implementasi end const iterator untuk kontainer saat ini. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mendapatkan implementasi end iterator untuk kontainer saat ini. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [TValue](./tvalue/) | Tipe nilai. |

## Lihat Juga

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
