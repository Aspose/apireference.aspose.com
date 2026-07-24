---
title: "kelas System::Net::Cache::HttpRequestCachePolicy"
linktitle: "HttpRequestCachePolicy"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Net::Cache::HttpRequestCachePolicy. Kebijakan cache HTTP yang menggambarkan semantik caching HTTP RFC2616. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 100
url: /id/cpp/system.net.cache/httprequestcachepolicy/
---
## HttpRequestCachePolicy class


Kebijakan cache HTTP yang menggambarkan semantik caching HTTP RFC2616. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class HttpRequestCachePolicy : public System::Net::Cache::RequestCachePolicy
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_CacheSyncDate](./get_cachesyncdate/)() const | Mendapatkan waktu ketika sumber daya yang disimpan di cache harus divalidasi ulang. |
| [get_InternalCacheSyncDateUtc](./get_internalcachesyncdateutc/)() const | Mendapatkan waktu dalam format UTC ketika sumber daya yang disimpan di cache harus divalidasi ulang. Hanya untuk penggunaan internal. |
| [get_Level](./get_level/)() const | Informasi RTTI. |
| [get_MaxAge](./get_maxage/)() const | Mendapatkan umur maksimum yang diizinkan untuk sebuah sumber daya. |
| [get_MaxStale](./get_maxstale/)() const | Mendapatkan nilai kedaluwarsa maksimum yang diizinkan untuk sebuah sumber daya. |
| [get_MinFresh](./get_minfresh/)() const | Mendapatkan umur minimum yang diizinkan untuk sebuah sumber daya. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)() | Membuat instance baru. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpRequestCacheLevel) | Membuat instance baru. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan) | Membuat instance baru. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan) | Membuat instance baru. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(DateTime) | Membuat instance baru. |
| [HttpRequestCachePolicy](./httprequestcachepolicy/)(HttpCacheAgeControl, TimeSpan, TimeSpan, DateTime) | Membuat instance baru. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
## Lihat Juga

* Class [RequestCachePolicy](../requestcachepolicy/)
* Namespace [System::Net::Cache](../)
* Library [Aspose.Page for C++](../../)
