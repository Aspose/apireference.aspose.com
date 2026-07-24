---
title: "System::TimeZoneInfo::TransitionTime-klasse"
linktitle: "TransitionTime"
second_title: "Aspose.Page voor C++"
description: "System::TimeZoneInfo::TransitionTime-klasse. RTTI-informatie in C++."
type: docs
weight: 3400
url: /nl/cpp/system/timezoneinfo/transitiontime/
---
## TransitionTime class


RTTI-informatie.

```cpp
class TransitionTime
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [CreateFixedDateRule](./createfixeddaterule/)(DateTime, int, int) | Construeert een instantie van de [TransitionTime](./)-klasse die een vaste-datumregel vertegenwoordigt (tijdwijziging die optreedt op een specifieke dag van een specifieke maand). |
| static [CreateFloatingDateRule](./createfloatingdaterule/)(DateTime, int, int, DayOfWeek) | Construeert een instantie van de [TransitionTime](./)-klasse die een zwevende-datumregel vertegenwoordigt (tijdwijziging die optreedt op een specifieke dag van een specifieke week van een specifieke maand). |
| static [CreateTransitionTime](./createtransitiontime/)(DateTime, int, int, int, DayOfWeek, bool) | Construeert een instantie van de [TransitionTime](./)-klasse die een tijdwijziging weergeeft die is beschreven met de opgegeven parameters. |
| [get_Day](./get_day/)() const | Retourneert het rangnummer van de dag van de week waarop de tijdwijziging plaatsvindt. |
| [get_DayOfWeek](./get_dayofweek/)() const | Retourneert de waarde die de dag van de week aangeeft waarop de tijdwijziging plaatsvindt. |
| [get_IsFixedDateRule](./get_isfixeddaterule/)() const | Retourneert de waarde die aangeeft of de tijdwijziging plaatsvindt op een vaste datum en tijd of op een zwevende datum en tijd. |
| [get_Month](./get_month/)() const | Retourneert het rangnummer van de maand van het jaar waarop de tijdwijziging plaatsvindt. |
| [get_TimeOfDay](./get_timeofday/)() const | Retourneert een [DateTime](../../datetime/)-object dat de specifieke tijd weergeeft waarop de tijdwijziging plaatsvindt. |
| [get_Week](./get_week/)() const | Retourneert het rangnummer van de week van de maand waarop de tijdwijziging plaatsvindt. |
| [operator!=](./operator!=/)(const TransitionTime\&) const |  |
| [operator==](./operator==/)(const TransitionTime\&) const |  |
| [TransitionTime](./transitiontime/)() | Standaardconstructor. VOOR INTERN GEBRUIK. |
## Opmerkingen


Biedt informatie over een tijdwijziging in een tijdzone.
## Zie ook

* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
