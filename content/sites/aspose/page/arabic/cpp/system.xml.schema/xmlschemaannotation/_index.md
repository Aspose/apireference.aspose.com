---
title: "الفئة System::Xml::Schema::XmlSchemaAnnotation"
linktitle: "XmlSchemaAnnotation"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Xml::Schema::XmlSchemaAnnotation. تمثل عنصر **annotation** الخاص بـ World Wide Web Consortium (W3C) في C++."
type: docs
weight: 700
url: /ar/cpp/system.xml.schema/xmlschemaannotation/
---
## XmlSchemaAnnotation class


يمثل عنصر **annotation** الخاص بـ World Wide [Web](../../system.web/) Consortium (W3C).

```cpp
class XmlSchemaAnnotation : public System::Xml::Schema::XmlSchemaObject
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Id](./get_id/)() | يعيد معرف السلسلة. |
| [get_Items](./get_items/)() | يعيد مجموعة **Items** المستخدمة لتخزين العناصر الفرعية **appinfo** و **documentation**. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | يعيد السمات المؤهلة التي لا تنتمي إلى مساحة الاسم المستهدفة للمخطط. |
| [set_Id](./set_id/)(const String\&) | يضبط معرف السلسلة. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | يضبط السمات المؤهلة التي لا تنتمي إلى مساحة الاسم المستهدفة للمخطط. |
| [XmlSchemaAnnotation](./xmlschemaannotation/)() | ينشئ مثيلاً جديداً من الفئة [XmlSchemaAnnotation](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
