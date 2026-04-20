---
title: "System::Xml::Schema::XmlSchemaImport فئة"
linktitle: "XmlSchemaImport"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaImport فئة. يمثل عنصر **import** من XML Schema كما حددته مجموعة الويب العالمية (W3C). تُستخدم هذه الفئة لاستيراد مكونات المخطط من مخططات أخرى في C++."
type: docs
weight: 3500
url: /ar/cpp/system.xml.schema/xmlschemaimport/
---
## XmlSchemaImport class


يمثل عنصر **import** من XML [Schema](../) كما حددته مجموعة الويب العالمية [Web](../../system.web/). تُستخدم هذه الفئة لاستيراد مكونات المخطط من مخططات أخرى.

```cpp
class XmlSchemaImport : public System::Xml::Schema::XmlSchemaExternal
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Annotation](./get_annotation/)() | يرجع قيمة **annotation**. |
| [get_Namespace](./get_namespace/)() | يرجع مساحة الاسم الهدف للمخطط المستورد كمرجع معرف مورد موحد (URI). |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | يضبط قيمة **annotation**. |
| [set_Namespace](./set_namespace/)(const String\&) | يضبط مساحة الاسم الهدف للمخطط المستورد كمرجع معرف مورد موحد (URI). |
| [XmlSchemaImport](./xmlschemaimport/)() | ينشئ مثيلاً جديدًا من الفئة [XmlSchemaImport](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
