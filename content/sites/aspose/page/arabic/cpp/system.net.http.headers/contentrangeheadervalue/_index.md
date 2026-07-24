---
title: "System::Net::Http::Headers::ContentRangeHeaderValue فئة"
linktitle: "ContentRangeHeaderValue"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Http::Headers::ContentRangeHeaderValue فئة. تمثل قيمة رأس ''Content-Range''. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء تأكيد. دائمًا قم بلف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 400
url: /ar/cpp/system.net.http.headers/contentrangeheadervalue/
---
## ContentRangeHeaderValue class


تمثل قيمة رأس 'Content-Range'. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء تأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ContentRangeHeaderValue : public System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t, int64_t) | ينشئ نسخة جديدة. |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t) | ينشئ نسخة جديدة. |
| [ContentRangeHeaderValue](./contentrangeheadervalue/)(int64_t, int64_t) | ينشئ نسخة جديدة. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات [Object.Equals](../../system/object/equals/) في C#. |
| [get_From](./get_from/)() | يحصل على موضع يجب أن يبدأ عنده إرسال البيانات. |
| [get_HasLength](./get_haslength/)() const | يحصل على قيمة تشير إلى ما إذا كان الطول محددًا للعنوان الحالي. |
| [get_HasRange](./get_hasrange/)() const | يحصل على قيمة تشير إلى ما إذا كان النطاق محددًا للعنوان الحالي. |
| [get_Length](./get_length/)() | يحصل على طول جسم الكيان. |
| [get_To](./get_to/)() | يحصل على الموضع الذي يجب أن يتوقف عنده إرسال البيانات. |
| [get_Unit](./get_unit/)() | معلومات RTTI. |
| static [GetContentRangeLength](./getcontentrangelength/)(String, int32_t, System::SharedPtr\<Object\>\&) | يحوّل السلسلة المُمرَّرة من الموضع المحدد إلى كائن من فئة [ContentRangeHeaderValue](./). |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| static [Parse](./parse/)(String) | يحوّل السلسلة المُمرَّرة إلى كائن من فئة [ContentRangeHeaderValue](./). |
| [set_Unit](./set_unit/)(String) | يضبط الوحدات المستخدمة في النطاق. |
| [ToString](./tostring/)() const override | نظير طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ContentRangeHeaderValue\>\&) | يحاول تحويل السلسلة المُمرَّرة إلى كائن من فئة [ContentRangeHeaderValue](./). |
## انظر أيضًا

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
