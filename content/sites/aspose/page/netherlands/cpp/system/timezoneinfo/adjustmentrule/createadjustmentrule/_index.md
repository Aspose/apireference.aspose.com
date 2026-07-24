---
title: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule methode"
linktitle: "CreateAdjustmentRule"
second_title: "Aspose.Page voor C++"
description: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule methode. Construeert een instantie van de AdjustmentRule-klasse die een tijdsaanpassingsregel weergeeft die is beschreven met de opgegeven parameters in C++."
type: docs
weight: 1000
url: /nl/cpp/system/timezoneinfo/adjustmentrule/createadjustmentrule/
---
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) method


Construeert een instantie van de [AdjustmentRule](../) klasse die een tijdsaanpassingsregel weergeeft die is beschreven met de opgegeven parameters.

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| date_start | DateTime | De datum en tijd waarop de aanpassingsregel van kracht wordt. |
| date_end | DateTime | De datum en tijd waarop de aanpassingsregel niet meer van kracht is. |
| daylight_delta | TimeSpan | De hoeveelheid tijd die nodig is om de zomertijd van de tijdzone te vormen. |
| daylight_transition_start | const TransitionTime\& | De informatie over de overgang van zomertijd naar standaardtijd. |
| daylight_transition_end | const TransitionTime\& | De informatie over de overgang van standaardtijd naar zomertijd. |

### ReturnValue

Een instantie van de klasse [AdjustmentRule](../) die de beschreven tijdzone-aanpassingsregel vertegenwoordigt.

## Zie ook

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Page for C++](../../../../)
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) method


Construeert een instantie van de [AdjustmentRule](../) klasse die een tijdsaanpassingsregel weergeeft die is beschreven met de opgegeven parameters.

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end, TimeSpan base_utc_offset_delta, bool no_daylight_transitions)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| date_start | DateTime | De datum en tijd waarop de aanpassingsregel van kracht wordt. |
| date_end | DateTime | De datum en tijd waarop de aanpassingsregel niet meer van kracht is. |
| daylight_delta | TimeSpan | De hoeveelheid tijd die nodig is om de zomertijd van de tijdzone te vormen. |
| daylight_transition_start | const TransitionTime\& | De informatie over de overgang van zomertijd naar standaardtijd. |
| daylight_transition_end | const TransitionTime\& | De informatie over de overgang van standaardtijd naar zomertijd. |
| base_utc_offset_delta | TimeSpan | De delta ten opzichte van de standaard UTC-offset. |
| no_daylight_transitions | bool | Specificeert of de aanpassingsregel de overgang naar zomertijd aanneemt. |

### ReturnValue

Een instantie van de klasse [AdjustmentRule](../) die de beschreven tijdzone-aanpassingsregel vertegenwoordigt.

## Zie ook

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Page for C++](../../../../)
