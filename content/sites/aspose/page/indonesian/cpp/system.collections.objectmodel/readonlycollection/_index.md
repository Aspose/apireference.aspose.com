---
title: "System::Collections::ObjectModel::ReadOnlyCollection kelas"
linktitle: "ReadOnlyCollection"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::ObjectModel::ReadOnlyCollection kelas. Membungkus kontainer tertentu untuk mengaksesnya dalam mode hanya-baca. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 300
url: /id/cpp/system.collections.objectmodel/readonlycollection/
---
## ReadOnlyCollection class


Membungkus kontainer tertentu untuk mengaksesnya dalam mode hanya-baca. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
template<typename T>class ReadOnlyCollection : public virtual System::Object,
                                               public System::Collections::Generic::IList<T>
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [Contains](./contains/)(const T\&) const override | Memeriksa apakah kontainer berisi item tertentu. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | Menyalin elemen kontainer ke elemen array yang sudah ada. |
| [get_Count](./get_count/)() const override | Mendapatkan jumlah elemen kontainer. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Memeriksa apakah koleksi hanya-baca. |
| [GetEnumerator](./getenumerator/)() override | Mendapatkan enumerator koleksi. |
| [idx_get](./idx_get/)(int) const override | Mendapatkan item pada posisi tertentu. |
| [IndexOf](./indexof/)(const T\&) const override | Mencari item tertentu dalam koleksi. |
| [ReadOnlyCollection](./readonlycollection/)(const SharedPtr\<Generic::IList\<T\>\>\&) | Membungkus koleksi hanya-baca di sekitar koleksi tertentu. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Tidak melakukan apa-apa karena koleksi hanya-baca hanya membungkus data dan tidak menyimpan apa pun. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mendapatkan implementasi begin const iterator untuk kontainer saat ini. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mendapatkan implementasi begin iterator untuk kontainer saat ini. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mendapatkan implementasi end const iterator untuk kontainer saat ini. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mendapatkan implementasi end iterator untuk kontainer saat ini. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [BaseType](./basetype/) | Antarmuka yang diimplementasikan. |
| [IEnumeratorPtr](./ienumeratorptr/) | Kontainer dengan elemen yang sama. |
| [ValueType](./valuetype/) | Tipe nilai. |

## Lihat Juga

* Class [Object](../../system/object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
