---
title: "kelas System::Collections::Generic::List"
linktitle: "Daftar"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Collections::Generic::List. Deklarasi maju List dalam C++."
type: docs
weight: 3300
url: /id/cpp/system.collections.generic/list/
---
## List class


[List](./) forward declaration.

```cpp
template<typename T>class List : public virtual System::Object,
                                 public System::Collections::Generic::IList<T>
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Metode

| Metode | Deskripsi |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | Spesifik C++. |
| [Add](./add/)(const T\&) override | Menambahkan elemen ke akhir daftar. |
| [AddInitializer](./addinitializer/)(int, const T *) | Menambahkan elemen ke list; digunakan saat menerjemahkan inisialisator. |
| [AddRange](./addrange/)(IEnumerablePtr) | Menambahkan semua elemen dari koleksi (atau dirinya sendiri) ke akhir list saat ini. |
| [AsReadOnly](./asreadonly/)() | Mendapatkan referensi hanya-baca ke koleksi ini. |
| [begin](./begin/)() | Mendapatkan iterator ke elemen pertama dari koleksi. |
| [begin](./begin/)() const | Mendapatkan iterator ke elemen pertama dari koleksi yang berqualifikasi const. |
| [BinarySearch](./binarysearch/)(const T\&) const | Mencari item dalam daftar yang terurut. |
| [BinarySearch](./binarysearch/)(const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | Mencari item dalam daftar yang terurut. |
| [BinarySearch](./binarysearch/)(int, int, const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | Mencari item dalam daftar yang terurut. |
| [cbegin](./cbegin/)() const | Mendapatkan iterator ke elemen pertama yang bersifat const dalam koleksi. |
| [cend](./cend/)() const | Mendapatkan iterator untuk elemen const yang tidak ada di belakang akhir koleksi. |
| [Clear](./clear/)() override | Menghapus semua elemen. |
| [Contains](./contains/)(const T\&) const override | Memeriksa apakah item ada dalam daftar. |
| [ConvertAll](./convertall/)(Converter\<T, OutputType\>) | Membuat daftar elemen yang dikonversi ke tipe yang berbeda. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | Menyalin elemen daftar ke dalam elemen array yang ada. |
| [CopyTo](./copyto/)(const System::ArrayPtr\<T\>\&) | Menyalin semua elemen ke dalam elemen array yang ada. |
| [CopyTo](./copyto/)(int, const System::ArrayPtr\<T\>\&, int, int) | Menyalin elemen mulai dari indeks yang ditentukan ke dalam elemen array yang ada. |
| [crbegin](./crbegin/)() const | Mendapatkan iterator terbalik ke elemen terakhir yang bersifat const dalam koleksi (pertama dalam urutan terbalik). |
| [crend](./crend/)() const | Mendapatkan iterator terbalik untuk elemen const yang tidak ada sebelum awal koleksi. |
| [data](./data/)() | Fungsi akses struktur data dasar. |
| [data](./data/)() const | Fungsi akses struktur data dasar. |
| [end](./end/)() | Mendapatkan iterator untuk elemen yang tidak ada di belakang akhir koleksi. |
| [end](./end/)() const | Mendapatkan iterator untuk elemen yang tidak ada di belakang akhir koleksi yang bersifat const. |
| [Exists](./exists/)(System::Predicate\<T\>) | Memeriksa apakah elemen yang memenuhi predikat tertentu ada dalam daftar. |
| [Find](./find/)(System::Predicate\<T\>) | Mencari elemen yang memenuhi predikat tertentu. |
| [FindAll](./findall/)(System::Predicate\<T\>) | Mencari elemen-elemen yang memenuhi predikat tertentu. |
| [FindIndex](./findindex/)(System::Predicate\<T\>) | Mencari elemen yang memenuhi predikat tertentu. |
| [FindIndex](./findindex/)(int, System::Predicate\<T\>) | Mencari elemen yang memenuhi predikat tertentu. |
| [FindIndex](./findindex/)(int, int, System::Predicate\<T\>) | Mencari elemen yang memenuhi predikat tertentu. |
| [FindLast](./findlast/)(System::Predicate\<T\>) | Mencari elemen terakhir yang memenuhi predikat tertentu. |
| [ForEach](./foreach/)(System::Action\<T\>) | Menerapkan aksi ke semua elemen dalam daftar. |
| [get_Capacity](./get_capacity/)() const | Mendapatkan kapasitas daftar saat ini. |
| [get_Count](./get_count/)() const override | Mendapatkan jumlah elemen dalam daftar saat ini. |
| [GetEnumerator](./getenumerator/)() override | Mendapatkan enumerator untuk mengiterasi elemen daftar. |
| [GetRange](./getrange/)(int, int) | Membuat irisan daftar. |
| [idx_get](./idx_get/)(int) const override | Mendapatkan elemen pada posisi tertentu. |
| [idx_set](./idx_set/)(int, T) override | Menetapkan elemen pada posisi tertentu. |
| [IndexOf](./indexof/)(const T\&) const override | Mendapatkan indeks pertama dari item tertentu. |
| [IndexOf](./indexof/)(const T\&, int) const | Mencari item tertentu dalam daftar. |
| [Insert](./insert/)(int, const T\&) override | Menyisipkan item pada posisi yang ditentukan. |
| [InsertRange](./insertrange/)(int, IEnumerablePtr) | Menyisipkan rentang data pada posisi tertentu. |
| [LastIndexOf](./lastindexof/)(const T\&) const | Mencari objek yang ditentukan dan mengembalikan indeks berbasis nol dari kemunculan terakhir dalam seluruh daftar. |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t) const | Mencari objek yang ditentukan dan mengembalikan indeks berbasis nol dari kemunculan terakhir dalam rentang elemen di [List](./) yang memperluas dari elemen pertama hingga indeks yang ditentukan. |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t, int32_t) const | Mencari objek yang ditentukan dan mengembalikan indeks berbasis nol dari kemunculan terakhir dalam rentang elemen di [List](./) yang berisi jumlah elemen yang ditentukan dan berakhir pada indeks yang ditentukan. |
| [List](./list/)() | Membuat daftar kosong. |
| [List](./list/)(int) | Membuat daftar dengan kapasitas yang telah ditentukan sebelumnya. |
| [List](./list/)(IEnumerablePtr) | Konstruktor penyalinan. |
| [operator[]](./operator[]/)(int) | Fungsi accessor. |
| [operator[]](./operator[]/)(int) const | Fungsi accessor. |
| [rbegin](./rbegin/)() | Mendapatkan iterator terbalik ke elemen terakhir koleksi (pertama dalam urutan terbalik). |
| [rbegin](./rbegin/)() const | Mendapatkan iterator terbalik ke elemen terakhir koleksi yang const-qualified (pertama dalam urutan terbalik). |
| [Remove](./remove/)(const T\&) override | Menghapus instansi pertama item tertentu dari daftar. |
| [RemoveAll](./removeall/)(Predicate\<T\>) | Menghapus semua elemen yang cocok dengan predikat tertentu. |
| [RemoveAt](./removeat/)(int) override | Menghapus item pada posisi yang ditentukan. |
| [RemoveRange](./removerange/)(int, int) | Menghapus irisan daftar. |
| [rend](./rend/)() | Mendapatkan iterator terbalik untuk elemen yang tidak ada sebelum awal koleksi. |
| [rend](./rend/)() const | Mendapatkan iterator terbalik untuk elemen yang tidak ada sebelum awal koleksi yang const-qualified. |
| [Reverse](./reverse/)() | Membalik urutan elemen seluruh daftar. |
| [Reverse](./reverse/)(int, int) | Membalik urutan elemen irisan daftar. |
| [set_Capacity](./set_capacity/)(int) | Mengatur kapasitas daftar. |
| [Sort](./sort/)(const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | Mengurutkan elemen dalam daftar. |
| [Sort](./sort/)() | Mengurutkan elemen dalam daftar menggunakan pembanding default. |
| [Sort](./sort/)(int, int, SharedPtr\<System::Collections::Generic::IComparer\<T\>\>) | Mengurutkan elemen dalam irisan daftar. |
| [Sort](./sort/)(Comparison\<T\>, bool) | Mengurutkan elemen dalam daftar. |
| [ToArray](./toarray/)() const | Mengonversi daftar menjadi array. |
| [TrimExcess](./trimexcess/)() | Menyesuaikan kapasitas daftar agar sesuai dengan ukurannya. |
| [TrueForAll](./trueforall/)(System::Predicate\<T\>) | Menentukan apakah setiap elemen dalam koleksi cocok dengan kondisi yang didefinisikan oleh predikat yang ditentukan. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mendapatkan implementasi begin const iterator untuk kontainer saat ini. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mendapatkan implementasi begin iterator untuk kontainer saat ini. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mendapatkan implementasi end const iterator untuk kontainer saat ini. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mendapatkan implementasi end iterator untuk kontainer saat ini. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [BaseType](./basetype/) | Tipe antarmuka. |
| [const_iterator](./const_iterator/) | Tipe iterator konstan. |
| [const_reverse_iterator](./const_reverse_iterator/) | Tipe iterator terbalik konstan. |
| [IEnumerablePtr](./ienumerableptr/) | Kontainer yang menampung elemen dengan tipe yang sama yang kami pegang. |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) tipe. |
| [iterator](./iterator/) | Tipe iterator. |
| [reverse_iterator](./reverse_iterator/) | Tipe iterator terbalik. |
| [ValueType](./valuetype/) | Tipe ini. |
| [vector_t](./vector_t/) | Informasi RTTI. |
## Catatan


[List](./) - wrapper around std::vector to be used in translated code. Requires operator == to be impemented for element type. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Buat daftar pertama.
  auto list1 = MakeObject<List<int>>();

  // Isi daftar pertama.
  list1->Add(3);
  list1->Add(1);
  list1->Add(-5);
  list1->Add(8);

  // Urutkan daftar pertama.
  // Item daftar pertama akan menjadi: {-5, 1, 3, 8}
  list1->Sort();

  // Hapus item pada indeks 2.
  // Item daftar pertama akan menjadi: {-5, 1, 8}
  list1->RemoveAt(2);

  // Sisipkan item ke indeks 1.
  // Item daftar pertama akan menjadi: {-5, 15, 1, 8}
  list1->Insert(1, 15);

  // Buat daftar kedua.
  auto list2 = MakeObject<List<int>>();

  // Isi daftar kedua.
  list2->Add(10);
  list2->Add(20);
  list2->Add(30);

  // Tambahkan elemen dari daftar kedua ke daftar pertama.
  list1->AddRange(list2);

  // Cetak item daftar pertama.
  for (const auto item: list1)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
-5 15 1 8 10 20 30
*/
```

## Lihat Juga

* Class [Object](../../system/object/)
* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
