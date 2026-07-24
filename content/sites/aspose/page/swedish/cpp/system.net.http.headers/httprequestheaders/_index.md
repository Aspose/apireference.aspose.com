---
title: "System::Net::Http::Headers::HttpRequestHeaders klass"
linktitle: "HttpRequestHeaders"
second_title: "Aspose.Page för C++"
description: "System::Net::Http::Headers::HttpRequestHeaders klass. Representerar samlingen av ''Request''-headern. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 1000
url: /sv/cpp/system.net.http.headers/httprequestheaders/
---
## HttpRequestHeaders class


Representerar samlingen av 'Request'-headern. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operator new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/)-pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class HttpRequestHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | Konkatenar den angivna HttpHeaders-klassinstansen med den aktuella. |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Lägger till de kända rubrikerna i den angivna samlingen. |
| [get_Accept](./get_accept/)() | RTTI-information. |
| [get_AcceptCharset](./get_acceptcharset/)() | Returnerar ett värde för rubriken 'Accept-Charset'. |
| [get_AcceptEncoding](./get_acceptencoding/)() | Returnerar ett värde för rubriken 'Accept-Encoding'. |
| [get_AcceptLanguage](./get_acceptlanguage/)() | Returnerar ett värde för rubriken 'Accept-Language'. |
| [get_Authorization](./get_authorization/)() | Hämtar ett värde för rubriken 'Authorization'. |
| [get_CacheControl](./get_cachecontrol/)() | Hämtar ett värde för rubriken 'Cache-Control'. |
| [get_Connection](./get_connection/)() | Returnerar ett värde för rubriken 'Connection'. |
| [get_ConnectionClose](./get_connectionclose/)() | Hämtar ett värde som indikerar om rubrikvärdet 'Connection' innehåller 'Close'. |
| [get_Date](./get_date/)() | Hämtar ett värde för rubriken 'Date'. |
| [get_Expect](./get_expect/)() | Returnerar värdet för rubriken 'Expect'. |
| [get_ExpectContinue](./get_expectcontinue/)() | Hämtar ett värde som indikerar om rubrikvärdet 'Expect' innehåller 'Continue'. |
| [get_From](./get_from/)() | Hämtar ett värde för rubriken 'From'. |
| [get_Host](./get_host/)() | Hämtar ett värde för rubriken 'Host'. |
| [get_IfMatch](./get_ifmatch/)() | Returnerar ett värde för rubriken 'If-Match'. |
| [get_IfModifiedSince](./get_ifmodifiedsince/)() | Hämtar ett värde för rubriken 'If-Modified-Since'. |
| [get_IfNoneMatch](./get_ifnonematch/)() | Returnerar ett värde för rubriken 'If-None-Match'. |
| [get_IfRange](./get_ifrange/)() | Hämtar ett värde för rubriken 'If-Range'. |
| [get_IfUnmodifiedSince](./get_ifunmodifiedsince/)() | Hämtar ett värde för rubriken 'If-Unmodified-Since'. |
| [get_MaxForwards](./get_maxforwards/)() | Hämtar ett värde för rubriken 'Max-Forwards'. |
| [get_Pragma](./get_pragma/)() | Returnerar ett värde för rubriken 'Pragma'. |
| [get_ProxyAuthorization](./get_proxyauthorization/)() | Hämtar ett värde för rubriken 'Proxy-Authorization'. |
| [get_Range](./get_range/)() | Hämtar ett värde för rubriken 'Range'. |
| [get_Referrer](./get_referrer/)() | Hämtar ett värde för 'Referer'-huvudet. |
| [get_TE](./get_te/)() | Returnerar ett värde för rubriken 'TE'. |
| [get_Trailer](./get_trailer/)() | Returnerar ett värde för rubriken 'Trailer'. |
| [get_TransferEncoding](./get_transferencoding/)() | Returnerar ett värde för 'Transfer-Encoding'-headern. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | Hämtar ett värde som indikerar om 'Transfer-Encoding'-headerns värde innehåller 'Chunked'. |
| [get_Upgrade](./get_upgrade/)() | Returnerar ett värde för 'Upgrade'-headern. |
| [get_UserAgent](./get_useragent/)() | Returnerar ett värde för 'User-Agent'-headern. |
| [get_Via](./get_via/)() | Returnerar ett värde för 'Via'-headern. |
| [get_Warning](./get_warning/)() | Returnerar ett värde för 'Warning'-headern. |
| [HttpRequestHeaders](./httprequestheaders/)() | Skapar en ny instans. |
| [set_Authorization](./set_authorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | Sätter ett värde för 'Authorization'-headern. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | Sätter ett värde för 'Cache-Control'-headern. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | Sätter ett värde som indikerar om 'Connection'-headerns värde innehåller 'Close'. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | Sätter ett värde för 'Date'-headern. |
| [set_ExpectContinue](./set_expectcontinue/)(Nullable\<bool\>) | Sätter ett värde som indikerar om 'Expect'-headerns värde innehåller 'Continue'. |
| [set_From](./set_from/)(String) | Sätter ett värde för 'From'-headern. |
| [set_Host](./set_host/)(String) | Sätter ett värde för 'Host'-headern. |
| [set_IfModifiedSince](./set_ifmodifiedsince/)(Nullable\<DateTimeOffset\>) | Sätter ett värde för 'If-Modified-Since'-headern. |
| [set_IfRange](./set_ifrange/)(System::SharedPtr\<RangeConditionHeaderValue\>) | Sätter ett värde för 'If-Range'-headern. |
| [set_IfUnmodifiedSince](./set_ifunmodifiedsince/)(Nullable\<DateTimeOffset\>) | Sätter ett värde för 'If-Unmodified-Since'-headern. |
| [set_MaxForwards](./set_maxforwards/)(Nullable\<int32_t\>) | Sätter ett värde för 'Max-Forwards'-headern. |
| [set_ProxyAuthorization](./set_proxyauthorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | Sätter ett värde för 'Proxy-Authorization'-headern. |
| [set_Range](./set_range/)(System::SharedPtr\<RangeHeaderValue\>) | Sätter ett värde för 'Range'-headern. |
| [set_Referrer](./set_referrer/)(System::SharedPtr\<Uri\>) | Ställer in ett värde för 'Referer'-huvudet. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | Sätter ett värde som indikerar om 'Transfer-Encoding'-headerns värde innehåller 'Chunked'. |
## Se även

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
