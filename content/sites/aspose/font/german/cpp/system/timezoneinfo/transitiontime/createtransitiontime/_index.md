---
title: "System::TimeZoneInfo::TransitionTime::CreateTransitionTime‑Methode"
linktitle: "CreateTransitionTime"
second_title: "Aspose.Font für C++"
description: "System::TimeZoneInfo::TransitionTime::CreateTransitionTime‑Methode. Erstellt eine Instanz der Klasse TransitionTime, die eine Zeitumstellung darstellt, die mit den angegebenen Parametern in C++ beschrieben wird."
type: docs
weight: 1200
url: /de/cpp/system/timezoneinfo/transitiontime/createtransitiontime/
---
## TransitionTime::CreateTransitionTime method


Erstellt eine Instanz der Klasse [TransitionTime](../), die eine Zeitumstellung darstellt, die mit den angegebenen Parametern beschrieben wird.

```cpp
static TransitionTime System::TimeZoneInfo::TransitionTime::CreateTransitionTime(DateTime time_of_day, int month, int week, int day, DayOfWeek day_of_week, bool is_fixed_date_rule)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| time_of_day | DateTime | Die spezifische Uhrzeit, zu der die Zeitumstellung erfolgt. |
| Monat | int | Der Monat des Jahres, in dem die Zeitumstellung erfolgt. |
| Woche | int | Die Woche des Monats, in der die Zeitumstellung erfolgt. |
| Tag | int | Der Tag, an dem die Zeitumstellung erfolgt. |
| day_of_week | DayOfWeek | Der Wochentag, an dem die Zeitumstellung erfolgt. |
| is_fixed_date_rule | bool | Wert, der angibt, ob die Zeitumstellung an einem festen Datum und einer festen Uhrzeit oder an einem variablen Datum und einer variablen Uhrzeit erfolgt. |

### ReturnValue

Eine Instanz der Klasse [TransitionTime](../), die die beschriebene Zeitumstellung darstellt.

## Siehe auch

* Class [TransitionTime](../)
* Class [DateTime](../../../datetime/)
* Enum [DayOfWeek](../../../dayofweek/)
* Class [TransitionTime](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Font for C++](../../../../)
