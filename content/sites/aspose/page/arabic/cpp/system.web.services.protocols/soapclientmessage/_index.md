---
title: "فئة System::Web::Services::Protocols::SoapClientMessage"
linktitle: "SoapClientMessage"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Web::Services::Protocols::SoapClientMessage. تمثل البيانات في طلب SOAP مُرسل أو استجابة SOAP مُستلمة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.web.services.protocols/soapclientmessage/
---
## SoapClientMessage class


تمثل البيانات في طلب SOAP مُرسل أو استجابة SOAP مُستلمة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class SoapClientMessage : public System::Web::Services::Protocols::SoapMessage
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Action](./get_action/)() override | إرجاع قيمة سمة 'SOAPAction'. |
| [get_Client](./get_client/)() | يعيد مثالًا لفئة وكيل العميل. |
| virtual [get_OneWay](./get_oneway/)() | يعيد قيمة تشير إلى ما إذا كان العميل لا ينتظر انتهاء الخادم من معالجة الطريقة. |
| [get_SoapVersion](./get_soapversion/)() override | يرجع نسخة SOAP المستخدمة. |
| [get_Url](./get_url/)() override | يرجع عنوان URL لخدمة XML [Web](../../system.web/). |
| [SoapClientMessage](./soapclientmessage/)(System::SharedPtr\<SoapHttpClientProtocol\>, System::SharedPtr\<SoapMethodStubInfo\>, String, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | ينشئ نسخة جديدة. |
## انظر أيضًا

* Class [SoapMessage](../soapmessage/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
