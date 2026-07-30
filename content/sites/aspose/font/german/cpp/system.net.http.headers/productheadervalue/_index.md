---
title: "System::Net::Http::Headers::ProductHeaderValue Klasse"
linktitle: "ProductHeaderValue"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::ProductHeaderValue Klasse. Stellt ein Produkttoken im Wert des ''User-Agent''-Headers dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1700
url: /de/cpp/system.net.http.headers/productheadervalue/
---
## ProductHeaderValue class


Stellt ein Produkttoken im Wert des 'User-Agent'-Headers dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ProductHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-Semantik von [Object.Equals](../../system/object/equals/). |
| [get_Name](./get_name/)() | RTTI-Informationen. |
| [get_Version](./get_version/)() | Gibt die Version des Produkttokens zurück. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [GetProductLength](./getproductlength/)(String, int32_t, System::SharedPtr\<ProductHeaderValue\>\&) | Konvertiert einen übergebenen String ab dem angegebenen Index in eine Instanz der Klasse [ProductHeaderValue](./). |
| static [Parse](./parse/)(String) | Konvertiert einen übergebenen String in eine Instanz der Klasse [ProductHeaderValue](./). |
| [ProductHeaderValue](./productheadervalue/)(String) | Erstellt eine neue Instanz. |
| [ProductHeaderValue](./productheadervalue/)(String, String) | Erstellt eine neue Instanz. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductHeaderValue\>\&) | Versucht, einen übergebenen String in eine Instanz der Klasse [ProductHeaderValue](./) zu konvertieren. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
