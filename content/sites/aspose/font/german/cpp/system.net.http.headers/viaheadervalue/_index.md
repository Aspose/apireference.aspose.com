---
title: "System::Net::Http::Headers::ViaHeaderValue Klasse"
linktitle: "ViaHeaderValue"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::ViaHeaderValue Klasse. Stellt einen Wert des ''Via''-Headers dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2600
url: /de/cpp/system.net.http.headers/viaheadervalue/
---
## ViaHeaderValue class


Stellt einen Wert des 'Via'-Headers dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ViaHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-Semantik von [Object.Equals](../../system/object/equals/). |
| [get_Comment](./get_comment/)() | Gibt den Kommentar aus dem 'Via'-Headerwert zurück. |
| [get_ProtocolName](./get_protocolname/)() | RTTI-Informationen. |
| [get_ProtocolVersion](./get_protocolversion/)() | Gibt die Protokollversion aus dem 'Via'-Headerwert zurück. |
| [get_ReceivedBy](./get_receivedby/)() | Gibt den Host und den Port zurück, über die die Anforderung oder Antwort empfangen wurde. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [GetViaLength](./getvialength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Konvertiert einen übergebenen String ab dem angegebenen Index in eine Instanz der [ViaHeaderValue](./) Klasse. |
| static [Parse](./parse/)(String) | Konvertiert einen übergebenen String in eine Instanz der [ViaHeaderValue](./) Klasse. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ViaHeaderValue\>\&) | Versucht, einen übergebenen String in eine Instanz der [ViaHeaderValue](./) Klasse zu konvertieren. |
| [ViaHeaderValue](./viaheadervalue/)(String, String) | Erstellt eine neue Instanz. |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String) | Erstellt eine neue Instanz. |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String, String) | Erstellt eine neue Instanz. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
