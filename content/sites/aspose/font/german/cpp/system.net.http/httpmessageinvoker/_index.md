---
title: "System::Net::Http::HttpMessageInvoker Klasse"
linktitle: "HttpMessageInvoker"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::HttpMessageInvoker Klasse. Ermöglicht Anwendungen, die Send-Methode in einer HTTP-Handler-Kette aufzurufen. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 600
url: /de/cpp/system.net.http/httpmessageinvoker/
---
## HttpMessageInvoker class


Ermöglicht Anwendungen, die Send-Methode in einer HTTP-Handler-Kette aufzurufen. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HttpMessageInvoker : public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Dispose](./dispose/)() override | Gibt die aktuelle Instanz frei. Diese Methode gibt bei Bedarf auch den Handler frei. |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>) | RTTI-Informationen. |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>, bool) | Erstellt eine neue Instanz. |
| virtual [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) | Sendet die angegebene Anforderung. |
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
