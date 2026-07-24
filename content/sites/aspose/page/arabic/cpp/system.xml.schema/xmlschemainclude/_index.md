---
title: "System::Xml::Schema::XmlSchemaInclude فئة"
linktitle: "XmlSchemaInclude"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaInclude فئة. يمثل عنصر include من مخطط XML كما حددته منظمة الويب العالمية (W3C). تُستخدم هذه الفئة لتضمين التصريحات والتعريفات من مخطط خارجي. ثم تصبح التصريحات والتعريفات المضمنة متاحة للمعالجة في المخطط الحاوي في C++."
type: docs
weight: 3600
url: /ar/cpp/system.xml.schema/xmlschemainclude/
---
## XmlSchemaInclude class


يمثل عنصر **include** من XML [Schema](../) كما هو محدد من قبل اتحاد الويب العالمي [Web](../../system.web/) (W3C). تُستخدم هذه الفئة لتضمين التصريحات والتعريفات من مخطط خارجي. تصبح التصريحات والتعريفات المضمنة متاحة بعد ذلك للمعالجة في المخطط الحاوي.

```cpp
class XmlSchemaInclude : public System::Xml::Schema::XmlSchemaExternal
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Annotation](./get_annotation/)() | يعيد قيمة **annotation**. |
| [set_Annotation](./set_annotation/)(const SharedPtr\<XmlSchemaAnnotation\>\&) | يضبط قيمة **annotation**. |
| [XmlSchemaInclude](./xmlschemainclude/)() | ينشئ مثيلاً جديدًا للفئة [XmlSchemaInclude](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
