---
title: "System::Net::SocketAddress class"
linktitle: "SocketAddress"
second_title: "Aspose.Page لـ C++"
description: "System::Net::SocketAddress class. تُستخدم لتخزين المعلومات المتسلسلة حول مثيلات فئة EndPoint. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أعطال التحقق. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3300
url: /ar/cpp/system.net/socketaddress/
---
## SocketAddress class


تُستخدم لتخزين المعلومات المتسلسلة حول مثيلات فئة [EndPoint](../endpoint/). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أعطال التحقق. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class SocketAddress : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | يقارن الكائنات باستخدام دلالات [Object.Equals](../../system/object/equals/) في C#. |
| [get_Family](./get_family/)() | معلومات RTTI. |
| [get_Size](./get_size/)() | يعيد حجم المخزن المؤقت الأساسي. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| [idx_get](./idx_get/)(int32_t) | يحصل على قيمة المخزن المؤقت الأساسي في الفهرس المحدد. |
| [idx_set](./idx_set/)(int32_t, uint8_t) | يضبط قيمة المخزن المؤقت الأساسي في الفهرس المحدد. |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily) | ينشئ نسخة جديدة. |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily, int32_t) | ينشئ نسخة جديدة. |
| [ToString](./tostring/)() const override | نظير طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
