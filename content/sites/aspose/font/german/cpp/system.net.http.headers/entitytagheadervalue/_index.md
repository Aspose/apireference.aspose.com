---
title: "System::Net::Http::Headers::EntityTagHeaderValue Klasse"
linktitle: "EntityTagHeaderValue"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::EntityTagHeaderValue Klasse. Stellt einen Wert des ''Entity-Tag''-Headers dar. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 500
url: /de/cpp/system.net.http.headers/entitytagheadervalue/
---
## EntityTagHeaderValue class


Stellt einen Wert des 'Entity-Tag'-Headers dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class EntityTagHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String) | Erstellt eine neue Instanz. |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String, bool) | Erstellt eine neue Instanz. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-Semantik von [Object.Equals](../../system/object/equals/). |
| static [get_Any](./get_any/)() | Gibt einen Wert des 'ETag'-Headers zurück. |
| [get_IsWeak](./get_isweak/)() | Gibt einen Wert zurück, der angibt, ob die aktuelle Instanz ein schwacher Validator ist. |
| [get_Tag](./get_tag/)() | RTTI-Informationen. |
| static [GetEntityTagLength](./getentitytaglength/)(String, int32_t, System::SharedPtr\<EntityTagHeaderValue\>\&) | Konvertiert einen übergebenen String ab dem angegebenen Index in eine Instanz der Klasse [EntityTagHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [Parse](./parse/)(String) | Konvertiert einen übergebenen String in eine Instanz der Klasse [EntityTagHeaderValue](./). |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<EntityTagHeaderValue\>\&) | Versucht, einen übergebenen String in eine Instanz der Klasse [EntityTagHeaderValue](./) zu konvertieren. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
