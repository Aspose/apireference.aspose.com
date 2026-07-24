---
title: "System::Collections::Generic::_KeyCollection kelas"
linktitle: "_KeyCollection"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::_KeyCollection kelas. Koleksi kunci Dictionary. Mengacu pada koleksi, tidak menyalin apa pun. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 100
url: /id/cpp/system.collections.generic/_keycollection/
---
## _KeyCollection class


Koleksi kunci [Dictionary](../dictionary/). Mengacu pada koleksi, tidak menyalin apa pun. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen.

```cpp
template<typename Dict>class _KeyCollection : public System::Collections::Generic::BaseKVCollection<Dict, Dict::map_t::key_type>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Metode

| Metode | Deskripsi |
| --- | --- |
| [_KeyCollection](./_keycollection/)(const typename Dict::Ptr\&) | Menginisialisasi koleksi yang merujuk pada kamus yang ditentukan. |
| [Contains](./contains/)(const TKey\&) const override | Memeriksa apakah item ada di dalam wadah. |
| [GetEnumerator](./getenumerator/)() override | Mendapatkan enumerator yang mengiterasi melalui kunci. |
| [idx_get](./idx_get/)(int) const override | Mengimplementasikan metode [IList](../ilist/). Tidak didukung. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mendapatkan implementasi begin const iterator untuk kontainer saat ini. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mendapatkan implementasi begin iterator untuk kontainer saat ini. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mendapatkan implementasi end const iterator untuk kontainer saat ini. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mendapatkan implementasi end iterator untuk kontainer saat ini. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [TKey](./tkey/) | Tipe kunci. |

## Lihat Juga

* Class [BaseKVCollection](../basekvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
