---
title: "System::Net::Http::Headers::RangeHeaderValue Klasse"
linktitle: "RangeHeaderValue"
second_title: "Aspose.Page für C++"
description: "System::Net::Http::Headers::RangeHeaderValue Klasse. Stellt einen Wert des ''Range''-Headers dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führen kann. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2000
url: /de/cpp/system.net.http.headers/rangeheadervalue/
---
## RangeHeaderValue class


Stellt einen Wert des 'Range'-Headers dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führen kann. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class RangeHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-[Object.Equals](../../system/object/equals/)-Semantik. |
| [get_Ranges](./get_ranges/)() | Gibt die Sammlung der Bereiche zurück. |
| [get_Unit](./get_unit/)() | RTTI-Informationen. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [GetRangeLength](./getrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Konvertiert eine übergebene Zeichenkette ab dem angegebenen Index in eine Instanz der Klasse [RangeHeaderValue](./). |
| static [Parse](./parse/)(String) | Konvertiert einen übergebenen String in eine Instanz der [RangeHeaderValue](./)-Klasse. |
| [RangeHeaderValue](./rangeheadervalue/)() | Konstruiert eine neue Instanz. |
| [RangeHeaderValue](./rangeheadervalue/)(Nullable\<int64_t\>, Nullable\<int64_t\>) | Konstruiert eine neue Instanz. |
| [set_Unit](./set_unit/)(String) | Setzt eine Einheit. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Konvertierung benutzerdefinierter Objekte in einen String. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RangeHeaderValue\>\&) | Versucht, einen übergebenen String in eine Instanz der [RangeHeaderValue](./)-Klasse zu konvertieren. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
