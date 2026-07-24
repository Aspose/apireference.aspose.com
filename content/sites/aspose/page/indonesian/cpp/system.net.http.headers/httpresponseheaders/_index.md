---
title: "System::Net::Http::Headers::HttpResponseHeaders kelas"
linktitle: "HttpResponseHeaders"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::Headers::HttpResponseHeaders kelas. Mewakili kumpulan header ''Response''. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1100
url: /id/cpp/system.net.http.headers/httpresponseheaders/
---
## HttpResponseHeaders class


Mewakili kumpulan header 'Response'. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class HttpResponseHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | Menggabungkan instance HttpHeaders-class yang ditentukan dengan yang saat ini. |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Menambahkan header yang dikenal ke koleksi yang ditentukan. |
| [get_AcceptRanges](./get_acceptranges/)() | Informasi RTTI. |
| [get_Age](./get_age/)() | Mendapatkan nilai header 'Age'. |
| [get_CacheControl](./get_cachecontrol/)() | Mendapatkan nilai header 'Cache-Control'. |
| [get_Connection](./get_connection/)() | Mengembalikan nilai header 'Connection'. |
| [get_ConnectionClose](./get_connectionclose/)() | Mendapatkan nilai yang menunjukkan apakah nilai header 'Connection' berisi 'Close'. |
| [get_Date](./get_date/)() | Mendapatkan nilai header 'Date'. |
| [get_ETag](./get_etag/)() | Mendapatkan nilai dari header 'ETag'. |
| [get_Location](./get_location/)() | Mendapatkan nilai header 'Location'. |
| [get_Pragma](./get_pragma/)() | Mengembalikan nilai header 'Pragma'. |
| [get_ProxyAuthenticate](./get_proxyauthenticate/)() | Mengembalikan nilai header 'Proxy-Authenticate'. |
| [get_RetryAfter](./get_retryafter/)() | Mendapatkan nilai header 'Retry-After'. |
| [get_Server](./get_server/)() | Mengembalikan nilai header 'Server'. |
| [get_Trailer](./get_trailer/)() | Mengembalikan nilai header 'Trailer'. |
| [get_TransferEncoding](./get_transferencoding/)() | Mengembalikan nilai dari header 'Transfer-Encoding'. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | Mendapatkan nilai yang menunjukkan apakah nilai header 'Transfer-Encoding' berisi 'Chunked'. |
| [get_Upgrade](./get_upgrade/)() | Mengembalikan nilai dari header 'Upgrade'. |
| [get_Vary](./get_vary/)() | Mengembalikan nilai header 'Vary'. |
| [get_Via](./get_via/)() | Mengembalikan nilai dari header 'Via'. |
| [get_Warning](./get_warning/)() | Mengembalikan nilai dari header 'Warning'. |
| [get_WwwAuthenticate](./get_wwwauthenticate/)() | Mengembalikan nilai header 'WWW-Authenticate'. |
| [HttpResponseHeaders](./httpresponseheaders/)() | Membuat instance baru. |
| [set_Age](./set_age/)(Nullable\<TimeSpan\>) | Mengatur nilai header 'Age'. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | Mengatur nilai dari header 'Cache-Control'. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | Mengatur nilai yang menunjukkan apakah nilai header 'Connection' berisi 'Close'. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | Mengatur nilai dari header 'Date'. |
| [set_ETag](./set_etag/)(System::SharedPtr\<EntityTagHeaderValue\>) | Mengatur nilai header 'ETag'. |
| [set_Location](./set_location/)(System::SharedPtr\<Uri\>) | Mengatur nilai header 'Location'. |
| [set_RetryAfter](./set_retryafter/)(System::SharedPtr\<RetryConditionHeaderValue\>) | Mengatur nilai header 'Retry-After'. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | Mengatur nilai yang menunjukkan apakah nilai header 'Transfer-Encoding' berisi 'Chunked'. |
## Lihat Juga

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
