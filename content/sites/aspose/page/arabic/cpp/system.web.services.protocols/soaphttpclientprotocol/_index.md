---
title: "فئة System::Web::Services::Protocols::SoapHttpClientProtocol"
linktitle: "SoapHttpClientProtocol"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Web::Services::Protocols::SoapHttpClientProtocol. يجب أن ترث خدمات وكيل العميل هذه الفئة عندما يُستخدم SOAP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. يجب دائمًا تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 900
url: /ar/cpp/system.web.services.protocols/soaphttpclientprotocol/
---
## SoapHttpClientProtocol class


يجب أن ترث خدمات وكيل العميل هذه الفئة عندما يُستخدم SOAP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. يجب دائمًا تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class SoapHttpClientProtocol : public System::Web::Services::Protocols::HttpWebClientProtocol
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Discover](./discover/)() | يربط المثيل الحالي بخدمة XML [Web](../../system.web/). |
| [get_SoapVersion](./get_soapversion/)() | يحصل على نسخة SOAP. |
| [InitializeSerializers](./initializeserializers/)(const System::TypeInfo\&, System::SharedPtr\<System::Xml::Serialization::XmlSerializerImplementation\>, String) | يُهيئ الحقول الداخلية. |
| [set_SoapVersion](./set_soapversion/)(SoapProtocolVersion) | يضبط نسخة SOAP. |
| [SoapHttpClientProtocol](./soaphttpclientprotocol/)() | ينشئ نسخة جديدة. |
## انظر أيضًا

* Class [HttpWebClientProtocol](../httpwebclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
