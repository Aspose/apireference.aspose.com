---
title: "System::Net::Http::Headers::ProductHeaderValue فئة"
linktitle: "ProductHeaderValue"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Http::Headers::ProductHeaderValue فئة. تمثّل رمز المنتج في قيمة رأس ''User-Agent''. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1700
url: /ar/cpp/system.net.http.headers/productheadervalue/
---
## ProductHeaderValue class


تمثّل رمز المنتج في قيمة رأس 'User-Agent'. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ProductHeaderValue : public System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات [Object.Equals](../../system/object/equals/) في C#. |
| [get_Name](./get_name/)() | معلومات RTTI. |
| [get_Version](./get_version/)() | يرجع إصدار رمز المنتج. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| static [GetProductLength](./getproductlength/)(String, int32_t, System::SharedPtr\<ProductHeaderValue\>\&) | يحوّل السلسلة الممرّرة من الفهرس المحدد إلى نسخة من الفئة [ProductHeaderValue](./). |
| static [Parse](./parse/)(String) | يحوّل السلسلة الممرّرة إلى نسخة من الفئة [ProductHeaderValue](./). |
| [ProductHeaderValue](./productheadervalue/)(String) | ينشئ نسخة جديدة. |
| [ProductHeaderValue](./productheadervalue/)(String, String) | ينشئ نسخة جديدة. |
| [ToString](./tostring/)() const override | نظير طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductHeaderValue\>\&) | يحاول تحويل السلسلة الممرّرة إلى نسخة من الفئة [ProductHeaderValue](./). |
## انظر أيضًا

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
