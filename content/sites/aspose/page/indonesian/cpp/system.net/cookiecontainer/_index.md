---
title: "Kelas System::Net::CookieContainer"
linktitle: "CookieContainer"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Net::CookieContainer. Menyediakan wadah untuk instance kelas CookieCollection. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 400
url: /id/cpp/system.net/cookiecontainer/
---
## CookieContainer class


Menyediakan wadah untuk instance kelas CookieCollection. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class CookieContainer : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Cookie\>) | Menambahkan cookie ke koleksi. |
| [Add](./add/)(System::SharedPtr\<Cookie\>, bool) | Menambahkan cookie ke koleksi. |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | Menyalin cookie dari koleksi yang ditentukan ke koleksi saat ini. |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<Cookie\>) | Menambahkan cookie untuk URI yang ditentukan. |
| [Add](./add/)(System::SharedPtr\<Uri\>, System::SharedPtr\<CookieCollection\>) | Menyalin cookie dari koleksi yang ditentukan untuk URI yang ditentukan ke koleksi saat ini. |
| [CookieContainer](./cookiecontainer/)() | Membuat instance baru. |
| [CookieContainer](./cookiecontainer/)(int32_t) | Membuat instance baru. |
| [CookieContainer](./cookiecontainer/)(int32_t, int32_t, int32_t) | Membuat instance baru. |
| [CookieCutter](./cookiecutter/)(System::SharedPtr\<Uri\>, String, String, bool) | Menyalin cookie dari header HTTP yang ditentukan untuk URI yang ditentukan. |
| [get_Capacity](./get_capacity/)() | Mengambil kapasitas koleksi. |
| [get_Count](./get_count/)() | Mengembalikan jumlah item dalam koleksi. |
| [get_MaxCookieSize](./get_maxcookiesize/)() | Mengambil ukuran maksimum cookie. |
| [get_PerDomainCapacity](./get_perdomaincapacity/)() | Mengambil kapasitas koleksi per domain. |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>) | Mengembalikan header HTTP yang berisi cookie yang terkait dengan URI yang ditentukan. |
| [GetCookieHeader](./getcookieheader/)(System::SharedPtr\<Uri\>, String\&) | Mengembalikan header HTTP yang berisi cookie yang terkait dengan URI yang ditentukan. |
| [GetCookies](./getcookies/)(System::SharedPtr\<Uri\>) | Mengembalikan koleksi cookie yang terkait dengan URI yang ditentukan. |
| [InternalGetCookies](./internalgetcookies/)(System::SharedPtr\<Uri\>) | Mengembalikan koleksi cookie yang terkait dengan URI yang ditentukan. |
| [IsLocalDomain](./islocaldomain/)(String) | Memeriksa apakah domain yang ditentukan adalah localhost. |
| [set_Capacity](./set_capacity/)(int32_t) | Mengatur kapasitas koleksi. |
| [set_MaxCookieSize](./set_maxcookiesize/)(int32_t) | Mengatur ukuran maksimum cookie. |
| [set_PerDomainCapacity](./set_perdomaincapacity/)(int32_t) | Mengatur kapasitas koleksi per domain. |
| [SetCookies](./setcookies/)(System::SharedPtr\<Uri\>, String) | Menyalin cookie dari header yang ditentukan ke koleksi dan mengaitkannya dengan URI yang ditentukan. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [DefaultCookieLengthLimit](./defaultcookielengthlimit/) | Ukuran maksimum cookie. |
| static [DefaultCookieLimit](./defaultcookielimit/) | Informasi RTTI. |
| static [DefaultPerDomainCookieLimit](./defaultperdomaincookielimit/) | Jumlah maksimum item koleksi per domain. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
