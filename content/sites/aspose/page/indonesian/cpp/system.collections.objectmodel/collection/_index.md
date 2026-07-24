---
title: "System::Collections::ObjectModel::Collection class"
linktitle: "Koleksi"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::ObjectModel::Collection class. Tipe dasar untuk koleksi generik. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 100
url: /id/cpp/system.collections.objectmodel/collection/
---
## Collection class


Tipe dasar untuk koleksi generik. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
template<class T>class Collection : public System::Collections::Generic::IList<T>
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen. |
## Nested classes

* Class [reverse_iterator_prototype](./reverse_iterator_prototype/)
## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const T\&) override | Menambahkan nilai ke kontainer. |
| [Clear](./clear/)() override | Menghapus semua elemen. |
| [Collection](./collection/)() | Membuat koleksi kosong. |
| [Collection](./collection/)(SharedPtr\<Generic::IList\<T\>\>) |  |
| [Contains](./contains/)(const T\&) const override | Memeriksa apakah item ada dalam koleksi. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Menyalin elemen koleksi ke dalam elemen array yang sudah ada. |
| [crbegin](./crbegin/)() const | Mendapatkan iterator terbalik ke elemen terakhir yang bersifat const dalam koleksi (pertama dalam urutan terbalik). |
| [crend](./crend/)() const | Mendapatkan iterator terbalik untuk elemen const yang tidak ada sebelum awal koleksi. |
| [get_Count](./get_count/)() const override | Mendapatkan jumlah elemen. |
| [get_Items](./get_items/)() | Aksesor struktur data internal. |
| [get_Items](./get_items/)() const | Aksesor struktur data internal. |
| [GetEnumerator](./getenumerator/)() override | Mendapatkan enumerator untuk mengiterasi koleksi. |
| [idx_get](./idx_get/)(int) const override | Mendapatkan nilai pada indeks yang ditentukan. |
| [idx_set](./idx_set/)(int, T) override | Mengatur nilai pada indeks yang ditentukan. |
| [IndexOf](./indexof/)(const T\&) const override | Mencari elemen dalam koleksi. |
| [Insert](./insert/)(int, const T\&) override | Menyisipkan item ke posisi yang ditentukan. |
| [operator[]](./operator[]/)(int) | Mendapatkan nilai pada indeks yang ditentukan. |
| [operator[]](./operator[]/)(int) const | Mendapatkan nilai pada indeks yang ditentukan. |
| [rbegin](./rbegin/)() | Mendapatkan iterator terbalik ke elemen terakhir koleksi (pertama dalam urutan terbalik). |
| [rbegin](./rbegin/)() const | Mendapatkan iterator terbalik ke elemen terakhir koleksi yang const-qualified (pertama dalam urutan terbalik). |
| [Remove](./remove/)(const T\&) override | Menghapus item tertentu. |
| [RemoveAt](./removeat/)(int) override | Menghapus item pada posisi tertentu. |
| [rend](./rend/)() | Mendapatkan iterator terbalik untuk elemen yang tidak ada sebelum awal koleksi. |
| [rend](./rend/)() const | Mendapatkan iterator terbalik untuk elemen yang tidak ada sebelum awal koleksi yang const-qualified. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Membuat pointer yang disimpan menjadi lemah (jika berlaku). |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mendapatkan implementasi begin const iterator untuk kontainer saat ini. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mendapatkan implementasi begin iterator untuk kontainer saat ini. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mendapatkan implementasi end const iterator untuk kontainer saat ini. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mendapatkan implementasi end iterator untuk kontainer saat ini. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [const_reverse_iterator](./const_reverse_iterator/) |  |
| [reverse_iterator](./reverse_iterator/) |  |

## Lihat Juga

* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)
