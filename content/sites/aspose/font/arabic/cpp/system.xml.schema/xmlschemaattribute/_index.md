---
title: "System::Xml::Schema::XmlSchemaAttribute فئة"
linktitle: "XmlSchemaAttribute"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaAttribute فئة. يمثل عنصر السمة من مخطط XML كما هو محدد من قبل اتحاد الويب العالمي (W3C). توفر السمات معلومات إضافية لعناصر المستند الأخرى. يتم تضمين وسم السمة بين وسوم عنصر المستند للمخطط. يعرض مستند XML السمات كعناصر مسماة في وسم الفتح لعنصر في C++."
type: docs
weight: 1100
url: /ar/cpp/system.xml.schema/xmlschemaattribute/
---
## XmlSchemaAttribute class


يمثل عنصر **attribute** من مخطط XML [Schema](../) كما هو محدد من قبل اتحاد الويب العالمي [Web](../../system.web/) (W3C). توفر السمات معلومات إضافية لعناصر المستند الأخرى. يتم تضمين وسم السمة بين وسوم عنصر المستند للمخطط. يعرض مستند XML السمات كعناصر مسماة في وسم الفتح لعنصر.

```cpp
class XmlSchemaAttribute : public System::Xml::Schema::XmlSchemaAnnotated
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_AttributeSchemaType](./get_attributeschematype/)() | يعيد كائنًا من نوع [XmlSchemaSimpleType](../xmlschemasimpletype/) يمثل نوع السمة بناءً على قيمة [XmlSchemaAttribute::get_SchemaType](./get_schematype/) أو [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) للسمة. |
| [get_AttributeType](./get_attributetype/)() | يعيد الكائن بناءً على قيمة [XmlSchemaAttribute::get_SchemaType](./get_schematype/) أو [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) للسمة التي تحتفظ بتفسير ما بعد التجميع لقيمة **AttributeType**. |
| [get_DefaultValue](./get_defaultvalue/)() | يعيد القيمة الافتراضية للسمة. |
| [get_FixedValue](./get_fixedvalue/)() | يعيد القيمة الثابتة للسمة. |
| [get_Form](./get_form/)() | يعيد الشكل للسمة. |
| [get_Name](./get_name/)() | يعيد اسم السمة. |
| [get_QualifiedName](./get_qualifiedname/)() | يعيد الاسم المؤهل للسمة. |
| [get_RefName](./get_refname/)() | يعيد اسم سمة تم إعلانها في هذا المخطط (أو مخطط آخر يُشار إليه بالمساحة الاسمية المحددة). |
| [get_SchemaType](./get_schematype/)() | يعيد نوع السمة إلى نوع بسيط. |
| [get_SchemaTypeName](./get_schematypename/)() | يعيد اسم النوع البسيط المعرفة في هذا المخطط (أو مخطط آخر يُشار إليه بالمساحة الاسمية المحددة). |
| [get_Use](./get_use/)() | يعيد معلومات حول كيفية استخدام السمة. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | يضبط القيمة الافتراضية للسمة. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | يضبط القيمة الثابتة للسمة. |
| [set_Form](./set_form/)(XmlSchemaForm) | يضبط الشكل للسمة. |
| [set_Name](./set_name/)(const String\&) | يضبط اسم السمة. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم سمة تم إعلانها في هذا المخطط (أو مخطط آخر يُشار إليه بالمساحة الاسمية المحددة). |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | يضبط نوع السمة إلى نوع بسيط. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم النوع البسيط المعرفة في هذا المخطط (أو مخطط آخر يُشار إليه بالمساحة الاسمية المحددة). |
| [set_Use](./set_use/)(XmlSchemaUse) | يضبط معلومات حول كيفية استخدام السمة. |
| [XmlSchemaAttribute](./xmlschemaattribute/)() | ينشئ مثيلاً جديدًا للفئة [XmlSchemaAttribute](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
