---
title: "System::Net::Http::Headers::HttpResponseHeaders class"
linktitle: "HttpResponseHeaders"
second_title: "Aspose.Font per C++"
description: "Classe System::Net::Http::Headers::HttpResponseHeaders. Rappresenta la raccolta delle intestazioni ''Response''. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 1100
url: /it/cpp/system.net.http.headers/httpresponseheaders/
---
## HttpResponseHeaders class


Rappresenta la raccolta delle intestazioni 'Response'. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarla alle funzioni come argomento.

```cpp
class HttpResponseHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | Concatena l'istanza della classe HttpHeaders specificata con quella corrente. |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Aggiunge le intestazioni conosciute alla raccolta specificata. |
| [get_AcceptRanges](./get_acceptranges/)() | Informazioni RTTI. |
| [get_Age](./get_age/)() | Ottiene il valore dell'intestazione 'Age'. |
| [get_CacheControl](./get_cachecontrol/)() | Ottiene un valore dell'intestazione 'Cache-Control'. |
| [get_Connection](./get_connection/)() | Restituisce un valore dell'intestazione 'Connection'. |
| [get_ConnectionClose](./get_connectionclose/)() | Ottiene un valore che indica se il valore dell'intestazione 'Connection' contiene 'Close'. |
| [get_Date](./get_date/)() | Ottiene un valore dell'intestazione 'Date'. |
| [get_ETag](./get_etag/)() | Restituisce un valore dell'intestazione 'ETag'. |
| [get_Location](./get_location/)() | Ottiene il valore dell'intestazione 'Location'. |
| [get_Pragma](./get_pragma/)() | Restituisce un valore dell'intestazione 'Pragma'. |
| [get_ProxyAuthenticate](./get_proxyauthenticate/)() | Restituisce un valore dell'intestazione 'Proxy-Authenticate'. |
| [get_RetryAfter](./get_retryafter/)() | Ottiene il valore dell'intestazione 'Retry-After'. |
| [get_Server](./get_server/)() | Restituisce un valore dell'intestazione 'Server'. |
| [get_Trailer](./get_trailer/)() | Restituisce un valore dell'intestazione 'Trailer'. |
| [get_TransferEncoding](./get_transferencoding/)() | Restituisce un valore dell'intestazione 'Transfer-Encoding'. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | Ottiene un valore che indica se il valore dell'intestazione 'Transfer-Encoding' contiene 'Chunked'. |
| [get_Upgrade](./get_upgrade/)() | Restituisce un valore dell'intestazione 'Upgrade'. |
| [get_Vary](./get_vary/)() | Restituisce un valore dell'intestazione 'Vary'. |
| [get_Via](./get_via/)() | Restituisce un valore dell'intestazione 'Via'. |
| [get_Warning](./get_warning/)() | Restituisce un valore dell'intestazione 'Warning'. |
| [get_WwwAuthenticate](./get_wwwauthenticate/)() | Restituisce un valore dell'intestazione 'WWW-Authenticate'. |
| [HttpResponseHeaders](./httpresponseheaders/)() | Crea una nuova istanza. |
| [set_Age](./set_age/)(Nullable\<TimeSpan\>) | Imposta un valore per l'intestazione 'Age'. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | Imposta un valore dell'intestazione 'Cache-Control'. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | Imposta un valore che indica se il valore dell'intestazione 'Connection' contiene 'Close'. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | Imposta un valore dell'intestazione 'Date'. |
| [set_ETag](./set_etag/)(System::SharedPtr\<EntityTagHeaderValue\>) | Imposta un valore per l'intestazione 'ETag'. |
| [set_Location](./set_location/)(System::SharedPtr\<Uri\>) | Imposta un valore per l'intestazione 'Location'. |
| [set_RetryAfter](./set_retryafter/)(System::SharedPtr\<RetryConditionHeaderValue\>) | Imposta un valore per l'intestazione 'Retry-After'. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | Imposta un valore che indica se il valore dell'intestazione 'Transfer-Encoding' contiene 'Chunked'. |
## Vedi anche

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
