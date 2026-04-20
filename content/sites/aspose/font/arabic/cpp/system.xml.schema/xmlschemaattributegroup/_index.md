---
title: "فئة System::Xml::Schema::XmlSchemaAttributeGroup"
linktitle: "XmlSchemaAttributeGroup"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::Schema::XmlSchemaAttributeGroup. تمثّل عنصر **attributeGroup** من مخطط XML كما هو محدد من قبل اتحاد الويب العالمي (W3C). توفر AttributesGroups آلية لتجميع مجموعة من إعلانات السمات بحيث يمكن دمجها كمجموعة في تعريفات الأنواع المركبة في C++."
type: docs
weight: 1200
url: /ar/cpp/system.xml.schema/xmlschemaattributegroup/
---
## XmlSchemaAttributeGroup class


يمثّل عنصر **attributeGroup** من مخطط XML [Schema](../) كما هو محدد من قبل اتحاد الويب العالمي [Web](../../system.web/) (W3C). توفر AttributesGroups آلية لتجميع مجموعة من إعلانات السمات بحيث يمكن دمجها كمجموعة في تعريفات الأنواع المركبة.

```cpp
class XmlSchemaAttributeGroup : public System::Xml::Schema::XmlSchemaAnnotated
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | يعيد المكوّن [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) لمجموعة السمات. |
| [get_Attributes](./get_attributes/)() | يعيد مجموعة السمات لمجموعة السمات. تحتوي على عناصر [XmlSchemaAttribute](../xmlschemaattribute/) و [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_Name](./get_name/)() | يعيد اسم مجموعة السمات. |
| [get_QualifiedName](./get_qualifiedname/)() | يعيد الاسم المؤهل لمجموعة السمات. |
| [get_RedefinedAttributeGroup](./get_redefinedattributegroup/)() | يعيد خاصية مجموعة السمات المعاد تعريفها من مخطط XML [Schema](../). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | يضبط المكوّن [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) لمجموعة السمات. |
| [set_Name](./set_name/)(const String\&) | يضبط اسم مجموعة السمات. |
| [XmlSchemaAttributeGroup](./xmlschemaattributegroup/)() | ينشئ مثيلاً جديداً من الفئة [XmlSchemaAttributeGroup](./). |
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
