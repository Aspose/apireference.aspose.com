---
title: "System::Xml::Schema::XmlSchemaAnyAttribute فئة"
linktitle: "XmlSchemaAnyAttribute"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaAnyAttribute فئة. يمثل عنصر anyAttribute الخاص بـ World Wide Web Consortium (W3C) في C++."
type: docs
weight: 900
url: /ar/cpp/system.xml.schema/xmlschemaanyattribute/
---
## XmlSchemaAnyAttribute class


يمثل الاتحاد العالمي [Web](../../system.web/) (W3C) العنصر **anyAttribute**.

```cpp
class XmlSchemaAnyAttribute : public System::Xml::Schema::XmlSchemaAnnotated
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Namespace](./get_namespace/)() | يعيد المساحات الاسمية التي تحتوي على السمات التي يمكن استخدامها. |
| [get_ProcessContents](./get_processcontents/)() | يعيد معلومات حول كيفية تعامل التطبيق أو معالج XML مع التحقق من صحة مستندات XML للسمات المحددة بواسطة عنصر **anyAttribute**. |
| [set_Namespace](./set_namespace/)(const String\&) | يضبط مساحات الأسماء التي تحتوي على السمات التي يمكن استخدامها. |
| [set_ProcessContents](./set_processcontents/)(XmlSchemaContentProcessing) | يضبط معلومات حول كيفية تعامل التطبيق أو معالج XML مع التحقق من صحة مستندات XML للسمات المحددة بواسطة عنصر **anyAttribute**. |
| [XmlSchemaAnyAttribute](./xmlschemaanyattribute/)() | ينشئ مثيلاً جديداً من الفئة [XmlSchemaAnyAttribute](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
