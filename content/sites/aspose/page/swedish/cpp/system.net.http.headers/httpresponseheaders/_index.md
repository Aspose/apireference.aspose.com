---
title: "System::Net::Http::Headers::HttpResponseHeaders-klass"
linktitle: "HttpResponseHeaders"
second_title: "Aspose.Page för C++"
description: "System::Net::Http::Headers::HttpResponseHeaders-klass. Representerar samlingen av ''Response''-huvuden. Objekt av denna klass bör endast allokeras med System::MakeObject()-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en System::SmartPtr-pekare och använd pekaren för att skicka den till funktioner som argument i C++."
type: docs
weight: 1100
url: /sv/cpp/system.net.http.headers/httpresponseheaders/
---
## HttpResponseHeaders class


Representerar samlingen av 'Response'-huvuden. Objekt av denna klass bör endast allokeras med [System::MakeObject()](../../system/makeobject/)-funktionen. Skapa aldrig en instans av denna typ på stacken eller med operatorn new, eftersom det kan leda till körfel och/eller påståendefel. Omslut alltid denna klass i en [System::SmartPtr](../../system/smartptr/)-pekare och använd pekaren för att skicka den till funktioner som argument.

```cpp
class HttpResponseHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | Konkatenar den angivna HttpHeaders-klassinstansen med den aktuella. |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Lägger till de kända rubrikerna i den angivna samlingen. |
| [get_AcceptRanges](./get_acceptranges/)() | RTTI-information. |
| [get_Age](./get_age/)() | Hämtar ett värde för 'Age'-huvudet. |
| [get_CacheControl](./get_cachecontrol/)() | Hämtar ett värde för rubriken 'Cache-Control'. |
| [get_Connection](./get_connection/)() | Returnerar ett värde för rubriken 'Connection'. |
| [get_ConnectionClose](./get_connectionclose/)() | Hämtar ett värde som indikerar om rubrikvärdet 'Connection' innehåller 'Close'. |
| [get_Date](./get_date/)() | Hämtar ett värde för rubriken 'Date'. |
| [get_ETag](./get_etag/)() | Hämtar ett värde för 'ETag'-rubriken. |
| [get_Location](./get_location/)() | Hämtar ett värde för 'Location'-huvudet. |
| [get_Pragma](./get_pragma/)() | Returnerar ett värde för rubriken 'Pragma'. |
| [get_ProxyAuthenticate](./get_proxyauthenticate/)() | Returnerar ett värde för 'Proxy-Authenticate'-huvudet. |
| [get_RetryAfter](./get_retryafter/)() | Hämtar ett värde för 'Retry-After'-huvudet. |
| [get_Server](./get_server/)() | Returnerar ett värde för 'Server'-huvudet. |
| [get_Trailer](./get_trailer/)() | Returnerar ett värde för rubriken 'Trailer'. |
| [get_TransferEncoding](./get_transferencoding/)() | Returnerar ett värde för 'Transfer-Encoding'-headern. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | Hämtar ett värde som indikerar om 'Transfer-Encoding'-headerns värde innehåller 'Chunked'. |
| [get_Upgrade](./get_upgrade/)() | Returnerar ett värde för 'Upgrade'-headern. |
| [get_Vary](./get_vary/)() | Returnerar ett värde för 'Vary'-huvudet. |
| [get_Via](./get_via/)() | Returnerar ett värde för 'Via'-headern. |
| [get_Warning](./get_warning/)() | Returnerar ett värde för 'Warning'-headern. |
| [get_WwwAuthenticate](./get_wwwauthenticate/)() | Returnerar ett värde för 'WWW-Authenticate'-huvudet. |
| [HttpResponseHeaders](./httpresponseheaders/)() | Skapar en ny instans. |
| [set_Age](./set_age/)(Nullable\<TimeSpan\>) | Sätter ett värde för 'Age'-huvudet. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | Sätter ett värde för 'Cache-Control'-headern. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | Sätter ett värde som indikerar om 'Connection'-headerns värde innehåller 'Close'. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | Sätter ett värde för 'Date'-headern. |
| [set_ETag](./set_etag/)(System::SharedPtr\<EntityTagHeaderValue\>) | Sätter ett värde för 'ETag'-huvudet. |
| [set_Location](./set_location/)(System::SharedPtr\<Uri\>) | Sätter ett värde för 'Location'-huvudet. |
| [set_RetryAfter](./set_retryafter/)(System::SharedPtr\<RetryConditionHeaderValue\>) | Sätter ett värde för 'Retry-After'-huvudet. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | Sätter ett värde som indikerar om 'Transfer-Encoding'-headerns värde innehåller 'Chunked'. |
## Se även

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
