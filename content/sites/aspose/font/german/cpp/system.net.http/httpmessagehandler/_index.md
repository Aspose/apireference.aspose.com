---
title: "System::Net::Http::HttpMessageHandler Klasse"
linktitle: "HttpMessageHandler"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::HttpMessageHandler Klasse. Stellt einen Basistyp für die HTTP-Nachrichtenhandler dar. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben in C++."
type: docs
weight: 500
url: /de/cpp/system.net.http/httpmessagehandler/
---
## HttpMessageHandler class


Stellt einen Basistyp für die HTTP-Nachrichtenhandler dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HttpMessageHandler : public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Dispose](./dispose/)() override | Tut nichts. |
| virtual [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) | RTTI-Informationen. |
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
