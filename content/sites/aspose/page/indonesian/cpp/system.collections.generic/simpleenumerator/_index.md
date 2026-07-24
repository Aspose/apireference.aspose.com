---
title: "System::Collections::Generic::SimpleEnumerator kelas"
linktitle: "SimpleEnumerator"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::SimpleEnumerator class. Kelas iterator untuk kontainer sederhana yang menyimpan elemen secara langsung menggunakan fungsi rbegin() dan rend(). Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 3900
url: /id/cpp/system.collections.generic/simpleenumerator/
---
## SimpleEnumerator class


Kelas iterator untuk kontainer sederhana yang menyimpan elemen secara langsung menggunakan fungsi rbegin() dan rend(). Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
template<typename Container,typename Element>class SimpleEnumerator : public System::Collections::Generic::BaseEnumerator<Container, typename Container::value_type>
```


| Parameter | Deskripsi |
| --- | --- |
| Kontainer | Tipe kontainer untuk diiterasi. |
| Element | Tipe elemen. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Mengkloning iterator saat ini. |
| [get_Current](./get_current/)() const override | Mendapatkan elemen 'current'. |
| [SimpleEnumerator](./simpleenumerator/)(Object::ptr, Container\&) | Membuat iterator sederhana. |

## Lihat Juga

* Class [BaseEnumerator](../baseenumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
