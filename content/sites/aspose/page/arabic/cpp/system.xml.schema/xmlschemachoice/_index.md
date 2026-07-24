---
title: "System::Xml::Schema::XmlSchemaChoice class"
linktitle: "XmlSchemaChoice"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaChoice class. يمثل عنصر choice (المركب) من مخطط XML كما هو محدد من قبل اتحاد الويب العالمي (W3C). يسمح choice بظهور أحد أبنائه فقط في نسخة في C++."
type: docs
weight: 1400
url: /ar/cpp/system.xml.schema/xmlschemachoice/
---
## XmlSchemaChoice class


يمثل عنصر **choice** (المركب) من XML [Schema](../) كما هو محدد من قبل اتحاد الويب العالمي [Web](../../system.web/) (W3C). يسمح **choice** بظهور أحد أبنائه فقط في نسخة.

```cpp
class XmlSchemaChoice : public System::Xml::Schema::XmlSchemaGroupBase
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Items](./get_items/)() override | يعيد مجموعة العناصر المحتواة مع المركب (**choice**): [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](./), [XmlSchemaSequence](../xmlschemasequence/), أو [XmlSchemaAny](../xmlschemaany/). |
| [XmlSchemaChoice](./xmlschemachoice/)() | ينشئ مثيلاً جديداً من الفئة [XmlSchemaChoice](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaGroupBase](../xmlschemagroupbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
