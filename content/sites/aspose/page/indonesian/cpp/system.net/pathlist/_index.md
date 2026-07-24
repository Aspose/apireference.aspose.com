---
title: "System::Net::PathList class"
linktitle: "PathList"
second_title: "Aspose.Page untuk C++"
description: "System::Net::PathList class. Mewakili daftar instance kelas CookieCollection. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 3000
url: /id/cpp/system.net/pathlist/
---
## PathList class


Mewakili daftar instance kelas [CookieCollection](../cookiecollection/). Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class PathList : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [Create](./create/)() | Membuat instance baru. |
| [get_Count](./get_count/)() const | Mengembalikan jumlah item. |
| [get_SyncRoot](./get_syncroot/)() const | Mengembalikan objek yang digunakan untuk menyinkronkan koleksi. |
| [GetCookiesCount](./getcookiescount/)() | Mengembalikan jumlah cookie dari semua item koleksi. |
| [GetEnumerator](./getenumerator/)() | Mengembalikan enumerator untuk koleksi saat ini. |
| [idx_get](./idx_get/)(String) | Mendapatkan koleksi cookie berdasarkan path yang ditentukan. |
| [idx_set](./idx_set/)(String, System::SharedPtr\<CookieCollection\>) | Mengatur koleksi cookie berdasarkan path yang ditentukan. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
