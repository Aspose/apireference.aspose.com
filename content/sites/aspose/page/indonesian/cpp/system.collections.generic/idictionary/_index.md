---
title: "System::Collections::Generic::IDictionary kelas"
linktitle: "IDictionary"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::IDictionary kelas. Antarmuka untuk kontainer mirip kamus. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2100
url: /id/cpp/system.collections.generic/idictionary/
---
## IDictionary class


Antarmuka untuk kontainer mirip kamus. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
template<typename TKey,typename TValue>class IDictionary : public System::Collections::Generic::ICollection<KeyValuePair<TKey, TValue>>
```


| Parameter | Deskripsi |
| --- | --- |
| TKey | Tipe kunci. |
| TValue | Tipe nilai. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Add](./add/)(const TKey\&, const TValue\&) | Menambahkan pasangan kunci-nilai ke dalam kontainer. |
| virtual [ContainsKey](./containskey/)(const TKey\&) const | Memeriksa apakah kontainer berisi kunci. |
| [CopyTo](./copyto/)(ArrayPtr\<KeyValuePair\<TKey, TValue\>\>, int) override | Menyalin isi kamus ke dalam elemen array yang ada. |
| virtual [get_Count](./get_count/)() const | Menampilkan fungsi anggota get_Count. |
| [get_IsFixedSize](./get_isfixedsize/)() const | Memeriksa apakah ukuran koleksi tetap. |
| [get_IsSynchronized](./get_issynchronized/)() const | Memeriksa apakah kontainer aman terhadap thread. |
| virtual [get_Keys](./get_keys/)() const | Mengakses koleksi kunci. |
| virtual [get_Values](./get_values/)() const | Mengakses koleksi nilai. |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&) const | Mengembalikan nilai jika ditemukan; atau **Value()** sebaliknya. |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&, const TValue\&) const | Mengembalikan nilai jika ditemukan; atau **defaultValue** jika tidak. |
| virtual [GetValueOrNull](./getvalueornull/)(const TKey\&) const | Mengembalikan nilai jika ditemukan; atau **null** jika tidak, masuk akal hanya untuk tipe referensi. |
| virtual [idx_get](./idx_get/)(const TKey\&) const | Fungsi getter. |
| virtual [idx_set](./idx_set/)(const TKey\&, TValue) | Fungsi setter. |
| virtual [Remove](./remove/)(const TKey\&) | Menghapus kunci dari kontainer. |
| virtual [TryGetValue](./trygetvalue/)(const TKey\&, TValue\&) const | Mencari nilai dan mengambilnya jika ditemukan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [BaseType](./basetype/) | Informasi RTTI. |
| [KeyValuePairType](./keyvaluepairtype/) | Tipe pasangan kunci-nilai. |

## Lihat Juga

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
