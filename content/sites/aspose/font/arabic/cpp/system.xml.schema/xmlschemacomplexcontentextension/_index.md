---
title: "الفئة System::Xml::Schema::XmlSchemaComplexContentExtension"
linktitle: "XmlSchemaComplexContentExtension"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Xml::Schema::XmlSchemaComplexContentExtension. تمثل عنصر **extension** من مخطط XML كما حددته مجموعة الويب العالمية (W3C). هذه الفئة مخصصة للأنواع المعقدة ذات نموذج محتوى معقد مشتق بالامتداد. تقوم بتمديد النوع المعقد بإضافة سمات أو عناصر في C++."
type: docs
weight: 1900
url: /ar/cpp/system.xml.schema/xmlschemacomplexcontentextension/
---
## XmlSchemaComplexContentExtension class


يمثل عنصر **extension** من XML [Schema](../) كما حددته مجموعة الويب العالمية [Web](../../system.web/) (W3C). هذه الفئة مخصصة للأنواع المعقدة ذات نموذج محتوى معقد مشتق بالامتداد. تقوم بتمديد النوع المعقد بإضافة سمات أو عناصر.

```cpp
class XmlSchemaComplexContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | يعيد مكوّن [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) لنموذج المحتوى المركب. |
| [get_Attributes](./get_attributes/)() | يعيد مجموعة السمات للمحتوى المعقد. يحتوي على عناصر [XmlSchemaAttribute](../xmlschemaattribute/) و [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | يعيد اسم النوع المعقد الذي يُشتق منه هذا النوع عبر التوسيع. |
| [get_Particle](./get_particle/)() | إرجاع أحد الفئات [XmlSchemaGroupRef](../xmlschemagroupref/)، [XmlSchemaChoice](../xmlschemachoice/)، [XmlSchemaAll](../xmlschemaall/)، أو [XmlSchemaSequence](../xmlschemasequence/). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | يضبط المكوّن [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) لنموذج المحتوى المعقّد. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم النوع المعقد الذي يُشتق منه هذا النوع عبر التوسيع. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | يضبط أحد الفئات [XmlSchemaGroupRef](../xmlschemagroupref/)، [XmlSchemaChoice](../xmlschemachoice/)، [XmlSchemaAll](../xmlschemaall/)، أو [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexContentExtension](./xmlschemacomplexcontentextension/)() | ينشئ مثيلاً جديداً للفئة [XmlSchemaComplexContentExtension](./). |
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
