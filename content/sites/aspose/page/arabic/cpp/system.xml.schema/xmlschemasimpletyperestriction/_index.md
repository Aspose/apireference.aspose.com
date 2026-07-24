---
title: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction فئة"
linktitle: "XmlSchemaSimpleTypeRestriction"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction فئة. يمثل عنصر القيد للأنواع البسيطة من XML Schema كما هو محدد من قبل اتحاد الويب العالمي (W3C). يمكن استخدام هذه الفئة لتقييد عنصر simpleType في C++."
type: docs
weight: 6500
url: /ar/cpp/system.xml.schema/xmlschemasimpletyperestriction/
---
## XmlSchemaSimpleTypeRestriction class


يمثل عنصر **restriction** للأنواع البسيطة من XML [Schema](../) كما هو محدد من قبل اتحاد [Web](../../system.web/) العالمي (W3C). يمكن استخدام هذه الفئة لتقييد عنصر **simpleType**.

```cpp
class XmlSchemaSimpleTypeRestriction : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_BaseType](./get_basetype/)() | يرجع معلومات عن النوع الأساسي. |
| [get_BaseTypeName](./get_basetypename/)() | يرجع اسم النوع الأساسي المؤهل. |
| [get_Facets](./get_facets/)() | يعيد خاصية [Xml](../../system.xml/)[Schema](../). |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | يضبط معلومات عن النوع الأساسي. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم النوع الأساسي المؤهل. |
| [XmlSchemaSimpleTypeRestriction](./xmlschemasimpletyperestriction/)() | يُنشئ مثيلاً جديدًا من الفئة [XmlSchemaSimpleTypeRestriction](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
