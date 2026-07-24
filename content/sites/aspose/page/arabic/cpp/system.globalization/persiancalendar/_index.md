---
title: "System::Globalization::PersianCalendar class"
linktitle: "PersianCalendar"
second_title: "Aspose.Page لـ C++"
description: "System::Globalization::PersianCalendar class. تقويم فارسي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2000
url: /ar/cpp/system.globalization/persiancalendar/
---
## PersianCalendar class


تقويم فارسي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class PersianCalendar : public System::Globalization::Calendar
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | معلومات RTTI. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | يسترجع نوع الخوارزمية. |
| [get_Eras](./get_eras/)() const override | يحصل على قائمة العصور الموجودة في التقويم. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | أقصى نقطة زمنية يدعمها التقويم. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | أدنى نقطة زمنية يدعمها التقويم. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | يحصل على يوم الأسبوع للنقطة الزمنية المحددة. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | يحصل على عدد الأيام في شهر معين. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | معلومات RTTI. |
| [GetDaysInYear](./getdaysinyear/)(int, int) const override | يحصل على عدد الأيام في سنة معينة. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | يحصل على عدد الأيام في سنة معينة. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | يحصل على الشهر الكبيس للسنة المحددة. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | يحصل على الشهر الكبيس للسنة المحددة. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | يحصل على عدد الأشهر في السنة المحددة. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | يحصل على عدد الأشهر في السنة المحددة. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | يتحقق مما إذا كان اليوم سنة كبيسة. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | يتحقق مما إذا كان اليوم سنة كبيسة. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | يتحقق مما إذا كان الشهر سنة كبيسة. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | يتحقق مما إذا كان الشهر سنة كبيسة. |
| [IsLeapYear](./isleapyear/)(int, int) const override | يتحقق مما إذا كان العام سنة كبيسة. |
| virtual [IsLeapYear](./isleapyear/)(int) const | يتحقق مما إذا كان العام سنة كبيسة. |
| [PersianCalendar](./persiancalendar/)() | منشئ. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static constexpr [PersianEra](./persianera/) | العصر الفارسي الحالي. |
## انظر أيضًا

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
