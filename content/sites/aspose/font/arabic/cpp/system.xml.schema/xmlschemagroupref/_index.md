---
title: "فئة System::Xml::Schema::XmlSchemaGroupRef"
linktitle: "XmlSchemaGroupRef"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::Schema::XmlSchemaGroupRef. تمثّل عنصر المجموعة مع سمة ref من مخطط XML كما هو محدد من قبل اتحاد الويب العالمي (W3C). تُستخدم هذه الفئة داخل الأنواع المعقّدة التي تشير إلى مجموعة معرفة على مستوى المخطط في C++."
type: docs
weight: 3300
url: /ar/cpp/system.xml.schema/xmlschemagroupref/
---
## XmlSchemaGroupRef class


يمثّل عنصر **group** مع سمة **ref** من XML [Schema](../) كما هو محدد من قبل اتحاد [Web](../../system.web/) العالمي (W3C). تُستخدم هذه الفئة داخل الأنواع المعقّدة التي تشير إلى **group** معرفة على مستوى **schema**.

```cpp
class XmlSchemaGroupRef : public System::Xml::Schema::XmlSchemaParticle
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Particle](./get_particle/)() | إرجاع أحد الفئات [XmlSchemaChoice](../xmlschemachoice/)، [XmlSchemaAll](../xmlschemaall/)، أو [XmlSchemaSequence](../xmlschemasequence/)، التي تحتفظ بتفسير ما بعد التجميع لقيمة **Particle**. |
| [get_RefName](./get_refname/)() | إرجاع اسم مجموعة معرفة في هذا المخطط (أو مخطط آخر يُحدّد بالمساحة الاسمية المحددة). |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | يحدد اسم المجموعة المعرفة في هذا المخطط (أو مخطط آخر يشير إليه الفضاء الاسمي المحدد). |
| [XmlSchemaGroupRef](./xmlschemagroupref/)() | يُنشئ مثيلًا جديدًا من الفئة [XmlSchemaGroupRef](./). |
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
