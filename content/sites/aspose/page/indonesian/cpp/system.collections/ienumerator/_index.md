---
title: "System::Collections::IEnumerator kelas"
linktitle: "IEnumerator"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::IEnumerator kelas. Antarmuka enumerator yang dapat digunakan untuk mengiterasi beberapa elemen. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 600
url: /id/cpp/system.collections/ienumerator/
---
## IEnumerator class


Antarmuka enumerator yang dapat digunakan untuk mengiterasi beberapa elemen. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class IEnumerator : public virtual System::IDisposable,
                    public virtual System::Object
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Current](./current/)() const | Mendapatkan elemen saat ini. |
| virtual [get_Current](./get_current/)() const | Mendapatkan elemen saat ini. |
| virtual [MoveNext](./movenext/)() | Memindahkan enumerator ke elemen berikutnya. Jika tidak ada elemen yang direferensikan sebelumnya, mengatur referensi ke elemen pertama yang tersedia. Jika akhir kontainer tercapai, tidak melakukan apa‑apa. |
| virtual [Reset](./reset/)() | Mengatur ulang enumerator ke posisi sebelum elemen pertama. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [ValueType](./valuetype/) | Informasi RTTI. |

## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Class [Object](../../system/object/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
