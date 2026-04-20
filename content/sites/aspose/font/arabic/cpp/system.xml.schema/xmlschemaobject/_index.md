---
title: "System::Xml::Schema::XmlSchemaObject فئة"
linktitle: "XmlSchemaObject"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::Schema::XmlSchemaObject فئة. يمثل الفئة الجذرية لتسلسل نموذج كائن مخطط Xml ويعمل كفئة أساسية للفئات مثل فئة XmlSchema في C++."
type: docs
weight: 5000
url: /ar/cpp/system.xml.schema/xmlschemaobject/
---
## XmlSchemaObject class


يمثل الفئة الجذرية لتسلسل نموذج كائن مخطط [Xml](../../system.xml/) ويعمل كفئة أساسية للفئات مثل فئة [XmlSchema](../xmlschema/).

```cpp
class XmlSchemaObject : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_LineNumber](./get_linenumber/)() | يعيد رقم السطر في الملف الذي يشير إليه عنصر **schema**. |
| [get_LinePosition](./get_lineposition/)() | يعيد موضع السطر في الملف الذي يشير إليه عنصر **schema**. |
| [get_Namespaces](./get_namespaces/)() | يعيد XmlSerializerNamespaces لاستخدامها مع كائن المخطط هذا. |
| [get_Parent](./get_parent/)() | يعيد العنصر الأب لهذا [XmlSchemaObject](./). |
| [get_SourceUri](./get_sourceuri/)() | يعيد موقع المصدر للملف الذي قام بتحميل المخطط. |
| [set_LineNumber](./set_linenumber/)(int32_t) | يضبط رقم السطر في الملف الذي يشير إليه عنصر **schema**. |
| [set_LinePosition](./set_lineposition/)(int32_t) | يضبط موضع السطر في الملف الذي يشير إليه عنصر **schema**. |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | يضبط XmlSerializerNamespaces لاستخدامه مع كائن المخطط هذا. |
| [set_Parent](./set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | يضبط العنصر الأب لهذا [XmlSchemaObject](./). |
| [set_SourceUri](./set_sourceuri/)(const String\&) | يضبط موقع المصدر للملف الذي قام بتحميل المخطط. |
| [XmlSchemaObject](./xmlschemaobject/)() | يُنشئ مثلاً جديداً من الفئة [XmlSchemaObject](./). |
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
