---
title: "System::Xml::Schema::XmlSchemaAppInfo فئة"
linktitle: "XmlSchemaAppInfo"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaAppInfo فئة. تمثل عنصر appinfo الخاص بـ World Wide Web Consortium (W3C) في C++."
type: docs
weight: 1000
url: /ar/cpp/system.xml.schema/xmlschemaappinfo/
---
## XmlSchemaAppInfo class


يمثل عنصر **appinfo** الخاص بـ World Wide [Web](../../system.web/) Consortium (W3C).

```cpp
class XmlSchemaAppInfo : public System::Xml::Schema::XmlSchemaObject
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Markup](./get_markup/)() | يعيد مصفوفة من كائنات [XmlNode](../../system.xml/xmlnode/) التي تمثل العقد الفرعية **appinfo**. |
| [get_Source](./get_source/)() | يعيد مصدر معلومات التطبيق. |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | يضبط مصفوفة من كائنات [XmlNode](../../system.xml/xmlnode/) التي تمثل العقد الفرعية **appinfo**. |
| [set_Source](./set_source/)(const String\&) | يضبط مصدر معلومات التطبيق. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
