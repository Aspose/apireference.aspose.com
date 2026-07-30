---
title: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule metodu"
linktitle: "CreateAdjustmentRule"
second_title: "Aspose.Font için C++"
description: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule metodu. C++'da belirtilen parametrelerle tanımlanan zaman ayarlama kuralını temsil eden AdjustmentRule sınıfının bir örneğini oluşturur."
type: docs
weight: 1000
url: /tr/cpp/system/timezoneinfo/adjustmentrule/createadjustmentrule/
---
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) method


Belirtilen parametrelerle tanımlanan bir zaman ayarlama kuralını temsil eden [AdjustmentRule](../) sınıfının bir örneğini oluşturur.

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| date_start | DateTime | Ayarlama kuralının yürürlüğe girdiği tarih ve saat. |
| date_end | DateTime | Ayarlama kuralının geçerliliğini kaybettiği tarih ve saat. |
| daylight_delta | TimeSpan | Zaman diliminin yaz saati uygulamasını oluşturmak için gereken süre. |
| daylight_transition_start | const TransitionTime\& | Yaz saati uygulamasından standart zamana geçiş hakkında bilgi. |
| daylight_transition_end | const TransitionTime\& | Standart zamandan yaz saati uygulamasına geçiş hakkında bilgi. |

### ReturnValue

Tanımlanan zaman dilimi ayarlama kuralını temsil eden [AdjustmentRule](../) sınıfının bir örneği.

## Ayrıca Bakınız

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Font for C++](../../../../)
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) method


Belirtilen parametrelerle tanımlanan bir zaman ayarlama kuralını temsil eden [AdjustmentRule](../) sınıfının bir örneğini oluşturur.

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end, TimeSpan base_utc_offset_delta, bool no_daylight_transitions)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| date_start | DateTime | Ayarlama kuralının yürürlüğe girdiği tarih ve saat. |
| date_end | DateTime | Ayarlama kuralının geçerliliğini kaybettiği tarih ve saat. |
| daylight_delta | TimeSpan | Zaman diliminin yaz saati uygulamasını oluşturmak için gereken süre. |
| daylight_transition_start | const TransitionTime\& | Yaz saati uygulamasından standart zamana geçiş hakkında bilgi. |
| daylight_transition_end | const TransitionTime\& | Standart zamandan yaz saati uygulamasına geçiş hakkında bilgi. |
| base_utc_offset_delta | TimeSpan | Varsayılan UTC ofsetinden delta. |
| no_daylight_transitions | bool | Ayarlama kuralının yaz saati uygulamasına geçişi varsayıp varsaymadığını belirtir. |

### ReturnValue

Tanımlanan zaman dilimi ayarlama kuralını temsil eden [AdjustmentRule](../) sınıfının bir örneği.

## Ayrıca Bakınız

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Font for C++](../../../../)
