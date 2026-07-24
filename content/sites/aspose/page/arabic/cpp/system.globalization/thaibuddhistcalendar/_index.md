---
title: "System::Globalization::ThaiBuddhistCalendar class"
linktitle: "ThaiBuddhistCalendar"
second_title: "Aspose.Page لـ C++"
description: "System::Globalization::ThaiBuddhistCalendar class. تقويم بوذي تايلاندي. يجب تخصيص كائنات هذا الصنف فقط باستخدام الدالة System::MakeObject() . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذا الصنف في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2900
url: /ar/cpp/system.globalization/thaibuddhistcalendar/
---
## ThaiBuddhistCalendar class


تقويم بوذي تايلاندي. يجب تخصيص كائنات هذا الصنف فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذا الصنف في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ThaiBuddhistCalendar : public System::Globalization::Calendar
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | معلومات RTTI. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | يسترجع نوع الخوارزمية. |
| [get_Eras](./get_eras/)() const override | يحصل على قائمة العصور الموجودة في التقويم. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | أقصى نقطة زمنية يدعمها التقويم. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | أدنى نقطة زمنية يدعمها التقويم. |
| [GetDayOfMonth](./getdayofmonth/)(DateTime) const override | يحصل على يوم الشهر للنقطة الزمنية المحددة. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | يحصل على يوم الأسبوع للنقطة الزمنية المحددة. |
| [GetDayOfYear](./getdayofyear/)(DateTime) const override | يحصل على يوم السنة للنقطة الزمنية المحددة. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | يحصل على عدد الأيام في شهر معين. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | يحصل على عدد الأيام في شهر معين. |
| [GetDaysInYear](./getdaysinyear/)(int, int) const override | يحصل على عدد الأيام في سنة معينة. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | يحصل على عدد الأيام في سنة معينة. |
| [GetEra](./getera/)(DateTime) const override | يحصل على العصر للنقطة الزمنية المحددة. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | يحصل على الشهر الكبيس للسنة المحددة. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | يحصل على الشهر الكبيس للسنة المحددة. |
| [GetMonth](./getmonth/)(DateTime) const override | يحصل على الشهر للنقطة الزمنية المحددة. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | يحصل على عدد الأشهر في السنة المحددة. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | معلومات RTTI. |
| [GetYear](./getyear/)(DateTime) const override | يحصل على السنة للنقطة الزمنية المحددة. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | يتحقق مما إذا كان اليوم سنة كبيسة. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | يتحقق مما إذا كان اليوم سنة كبيسة. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | يتحقق مما إذا كان الشهر سنة كبيسة. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | يتحقق مما إذا كان الشهر سنة كبيسة. |
| [IsLeapYear](./isleapyear/)(int, int) const override | يتحقق مما إذا كان العام سنة كبيسة. |
| virtual [IsLeapYear](./isleapyear/)(int) const | يتحقق مما إذا كان العام سنة كبيسة. |
| [ThaiBuddhistCalendar](./thaibuddhistcalendar/)() | منشئ. |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | ينشئ كائن [DateTime](../../system/datetime/) من المكونات. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | ينشئ كائن [DateTime](../../system/datetime/) من المكونات. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static constexpr [ThaiBuddhistEra](./thaibuddhistera/) | العصر البوذي التايلاندي الحالي. |
## انظر أيضًا

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
