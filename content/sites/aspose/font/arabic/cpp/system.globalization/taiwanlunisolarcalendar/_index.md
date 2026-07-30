---
title: "فئة System::Globalization::TaiwanLunisolarCalendar"
linktitle: "TaiwanLunisolarCalendar"
second_title: "Aspose.Font لـ C++"
description: "System::Globalization::TaiwanLunisolarCalendar class. تقويم تايوان القمري الشمسي. غير مُنفّذ. يجب تخصيص كائنات هذه الفئة باستخدام الدالة System::MakeObject() فقط. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيدية. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2600
url: /ar/cpp/system.globalization/taiwanlunisolarcalendar/
---
## TaiwanLunisolarCalendar class


تقويم تايوان القمري الشمسي. غير مُنفّذ. يجب تخصيص كائنات هذه الفئة باستخدام الدالة [System::MakeObject()](../../system/makeobject/) فقط. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيدية. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class TaiwanLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | معلومات RTTI. |
| [get_Eras](./get_eras/)() const override | يحصل على قائمة العصور الموجودة في التقويم. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | النقطة الزمنية القصوى التي يدعمها التقويم. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | النقطة الزمنية الدنيا التي يدعمها التقويم. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | يحصل على عدد الأيام في شهر محدد. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | يحصل على عدد الأيام في شهر محدد. |
| [GetEra](./getera/)(DateTime) const override | يحصل على العصر للنقطة الزمنية المحددة. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | يحصل على الشهر الكبيس للسنة المحددة. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | يحصل على الشهر الكبيس للسنة المحددة. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | يحصل على عدد الأشهر في السنة المحددة. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | معلومات RTTI. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | يتحقق مما إذا كان اليوم كبيسًا. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | يتحقق مما إذا كان اليوم كبيسًا. |
| [IsLeapYear](./isleapyear/)(int, int) const override | يتحقق مما إذا كانت السنة كبيسة. |
| virtual [IsLeapYear](./isleapyear/)(int) const | يتحقق مما إذا كانت السنة كبيسة. |
| [TaiwanLunisolarCalendar](./taiwanlunisolarcalendar/)() | المُنشئ. |
## انظر أيضًا

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
