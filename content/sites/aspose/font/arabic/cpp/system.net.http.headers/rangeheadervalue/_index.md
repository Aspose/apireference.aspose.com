---
title: "فئة System::Net::Http::Headers::RangeHeaderValue"
linktitle: "RangeHeaderValue"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Net::Http::Headers::RangeHeaderValue. تمثل قيمة رأس ''Range''. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2000
url: /ar/cpp/system.net.http.headers/rangeheadervalue/
---
## RangeHeaderValue class


تمثل قيمة رأس 'Range'. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class RangeHeaderValue : public System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات C# [Object.Equals](../../system/object/equals/). |
| [get_Ranges](./get_ranges/)() | يرجع مجموعة النطاقات. |
| [get_Unit](./get_unit/)() | معلومات RTTI. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| static [GetRangeLength](./getrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | يحوّل سلسلة مُمرَّرة من الفهرس المحدد إلى مثيل من الفئة [RangeHeaderValue](./). |
| static [Parse](./parse/)(String) | يحوّل سلسلة مُمرَّرة إلى مثيل من الفئة [RangeHeaderValue](./). |
| [RangeHeaderValue](./rangeheadervalue/)() | ينشئ نسخة جديدة. |
| [RangeHeaderValue](./rangeheadervalue/)(Nullable\<int64_t\>, Nullable\<int64_t\>) | ينشئ نسخة جديدة. |
| [set_Unit](./set_unit/)(String) | يضبط وحدة. |
| [ToString](./tostring/)() const override | تماثل طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RangeHeaderValue\>\&) | يحاول تحويل السلسلة المُمرَّرة إلى كائن من فئة [RangeHeaderValue](./). |
## انظر أيضًا

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
