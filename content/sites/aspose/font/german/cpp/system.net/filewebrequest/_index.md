---
title: "System::Net::FileWebRequest Klasse"
linktitle: "FileWebRequest"
second_title: "Aspose.Font für C++"
description: "System::Net::FileWebRequest Klasse. Bietet eine Implementierung der abstrakten Klasse WebRequest, um mit dem Dateisystem zu arbeiten. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1000
url: /de/cpp/system.net/filewebrequest/
---
## FileWebRequest class


Stellt die Implementierung der abstrakten Klasse [WebRequest](../webrequest/) bereit, um mit dem Dateisystem zu arbeiten. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen Zeiger vom Typ [System::SmartPtr](../../system/smartptr/) ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class FileWebRequest : public System::Net::WebRequest
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Abort](./abort/)() override | Bricht die aktuelle Anforderung ab. |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | Startet einen asynchronen Vorgang, um einen Stream zum Schreiben von Daten in die Ressource zu erhalten. |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | Startet eine asynchrone Anforderung für die Ressource. |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | Wartet, bis der angegebene asynchrone Vorgang zum Abrufen eines Streams abgeschlossen ist. |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | Wartet, bis die angegebene asynchrone Anforderung für die Ressource abgeschlossen ist. |
| [FileWebRequest](./filewebrequest/)(System::SharedPtr\<Uri\>) | Erstellt eine neue Instanz. |
| [get_ContentType](./get_contenttype/)() override | Liest den MIME-Typ der Anforderung. |
| [get_Headers](./get_headers/)() override | Liest die Sammlung der HTTP-Header. |
| [get_Method](./get_method/)() override | Liest die HTTP-Methode. |
| [get_RequestUri](./get_requesturi/)() override | Gibt die Anforderungs-URI zurück. |
| [GetResponse](./getresponse/)() override | Gibt die Webantwort zurück, die mit der aktuellen Webanforderung verknüpft ist. |
| [set_ContentType](./set_contenttype/)(String) override | Setzt den MIME-Typ der Anforderung. |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | Setzt die Sammlung der HTTP-Header. |
| [set_Method](./set_method/)(String) override | Legt die HTTP-Methode fest. |
| [set_Timeout](./set_timeout/)(int) override | RTTI-Informationen. |
## Siehe auch

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
