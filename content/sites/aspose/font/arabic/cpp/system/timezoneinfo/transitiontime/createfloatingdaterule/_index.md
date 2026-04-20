---
title: "طريقة System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule"
linktitle: "CreateFloatingDateRule"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule. تُنشئ مثيلاً من فئة TransitionTime التي تمثل قاعدة تاريخ عائمة (تغيير الوقت الذي يحدث في يوم محدد من أسبوع محدد من شهر محدد) في C++."
type: docs
weight: 1100
url: /ar/cpp/system/timezoneinfo/transitiontime/createfloatingdaterule/
---
## TransitionTime::CreateFloatingDateRule method


ينشئ مثيلاً من فئة [TransitionTime](../) التي تمثل قاعدة تاريخ عائمة (تغيير الوقت الذي يحدث في يوم محدد من أسبوع محدد من شهر محدد).

```cpp
static TransitionTime System::TimeZoneInfo::TransitionTime::CreateFloatingDateRule(DateTime time_of_day, int month, int week, DayOfWeek day_of_week)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| time_of_day | DateTime | الوقت المحدد الذي يحدث فيه تغيير الوقت. |
| الشهر | int | الشهر من السنة الذي يحدث فيه تغيير الوقت. |
| الأسبوع | int | الأسبوع من الشهر الذي يحدث فيه تغيير الوقت. |
| day_of_week | DayOfWeek | يوم الأسبوع الذي يحدث فيه تغيير الوقت. |

### ReturnValue

مثيل من فئة [TransitionTime](../) التي تمثل تغيير الوقت الموصوف.

## انظر أيضًا

* Class [TransitionTime](../)
* Class [DateTime](../../../datetime/)
* Enum [DayOfWeek](../../../dayofweek/)
* Class [TransitionTime](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Font for C++](../../../../)
