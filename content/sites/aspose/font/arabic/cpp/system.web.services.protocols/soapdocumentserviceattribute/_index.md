---
title: "فئة System::Web::Services::Protocols::SoapDocumentServiceAttribute"
linktitle: "SoapDocumentServiceAttribute"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Web::Services::Protocols::SoapDocumentServiceAttribute. تحدد التنسيق الافتراضي لطلبات SOAP والاستجابات. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال تأكيدية. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل في C++."
type: docs
weight: 500
url: /ar/cpp/system.web.services.protocols/soapdocumentserviceattribute/
---
## SoapDocumentServiceAttribute class


تحدد التنسيق الافتراضي لطلبات SOAP والاستجابات. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال تأكيدية. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل.

```cpp
class SoapDocumentServiceAttribute : public System::Attribute
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_ParameterStyle](./get_parameterstyle/)() | معلومات RTTI. |
| [get_RoutingStyle](./get_routingstyle/)() | يحصل على قيمة تُظهر كيفية توجيه رسائل SOAP إلى الخدمة. |
| [get_Use](./get_use/)() | يحصل على تنسيق المعاملات. |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | يضبط قيمة تشير إلى ما إذا كانت المعلمات محصورة داخل عنصر XML واحد تحت عنصر 'Body'. |
| [set_RoutingStyle](./set_routingstyle/)(SoapServiceRoutingStyle) | يضبط قيمة تُظهر كيفية توجيه رسائل SOAP إلى الخدمة. |
| [set_Use](./set_use/)(Description::SoapBindingUse) | يضبط تنسيق المعاملات. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)() | ينشئ نسخة جديدة. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse) | ينشئ نسخة جديدة. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse, SoapParameterStyle) | ينشئ نسخة جديدة. |
## انظر أيضًا

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
