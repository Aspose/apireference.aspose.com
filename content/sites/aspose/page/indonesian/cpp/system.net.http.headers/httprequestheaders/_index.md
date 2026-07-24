---
title: "System::Net::Http::Headers::HttpRequestHeaders kelas"
linktitle: "HttpRequestHeaders"
second_title: "Aspose.Page untuk C++"
description: "System::Net::Http::Headers::HttpRequestHeaders kelas. Mewakili koleksi header ''Request''. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1000
url: /id/cpp/system.net.http.headers/httprequestheaders/
---
## HttpRequestHeaders class


Mewakili koleksi header 'Request'. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class HttpRequestHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | Menggabungkan instance HttpHeaders-class yang ditentukan dengan yang saat ini. |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Menambahkan header yang dikenal ke koleksi yang ditentukan. |
| [get_Accept](./get_accept/)() | Informasi RTTI. |
| [get_AcceptCharset](./get_acceptcharset/)() | Mengembalikan nilai header 'Accept-Charset'. |
| [get_AcceptEncoding](./get_acceptencoding/)() | Mengembalikan nilai header 'Accept-Encoding'. |
| [get_AcceptLanguage](./get_acceptlanguage/)() | Mengembalikan nilai header 'Accept-Language'. |
| [get_Authorization](./get_authorization/)() | Mendapatkan nilai header 'Authorization'. |
| [get_CacheControl](./get_cachecontrol/)() | Mendapatkan nilai header 'Cache-Control'. |
| [get_Connection](./get_connection/)() | Mengembalikan nilai header 'Connection'. |
| [get_ConnectionClose](./get_connectionclose/)() | Mendapatkan nilai yang menunjukkan apakah nilai header 'Connection' berisi 'Close'. |
| [get_Date](./get_date/)() | Mendapatkan nilai header 'Date'. |
| [get_Expect](./get_expect/)() | Mengembalikan nilai header 'Expect'. |
| [get_ExpectContinue](./get_expectcontinue/)() | Mendapatkan nilai yang menunjukkan apakah nilai header 'Expect' berisi 'Continue'. |
| [get_From](./get_from/)() | Mendapatkan nilai header 'From'. |
| [get_Host](./get_host/)() | Mendapatkan nilai header 'Host'. |
| [get_IfMatch](./get_ifmatch/)() | Mengembalikan nilai header 'If-Match'. |
| [get_IfModifiedSince](./get_ifmodifiedsince/)() | Mendapatkan nilai header 'If-Modified-Since'. |
| [get_IfNoneMatch](./get_ifnonematch/)() | Mengembalikan nilai header 'If-None-Match'. |
| [get_IfRange](./get_ifrange/)() | Mendapatkan nilai header 'If-Range'. |
| [get_IfUnmodifiedSince](./get_ifunmodifiedsince/)() | Mendapatkan nilai header 'If-Unmodified-Since'. |
| [get_MaxForwards](./get_maxforwards/)() | Mendapatkan nilai header 'Max-Forwards'. |
| [get_Pragma](./get_pragma/)() | Mengembalikan nilai header 'Pragma'. |
| [get_ProxyAuthorization](./get_proxyauthorization/)() | Mendapatkan nilai header 'Proxy-Authorization'. |
| [get_Range](./get_range/)() | Mendapatkan nilai header 'Range'. |
| [get_Referrer](./get_referrer/)() | Mendapatkan nilai header 'Referer'. |
| [get_TE](./get_te/)() | Mengembalikan nilai header 'TE'. |
| [get_Trailer](./get_trailer/)() | Mengembalikan nilai header 'Trailer'. |
| [get_TransferEncoding](./get_transferencoding/)() | Mengembalikan nilai dari header 'Transfer-Encoding'. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | Mendapatkan nilai yang menunjukkan apakah nilai header 'Transfer-Encoding' berisi 'Chunked'. |
| [get_Upgrade](./get_upgrade/)() | Mengembalikan nilai dari header 'Upgrade'. |
| [get_UserAgent](./get_useragent/)() | Mengembalikan nilai dari header 'User-Agent'. |
| [get_Via](./get_via/)() | Mengembalikan nilai dari header 'Via'. |
| [get_Warning](./get_warning/)() | Mengembalikan nilai dari header 'Warning'. |
| [HttpRequestHeaders](./httprequestheaders/)() | Membuat instance baru. |
| [set_Authorization](./set_authorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | Mengatur nilai dari header 'Authorization'. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | Mengatur nilai dari header 'Cache-Control'. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | Mengatur nilai yang menunjukkan apakah nilai header 'Connection' berisi 'Close'. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | Mengatur nilai dari header 'Date'. |
| [set_ExpectContinue](./set_expectcontinue/)(Nullable\<bool\>) | Mengatur nilai yang menunjukkan apakah nilai header 'Expect' berisi 'Continue'. |
| [set_From](./set_from/)(String) | Mengatur nilai dari header 'From'. |
| [set_Host](./set_host/)(String) | Mengatur nilai dari header 'Host'. |
| [set_IfModifiedSince](./set_ifmodifiedsince/)(Nullable\<DateTimeOffset\>) | Mengatur nilai dari header 'If-Modified-Since'. |
| [set_IfRange](./set_ifrange/)(System::SharedPtr\<RangeConditionHeaderValue\>) | Mengatur nilai dari header 'If-Range'. |
| [set_IfUnmodifiedSince](./set_ifunmodifiedsince/)(Nullable\<DateTimeOffset\>) | Mengatur nilai dari header 'If-Unmodified-Since'. |
| [set_MaxForwards](./set_maxforwards/)(Nullable\<int32_t\>) | Mengatur nilai dari header 'Max-Forwards'. |
| [set_ProxyAuthorization](./set_proxyauthorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | Mengatur nilai dari header 'Proxy-Authorization'. |
| [set_Range](./set_range/)(System::SharedPtr\<RangeHeaderValue\>) | Mengatur nilai dari header 'Range'. |
| [set_Referrer](./set_referrer/)(System::SharedPtr\<Uri\>) | Menetapkan nilai dari header 'Referer'. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | Mengatur nilai yang menunjukkan apakah nilai header 'Transfer-Encoding' berisi 'Chunked'. |
## Lihat Juga

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
