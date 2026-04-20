---
title: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction class"
linktitle: "XmlSchemaSimpleTypeRestriction"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction class. يمثل عنصر **restriction** للأنواع البسيطة من XML Schema كما هو محدد من قبل World Wide Web Consortium (W3C). يمكن استخدام هذه الفئة لتقييد عنصر simpleType في C++."
type: docs
weight: 6500
url: /ar/cpp/system.xml.schema/xmlschemasimpletyperestriction/
---
## XmlSchemaSimpleTypeRestriction class


يمثل عنصر **restriction** للأنواع البسيطة من XML [Schema](../) كما هو محدد من قبل World Wide [Web](../../system.web/) Consortium (W3C). يمكن استخدام هذه الفئة لتقييد عنصر **simpleType**.

```cpp
class XmlSchemaSimpleTypeRestriction : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_BaseType](./get_basetype/)() | يعيد معلومات حول النوع الأساسي. |
| [get_BaseTypeName](./get_basetypename/)() | يعيد اسم النوع الأساسي المؤهل. |
| [get_Facets](./get_facets/)() | يرجع خاصية [Xml](../../system.xml/)[Schema](../). |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | يضبط معلومات حول النوع الأساسي. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | يضبط اسم النوع الأساسي المؤهل. |
| [XmlSchemaSimpleTypeRestriction](./xmlschemasimpletyperestriction/)() | ينشئ مثيلاً جديداً من الفئة [XmlSchemaSimpleTypeRestriction](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
