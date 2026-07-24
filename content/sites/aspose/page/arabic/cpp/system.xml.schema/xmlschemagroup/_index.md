---
title: "الفئة System::Xml::Schema::XmlSchemaGroup"
linktitle: "XmlSchemaGroup"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Xml::Schema::XmlSchemaGroup. تمثّل عنصر group من XML Schema كما حددت مجموعة الويب العالمية (W3C). هذه الفئة تُعرّف المجموعات على مستوى schema التي يتم الإشارة إليها من الأنواع المركبة. إنها تجمع مجموعة من إعلانات العناصر بحيث يمكن دمجها كمجموعة في تعريفات الأنواع المركبة في C++."
type: docs
weight: 3100
url: /ar/cpp/system.xml.schema/xmlschemagroup/
---
## XmlSchemaGroup class


تمثّل عنصر **group** من XML [Schema](../) كما حددت مجموعة الويب العالمية [Web](../../system.web/). هذه الفئة تُعرّف المجموعات على مستوى **schema** التي يتم الإشارة إليها من الأنواع المركبة. إنها تجمع مجموعة من إعلانات العناصر بحيث يمكن دمجها كمجموعة في تعريفات الأنواع المركبة.

```cpp
class XmlSchemaGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Name](./get_name/)() | يعيد اسم مجموعة schema. |
| [get_Particle](./get_particle/)() | يعيد أحد الفئات [XmlSchemaChoice](../xmlschemachoice/)، [XmlSchemaAll](../xmlschemaall/)، أو [XmlSchemaSequence](../xmlschemasequence/). |
| [get_QualifiedName](./get_qualifiedname/)() | يعيد الاسم المؤهل لمجموعة schema. |
| [set_Name](./set_name/)(const String\&) | يضبط اسم مجموعة schema. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaGroupBase\>\&) | يضبط أحد الفئات [XmlSchemaChoice](../xmlschemachoice/)، [XmlSchemaAll](../xmlschemaall/)، أو [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaGroup](./xmlschemagroup/)() | يُنشئ مثيلاً جديدًا من الفئة [XmlSchemaGroup](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
