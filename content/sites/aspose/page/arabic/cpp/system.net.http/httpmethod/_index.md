---
title: "فئة System::Net::Http::HttpMethod"
linktitle: "HttpMethod"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Net::Http::HttpMethod. تمثل طريقة HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 700
url: /ar/cpp/system.net.http/httpmethod/
---
## HttpMethod class


تمثل طريقة HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم أبدًا بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HttpMethod : public System::IEquatable<System::SharedPtr<System::Net::Http::HttpMethod>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<HttpMethod\>) override | يحدد ما إذا كان الكائن الحالي والكائن المحدد متساويين. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات [Object.Equals](../../system/object/equals/) في C#. |
| static [get_Delete](./get_delete/)() | يعيد طريقة HTTP 'DELETE'. |
| static [get_Get](./get_get/)() | يعيد طريقة HTTP 'GET'. |
| static [get_Head](./get_head/)() | يعيد طريقة HTTP 'HEAD'. |
| [get_Method](./get_method/)() | يعيد تمثيلًا نصيًا لطريقة HTTP. |
| static [get_Options](./get_options/)() | يعيد طريقة HTTP 'OPTIONS'. |
| static [get_Post](./get_post/)() | يعيد طريقة HTTP 'POST'. |
| static [get_Put](./get_put/)() | يعيد طريقة HTTP 'PUT'. |
| static [get_Trace](./get_trace/)() | يعيد طريقة HTTP 'TRACE'. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| [HttpMethod](./httpmethod/)(String) | ينشئ نسخة جديدة. |
| [ToString](./tostring/)() const override | نظير طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
## انظر أيضًا

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
