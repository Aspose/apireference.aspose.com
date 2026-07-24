---
title: "الفئة System::Xml::Schema::XmlSchemaSimpleType"
linktitle: "XmlSchemaSimpleType"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Xml::Schema::XmlSchemaSimpleType. تمثل عنصر **simpleType** للمحتوى البسيط من XML Schema كما هو محدد من قبل اتحاد الويب العالمي (W3C). تُعرّف هذه الفئة نوعًا بسيطًا. يمكن للأنواع البسيطة تحديد المعلومات والقيود لقيمة السمات أو العناصر ذات المحتوى النصي فقط في C++."
type: docs
weight: 6200
url: /ar/cpp/system.xml.schema/xmlschemasimpletype/
---
## XmlSchemaSimpleType class


تمثل عنصر **simpleType** للمحتوى البسيط من XML [Schema](../) كما هو محدد من قبل اتحاد [Web](../../system.web/) العالمي (W3C). تُعرّف هذه الفئة نوعًا بسيطًا. يمكن للأنواع البسيطة تحديد المعلومات والقيود لقيمة السمات أو العناصر ذات المحتوى النصي فقط.

```cpp
class XmlSchemaSimpleType : public System::Xml::Schema::XmlSchemaType
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Content](./get_content/)() | يعيد أحد [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/)، [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/)، أو [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/). |
| [set_Content](./set_content/)(const SharedPtr\<XmlSchemaSimpleTypeContent\>\&) | يضبط أحد [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/)، [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/)، أو [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/). |
| [XmlSchemaSimpleType](./xmlschemasimpletype/)() | ينشئ مثيلاً جديدًا من الفئة [XmlSchemaSimpleType](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
