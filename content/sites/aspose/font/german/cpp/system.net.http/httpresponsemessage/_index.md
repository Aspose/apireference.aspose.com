---
title: "System::Net::Http::HttpResponseMessage Klasse"
linktitle: "HttpResponseMessage"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::HttpResponseMessage Klasse. Stellt eine HTTP-Antwortnachricht dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 900
url: /de/cpp/system.net.http/httpresponsemessage/
---
## HttpResponseMessage class


Stellt eine HTTP-Antwortnachricht dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class HttpResponseMessage : public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Dispose](./dispose/)() override | Entfernt die aktuelle Instanz. Diese Methode gibt auch den Inhalt der HTTP-Antwort frei. |
| [EnsureSuccessStatusCode](./ensuresuccessstatuscode/)() | Überprüft den Statuscode. [HttpRequestException](../httprequestexception/) wird ausgelöst, wenn der Statuscode nicht zu 2xx gehört. |
| [get_Content](./get_content/)() const | Liefert den Inhalt der HTTP-Antwort. |
| [get_Headers](./get_headers/)() const | Gibt die HTTP‑Inhaltsheader zurück. |
| [get_IsSuccessStatusCode](./get_issuccessstatuscode/)() const | Überprüft, ob der Statuscode anzeigt, dass die vom Client angeforderte Aktion empfangen, verstanden und akzeptiert wurde. |
| [get_ReasonPhrase](./get_reasonphrase/)() const | Liefert den Reason-Phrase, der von Servern zusammen mit dem Statuscode gesendet wird. |
| [get_RequestMessage](./get_requestmessage/)() const | Liefert die HTTP-Anforderungsnachricht. |
| [get_StatusCode](./get_statuscode/)() const | Liefert den HTTP-Statuscode. |
| [get_Version](./get_version/)() const | RTTI-Informationen. |
| [HttpResponseMessage](./httpresponsemessage/)() | Erstellt eine neue Instanz. |
| [HttpResponseMessage](./httpresponsemessage/)(HttpStatusCode) | Erstellt eine neue Instanz. |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | Setzt den Inhalt der HTTP-Antwort. |
| [set_ReasonPhrase](./set_reasonphrase/)(String) | Setzt den Reason-Phrase, der von Servern zusammen mit dem Statuscode gesendet wird. |
| [set_RequestMessage](./set_requestmessage/)(System::SharedPtr\<HttpRequestMessage\>) | Setzt die HTTP-Anforderungsnachricht. |
| [set_StatusCode](./set_statuscode/)(HttpStatusCode) | Setzt den HTTP-Statuscode. |
| [set_Version](./set_version/)(System::Version) | Setzt die HTTP-Version. |
| [ToString](./tostring/)() const override | [System::Object::ToString](../../system/object/tostring/). |
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
