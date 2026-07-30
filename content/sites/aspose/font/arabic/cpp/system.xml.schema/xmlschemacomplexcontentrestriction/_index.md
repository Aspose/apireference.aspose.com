---
title: "System::Xml::Schema::XmlSchemaComplexContentRestriction class"
linktitle: "XmlSchemaComplexContentRestriction"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaComplexContentRestriction class. يمثل عنصر restriction من XML Schema كما هو محدد من قبل World Wide Web Consortium (W3C). هذه الفئة مخصصة للأنواع المركبة ذات نموذج محتوى مركب مشتق عن طريق القيد. تقوم بتقييد محتويات النوع المركب إلى مجموعة فرعية من النوع المركب الموروث في C++."
type: docs
weight: 2000
url: /ar/cpp/system.xml.schema/xmlschemacomplexcontentrestriction/
---
## XmlSchemaComplexContentRestriction class


يمثل عنصر **restriction** من XML [Schema](../) كما هو محدد من قبل World Wide [Web](../../system.web/) Consortium (W3C). هذه الفئة مخصصة للأنواع المركبة ذات نموذج محتوى مركب مشتق عن طريق القيد. تقوم بتقييد محتويات النوع المركب إلى مجموعة فرعية من النوع المركب الموروث.

```cpp
class XmlSchemaComplexContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | يعيد مكوّن [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) لنموذج المحتوى المركب. |
| [get_Attributes](./get_attributes/)() | يعيد مجموعة السمات للنوع المركب. تحتوي على عناصر [XmlSchemaAttribute](../xmlschemaattribute/) و [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | يعيد اسم النوع المركب الذي يُشتق منه هذا النوع عن طريق القيد. |
| [get_Particle](./get_particle/)() | إرجاع أحد الفئات [XmlSchemaGroupRef](../xmlschemagroupref/)، [XmlSchemaChoice](../xmlschemachoice/)، [XmlSchemaAll](../xmlschemaall/)، أو [XmlSchemaSequence](../xmlschemasequence/). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | يضبط المكوّن [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) لنموذج المحتوى المعقّد. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم نوع معقّد يُستمد منه هذا النوع عن طريق التقييد. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | يضبط أحد الفئات [XmlSchemaGroupRef](../xmlschemagroupref/)، [XmlSchemaChoice](../xmlschemachoice/)، [XmlSchemaAll](../xmlschemaall/)، أو [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexContentRestriction](./xmlschemacomplexcontentrestriction/)() | ينشئ مثيلًا جديدًا للفئة [XmlSchemaComplexContentRestriction](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaContent](../xmlschemacontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
