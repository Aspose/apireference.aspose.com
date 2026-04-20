---
title: "System::TimeZone class"
linktitle: "TimeZone"
second_title: "Aspose.Font لـ C++"
description: "System::TimeZone class. تمثل منطقة زمنية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت تشغيل أو أعطال في التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 6200
url: /ar/cpp/system/timezone/
---
## TimeZone class


تمثل منطقة زمنية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت تشغيل أو أعطال في التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class TimeZone : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [get_CurrentTimeZone](./get_currenttimezone/)() | يرجع نسخة جديدة من الفئة [TimeZone](./) التي تمثل المنطقة الزمنية الحالية. |
| virtual [get_DaylightName](./get_daylightname/)() const | يرجع اسم التوقيت الصيفي للمنطقة الزمنية التي تمثلها الكائن الحالي. |
| virtual [get_StandardName](./get_standardname/)() const | يرجع اسم التوقيت القياسي للمنطقة الزمنية التي تمثلها الكائن الحالي. |
| virtual [GetDaylightChanges](./getdaylightchanges/)(int32_t) | يرجع فترة التوقيت الصيفي لسنة معينة. |
| virtual [GetUtcOffset](./getutcoffset/)(DateTime) | يرجع إزاحة UTC للوقت المحلي المحدد. |
| virtual [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) | يحدد ما إذا كانت قيمة التاريخ والوقت التي يمثلها الكائن [DateTime](../datetime/) المحدد تقع ضمن نطاق التوقيت الصيفي للمنطقة الزمنية التي يمثلها الكائن الحالي [TimeZone](./). |
## انظر أيضًا

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
