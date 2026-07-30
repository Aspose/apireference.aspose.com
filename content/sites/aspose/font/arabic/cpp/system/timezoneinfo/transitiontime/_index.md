---
title: "فئة System::TimeZoneInfo::TransitionTime"
linktitle: "TransitionTime"
second_title: "Aspose.Font لـ C++"
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
| static [CreateFixedDateRule](./createfixeddaterule/)(DateTime, int, int) | ينشئ مثيلاً من فئة [TransitionTime](./) التي تمثل قاعدة تاريخ ثابت (تغيير الوقت الذي يحدث في يوم محدد من شهر معين). |
| static [CreateFloatingDateRule](./createfloatingdaterule/)(DateTime, int, int, DayOfWeek) | ينشئ مثيلاً من فئة [TransitionTime](./) التي تمثل قاعدة تاريخ عائم (تغيير الوقت الذي يحدث في يوم محدد من أسبوع معين من شهر معين). |
| static [CreateTransitionTime](./createtransitiontime/)(DateTime, int, int, int, DayOfWeek, bool) | ينشئ مثيلاً من فئة [TransitionTime](./) التي تمثل تغيير الوقت الموصوف بالمعلمات المحددة. |
| [get_Day](./get_day/)() const | يعيد الرقم الترتيبي ليوم الأسبوع الذي يحدث فيه تغيير الوقت. |
| [get_DayOfWeek](./get_dayofweek/)() const | يعيد القيمة التي تمثل يوم الأسبوع الذي يحدث فيه تغيير الوقت. |
| [get_IsFixedDateRule](./get_isfixeddaterule/)() const | يعيد القيمة التي تشير إلى ما إذا كان تغيير الوقت يحدث في تاريخ ووقت ثابت أو في تاريخ ووقت عائم. |
| [get_Month](./get_month/)() const | يعيد الرقم الترتيبي للشهر من السنة الذي يحدث فيه تغيير الوقت. |
| [get_TimeOfDay](./get_timeofday/)() const | يعيد كائن [DateTime](../../datetime/) الذي يمثل الوقت المحدد الذي يحدث فيه تغيير الوقت. |
| [get_Week](./get_week/)() const | يعيد الرقم الترتيبي للأسبوع من الشهر الذي يحدث فيه تغيير الوقت. |
| [operator!=](./operator!=/)(const TransitionTime\&) const |  |
| [operator==](./operator==/)(const TransitionTime\&) const |  |
| [TransitionTime](./transitiontime/)() | منشئ افتراضي. للاستخدام الداخلي فقط. |
## ملاحظات


يوفر معلومات حول تغيير الوقت في منطقة زمنية.
## انظر أيضًا

* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
