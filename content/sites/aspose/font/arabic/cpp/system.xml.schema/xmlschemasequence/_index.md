---
title: "System::Xml::Schema::XmlSchemaSequence class"
linktitle: "XmlSchemaSequence"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaSequence class. يمثل عنصر التسلسل (المركب) من مخطط XML كما هو محدد من قبل اتحاد الويب العالمي (W3C). يتطلب التسلسل ظهور العناصر في المجموعة بالترتيب المحدد داخل العنصر الحاوي في C++."
type: docs
weight: 5700
url: /ar/cpp/system.xml.schema/xmlschemasequence/
---
## XmlSchemaSequence class


يمثل عنصر **sequence** (المركب) من مخطط XML [Schema](../) كما هو محدد من قبل اتحاد الويب العالمي [Web](../../system.web/) (W3C). يتطلب **sequence** ظهور العناصر في المجموعة بالترتيب المحدد داخل العنصر الحاوي.

```cpp
class XmlSchemaSequence : public System::Xml::Schema::XmlSchemaGroupBase
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Items](./get_items/)() override | العناصر الموجودة داخل المركب. مجموعة من [XmlSchemaElement](../xmlschemaelement/)، [XmlSchemaGroupRef](../xmlschemagroupref/)، [XmlSchemaChoice](../xmlschemachoice/)، [XmlSchemaSequence](./)، أو [XmlSchemaAny](../xmlschemaany/). |
| [XmlSchemaSequence](./xmlschemasequence/)() | يُنشئ مثيلاً جديدًا للفئة [XmlSchemaSequence](./). |
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
