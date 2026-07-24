---
title: "System::Net::Http::Headers::HttpRequestHeaders klasse"
linktitle: "HttpRequestHeaders"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::HttpRequestHeaders klasse. Vertegenwoordigt de collectie van de ''Request''‑headers. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik die pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 1000
url: /nl/cpp/system.net.http.headers/httprequestheaders/
---
## HttpRequestHeaders class


Vertegenwoordigt de collectie van de 'Request'‑headers. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)‑functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)‑pointer en gebruik die pointer om deze als argument aan functies door te geven.

```cpp
class HttpRequestHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | Voegt de opgegeven HttpHeaders‑klasse‑instantie samen met de huidige. |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Voegt de bekende headers toe aan de opgegeven collectie. |
| [get_Accept](./get_accept/)() | RTTI-informatie. |
| [get_AcceptCharset](./get_acceptcharset/)() | Retourneert een waarde van de 'Accept-Charset'‑header. |
| [get_AcceptEncoding](./get_acceptencoding/)() | Retourneert een waarde van de 'Accept-Encoding'‑header. |
| [get_AcceptLanguage](./get_acceptlanguage/)() | Retourneert een waarde van de 'Accept-Language'‑header. |
| [get_Authorization](./get_authorization/)() | Haalt een waarde op van de 'Authorization'‑header. |
| [get_CacheControl](./get_cachecontrol/)() | Haalt een waarde op van de 'Cache-Control'‑header. |
| [get_Connection](./get_connection/)() | Retourneert een waarde van de 'Connection'‑header. |
| [get_ConnectionClose](./get_connectionclose/)() | Haalt een waarde op die aangeeft of de 'Connection'‑headerwaarde 'Close' bevat. |
| [get_Date](./get_date/)() | Haalt een waarde op van de 'Date'‑header. |
| [get_Expect](./get_expect/)() | Retourneert de waarde van de 'Expect'‑header. |
| [get_ExpectContinue](./get_expectcontinue/)() | Haalt een waarde op die aangeeft of de 'Expect'‑headerwaarde 'Continue' bevat. |
| [get_From](./get_from/)() | Haalt een waarde op van de 'From'‑header. |
| [get_Host](./get_host/)() | Haalt een waarde op van de 'Host'‑header. |
| [get_IfMatch](./get_ifmatch/)() | Retourneert een waarde van de 'If-Match'‑header. |
| [get_IfModifiedSince](./get_ifmodifiedsince/)() | Haalt een waarde op van de 'If-Modified-Since'‑header. |
| [get_IfNoneMatch](./get_ifnonematch/)() | Retourneert een waarde van de 'If-None-Match'‑header. |
| [get_IfRange](./get_ifrange/)() | Haalt een waarde op van de 'If-Range' header. |
| [get_IfUnmodifiedSince](./get_ifunmodifiedsince/)() | Haalt een waarde op van de 'If-Unmodified-Since' header. |
| [get_MaxForwards](./get_maxforwards/)() | Haalt een waarde op van de 'Max-Forwards' header. |
| [get_Pragma](./get_pragma/)() | Retourneert een waarde van de 'Pragma' header. |
| [get_ProxyAuthorization](./get_proxyauthorization/)() | Haalt een waarde op van de 'Proxy-Authorization' header. |
| [get_Range](./get_range/)() | Haalt een waarde op van de 'Range' header. |
| [get_Referrer](./get_referrer/)() | Haalt een waarde op van de 'Referer'-header. |
| [get_TE](./get_te/)() | Retourneert een waarde van de 'TE' header. |
| [get_Trailer](./get_trailer/)() | Retourneert een waarde van de 'Trailer' header. |
| [get_TransferEncoding](./get_transferencoding/)() | Retourneert een waarde van de 'Transfer-Encoding' header. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | Haalt een waarde op die aangeeft of de 'Transfer-Encoding' headerwaarde 'Chunked' bevat. |
| [get_Upgrade](./get_upgrade/)() | Retourneert een waarde van de 'Upgrade' header. |
| [get_UserAgent](./get_useragent/)() | Retourneert een waarde van de 'User-Agent' header. |
| [get_Via](./get_via/)() | Retourneert een waarde van de 'Via' header. |
| [get_Warning](./get_warning/)() | Retourneert een waarde van de 'Warning' header. |
| [HttpRequestHeaders](./httprequestheaders/)() | Construeert een nieuw exemplaar. |
| [set_Authorization](./set_authorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | Stelt een waarde in voor de 'Authorization' header. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | Stelt een waarde in voor de 'Cache-Control' header. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | Stelt een waarde in die aangeeft of de 'Connection' headerwaarde 'Close' bevat. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | Stelt een waarde in voor de 'Date' header. |
| [set_ExpectContinue](./set_expectcontinue/)(Nullable\<bool\>) | Stelt een waarde in die aangeeft of de 'Expect' headerwaarde 'Continue' bevat. |
| [set_From](./set_from/)(String) | Stelt een waarde in voor de 'From' header. |
| [set_Host](./set_host/)(String) | Stelt een waarde in voor de 'Host' header. |
| [set_IfModifiedSince](./set_ifmodifiedsince/)(Nullable\<DateTimeOffset\>) | Stelt een waarde in voor de 'If-Modified-Since' header. |
| [set_IfRange](./set_ifrange/)(System::SharedPtr\<RangeConditionHeaderValue\>) | Stelt een waarde in voor de 'If-Range' header. |
| [set_IfUnmodifiedSince](./set_ifunmodifiedsince/)(Nullable\<DateTimeOffset\>) | Stelt een waarde in voor de 'If-Unmodified-Since' header. |
| [set_MaxForwards](./set_maxforwards/)(Nullable\<int32_t\>) | Stelt een waarde in voor de 'Max-Forwards' header. |
| [set_ProxyAuthorization](./set_proxyauthorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | Stelt een waarde in voor de 'Proxy-Authorization' header. |
| [set_Range](./set_range/)(System::SharedPtr\<RangeHeaderValue\>) | Stelt een waarde in voor de 'Range' header. |
| [set_Referrer](./set_referrer/)(System::SharedPtr\<Uri\>) | Stelt een waarde in van de 'Referer'-header. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | Stelt een waarde in die aangeeft of de 'Transfer-Encoding' headerwaarde 'Chunked' bevat. |
## Zie ook

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
