---
title: "System::Collections::Generic::BaseEnumerator kelas"
linktitle: "BaseEnumerator"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::BaseEnumerator kelas. Definisi Enumerator untuk membungkus tipe bergaya STL untuk penggunaan bergaya C#. Tidak membuat asumsi apa pun pada struktur kontainer kecuali keberadaan iterator berurutan. Menggunakan fungsi begin() dan end(). Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 600
url: /id/cpp/system.collections.generic/baseenumerator/
---
## BaseEnumerator class


[Enumerator](../baseset/) definition to wrap STL-styled types for C#-styled usage. Makes no assertions on container structure except for existance of sequental iterator. Uses begin() and end() functions. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class BaseEnumerator : public System::Collections::Generic::IEnumerator<Element>
```


| Parameter | Deskripsi |
| --- | --- |
| Kontainer | Tipe kontainer bergaya STL. |
| Element | Tipe elemen. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [BaseEnumerator](./baseenumerator/)(const Object::ptr\&, Container\&) | Menginisialisasi iterator. |
| [IsValid](./isvalid/)() const | Memeriksa apakah [MoveNext()](./movenext/) telah dipanggil dan akhir belum tercapai. |
| [MoveNext](./movenext/)() override | Inkrement gaya Enumerator. |
| [Reset](./reset/)() override | Mengatur ulang enumerator untuk memungkinkan enumerasi ulang elemen. |

## Lihat Juga

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
