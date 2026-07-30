---
title: "فئة System::Web::Services::Protocols::SoapMessage"
linktitle: "SoapMessage"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Web::Services::Protocols::SoapMessage. تمثل رسالة SOAP. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1000
url: /ar/cpp/system.web.services.protocols/soapmessage/
---
## SoapMessage class


تمثل رسالة SOAP. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class SoapMessage : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CollectHeaders](./collectheaders/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, SoapHeaderDirection) | يضبط مجموعة الرؤوس الداخلية لـ SOAP. |
| [FindHeader](./findheader/)(System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>, const TypeInfo\&) | ابحث عن تعيين الرأس حسب نوع الرأس المحدد. |
| virtual [get_Action](./get_action/)() | يرجع قيمة سمة 'SOAPAction'. |
| [get_ContentEncoding](./get_contentencoding/)() | يحصل على قيمة رأس 'Content-Encoding'. |
| [get_ContentType](./get_contenttype/)() | يسترجع قيمة من رأس 'Content-Type'. |
| [get_Exception](./get_exception/)() | يحصل على الاستثناء الذي يُرمى بواسطة طريقة خدمة XML [Web](../../system.web/). |
| [get_Headers](./get_headers/)() | يرجع مجموعة رؤوس SOAP. |
| [get_InParameters](./get_inparameters/)() | يحصل على المعلمات التي تُمرّر إلى طريقة خدمة XML [Web](../../system.web/). |
| [get_IsSoap12](./get_issoap12/)() | يرجع قيمة تشير إلى ما إذا كان إصدار SOAP 1.2 مستخدمًا. |
| [get_OutParameters](./get_outparameters/)() | يحصل على معلمات الإخراج التي تُمرّر إلى طريقة خدمة XML [Web](../../system.web/). |
| virtual [get_SoapVersion](./get_soapversion/)() | يرجع إصدار SOAP المستخدم. |
| [get_Stage](./get_stage/)() | يحصل على مرحلة معالجة رسالة SOAP. |
| [get_Stream](./get_stream/)() | يحصل على الدفق الذي يحتوي على بيانات رسالة SOAP. |
| virtual [get_Url](./get_url/)() | يعيد عنوان URL لخدمة XML [Web](../../system.web/). |
| [GetInParameterValue](./getinparametervalue/)(int32_t) | يحصل على قيمة معامل الإدخال عند الفهرس المحدد. |
| [GetOutParameterValue](./getoutparametervalue/)(int32_t) | يحصل على قيمة معامل الإخراج عند الفهرس المحدد. |
| [GetReturnValue](./getreturnvalue/)() | يحصل على قيمة الإرجاع لطريقة خدمة XML [Web](../../system.web/). |
| [set_ContentEncoding](./set_contentencoding/)(String) | يضبط قيمة رأس 'Content-Encoding'. |
| [set_ContentType](./set_contenttype/)(String) | يضبط قيمة رأس 'Content-Type'. |
| [set_InParameters](./set_inparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | يضبط المعاملات التي يتم تمريرها إلى طريقة خدمة XML [Web](../../system.web/). |
| [set_InternalStream](./set_internalstream/)(System::SharedPtr\<System::IO::Stream\>) | يضبط الدفق الذي يحتوي على بيانات رسالة SOAP. |
| [set_OutParameters](./set_outparameters/)(System::ArrayPtr\<System::SharedPtr\<Object\>\>) | يضبط معلمات الإخراج التي تم تمريرها إلى طريقة خدمة XML [Web](../../system.web/). |
| [SetException](./setexception/)(SoapException) | يضبط الاستثناء الذي تُرمى بواسطة طريقة خدمة XML [Web](../../system.web/). |
| [SetHeaders](./setheaders/)(System::SharedPtr\<SoapHeaderCollection\>) | يضبط مجموعة رؤوس SOAP. |
| [SetStage](./setstage/)(SoapMessageStage) | يضبط مرحلة معالجة رسالة SOAP. |
| [SetStream](./setstream/)(System::SharedPtr\<System::IO::Stream\>) | يضبط الدفق الذي يحتوي على بيانات رسالة SOAP. |
| [SoapMessage](./soapmessage/)() | ينشئ نسخة جديدة. |
| [UpdateHeaderValues](./updateheadervalues/)(System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<SoapHeaderMapping\>\>) | يقوم بتحديث مجموعة رؤوس SOAP الداخلية. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
