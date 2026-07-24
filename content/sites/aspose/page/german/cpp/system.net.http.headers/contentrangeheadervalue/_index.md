---
title: "System::Net::Http::Headers::ContentRangeHeaderValue class"
linktitle: "ContentRangeHeaderValue"
second_title: "Aspose.Page für C++"
description: "System::Net::Http::Headers::ContentRangeHeaderValue class. Stellt einen Wert des ''Content-Range''-Headers dar. Objekte dieser Klasse sollten nur mit der System::MakeObject()-Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 400
url: /de/cpp/system.net.http.headers/contentrangeheadervalue/
---
## ContentRangeHeaderValue class


Stellt einen Wert des 'Content-Range'-Headers dar. Objekte dieser Klasse sollten nur mit der [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ContentRangeHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t, int64_t) | Konstruiert eine neue Instanz. |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t) | Konstruiert eine neue Instanz. |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t) | Konstruiert eine neue Instanz. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-[Object.Equals](../../system/object/equals/)-Semantik. |
| [get_From](./get_from/)() | Liefert eine Position, an der das Senden von Daten beginnen muss. |
| [get_HasLength](./get_haslength/)() const | Ruft einen Wert ab, der angibt, ob die Länge für den aktuellen Header angegeben ist. |
| [get_HasRange](./get_hasrange/)() const | Ruft einen Wert ab, der angibt, ob der Bereich für den aktuellen Header angegeben ist. |
| [get_Length](./get_length/)() | Ruft die Länge eines Entitätskörpers ab. |
| [get_To](./get_to/)() | Ruft eine Position ab, an der das Senden von Daten gestoppt werden muss. |
| [get_Unit](./get_unit/)() | RTTI-Informationen. |
| static [GetContentRangeLength](./getcontentrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Konvertiert einen übergebenen String ab der angegebenen Position in eine Instanz der [ContentRangeHeaderValue](./)-Klasse. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [Parse](./parse/)(String) | Konvertiert einen übergebenen String in eine Instanz der [ContentRangeHeaderValue](./)-Klasse. |
| [set_Unit](./set_unit/)(String) | Legt die im Bereich verwendeten Einheiten fest. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Konvertierung benutzerdefinierter Objekte in einen String. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentRangeHeaderValue\>\&) | Versucht, einen übergebenen String in eine Instanz der [ContentRangeHeaderValue](./)-Klasse zu konvertieren. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
