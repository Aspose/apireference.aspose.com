---
title: "System::Net::Http::Headers::HttpResponseHeaders Klasse"
linktitle: "HttpResponseHeaders"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::HttpResponseHeaders Klasse. Stellt die Sammlung der ''Response''‑Header dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1100
url: /de/cpp/system.net.http.headers/httpresponseheaders/
---
## HttpResponseHeaders class


Stellt die Sammlung der 'Response'-Header dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HttpResponseHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | Verkettet die angegebene HttpHeaders-Klasseninstanz mit der aktuellen. |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Fügt die bekannten Header zur angegebenen Sammlung hinzu. |
| [get_AcceptRanges](./get_acceptranges/)() | RTTI-Informationen. |
| [get_Age](./get_age/)() | Ermittelt den Wert des 'Age'-Headers. |
| [get_CacheControl](./get_cachecontrol/)() | Liest einen Wert des 'Cache-Control'-Headers. |
| [get_Connection](./get_connection/)() | Gibt einen Wert des 'Connection'-Headers zurück. |
| [get_ConnectionClose](./get_connectionclose/)() | Liest einen Wert, der angibt, ob der 'Connection'-Headerwert 'Close' enthält. |
| [get_Date](./get_date/)() | Liest einen Wert des 'Date'-Headers. |
| [get_ETag](./get_etag/)() | Gibt einen Wert des 'ETag'-Headers zurück. |
| [get_Location](./get_location/)() | Ermittelt den Wert des 'Location'-Headers. |
| [get_Pragma](./get_pragma/)() | Gibt einen Wert des 'Pragma'-Headers zurück. |
| [get_ProxyAuthenticate](./get_proxyauthenticate/)() | Gibt den Wert des 'Proxy-Authenticate'-Headers zurück. |
| [get_RetryAfter](./get_retryafter/)() | Ermittelt den Wert des 'Retry-After'-Headers. |
| [get_Server](./get_server/)() | Gibt den Wert des 'Server'-Headers zurück. |
| [get_Trailer](./get_trailer/)() | Gibt einen Wert des 'Trailer'-Headers zurück. |
| [get_TransferEncoding](./get_transferencoding/)() | Gibt einen Wert des 'Transfer-Encoding'-Headers zurück. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | Ermittelt einen Wert, der angibt, ob der Wert des 'Transfer-Encoding'-Headers 'Chunked' enthält. |
| [get_Upgrade](./get_upgrade/)() | Gibt einen Wert des 'Upgrade'-Headers zurück. |
| [get_Vary](./get_vary/)() | Gibt den Wert des 'Vary'-Headers zurück. |
| [get_Via](./get_via/)() | Gibt einen Wert des 'Via'-Headers zurück. |
| [get_Warning](./get_warning/)() | Gibt einen Wert des 'Warning'-Headers zurück. |
| [get_WwwAuthenticate](./get_wwwauthenticate/)() | Gibt den Wert des 'WWW-Authenticate'-Headers zurück. |
| [HttpResponseHeaders](./httpresponseheaders/)() | Erstellt eine neue Instanz. |
| [set_Age](./set_age/)(Nullable\<TimeSpan\>) | Setzt den Wert des 'Age'-Headers. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | Setzt einen Wert des 'Cache-Control'-Headers. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | Setzt einen Wert, der angibt, ob der Wert des 'Connection'-Headers 'Close' enthält. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | Setzt einen Wert des 'Date'-Headers. |
| [set_ETag](./set_etag/)(System::SharedPtr\<EntityTagHeaderValue\>) | Setzt den Wert des 'ETag'-Headers. |
| [set_Location](./set_location/)(System::SharedPtr\<Uri\>) | Setzt den Wert des 'Location'-Headers. |
| [set_RetryAfter](./set_retryafter/)(System::SharedPtr\<RetryConditionHeaderValue\>) | Setzt den Wert des 'Retry-After'-Headers. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | Setzt einen Wert, der angibt, ob der Wert des 'Transfer-Encoding'-Headers 'Chunked' enthält. |
## Siehe auch

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
