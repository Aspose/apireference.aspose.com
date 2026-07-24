---
title: "فئة System::Xml::Schema::XmlSchemaInference"
linktitle: "XmlSchemaInference"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Xml::Schema::XmlSchemaInference. تستنتج مخطط تعريف لغة XML Schema (XSD) من مستند XML. لا يمكن وراثة فئة XmlSchemaInference في C++."
type: docs
weight: 3700
url: /ar/cpp/system.xml.schema/xmlschemainference/
---
## XmlSchemaInference class


يستنتج مخطط تعريف لغة XML [Schema](../) (XSD) من مستند XML. لا يمكن وراثة فئة [XmlSchemaInference](./).

```cpp
class XmlSchemaInference : public System::Object
```

## Enums

| تعداد | الوصف |
| --- | --- |
| [InferenceOption](./inferenceoption/) | يؤثر على معلومات التكرار والنوع المستنتجة بواسطة فئة [XmlSchemaInference](./) للعناصر والسمات في مستند XML. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Occurrence](./get_occurrence/)() | يعيد قيمة [XmlSchemaInference::InferenceOption](./inferenceoption/) التي تؤثر على إعلانات تكرار المخطط المستنتجة من مستند XML. |
| [get_TypeInference](./get_typeinference/)() | يعيد قيمة [XmlSchemaInference::InferenceOption](./inferenceoption/) التي تؤثر على الأنواع المستنتجة من مستند XML. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&) | يستنتج مخطط تعريف لغة XML [Schema](../) (XSD) من مستند XML الموجود في كائن [XmlReader](../../system.xml/xmlreader/) المحدد. |
| [InferSchema](./inferschema/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlSchemaSet\>) | يستنتج مخطط تعريف لغة XML [Schema](../) (XSD) من مستند XML الموجود في كائن [XmlReader](../../system.xml/xmlreader/) المحدد، ويُحسّن المخطط المستنتج باستخدام مخطط موجود في كائن [XmlSchemaSet](../xmlschemaset/) المحدد مع نفس مساحة الاسم الهدف. |
| [set_Occurrence](./set_occurrence/)(XmlSchemaInference::InferenceOption) | يضبط قيمة [XmlSchemaInference::InferenceOption](./inferenceoption/) التي تؤثر على إعلانات تكرار المخطط المستنتجة من مستند XML. |
| [set_TypeInference](./set_typeinference/)(XmlSchemaInference::InferenceOption) | يضبط قيمة [XmlSchemaInference::InferenceOption](./inferenceoption/) التي تؤثر على الأنواع المستنتجة من مستند XML. |
| [XmlSchemaInference](./xmlschemainference/)() | ينشئ مثيلاً جديدًا من الفئة [XmlSchemaInference](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
