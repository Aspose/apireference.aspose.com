---
title: "System::Xml::Schema::XmlSchemaSequence فئة"
linktitle: "XmlSchemaSequence"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaSequence فئة. تمثل عنصر sequence (المركب) من مخطط XML كما حددته منظمة الويب العالمية (W3C). يتطلب sequence ظهور العناصر في المجموعة بالترتيب المحدد داخل العنصر الحاوي في C++."
type: docs
weight: 5700
url: /ar/cpp/system.xml.schema/xmlschemasequence/
---
## XmlSchemaSequence class


تمثل عنصر **sequence** (المركب) من مخطط XML [Schema](../) كما حددته منظمة الويب العالمية [Web](../../system.web/) (W3C). يتطلب **sequence** ظهور العناصر في المجموعة بالترتيب المحدد داخل العنصر الحاوي.

```cpp
class XmlSchemaSequence : public System::Xml::Schema::XmlSchemaGroupBase
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Items](./get_items/)() override | العناصر الموجودة داخل المركب. مجموعة من [XmlSchemaElement](../xmlschemaelement/)، [XmlSchemaGroupRef](../xmlschemagroupref/)، [XmlSchemaChoice](../xmlschemachoice/)، [XmlSchemaSequence](./) أو [XmlSchemaAny](../xmlschemaany/). |
| [XmlSchemaSequence](./xmlschemasequence/)() | يُنشئ مثيلاً جديدًا للفئة [XmlSchemaSequence](./). |
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
