---
title: "System::Web::Services::Protocols::SoapHeader class"
linktitle: "SoapHeader"
second_title: "Aspose.Font لـ C++"
description: "System::Web::Services::Protocols::SoapHeader class. يمثل محتوى رأس SOAP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.web.services.protocols/soapheader/
---
## SoapHeader class


يمثل محتوى رأس SOAP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class SoapHeader : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Actor](./get_actor/)() | يحصل على URI لمستقبل رأس SOAP عندما يتم استخدام نسخة SOAP 1.1. |
| [get_DidUnderstand](./get_didunderstand/)() | يحصل على قيمة تشير إلى ما إذا كان رأس SOAP قد تم معالجته بشكل صحيح. |
| [get_EncodedMustUnderstand](./get_encodedmustunderstand/)() | يحصل على قيمة سمة 'mustUnderstand' عندما يتم استخدام نسخة SOAP 1.1. |
| [get_EncodedMustUnderstand12](./get_encodedmustunderstand12/)() | يحصل على قيمة سمة 'mustUnderstand' عندما يتم استخدام نسخة SOAP 1.2. |
| [get_EncodedRelay](./get_encodedrelay/)() | يحصل على تمثيل نصي لقيمة السمة 'relay'. |
| [get_MustUnderstand](./get_mustunderstand/)() | يحصل على قيمة تشير إلى ما إذا كان يجب فهم رأس SOAP. |
| [get_Relay](./get_relay/)() | يحصل على قيمة السمة 'relay'. |
| [get_Role](./get_role/)() | يحصل على URI لمستلم رأس SOAP عند استخدام نسخة SOAP 1.2. |
| [set_Actor](./set_actor/)(String) | يضبط URI لمستلم رأس SOAP عند استخدام نسخة SOAP 1.1. |
| [set_DidUnderstand](./set_didunderstand/)(bool) | يضبط قيمة تشير إلى ما إذا كان رأس SOAP قد تم معالجته بشكل صحيح. |
| [set_EncodedMustUnderstand](./set_encodedmustunderstand/)(String) | يضبط قيمة السمة 'mustUnderstand' عند استخدام نسخة SOAP 1.1. |
| [set_EncodedMustUnderstand12](./set_encodedmustunderstand12/)(String) | يضبط قيمة السمة 'mustUnderstand' عند استخدام نسخة SOAP 1.2. |
| [set_EncodedRelay](./set_encodedrelay/)(String) | يضبط تمثيلًا نصيًا لقيمة السمة 'relay'. |
| [set_MustUnderstand](./set_mustunderstand/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب فهم رأس SOAP. |
| [set_Relay](./set_relay/)(bool) | يضبط قيمة السمة 'relay'. |
| [set_Role](./set_role/)(String) | يضبط URI لمستلم رأس SOAP عند استخدام نسخة SOAP 1.2. |
| [SoapHeader](./soapheader/)(System::SharedPtr\<Xml::XmlElement\>) | ينشئ نسخة جديدة. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
