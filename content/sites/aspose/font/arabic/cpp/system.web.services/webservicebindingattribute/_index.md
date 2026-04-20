---
title: "الفئة System::Web::Services::WebServiceBindingAttribute"
linktitle: "WebServiceBindingAttribute"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Web::Services::WebServiceBindingAttribute. تُستخدم لإعلان ربط يحدد طريقة واحدة أو أكثر من خدمة الويب XML. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 400
url: /ar/cpp/system.web.services/webservicebindingattribute/
---
## WebServiceBindingAttribute class


تُستخدم لإعلان ربط يحدد طريقة واحدة أو أكثر من خدمة الويب XML [Web](../../system.web/). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class WebServiceBindingAttribute : public System::Attribute
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_ConformsTo](./get_conformsto/)() | يحصل على مواصفة WSI. |
| [get_EmitConformanceClaims](./get_emitconformanceclaims/)() | يحصل على قيمة تشير إلى ما إذا كان الربط يصدر مطالبات التوافق. |
| [get_Location](./get_location/)() | معلومات RTTI. |
| [get_Name](./get_name/)() | يحصل على اسم الربط. |
| [get_Namespace](./get_namespace/)() | يحصل على مساحة الاسم المرتبطة بالربط. |
| [set_ConformsTo](./set_conformsto/)(System::SharedPtr\<WsiProfiles\>) | يضبط مواصفة WSI. |
| [set_EmitConformanceClaims](./set_emitconformanceclaims/)(bool) | يضبط قيمة تشير إلى ما إذا كان الربط يصدر مطالبات التوافق. |
| [set_Location](./set_location/)(String) | يضبط الموقع الذي يُعرّف فيه الربط. |
| [set_Name](./set_name/)(String) | يضبط اسم الربط. |
| [set_Namespace](./set_namespace/)(String) | يضبط مساحة الاسم المرتبطة بالربط. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)() | ينشئ نسخة جديدة. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String) | ينشئ نسخة جديدة. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String) | ينشئ نسخة جديدة. |
| [WebServiceBindingAttribute](./webservicebindingattribute/)(String, String, String) | ينشئ نسخة جديدة. |
## انظر أيضًا

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services](../)
* Library [Aspose.Font for C++](../../)
