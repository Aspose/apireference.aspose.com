---
title: "Kelas System::Collections::Generic::ISet"
linktitle: "ISet"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Collections::Generic::ISet. Antarmuka koleksi yang berisi sekumpulan elemen unik. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2700
url: /id/cpp/system.collections.generic/iset/
---
## ISet class


Antarmuka koleksi yang berisi sekumpulan elemen unik. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
template<typename T>class ISet : public System::Collections::Generic::ICollection<T>
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [ExceptWith](./exceptwith/)(IEnumerablePtr) | Menghapus grup elemen. |
| virtual [IntersectWith](./intersectwith/)(IEnumerablePtr) | Menghapus elemen yang tidak ada di kontainer lain. |
| virtual [IsProperSubsetOf](./ispropersubsetof/)(IEnumerablePtr) | Memeriksa apakah set saat ini merupakan subset ketat dari kontainer lain. |
| virtual [IsProperSupersetOf](./ispropersupersetof/)(IEnumerablePtr) | Memeriksa apakah set saat ini merupakan superset ketat dari kontainer lain. |
| virtual [IsSubsetOf](./issubsetof/)(IEnumerablePtr) | Memeriksa apakah set saat ini merupakan subset dari kontainer lain. |
| virtual [IsSupersetOf](./issupersetof/)(IEnumerablePtr) | Memeriksa apakah set saat ini merupakan superset dari kontainer lain. |
| virtual [Overlaps](./overlaps/)(IEnumerablePtr) | Memeriksa apakah set tumpang tindih dengan kontainer lain. |
| virtual [SetEquals](./setequals/)(IEnumerablePtr) | Memeriksa apakah set dan kontainer berisi elemen yang sama. |
| virtual [SymmetricExceptWith](./symmetricexceptwith/)(IEnumerablePtr) | Menghitung pengecualian simetris dari dua kontainer. Menghapus semua elemen yang ada di kedua kontainer, tetapi pada saat yang sama menambahkan semua elemen yang ada di **other**, tetapi tidak ada di set saat ini. |
| virtual [UnionWith](./unionwith/)(IEnumerablePtr) | Menambahkan elemen dari koleksi yang ditentukan yang belum ada di set saat ini. |
| virtual [~ISet](./~iset/)() | Destruktor. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | Informasi RTTI. |

## Lihat Juga

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
