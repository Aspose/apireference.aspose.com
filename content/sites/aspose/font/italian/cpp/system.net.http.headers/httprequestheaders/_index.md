---
title: "System::Net::Http::Headers::HttpRequestHeaders classe"
linktitle: "HttpRequestHeaders"
second_title: "Aspose.Font per C++"
description: "System::Net::Http::Headers::HttpRequestHeaders class. Rappresenta la collezione delle intestazioni ''Request''. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e utilizza tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 1000
url: /it/cpp/system.net.http.headers/httprequestheaders/
---
## HttpRequestHeaders class


Rappresenta la collezione delle intestazioni 'Request'. Gli oggetti di questa classe dovrebbero essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizza tale puntatore per passarlo alle funzioni come argomento.

```cpp
class HttpRequestHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | Concatena l'istanza della classe HttpHeaders specificata con quella corrente. |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Aggiunge le intestazioni conosciute alla raccolta specificata. |
| [get_Accept](./get_accept/)() | Informazioni RTTI. |
| [get_AcceptCharset](./get_acceptcharset/)() | Restituisce un valore dell'intestazione 'Accept-Charset'. |
| [get_AcceptEncoding](./get_acceptencoding/)() | Restituisce un valore dell'intestazione 'Accept-Encoding'. |
| [get_AcceptLanguage](./get_acceptlanguage/)() | Restituisce un valore dell'intestazione 'Accept-Language'. |
| [get_Authorization](./get_authorization/)() | Ottiene un valore dell'intestazione 'Authorization'. |
| [get_CacheControl](./get_cachecontrol/)() | Ottiene un valore dell'intestazione 'Cache-Control'. |
| [get_Connection](./get_connection/)() | Restituisce un valore dell'intestazione 'Connection'. |
| [get_ConnectionClose](./get_connectionclose/)() | Ottiene un valore che indica se il valore dell'intestazione 'Connection' contiene 'Close'. |
| [get_Date](./get_date/)() | Ottiene un valore dell'intestazione 'Date'. |
| [get_Expect](./get_expect/)() | Restituisce il valore dell'intestazione 'Expect'. |
| [get_ExpectContinue](./get_expectcontinue/)() | Ottiene un valore che indica se il valore dell'intestazione 'Expect' contiene 'Continue'. |
| [get_From](./get_from/)() | Ottiene un valore dell'intestazione 'From'. |
| [get_Host](./get_host/)() | Ottiene un valore dell'intestazione 'Host'. |
| [get_IfMatch](./get_ifmatch/)() | Restituisce un valore dell'intestazione 'If-Match'. |
| [get_IfModifiedSince](./get_ifmodifiedsince/)() | Ottiene un valore dell'intestazione 'If-Modified-Since'. |
| [get_IfNoneMatch](./get_ifnonematch/)() | Restituisce un valore dell'intestazione 'If-None-Match'. |
| [get_IfRange](./get_ifrange/)() | Ottiene un valore dell'intestazione 'If-Range'. |
| [get_IfUnmodifiedSince](./get_ifunmodifiedsince/)() | Ottiene un valore dell'intestazione 'If-Unmodified-Since'. |
| [get_MaxForwards](./get_maxforwards/)() | Ottiene un valore dell'intestazione 'Max-Forwards'. |
| [get_Pragma](./get_pragma/)() | Restituisce un valore dell'intestazione 'Pragma'. |
| [get_ProxyAuthorization](./get_proxyauthorization/)() | Ottiene un valore dell'intestazione 'Proxy-Authorization'. |
| [get_Range](./get_range/)() | Ottiene un valore dell'intestazione 'Range'. |
| [get_Referrer](./get_referrer/)() | Ottiene un valore dell'intestazione 'Referer'. |
| [get_TE](./get_te/)() | Restituisce un valore dell'intestazione 'TE'. |
| [get_Trailer](./get_trailer/)() | Restituisce un valore dell'intestazione 'Trailer'. |
| [get_TransferEncoding](./get_transferencoding/)() | Restituisce un valore dell'intestazione 'Transfer-Encoding'. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | Ottiene un valore che indica se il valore dell'intestazione 'Transfer-Encoding' contiene 'Chunked'. |
| [get_Upgrade](./get_upgrade/)() | Restituisce un valore dell'intestazione 'Upgrade'. |
| [get_UserAgent](./get_useragent/)() | Restituisce un valore dell'intestazione 'User-Agent'. |
| [get_Via](./get_via/)() | Restituisce un valore dell'intestazione 'Via'. |
| [get_Warning](./get_warning/)() | Restituisce un valore dell'intestazione 'Warning'. |
| [HttpRequestHeaders](./httprequestheaders/)() | Crea una nuova istanza. |
| [set_Authorization](./set_authorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | Imposta un valore dell'intestazione 'Authorization'. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | Imposta un valore dell'intestazione 'Cache-Control'. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | Imposta un valore che indica se il valore dell'intestazione 'Connection' contiene 'Close'. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | Imposta un valore dell'intestazione 'Date'. |
| [set_ExpectContinue](./set_expectcontinue/)(Nullable\<bool\>) | Imposta un valore che indica se il valore dell'intestazione 'Expect' contiene 'Continue'. |
| [set_From](./set_from/)(String) | Imposta un valore dell'intestazione 'From'. |
| [set_Host](./set_host/)(String) | Imposta un valore dell'intestazione 'Host'. |
| [set_IfModifiedSince](./set_ifmodifiedsince/)(Nullable\<DateTimeOffset\>) | Imposta un valore dell'intestazione 'If-Modified-Since'. |
| [set_IfRange](./set_ifrange/)(System::SharedPtr\<RangeConditionHeaderValue\>) | Imposta un valore dell'intestazione 'If-Range'. |
| [set_IfUnmodifiedSince](./set_ifunmodifiedsince/)(Nullable\<DateTimeOffset\>) | Imposta un valore dell'intestazione 'If-Unmodified-Since'. |
| [set_MaxForwards](./set_maxforwards/)(Nullable\<int32_t\>) | Imposta un valore dell'intestazione 'Max-Forwards'. |
| [set_ProxyAuthorization](./set_proxyauthorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | Imposta un valore dell'intestazione 'Proxy-Authorization'. |
| [set_Range](./set_range/)(System::SharedPtr\<RangeHeaderValue\>) | Imposta un valore dell'intestazione 'Range'. |
| [set_Referrer](./set_referrer/)(System::SharedPtr\<Uri\>) | Imposta un valore dell'intestazione 'Referer'. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | Imposta un valore che indica se il valore dell'intestazione 'Transfer-Encoding' contiene 'Chunked'. |
## Vedi anche

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
