---
title: "System::Net::Http::Headers::ProductInfoHeaderValue Klasse"
linktitle: "ProductInfoHeaderValue"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::ProductInfoHeaderValue Klasse. Stellt ein Produkt oder einen Kommentar in einem Wert des ''User-Agent''-Headers dar. Objekte dieser Klasse sollten nur mit der System::MakeObject()-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1800
url: /de/cpp/system.net.http.headers/productinfoheadervalue/
---
## ProductInfoHeaderValue class


Stellt ein Produkt oder einen Kommentar in einem Wert des 'User-Agent'-Headers dar. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class ProductInfoHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-Semantik von [Object.Equals](../../system/object/equals/). |
| [get_Comment](./get_comment/)() | Gibt einen Kommentar zurück. |
| [get_Product](./get_product/)() | RTTI-Informationen. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [GetProductInfoLength](./getproductinfolength/)(String, int32_t, System::SharedPtr\<ProductInfoHeaderValue\>\&) | Konvertiert einen übergebenen String ab dem angegebenen Index in eine Instanz der [ProductInfoHeaderValue](./) Klasse. |
| static [Parse](./parse/)(String) | Konvertiert einen übergebenen String in eine Instanz der [ProductInfoHeaderValue](./) Klasse. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String, String) | Erstellt eine neue Instanz. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(System::SharedPtr\<ProductHeaderValue\>) | Erstellt eine neue Instanz. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String) | Erstellt eine neue Instanz. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductInfoHeaderValue\>\&) | Versucht, einen übergebenen String in eine Instanz der [ProductInfoHeaderValue](./) Klasse zu konvertieren. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
