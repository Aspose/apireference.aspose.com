---
title: "طريقة System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule"
linktitle: "CreateFloatingDateRule"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule. تُنشئ كائنًا من فئة TransitionTime يمثل قاعدة تاريخ عائم (تغيير الوقت الذي يحدث في يوم محدد من أسبوع محدد من شهر محدد) في C++."
type: docs
weight: 1100
url: /ar/cpp/system/timezoneinfo/transitiontime/createfloatingdaterule/
---
## TransitionTime::CreateFloatingDateRule method


تنشئ كائنًا من فئة [TransitionTime](../) يمثل قاعدة تاريخ عائم (تغيير الوقت الذي يحدث في يوم محدد من أسبوع محدد من شهر محدد).

```cpp
static TransitionTime System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule(DateTime time_of_day, int month, int week, DayOfWeek day_of_week)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| time_of_day | DateTime | الوقت المحدد الذي يحدث فيه تغيير الوقت. |
| شهر | int | الشهر من السنة الذي يحدث فيه تغيير الوقت. |
| الأسبوع | int | الأسبوع من الشهر الذي يحدث فيه تغيير الوقت. |
| day_of_week | DayOfWeek | يوم الأسبوع الذي يحدث فيه تغيير الوقت. |

### ReturnValue

كائن من فئة [TransitionTime](../) يمثل تغيير الوقت الموصوف.

## انظر أيضًا

* Class [TransitionTime](../)
* Class [DateTime](../../../datetime/)
* Enum [DayOfWeek](../../../dayofweek/)
* Class [TransitionTime](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Page for C++](../../../../)
