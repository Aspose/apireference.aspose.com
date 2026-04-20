---
title: "فئة System::Xml::Schema::XmlSchemaGroup"
linktitle: "XmlSchemaGroup"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::Schema::XmlSchemaGroup. تمثّل عنصر group من مخطط XML كما هو محدد من قبل اتحاد الويب العالمي (W3C). تُعرّف هذه الفئة مجموعات على مستوى schema يتم الإشارة إليها من الأنواع المعقّدة. تُجمّع مجموعة من إعلانات العناصر بحيث يمكن دمجها كمجموعة في تعريفات الأنواع المعقّدة في C++."
type: docs
weight: 3100
url: /ar/cpp/system.xml.schema/xmlschemagroup/
---
## XmlSchemaGroup class


يمثّل عنصر **group** من XML [Schema](../) كما هو محدد من قبل اتحاد [Web](../../system.web/) العالمي (W3C). تُعرّف هذه الفئة مجموعات على مستوى **schema** يتم الإشارة إليها من الأنواع المعقّدة. تُجمّع مجموعة من إعلانات العناصر بحيث يمكن دمجها كمجموعة في تعريفات الأنواع المعقّدة.

```cpp
class XmlSchemaGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Name](./get_name/)() | إرجاع اسم مجموعة المخطط. |
| [get_Particle](./get_particle/)() | إرجاع أحد الفئات [XmlSchemaChoice](../xmlschemachoice/)، [XmlSchemaAll](../xmlschemaall/)، أو [XmlSchemaSequence](../xmlschemasequence/). |
| [get_QualifiedName](./get_qualifiedname/)() | إرجاع الاسم المؤهل لمجموعة المخطط. |
| [set_Name](./set_name/)(const String\&) | يضبط اسم مجموعة المخطط. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaGroupBase\>\&) | يضبط أحد الفئات [XmlSchemaChoice](../xmlschemachoice/)، [XmlSchemaAll](../xmlschemaall/)، أو [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaGroup](./xmlschemagroup/)() | ينشئ مثيلًا جديدًا للفئة [XmlSchemaGroup](./). |
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
