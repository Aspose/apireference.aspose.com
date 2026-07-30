---
title: "System::Net::Http::Headers::RangeItemHeaderValue Klasse"
linktitle: "RangeItemHeaderValue"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::RangeItemHeaderValue Klasse. Stellt einen Byte-Bereich in einem Wert des ''Range''-Headers dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2100
url: /de/cpp/system.net.http.headers/rangeitemheadervalue/
---
## RangeItemHeaderValue class


Stellt einen Byte-Bereich in einem Wert des 'Range'-Headers dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class RangeItemHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-Semantik von [Object.Equals](../../system/object/equals/). |
| [get_From](./get_from/)() | RTTI-Informationen. |
| [get_To](./get_to/)() | Gibt eine Position zurück, an der das Senden von Daten gestoppt werden muss. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [GetRangeItemLength](./getrangeitemlength/)(String, int32_t, System::SharedPtr\<RangeItemHeaderValue\>\&) | Konvertiert einen übergebenen String ab dem angegebenen Index in eine Instanz der [RangeItemHeaderValue](./)-Klasse. |
| static [GetRangeItemListLength](./getrangeitemlistlength/)(String, int32_t, System::SharedPtr\<Collections::Generic::ICollection\<System::SharedPtr\<RangeItemHeaderValue\>\>\>) | Konvertiert einen übergebenen String ab der angegebenen Position in die Sammlung von Instanzen der RangeItemHeaderValue-Klasse. |
| [RangeItemHeaderValue](./rangeitemheadervalue/)(Nullable\<int64_t\>, Nullable\<int64_t\>) | Erstellt eine neue Instanz. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
