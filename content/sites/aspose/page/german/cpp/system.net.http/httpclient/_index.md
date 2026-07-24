---
title: "System::Net::Http::HttpClient Klasse"
linktitle: "HttpClient"
second_title: "Aspose.Page für C++"
description: "System::Net::Http::HttpClient class. Stellt eine Basisklasse eines HTTP‑Clients zum Senden von Anfragen und Empfangen von Antworten dar. Objekte dieser Klasse sollten nur mit der System::MakeObject()-Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben in C++."
type: docs
weight: 200
url: /de/cpp/system.net.http/httpclient/
---
## HttpClient class


Stellt eine Basisklasse eines HTTP‑Clients zum Senden von Anfragen und Empfangen von Antworten dar. Objekte dieser Klasse sollten nur mit der [System::MakeObject()](../../system/makeobject/)-Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HttpClient : public System::Net::Http::HttpMessageInvoker
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CancelPendingRequests](./cancelpendingrequests/)() | Bricht alle ausstehenden Anfragen ab. |
| [get_BaseAddress](./get_baseaddress/)() | Gibt die Basisadresse der Ressource zurück, die zum Senden von Anfragen verwendet wird. |
| [get_DefaultRequestHeaders](./get_defaultrequestheaders/)() | RTTI-Informationen. |
| [get_MaxResponseContentBufferSize](./get_maxresponsecontentbuffersize/)() | Gibt die maximale Anzahl von Bytes des Antwortinhalts zurück. |
| [get_Timeout](./get_timeout/)() | Gibt die Zeitspanne zurück, die gewartet werden soll, bevor die Anfrage abläuft. |
| [HttpClient](./httpclient/)() | Konstruiert eine neue Instanz. |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>) | Konstruiert eine neue Instanz. |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>, bool) | Konstruiert eine neue Instanz. |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>, HttpCompletionOption) | Sendet die angegebene HTTP‑Anfrage. |
| [set_BaseAddress](./set_baseaddress/)(System::SharedPtr\<Uri\>) | Legt die Basisadresse der Ressource fest, die zum Senden von Anfragen verwendet wird. |
| [set_MaxResponseContentBufferSize](./set_maxresponsecontentbuffersize/)(int64_t) | Legt die maximale Anzahl von Bytes des Antwortinhalts fest. |
| [set_Timeout](./set_timeout/)(TimeSpan) | Legt die Zeitspanne fest, die abgewartet wird, bevor die Anfrage abläuft. |
## Siehe auch

* Class [HttpMessageInvoker](../httpmessageinvoker/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
