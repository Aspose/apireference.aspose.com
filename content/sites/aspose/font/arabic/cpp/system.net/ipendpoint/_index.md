---
title: "System::Net::IPEndPoint فئة"
linktitle: "IPEndPoint"
second_title: "Aspose.Font لـ C++"
description: "System::Net::IPEndPoint فئة. تمثل نقطة نهاية شبكة تحتوي على عنوان IP ومنفذ. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2500
url: /ar/cpp/system.net/ipendpoint/
---
## IPEndPoint class


تمثل نقطة نهاية شبكة تحتوي على عنوان IP ومنفذ. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class IPEndPoint : public System::Net::EndPoint
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Create](./create/)(System::SharedPtr\<SocketAddress\>) override | أنشئ مثلاً جديداً من فئة [EndPoint](../endpoint/) باستخدام عنوان المقبس المحدد. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات C# [Object.Equals](../../system/object/equals/). |
| [get_Address](./get_address/)() | يحصل على عنوان نقطة النهاية. |
| [get_AddressFamily](./get_addressfamily/)() override | معلومات RTTI. |
| [get_Port](./get_port/)() | يحصل على رقم المنفذ. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| [GetImpl](./getimpl/)() const override | يرجع مؤشرًا إلى التنفيذ. |
| [IPEndPoint](./ipendpoint/)(int64_t, int32_t) | ينشئ نسخة جديدة. |
| [IPEndPoint](./ipendpoint/)(System::SharedPtr\<IPAddress\>, int32_t) | ينشئ نسخة جديدة. |
| [set_Address](./set_address/)(System::SharedPtr\<IPAddress\>) | يضبط عنوان نقطة النهاية. |
| [set_Port](./set_port/)(int32_t) | يضبط رقم المنفذ. |
| [ToString](./tostring/)() const override | تماثل طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [Any](./any/) | نقطة النهاية لأي عنوان IPv4 وأي منفذ. |
| static [AnyPort](./anyport/) | قيمة تشير إلى ما إذا كان يمكن استخدام أي منفذ. |
| static [IPv6Any](./ipv6any/) | نقطة النهاية لأي عنوان IPv6 وأي منفذ. |
| static [MaxPort](./maxport/) | الحد الأقصى لرقم المنفذ. |
| static [MinPort](./minport/) | معلومات RTTI. |
## انظر أيضًا

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Font for C++](../../)
