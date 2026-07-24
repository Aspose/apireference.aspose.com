---
title: "System::Xml::Schema::XmlSchemaComplexContentExtension class"
linktitle: "XmlSchemaComplexContentExtension"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaComplexContentExtension class. يمثل عنصر الامتداد من XML Schema كما هو محدد من قبل اتحاد الويب العالمي (W3C). هذه الفئة مخصصة للأنواع المعقدة ذات نموذج محتوى معقد مشتق بالامتداد. يضيف هذا الامتداد إلى النوع المعقد بإضافة سمات أو عناصر في C++."
type: docs
weight: 1900
url: /ar/cpp/system.xml.schema/xmlschemacomplexcontentextension/
---
## XmlSchemaComplexContentExtension class


يمثل عنصر **extension** من XML [Schema](../) كما هو محدد من قبل اتحاد الويب العالمي [Web](../../system.web/) (W3C). هذه الفئة مخصصة للأنواع المعقدة ذات نموذج محتوى معقد مشتق بالامتداد. يضيف هذا الامتداد إلى النوع المعقد بإضافة سمات أو عناصر.

```cpp
class XmlSchemaComplexContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | يعيد مكوّن [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) لنموذج المحتوى المركب. |
| [get_Attributes](./get_attributes/)() | يعيد مجموعة السمات للمحتوى المعقد. يحتوي على عناصر [XmlSchemaAttribute](../xmlschemaattribute/) و[XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | يعيد اسم النوع المعقد الذي يُشتق منه هذا النوع بالامتداد. |
| [get_Particle](./get_particle/)() | يعيد أحد الفئات [XmlSchemaGroupRef](../xmlschemagroupref/)، [XmlSchemaChoice](../xmlschemachoice/)، [XmlSchemaAll](../xmlschemaall/)، أو [XmlSchemaSequence](../xmlschemasequence/). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | يضبط مكوّن [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) لنموذج المحتوى المركب. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم النوع المعقد الذي يُشتق منه هذا النوع بالامتداد. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | يضبط أحد الفئات [XmlSchemaGroupRef](../xmlschemagroupref/)، [XmlSchemaChoice](../xmlschemachoice/)، [XmlSchemaAll](../xmlschemaall/)، أو [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexContentExtension](./xmlschemacomplexcontentextension/)() | ينشئ مثيلاً جديداً من الفئة [XmlSchemaComplexContentExtension](./). |
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
