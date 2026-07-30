---
title: "الفئة System::Xml::Schema::XmlSchemaAny"
linktitle: "XmlSchemaAny"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaAny class. يمثل عنصر any الخاص بـ World Wide Web Consortium (W3C) في C++."
type: docs
weight: 800
url: /ar/cpp/system.xml.schema/xmlschemaany/
---
## XmlSchemaAny class


يمثل عنصر **any** الخاص بـ World Wide [Web](../../system.web/) Consortium (W3C).

```cpp
class XmlSchemaAny : public System::Xml::Schema::XmlSchemaParticle
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Namespace](./get_namespace/)() | يعيد المساحات الاسمية التي تحتوي على العناصر التي يمكن استخدامها. |
| [get_ProcessContents](./get_processcontents/)() | يعيد معلومات حول كيفية تعامل التطبيق أو معالج XML مع التحقق من صحة مستندات XML للعناصر المحددة بواسطة العنصر **any**. |
| [set_Namespace](./set_namespace/)(const String\&) | يضبط المساحات الاسمية التي تحتوي على العناصر التي يمكن استخدامها. |
| [set_ProcessContents](./set_processcontents/)(XmlSchemaContentProcessing) | يضبط معلومات حول كيفية تعامل التطبيق أو معالج XML مع التحقق من صحة مستندات XML للعناصر المحددة بواسطة العنصر **any**. |
| [XmlSchemaAny](./xmlschemaany/)() | ينشئ مثيلاً جديداً من الفئة [XmlSchemaAny](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
