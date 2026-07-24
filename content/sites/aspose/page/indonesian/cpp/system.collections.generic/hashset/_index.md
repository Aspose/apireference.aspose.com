---
title: "System::Collections::Generic::HashSet kelas"
linktitle: "HashSet"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::HashSet kelas. Deklarasi maju kelas HashSet dalam C++."
type: docs
weight: 1700
url: /id/cpp/system.collections.generic/hashset/
---
## HashSet class


Deklarasi maju dari kelas [HashSet](./).

```cpp
template<typename T>class HashSet : public System::Collections::Generic::BaseSet<T, std::unordered_set<T, EqualityComparerHashAdapter<T>, EqualityComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [HashSet](./hashset/)() | Informasi RTTI. |
| [HashSet](./hashset/)(int) | Membuat himpunan kosong dengan kapasitas yang ditentukan. |
| [HashSet](./hashset/)(const SharedPtr\<IEqualityComparer\<T\>\>\&) | Membuat himpunan kosong yang menggunakan pembanding kesetaraan yang ditentukan. |
| [HashSet](./hashset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | Membuat hashset berdasarkan nilai yang dapat diiterasi. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [BaseType](./basetype/) | Tipe dasar. |
| [ThisPtr](./thisptr/) | Tipe pointer. |
| [ThisType](./thistype/) | Tipe diri. |
## Catatan


Implementasi set berbasis hashing. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
