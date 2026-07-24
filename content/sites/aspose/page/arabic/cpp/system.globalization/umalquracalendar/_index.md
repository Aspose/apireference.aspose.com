---
title: "الفئة System::Globalization::UmAlQuraCalendar"
linktitle: "UmAlQuraCalendar"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Globalization::UmAlQuraCalendar. تقويم أم القرى. غير مُنفَّذ. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطالًا في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3000
url: /ar/cpp/system.globalization/umalquracalendar/
---
## UmAlQuraCalendar class


تقويم أم القرى. غير مُنفَّذ. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطالًا في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class UmAlQuraCalendar : public System::Globalization::Calendar
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
| [GetLeapMonth](./getleapmonth/)(int, int) const override | يحصل على الشهر الكبيس للسنة المحددة. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | معلومات RTTI. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | يتحقق مما إذا كان اليوم سنة كبيسة. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | يتحقق مما إذا كان اليوم سنة كبيسة. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | يتحقق مما إذا كان الشهر سنة كبيسة. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | يتحقق مما إذا كان الشهر سنة كبيسة. |
| [IsLeapYear](./isleapyear/)(int, int) const override | يتحقق مما إذا كان العام سنة كبيسة. |
| virtual [IsLeapYear](./isleapyear/)(int) const | يتحقق مما إذا كان العام سنة كبيسة. |
| [set_TwoDigitYearMax](./set_twodigityearmax/)(int) override | يضبط آخر سنة يمكن تمثيلها برقم مكوّن من رقمين. |
| [UmAlQuraCalendar](./umalquracalendar/)() | منشئ. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static constexpr [UmAlQuraEra](./umalquraera/) | العصر الحالي لـ UmAlQura. |
## انظر أيضًا

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
