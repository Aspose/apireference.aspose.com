---
title: "System::Globalization::JapaneseCalendar class"
linktitle: "JapaneseCalendar"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Globalization::JapaneseCalendar. تقويم ياباني. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1400
url: /ar/cpp/system.globalization/japanesecalendar/
---
## JapaneseCalendar class


تقويم ياباني. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class JapaneseCalendar : public System::Globalization::Calendar
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
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | يتحقق مما إذا كان اليوم سنة كبيسة. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | يتحقق مما إذا كان اليوم سنة كبيسة. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | يتحقق مما إذا كان الشهر سنة كبيسة. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | يتحقق مما إذا كان الشهر سنة كبيسة. |
| [IsLeapYear](./isleapyear/)(int, int) const override | يتحقق مما إذا كان العام سنة كبيسة. |
| virtual [IsLeapYear](./isleapyear/)(int) const | يتحقق مما إذا كان العام سنة كبيسة. |
| [JapaneseCalendar](./japanesecalendar/)() | منشئ. |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | ينشئ كائن [DateTime](../../system/datetime/) من المكونات. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | ينشئ كائن [DateTime](../../system/datetime/) من المكونات. |
## انظر أيضًا

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
