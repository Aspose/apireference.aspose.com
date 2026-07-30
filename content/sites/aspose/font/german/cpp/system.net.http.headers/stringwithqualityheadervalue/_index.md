---
title: "System::Net::Http::Headers::StringWithQualityHeaderValue Klasse"
linktitle: "StringWithQualityHeaderValue"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::StringWithQualityHeaderValue Klasse. Stellt einen Wert mit einer zusätzlichen Qualitätsangabe eines String-Headers dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2300
url: /de/cpp/system.net.http.headers/stringwithqualityheadervalue/
---
## StringWithQualityHeaderValue class


Stellt einen Wert mit einer zusätzlichen Qualitätsangabe eines String-Headers dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class StringWithQualityHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-Semantik von [Object.Equals](../../system/object/equals/). |
| [get_Quality](./get_quality/)() | Gibt eine Qualität zurück. |
| [get_Value](./get_value/)() | RTTI-Informationen. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [GetStringWithQualityLength](./getstringwithqualitylength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Konvertiert einen übergebenen String ab dem angegebenen Index in eine Instanz der Klasse [StringWithQualityHeaderValue](./). |
| static [Parse](./parse/)(String) | Konvertiert einen übergebenen String in eine Instanz der Klasse [StringWithQualityHeaderValue](./). |
| [StringWithQualityHeaderValue](./stringwithqualityheadervalue/)(String) | Erstellt eine neue Instanz. |
| [StringWithQualityHeaderValue](./stringwithqualityheadervalue/)(String, double) | Erstellt eine neue Instanz. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<StringWithQualityHeaderValue\>\&) | Versucht, einen übergebenen String in eine Instanz der Klasse [StringWithQualityHeaderValue](./) zu konvertieren. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
