---
title: "Kelas System::Collections::Generic::IKVCollection"
linktitle: "IKVCollection"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Collections::Generic::IKVCollection. Antarmuka kontainer yang berisi kunci atau nilai dari kontainer mirip kamus. Objek-objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2500
url: /id/cpp/system.collections.generic/ikvcollection/
---
## IKVCollection class


Antarmuka kontainer yang berisi kunci atau nilai dari kontainer mirip kamus. Objek-objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
template<typename T>class IKVCollection : public System::Collections::Generic::IList<T>
```


| Parameter | Deskripsi |
| --- | --- |
| T | [KeyValuePair](../keyvaluepair/) tipe. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const T\&) override | Menambahkan item ke kontainer. |
| [Clear](./clear/)() override | Menghapus semua elemen dari kontainer. |
| [Contains](./contains/)(const T\&) const override | Memeriksa apakah item ada di dalam wadah. |
| virtual [get_Count](./get_count/)() const | Mendapatkan jumlah elemen dalam kontainer. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Memeriksa apakah kontainer bersifat hanya-baca. |
| virtual [GetEnumerator](./getenumerator/)() | Informasi RTTI. |
| virtual [idx_get](./idx_get/)(int) const | Fungsi getter. |
| [idx_set](./idx_set/)(int, T) override | Fungsi setter. |
| [IndexOf](./indexof/)(const T\&) const override | Mendapatkan indeks item dalam kontainer. |
| [Insert](./insert/)(int, const T\&) override | Menyisipkan item pada posisi yang ditentukan. |
| [Remove](./remove/)(const T\&) override | Menghapus item dari kontainer. |
| [RemoveAt](./removeat/)(int) override | Menghapus item pada posisi yang ditentukan. |

## Lihat Juga

* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
