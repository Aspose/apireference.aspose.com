---
title: "System::Net::Http::Headers::ContentRangeHeaderValue Klasse"
linktitle: "ContentRangeHeaderValue"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::ContentRangeHeaderValue Klasse. Stellt einen Wert des ''Content-Range''-Headers dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 400
url: /de/cpp/system.net.http.headers/contentrangeheadervalue/
---
## ContentRangeHeaderValue class


Stellt einen Wert des 'Content-Range'-Headers dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ContentRangeHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t, int64_t) | Erstellt eine neue Instanz. |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t) | Erstellt eine neue Instanz. |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t) | Erstellt eine neue Instanz. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-Semantik von [Object.Equals](../../system/object/equals/). |
| [get_From](./get_from/)() | Ermittelt die Position, an der das Senden von Daten beginnen muss. |
| [get_HasLength](./get_haslength/)() const | Ermittelt einen Wert, der angibt, ob die Länge für den aktuellen Header angegeben ist. |
| [get_HasRange](./get_hasrange/)() const | Gibt einen Wert zurück, der angibt, ob der Bereich für den aktuellen Header angegeben ist. |
| [get_Length](./get_length/)() | Gibt die Länge des Entity-Body zurück. |
| [get_To](./get_to/)() | Gibt eine Position zurück, an der das Senden von Daten gestoppt werden muss. |
| [get_Unit](./get_unit/)() | RTTI-Informationen. |
| static [GetContentRangeLength](./getcontentrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Konvertiert einen übergebenen String ab der angegebenen Position in eine Instanz der Klasse [ContentRangeHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [Parse](./parse/)(String) | Konvertiert einen übergebenen String in eine Instanz der Klasse [ContentRangeHeaderValue](./). |
| [set_Unit](./set_unit/)(String) | Legt die im Bereich verwendeten Einheiten fest. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentRangeHeaderValue\>\&) | Versucht, einen übergebenen String in eine Instanz der Klasse [ContentRangeHeaderValue](./) zu konvertieren. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
