---
title: "System::Net::Http::Headers::RangeHeaderValue فئة"
linktitle: "RangeHeaderValue"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Http::Headers::RangeHeaderValue فئة. تمثل قيمة رأس ''Range''. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2000
url: /ar/cpp/system.net.http.headers/rangeheadervalue/
---
## RangeHeaderValue class


تمثل قيمة رأس 'Range'. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أعطال تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class RangeHeaderValue : public System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات [Object.Equals](../../system/object/equals/) في C#. |
| [get_Ranges](./get_ranges/)() | يرجع مجموعة النطاقات. |
| [get_Unit](./get_unit/)() | معلومات RTTI. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| static [GetRangeLength](./getrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | يحول سلسلة مُمرَّرة من الفهرس المحدد إلى مثيل من الفئة [RangeHeaderValue](./). |
| static [Parse](./parse/)(String) | يقوم بتحويل سلسلة مُمرَّرة إلى نسخة من الفئة [RangeHeaderValue](./). |
| [RangeHeaderValue](./rangeheadervalue/)() | ينشئ نسخة جديدة. |
| [RangeHeaderValue](./rangeheadervalue/)(Nullable\<int64_t\>, Nullable\<int64_t\>) | ينشئ نسخة جديدة. |
| [set_Unit](./set_unit/)(String) | يضبط وحدة. |
| [ToString](./tostring/)() const override | نظير طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RangeHeaderValue\>\&) | يحاول تحويل سلسلة مُمرَّرة إلى نسخة من الفئة [RangeHeaderValue](./). |
## انظر أيضًا

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
