---
title: "الفئة System::Xml::Schema::XmlSchemaDocumentation"
linktitle: "XmlSchemaDocumentation"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Xml::Schema::XmlSchemaDocumentation. تمثل عنصر **documentation** من مخطط XML كما حددته منظمة الويب العالمية (W3C). تحدد هذه الفئة المعلومات التي يقرأها أو يستخدمها البشر داخل **annotation** في C++."
type: docs
weight: 2500
url: /ar/cpp/system.xml.schema/xmlschemadocumentation/
---
## XmlSchemaDocumentation class


تمثل عنصر **documentation** من XML [Schema](../) كما حددته منظمة الويب العالمية [Web](../../system.web/). تحدد هذه الفئة المعلومات التي يقرأها أو يستخدمها البشر داخل **annotation**.

```cpp
class XmlSchemaDocumentation : public System::Xml::Schema::XmlSchemaObject
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Language](./get_language/)() | يعيد السمة **xml:lang**. تُستخدم هذه كدلالة على اللغة المستخدمة في المحتوى. |
| [get_Markup](./get_markup/)() | يعيد مصفوفة من كائنات [XmlNode](../../system.xml/xmlnode/) التي تمثل عقد الوثائق الفرعية. |
| [get_Source](./get_source/)() | يعيد مصدر معرف الموارد الموحد (URI) للمعلومات. |
| [set_Language](./set_language/)(const String\&) | يضبط السمة **xml:lang**. تُستخدم هذه كدلالة على اللغة المستخدمة في المحتوى. |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | يضبط مصفوفة من كائنات [XmlNode](../../system.xml/xmlnode/) التي تمثل عقد الوثائق الفرعية. |
| [set_Source](./set_source/)(const String\&) | يضبط مصدر معرف الموارد الموحد (URI) للمعلومات. |
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
