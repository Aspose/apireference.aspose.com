---
title: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule Methode"
linktitle: "CreateAdjustmentRule"
second_title: "Aspose.Font für C++"
description: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule Methode. Erstellt eine Instanz der AdjustmentRule-Klasse, die eine Zeitanpassungsregel darstellt, die mit den angegebenen Parametern in C++ beschrieben wird."
type: docs
weight: 1000
url: /de/cpp/system/timezoneinfo/adjustmentrule/createadjustmentrule/
---
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) method


Konstruiert eine Instanz der [AdjustmentRule](../)-Klasse, die eine Zeitanpassungsregel darstellt, die mit den angegebenen Parametern beschrieben wird.

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| date_start | DateTime | Das Datum und die Uhrzeit, zu der die Anpassungsregel in Kraft tritt. |
| date_end | DateTime | Das Datum und die Uhrzeit, zu der die Anpassungsregel nicht mehr wirksam ist. |
| daylight_delta | TimeSpan | Der Zeitraum, der benötigt wird, um die Sommerzeit der Zeitzone zu bilden. |
| daylight_transition_start | const TransitionTime\& | Die Informationen über den Übergang von der Sommerzeit zur Normalzeit. |
| daylight_transition_end | const TransitionTime\& | Die Informationen über den Übergang von der Normalzeit zur Sommerzeit. |

### ReturnValue

Eine Instanz der [AdjustmentRule](../)-Klasse, die die beschriebene Zeitzonen-Anpassungsregel darstellt.

## Siehe auch

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Font for C++](../../../../)
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) method


Konstruiert eine Instanz der [AdjustmentRule](../)-Klasse, die eine Zeitanpassungsregel darstellt, die mit den angegebenen Parametern beschrieben wird.

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end, TimeSpan base_utc_offset_delta, bool no_daylight_transitions)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| date_start | DateTime | Das Datum und die Uhrzeit, zu der die Anpassungsregel in Kraft tritt. |
| date_end | DateTime | Das Datum und die Uhrzeit, zu der die Anpassungsregel nicht mehr wirksam ist. |
| daylight_delta | TimeSpan | Der Zeitraum, der benötigt wird, um die Sommerzeit der Zeitzone zu bilden. |
| daylight_transition_start | const TransitionTime\& | Die Informationen über den Übergang von der Sommerzeit zur Normalzeit. |
| daylight_transition_end | const TransitionTime\& | Die Informationen über den Übergang von der Normalzeit zur Sommerzeit. |
| base_utc_offset_delta | TimeSpan | Die Differenz zum Standard-UTC-Offset. |
| no_daylight_transitions | bool | Gibt an, ob die Anpassungsregel den Übergang zur Sommerzeit annimmt. |

### ReturnValue

Eine Instanz der [AdjustmentRule](../)-Klasse, die die beschriebene Zeitzonen-Anpassungsregel darstellt.

## Siehe auch

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Font for C++](../../../../)
