---
title: "فئة System::Net::Http::Headers::RetryConditionHeaderValue"
linktitle: "RetryConditionHeaderValue"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Net::Http::Headers::RetryConditionHeaderValue. تمثل قيمة رأس ''Retry-After''. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2200
url: /ar/cpp/system.net.http.headers/retryconditionheadervalue/
---
## RetryConditionHeaderValue class


تمثل قيمة رأس 'Retry-After'. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class RetryConditionHeaderValue : public System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات C# [Object.Equals](../../system/object/equals/). |
| [get_Date](./get_date/)() | معلومات RTTI. |
| [get_Delta](./get_delta/)() | يرجع قيمة الدلتا. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| static [GetRetryConditionLength](./getretryconditionlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | يحوّل سلسلة مُمرَّرة من الفهرس المحدد إلى مثيل من الفئة [RetryConditionHeaderValue](./). |
| static [Parse](./parse/)(String) | يحوّل سلسلة مُمرَّرة إلى مثيل من الفئة [RetryConditionHeaderValue](./). |
| [RetryConditionHeaderValue](./retryconditionheadervalue/)(DateTimeOffset) | ينشئ نسخة جديدة. |
| [RetryConditionHeaderValue](./retryconditionheadervalue/)(TimeSpan) | ينشئ نسخة جديدة. |
| [ToString](./tostring/)() const override | تماثل طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<RetryConditionHeaderValue\>\&) | يحاول تحويل سلسلة مُمرَّرة إلى مثيل من الفئة [RetryConditionHeaderValue](./). |
## انظر أيضًا

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
