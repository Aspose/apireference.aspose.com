---
title: "Kelas System::Collections::Generic::SortedList"
linktitle: "SortedList"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Collections::Generic::SortedList. Daftar terurut yang membungkus struktur FlatMap. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 4200
url: /id/cpp/system.collections.generic/sortedlist/
---
## SortedList class


Daftar terurut yang membungkus struktur FlatMap. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
template<typename TKey,typename TValue>class SortedList : public System::Collections::Generic::SortedListHelper<TKey, TValue>,
                                                          public System::Collections::Generic::BaseDictionary<Detail::FlatMap<TKey, TValue, ComparerAdapter<TKey>>>
```


| Parameter | Deskripsi |
| --- | --- |
| TKey | Tipe kunci. |
| TValue | Tipe nilai. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Metode

| Metode | Deskripsi |
| --- | --- |
| [crbegin](./crbegin/)() const | Mendapatkan iterator terbalik ke elemen terakhir yang bersifat const dalam koleksi (pertama dalam urutan terbalik). |
| [crend](./crend/)() const | Mendapatkan iterator terbalik untuk elemen const yang tidak ada sebelum awal koleksi. |
| [get_Capacity](./get_capacity/)() const | Mendapatkan kapasitas daftar saat ini. |
| virtual [get_Keys](./get_keys/)() const | Mengakses koleksi kunci. |
| virtual [get_Values](./get_values/)() const | Mengakses koleksi nilai. |
| [GetEnumerator](./getenumerator/)() override | Mendapatkan enumerator yang mengiterasi daftar saat ini. |
| [IndexOfKey](./indexofkey/)(TKey) const | Mencari kunci spesifik. |
| [IndexOfValue](./indexofvalue/)(TValue) const | Mencari nilai spesifik. |
| [rbegin](./rbegin/)() | Mendapatkan iterator terbalik ke elemen terakhir koleksi (pertama dalam urutan terbalik). |
| [rbegin](./rbegin/)() const | Mendapatkan iterator terbalik ke elemen terakhir koleksi yang const-qualified (pertama dalam urutan terbalik). |
| [RemoveAt](./removeat/)(int) | Menghapus item pada posisi yang ditentukan. |
| [rend](./rend/)() | Mendapatkan iterator terbalik untuk elemen yang tidak ada sebelum awal koleksi. |
| [rend](./rend/)() const | Mendapatkan iterator terbalik untuk elemen yang tidak ada sebelum awal koleksi yang const-qualified. |
| [set_Capacity](./set_capacity/)(int) | Mengatur kapasitas daftar saat ini. |
| [SortedList](./sortedlist/)() | Membuat daftar kosong. |
| [SortedList](./sortedlist/)(const SharedPtr\<IComparer\<TKey\>\>\&) | Membuat daftar kosong. |
| [SortedList](./sortedlist/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Konstruktor penyalinan. |
| [SortedList](./sortedlist/)(const map_t\&) | Konstruktor penyalinan. |
| [SortedList](./sortedlist/)(int) | Membuat daftar kosong. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [const_iterator](./const_iterator/) | Tipe iterator konstan. |
| [const_reverse_iterator](./const_reverse_iterator/) | Tipe iterator terbalik konstan. |
| [IEnumerablePtr](./ienumerableptr/) | Koleksi tipe pasangan yang sama. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) tipe. |
| [iterator](./iterator/) | Tipe iterator. |
| [KeyCollection](./keycollection/) | Tipe koleksi kunci. |
| [KVPair](./kvpair/) | Tipe pasangan kunci-nilai. |
| [map_t](./map_t/) | Tipe data dasar. |
| [Ptr](./ptr/) | Tipe pointer. |
| [reverse_iterator](./reverse_iterator/) | Tipe iterator terbalik. |
| [this_t](./this_t/) | Tipe ini. |
| [ValueCollection](./valuecollection/) | Tipe koleksi nilai. |

## Lihat Juga

* Class [SortedListHelper](../sortedlisthelper/)
* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
