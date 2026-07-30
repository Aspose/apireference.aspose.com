---
title: "System::Globalization::KoreanLunisolarCalendar class"
linktitle: "KoreanLunisolarCalendar"
second_title: "Aspose.Font لـ C++"
description: "System::Globalization::KoreanLunisolarCalendar class. التقويم القمري الشمسي الكوري. غير مُنفَّذ. يجب تخصيص كائنات هذه الفئة باستخدام الدالة System::MakeObject() فقط. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1800
url: /ar/cpp/system.globalization/koreanlunisolarcalendar/
---
## KoreanLunisolarCalendar class


التقويم القمري الشمسي الكوري. غير مُنفَّذ. يجب تخصيص كائنات هذه الفئة باستخدام الدالة [System::MakeObject()](../../system/makeobject/) فقط. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class KoreanLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | معلومات RTTI. |
| [get_Eras](./get_eras/)() const override | يحصل على قائمة العصور الموجودة في التقويم. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | النقطة الزمنية القصوى التي يدعمها التقويم. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | النقطة الزمنية الدنيا التي يدعمها التقويم. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | يحصل على الشهر الكبيس للسنة المحددة. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | معلومات RTTI. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | يتحقق مما إذا كان اليوم كبيسًا. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | يتحقق مما إذا كان اليوم كبيسًا. |
| [IsLeapYear](./isleapyear/)(int, int) const override | يتحقق مما إذا كانت السنة كبيسة. |
| virtual [IsLeapYear](./isleapyear/)(int) const | يتحقق مما إذا كانت السنة كبيسة. |
| [KoreanLunisolarCalendar](./koreanlunisolarcalendar/)() | المُنشئ. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static constexpr [GregorianEra](./gregorianera/) | العصر الغريغوري الحالي. |
## انظر أيضًا

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
