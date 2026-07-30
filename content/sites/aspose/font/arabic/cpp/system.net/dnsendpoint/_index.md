---
title: "فئة System::Net::DnsEndPoint"
linktitle: "DnsEndPoint"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Net::DnsEndPoint. تحتوي على معلومات يستخدمها التطبيق للاتصال بالخدمة. يجب تخصيص كائنات هذه الفئة باستخدام الدالة System::MakeObject() فقط. لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 800
url: /ar/cpp/system.net/dnsendpoint/
---
## DnsEndPoint class


تحتوي على معلومات يستخدمها التطبيق للاتصال بالخدمة. يجب تخصيص كائنات هذه الفئة باستخدام الدالة [System::MakeObject()](../../system/makeobject/) فقط. لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class DnsEndPoint : public System::Net::EndPoint
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t) | ينشئ نسخة جديدة. |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t, System::Net::Sockets::AddressFamily) | ينشئ نسخة جديدة. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات C# [Object.Equals](../../system/object/equals/). |
| [get_AddressFamily](./get_addressfamily/)() override | معلومات RTTI. |
| [get_Host](./get_host/)() | معلومات RTTI. |
| [get_Port](./get_port/)() | يعيد رقم المنفذ. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| [ToString](./tostring/)() const override | تماثل طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
## انظر أيضًا

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
