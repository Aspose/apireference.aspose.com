---
title: "System::Net::Http::Headers::HttpRequestHeaders sınıfı"
linktitle: "HttpRequestHeaders"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::HttpRequestHeaders sınıfı. ''Request'' başlıklarının koleksiyonunu temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1000
url: /tr/cpp/system.net.http.headers/httprequestheaders/
---
## HttpRequestHeaders class


'Request' başlıklarının koleksiyonunu temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class HttpRequestHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | Belirtilen HttpHeaders-class örneğini geçerli olanla birleştirir. |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Bilinen başlıkları belirtilen koleksiyona ekler. |
| [get_Accept](./get_accept/)() | RTTI bilgisi. |
| [get_AcceptCharset](./get_acceptcharset/)() | 'Accept-Charset' başlığının değerini döndürür. |
| [get_AcceptEncoding](./get_acceptencoding/)() | 'Accept-Encoding' başlığının değerini döndürür. |
| [get_AcceptLanguage](./get_acceptlanguage/)() | 'Accept-Language' başlığının değerini döndürür. |
| [get_Authorization](./get_authorization/)() | 'Authorization' başlığının değerini alır. |
| [get_CacheControl](./get_cachecontrol/)() | 'Cache-Control' başlığının değerini alır. |
| [get_Connection](./get_connection/)() | 'Connection' başlığının değerini döndürür. |
| [get_ConnectionClose](./get_connectionclose/)() | 'Connection' başlığı değerinin 'Close' içerip içermediğini gösteren bir değer alır. |
| [get_Date](./get_date/)() | 'Date' başlığının değerini alır. |
| [get_Expect](./get_expect/)() | 'Expect' başlığının değerini döndürür. |
| [get_ExpectContinue](./get_expectcontinue/)() | 'Expect' başlığı değerinin 'Continue' içerip içermediğini gösteren bir değer alır. |
| [get_From](./get_from/)() | 'From' başlığının değerini alır. |
| [get_Host](./get_host/)() | 'Host' başlığının değerini alır. |
| [get_IfMatch](./get_ifmatch/)() | 'If-Match' başlığının değerini döndürür. |
| [get_IfModifiedSince](./get_ifmodifiedsince/)() | 'If-Modified-Since' başlığının değerini alır. |
| [get_IfNoneMatch](./get_ifnonematch/)() | 'If-None-Match' başlığının değerini döndürür. |
| [get_IfRange](./get_ifrange/)() | 'If-Range' başlığının değerini alır. |
| [get_IfUnmodifiedSince](./get_ifunmodifiedsince/)() | 'If-Unmodified-Since' başlığının değerini alır. |
| [get_MaxForwards](./get_maxforwards/)() | 'Max-Forwards' başlığının değerini alır. |
| [get_Pragma](./get_pragma/)() | 'Pragma' başlığının değerini döndürür. |
| [get_ProxyAuthorization](./get_proxyauthorization/)() | 'Proxy-Authorization' başlığının değerini alır. |
| [get_Range](./get_range/)() | 'Range' başlığının değerini alır. |
| [get_Referrer](./get_referrer/)() | 'Referer' başlığının değerini alır. |
| [get_TE](./get_te/)() | 'TE' başlığının değerini döndürür. |
| [get_Trailer](./get_trailer/)() | 'Trailer' başlığının değerini döndürür. |
| [get_TransferEncoding](./get_transferencoding/)() | ‘Transfer-Encoding’ başlığının bir değerini döndürür. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | ‘Transfer-Encoding’ başlık değerinin 'Chunked' içerip içermediğini gösteren bir değeri alır. |
| [get_Upgrade](./get_upgrade/)() | ‘Upgrade’ başlığının bir değerini döndürür. |
| [get_UserAgent](./get_useragent/)() | ‘User-Agent’ başlığının bir değerini döndürür. |
| [get_Via](./get_via/)() | ‘Via’ başlığının bir değerini döndürür. |
| [get_Warning](./get_warning/)() | ‘Warning’ başlığının bir değerini döndürür. |
| [HttpRequestHeaders](./httprequestheaders/)() | Yeni bir örnek oluşturur. |
| [set_Authorization](./set_authorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | ‘Authorization’ başlığının bir değerini ayarlar. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | ‘Cache-Control’ başlığının bir değerini ayarlar. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | ‘Connection’ başlık değerinin 'Close' içerip içermediğini gösteren bir değeri ayarlar. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | ‘Date’ başlığının bir değerini ayarlar. |
| [set_ExpectContinue](./set_expectcontinue/)(Nullable\<bool\>) | ‘Expect’ başlık değerinin 'Continue' içerip içermediğini gösteren bir değeri ayarlar. |
| [set_From](./set_from/)(String) | ‘From’ başlığının bir değerini ayarlar. |
| [set_Host](./set_host/)(String) | ‘Host’ başlığının bir değerini ayarlar. |
| [set_IfModifiedSince](./set_ifmodifiedsince/)(Nullable\<DateTimeOffset\>) | ‘If-Modified-Since’ başlığının bir değerini ayarlar. |
| [set_IfRange](./set_ifrange/)(System::SharedPtr\<RangeConditionHeaderValue\>) | ‘If-Range’ başlığının bir değerini ayarlar. |
| [set_IfUnmodifiedSince](./set_ifunmodifiedsince/)(Nullable\<DateTimeOffset\>) | ‘If-Unmodified-Since’ başlığının bir değerini ayarlar. |
| [set_MaxForwards](./set_maxforwards/)(Nullable\<int32_t\>) | ‘Max-Forwards’ başlığının bir değerini ayarlar. |
| [set_ProxyAuthorization](./set_proxyauthorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | ‘Proxy-Authorization’ başlığının bir değerini ayarlar. |
| [set_Range](./set_range/)(System::SharedPtr\<RangeHeaderValue\>) | ‘Range’ başlığının bir değerini ayarlar. |
| [set_Referrer](./set_referrer/)(System::SharedPtr\<Uri\>) | 'Referer' başlığının değerini ayarlar. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | ‘Transfer-Encoding’ başlık değerinin 'Chunked' içerip içermediğini gösteren bir değeri ayarlar. |
## Ayrıca Bakınız

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
