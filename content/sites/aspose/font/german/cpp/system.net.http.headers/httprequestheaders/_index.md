---
title: "System::Net::Http::Headers::HttpRequestHeaders Klasse"
linktitle: "HttpRequestHeaders"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::HttpRequestHeaders Klasse. Stellt die Sammlung der ''Request''-Header dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1000
url: /de/cpp/system.net.http.headers/httprequestheaders/
---
## HttpRequestHeaders class


Stellt die Sammlung der 'Request'-Header dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HttpRequestHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | Verkettet die angegebene HttpHeaders-Klasseninstanz mit der aktuellen. |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Fügt die bekannten Header zur angegebenen Sammlung hinzu. |
| [get_Accept](./get_accept/)() | RTTI-Informationen. |
| [get_AcceptCharset](./get_acceptcharset/)() | Gibt einen Wert des 'Accept-Charset'-Headers zurück. |
| [get_AcceptEncoding](./get_acceptencoding/)() | Gibt einen Wert des 'Accept-Encoding'-Headers zurück. |
| [get_AcceptLanguage](./get_acceptlanguage/)() | Gibt einen Wert des 'Accept-Language'-Headers zurück. |
| [get_Authorization](./get_authorization/)() | Liest einen Wert des 'Authorization'-Headers. |
| [get_CacheControl](./get_cachecontrol/)() | Liest einen Wert des 'Cache-Control'-Headers. |
| [get_Connection](./get_connection/)() | Gibt einen Wert des 'Connection'-Headers zurück. |
| [get_ConnectionClose](./get_connectionclose/)() | Liest einen Wert, der angibt, ob der 'Connection'-Headerwert 'Close' enthält. |
| [get_Date](./get_date/)() | Liest einen Wert des 'Date'-Headers. |
| [get_Expect](./get_expect/)() | Gibt den Wert des 'Expect'-Headers zurück. |
| [get_ExpectContinue](./get_expectcontinue/)() | Liest einen Wert, der angibt, ob der 'Expect'-Headerwert 'Continue' enthält. |
| [get_From](./get_from/)() | Liest einen Wert des 'From'-Headers. |
| [get_Host](./get_host/)() | Liest einen Wert des 'Host'-Headers. |
| [get_IfMatch](./get_ifmatch/)() | Gibt einen Wert des 'If-Match'-Headers zurück. |
| [get_IfModifiedSince](./get_ifmodifiedsince/)() | Liest einen Wert des 'If-Modified-Since'-Headers. |
| [get_IfNoneMatch](./get_ifnonematch/)() | Gibt einen Wert des 'If-None-Match'-Headers zurück. |
| [get_IfRange](./get_ifrange/)() | Liest einen Wert des 'If-Range'-Headers. |
| [get_IfUnmodifiedSince](./get_ifunmodifiedsince/)() | Liest einen Wert des 'If-Unmodified-Since'-Headers. |
| [get_MaxForwards](./get_maxforwards/)() | Liest einen Wert des 'Max-Forwards'-Headers. |
| [get_Pragma](./get_pragma/)() | Gibt einen Wert des 'Pragma'-Headers zurück. |
| [get_ProxyAuthorization](./get_proxyauthorization/)() | Liest einen Wert des 'Proxy-Authorization'-Headers. |
| [get_Range](./get_range/)() | Liest einen Wert des 'Range'-Headers. |
| [get_Referrer](./get_referrer/)() | Gibt einen Wert des 'Referer'-Headers zurück. |
| [get_TE](./get_te/)() | Gibt einen Wert des 'TE'-Headers zurück. |
| [get_Trailer](./get_trailer/)() | Gibt einen Wert des 'Trailer'-Headers zurück. |
| [get_TransferEncoding](./get_transferencoding/)() | Gibt einen Wert des 'Transfer-Encoding'-Headers zurück. |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | Ermittelt einen Wert, der angibt, ob der Wert des 'Transfer-Encoding'-Headers 'Chunked' enthält. |
| [get_Upgrade](./get_upgrade/)() | Gibt einen Wert des 'Upgrade'-Headers zurück. |
| [get_UserAgent](./get_useragent/)() | Gibt einen Wert des 'User-Agent'-Headers zurück. |
| [get_Via](./get_via/)() | Gibt einen Wert des 'Via'-Headers zurück. |
| [get_Warning](./get_warning/)() | Gibt einen Wert des 'Warning'-Headers zurück. |
| [HttpRequestHeaders](./httprequestheaders/)() | Erstellt eine neue Instanz. |
| [set_Authorization](./set_authorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | Setzt einen Wert des 'Authorization'-Headers. |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | Setzt einen Wert des 'Cache-Control'-Headers. |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | Setzt einen Wert, der angibt, ob der Wert des 'Connection'-Headers 'Close' enthält. |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | Setzt einen Wert des 'Date'-Headers. |
| [set_ExpectContinue](./set_expectcontinue/)(Nullable\<bool\>) | Setzt einen Wert, der angibt, ob der Wert des 'Expect'-Headers 'Continue' enthält. |
| [set_From](./set_from/)(String) | Setzt einen Wert des 'From'-Headers. |
| [set_Host](./set_host/)(String) | Setzt einen Wert des 'Host'-Headers. |
| [set_IfModifiedSince](./set_ifmodifiedsince/)(Nullable\<DateTimeOffset\>) | Setzt einen Wert des 'If-Modified-Since'-Headers. |
| [set_IfRange](./set_ifrange/)(System::SharedPtr\<RangeConditionHeaderValue\>) | Setzt einen Wert des 'If-Range'-Headers. |
| [set_IfUnmodifiedSince](./set_ifunmodifiedsince/)(Nullable\<DateTimeOffset\>) | Setzt einen Wert des 'If-Unmodified-Since'-Headers. |
| [set_MaxForwards](./set_maxforwards/)(Nullable\<int32_t\>) | Setzt einen Wert des 'Max-Forwards'-Headers. |
| [set_ProxyAuthorization](./set_proxyauthorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | Setzt einen Wert des 'Proxy-Authorization'-Headers. |
| [set_Range](./set_range/)(System::SharedPtr\<RangeHeaderValue\>) | Setzt einen Wert des 'Range'-Headers. |
| [set_Referrer](./set_referrer/)(System::SharedPtr\<Uri\>) | Legt einen Wert des 'Referer'-Headers fest. |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | Setzt einen Wert, der angibt, ob der Wert des 'Transfer-Encoding'-Headers 'Chunked' enthält. |
## Siehe auch

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
