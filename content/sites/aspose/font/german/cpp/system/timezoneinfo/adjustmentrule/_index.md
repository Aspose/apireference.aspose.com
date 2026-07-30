---
title: "System::TimeZoneInfo::AdjustmentRule-Klasse"
linktitle: "AdjustmentRule"
second_title: "Aspose.Font für C++"
description: "System::TimeZoneInfo::AdjustmentRule-Klasse. Liefert Informationen über eine Zeitzonenanpassung. Objekte dieser Klasse sollten nur mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr-Zeiger ein und verwenden Sie diesen Zeiger, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 3300
url: /de/cpp/system/timezoneinfo/adjustmentrule/
---
## AdjustmentRule class


Liefert Informationen über eine Zeitzonenanpassung. Objekte dieser Klasse sollten nur mit der Funktion [System::MakeObject()](../../makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../smartptr/)-Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class AdjustmentRule : public System::IEquatable<AdjustmentRulePtr>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) | Konstruiert eine Instanz der [AdjustmentRule](./)-Klasse, die eine Zeitanpassungsregel darstellt, die mit den angegebenen Parametern beschrieben wird. |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) | Konstruiert eine Instanz der [AdjustmentRule](./)-Klasse, die eine Zeitanpassungsregel darstellt, die mit den angegebenen Parametern beschrieben wird. |
| [Equals](./equals/)(AdjustmentRulePtr) override |  |
| [get_BaseUtcOffsetDelta](./get_baseutcoffsetdelta/)() const | Gibt ein Delta vom Standard-UTC-Offset zurück. |
| [get_DateEnd](./get_dateend/)() const | Gibt ein [DateTime](../../datetime/)-Objekt zurück, das das Datum und die Uhrzeit darstellt, zu der die Anpassungsregel nicht mehr wirksam ist. |
| [get_DateStart](./get_datestart/)() const | Gibt ein [DateTime](../../datetime/)-Objekt zurück, das das Datum und die Uhrzeit darstellt, zu der die Anpassungsregel in Kraft tritt. |
| [get_DaylightDelta](./get_daylightdelta/)() const | Gibt ein [TimeSpan](../../timespan/)-Objekt zurück, das die Zeitdauer darstellt, die erforderlich ist, um die Sommerzeit der Zeitzone zu bilden. |
| [get_DaylightTransitionEnd](./get_daylighttransitionend/)() const | Gibt die Informationen über den Übergang von der Standardzeit zur Sommerzeit zurück. |
| [get_DaylightTransitionStart](./get_daylighttransitionstart/)() const | Gibt die Informationen über den Übergang von der Sommerzeit zur Standardzeit zurück. |
| [get_HasDaylightSaving](./get_hasdaylightsaving/)() const | FÜR INTERNEN GEBRAUCH. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
## Siehe auch

* Class [IEquatable](../../iequatable/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
