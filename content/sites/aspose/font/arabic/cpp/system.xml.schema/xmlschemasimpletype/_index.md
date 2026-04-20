---
title: "System::Xml::Schema::XmlSchemaSimpleType فئة"
linktitle: "XmlSchemaSimpleType"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaSimpleType فئة. يمثل عنصر **simpleType** للمحتوى البسيط من مخطط XML كما هو محدد من قبل اتحاد الويب العالمي (W3C). هذه الفئة تعرف نوعًا بسيطًا. يمكن للأنواع البسيطة تحديد المعلومات والقيود لقيمة السمات أو العناصر ذات المحتوى النصي فقط في C++."
type: docs
weight: 6200
url: /ar/cpp/system.xml.schema/xmlschemasimpletype/
---
## XmlSchemaSimpleType class


يمثل عنصر **simpleType** للمحتوى البسيط من XML [Schema](../) كما هو محدد من قبل اتحاد الويب العالمي [Web](../../system.web/) (W3C). هذه الفئة تعرف نوعًا بسيطًا. يمكن للأنواع البسيطة تحديد المعلومات والقيود لقيمة السمات أو العناصر ذات المحتوى النصي فقط.

```cpp
class XmlSchemaSimpleType : public System::Xml::Schema::XmlSchemaType
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Content](./get_content/)() | إرجاع أحد [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/)، [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/)، أو [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/). |
| [set_Content](./set_content/)(const SharedPtr\<XmlSchemaSimpleTypeContent\>\&) | يضبط أحد [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/)، [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/)، أو [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/). |
| [XmlSchemaSimpleType](./xmlschemasimpletype/)() | ينشئ مثيلًا جديدًا للفئة [XmlSchemaSimpleType](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
