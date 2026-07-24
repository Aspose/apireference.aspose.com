---
title: "System::Xml::Schema::XmlSchemaAttribute class"
linktitle: "XmlSchemaAttribute"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaAttribute class. يمثل عنصر attribute من مخطط XML كما هو محدد من قبل اتحاد الويب العالمي (W3C). توفر السمات معلومات إضافية لعناصر المستند الأخرى. يتم وضع علامة attribute بين علامات عنصر المستند للمخطط. يعرض مستند XML السمات كعناصر مسماة في علامة الفتح للعنصر في C++."
type: docs
weight: 1100
url: /ar/cpp/system.xml.schema/xmlschemaattribute/
---
## XmlSchemaAttribute class


يمثل عنصر **attribute** من XML [Schema](../) كما هو محدد من قبل اتحاد الويب العالمي [Web](../../system.web/) (W3C). توفر السمات معلومات إضافية لعناصر المستند الأخرى. يتم وضع علامة attribute بين علامات عنصر المستند للمخطط. يعرض مستند XML السمات كعناصر مسماة في علامة الفتح للعنصر.

```cpp
class XmlSchemaAttribute : public System::Xml::Schema::XmlSchemaAnnotated
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_AttributeSchemaType](./get_attributeschematype/)() | يعيد كائنًا من نوع [XmlSchemaSimpleType](../xmlschemasimpletype/) يمثل نوع attribute بناءً على قيمة [XmlSchemaAttribute::get_SchemaType](./get_schematype/) أو [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) للattribute. |
| [get_AttributeType](./get_attributetype/)() | يعيد الكائن بناءً على قيمة [XmlSchemaAttribute::get_SchemaType](./get_schematype/) أو [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) للattribute التي تحتفظ بتفسير ما بعد التجميع لقيمة **AttributeType**. |
| [get_DefaultValue](./get_defaultvalue/)() | يعيد القيمة الافتراضية للattribute. |
| [get_FixedValue](./get_fixedvalue/)() | يعيد القيمة الثابتة للattribute. |
| [get_Form](./get_form/)() | يعيد الشكل للattribute. |
| [get_Name](./get_name/)() | يعيد اسم attribute. |
| [get_QualifiedName](./get_qualifiedname/)() | يعيد الاسم المؤهل للattribute. |
| [get_RefName](./get_refname/)() | يعيد اسم attribute معلن في هذا المخطط (أو مخطط آخر يشير إليه مساحة الاسم المحددة). |
| [get_SchemaType](./get_schematype/)() | يعيد نوع السمة إلى نوع بسيط. |
| [get_SchemaTypeName](./get_schematypename/)() | يعيد اسم النوع البسيط المعرفة في هذا المخطط (أو مخطط آخر يشير إليه الفضاء الاسمي المحدد). |
| [get_Use](./get_use/)() | يعيد معلومات حول كيفية استخدام السمة. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | يضبط القيمة الافتراضية للسمة. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | يضبط القيمة الثابتة للسمة. |
| [set_Form](./set_form/)(XmlSchemaForm) | يضبط الشكل للسمة. |
| [set_Name](./set_name/)(const String\&) | يضبط اسم السمة. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم سمة معلنة في هذا المخطط (أو مخطط آخر يشير إليه الفضاء الاسمي المحدد). |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | يضبط نوع السمة إلى نوع بسيط. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم النوع البسيط المعرفة في هذا المخطط (أو مخطط آخر يشير إليه الفضاء الاسمي المحدد). |
| [set_Use](./set_use/)(XmlSchemaUse) | يضبط معلومات حول كيفية استخدام السمة. |
| [XmlSchemaAttribute](./xmlschemaattribute/)() | يُنشئ نسخة جديدة من الفئة [XmlSchemaAttribute](./). |
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
