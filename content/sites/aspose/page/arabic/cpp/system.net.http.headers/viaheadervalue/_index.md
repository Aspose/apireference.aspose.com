---
title: "System::Net::Http::Headers::ViaHeaderValue فئة"
linktitle: "ViaHeaderValue"
second_title: "Aspose.Page لـ C++"
description: "System::Net::Http::Headers::ViaHeaderValue فئة. تمثّل قيمة لترويسة ''Via''. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيدية. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2600
url: /ar/cpp/system.net.http.headers/viaheadervalue/
---
## ViaHeaderValue class


تمثّل قيمة لترويسة 'Via'. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيدية. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ViaHeaderValue : public System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات [Object.Equals](../../system/object/equals/) في C#. |
| [get_Comment](./get_comment/)() | يرجع التعليق من قيمة ترويسة 'Via'. |
| [get_ProtocolName](./get_protocolname/)() | معلومات RTTI. |
| [get_ProtocolVersion](./get_protocolversion/)() | يرجع إصدار البروتوكول من قيمة ترويسة 'Via'. |
| [get_ReceivedBy](./get_receivedby/)() | يرجع المضيف والمنفذ الذي تم استلام الطلب أو الاستجابة من خلاله. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| static [GetViaLength](./getvialength/)(String, int32_t, System::SharedPtr\<Object\>\&) | يحوّل سلسلة مُمرّرة من الفهرس المحدد إلى نسخة من الفئة [ViaHeaderValue](./). |
| static [Parse](./parse/)(String) | يحوّل سلسلة مُمرّرة إلى نسخة من الفئة [ViaHeaderValue](./). |
| [ToString](./tostring/)() const override | نظير طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<ViaHeaderValue\>\&) | يحاول تحويل سلسلة مُمرّرة إلى نسخة من الفئة [ViaHeaderValue](./). |
| [ViaHeaderValue](./viaheadervalue/)(String, String) | ينشئ نسخة جديدة. |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String) | ينشئ نسخة جديدة. |
| [ViaHeaderValue](./viaheadervalue/)(String, String, String, String) | ينشئ نسخة جديدة. |
## انظر أيضًا

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
