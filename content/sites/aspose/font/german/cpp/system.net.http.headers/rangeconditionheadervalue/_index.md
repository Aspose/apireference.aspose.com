---
title: "System::Net::Http::Headers::RangeConditionHeaderValue Klasse"
linktitle: "RangeConditionHeaderValue"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::RangeConditionHeaderValue Klasse. Stellt einen Wert des ''If-Range''-Headers dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1900
url: /de/cpp/system.net.http.headers/rangeconditionheadervalue/
---
## RangeConditionHeaderValue class


Stellt einen Wert des 'If-Range'-Headers dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class RangeConditionHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-Semantik von [Object.Equals](../../system/object/equals/). |
| [get_Date](./get_date/)() | RTTI-Informationen. |
| [get_EntityTag](./get_entitytag/)() | Gibt einen 'ETag'-Headerwert zurück. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [GetRangeConditionLength](./getrangeconditionlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Konvertiert einen übergebenen String ab dem angegebenen Index in eine Instanz der [RangeConditionHeaderValue](./)-Klasse. |
| static [Parse](./parse/)(String) | Konvertiert einen übergebenen String in eine Instanz der [RangeConditionHeaderValue](./)-Klasse. |
| [RangeConditionHeaderValue](./rangeconditionheadervalue/)(DateTimeOffset) | Erstellt eine neue Instanz. |
| [RangeConditionHeaderValue](./rangeconditionheadervalue/)(System::SharedPtr\<EntityTagHeaderValue\>) | Erstellt eine neue Instanz. |
| [RangeConditionHeaderValue](./rangeconditionheadervalue/)(String) | Erstellt eine neue Instanz. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RangeConditionHeaderValue\>\&) | Versucht, einen übergebenen String in eine Instanz der [RangeConditionHeaderValue](./)-Klasse zu konvertieren. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
