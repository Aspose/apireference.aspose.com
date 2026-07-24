---
title: "System::Collections::Generic::LinkedList kelas"
linktitle: "LinkedList"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::LinkedList kelas. Deklarasi maju LinkedList dalam C++."
type: docs
weight: 3100
url: /id/cpp/system.collections.generic/linkedlist/
---
## LinkedList class


[LinkedList](./) forward declaration.

```cpp
template<typename T>class LinkedList : public virtual System::Object,
                                       public System::Collections::Generic::ICollection<T>,
                                       private System::Collections::Invalidatable
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe nilai yang terkandung. |
## Nested classes

* Class [Enumerator](./enumerator/)
## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const T\&) override | Menambahkan **element** ke akhir daftar. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | Menambahkan **element** setelah **node** dalam daftar. |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | Menambahkan **newNode** setelah **node** dalam daftar. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | Menambahkan **element** sebelum **node** dalam daftar. |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | Menambahkan **newNode** sebelum **node** dalam daftar. |
| [AddFirst](./addfirst/)(const T\&) | Menambahkan **element** ke awal daftar. |
| [AddFirst](./addfirst/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Menambahkan **newNode** ke awal daftar. |
| [AddLast](./addlast/)(const T\&) | Menambahkan **element** ke akhir daftar. |
| [AddLast](./addlast/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Menambahkan **newNode** ke akhir daftar. |
| [begin](./begin/)() | Mendapatkan iterator ke elemen pertama dari koleksi. |
| [begin](./begin/)() const | Mendapatkan iterator ke elemen pertama dari koleksi yang berqualifikasi const. |
| [cbegin](./cbegin/)() const | Mendapatkan iterator ke elemen pertama yang bersifat const dalam koleksi. |
| [cend](./cend/)() const | Mendapatkan iterator untuk elemen const yang tidak ada di belakang akhir koleksi. |
| [Clear](./clear/)() override | Menghapus semua elemen dalam daftar. |
| [Contains](./contains/)(const T\&) const override | Memeriksa apakah **element** ada dalam daftar. |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | Menyalin data kontainer ke dalam elemen array yang ada. |
| [crbegin](./crbegin/)() const | Mendapatkan iterator terbalik ke elemen terakhir yang bersifat const dalam koleksi (pertama dalam urutan terbalik). |
| [crend](./crend/)() const | Mendapatkan iterator terbalik untuk elemen const yang tidak ada sebelum awal koleksi. |
| [end](./end/)() | Mendapatkan iterator untuk elemen yang tidak ada di belakang akhir koleksi. |
| [end](./end/)() const | Mendapatkan iterator untuk elemen yang tidak ada di belakang akhir koleksi yang bersifat const. |
| [Find](./find/)(const T\&) const | Melakukan pencarian arah maju untuk **element** dalam daftar. |
| [FindLast](./findlast/)(const T\&) const | Melakukan pencarian arah mundur untuk **element** dalam daftar. |
| [get_Count](./get_count/)() const override | Mendapatkan jumlah elemen dalam daftar. |
| [get_First](./get_first/)() const | Mendapatkan pointer ke elemen pertama dalam daftar. |
| [get_Last](./get_last/)() const | Mendapatkan pointer ke elemen terakhir dalam daftar. |
| [GetEnumerator](./getenumerator/)() override | Mendapatkan enumerator untuk mengiterasi [LinkedList](./) saat ini. |
| [LinkedList](./linkedlist/)() | Membuat [LinkedList](./) kosong. |
| [LinkedList](./linkedlist/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Konstruktor penyalinan. |
| [rbegin](./rbegin/)() | Mendapatkan iterator terbalik ke elemen terakhir koleksi (pertama dalam urutan terbalik). |
| [rbegin](./rbegin/)() const | Mendapatkan iterator terbalik ke elemen terakhir koleksi yang const-qualified (pertama dalam urutan terbalik). |
| [Remove](./remove/)(const T\&) override | Menghapus kemunculan pertama dari **element** yang ditentukan dari daftar. |
| [Remove](./remove/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | Menghapus node dari daftar. |
| [RemoveFirst](./removefirst/)() | Menghapus node pertama dari daftar. |
| [RemoveLast](./removelast/)() | Menghapus node terakhir dari daftar. |
| [rend](./rend/)() | Mendapatkan iterator terbalik untuk elemen yang tidak ada sebelum awal koleksi. |
| [rend](./rend/)() const | Mendapatkan iterator terbalik untuk elemen yang tidak ada sebelum awal koleksi yang const-qualified. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mendapatkan implementasi begin const iterator untuk kontainer saat ini. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mendapatkan implementasi begin iterator untuk kontainer saat ini. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mendapatkan implementasi end const iterator untuk kontainer saat ini. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mendapatkan implementasi end iterator untuk kontainer saat ini. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [const_iterator](./const_iterator/) | Tipe iterator konstan. |
| [const_reverse_iterator](./const_reverse_iterator/) | Tipe iterator terbalik konstan. |
| [iterator](./iterator/) | Tipe iterator. |
| [list_t](./list_t/) | Tipe data dasar. |
| [reverse_iterator](./reverse_iterator/) | Tipe iterator terbalik. |
## Catatan


Kontainer linked list. Mengimplementasikan pembungkus di atas std::list. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.


```cpp
#include <system/collections/linkedlist.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Buat sebuah instance dari kelas LinkedList.
  auto list = MakeObject<LinkedList<int>>();

  // Isi linked list.
  list->AddFirst(1);
  list->AddLast(30);
  list->AddAfter(list->get_First(), 15);
  list->AddBefore(list->get_Last(), 25);

  // Cetak item-item linked list.
  for (const auto item: list)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
1 15 25 30
*/
```

## Lihat Juga

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Class [Invalidatable](../../system.collections/invalidatable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
