---
title: "kelas System::Collections::Generic::SortedSet"
linktitle: "SortedSet"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Collections::Generic::SortedSet. Deklarasi maju kelas SortedSet dalam C++."
type: docs
weight: 4400
url: /id/cpp/system.collections.generic/sortedset/
---
## SortedSet class


Deklarasi maju kelas [SortedSet](./).

```cpp
template<typename T>class SortedSet : public System::Collections::Generic::BaseSet<T, std::set<T, ComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Max](./get_max/)() const | Mendapatkan nilai maksimum dalam [SortedSet](./). |
| [SortedSet](./sortedset/)() | Informasi RTTI. |
| [SortedSet](./sortedset/)(int) | Membuat himpunan kosong dengan kapasitas yang ditentukan. |
| [SortedSet](./sortedset/)(const SharedPtr\<IComparer\<T\>\>\&) | Membuat himpunan kosong yang menggunakan pembanding kesetaraan yang ditentukan. |
| [SortedSet](./sortedset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Membuat [SortedSet](./) berdasarkan nilai yang dapat diiterasi. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [BaseType](./basetype/) | Tipe vas. |
| [ThisPtr](./thisptr/) | Tipe pointer. |
| [ThisType](./thistype/) | Tipe diri. |
## Catatan


Implementasi sekumpulan objek terurut. Objek-objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
