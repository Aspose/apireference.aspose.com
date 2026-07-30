---
title: "System::TimeZone class"
linktitle: "TimeZone"
second_title: "Aspose.Font für C++"
description: "System::TimeZone class. Stellt eine Zeitzone dar. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Pointer ein und verwenden Sie diesen Pointer, um sie als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 6200
url: /de/cpp/system/timezone/
---
## TimeZone class


Stellt eine Zeitzone dar. Objekte dieser Klasse sollten ausschließlich mit der Funktion [System::MakeObject()](../makeobject/) alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../smartptr/)‑Pointer ein und verwenden Sie diesen Pointer, um sie als Argument an Funktionen zu übergeben.

```cpp
class TimeZone : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [get_CurrentTimeZone](./get_currenttimezone/)() | Gibt eine neue Instanz der Klasse [TimeZone](./) zurück, die die aktuelle Zeitzone darstellt. |
| virtual [get_DaylightName](./get_daylightname/)() const | Gibt einen Namen für die Sommerzeit der von dem aktuellen Objekt dargestellten Zeitzone zurück. |
| virtual [get_StandardName](./get_standardname/)() const | Gibt einen Namen für die Standardzeit der von dem aktuellen Objekt dargestellten Zeitzone zurück. |
| virtual [GetDaylightChanges](./getdaylightchanges/)(int32_t) | Gibt den Sommerzeit‑Zeitraum für ein bestimmtes Jahr zurück. |
| virtual [GetUtcOffset](./getutcoffset/)(DateTime) | Gibt den UTC‑Offset für die angegebene Ortszeit zurück. |
| virtual [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) | Bestimmt, ob der von dem angegebenen [DateTime](../datetime/)-Objekt dargestellte Datums‑ und Uhrzeitwert in den Sommerzeit‑Bereich der von dem aktuellen [TimeZone](./)-Objekt dargestellten Zeitzone fällt. |
## Siehe auch

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
