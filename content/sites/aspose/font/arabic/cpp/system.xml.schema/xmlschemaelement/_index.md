---
title: "الفئة System::Xml::Schema::XmlSchemaElement"
linktitle: "XmlSchemaElement"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Xml::Schema::XmlSchemaElement. تمثل العنصر element من مخطط XML كما حددتها مجموعة الويب العالمية (W3C). هذه الفئة هي الفئة الأساسية لجميع أنواع الجسيمات وتُستخدم لوصف عنصر في مستند XML في C++."
type: docs
weight: 2600
url: /ar/cpp/system.xml.schema/xmlschemaelement/
---
## XmlSchemaElement class


يمثل العنصر **element** من XML [Schema](../) كما حددتها مجموعة الويب العالمية [Web](../../system.web/). هذه الفئة هي الفئة الأساسية لجميع أنواع الجسيمات وتُستخدم لوصف عنصر في مستند XML.

```cpp
class XmlSchemaElement : public System::Xml::Schema::XmlSchemaParticle
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Block](./get_block/)() | يعيد اشتقاق **Block**. |
| [get_BlockResolved](./get_blockresolved/)() | يعيد تفسير ما بعد التجميع لقيمة **Block**. |
| [get_Constraints](./get_constraints/)() | يعيد مجموعة القيود على العنصر. |
| [get_DefaultValue](./get_defaultvalue/)() | يعيد القيمة الافتراضية للعنصر إذا كان محتواه من نوع بسيط أو كان محتوى العنصر **textOnly**. |
| [get_ElementSchemaType](./get_elementschematype/)() | يعيد كائن [XmlSchemaType](../xmlschematype/) يمثل نوع العنصر بناءً على قيم [XmlSchemaElement::get_SchemaType](./get_schematype/) أو [XmlSchemaElement::get_SchemaTypeName](./get_schematypename/) للعنصر. |
| [get_ElementType](./get_elementtype/)() | يعيد كائنًا يعتمد على [XmlSchemaElement](./) أو [XmlSchemaElement](./) للعنصر، والذي يحتوي على تفسير ما بعد التجميع لقيمة **ElementType**. |
| [get_Final](./get_final/)() | يعيد قيمة **Final** للدلالة على عدم السماح بمزيد من الاشتقاقات. |
| [get_FinalResolved](./get_finalresolved/)() | يعيد تفسير ما بعد التجميع لقيمة **Final**. |
| [get_FixedValue](./get_fixedvalue/)() | يعيد القيمة الثابتة. |
| [get_Form](./get_form/)() | يعيد الشكل للعنصر. |
| [get_IsAbstract](./get_isabstract/)() | يعيد معلومات لتحديد ما إذا كان يمكن استخدام العنصر في مستند مثال. |
| [get_IsNillable](./get_isnillable/)() | يعيد معلومات تشير إلى ما إذا كان **xsi:nil** يمكن أن يظهر في بيانات المثال. يشير إلى ما إذا كان يمكن تعيين قيمة nil صريحة للعنصر. |
| [get_Name](./get_name/)() | يعيد اسم العنصر. |
| [get_QualifiedName](./get_qualifiedname/)() | يعيد الاسم المؤهل الفعلي للعنصر المحدد. |
| [get_RefName](./get_refname/)() | يعيد اسم المرجع لعنصر تم إعلانه في هذا المخطط (أو مخطط آخر يُحدده الفضاء الاسمي المحدد). |
| [get_SchemaType](./get_schematype/)() | يعيد نوع العنصر. يمكن أن يكون إما نوعًا مركبًا أو نوعًا بسيطًا. |
| [get_SchemaTypeName](./get_schematypename/)() | يعيد اسم نوع بيانات مدمج معرف في هذا المخطط أو مخطط آخر يُحدده الفضاء الاسمي المحدد. |
| [get_SubstitutionGroup](./get_substitutiongroup/)() | يعيد اسم العنصر الذي يتم استبداله بهذا العنصر. |
| [set_Block](./set_block/)(XmlSchemaDerivationMethod) | يضبط اشتقاق **Block**. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | يضبط القيمة الافتراضية للعنصر إذا كان محتواه من نوع بسيط أو كان محتوى العنصر **textOnly**. |
| [set_Final](./set_final/)(XmlSchemaDerivationMethod) | يضبط قيمة **Final** للدلالة على عدم السماح بمزيد من الاشتقاقات. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | يضبط القيمة الثابتة. |
| [set_Form](./set_form/)(XmlSchemaForm) | يضبط الشكل للعنصر. |
| [set_IsAbstract](./set_isabstract/)(bool) | يضبط معلومات لتحديد ما إذا كان يمكن استخدام العنصر في مستند مثال. |
| [set_IsNillable](./set_isnillable/)(bool) | يضبط معلومات تشير إلى ما إذا كان **xsi:nil** يمكن أن يظهر في بيانات المثال. يشير إلى ما إذا كان يمكن تعيين قيمة nil صريحة للعنصر. |
| [set_Name](./set_name/)(const String\&) | يضبط اسم العنصر. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم المرجع لعنصر تم إعلانه في هذا المخطط (أو مخطط آخر يُحدده الفضاء الاسمي المحدد). |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | يضبط نوع العنصر. يمكن أن يكون إما نوعًا مركبًا أو نوعًا بسيطًا. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم نوع البيانات المدمج المعرفة في هذا المخطط أو مخطط آخر يُشار إليه بواسطة مساحة الاسم المحددة. |
| [set_SubstitutionGroup](./set_substitutiongroup/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم العنصر الذي يتم استبداله بهذا العنصر. |
| [XmlSchemaElement](./xmlschemaelement/)() | ينشئ نسخة جديدة من الفئة [XmlSchemaElement](./). |
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
