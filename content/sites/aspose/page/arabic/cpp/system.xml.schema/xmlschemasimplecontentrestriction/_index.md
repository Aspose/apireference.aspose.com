---
title: "الفئة System::Xml::Schema::XmlSchemaSimpleContentRestriction"
linktitle: "XmlSchemaSimpleContentRestriction"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Xml::Schema::XmlSchemaSimpleContentRestriction. تمثل عنصر التقييد للمحتوى البسيط من XML Schema كما حددتها مجموعة الويب العالمية (W3C). يمكن استخدام هذه الفئة لاشتقاق أنواع بسيطة عن طريق التقييد. يمكن استخدام مثل هذه الاشتقاقات لتقييد نطاق القيم للعنصر إلى مجموعة فرعية من القيم المحددة في النوع البسيط الموروث في C++."
type: docs
weight: 6100
url: /ar/cpp/system.xml.schema/xmlschemasimplecontentrestriction/
---
## XmlSchemaSimpleContentRestriction class


يمثل عنصر **restriction** للمحتوى البسيط من XML [Schema](../) كما حددتها مجموعة الويب العالمية [Web](../../system.web/) (W3C). يمكن استخدام هذه الفئة لاشتقاق أنواع بسيطة عن طريق التقييد. يمكن استخدام مثل هذه الاشتقاقات لتقييد نطاق القيم للعنصر إلى مجموعة فرعية من القيم المحددة في النوع البسيط الموروث.

```cpp
class XmlSchemaSimpleContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | يرجع [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) لاستخدامه في قيمة السمة. |
| [get_Attributes](./get_attributes/)() | يرجع مجموعة [XmlSchemaAttribute](../xmlschemaattribute/) و[XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) من السمات للنوع البسيط. |
| [get_BaseType](./get_basetype/)() | يعيد قيمة الأساس للنوع البسيط. |
| [get_BaseTypeName](./get_basetypename/)() | يعيد اسم نوع البيانات المدمج أو النوع البسيط الذي يُشتق منه هذا النوع. |
| [get_Facets](./get_facets/)() | يعيد خاصية [Xml](../../system.xml/)[Schema](../). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | يضبط [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) لاستخدامه في قيمة السمة. |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | يضبط قيمة الأساس للنوع البسيط. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم نوع البيانات المدمج أو النوع البسيط الذي يُشتق منه هذا النوع. |
| [XmlSchemaSimpleContentRestriction](./xmlschemasimplecontentrestriction/)() | ينشئ نسخة جديدة من الفئة [XmlSchemaSimpleContentRestriction](./). |
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
