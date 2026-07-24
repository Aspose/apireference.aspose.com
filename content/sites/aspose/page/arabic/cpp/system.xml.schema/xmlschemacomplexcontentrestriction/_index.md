---
title: "الفئة System::Xml::Schema::XmlSchemaComplexContentRestriction"
linktitle: "XmlSchemaComplexContentRestriction"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Xml::Schema::XmlSchemaComplexContentRestriction. تمثّل عنصر **restriction** من XML Schema كما حددت مجموعة الويب العالمية (W3C). هذه الفئة مخصصة للأنواع المركبة التي لها نموذج محتوى مركب مستمد عبر **restriction**. إنها تقيد محتويات النوع المركب إلى مجموعة فرعية من النوع المركب الموروث في C++."
type: docs
weight: 2000
url: /ar/cpp/system.xml.schema/xmlschemacomplexcontentrestriction/
---
## XmlSchemaComplexContentRestriction class


تمثّل عنصر **restriction** من XML [Schema](../) كما حددت مجموعة الويب العالمية [Web](../../system.web/). هذه الفئة مخصصة للأنواع المركبة التي لها نموذج محتوى مركب مستمد عبر **restriction**. إنها تقيد محتويات النوع المركب إلى مجموعة فرعية من النوع المركب الموروث.

```cpp
class XmlSchemaComplexContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | يعيد مكوّن [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) لنموذج المحتوى المركب. |
| [get_Attributes](./get_attributes/)() | يعيد مجموعة السمات للنوع المركب. يحتوي على العناصر [XmlSchemaAttribute](../xmlschemaattribute/) و[XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | يعيد اسم النوع المركب الذي يُشتق منه هذا النوع عن طريق restriction. |
| [get_Particle](./get_particle/)() | يعيد أحد الفئات [XmlSchemaGroupRef](../xmlschemagroupref/)، [XmlSchemaChoice](../xmlschemachoice/)، [XmlSchemaAll](../xmlschemaall/)، أو [XmlSchemaSequence](../xmlschemasequence/). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | يضبط مكوّن [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) لنموذج المحتوى المركب. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم النوع المركب الذي يُشتق منه هذا النوع عبر restriction. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | يضبط أحد الفئات [XmlSchemaGroupRef](../xmlschemagroupref/)، [XmlSchemaChoice](../xmlschemachoice/)، [XmlSchemaAll](../xmlschemaall/)، أو [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexContentRestriction](./xmlschemacomplexcontentrestriction/)() | يُنشئ مثلاً جديدًا من الفئة [XmlSchemaComplexContentRestriction](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaContent](../xmlschemacontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
