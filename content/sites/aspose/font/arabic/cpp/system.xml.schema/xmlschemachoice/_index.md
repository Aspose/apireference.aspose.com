---
title: "System::Xml::Schema::XmlSchemaChoice فئة"
linktitle: "XmlSchemaChoice"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaChoice فئة. يمثل عنصر choice (المركب) من مخطط XML كما هو محدد من قبل World Wide Web Consortium (W3C). يسمح choice بظهور أحد أطفاله فقط في نسخة في C++."
type: docs
weight: 1400
url: /ar/cpp/system.xml.schema/xmlschemachoice/
---
## XmlSchemaChoice class


يمثل عنصر **choice** (المجمع) من مخطط XML [Schema](../) كما هو محدد من قبل اتحاد الويب العالمي [Web](../../system.web/) (W3C). يسمح **choice** بظهور أحد أطفاله فقط في نسخة.

```cpp
class XmlSchemaChoice : public System::Xml::Schema::XmlSchemaGroupBase
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Items](./get_items/)() override | يعيد مجموعة العناصر المحتواة في المجمع (**choice**): [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](./), [XmlSchemaSequence](../xmlschemasequence/), أو [XmlSchemaAny](../xmlschemaany/). |
| [XmlSchemaChoice](./xmlschemachoice/)() | يقوم بإنشاء نسخة جديدة من الفئة [XmlSchemaChoice](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaGroupBase](../xmlschemagroupbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
