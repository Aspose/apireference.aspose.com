---
title: "System::Xml::Schema::XmlSchemaSimpleContentRestriction فئة"
linktitle: "XmlSchemaSimpleContentRestriction"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaSimpleContentRestriction فئة. تمثل عنصر القيد للمحتوى البسيط من مخطط XML كما حددته World Wide Web Consortium (W3C). يمكن استخدام هذه الفئة لاشتقاق أنواع بسيطة عن طريق القيد. يمكن استخدام مثل هذه الاشتقاقات لتقييد نطاق القيم للعنصر إلى مجموعة فرعية من القيم المحددة في النوع البسيط الموروث في C++."
type: docs
weight: 6100
url: /ar/cpp/system.xml.schema/xmlschemasimplecontentrestriction/
---
## XmlSchemaSimpleContentRestriction class


يمثل عنصر **restriction** للمحتوى البسيط من XML [Schema](../) كما حددته World Wide [Web](../../system.web/) Consortium (W3C). يمكن استخدام هذه الفئة لاشتقاق أنواع بسيطة عن طريق القيد. يمكن استخدام مثل هذه الاشتقاقات لتقييد نطاق القيم للعنصر إلى مجموعة فرعية من القيم المحددة في النوع البسيط الموروث.

```cpp
class XmlSchemaSimpleContentRestriction : public System::Xml::Schema::XmlSchemaContent
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | يرجع [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) لاستخدامه في قيمة السمة. |
| [get_Attributes](./get_attributes/)() | يرجع مجموعة [XmlSchemaAttribute](../xmlschemaattribute/) و[XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/) من السمات للنوع البسيط. |
| [get_BaseType](./get_basetype/)() | يرجع قيمة الأساس للنوع البسيط. |
| [get_BaseTypeName](./get_basetypename/)() | يرجع اسم نوع البيانات المدمج أو النوع البسيط الذي تم اشتقاق هذا النوع منه. |
| [get_Facets](./get_facets/)() | يرجع خاصية [Xml](../../system.xml/)[Schema](../). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | يضبط [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) لاستخدامه في قيمة السمة. |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | يضبط قيمة الأساس للنوع البسيط. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم نوع البيانات المدمج أو النوع البسيط الذي تم اشتقاق هذا النوع منه. |
| [XmlSchemaSimpleContentRestriction](./xmlschemasimplecontentrestriction/)() | ينشئ مثيلاً جديداً من فئة [XmlSchemaSimpleContentRestriction](./). |
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
