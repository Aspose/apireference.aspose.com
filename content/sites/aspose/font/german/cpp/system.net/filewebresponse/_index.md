---
title: "System::Net::FileWebResponse Klasse"
linktitle: "FileWebResponse"
second_title: "Aspose.Font für C++"
description: "System::Net::FileWebResponse Klasse. Bietet eine Implementierung der abstrakten Klasse WebResponse, um mit dem Dateisystem zu arbeiten. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1100
url: /de/cpp/system.net/filewebresponse/
---
## FileWebResponse class


Bietet eine Implementierung der abstrakten Klasse [WebResponse](../webresponse/), um mit dem Dateisystem zu arbeiten. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class FileWebResponse : public System::Net::WebResponse
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Close](./close/)() override | Schließt den Antwort-Stream. |
| [FileWebResponse](./filewebresponse/)(System::SharedPtr\<Uri\>) | Erstellt eine neue Instanz. |
| [get_ContentLength](./get_contentlength/)() override | RTTI-Informationen. |
| [get_ContentType](./get_contenttype/)() override | Gibt den MIME-Typ der Ressource zurück. |
| [get_Headers](./get_headers/)() override | Gibt die Sammlung der Header zurück, die mit der aktuellen Antwort verknüpft sind. |
| [get_ResponseUri](./get_responseuri/)() override | Gibt die URI der Ressource zurück. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | Gibt einen Wert zurück, der angibt, ob die aktuelle Antwort Header unterstützt. |
| [GetResponseStream](./getresponsestream/)() override | Gibt den Antwort-Stream zurück. |
## Siehe auch

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
