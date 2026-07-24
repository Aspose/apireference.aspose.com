---
title: "الفئة System::Xml::Schema::XmlSchemaSimpleContentExtension"
linktitle: "XmlSchemaSimpleContentExtension"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Xml::Schema::XmlSchemaSimpleContentExtension. تمثّل عنصر **extension** للمحتوى البسيط من مخطط XML كما حددت منظمة الويب العالمية (W3C). يمكن استخدام هذه الفئة لاشتقاق الأنواع البسيطة عن طريق الامتداد. تُستخدم مثل هذه الاشتقاقات لتمديد محتوى النوع البسيط للعنصر بإضافة سمات في C++."
type: docs
weight: 6000
url: /ar/cpp/system.xml.schema/xmlschemasimplecontentextension/
---
## XmlSchemaSimpleContentExtension class


يمثّل عنصر **extension** للمحتوى البسيط من XML [Schema](../) كما حددت منظمة الويب العالمية [Web](../../system.web/) (W3C). يمكن استخدام هذه الفئة لاشتقاق الأنواع البسيطة عن طريق الامتداد. تُستخدم مثل هذه الاشتقاقات لتمديد محتوى النوع البسيط للعنصر بإضافة سمات.

```cpp
class XmlSchemaSimpleContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | يعيد [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) الذي سيُستخدم لقيمة السمة. |
| [get_Attributes](./get_attributes/)() | يعيد مجموعة [XmlSchemaAttribute](../xmlschemaattribute/) و[XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | يعيد اسم نوع البيانات المدمج أو النوع البسيط الذي يُمدّ منه هذا النوع. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | يضبط [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) الذي سيُستخدم لقيمة السمة. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم نوع البيانات المدمج أو النوع البسيط الذي يُمدّ منه هذا النوع. |
| [XmlSchemaSimpleContentExtension](./xmlschemasimplecontentextension/)() | ينشئ مثيلًا جديدًا للفئة [XmlSchemaSimpleContentExtension](./). |
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
