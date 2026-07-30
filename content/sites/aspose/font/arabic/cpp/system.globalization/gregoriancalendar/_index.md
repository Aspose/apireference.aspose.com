---
title: "فئة System::Globalization::GregorianCalendar"
linktitle: "GregorianCalendar"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Globalization::GregorianCalendar. التقويم الميلادي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1000
url: /ar/cpp/system.globalization/gregoriancalendar/
---
## GregorianCalendar class


التقويم الميلادي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class GregorianCalendar : public System::Globalization::Calendar
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | معلومات RTTI. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | يحصل على نوع الخوارزمية. |
| virtual [get_CalendarType](./get_calendartype/)() const | يحصل على نوع التقويم الميلادي. |
| [get_Eras](./get_eras/)() const override | يحصل على قائمة العصور الموجودة في التقويم. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | النقطة الزمنية القصوى التي يدعمها التقويم. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | النقطة الزمنية الدنيا التي يدعمها التقويم. |
| [GetDayOfMonth](./getdayofmonth/)(DateTime) const override | يحصل على يوم الشهر للنقطة الزمنية المحددة. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | يحصل على يوم الأسبوع للنقطة الزمنية المحددة. |
| [GetDayOfYear](./getdayofyear/)(DateTime) const override | يحصل على يوم السنة للنقطة الزمنية المحددة. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | يحصل على عدد الأيام في شهر محدد. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | يحصل على عدد الأيام في شهر محدد. |
| [GetDaysInYear](./getdaysinyear/)(int, int) const override | يحصل على عدد الأيام في سنة محددة. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | يحصل على عدد الأيام في سنة محددة. |
| static [GetDefaultInstance](./getdefaultinstance/)() | يحصل على نسخة التقويم الميلادي الافتراضية. |
| [GetEra](./getera/)(DateTime) const override | يحصل على العصر للنقطة الزمنية المحددة. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | يحصل على الشهر الكبيس للسنة المحددة. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | يحصل على الشهر الكبيس للسنة المحددة. |
| [GetMonth](./getmonth/)(DateTime) const override | يحصل على الشهر للنقطة الزمنية المحددة. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | يحصل على عدد الأشهر في السنة المحددة. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | معلومات RTTI. |
| [GetYear](./getyear/)(DateTime) const override | يحصل على السنة للنقطة الزمنية المحددة. |
| [GregorianCalendar](./gregoriancalendar/)(GregorianCalendarTypes) | ينشئ تقويم ميلادي محدد. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | يتحقق مما إذا كان اليوم كبيسًا. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | يتحقق مما إذا كان اليوم كبيسًا. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | يتحقق مما إذا كان الشهر كبيسًا. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | يتحقق مما إذا كان الشهر كبيسًا. |
| [IsLeapYear](./isleapyear/)(int, int) const override | يتحقق مما إذا كانت السنة كبيسة. |
| virtual [IsLeapYear](./isleapyear/)(int) const | يتحقق مما إذا كانت السنة كبيسة. |
| virtual [set_CalendarType](./set_calendartype/)(GregorianCalendarTypes) | يضبط نوع التقويم الميلادي. |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | ينشئ كائن [DateTime](../../system/datetime/) من المكونات. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | ينشئ كائن [DateTime](../../system/datetime/) من المكونات. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static constexpr [ADEra](./adera/) | العصر الحالي. |
## انظر أيضًا

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
