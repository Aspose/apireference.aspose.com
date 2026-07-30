---
title: "الفئة System::Net::Http::HttpMethod"
linktitle: "HttpMethod"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Net::Http::HttpMethod. تمثل طريقة HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 700
url: /ar/cpp/system.net.http/httpmethod/
---
## HttpMethod class


تمثل طريقة HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HttpMethod : public System::IEquatable<System::SharedPtr<System::Net::Http::HttpMethod>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<HttpMethod\>) override | يحدد ما إذا كانت الكائنات الحالية والمحددة متساوية. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات C# [Object.Equals](../../system/object/equals/). |
| static [get_Delete](./get_delete/)() | يرجع طريقة HTTP 'DELETE'. |
| static [get_Get](./get_get/)() | يرجع طريقة HTTP 'GET'. |
| static [get_Head](./get_head/)() | يرجع طريقة HTTP 'HEAD'. |
| [get_Method](./get_method/)() | يرجع تمثيلًا نصيًا لطريقة HTTP. |
| static [get_Options](./get_options/)() | يرجع طريقة HTTP 'OPTIONS'. |
| static [get_Post](./get_post/)() | يرجع طريقة HTTP 'POST'. |
| static [get_Put](./get_put/)() | يرجع طريقة HTTP 'PUT'. |
| static [get_Trace](./get_trace/)() | يرجع طريقة HTTP 'TRACE'. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| [HttpMethod](./httpmethod/)(String) | ينشئ نسخة جديدة. |
| [ToString](./tostring/)() const override | تماثل طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
## انظر أيضًا

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
