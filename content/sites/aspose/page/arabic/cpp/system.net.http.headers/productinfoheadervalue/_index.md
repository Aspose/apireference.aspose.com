---
title: "فئة System::Net::Http::Headers::ProductInfoHeaderValue"
linktitle: "ProductInfoHeaderValue"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Net::Http::Headers::ProductInfoHeaderValue. تمثل منتجًا أو تعليقًا في قيمة عنوان ''User-Agent''. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1800
url: /ar/cpp/system.net.http.headers/productinfoheadervalue/
---
## ProductInfoHeaderValue class


تمثل منتجًا أو تعليقًا في قيمة عنوان 'User-Agent'. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ProductInfoHeaderValue : public System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات [Object.Equals](../../system/object/equals/) في C#. |
| [get_Comment](./get_comment/)() | يعيد تعليقًا. |
| [get_Product](./get_product/)() | معلومات RTTI. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| static [GetProductInfoLength](./getproductinfolength/)(String, int32_t, System::SharedPtr\<ProductInfoHeaderValue\>\&) | يحوّل سلسلة مُمرَّرة من الفهرس المحدد إلى مثال من الفئة [ProductInfoHeaderValue](./). |
| static [Parse](./parse/)(String) | يحوّل سلسلة مُمرَّرة إلى مثال من الفئة [ProductInfoHeaderValue](./). |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String, String) | ينشئ نسخة جديدة. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(System::SharedPtr\<ProductHeaderValue\>) | ينشئ نسخة جديدة. |
| [ProductInfoHeaderValue](./productinfoheadervalue/)(String) | ينشئ نسخة جديدة. |
| [ToString](./tostring/)() const override | نظير طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ProductInfoHeaderValue\>\&) | يحاول تحويل سلسلة مُمرَّرة إلى مثال من الفئة [ProductInfoHeaderValue](./). |
## انظر أيضًا

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
