---
title: "System::TimeZoneInfo::TransitionTime-Klasse"
linktitle: "TransitionTime"
second_title: "Aspose.Font für C++"
description: "System::TimeZoneInfo::TransitionTime-Klasse. RTTI-Informationen in C++."
type: docs
weight: 3400
url: /de/cpp/system/timezoneinfo/transitiontime/
---
## TransitionTime class


RTTI-Informationen.

```cpp
class TransitionTime
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [CreateFixedDateRule](./createfixeddaterule/)(DateTime, int, int) | Konstruiert eine Instanz der [TransitionTime](./)-Klasse, die eine feste Datumsregel darstellt (Zeitumstellung, die an einem bestimmten Tag eines bestimmten Monats erfolgt). |
| static [CreateFloatingDateRule](./createfloatingdaterule/)(DateTime, int, int, DayOfWeek) | Konstruiert eine Instanz der [TransitionTime](./)-Klasse, die eine flexible Datumsregel darstellt (Zeitumstellung, die an einem bestimmten Tag einer bestimmten Woche eines bestimmten Monats erfolgt). |
| static [CreateTransitionTime](./createtransitiontime/)(DateTime, int, int, int, DayOfWeek, bool) | Konstruiert eine Instanz der [TransitionTime](./)-Klasse, die eine Zeitumstellung beschreibt, die mit den angegebenen Parametern definiert ist. |
| [get_Day](./get_day/)() const | Gibt die Ordnungszahl des Wochentags zurück, an dem die Zeitumstellung erfolgt. |
| [get_DayOfWeek](./get_dayofweek/)() const | Gibt den Wert zurück, der den Wochentag darstellt, an dem die Zeitumstellung erfolgt. |
| [get_IsFixedDateRule](./get_isfixeddaterule/)() const | Gibt den Wert zurück, der angibt, ob die Zeitumstellung zu einem festen Datum und einer festen Uhrzeit oder zu einem flexiblen Datum und einer flexiblen Uhrzeit erfolgt. |
| [get_Month](./get_month/)() const | Gibt die Ordnungszahl des Monats im Jahr zurück, in dem die Zeitumstellung erfolgt. |
| [get_TimeOfDay](./get_timeofday/)() const | Gibt ein [DateTime](../../datetime/)-Objekt zurück, das die spezifische Uhrzeit darstellt, zu der die Zeitumstellung erfolgt. |
| [get_Week](./get_week/)() const | Gibt die Ordnungszahl der Woche im Monat zurück, in der die Zeitumstellung erfolgt. |
| [operator!=](./operator!=/)(const TransitionTime\&) const |  |
| [operator==](./operator==/)(const TransitionTime\&) const |  |
| [TransitionTime](./transitiontime/)() | Standardkonstruktor. NUR FÜR INTERNEN GEBRAUCH. |
## Hinweise


Stellt Informationen über eine Zeitumstellung in einer Zeitzone bereit.
## Siehe auch

* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
