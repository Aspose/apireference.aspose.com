---
title: "System::Xml::Schema::XmlSchemaSimpleContentExtension فئة"
linktitle: "XmlSchemaSimpleContentExtension"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaSimpleContentExtension فئة. تمثل عنصر **extension** للمحتوى البسيط من مخطط XML كما هو محدد من قبل اتحاد الويب العالمي (W3C). يمكن استخدام هذه الفئة لاشتقاق أنواع بسيطة عن طريق الامتداد. تُستخدم مثل هذه الاشتقاقات لتوسيع محتوى النوع البسيط للعنصر بإضافة سمات في C++."
type: docs
weight: 6000
url: /ar/cpp/system.xml.schema/xmlschemasimplecontentextension/
---
## XmlSchemaSimpleContentExtension class


يمثل عنصر **extension** للمحتوى البسيط من XML [Schema](../) كما هو محدد من قبل اتحاد الويب العالمي [Web](../../system.web/) (W3C). يمكن استخدام هذه الفئة لاشتقاق أنواع بسيطة عن طريق الامتداد. تُستخدم مثل هذه الاشتقاقات لتوسيع محتوى النوع البسيط للعنصر بإضافة سمات.

```cpp
class XmlSchemaSimpleContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | يعيد [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) الذي سيُستخدم لقيمة السمة. |
| [get_Attributes](./get_attributes/)() | يعيد مجموعة من [XmlSchemaAttribute](../xmlschemaattribute/) و [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | يعيد اسم نوع بيانات مدمج أو نوع بسيط يتم توسيعه من هذا النوع. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | يضبط [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) الذي سيُستخدم لقيمة السمة. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم نوع بيانات مدمج أو نوع بسيط يتم توسيع هذا النوع منه. |
| [XmlSchemaSimpleContentExtension](./xmlschemasimplecontentextension/)() | يُنشئ مثيلًا جديدًا من الفئة [XmlSchemaSimpleContentExtension](./) class. |
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
