---
title: "System::Net::Http::HttpClient Klasse"
linktitle: "HttpClient"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::HttpClient Klasse. Stellt eine Basisklasse eines HTTP-Clients zum Senden von Anfragen und Empfangen von Antworten dar. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 200
url: /de/cpp/system.net.http/httpclient/
---
## HttpClient class


Stellt eine Basisklasse eines HTTP-Clients zum Senden von Anfragen und Empfangen von Antworten dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HttpClient : public System::Net::Http::HttpMessageInvoker
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CancelPendingRequests](./cancelpendingrequests/)() | Bricht alle ausstehenden Anfragen ab. |
| [get_BaseAddress](./get_baseaddress/)() | Liefert die Basisadresse der Ressource, die zum Senden von Anfragen verwendet wird. |
| [get_DefaultRequestHeaders](./get_defaultrequestheaders/)() | RTTI-Informationen. |
| [get_MaxResponseContentBufferSize](./get_maxresponsecontentbuffersize/)() | Liefert die maximale Anzahl von Bytes des Antwortinhalts. |
| [get_Timeout](./get_timeout/)() | Liefert die Zeitspanne, die gewartet werden soll, bevor die Anfrage abläuft. |
| [HttpClient](./httpclient/)() | Erstellt eine neue Instanz. |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>) | Erstellt eine neue Instanz. |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>, bool) | Erstellt eine neue Instanz. |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>, HttpCompletionOption) | Sendet die angegebene HTTP-Anfrage. |
| [set_BaseAddress](./set_baseaddress/)(System::SharedPtr\<Uri\>) | Setzt die Basisadresse der Ressource, die zum Senden von Anfragen verwendet wird. |
| [set_MaxResponseContentBufferSize](./set_maxresponsecontentbuffersize/)(int64_t) | Setzt die maximale Anzahl von Bytes des Antwortinhalts. |
| [set_Timeout](./set_timeout/)(TimeSpan) | Setzt die Zeitspanne, die gewartet werden soll, bevor die Anfrage abläuft. |
## Siehe auch

* Class [HttpMessageInvoker](../httpmessageinvoker/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
