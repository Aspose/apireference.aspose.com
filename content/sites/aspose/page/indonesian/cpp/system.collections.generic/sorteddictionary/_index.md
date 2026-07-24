---
title: "System::Collections::Generic::SortedDictionary kelas"
linktitle: "SortedDictionary"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::SortedDictionary kelas. Tipe kamus terurut deklarasi maju dalam C++."
type: docs
weight: 4000
url: /id/cpp/system.collections.generic/sorteddictionary/
---
## SortedDictionary class


Deklarasi maju tipe kamus terurut.

```cpp
template<typename TKey,typename TValue>class SortedDictionary : public System::Collections::Generic::BaseDictionary<std::map<TKey, TValue, ComparerAdapter<BasePointerType<TKey>::type>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
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
| [get_Comparer](./get_comparer/)() const | Mendapatkan [IComparer<TKey>](../icomparer/) yang digunakan untuk mengurutkan elemen-elemen dari SortedDictionary<TKey,TValue>. |
| static [GetDefaultKeyComparer](./getdefaultkeycomparer/)() | Fungsi akses singleton. |
| [GetEnumerator](./getenumerator/)() override | Mendapatkan enumerator untuk mengiterasi kamus saat ini. |
| [rbegin](./rbegin/)() | Mendapatkan iterator terbalik ke elemen terakhir koleksi (pertama dalam urutan terbalik). |
| [rbegin](./rbegin/)() const | Mendapatkan iterator terbalik ke elemen terakhir koleksi yang const-qualified (pertama dalam urutan terbalik). |
| [rend](./rend/)() | Mendapatkan iterator terbalik untuk elemen yang tidak ada sebelum awal koleksi. |
| [rend](./rend/)() const | Mendapatkan iterator terbalik untuk elemen yang tidak ada sebelum awal koleksi yang const-qualified. |
| [SortedDictionary](./sorteddictionary/)() | Membuat kamus kosong. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | Membuat kamus kosong. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | Konstruktor penyalinan. |
| [SortedDictionary](./sorteddictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IComparer\<typename BasePointerType\<TKey\>::type\>\>\&) | Konstruktor penyalinan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [const_iterator](./const_iterator/) | Tipe iterator konstan. |
| [const_reverse_iterator](./const_reverse_iterator/) | Tipe iterator terbalik konstan. |
| [IEnumerablePtr](./ienumerableptr/) | Koleksi elemen yang sama. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) tipe. |
| [iterator](./iterator/) | Tipe iterator. |
| [KeyCollection](./keycollection/) | Tipe koleksi kunci. |
| [KVPair](./kvpair/) | Tipe pasangan kunci-nilai. |
| [map_t](./map_t/) | Tipe data dasar. |
| [Ptr](./ptr/) | Tipe pointer. |
| [reverse_iterator](./reverse_iterator/) | Tipe iterator terbalik. |
| [this_t](./this_t/) | Tipe diri. |
| [ValueCollection](./valuecollection/) | Tipe koleksi nilai. |
## Catatan


Kelas kamus terurut yang membungkus STL map. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
