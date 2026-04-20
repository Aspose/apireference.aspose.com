---
title: "System::Net::Http::Headers::NameValueWithParametersHeaderValue فئة"
linktitle: "NameValueWithParametersHeaderValue"
second_title: "Aspose.Font لـ C++"
description: "System::Net::Http::Headers::NameValueWithParametersHeaderValue فئة. تمثل زوج مفتاح/قيمة مع معلمات للاستخدام في رؤوس الطلبات. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطالاً في التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1500
url: /ar/cpp/system.net.http.headers/namevaluewithparametersheadervalue/
---
## NameValueWithParametersHeaderValue class


تمثل زوج مفتاح/قيمة مع معلمات للاستخدام في الرؤوس. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطالاً في التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class NameValueWithParametersHeaderValue : public System::Net::Http::Headers::NameValueHeaderValue
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات C# [Object.Equals](../../system/object/equals/). |
| [get_Parameters](./get_parameters/)() | معلومات RTTI. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| static [GetNameValueWithParametersLength](./getnamevaluewithparameterslength/)(String, int32_t, System::SharedPtr\<Object\>\&) | يحوّل سلسلة مُمرَّرة من الفهرس المحدد إلى نسخة من الفئة [NameValueWithParametersHeaderValue](./). |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)(String) | ينشئ نسخة جديدة. |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)(String, String) | ينشئ نسخة جديدة. |
| [NameValueWithParametersHeaderValue](./namevaluewithparametersheadervalue/)() | ينشئ نسخة جديدة. |
| static [Parse](./parse/)(String) | يحوّل سلسلة مُمرَّرة إلى نسخة من الفئة [NameValueWithParametersHeaderValue](./). |
| [ToString](./tostring/)() const override | تماثل طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<NameValueWithParametersHeaderValue\>\&) | يحاول تحويل سلسلة مُمرَّرة إلى نسخة من الفئة [NameValueWithParametersHeaderValue](./). |
## انظر أيضًا

* Class [NameValueHeaderValue](../namevalueheadervalue/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
