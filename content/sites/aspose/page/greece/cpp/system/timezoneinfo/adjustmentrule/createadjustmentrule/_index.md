---
title: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule method"
linktitle: "CreateAdjustmentRule"
second_title: "Aspose.Page για C++"
description: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule method. Δημιουργεί μια παρουσία της κλάσης AdjustmentRule που αντιπροσωπεύει έναν κανόνα προσαρμογής χρόνου περιγραφόμενο με τις καθορισμένες παραμέτρους σε C++."
type: docs
weight: 1000
url: /el/cpp/system/timezoneinfo/adjustmentrule/createadjustmentrule/
---
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) method


Δημιουργεί μια παρουσία της κλάσης [AdjustmentRule](../) που αντιπροσωπεύει έναν κανόνα προσαρμογής ώρας περιγραφόμενο με τις καθορισμένες παραμέτρους.

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| date_start | DateTime | Η ημερομηνία και ώρα που ο κανόνας προσαρμογής τίθεται σε ισχύ. |
| date_end | DateTime | Η ημερομηνία και ώρα που ο κανόνας προσαρμογής παύει να ισχύει. |
| daylight_delta | TimeSpan | Το ποσό του χρόνου που απαιτείται για τη δημιουργία της θερινής ώρας της ζώνης ώρας. |
| daylight_transition_start | const TransitionTime\& | Οι πληροφορίες σχετικά με τη μετάβαση από τη θερινή ώρα στην κανονική ώρα. |
| daylight_transition_end | const TransitionTime\& | Οι πληροφορίες σχετικά με τη μετάβαση από την κανονική ώρα στη θερινή ώρα. |

### ReturnValue

Μια παρουσία της κλάσης [AdjustmentRule](../) που αντιπροσωπεύει τον περιγραφόμενο κανόνα προσαρμογής ζώνης ώρας.

## Δείτε επίσης

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Page for C++](../../../../)
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) method


Δημιουργεί μια παρουσία της κλάσης [AdjustmentRule](../) που αντιπροσωπεύει έναν κανόνα προσαρμογής ώρας περιγραφόμενο με τις καθορισμένες παραμέτρους.

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end, TimeSpan base_utc_offset_delta, bool no_daylight_transitions)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| date_start | DateTime | Η ημερομηνία και ώρα που ο κανόνας προσαρμογής τίθεται σε ισχύ. |
| date_end | DateTime | Η ημερομηνία και ώρα που ο κανόνας προσαρμογής παύει να ισχύει. |
| daylight_delta | TimeSpan | Το ποσό του χρόνου που απαιτείται για τη δημιουργία της θερινής ώρας της ζώνης ώρας. |
| daylight_transition_start | const TransitionTime\& | Οι πληροφορίες σχετικά με τη μετάβαση από τη θερινή ώρα στην κανονική ώρα. |
| daylight_transition_end | const TransitionTime\& | Οι πληροφορίες σχετικά με τη μετάβαση από την κανονική ώρα στη θερινή ώρα. |
| base_utc_offset_delta | TimeSpan | Η διαφορά από την προεπιλεγμένη μετατόπιση UTC. |
| no_daylight_transitions | bool | Καθορίζει εάν ο κανόνας προσαρμογής υποθέτει τη μετάβαση στην θερινή ώρα. |

### ReturnValue

Μια παρουσία της κλάσης [AdjustmentRule](../) που αντιπροσωπεύει τον περιγραφόμενο κανόνα προσαρμογής ζώνης ώρας.

## Δείτε επίσης

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Page for C++](../../../../)
