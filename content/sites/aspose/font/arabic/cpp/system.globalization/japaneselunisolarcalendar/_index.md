---
title: "System::Globalization::JapaneseLunisolarCalendar class"
linktitle: "JapaneseLunisolarCalendar"
second_title: "Aspose.Font لـ C++"
description: "System::Globalization::JapaneseLunisolarCalendar class. تقويم ياباني قمري شمسي. غير مُنفَّذ. يجب تخصيص كائنات هذه الفئة باستخدام الدالة System::MakeObject() فقط. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1500
url: /ar/cpp/system.globalization/japaneselunisolarcalendar/
---
## JapaneseLunisolarCalendar class


تقويم ياباني قمري شمسي. غير مُنفَّذ. يجب تخصيص كائنات هذه الفئة باستخدام الدالة [System::MakeObject()](../../system/makeobject/) فقط. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class JapaneseLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | معلومات RTTI. |
| [get_Eras](./get_eras/)() const override | يحصل على قائمة العصور الموجودة في التقويم. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | النقطة الزمنية القصوى التي يدعمها التقويم. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | النقطة الزمنية الدنيا التي يدعمها التقويم. |
| [GetEra](./getera/)(DateTime) const override | يحصل على العصر للنقطة الزمنية المحددة. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | يحصل على الشهر الكبيس للسنة المحددة. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | معلومات RTTI. |
| [GetYear](./getyear/)(DateTime) const override | يحصل على السنة للنقطة الزمنية المحددة. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | يتحقق مما إذا كان اليوم كبيسًا. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | يتحقق مما إذا كان اليوم كبيسًا. |
| [IsLeapYear](./isleapyear/)(int, int) const override | يتحقق مما إذا كانت السنة كبيسة. |
| virtual [IsLeapYear](./isleapyear/)(int) const | يتحقق مما إذا كانت السنة كبيسة. |
| [JapaneseLunisolarCalendar](./japaneselunisolarcalendar/)() | المُنشئ. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static constexpr [JapaneseEra](./japaneseera/) | العصر الياباني الحالي. |
## انظر أيضًا

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
