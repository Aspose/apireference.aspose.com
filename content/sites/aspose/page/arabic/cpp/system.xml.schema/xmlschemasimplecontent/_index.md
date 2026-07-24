---
title: "System::Xml::Schema::XmlSchemaSimpleContent الفئة"
linktitle: "XmlSchemaSimpleContent"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaSimpleContent الفئة. تمثل العنصر **simpleContent** من مخطط XML كما حددته المؤسسة العالمية للويب (W3C). هذه الفئة مخصصة للأنواع البسيطة والمعقدة ذات نموذج محتوى بسيط في C++."
type: docs
weight: 5900
url: /ar/cpp/system.xml.schema/xmlschemasimplecontent/
---
## XmlSchemaSimpleContent class


يمثل العنصر **simpleContent** من XML [Schema](../) كما حددته المؤسسة العالمية لل[ويب](../../system.web/) (W3C). هذه الفئة مخصصة للأنواع البسيطة والمعقدة ذات نموذج محتوى بسيط.

```cpp
class XmlSchemaSimpleContent : public System::Xml::Schema::XmlSchemaContentModel
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Content](./get_content/)() override | يرجع أحد [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) أو [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/). |
| [set_Content](./set_content/)(SharedPtr\<XmlSchemaContent\>) override | يرجع أحد [XmlSchemaSimpleContentRestriction](../xmlschemasimplecontentrestriction/) أو [XmlSchemaSimpleContentExtension](../xmlschemasimplecontentextension/). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaContentModel](../xmlschemacontentmodel/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
