---
title: "فئة System::TimeZoneInfo"
linktitle: "TimeZoneInfo"
second_title: "Aspose.Font لـ C++"
description: "فئة System::TimeZoneInfo. تمثل معلومات تصف منطقة زمنية معينة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبب أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 6300
url: /ar/cpp/system/timezoneinfo/
---
## TimeZoneInfo class


تمثل معلومات تصف منطقة زمنية معينة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبب أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class TimeZoneInfo : public System::IEquatable<TimeZoneInfoPtr>
```

## Nested classes

* Class [AdjustmentRule](./adjustmentrule/)
* Class [TransitionTime](./transitiontime/)
## الطرق

| طريقة | الوصف |
| --- | --- |
| static [ClearCachedData](./clearcacheddata/)() | مسح بيانات المنطقة الزمنية المخزنة مؤقتًا. |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) الوقت من منطقة زمنية إلى أخرى. |
| static [ConvertTime](./converttime/)(const DateTimeOffset\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) الوقت إلى الوقت في منطقة زمنية محددة. |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&) | [Convert](../convert/) الوقت إلى الوقت في منطقة زمنية محددة. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&) | [Convert](../convert/) الوقت إلى الوقت في منطقة زمنية محددة. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(const DateTimeOffset\&, const String\&) | [Convert](../convert/) الوقت إلى الوقت في منطقة زمنية محددة. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&, const String\&) | [Convert](../convert/) الوقت إلى الوقت في منطقة زمنية محددة. |
| static [ConvertTimeFromUtc](./converttimefromutc/)(DateTime, const TimeZoneInfoPtr\&) | يحوّل الوقت بتوقيت UTC إلى الوقت في منطقة زمنية محددة. |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime, const TimeZoneInfoPtr\&) | يحوّل الوقت إلى توقيت UTC. |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime) | يحوّل الوقت إلى توقيت UTC. |
| static [ConvertTimeToUtcNoThrow](./converttimetoutcnothrow/)(DateTime) | يحوّل الوقت إلى توقيت UTC. للاستخدام الداخلي. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) | ينشئ منطقة زمنية مخصصة. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) | ينشئ منطقة زمنية مخصصة. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&) | ينشئ منطقة زمنية مخصصة. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(TimeZoneInfoPtr) override | يحدد ما إذا كانت الكائنات الحالية والمحددة متساوية. |
| static [FindSystemTimeZoneById](./findsystemtimezonebyid/)(const String\&) | يحصل على المنطقة الزمنية ذات المعرف المحدد. |
| [get_BaseUtcOffset](./get_baseutcoffset/)() const | يعيد نسخة من [TimeSpan](../timespan/) تمثل فترة زمنية بين الوقت القياسي للمنطقة الزمنية الحالية وتوقيت UTC. |
| [get_DaylightName](./get_daylightname/)() const | يحصل على اسم التوقيت الصيفي للمنطقة الزمنية الحالية. |
| [get_DisplayName](./get_displayname/)() const | يحصل على اسم المنطقة الزمنية الحالية. |
| [get_Id](./get_id/)() const | يعيد المعرف الخاص بالمنطقة الزمنية التي يمثلها الكائن الحالي. |
| static [get_Local](./get_local/)() | يعيد نسخة من [TimeZoneInfo](./) تمثل منطقة زمنية محلية. |
| [get_StandardName](./get_standardname/)() const | يحصل على اسم الوقت القياسي للمنطقة الزمنية الحالية. |
| [get_SupportsDaylightSavingTime](./get_supportsdaylightsavingtime/)() const | يحصل على علامة تشير إلى ما إذا كانت المنطقة الزمنية لديها قواعد التوقيت الصيفي. |
| static [get_Utc](./get_utc/)() | يعيد نسخة من [TimeZoneInfo](./) تمثل منطقة زمنية بتوقيت UTC. |
| [GetAdjustmentRules](./getadjustmentrules/)() const | يعيد مصفوفة تتكون من كائنات [AdjustmentRule](./adjustmentrule/) التي تمثل قواعد التعديل التي تُطبق على كائن [TimeZoneInfo](./) الحالي. |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(DateTime) const | يحصل على تواريخ وأوقات UTC التي يمكن ربط تاريخ ووقت محددين بها. |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(const DateTimeOffset\&) const | يحصل على تواريخ وأوقات UTC التي يمكن ربط تاريخ ووقت محددين بها. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| static [GetSystemTimeZones](./getsystemtimezones/)() | يحصل على مجموعة مرتبة من جميع المناطق الزمنية المتاحة على النظام المحلي. |
| [GetUtcOffset](./getutcoffset/)(DateTime) const | يحسب الفرق بين الوقت في هذه المنطقة الزمنية والمنطقة الزمنية UTC لتاريخ ووقت محددين. |
| [GetUtcOffset](./getutcoffset/)(const DateTimeOffset\&) const | يحسب الفرق بين الوقت في هذه المنطقة الزمنية والمنطقة الزمنية UTC لتاريخ ووقت محددين. |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&) | دالة مساعدة داخلية تُعيد إزاحة UTC لتاريخ‑وقت UTC في منطقة زمنية محددة. للاستخدام الداخلي فقط. |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&, bool\&, bool\&) | دالة مساعدة داخلية تُعيد إزاحة UTC لتاريخ‑وقت UTC في منطقة زمنية محددة. للاستخدام الداخلي فقط. |
| [GetUtcOffsetNoThrow](./getutcoffsetnothrow/)(DateTime) const | يحسب الفرق بين الوقت في هذه المنطقة الزمنية والمنطقة الزمنية UTC لتاريخ ووقت محددين. للاستخدام الداخلي فقط. |
| [HasSameRules](./hassamerules/)(const TimeZoneInfoPtr\&) const | يتحقق مما إذا كانت المنطقة الزمنية الحالية وأخرى تتبع نفس قواعد التعديل. |
| [IsAmbiguousTime](./isambiguoustime/)(DateTime) const | يتحقق مما إذا كان التاريخ والوقت المحددان غامضين ويمكن ربطهما بالعديد من أوقات UTC. |
| [IsAmbiguousTime](./isambiguoustime/)(const DateTimeOffset\&) const | يتحقق مما إذا كان التاريخ والوقت المحددان غامضين ويمكن ربطهما بالعديد من أوقات UTC. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) const | يتحقق مما إذا كان التاريخ والوقت المحددان يقعان ضمن فترة التوقيت الصيفي. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(const DateTimeOffset\&) const | يتحقق مما إذا كان التاريخ والوقت المحددان يقعان ضمن فترة التوقيت الصيفي. |
| [IsDaylightSavingTimeNoThrow](./isdaylightsavingtimenothrow/)(DateTime) const | يتحقق مما إذا كان التاريخ والوقت المحددان يقعان ضمن فترة التوقيت الصيفي. |
| [IsInvalidTime](./isinvalidtime/)(DateTime) const | يتحقق مما إذا كان التاريخ والوقت المحددان غير صالحين. |
| [ToString](./tostring/)() const override | نظير طريقة C# [Object.ToString()](../object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة نصية. |
| static [TransitionTimeToDateTime](./transitiontimetodatetime/)(int32_t, const TransitionTime\&) | دالة مساعدة تحول سنة و[TransitionTime](./transitiontime/) إلى [DateTime](../datetime/). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [AdjustmentRulePtr](./adjustmentruleptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من فئة [AdjustmentRule](./adjustmentrule/). |
## انظر أيضًا

* Class [IEquatable](../iequatable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
