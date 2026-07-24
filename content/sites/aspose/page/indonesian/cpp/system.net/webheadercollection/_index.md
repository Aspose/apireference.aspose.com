---
title: "Kelas System::Net::WebHeaderCollection"
linktitle: "WebHeaderCollection"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Net::WebHeaderCollection. Mewakili koleksi header protokol. Objek dari kelas ini hanya boleh dialokasikan menggunakan System::MakeObject() function. Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 3600
url: /id/cpp/system.net/webheadercollection/
---
## WebHeaderCollection class


Mewakili koleksi header protokol. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class WebHeaderCollection : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(String, String) | Menambahkan pasangan nama header dan nilai header yang ditentukan ke dalam koleksi. |
| [Add](./add/)(HttpResponseHeader, String) | Menambahkan pasangan header dan nilai header yang ditentukan ke dalam koleksi. |
| [Add](./add/)(HttpRequestHeader, String) | Menambahkan pasangan header dan nilai header yang ditentukan ke dalam koleksi. |
| [AllKeys](./allkeys/)() | Mengembalikan koleksi nama header yang disimpan dalam koleksi. |
| [get_Count](./get_count/)() const | Mengembalikan jumlah elemen dalam koleksi. |
| [get_Keys](./get_keys/)() | Mengembalikan koleksi nama header yang disimpan dalam koleksi. |
| [GetKey](./getkey/)(int) | Mengembalikan kunci pada indeks yang ditentukan. |
| [GetValues](./getvalues/)(String) | Mengembalikan koleksi nilai header. |
| [idx_get](./idx_get/)(HttpRequestHeader) | Mendapatkan nilai header menggunakan header permintaan yang ditentukan. |
| [idx_get](./idx_get/)(HttpResponseHeader) | Mendapatkan nilai header menggunakan header respons yang ditentukan. |
| [idx_get](./idx_get/)(String) | Mendapatkan nilai header menggunakan nama header yang ditentukan. |
| [idx_set](./idx_set/)(HttpRequestHeader, String) | Mengatur nilai header dari header yang ditentukan. |
| [idx_set](./idx_set/)(HttpResponseHeader, String) | Mengatur nilai header menggunakan header respons yang ditentukan. |
| [idx_set](./idx_set/)(String, String) | Mengatur nilai header menggunakan nama header yang ditentukan. |
| static [IsRestricted](./isrestricted/)(const String\&) | Menguji apakah header HTTP yang ditentukan dapat diatur untuk permintaan. |
| [Remove](./remove/)(String) | Menghapus header berdasarkan nama header yang ditentukan. |
| [Remove](./remove/)(HttpResponseHeader) | Menghapus header respons yang ditentukan. |
| [Remove](./remove/)(HttpRequestHeader) | Menghapus header permintaan yang ditentukan. |
| [Set](./set/)(String, String) | Mengatur nilai header yang ditentukan. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
| [WebHeaderCollection](./webheadercollection/)() | Membuat instance baru. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
