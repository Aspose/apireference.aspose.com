---
title: "System::Net::Http::Headers::StringWithQualityHeaderValue فئة"
linktitle: "StringWithQualityHeaderValue"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Http::Headers::StringWithQualityHeaderValue فئة. تمثل قيمة مع جودة إضافية لرأس نصي. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أعطال تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2300
url: /ar/cpp/system.net.http.headers/stringwithqualityheadervalue/
---
## StringWithQualityHeaderValue class


يمثل قيمة مع جودة إضافية لرأس السلسلة. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class StringWithQualityHeaderValue : public System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات [Object.Equals](../../system/object/equals/) في C#. |
| [get_Quality](./get_quality/)() | يرجع جودة. |
| [get_Value](./get_value/)() | معلومات RTTI. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| static [GetStringWithQualityLength](./getstringwithqualitylength/)(String, int32_t, System::SharedPtr\<Object\>\&) | يحوّل السلسلة الممرّرة من الفهرس المحدد إلى نسخة من الفئة [StringWithQualityHeaderValue](./). |
| static [Parse](./parse/)(String) | يحوّل السلسلة الممرّرة إلى نسخة من الفئة [StringWithQualityHeaderValue](./). |
| [StringWithQualityHeaderValue](./stringwithqualityheadervalue/)(String) | ينشئ نسخة جديدة. |
| [StringWithQualityHeaderValue](./stringwithqualityheadervalue/)(String, double) | ينشئ نسخة جديدة. |
| [ToString](./tostring/)() const override | نظير طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<StringWithQualityHeaderValue\>\&) | يحاول تحويل السلسلة الممرّرة إلى نسخة من الفئة [StringWithQualityHeaderValue](./). |
## انظر أيضًا

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
