---
title: "System::Xml::Schema::XmlSchemaExternal فئة"
linktitle: "XmlSchemaExternal"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaExternal فئة. يوفر معلومات حول المخطط المتضمن في C++."
type: docs
weight: 2800
url: /ar/cpp/system.xml.schema/xmlschemaexternal/
---
## XmlSchemaExternal class


يوفر معلومات حول المخطط المتضمن.

```cpp
class XmlSchemaExternal : public System::Xml::Schema::XmlSchemaObject
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Id](./get_id/)() | إرجاع معرف السلسلة. |
| [get_Schema](./get_schema/)() | إرجاع الـ [XmlSchema](../xmlschema/) للمخطط المشار إليه. |
| [get_SchemaLocation](./get_schemalocation/)() | إرجاع موقع معرف الموارد الموحد (URI) للمخطط، والذي يخبر معالج المخطط بمكان وجود المخطط فعليًا. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | إرجاع السمات المؤهلة، التي لا تنتمي إلى مساحة اسم الهدف للمخطط. |
| [set_Id](./set_id/)(const String\&) | يضبط معرف السلسلة. |
| [set_Schema](./set_schema/)(const SharedPtr\<XmlSchema\>\&) | يضبط الـ [XmlSchema](../xmlschema/) للمخطط المشار إليه. |
| [set_SchemaLocation](./set_schemalocation/)(const String\&) | يضبط موقع معرف الموارد الموحد (URI) للمخطط، والذي يخبر معالج المخطط بمكان وجود المخطط فعليًا. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | يضبط السمات المؤهلة، التي لا تنتمي إلى مساحة اسم الهدف للمخطط. |
| [XmlSchemaExternal](./xmlschemaexternal/)() | ينشئ مثيلًا جديدًا للفئة [XmlSchemaExternal](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
