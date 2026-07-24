---
title: "System::Xml::Schema::XmlSchemaAny فئة"
linktitle: "XmlSchemaAny"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaAny فئة. يمثل عنصر any من اتحاد الويب العالمي (W3C) في C++."
type: docs
weight: 800
url: /ar/cpp/system.xml.schema/xmlschemaany/
---
## XmlSchemaAny class


يمثل عنصر **any** من اتحاد [Web](../../system.web/) العالمي (W3C).

```cpp
class XmlSchemaAny : public System::Xml::Schema::XmlSchemaParticle
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Namespace](./get_namespace/)() | يرجع مساحات الأسماء التي تحتوي على العناصر التي يمكن استخدامها. |
| [get_ProcessContents](./get_processcontents/)() | يرجع معلومات حول كيفية تعامل التطبيق أو معالج XML مع التحقق من صحة مستندات XML للعناصر المحددة بواسطة عنصر **any**. |
| [set_Namespace](./set_namespace/)(const String\&) | يضبط مساحات الأسماء التي تحتوي على العناصر التي يمكن استخدامها. |
| [set_ProcessContents](./set_processcontents/)(XmlSchemaContentProcessing) | يضبط معلومات حول كيفية تعامل التطبيق أو معالج XML مع التحقق من صحة مستندات XML للعناصر المحددة بواسطة عنصر **any**. |
| [XmlSchemaAny](./xmlschemaany/)() | يُنشئ مثلاً جديداً من الفئة [XmlSchemaAny](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaParticle](../xmlschemaparticle/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
