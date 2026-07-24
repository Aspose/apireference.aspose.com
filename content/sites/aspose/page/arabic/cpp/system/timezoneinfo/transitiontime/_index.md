---
title: "فئة System::TimeZoneInfo::TransitionTime"
linktitle: "TransitionTime"
second_title: "Aspose.Page لـ C++"
description: "فئة System::TimeZoneInfo::TransitionTime. معلومات RTTI في C++."
type: docs
weight: 3400
url: /ar/cpp/system/timezoneinfo/transitiontime/
---
## TransitionTime class


معلومات RTTI.

```cpp
class TransitionTime
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [CreateFixedDateRule](./createfixeddaterule/)(DateTime, int, int) | ينشئ مثيلاً من فئة [TransitionTime](./) التي تمثل قاعدة تاريخ ثابت (تغيير وقت يحدث في يوم محدد من شهر محدد). |
| static [CreateFloatingDateRule](./createfloatingdaterule/)(DateTime, int, int, DayOfWeek) | ينشئ مثيلاً من فئة [TransitionTime](./) التي تمثل قاعدة تاريخ عائم (تغيير وقت يحدث في يوم محدد من أسبوع محدد من شهر محدد). |
| static [CreateTransitionTime](./createtransitiontime/)(DateTime, int, int, int, DayOfWeek, bool) | ينشئ مثيلاً من فئة [TransitionTime](./) التي تمثل تغيير وقت موصوف بالمعلمات المحددة. |
| [get_Day](./get_day/)() const | يرجع الرقم الترتيبي ليوم الأسبوع الذي يحدث فيه تغيير الوقت. |
| [get_DayOfWeek](./get_dayofweek/)() const | يرجع القيمة التي تمثل يوم الأسبوع الذي يحدث فيه تغيير الوقت. |
| [get_IsFixedDateRule](./get_isfixeddaterule/)() const | يرجع القيمة التي تشير إلى ما إذا كان تغيير الوقت يحدث في تاريخ ووقت ثابت أو تاريخ ووقت عائم. |
| [get_Month](./get_month/)() const | يرجع الرقم الترتيبي للشهر من السنة الذي يحدث فيه تغيير الوقت. |
| [get_TimeOfDay](./get_timeofday/)() const | يرجع كائن [DateTime](../../datetime/) الذي يمثل الوقت المحدد الذي يحدث فيه تغيير الوقت. |
| [get_Week](./get_week/)() const | يرجع الرقم الترتيبي للأسبوع من الشهر الذي يحدث فيه تغيير الوقت. |
| [operator!=](./operator!=/)(const TransitionTime\&) const |  |
| [operator==](./operator==/)(const TransitionTime\&) const |  |
| [TransitionTime](./transitiontime/)() | منشئ افتراضي. للاستخدام الداخلي فقط. |
## ملاحظات


يوفر معلومات حول تغيير الوقت في منطقة زمنية.
## انظر أيضًا

* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
