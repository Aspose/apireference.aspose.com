---
title: "فئة System::Web::Services::Protocols::SoapHeaderAttribute"
linktitle: "SoapHeaderAttribute"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Web::Services::Protocols::SoapHeaderAttribute. تحدد رأس SOAP الذي يمكن لطريقة خدمة الويب XML أو عميل خدمة الويب XML معالجته. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 700
url: /ar/cpp/system.web.services.protocols/soapheaderattribute/
---
## SoapHeaderAttribute class


تحدد رأس SOAP الذي يمكن لطريقة خدمة الويب XML [Web](../../system.web/) أو عميل خدمة الويب XML [Web](../../system.web/) معالجته. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class SoapHeaderAttribute : public System::Attribute
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Direction](./get_direction/)() | معلومات RTTI. |
| [get_MemberName](./get_membername/)() | يحصل على اسم المتغير العضو في خدمة XML SOAP الذي يُستخدم لاستلام محتويات رأس SOAP. |
| [get_Required](./get_required/)() | يحصل على قيمة تشير إلى ما إذا كان يجب على خدمة XML [Web](../../system.web/) المستلمة أو عميل خدمة XML [Web](../../system.web/) فهم رأس SOAP ومعالجته. |
| [set_Direction](./set_direction/)(SoapHeaderDirection) | يضبط اتجاه رأس SOAP. |
| [set_MemberName](./set_membername/)(String) | يضبط اسم المتغير العضو في خدمة XML SOAP الذي يُستخدم لاستلام محتويات رأس SOAP. |
| [set_Required](./set_required/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب على خدمة XML [Web](../../system.web/) المستلمة أو عميل خدمة XML [Web](../../system.web/) فهم رأس SOAP ومعالجته. |
| [SoapHeaderAttribute](./soapheaderattribute/)(String) | ينشئ نسخة جديدة. |
## انظر أيضًا

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
