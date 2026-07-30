---
title: "System::Net::Http::Headers::NameValueWithParametersHeaderValue Klasse"
linktitle: "NameValueWithParametersHeaderValue"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::NameValueWithParametersHeaderValue Klasse. Stellt ein Schlüssel/Wert-Paar mit Parametern dar, das in Headern verwendet wird. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 1500
url: /de/cpp/system.net.http.headers/namevaluewithparametersheadervalue/
---
## NameValueWithParametersHeaderValue class


Stellt ein Schlüssel/Wert-Paar mit Parametern dar, das in Headern verwendet wird. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen zu übergeben.

```cpp
class NameValueWithParametersHeaderValue : public System::Net::Http::Headers::NameValueHeaderValue
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-Semantik von [Object.Equals](../../system/object/equals/). |
| [get_Parameters](./get_parameters/)() | RTTI-Informationen. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [GetNameValueWithParametersLength](./getnamevaluewithparameterslength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Konvertiert einen übergebenen String ab dem angegebenen Index in eine Instanz der [NameValueWithParametersHeaderValue](./)-Klasse. |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)(String) | Erstellt eine neue Instanz. |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)(String, String) | Erstellt eine neue Instanz. |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)() | Erstellt eine neue Instanz. |
| static [Parse](./parse/)(String) | Konvertiert einen übergebenen String in eine Instanz der [NameValueWithParametersHeaderValue](./)-Klasse. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<NameValueWithParametersHeaderValue\>\&) | Versucht, einen übergebenen String in eine Instanz der [NameValueWithParametersHeaderValue](./)-Klasse zu konvertieren. |
## Siehe auch

* Class [NameValueHeaderValue](../namevalueheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
