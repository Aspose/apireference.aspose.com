---
title: "الفئة System::Xml::Schema::XmlSchemaImport"
linktitle: "XmlSchemaImport"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Xml::Schema::XmlSchemaImport. تمثل عنصر **import** من XML Schema كما هو محدد من قبل اتحاد الويب العالمي (W3C). تُستخدم هذه الفئة لاستيراد مكونات المخطط من مخططات أخرى في C++."
type: docs
weight: 3500
url: /ar/cpp/system.xml.schema/xmlschemaimport/
---
## XmlSchemaImport class


تمثل عنصر **import** من XML [Schema](../) كما هو محدد من قبل اتحاد [Web](../../system.web/) العالمي (W3C). تُستخدم هذه الفئة لاستيراد مكونات المخطط من مخططات أخرى.

```cpp
class XmlSchemaImport : public System::Xml::Schema::XmlSchemaExternal
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Annotation](./get_annotation/)() | يعيد قيمة **annotation**. |
| [get_Namespace](./get_namespace/)() | يعيد مساحة الاسم الهدف للمخطط المستورد كمرجع معرف مورد موحد (URI). |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | يضبط قيمة **annotation**. |
| [set_Namespace](./set_namespace/)(const String\&) | يضبط مساحة الاسم الهدف للمخطط المستورد كمرجع معرف مورد موحد (URI). |
| [XmlSchemaImport](./xmlschemaimport/)() | ينشئ مثيلاً جديدًا من الفئة [XmlSchemaImport](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
