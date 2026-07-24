---
title: "فئة System::Xml::Schema::XmlSchemaElement"
linktitle: "XmlSchemaElement"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Xml::Schema::XmlSchemaElement. يمثل عنصر element من XML Schema كما هو محدد من قبل World Wide Web Consortium (W3C). هذه الفئة هي الفئة الأساسية لجميع أنواع الجسيمات وتُستخدم لوصف عنصر في مستند XML في C++."
type: docs
weight: 2600
url: /ar/cpp/system.xml.schema/xmlschemaelement/
---
## XmlSchemaElement class


يمثل **element** element من XML [Schema](../) كما هو محدد من قبل World Wide [Web](../../system.web/) Consortium (W3C). هذه الفئة هي الفئة الأساسية لجميع أنواع الجسيمات وتُستخدم لوصف عنصر في مستند XML.

```cpp
class XmlSchemaElement : public System::Xml::Schema::XmlSchemaParticle
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Block](./get_block/)() | يعيد اشتقاق **Block**. |
| [get_BlockResolved](./get_blockresolved/)() | يعيد تفسير ما بعد التجميع لقيمة **Block**. |
| [get_Constraints](./get_constraints/)() | يعيد مجموعة القيود على العنصر. |
| [get_DefaultValue](./get_defaultvalue/)() | يعيد القيمة الافتراضية للعنصر إذا كان محتواه من نوع بسيط أو محتوى العنصر هو **textOnly**. |
| [get_ElementSchemaType](./get_elementschematype/)() | يعيد كائنًا من نوع [XmlSchemaType](../xmlschematype/) يمثل نوع العنصر بناءً على قيمتي [XmlSchemaElement::get_SchemaType](./get_schematype/) أو [XmlSchemaElement::get_SchemaTypeName](./get_schematypename/) للعنصر. |
| [get_ElementType](./get_elementtype/)() | يعيد كائنًا يعتمد على [XmlSchemaElement](./) أو [XmlSchemaElement](./) للعنصر، والذي يحمل تفسير ما بعد التجميع لقيمة **ElementType**. |
| [get_Final](./get_final/)() | يعيد قيمة **Final** للإشارة إلى أنه لا يُسمح بمزيد من الاشتقاقات. |
| [get_FinalResolved](./get_finalresolved/)() | يعيد تفسير ما بعد التجميع لقيمة **Final**. |
| [get_FixedValue](./get_fixedvalue/)() | يعيد القيمة الثابتة. |
| [get_Form](./get_form/)() | يعيد الشكل للعنصر. |
| [get_IsAbstract](./get_isabstract/)() | يعيد معلومات لتحديد ما إذا كان يمكن استخدام العنصر في مستند مثيل. |
| [get_IsNillable](./get_isnillable/)() | يعيد معلومات تشير إلى ما إذا كان **xsi:nil** يمكن أن يظهر في بيانات المثيل. يشير إلى ما إذا كان يمكن تعيين قيمة nil صريحة للعنصر. |
| [get_Name](./get_name/)() | يعيد اسم العنصر. |
| [get_QualifiedName](./get_qualifiedname/)() | يعيد الاسم المؤهل الفعلي للعنصر المعطى. |
| [get_RefName](./get_refname/)() | يعيد الاسم المرجعي لعنصر تم إعلانه في هذا المخطط (أو مخطط آخر يشير إليه الفضاء الاسمي المحدد). |
| [get_SchemaType](./get_schematype/)() | يعيد نوع العنصر. يمكن أن يكون إما نوعًا مركبًا أو نوعًا بسيطًا. |
| [get_SchemaTypeName](./get_schematypename/)() | يعيد اسم نوع البيانات المدمج المعرف في هذا المخطط أو مخطط آخر يشير إليه الفضاء الاسمي المحدد. |
| [get_SubstitutionGroup](./get_substitutiongroup/)() | يعيد اسم العنصر الذي يتم استبداله بهذا العنصر. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | يضبط اشتقاق **Block**. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | يضبط القيمة الافتراضية للعنصر إذا كان محتواه نوعًا بسيطًا أو كان محتوى العنصر **textOnly**. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | يضبط القيمة **Final** للإشارة إلى عدم السماح بمزيد من الاشتقاقات. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | يضبط القيمة الثابتة. |
| [set_Form](./set_form/)(XmlSchemaForm) | يضبط الشكل للعنصر. |
| [set_IsAbstract](./set_isabstract/)(bool) | يضبط معلومات للإشارة إلى ما إذا كان يمكن استخدام العنصر في مستند مثيل. |
| [set_IsNillable](./set_isnillable/)(bool) | يضبط معلومات تشير إلى ما إذا كان **xsi:nil** يمكن أن يظهر في بيانات المثيل. يشير إلى ما إذا كان يمكن تعيين قيمة nil صريحة للعنصر. |
| [set_Name](./set_name/)(const String\&) | يضبط اسم العنصر. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم المرجع لعنصر مُعلن في هذا المخطط (أو مخطط آخر يُشير إليه النطاق المحدد). |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | يضبط نوع العنصر. يمكن أن يكون إما نوعًا مركبًا أو نوعًا بسيطًا. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم نوع البيانات المدمج المُعرّف في هذا المخطط أو مخطط آخر يُشير إليه النطاق المحدد. |
| [set_SubstitutionGroup](./set_substitutiongroup/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم العنصر الذي يتم استبداله بهذا العنصر. |
| [XmlSchemaElement](./xmlschemaelement/)() | ينشئ نسخة جديدة من الفئة [XmlSchemaElement](./). |
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
