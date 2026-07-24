---
title: "System::Net::Http::Headers::EntityTagHeaderValue Klasse"
linktitle: "EntityTagHeaderValue"
second_title: "Aspose.Page für C++"
description: "System::Net::Http::Headers::EntityTagHeaderValue Klasse. Stellt einen Wert des ''Entity-Tag''-Headers dar. Objekte dieser Klasse sollten nur über die System::MakeObject()-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 500
url: /de/cpp/system.net.http.headers/entitytagheadervalue/
---
## EntityTagHeaderValue class


Stellt einen Wert des 'Entity-Tag'-Headers dar. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/)-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class EntityTagHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String) | Konstruiert eine neue Instanz. |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String, bool) | Konstruiert eine neue Instanz. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-[Object.Equals](../../system/object/equals/)-Semantik. |
| static [get_Any](./get_any/)() | Ruft einen Wert des 'ETag'-Headers ab. |
| [get_IsWeak](./get_isweak/)() | Ruft einen Wert ab, der angibt, ob die aktuelle Instanz ein schwacher Validator ist. |
| [get_Tag](./get_tag/)() | RTTI-Informationen. |
| static [GetEntityTagLength](./getentitytaglength/)(String, int32_t, System::SharedPtr\<EntityTagHeaderValue\>\&) | Konvertiert einen übergebenen String ab dem angegebenen Index in eine Instanz der [EntityTagHeaderValue](./)-Klasse. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [Parse](./parse/)(String) | Konvertiert einen übergebenen String in eine Instanz der [EntityTagHeaderValue](./)-Klasse. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Konvertierung benutzerdefinierter Objekte in einen String. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<EntityTagHeaderValue\>\&) | Versucht, einen übergebenen String in eine Instanz der [EntityTagHeaderValue](./)-Klasse zu konvertieren. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
