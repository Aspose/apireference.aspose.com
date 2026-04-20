---
title: "System::Xml::Schema::XmlSchemaInclude class"
linktitle: "XmlSchemaInclude"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaInclude class. يمثل عنصر include من XML Schema كما هو محدد من قبل اتحاد الويب العالمي (W3C). تُستخدم هذه الفئة لتضمين التصريحات والتعريفات من مخطط خارجي. تصبح التصريحات والتعريفات المضمنة متاحة للمعالجة في المخطط الحاوي في C++."
type: docs
weight: 3600
url: /ar/cpp/system.xml.schema/xmlschemainclude/
---
## XmlSchemaInclude class


يمثل عنصر **include** من XML [Schema](../) كما هو محدد من قبل اتحاد الويب العالمي (W3C). تُستخدم هذه الفئة لتضمين التصريحات والتعريفات من مخطط خارجي. تصبح التصريحات والتعريفات المضمنة متاحة للمعالجة في المخطط الحاوي.

```cpp
class XmlSchemaInclude : public System::Xml::Schema::XmlSchemaExternal
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Annotation](./get_annotation/)() | يرجع قيمة **annotation**. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | يضبط قيمة **annotation**. |
| [XmlSchemaInclude](./xmlschemainclude/)() | يُهيئ مثيلاً جديداً من الفئة [XmlSchemaInclude](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
