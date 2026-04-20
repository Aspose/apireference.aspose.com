---
title: "System::Web::Services::Protocols::SoapDocumentMethodAttribute فئة"
linktitle: "SoapDocumentMethodAttribute"
second_title: "Aspose.Font لـ C++"
description: "System::Web::Services::Protocols::SoapDocumentMethodAttribute فئة. تحدد أن جميع رسائل SOAP التي يتم تمريرها أو إرجاعها من الطريقة تستخدم تنسيق المستند. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 400
url: /ar/cpp/system.web.services.protocols/soapdocumentmethodattribute/
---
## SoapDocumentMethodAttribute class


تحدد أن جميع رسائل SOAP التي يتم تمريرها أو إرجاعها من الطريقة تستخدم تنسيق المستند. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class SoapDocumentMethodAttribute : public System::Attribute
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Action](./get_action/)() | معلومات RTTI. |
| [get_Binding](./get_binding/)() | يحصل على الربط الذي تنفّذ من خلاله طريقة خدمة الويب XML عملية. |
| [get_OneWay](./get_oneway/)() | يحصل على قيمة تشير إلى ما إذا كان العميل لا ينتظر انتهاء الخادم من معالجة الطريقة. |
| [get_ParameterStyle](./get_parameterstyle/)() | يحصل على قيمة تشير إلى ما إذا كانت المعلمات محصورة داخل عنصر XML واحد تحت عنصر 'Body'. |
| [get_RequestElementName](./get_requestelementname/)() | يحصل على اسم عنصر XML المرتبط بطلب SOAP، والذي يُعرّف في وصف الخدمة كعملية. |
| [get_RequestNamespace](./get_requestnamespace/)() | يحصل على مساحة الاسم المرتبطة بطلب SOAP. |
| [get_ResponseElementName](./get_responseelementname/)() | يحصل على اسم عنصر XML المرتبط باستجابة SOAP. |
| [get_ResponseNamespace](./get_responsenamespace/)() | يحصل على مساحة الاسم المرتبطة باستجابة SOAP. |
| [get_Use](./get_use/)() | يحصل على قيمة تحدد طريقة ترميز الرسالة. |
| [set_Action](./set_action/)(String) | يضبط قيمة السمة 'SOAPAction'. |
| [set_Binding](./set_binding/)(String) | يضبط الربط الذي تنفّذ من خلاله طريقة خدمة الويب XML عملية. |
| [set_OneWay](./set_oneway/)(bool) | يضبط قيمة تشير إلى ما إذا كان العميل لا ينتظر انتهاء الخادم من معالجة الطريقة. |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | يضبط قيمة تشير إلى ما إذا كانت المعلمات محصورة داخل عنصر XML واحد تحت عنصر 'Body'. |
| [set_RequestElementName](./set_requestelementname/)(String) | يضبط اسم عنصر XML المرتبط بطلب SOAP، والذي يُعرّف في وصف الخدمة كعملية. |
| [set_RequestNamespace](./set_requestnamespace/)(String) | يضبط مساحة الاسم المرتبطة بطلب SOAP. |
| [set_ResponseElementName](./set_responseelementname/)(String) | يضبط اسم عنصر XML المرتبط باستجابة SOAP. |
| [set_ResponseNamespace](./set_responsenamespace/)(String) | يضبط مساحة الاسم المرتبطة باستجابة SOAP. |
| [set_Use](./set_use/)(Description::SoapBindingUse) | يضبط قيمة تحدد طريقة ترميز الرسالة. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)() | ينشئ نسخة جديدة. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)(String) | ينشئ نسخة جديدة. |
## انظر أيضًا

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
