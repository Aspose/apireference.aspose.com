---
title: "System::Net::Http::Headers::HttpResponseHeaders Klasse"
linktitle: "HttpResponseHeaders"
second_title: "Aspose.Page für C++"
description: "System::Net::Http::Headers::HttpResponseHeaders Klasse. Stellt die Sammlung der ''Response''-Header dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1100
url: /de/cpp/system.net.http.headers/httpresponseheaders/
---
## HttpResponseHeaders class


Stellt die Sammlung der 'Response'-Header dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HttpResponseHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | Verkettet die angegebene HttpHeaders-Klasseninstanz mit der aktuellen. |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Fügt die bekannten Header zur angegebenen Sammlung hinzu. |
| [get_AcceptRanges](./get_acceptranges/)() | RTTI-Informationen. |
| [get_Age](./get_age/)() | Liest den Wert des 'Age'-Headers. |
| [get_CacheControl](./get_cachecontrol/)() | Ermittelt einen Wert des 'Cache-Control'-Headers. |
| [get_Connection](./get_connection/)() | Gibt einen Wert des 'Connection'-Headers zurück. |
| [get_ConnectionClose](./get_connectionclose/)() | Ermittelt einen Wert, der angibt, ob der 'Connection'-Header den Wert 'Close' enthält. |
| [get_Date](./get_date/)() | Ermittelt einen Wert des 'Date'-Headers. |
| [get_ETag](./get_etag/)() | Ruft einen Wert des 'ETag'-Headers ab. |
| [get_Location](./get_location/)() | Liest den Wert des 'Location'-Headers. |
| [get_Pragma](./get_pragma/)() | Gibt einen Wert des 'Pragma'-Headers zurück. |
| [get_ProxyAuthenticate](./get_proxyauthenticate/)() | Gibt den Wert des 'Proxy-Authenticate'-Headers zurück. |
| [get_RetryAfter](./get_retryafter/)() | Liest den Wert des 'Retry-After'-Headers. |
| [get_Server](./get_server/)() | Gibt den Wert des 'Server'-Headers zurück. |
| [get_Trailer](./get_trailer/)() | Gibt einen Wert des 'Trailer'-Headers zurück. |
| [get_TransferEncoding](./get_transferencoding/)() | Gibt einen Wert des 'Transfer-Encoding'-Headers zurück. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | Liefert einen Wert, der angibt, ob der 'Transfer-Encoding'-Headerwert 'Chunked' enthält. |
| [get_Upgrade](./get_upgrade/)() | Gibt einen Wert des 'Upgrade'-Headers zurück. |
| [get_Vary](./get_vary/)() | Gibt den Wert des 'Vary'-Headers zurück. |
| [get_Via](./get_via/)() | Gibt einen Wert des 'Via'-Headers zurück. |
| [get_Warning](./get_warning/)() | Gibt einen Wert des 'Warning'-Headers zurück. |
| [get_WwwAuthenticate](./get_wwwauthenticate/)() | Gibt den Wert des 'WWW-Authenticate'-Headers zurück. |
| [HttpResponseHeaders](./httpresponseheaders/)() | Konstruiert eine neue Instanz. |
| [set_Age](./set_age/)(Nullable\<TimeSpan\>) | Setzt den Wert des 'Age'-Headers. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | Setzt einen Wert des 'Cache-Control'-Headers. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | Setzt einen Wert, der angibt, ob der 'Connection'-Headerwert 'Close' enthält. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | Setzt einen Wert des 'Date'-Headers. |
| [set_ETag](./set_etag/)(System::SharedPtr\<EntityTagHeaderValue\>) | Setzt den Wert des 'ETag'-Headers. |
| [set_Location](./set_location/)(System::SharedPtr\<Uri\>) | Setzt den Wert des 'Location'-Headers. |
| [set_RetryAfter](./set_retryafter/)(System::SharedPtr\<RetryConditionHeaderValue\>) | Setzt den Wert des 'Retry-After'-Headers. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | Setzt einen Wert, der angibt, ob der 'Transfer-Encoding'-Headerwert 'Chunked' enthält. |
## Siehe auch

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
