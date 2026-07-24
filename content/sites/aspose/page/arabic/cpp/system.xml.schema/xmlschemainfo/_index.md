---
title: "الفئة System::Xml::Schema::XmlSchemaInfo"
linktitle: "XmlSchemaInfo"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Xml::Schema::XmlSchemaInfo. تمثّل مجموعة المعلومات بعد التحقق من المخطط لعقدة XML تم التحقق من صحتها في C++."
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
| [get_ContentType](./get_contenttype/)() | يعيد الكائن [XmlSchemaContentType](../xmlschemacontenttype/) الذي يتطابق مع نوع المحتوى لهذه العقدة XML التي تم التحقق من صحتها. |
| [get_IsDefault](./get_isdefault/)() override | يعيد قيمة تشير إلى ما إذا تم تعيين هذه العقدة XML التي تم التحقق من صحتها كنتيجة لتطبيق قيمة افتراضية أثناء التحقق من مخطط XML [Schema](../) تعريف اللغة (XSD). |
| [get_IsNil](./get_isnil/)() override | يعيد قيمة تشير إلى ما إذا كانت قيمة هذه العقدة XML التي تم التحقق من صحتها هي **nil**. |
| [get_MemberType](./get_membertype/)() override | يعيد نوع المخطط الديناميكي لهذه العقدة XML التي تم التحقق من صحتها. |
| [get_SchemaAttribute](./get_schemaattribute/)() override | يعيد الكائن المجمّع [XmlSchemaAttribute](../xmlschemaattribute/) الذي يتطابق مع هذه العقدة XML التي تم التحقق من صحتها. |
| [get_SchemaElement](./get_schemaelement/)() override | يعيد الكائن المجمّع [XmlSchemaElement](../xmlschemaelement/) الذي يتطابق مع هذه العقدة XML التي تم التحقق من صحتها. |
| [get_SchemaType](./get_schematype/)() override | يعيد نوع مخطط XML الثابت [Schema](../) تعريف اللغة (XSD) لهذه العقدة XML التي تم التحقق من صحتها. |
| [get_Validity](./get_validity/)() override | يعيد قيمة [XmlSchemaValidity](../xmlschemavalidity/) لهذه العقدة XML التي تم التحقق من صحتها. |
| [set_ContentType](./set_contenttype/)(XmlSchemaContentType) | يضبط الكائن [XmlSchemaContentType](../xmlschemacontenttype/) الذي يتطابق مع نوع المحتوى لهذه العقدة XML التي تم التحقق من صحتها. |
| [set_IsDefault](./set_isdefault/)(bool) | يضبط قيمة تشير إلى ما إذا تم تعيين هذه العقدة XML التي تم التحقق من صحتها كنتيجة لتطبيق قيمة افتراضية أثناء التحقق من مخطط XML [Schema](../) Definition Language (XSD). |
| [set_IsNil](./set_isnil/)(bool) | يضبط قيمة تشير إلى ما إذا كانت قيمة هذه العقدة XML التي تم التحقق من صحتها هي **nil**. |
| [set_MemberType](./set_membertype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | يضبط نوع المخطط الديناميكي لهذه العقدة XML التي تم التحقق من صحتها. |
| [set_SchemaAttribute](./set_schemaattribute/)(const SharedPtr\<XmlSchemaAttribute\>\&) | يضبط الكائن المترجم [XmlSchemaAttribute](../xmlschemaattribute/) الذي يتطابق مع هذه العقدة XML التي تم التحقق من صحتها. |
| [set_SchemaElement](./set_schemaelement/)(const SharedPtr\<XmlSchemaElement\>\&) | يضبط الكائن المترجم [XmlSchemaElement](../xmlschemaelement/) الذي يتطابق مع هذه العقدة XML التي تم التحقق من صحتها. |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaType\>\&) | يضبط نوع مخطط XML [Schema](../) Definition Language (XSD) الثابت لهذه العقدة XML التي تم التحقق من صحتها. |
| [set_Validity](./set_validity/)(XmlSchemaValidity) | يضبط قيمة [XmlSchemaValidity](../xmlschemavalidity/) لهذه العقدة XML التي تم التحقق من صحتها. |
| [XmlSchemaInfo](./xmlschemainfo/)() | ينشئ مثيلًا جديدًا من الفئة [XmlSchemaInfo](./). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [IXmlSchemaInfo](../ixmlschemainfo/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
