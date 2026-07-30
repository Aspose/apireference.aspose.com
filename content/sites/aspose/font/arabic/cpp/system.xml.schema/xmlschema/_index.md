---
title: "فئة System::Xml::Schema::XmlSchema"
linktitle: "XmlSchema"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Xml::Schema::XmlSchema. تمثيل في الذاكرة لمخطط XML، كما هو محدد في اتحاد الويب العالمي (W3C) وفي C++."
type: docs
weight: 400
url: /ar/cpp/system.xml.schema/xmlschema/
---
## XmlSchema class


تمثيل في الذاكرة لمخطط XML [Schema](../)، كما هو محدد في اتحاد الويب العالمي [Web](../../system.web/) (W3C) [XML Schema Part 1: Structures](https://www.w3.org/TR/xmlschema-1/) و[XML Schema Part 2: Datatypes](https://www.w3.org/TR/xmlschema-2/).

```cpp
class XmlSchema : public System::Xml::Schema::XmlSchemaObject
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Compile](./compile/)(ValidationEventHandler) | يقوم بترجمة نموذج XML [Schema](../)[Object](../../system/object/) (SOM) إلى معلومات المخطط للتحقق. يُستخدم للتحقق من البنية النحوية والدلالية لنموذج SOM المُنشأ برمجيًا. يتم إجراء فحص التحقق الدلالي أثناء الترجمة. |
| [Compile](./compile/)(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) | يقوم بترجمة نموذج XML [Schema](../)[Object](../../system/object/) (SOM) إلى معلومات المخطط للتحقق. يُستخدم للتحقق من البنية النحوية والدلالية لنموذج SOM المُنشأ برمجيًا. يتم إجراء فحص التحقق الدلالي أثناء الترجمة. |
| [get_AttributeFormDefault](./get_attributeformdefault/)() | يعيد الصيغة للسمات المعلنة في مساحة الاسم المستهدفة للمخطط. |
| [get_AttributeGroups](./get_attributegroups/)() | يعيد قيمة ما بعد تجميع المخطط لجميع مجموعات السمات العامة في المخطط. |
| [get_Attributes](./get_attributes/)() | يعيد قيمة ما بعد تجميع المخطط لجميع السمات في المخطط. |
| [get_BlockDefault](./get_blockdefault/)() | يعيد السمة **blockDefault** التي تحدد القيمة الافتراضية للسمة **block** على العناصر والأنواع المركبة في **targetNamespace** للمخطط. |
| [get_ElementFormDefault](./get_elementformdefault/)() | يعيد الصيغة للعناصر المعلنة في مساحة الاسم المستهدفة للمخطط. |
| [get_Elements](./get_elements/)() | يعيد قيمة ما بعد تجميع المخطط لجميع العناصر في المخطط. |
| [get_FinalDefault](./get_finaldefault/)() | يعيد السمة **finalDefault** التي تحدد القيمة الافتراضية للسمة **final** على العناصر والأنواع المركبة في مساحة الاسم المستهدفة للمخطط. |
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
| [get_SourceUri](../xmlschemaobject/get_sourceuri/)() | يعيد موقع المصدر للملف الذي قام بتحميل المخطط. |
| [get_TargetNamespace](./get_targetnamespace/)() | يعيد معرف الموارد الموحد (URI) لمساحة الاسم الهدف للمخطط. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | يعيد السمات المؤهلة التي لا تنتمي إلى مساحة الاسم الهدف للمخطط. |
| [get_Version](./get_version/)() | يعيد نسخة المخطط. |
| static [Read](./read/)(const SharedPtr\<IO::TextReader\>\&, ValidationEventHandler) | يقرأ XML [Schema](../) من [IO::TextReader](../../system.io/textreader/) المزوَّد. |
| static [Read](./read/)(const SharedPtr\<IO::Stream\>\&, ValidationEventHandler) | يقرأ XML [Schema](../) من الدفق المزوَّد. |
| static [Read](./read/)(const SharedPtr\<XmlReader\>\&, ValidationEventHandler) | يقرأ XML [Schema](../) من [XmlReader](../../system.xml/xmlreader/) المزوَّد. |
| [set_AttributeFormDefault](./set_attributeformdefault/)(XmlSchemaForm) | يضبط الشكل للسمات المعلنة في مساحة الاسم الهدف للمخطط. |
| [set_BlockDefault](./set_blockdefault/)(XmlSchemaDerivationMethod) | يضبط السمة **blockDefault** التي تحدد القيمة الافتراضية للسمة **block** على العناصر والأنواع المركبة في **targetNamespace** للمخطط. |
| [set_ElementFormDefault](./set_elementformdefault/)(XmlSchemaForm) | يضبط الشكل للعناصر المعلنة في مساحة الاسم الهدف للمخطط. |
| [set_FinalDefault](./set_finaldefault/)(XmlSchemaDerivationMethod) | يضبط السمة **finalDefault** التي تحدد القيمة الافتراضية للسمة **final** على العناصر والأنواع المركبة في مساحة الاسم الهدف للمخطط. |
| [set_Id](./set_id/)(const String\&) | يضبط معرف السلسلة. |
| [set_LineNumber](../xmlschemaobject/set_linenumber/)(int32_t) | يضبط رقم السطر في الملف الذي يشير إليه عنصر **schema**. |
| [set_LinePosition](../xmlschemaobject/set_lineposition/)(int32_t) | يضبط موضع السطر في الملف الذي يشير إليه عنصر **schema**. |
| [set_Namespaces](../xmlschemaobject/set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | يضبط XmlSerializerNamespaces لاستخدامه مع كائن المخطط هذا. |
| [set_Parent](../xmlschemaobject/set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | يضبط الأصل لهذا [XmlSchemaObject](../xmlschemaobject/). |
| [set_SourceUri](../xmlschemaobject/set_sourceuri/)(const String\&) | يضبط موقع المصدر للملف الذي قام بتحميل المخطط. |
| [set_TargetNamespace](./set_targetnamespace/)(const String\&) | يضبط معرف الموارد الموحد (URI) لمساحة الاسم الهدف للمخطط. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | يضبط السمات المؤهلة التي لا تنتمي إلى مساحة الاسم الهدف للمخطط. |
| [set_Version](./set_version/)(const String\&) | يضبط نسخة المخطط. |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&) | يكتب XML [Schema](../) إلى دفق البيانات المزوَّد. |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | يكتب XML [Schema](../) إلى الـ Stream المزوَّد باستخدام [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/) المحدد. |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&) | يكتب XML [Schema](../) إلى [IO::TextWriter](../../system.io/textwriter/) المزوَّد. |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | يكتب XML [Schema](../) إلى TextWriter المزوَّد. |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&) | يكتب XML [Schema](../) إلى [XmlWriter](../../system.xml/xmlwriter/) المزوَّد. |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | يكتب XML [Schema](../) إلى [XmlWriter](../../system.xml/xmlwriter/) المزوَّد. |
| [XmlSchema](./xmlschema/)() | يُنشئ مثيلًا جديدًا للفئة [XmlSchema](./). |
| [XmlSchemaObject](../xmlschemaobject/xmlschemaobject/)() | يُنشئ مثيلًا جديدًا للفئة [XmlSchemaObject](../xmlschemaobject/). |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [InstanceNamespace](./instancenamespace/) | مساحة اسم مثيل مخطط XML. هذه الخاصية ثابتة. |
| static [Namespace](./namespace/) | مساحة اسم مخطط XML. هذه الخاصية ثابتة. |
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
