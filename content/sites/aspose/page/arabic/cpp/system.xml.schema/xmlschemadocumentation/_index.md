---
title: "System::Xml::Schema::XmlSchemaDocumentation فئة"
linktitle: "XmlSchemaDocumentation"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchemaDocumentation فئة. تمثل عنصر الوثائق من مخطط XML كما هو محدد من قبل اتحاد الويب العالمي (W3C). تحدد هذه الفئة المعلومات التي يجب قراءتها أو استخدامها من قبل البشر داخل توضيح في C++."
type: docs
weight: 2500
url: /ar/cpp/system.xml.schema/xmlschemadocumentation/
---
## XmlSchemaDocumentation class


يمثل عنصر **documentation** من XML [Schema](../) كما هو محدد من قبل اتحاد الويب العالمي [Web](../../system.web/) (W3C). تحدد هذه الفئة المعلومات التي يجب قراءتها أو استخدامها من قبل البشر داخل **annotation**.

```cpp
class XmlSchemaDocumentation : public System::Xml::Schema::XmlSchemaObject
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Language](./get_language/)() | يعيد السمة **xml:lang**. هذا يعمل كمؤشر على اللغة المستخدمة في المحتوى. |
| [get_Markup](./get_markup/)() | يعيد مصفوفة من كائنات [XmlNode](../../system.xml/xmlnode/) التي تمثل العقد الفرعية للوثائق. |
| [get_Source](./get_source/)() | يعيد مصدر معرف الموارد الموحد (URI) للمعلومات. |
| [set_Language](./set_language/)(const String\&) | يضبط السمة **xml:lang**. هذا يعمل كمؤشر على اللغة المستخدمة في المحتوى. |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | يضبط مصفوفة من كائنات [XmlNode](../../system.xml/xmlnode/) التي تمثل العقد الفرعية للوثائق. |
| [set_Source](./set_source/)(const String\&) | يضبط مصدر معرف الموارد الموحد (URI) للمعلومات. |
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
