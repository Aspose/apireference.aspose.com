---
title: "Kelas System::Collections::Generic::ReverseEnumerator"
linktitle: "ReverseEnumerator"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Collections::Generic::ReverseEnumerator. Enumerator yang melakukan iterasi terbalik melalui kontainer. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 3800
url: /id/cpp/system.collections.generic/reverseenumerator/
---
## ReverseEnumerator class


[Enumerator](../baseset/) that reverse-iterates through container. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<typename Container,typename Element>class ReverseEnumerator : public System::Collections::Generic::IEnumerator<typename Container::value_type>
```


| Parameter | Deskripsi |
| --- | --- |
| Kontainer | Kontainer untuk diiterasi. |
| Element | Tipe elemen. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_Current](./get_current/)() const override | Mendapatkan elemen 'current'. |
| [IsValid](./isvalid/)() const | Memeriksa apakah [MoveNext()](./movenext/) telah dipanggil dan akhir belum tercapai. |
| [MoveNext](./movenext/)() override | Inkrement gaya Enumerator. |
| [Reset](./reset/)() override | Mengatur ulang enumerator untuk memungkinkan enumerasi ulang elemen. |
| [ReverseEnumerator](./reverseenumerator/)(const Object::ptr\&, Container\&) | Menginisialisasi iterator. |
| virtual [~ReverseEnumerator](./~reverseenumerator/)() | Destruktor. |

## Lihat Juga

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
