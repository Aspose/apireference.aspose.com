---
title: "System::Net::Http::Headers::WarningHeaderValue Klasse"
linktitle: "WarningHeaderValue"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::WarningHeaderValue Klasse. Stellt einen Wert des ''Warning''-Headers dar. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2700
url: /de/cpp/system.net.http.headers/warningheadervalue/
---
## WarningHeaderValue class


Stellt einen Wert des 'Warning'-Headers dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class WarningHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-Semantik von [Object.Equals](../../system/object/equals/). |
| [get_Agent](./get_agent/)() | Gibt den dem Warning zugeordneten Host zurück. |
| [get_Code](./get_code/)() | RTTI-Informationen. |
| [get_Date](./get_date/)() | Gibt das Datum und die Uhrzeit des Warnings zurück. |
| [get_Text](./get_text/)() | Gibt den Warnungstext zurück. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [GetWarningLength](./getwarninglength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Konvertiert einen übergebenen String ab dem angegebenen Index in eine Instanz der [WarningHeaderValue](./)-Klasse. |
| static [Parse](./parse/)(String) | Konvertiert einen übergebenen String in eine Instanz der [WarningHeaderValue](./) Klasse. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<WarningHeaderValue\>\&) | Versucht, einen übergebenen String in eine Instanz der [WarningHeaderValue](./) Klasse zu konvertieren. |
| [WarningHeaderValue](./warningheadervalue/)(int32_t, String, String) | Erstellt eine neue Instanz. |
| [WarningHeaderValue](./warningheadervalue/)(int32_t, String, String, DateTimeOffset) | Erstellt eine neue Instanz. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
