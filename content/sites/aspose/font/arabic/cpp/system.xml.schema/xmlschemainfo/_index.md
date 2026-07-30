---
title: "فئة System::Xml::Schema::XmlSchemaInfo"
linktitle: "XmlSchemaInfo"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::Schema::XmlSchemaInfo. تمثل مجموعة المعلومات بعد التحقق من المخطط لعقدة XML تم التحقق منها في C++."
type: docs
weight: 3800
url: /ar/cpp/system.xml.schema/xmlschemainfo/
---
## XmlSchemaInfo class


يمثل مجموعة المعلومات بعد التحقق من صحة المخطط لعقدة XML تم التحقق منها.

```cpp
class XmlSchemaInfo : public System::Xml::Schema::IXmlSchemaInfo
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_ContentType](./get_contenttype/)() | يعيد الكائن [XmlSchemaContentType](../xmlschemacontenttype/) الذي يتطابق مع نوع المحتوى لعقدة XML التي تم التحقق منها. |
| [get_IsDefault](./get_isdefault/)() override | يعيد قيمة تشير إلى ما إذا تم تعيين عقدة XML التي تم التحقق منها نتيجة لتطبيق قيمة افتراضية أثناء التحقق من مخطط XML [Schema](../) Definition Language (XSD). |
| [get_IsNil](./get_isnil/)() override | يعيد قيمة تشير إلى ما إذا كانت قيمة عقدة XML التي تم التحقق منها هي **nil**. |
| [get_MemberType](./get_membertype/)() override | يعيد نوع المخطط الديناميكي لهذه العقدة XML التي تم التحقق منها. |
| [get_SchemaAttribute](./get_schemaattribute/)() override | يعيد الكائن المترجم [XmlSchemaAttribute](../xmlschemaattribute/) الذي يتطابق مع هذه العقدة XML التي تم التحقق منها. |
| [get_SchemaElement](./get_schemaelement/)() override | يعيد الكائن المترجم [XmlSchemaElement](../xmlschemaelement/) الذي يتطابق مع هذه العقدة XML التي تم التحقق منها. |
| [get_SchemaType](./get_schematype/)() override | يعيد نوع مخطط XML الثابت [Schema](../) Definition Language (XSD) لهذه العقدة XML التي تم التحقق منها. |
| [get_Validity](./get_validity/)() override | يعيد قيمة [XmlSchemaValidity](../xmlschemavalidity/) لهذه العقدة XML التي تم التحقق منها. |
| [set_ContentType](./set_contenttype/)(XmlSchemaContentType) | يضبط الكائن [XmlSchemaContentType](../xmlschemacontenttype/) الذي يتطابق مع نوع المحتوى لهذه العقدة XML التي تم التحقق منها. |
| [set_IsDefault](./set_isdefault/)(bool) | يضبط قيمة تشير إلى ما إذا تم تعيين عقدة XML التي تم التحقق منها نتيجة لتطبيق قيمة افتراضية أثناء التحقق من مخطط XML [Schema](../) Definition Language (XSD). |
| [set_IsNil](./set_isnil/)(bool) | يضبط قيمة تشير إلى ما إذا كانت قيمة عقدة XML التي تم التحقق منها هي **nil**. |
| [set_MemberType](./set_membertype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | يضبط نوع المخطط الديناميكي لهذه العقدة XML التي تم التحقق منها. |
| [set_SchemaAttribute](./set_schemaattribute/)(const SharedPtr\<XmlSchemaAttribute\>\&) | يضبط الكائن المترجم [XmlSchemaAttribute](../xmlschemaattribute/) الذي يتطابق مع هذه العقدة XML التي تم التحقق منها. |
| [set_SchemaElement](./set_schemaelement/)(const SharedPtr\<XmlSchemaElement\>\&) | يضبط الكائن المترجم [XmlSchemaElement](../xmlschemaelement/) الذي يتطابق مع هذه العقدة XML التي تم التحقق منها. |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | يضبط نوع مخطط XML الثابت [Schema](../) Definition Language (XSD) لهذه العقدة XML التي تم التحقق منها. |
| [set_Validity](./set_validity/)(XmlSchemaValidity) | يضبط قيمة [XmlSchemaValidity](../xmlschemavalidity/) لهذه العقدة XML التي تم التحقق منها. |
| [XmlSchemaInfo](./xmlschemainfo/)() | ينشئ مثيلاً جديدًا من الفئة [XmlSchemaInfo](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [IXmlSchemaInfo](../ixmlschemainfo/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
