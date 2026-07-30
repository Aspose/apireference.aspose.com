---
title: "System::TimeZoneInfo::TransitionTime::CreateTransitionTime yöntemi"
linktitle: "CreateTransitionTime"
second_title: "Aspose.Font için C++"
description: "System::TimeZoneInfo::TransitionTime::CreateTransitionTime yöntemi. C++'ta belirtilen parametrelerle tanımlanan bir zaman değişikliğini temsil eden TransitionTime sınıfının bir örneğini oluşturur."
type: docs
weight: 1200
url: /tr/cpp/system/timezoneinfo/transitiontime/createtransitiontime/
---
## TransitionTime::CreateTransitionTime method


Belirtilen parametrelerle tanımlanan bir zaman değişikliğini temsil eden [TransitionTime](../) sınıfının bir örneğini oluşturur.

```cpp
static TransitionTime System::TimeZoneInfo::TransitionTime::CreateTransitionTime(DateTime time_of_day, int month, int week, int day, DayOfWeek day_of_week, bool is_fixed_date_rule)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| time_of_day | DateTime | Zaman değişikliğinin gerçekleştiği belirli zaman. |
| ay | int | Zaman değişikliğinin gerçekleştiği yılın ayı. |
| week | int | Zaman değişikliğinin gerçekleştiği ayın haftası. |
| gün | int | Zaman değişikliğinin gerçekleştiği gün. |
| day_of_week | DayOfWeek | Zaman değişikliğinin gerçekleştiği haftanın günü. |
| is_fixed_date_rule | bool | Zaman değişikliğinin sabit bir tarih ve saatde mi yoksa değişken bir tarih ve saatte mi gerçekleştiğini gösteren değer. |

### ReturnValue

Aşağıdaki zaman değişikliğini temsil eden bir [TransitionTime](../) sınıfı örneği.

## Ayrıca Bakınız

* Class [TransitionTime](../)
* Class [DateTime](../../../datetime/)
* Enum [DayOfWeek](../../../dayofweek/)
* Class [TransitionTime](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Font for C++](../../../../)
