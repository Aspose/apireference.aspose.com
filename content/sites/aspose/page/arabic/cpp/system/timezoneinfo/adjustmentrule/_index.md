---
title: "فئة System::TimeZoneInfo::AdjustmentRule"
linktitle: "AdjustmentRule"
second_title: "Aspose.Page لـ C++"
description: "فئة System::TimeZoneInfo::AdjustmentRule. توفر معلومات حول تعديل المنطقة الزمنية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت تشغيل أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3300
url: /ar/cpp/system/timezoneinfo/adjustmentrule/
---
## AdjustmentRule class


توفر معلومات حول تعديل المنطقة الزمنية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../makeobject/). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت تشغيل أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class AdjustmentRule : public System::IEquatable<AdjustmentRulePtr>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) | ينشئ مثيلًا من فئة [AdjustmentRule](./) التي تمثل قاعدة تعديل زمنية موصوفة بالمعلمات المحددة. |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) | ينشئ مثيلًا من فئة [AdjustmentRule](./) التي تمثل قاعدة تعديل زمنية موصوفة بالمعلمات المحددة. |
| [Equals](./equals/)(AdjustmentRulePtr) override |  |
| [get_BaseUtcOffsetDelta](./get_baseutcoffsetdelta/)() const | تُرجع فرقًا (دلتا) عن إزاحة UTC الافتراضية. |
| [get_DateEnd](./get_dateend/)() const | تُرجع كائنًا من نوع [DateTime](../../datetime/) يمثل التاريخ والوقت الذي يتوقف فيه قاعدة التعديل عن السريان. |
| [get_DateStart](./get_datestart/)() const | تُرجع كائنًا من نوع [DateTime](../../datetime/) يمثل التاريخ والوقت الذي يبدأ فيه سريان قاعدة التعديل. |
| [get_DaylightDelta](./get_daylightdelta/)() const | تُرجع كائنًا من نوع [TimeSpan](../../timespan/) يمثل مقدار الوقت المطلوب لتكوين التوقيت الصيفي للمنطقة الزمنية. |
| [get_DaylightTransitionEnd](./get_daylighttransitionend/)() const | تُرجع معلومات حول الانتقال من التوقيت القياسي إلى التوقيت الصيفي. |
| [get_DaylightTransitionStart](./get_daylighttransitionstart/)() const | تُرجع معلومات حول الانتقال من التوقيت الصيفي إلى التوقيت القياسي. |
| [get_HasDaylightSaving](./get_hasdaylightsaving/)() const | للاستخدام الداخلي. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
## انظر أيضًا

* Class [IEquatable](../../iequatable/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
