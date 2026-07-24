---
title: "System::Net::Http::Headers::HttpResponseHeaders klasse"
linktitle: "HttpResponseHeaders"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::HttpResponseHeaders klasse. Vertegenwoordigt de collectie van de ''Response'' headers. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 1100
url: /nl/cpp/system.net.http.headers/httpresponseheaders/
---
## HttpResponseHeaders class


Vertegenwoordigt de collectie van de 'Response' headers. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class HttpResponseHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | Voegt de opgegeven HttpHeaders‑klasse‑instantie samen met de huidige. |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Voegt de bekende headers toe aan de opgegeven collectie. |
| [get_AcceptRanges](./get_acceptranges/)() | RTTI-informatie. |
| [get_Age](./get_age/)() | Haalt een waarde op van de 'Age' header. |
| [get_CacheControl](./get_cachecontrol/)() | Haalt een waarde op van de 'Cache-Control'‑header. |
| [get_Connection](./get_connection/)() | Retourneert een waarde van de 'Connection'‑header. |
| [get_ConnectionClose](./get_connectionclose/)() | Haalt een waarde op die aangeeft of de 'Connection'‑headerwaarde 'Close' bevat. |
| [get_Date](./get_date/)() | Haalt een waarde op van de 'Date'‑header. |
| [get_ETag](./get_etag/)() | Haalt een waarde op van de 'ETag' header. |
| [get_Location](./get_location/)() | Haalt een waarde op van de 'Location' header. |
| [get_Pragma](./get_pragma/)() | Retourneert een waarde van de 'Pragma' header. |
| [get_ProxyAuthenticate](./get_proxyauthenticate/)() | Retourneert een waarde van de 'Proxy-Authenticate' header. |
| [get_RetryAfter](./get_retryafter/)() | Haalt een waarde op van de 'Retry-After' header. |
| [get_Server](./get_server/)() | Retourneert een waarde van de 'Server' header. |
| [get_Trailer](./get_trailer/)() | Retourneert een waarde van de 'Trailer' header. |
| [get_TransferEncoding](./get_transferencoding/)() | Retourneert een waarde van de 'Transfer-Encoding' header. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | Haalt een waarde op die aangeeft of de 'Transfer-Encoding' headerwaarde 'Chunked' bevat. |
| [get_Upgrade](./get_upgrade/)() | Retourneert een waarde van de 'Upgrade' header. |
| [get_Vary](./get_vary/)() | Retourneert een waarde van de 'Vary' header. |
| [get_Via](./get_via/)() | Retourneert een waarde van de 'Via' header. |
| [get_Warning](./get_warning/)() | Retourneert een waarde van de 'Warning' header. |
| [get_WwwAuthenticate](./get_wwwauthenticate/)() | Retourneert een waarde van de 'WWW-Authenticate' header. |
| [HttpResponseHeaders](./httpresponseheaders/)() | Construeert een nieuw exemplaar. |
| [set_Age](./set_age/)(Nullable\<TimeSpan\>) | Stelt een waarde in voor de 'Age' header. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | Stelt een waarde in voor de 'Cache-Control' header. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | Stelt een waarde in die aangeeft of de 'Connection' headerwaarde 'Close' bevat. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | Stelt een waarde in voor de 'Date' header. |
| [set_ETag](./set_etag/)(System::SharedPtr\<EntityTagHeaderValue\>) | Stelt een waarde in voor de 'ETag' header. |
| [set_Location](./set_location/)(System::SharedPtr\<Uri\>) | Stelt een waarde in voor de 'Location' header. |
| [set_RetryAfter](./set_retryafter/)(System::SharedPtr\<RetryConditionHeaderValue\>) | Stelt een waarde in van de 'Retry-After' header. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | Stelt een waarde in die aangeeft of de 'Transfer-Encoding' headerwaarde 'Chunked' bevat. |
## Zie ook

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
