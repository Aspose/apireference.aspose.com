---
title: "System::Xml::Schema::XmlSchema فئة"
linktitle: "XmlSchema"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::Schema::XmlSchema فئة. تمثيل في الذاكرة لمخطط XML، كما هو محدد في اتحاد الويب العالمي (W3C) وفي C++."
type: docs
weight: 400
url: /ar/cpp/system.xml.schema/xmlschema/
---
## XmlSchema class


تمثيل في الذاكرة لمخطط XML [المخطط](../)، كما هو محدد في اتحاد الويب العالمي [الويب](../../system.web/) (W3C) [XML Schema Part 1: Structures](https://www.w3.org/TR/xmlschema-1/) و[XML Schema Part 2: Datatypes](https://www.w3.org/TR/xmlschema-2/).

```cpp
class XmlSchema : public System::Xml::Schema::XmlSchemaObject
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Compile](./compile/)(ValidationEventHandler) | يقوم بتجميع نموذج XML [المخطط](../)[الكائن](../../system/object/) (SOM) إلى معلومات المخطط للتحقق. يُستخدم للتحقق من البنية النحوية والدلالية لـ SOM المُنشأة برمجيًا. يتم إجراء فحص التحقق الدلالي أثناء التجميع. |
| [Compile](./compile/)(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) | يقوم بتجميع نموذج XML [المخطط](../)[الكائن](../../system/object/) (SOM) إلى معلومات المخطط للتحقق. يُستخدم للتحقق من البنية النحوية والدلالية لـ SOM المُنشأة برمجيًا. يتم إجراء فحص التحقق الدلالي أثناء التجميع. |
| [get_AttributeFormDefault](./get_attributeformdefault/)() | يعيد الشكل للسمات المعلنة في مساحة الاسم الهدف للمخطط. |
| [get_AttributeGroups](./get_attributegroups/)() | يعيد قيمة ما بعد تجميع المخطط لجميع مجموعات السمات العامة في المخطط. |
| [get_Attributes](./get_attributes/)() | يعيد قيمة ما بعد تجميع المخطط لجميع السمات في المخطط. |
| [get_BlockDefault](./get_blockdefault/)() | يعيد السمة **blockDefault** التي تحدد القيمة الافتراضية للسمة **block** على العناصر والأنواع المركبة في **targetNamespace** للمخطط. |
| [get_ElementFormDefault](./get_elementformdefault/)() | يعيد الشكل للعناصر المعلنة في مساحة الاسم الهدف للمخطط. |
| [get_Elements](./get_elements/)() | يعيد قيمة ما بعد تجميع المخطط لجميع العناصر في المخطط. |
| [get_FinalDefault](./get_finaldefault/)() | يعيد السمة **finalDefault** التي تحدد القيمة الافتراضية للسمة **final** على العناصر والأنواع المركبة في مساحة الاسم الهدف للمخطط. |
| [get_Groups](./get_groups/)() | يعيد قيمة ما بعد تجميع المخطط لجميع المجموعات في المخطط. |
| [get_Id](./get_id/)() | يعيد معرف السلسلة. |
| [get_Includes](./get_includes/)() | يعيد مجموعة المخططات المتضمنة والمستوردة. |
| [get_IsCompiled](./get_iscompiled/)() | يشير إلى ما إذا تم تجميع المخطط. |
| [get_Items](./get_items/)() | يعيد مجموعة عناصر المخطط في المخطط ويُستخدم لإضافة أنواع عناصر جديدة على مستوى عنصر **schema**. |
| [get_LineNumber](../xmlschemaobject/get_linenumber/)() | يعيد رقم السطر في الملف الذي يشير إليه عنصر **schema**. |
| [get_LinePosition](../xmlschemaobject/get_lineposition/)() | يعيد موضع السطر في الملف الذي يشير إليه عنصر **schema**. |
| [get_Namespaces](../xmlschemaobject/get_namespaces/)() | يعيد XmlSerializerNamespaces لاستخدامها مع كائن المخطط هذا. |
| [get_Notations](./get_notations/)() | يعيد قيمة ما بعد تجميع المخطط لجميع العلامات في المخطط. |
| [get_Parent](../xmlschemaobject/get_parent/)() | يعيد الأصل لهذا [XmlSchemaObject](../xmlschemaobject/). |
| [get_SchemaTypes](./get_schematypes/)() | يعيد قيمة ما بعد تجميع المخطط لجميع أنواع المخطط في المخطط. |
| [get_SourceUri](../xmlschemaobject/get_sourceuri/)() | يعيد موقع المصدر للملف الذي حمّل المخطط. |
| [get_TargetNamespace](./get_targetnamespace/)() | يعيد معرف الموارد الموحد (URI) لمساحة اسم الهدف للمخطط. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | يعيد السمات المؤهلة التي لا تنتمي إلى مساحة اسم الهدف للمخطط. |
| [get_Version](./get_version/)() | يعيد إصدار المخطط. |
| static [Read](./read/)(const SharedPtr\<IO::TextReader\>\&, ValidationEventHandler) | يقرأ XML [Schema](../) من [IO::TextReader](../../system.io/textreader/) المزوَّد. |
| static [Read](./read/)(const SharedPtr\<IO::Stream\>\&, ValidationEventHandler) | يقرأ XML [Schema](../) من الدفق المزوَّد. |
| static [Read](./read/)(const SharedPtr\<XmlReader\>\&, ValidationEventHandler) | يقرأ XML [Schema](../) من [XmlReader](../../system.xml/xmlreader/) المزوَّد. |
| [set_AttributeFormDefault](./set_attributeformdefault/)(XmlSchemaForm) | يضبط النموذج للسمات المعلنة في مساحة اسم الهدف للمخطط. |
| [set_BlockDefault](./set_blockdefault/)(XmlSchemaDerivationMethod) | يضبط السمة **blockDefault** التي تحدد القيمة الافتراضية للسمة **block** على العناصر والأنواع المركبة في **targetNamespace** للمخطط. |
| [set_ElementFormDefault](./set_elementformdefault/)(XmlSchemaForm) | يضبط النموذج للعناصر المعلنة في مساحة اسم الهدف للمخطط. |
| [set_FinalDefault](./set_finaldefault/)(XmlSchemaDerivationMethod) | يضبط السمة **finalDefault** التي تحدد القيمة الافتراضية للسمة **final** على العناصر والأنواع المركبة في مساحة اسم الهدف للمخطط. |
| [set_Id](./set_id/)(const String\&) | يضبط معرف السلسلة. |
| [set_LineNumber](../xmlschemaobject/set_linenumber/)(int32_t) | يضبط رقم السطر في الملف الذي يشير إليه عنصر **schema**. |
| [set_LinePosition](../xmlschemaobject/set_lineposition/)(int32_t) | يضبط موضع السطر في الملف الذي يشير إليه عنصر **schema**. |
| [set_Namespaces](../xmlschemaobject/set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | يضبط XmlSerializerNamespaces لاستخدامه مع كائن المخطط هذا. |
| [set_Parent](../xmlschemaobject/set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | يضبط الأصل لهذا [XmlSchemaObject](../xmlschemaobject/). |
| [set_SourceUri](../xmlschemaobject/set_sourceuri/)(const String\&) | يضبط موقع المصدر للملف الذي قام بتحميل المخطط. |
| [set_TargetNamespace](./set_targetnamespace/)(const String\&) | يضبط معرف الموارد الموحد (URI) لمساحة اسم الهدف للمخطط. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | يضبط السمات المؤهلة التي لا تنتمي إلى مساحة اسم الهدف للمخطط. |
| [set_Version](./set_version/)(const String\&) | يضبط إصدار المخطط. |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&) | يكتب XML [Schema](../) إلى تدفق البيانات المقدم. |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | يكتب XML [Schema](../) إلى الـ Stream المقدم باستخدام [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/) المحدد. |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&) | يكتب XML [Schema](../) إلى [IO::TextWriter](../../system.io/textwriter/) المقدم. |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | يكتب XML [Schema](../) إلى TextWriter المقدم. |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&) | يكتب XML [Schema](../) إلى [XmlWriter](../../system.xml/xmlwriter/) المقدم. |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | يكتب XML [Schema](../) إلى [XmlWriter](../../system.xml/xmlwriter/) المقدم. |
| [XmlSchema](./xmlschema/)() | ينشئ مثيلاً جديداً لفئة [XmlSchema](./). |
| [XmlSchemaObject](../xmlschemaobject/xmlschemaobject/)() | ينشئ مثيلاً جديداً لفئة [XmlSchemaObject](../xmlschemaobject/). |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [InstanceNamespace](./instancenamespace/) | مساحة اسم مثيل مخطط XML. هذا الحقل ثابت. |
| static [Namespace](./namespace/) | مساحة اسم مخطط XML. هذا الحقل ثابت. |
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
