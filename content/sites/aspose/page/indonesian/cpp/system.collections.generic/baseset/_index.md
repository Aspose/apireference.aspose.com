---
title: "System::Collections::Generic::BaseSet kelas"
linktitle: "BaseSet"
second_title: "Aspose.Page untuk C++"
description: "Cara menggunakan kelas System::Collections::Generic::BaseSet dalam C++."
type: docs
weight: 800
url: /id/cpp/system.collections.generic/baseset/
---
## BaseSet class




```cpp
template<typename T,typename SET_T>class BaseSet : public virtual System::Object,
                                                   public System::Collections::Generic::ICollection<T>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Metode

| Metode | Deskripsi |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | Spesifik C++. |
| [Add](./add/)(const T\&) override | Menambahkan elemen ke dalam himpunan. |
| [begin](./begin/)() const | Mendapatkan iterator ke elemen pertama dari koleksi yang berqualifikasi const. |
| [cbegin](./cbegin/)() const | Mendapatkan iterator ke elemen pertama yang bersifat const dalam koleksi. |
| [cend](./cend/)() const | Mendapatkan iterator untuk elemen const yang tidak ada di belakang akhir koleksi. |
| [Clear](./clear/)() override | Menghapus semua elemen dalam set. |
| [Contains](./contains/)(const T\&) const override | Memeriksa apakah elemen ada dalam set. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Menyalin isi hash ke elemen array yang ada. |
| [data](./data/)() | Pengakses struktur data dasar. |
| [data](./data/)() const | Pengakses struktur data dasar. |
| [end](./end/)() const | Mendapatkan iterator untuk elemen yang tidak ada di belakang akhir koleksi yang bersifat const. |
| [get_Count](./get_count/)() const override | Mendapatkan jumlah elemen dalam set. |
| [GetEnumerator](./getenumerator/)() override | Membuat enumerator. |
| [Remove](./remove/)(const T\&) override | Menghapus elemen dari set. |
| [TryAdd](./tryadd/)(const T\&) | Menambahkan elemen ke dalam himpunan. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mendapatkan implementasi begin const iterator untuk kontainer saat ini. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mendapatkan implementasi begin iterator untuk kontainer saat ini. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mendapatkan implementasi end const iterator untuk kontainer saat ini. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mendapatkan implementasi end iterator untuk kontainer saat ini. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [BaseType](./basetype/) | Antarmuka yang diimplementasikan. |
| [const_iterator](./const_iterator/) | Tipe iterator konstan. |
| [IEnumerablePtr](./ienumerableptr/) | Pointer antarmuka Enumerable. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) penunjuk. |
| [iterator](./iterator/) | Tipe iterator. |
| [set_t](./set_t/) | Tipe data dasar. |
| [ThisPtr](./thisptr/) | Tipe pointer. |
| [ThisType](./thistype/) | Tipe diri. |
| [ValueType](./valuetype/) | Tipe nilai. |
## Lihat Juga

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
