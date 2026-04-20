---
title: "System::Xml::Schema::XmlSchemaNotation فئة"
linktitle: "XmlSchemaNotation"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaNotation فئة. يمثل عنصر notation من مخطط XML كما هو محدد من قبل اتحاد الويب العالمي (W3C). إعلان notation في XML هو إعادة بناء لإعلانات NOTATION في XML 1.0. هدف الـ notations هو وصف تنسيق البيانات غير XML داخل مستند XML في C++."
type: docs
weight: 4800
url: /ar/cpp/system.xml.schema/xmlschemanotation/
---
## XmlSchemaNotation class


يمثل عنصر **notation** من XML [Schema](../) كما هو محدد من قبل اتحاد الويب العالمي [Web](../../system.web/) (W3C). إعلان **notation** في XML [Schema](../) هو إعادة بناء لإعلانات **XML** 1.0 NOTATION. هدف الـ notations هو وصف تنسيق البيانات غير XML داخل مستند XML.

```cpp
class XmlSchemaNotation : public System::Xml::Schema::XmlSchemaAnnotated
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Name](./get_name/)() | يعيد اسم الـ notation. |
| [get_Public](./get_public/)() | يعيد المعرف **public**. |
| [get_System](./get_system/)() | يعيد المعرف **system**. |
| [set_Name](./set_name/)(const String\&) | يضبط اسم الترميز. |
| [set_Public](./set_public/)(const String\&) | يضبط المعرف **public**. |
| [set_System](./set_system/)(const String\&) | يضبط المعرف **system**. |
| [XmlSchemaNotation](./xmlschemanotation/)() | ينشئ مثيلاً جديداً من الفئة [XmlSchemaNotation](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
