---
title: "طريقة System::TimeZoneInfo::TransitionTime::CreateTransitionTime"
linktitle: "CreateTransitionTime"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::TimeZoneInfo::TransitionTime::CreateTransitionTime. تُنشئ مثيلاً لفئة TransitionTime التي تمثل تغيير وقت موصوف بالمعلمات المحددة في C++."
type: docs
weight: 1200
url: /ar/cpp/system/timezoneinfo/transitiontime/createtransitiontime/
---
## TransitionTime::CreateTransitionTime method


تنشئ مثيلاً لفئة [TransitionTime](../) التي تمثل تغيير وقت موصوف بالمعلمات المحددة.

```cpp
static TransitionTime System::TimeZoneInfo::TransitionTime::CreateTransitionTime(DateTime time_of_day, int month, int week, int day, DayOfWeek day_of_week, bool is_fixed_date_rule)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| time_of_day | DateTime | الوقت المحدد الذي يحدث فيه تغيير الوقت. |
| الشهر | int | الشهر من السنة الذي يحدث فيه تغيير الوقت. |
| الأسبوع | int | الأسبوع من الشهر الذي يحدث فيه تغيير الوقت. |
| اليوم | int | اليوم الذي يحدث فيه تغيير الوقت. |
| day_of_week | DayOfWeek | يوم الأسبوع الذي يحدث فيه تغيير الوقت. |
| is_fixed_date_rule | bool | القيمة التي تشير إلى ما إذا كان تغيير الوقت يحدث في تاريخ ووقت ثابت أو في تاريخ ووقت عائم. |

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
