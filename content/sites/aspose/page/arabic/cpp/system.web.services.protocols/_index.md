---
title: "النطاق System::Web::Services::Protocols"
linktitle: "System::Web::Services::Protocols"
second_title: "Aspose.Page لـ C++"
description: "كيفية استخدام النطاق System::Web::Services::Protocols في C++."
type: docs
weight: 7100
url: /ar/cpp/system.web.services.protocols/
---



## الفئات

| فئة | الوصف |
| --- | --- |
| [HttpWebClientProtocol](./httpwebclientprotocol/) | هذه الفئة الأساسية تُستخدم في جميع وكلاء عميل خدمة XML [Web](../system.web/) الذين يستخدمون HTTP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كوسيط. |
| [InvokeCompletedEventArgs](./invokecompletedeventargs/) | يتم تمرير نسخة من هذه الفئة كوسيط إلى مندوب InvokeCompletedEventHandler. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كوسيط. |
| [SoapClientMessage](./soapclientmessage/) | يمثل البيانات في طلب SOAP المرسل أو استجابة SOAP المستلمة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة داخل مؤشر [System::SmartPtr](../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كوسيط. |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/) | يحدد أن جميع رسائل SOAP التي يتم تمريرها أو إرجاعها من الطريقة تستخدم تنسيق المستند. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/) | يضبط التنسيق الافتراضي لطلبات SOAP والاستجابات. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [SoapHeader](./soapheader/) | يمثل محتوى رأس SOAP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [SoapHeaderAttribute](./soapheaderattribute/) | يحدد رأس SOAP الذي يمكن لطريقة خدمة XML [Web](../system.web/) أو عميل خدمة XML [Web](../system.web/) معالجته. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [SoapHeaderCollection](./soapheadercollection/) | يحتوي على مجموعة من مثيلات الفئة [SoapHeader](./soapheader/). |
| [SoapHttpClientProtocol](./soaphttpclientprotocol/) | يجب أن ترث خدمات وكيل العميل هذه الفئة عندما يتم استخدام SOAP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [SoapMessage](./soapmessage/) | يمثل رسالة SOAP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل. |
| [WebClientProtocol](./webclientprotocol/) | يُستخدم هذا الصف الأساسي في جميع وكلاء عميل خدمة XML [Web](../system.web/) الذين تم إنشاؤهم باستخدام ASP.NET. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../system/makeobject/). لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل. |
## Enums

| تعداد | الوصف |
| --- | --- |
| [SoapHeaderDirection](./soapheaderdirection/) | يسرد اتجاهات رأس SOAP. |
| [SoapMessageStage](./soapmessagestage/) | يسرد مراحل معالجة رسائل SOAP. |
| [SoapParameterStyle](./soapparameterstyle/) | يسرد صيغ المعلمات في رسالة SOAP. |
| [SoapProtocolVersion](./soapprotocolversion/) | يسرد إصدارات SOAP. |
| [SoapServiceRoutingStyle](./soapserviceroutingstyle/) | يسرد خيارات كيفية توجيه رسالة SOAP إلى خدمة XML [Web](../system.web/). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [SoapException](./soapexception/) |  |
