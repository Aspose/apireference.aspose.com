---
title: "System::Net::Http::Headers::RetryConditionHeaderValue Klasse"
linktitle: "RetryConditionHeaderValue"
second_title: "Aspose.Font für C++"
description: "System::Net::Http::Headers::RetryConditionHeaderValue Klasse. Stellt einen Wert des ''Retry-After''-Headers dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 2200
url: /de/cpp/system.net.http.headers/retryconditionheadervalue/
---
## RetryConditionHeaderValue class


Stellt einen Wert des 'Retry-After'-Headers dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class RetryConditionHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-Semantik von [Object.Equals](../../system/object/equals/). |
| [get_Date](./get_date/)() | RTTI-Informationen. |
| [get_Delta](./get_delta/)() | Gibt den Delta‑Wert zurück. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| static [GetRetryConditionLength](./getretryconditionlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | Konvertiert eine übergebene Zeichenkette ab dem angegebenen Index in eine Instanz der [RetryConditionHeaderValue](./) Klasse. |
| static [Parse](./parse/)(String) | Konvertiert eine übergebene Zeichenkette in eine Instanz der [RetryConditionHeaderValue](./) Klasse. |
| [RetryConditionHeaderValue](./retryconditionheadervalue/)(DateTimeOffset) | Erstellt eine neue Instanz. |
| [RetryConditionHeaderValue](./retryconditionheadervalue/)(TimeSpan) | Erstellt eine neue Instanz. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Umwandlung benutzerdefinierter Objekte in einen String. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RetryConditionHeaderValue\>\&) | Versucht, eine übergebene Zeichenkette in eine Instanz der [RetryConditionHeaderValue](./) Klasse zu konvertieren. |
## Siehe auch

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
