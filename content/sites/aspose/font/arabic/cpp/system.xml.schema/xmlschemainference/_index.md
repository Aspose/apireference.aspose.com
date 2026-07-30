---
title: "System::Xml::Schema::XmlSchemaInference فئة"
linktitle: "XmlSchemaInference"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaInference فئة. يستنتج مخطط تعريف لغة XML Schema (XSD) من مستند XML. لا يمكن وراثة فئة XmlSchemaInference في C++."
type: docs
weight: 3700
url: /ar/cpp/system.xml.schema/xmlschemainference/
---
## XmlSchemaInference class


يستنتج مخطط تعريف لغة XML [Schema](../) (XSD) من مستند XML. لا يمكن وراثة الفئة [XmlSchemaInference](./).

```cpp
class XmlSchemaInference : public System::Object
```

## Enums

| تعداد | الوصف |
| --- | --- |
| [InferenceOption](./inferenceoption/) | يؤثر على حدوث ومعلومات النوع المستنتجة بواسطة الفئة [XmlSchemaInference](./) للعناصر والسمات في مستند XML. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Occurrence](./get_occurrence/)() | يرجع القيمة [XmlSchemaInference::InferenceOption](./inferenceoption/) التي تؤثر على إعلانات حدوث المخطط المستنتجة من مستند XML. |
| [get_TypeInference](./get_typeinference/)() | يرجع القيمة [XmlSchemaInference::InferenceOption](./inferenceoption/) التي تؤثر على الأنواع المستنتجة من مستند XML. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&) | يستنتج مخطط تعريف لغة XML [Schema](../) (XSD) من مستند XML الموجود في الكائن [XmlReader](../../system.xml/xmlreader/) المحدد. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) | يستنتج مخطط تعريف لغة XML [Schema](../) (XSD) من مستند XML الموجود في الكائن [XmlReader](../../system.xml/xmlreader/) المحدد، ويُحسّن المخطط المستنتج باستخدام مخطط موجود في الكائن [XmlSchemaSet](../xmlschemaset/) المحدد الذي له نفس مساحة الاسم الهدف. |
| [set_Occurrence](./set_occurrence/)(XmlSchemaInference::InferenceOption) | يضبط القيمة [XmlSchemaInference::InferenceOption](./inferenceoption/) التي تؤثر على إعلانات حدوث المخطط المستنتجة من مستند XML. |
| [set_TypeInference](./set_typeinference/)(XmlSchemaInference::InferenceOption) | يضبط القيمة [XmlSchemaInference::InferenceOption](./inferenceoption/) التي تؤثر على الأنواع المستنتجة من مستند XML. |
| [XmlSchemaInference](./xmlschemainference/)() | ينشئ مثيلاً جديدًا من الفئة [XmlSchemaInference](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
