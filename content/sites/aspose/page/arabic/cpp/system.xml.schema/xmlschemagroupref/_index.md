---
title: "System::Xml::Schema::XmlSchemaGroupRef class"
linktitle: "XmlSchemaGroupRef"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaGroupRef class. يمثل عنصر **group** مع سمة **ref** من مخطط XML كما هو محدد من قبل اتحاد الويب العالمي (W3C). تُستخدم هذه الفئة داخل الأنواع المركبة التي تشير إلى مجموعة معرفة على مستوى المخطط في C++."
type: docs
weight: 3300
url: /ar/cpp/system.xml.schema/xmlschemagroupref/
---
## XmlSchemaGroupRef class


يمثل عنصر **group** مع سمة **ref** من XML [Schema](../) كما هو محدد من قبل اتحاد الويب العالمي [Web](../../system.web/). تُستخدم هذه الفئة داخل الأنواع المركبة التي تشير إلى **group** معرفة على مستوى **schema**.

```cpp
class XmlSchemaGroupRef : public System::Xml::Schema::XmlSchemaParticle
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Particle](./get_particle/)() | يعيد أحد الفئات [XmlSchemaChoice](../xmlschemachoice/)، [XmlSchemaAll](../xmlschemaall/)، أو [XmlSchemaSequence](../xmlschemasequence/)، والتي تحتفظ بتفسير ما بعد التجميع لقيمة **Particle**. |
| [get_RefName](./get_refname/)() | يعيد اسم مجموعة معرفة في هذا المخطط (أو مخطط آخر يُشار إليه بالمساحة الاسمية المحددة). |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم مجموعة معرفة في هذا المخطط (أو مخطط آخر يُشار إليه بالمساحة الاسمية المحددة). |
| [XmlSchemaGroupRef](./xmlschemagroupref/)() | يُنشئ مثيلاً جديدًا من الفئة [XmlSchemaGroupRef](./). |
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
