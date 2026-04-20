---
title: "System::Net::Http::Headers::RangeConditionHeaderValue فئة"
linktitle: "RangeConditionHeaderValue"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Http::Headers::RangeConditionHeaderValue فئة. تمثّل قيمة رأس ''If-Range''. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1900
url: /ar/cpp/system.net.http.headers/rangeconditionheadervalue/
---
## RangeConditionHeaderValue class


تمثّل قيمة رأس 'If-Range'. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class RangeConditionHeaderValue : public System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات C# [Object.Equals](../../system/object/equals/). |
| [get_Date](./get_date/)() | معلومات RTTI. |
| [get_EntityTag](./get_entitytag/)() | يرجع قيمة رأس 'ETag'. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| static [GetRangeConditionLength](./getrangeconditionlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | يحوّل السلسلة المُمرَّرة من الفهرس المحدد إلى كائن من فئة [RangeConditionHeaderValue](./). |
| static [Parse](./parse/)(String) | يحوّل السلسلة المُمرَّرة إلى كائن من فئة [RangeConditionHeaderValue](./). |
| [RangeConditionHeaderValue](./rangeconditionheadervalue/)(DateTimeOffset) | ينشئ نسخة جديدة. |
| [RangeConditionHeaderValue](./rangeconditionheadervalue/)(System::SharedPtr\<EntityTagHeaderValue\>) | ينشئ نسخة جديدة. |
| [RangeConditionHeaderValue](./rangeconditionheadervalue/)(String) | ينشئ نسخة جديدة. |
| [ToString](./tostring/)() const override | تماثل طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RangeConditionHeaderValue\>\&) | يحاول تحويل السلسلة المُمرَّرة إلى كائن من فئة [RangeConditionHeaderValue](./). |
## انظر أيضًا

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
