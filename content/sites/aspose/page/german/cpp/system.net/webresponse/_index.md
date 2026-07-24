---
title: "System::Net::WebResponse Klasse"
linktitle: "WebResponse"
second_title: "Aspose.Page für C++"
description: "System::Net::WebResponse Klasse. Stellt eine Webantwort dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 4000
url: /de/cpp/system.net/webresponse/
---
## WebResponse class


Stellt eine Webantwort dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class WebResponse : public System::IDisposable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Close](./close/)() | Schließt den Antwort-Stream. |
| [Dispose](./dispose/)() override | Tut nichts. |
| virtual [get_ContentLength](./get_contentlength/)() | RTTI-Informationen. |
| virtual [get_ContentType](./get_contenttype/)() | Gibt den MIME-Typ der Ressource zurück. |
| virtual [get_Headers](./get_headers/)() | Gibt die Sammlung der Header zurück, die mit der aktuellen Antwort verknüpft sind. |
| virtual [get_ResponseUri](./get_responseuri/)() | Gibt die URI der Ressource zurück. |
| virtual [get_SupportsHeaders](./get_supportsheaders/)() | Gibt einen Wert zurück, der anzeigt, ob die aktuelle Antwort Header unterstützt. |
| virtual [GetResponseStream](./getresponsestream/)() | Gibt den Antwort-Stream zurück. |
## Siehe auch

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
