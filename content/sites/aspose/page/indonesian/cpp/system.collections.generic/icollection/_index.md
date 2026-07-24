---
title: "System::Collections::Generic::ICollection class"
linktitle: "ICollection"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::ICollection class. Antarmuka koleksi elemen. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1900
url: /id/cpp/system.collections.generic/icollection/
---
## ICollection class


Antarmuka koleksi elemen. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
template<typename T>class ICollection : public virtual System::Collections::Generic::IEnumerable<T>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Add](./add/)(const T\&) | Menambahkan elemen ke dalam koleksi. |
| virtual [Clear](./clear/)() | Menghapus semua elemen dari koleksi. |
| virtual [Contains](./contains/)(const T\&) const | Memeriksa apakah elemen ada dalam koleksi. |
| virtual [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) | Menyalin semua elemen koleksi ke elemen array yang sudah ada. |
| virtual [get_Count](./get_count/)() const | Mendapatkan jumlah elemen dalam koleksi. |
| virtual [get_IsReadOnly](./get_isreadonly/)() const | Memeriksa apakah koleksi hanya-baca. |
| [get_SyncRoot](./get_syncroot/)() const | Mendapatkan objek yang digunakan untuk menyinkronkan koleksi. |
| [ICollection](./icollection/)() | Konstruktor default. |
| [ICollection](./icollection/)(const ICollection\&) | Konstruktor penyalinan. |
| [ICollection](./icollection/)(ICollection\&&) | Konstruktor pemindahan. |
| [operator=](./operator=/)(ICollection\&&) | Operator penugasan pindah. |
| [operator=](./operator=/)(const ICollection\&) | Operator penugasan pindah. |
| virtual [Remove](./remove/)(const T\&) | Menghapus elemen dari koleksi. |
| virtual [~ICollection](./~icollection/)() | Destruktor. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [ThisType](./thistype/) | Nama tipe koleksi. |
| [ValueType](./valuetype/) | Informasi RTTI. |

## Lihat Juga

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
