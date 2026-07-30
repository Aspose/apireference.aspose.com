---
title: "System::Net::Http::Headers::HttpResponseHeaders sınıfı"
linktitle: "HttpResponseHeaders"
second_title: "Aspose.Font için C++"
description: "System::Net::Http::Headers::HttpResponseHeaders sınıfı. ''Response'' başlıklarının koleksiyonunu temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1100
url: /tr/cpp/system.net.http.headers/httpresponseheaders/
---
## HttpResponseHeaders class


'Response' başlıklarının koleksiyonunu temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class HttpResponseHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | Belirtilen HttpHeaders-class örneğini geçerli olanla birleştirir. |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Bilinen başlıkları belirtilen koleksiyona ekler. |
| [get_AcceptRanges](./get_acceptranges/)() | RTTI bilgisi. |
| [get_Age](./get_age/)() | 'Age' başlığının değerini alır. |
| [get_CacheControl](./get_cachecontrol/)() | 'Cache-Control' başlığının değerini alır. |
| [get_Connection](./get_connection/)() | 'Connection' başlığının değerini döndürür. |
| [get_ConnectionClose](./get_connectionclose/)() | 'Connection' başlığı değerinin 'Close' içerip içermediğini gösteren bir değer alır. |
| [get_Date](./get_date/)() | 'Date' başlığının değerini alır. |
| [get_ETag](./get_etag/)() | 'ETag' başlığının bir değerini alır. |
| [get_Location](./get_location/)() | 'Location' başlığının değerini alır. |
| [get_Pragma](./get_pragma/)() | 'Pragma' başlığının değerini döndürür. |
| [get_ProxyAuthenticate](./get_proxyauthenticate/)() | 'Proxy-Authenticate' başlığının değerini döndürür. |
| [get_RetryAfter](./get_retryafter/)() | 'Retry-After' başlığının değerini alır. |
| [get_Server](./get_server/)() | 'Server' başlığının değerini döndürür. |
| [get_Trailer](./get_trailer/)() | 'Trailer' başlığının değerini döndürür. |
| [get_TransferEncoding](./get_transferencoding/)() | ‘Transfer-Encoding’ başlığının bir değerini döndürür. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | ‘Transfer-Encoding’ başlık değerinin 'Chunked' içerip içermediğini gösteren bir değeri alır. |
| [get_Upgrade](./get_upgrade/)() | ‘Upgrade’ başlığının bir değerini döndürür. |
| [get_Vary](./get_vary/)() | 'Vary' başlığının değerini döndürür. |
| [get_Via](./get_via/)() | ‘Via’ başlığının bir değerini döndürür. |
| [get_Warning](./get_warning/)() | ‘Warning’ başlığının bir değerini döndürür. |
| [get_WwwAuthenticate](./get_wwwauthenticate/)() | 'WWW-Authenticate' başlığının değerini döndürür. |
| [HttpResponseHeaders](./httpresponseheaders/)() | Yeni bir örnek oluşturur. |
| [set_Age](./set_age/)(Nullable\<TimeSpan\>) | 'Age' başlığının değerini ayarlar. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | ‘Cache-Control’ başlığının bir değerini ayarlar. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | ‘Connection’ başlık değerinin 'Close' içerip içermediğini gösteren bir değeri ayarlar. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | ‘Date’ başlığının bir değerini ayarlar. |
| [set_ETag](./set_etag/)(System::SharedPtr\<EntityTagHeaderValue\>) | 'ETag' başlığının değerini ayarlar. |
| [set_Location](./set_location/)(System::SharedPtr\<Uri\>) | 'Location' başlığının değerini ayarlar. |
| [set_RetryAfter](./set_retryafter/)(System::SharedPtr\<RetryConditionHeaderValue\>) | 'Retry-After' başlığının değerini ayarlar. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | ‘Transfer-Encoding’ başlık değerinin 'Chunked' içerip içermediğini gösteren bir değeri ayarlar. |
## Ayrıca Bakınız

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
