---
title: "System::Xml::Schema::XmlSchemaSimpleContent class"
linktitle: "XmlSchemaSimpleContent"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaSimpleContent فئة. يمثل عنصر simpleContent من XML Schema كما هو محدد من قبل منظمة الويب العالمية (W3C). هذه الفئة مخصصة للأنواع البسيطة والمعقدة ذات نموذج محتوى بسيط في C++."
type: docs
weight: 5900
url: /ar/cpp/system.xml.schema/xmlschemasimplecontent/
---
## XmlSchemaSimpleContent class


يمثل عنصر **simpleContent** من XML [Schema](../) كما هو محدد من قبل منظمة الويب العالمية [Web](../../system.web/) (W3C). هذه الفئة مخصصة للأنواع البسيطة والمعقدة ذات نموذج محتوى بسيط.

```cpp
class XmlSchemaSimpleContent : public System::Xml::Schema::XmlSchemaContentModel
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Content](./get_content/)() override | يعيد أحد [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) أو [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/). |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | يعيد أحد [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) أو [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaContentModel](../xmlschemacontentmodel/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
