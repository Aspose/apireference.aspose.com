---
title: "System::Net::Http::HttpRequestMessage Klasse"
linktitle: "HttpRequestMessage"
second_title: "Aspose.Page für C++"
description: "System::Net::Http::HttpRequestMessage Klasse. Stellt eine HTTP‑Anforderungsnachricht dar. Objekte dieser Klasse dürfen nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben in C++."
type: docs
weight: 800
url: /de/cpp/system.net.http/httprequestmessage/
---
## HttpRequestMessage class


Stellt eine HTTP‑Anforderungsnachricht dar. Objekte dieser Klasse dürfen nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HttpRequestMessage : public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Dispose](./dispose/)() override | Gibt die aktuelle Instanz frei. Diese Methode gibt auch den Inhalt der HTTP‑Anfrage frei. |
| [get_Content](./get_content/)() | Liefert den Inhalt der HTTP‑Anfrage. |
| [get_Headers](./get_headers/)() | Gibt die HTTP‑Inhaltsheader zurück. |
| [get_Method](./get_method/)() | Gibt die HTTP-Anforderungsmethode zurück. |
| [get_Properties](./get_properties/)() | Gibt die Sammlung der HTTP-Anforderungseigenschaften zurück. |
| [get_RequestUri](./get_requesturi/)() | Liefert die URI der angeforderten Ressource. |
| [get_Version](./get_version/)() | RTTI-Informationen. |
| [HttpRequestMessage](./httprequestmessage/)() | Konstruiert eine neue Instanz. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, System::SharedPtr\<Uri\>) | Konstruiert eine neue Instanz. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, String) | Konstruiert eine neue Instanz. |
| [MarkAsSent](./markassent/)() | Markiert die aktuelle Anforderung als gesendet. |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | Setzt den Inhalt der HTTP-Anforderung. |
| [set_Method](./set_method/)(System::SharedPtr\<HttpMethod\>) | Setzt die HTTP-Anforderungsmethode. |
| [set_RequestUri](./set_requesturi/)(System::SharedPtr\<Uri\>) | Setzt die URI der angeforderten Ressource. |
| [set_Version](./set_version/)(System::Version) | Setzt die HTTP-Version. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Konvertierung benutzerdefinierter Objekte in einen String. |
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
