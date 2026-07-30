---
title: "System::Net::WebHeaderCollection Klasse"
linktitle: "WebHeaderCollection"
second_title: "Aspose.Font für C++"
description: "System::Net::WebHeaderCollection Klasse. Stellt die Sammlung der Protokoll‑Header dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3600
url: /de/cpp/system.net/webheadercollection/
---
## WebHeaderCollection class


Stellt die Sammlung der Protokoll‑Header dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class WebHeaderCollection : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(String, String) | Fügt das angegebene Paar aus Header‑Name und Header‑Wert zur Sammlung hinzu. |
| [Add](./add/)(HttpResponseHeader, String) | Fügt das angegebene Paar aus Header und Header‑Wert zur Sammlung hinzu. |
| [Add](./add/)(HttpRequestHeader, String) | Fügt das angegebene Paar aus Header und Header‑Wert zur Sammlung hinzu. |
| [AllKeys](./allkeys/)() | Gibt eine Sammlung von Header‑Namen zurück, die in der Sammlung gespeichert sind. |
| [get_Count](./get_count/)() const | Gibt die Anzahl der Elemente in der Sammlung zurück. |
| [get_Keys](./get_keys/)() | Gibt eine Sammlung von Header‑Namen zurück, die in der Sammlung gespeichert sind. |
| [GetKey](./getkey/)(int) | Gibt einen Schlüssel am angegebenen Index zurück. |
| [GetValues](./getvalues/)(String) | Gibt die Sammlung der Header‑Werte zurück. |
| [idx_get](./idx_get/)(HttpRequestHeader) | Ermittelt den Header‑Wert anhand des angegebenen Request‑Headers. |
| [idx_get](./idx_get/)(HttpResponseHeader) | Ermittelt den Header‑Wert anhand des angegebenen Response‑Headers. |
| [idx_get](./idx_get/)(String) | Ermittelt den Header‑Wert anhand des angegebenen Header‑Namens. |
| [idx_set](./idx_set/)(HttpRequestHeader, String) | Setzt den Header‑Wert des angegebenen Headers. |
| [idx_set](./idx_set/)(HttpResponseHeader, String) | Setzt den Header-Wert unter Verwendung des angegebenen Headers der Antwort. |
| [idx_set](./idx_set/)(String, String) | Setzt den Header-Wert unter Verwendung des angegebenen Header-Namens. |
| static [IsRestricted](./isrestricted/)(const String\&) | Prüft, ob der angegebene HTTP-Header für die Anforderung gesetzt werden kann. |
| [Remove](./remove/)(String) | Entfernt den Header anhand des angegebenen Header-Namens. |
| [Remove](./remove/)(HttpResponseHeader) | Entfernt den angegebenen Header der Antwort. |
| [Remove](./remove/)(HttpRequestHeader) | Entfernt den angegebenen Header der Anforderung. |
| [Set](./set/)(String, String) | Setzt den Wert des angegebenen Headers. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| [WebHeaderCollection](./webheadercollection/)() | Erstellt eine neue Instanz. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
