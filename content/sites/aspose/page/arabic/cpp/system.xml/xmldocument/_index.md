---
title: "فئة System::Xml::XmlDocument"
linktitle: "XmlDocument"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Xml::XmlDocument. تمثل مستند XML. يمكنك استخدام هذه الفئة لتحميل، والتحقق، وتحرير، وإضافة، وتحديد موضع XML في مستند باستخدام C++."
type: docs
weight: 1400
url: /ar/cpp/system.xml/xmldocument/
---
## XmlDocument class


يمثل مستند XML. يمكنك استخدام هذه الفئة لتحميل، والتحقق، وتحرير، وإضافة، وتحديد موضع XML في المستند.

```cpp
class XmlDocument : public System::Xml::XmlNode
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | ينشئ نسخة مكررة من هذه العقدة. |
| [CreateAttribute](./createattribute/)(const String\&) | ينشئ [XmlAttribute](../xmlattribute/) بالاسم المحدد. |
| [CreateAttribute](./createattribute/)(const String\&, const String\&) | ينشئ [XmlAttribute](../xmlattribute/) بالاسم المؤهل المحدد و[XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateAttribute](./createattribute/)(const String\&, const String\&, const String\&) | ينشئ [XmlAttribute](../xmlattribute/) بالـ[XmlNode::get_Prefix](../xmlnode/get_prefix/)، و[XmlDocument::get_LocalName](./get_localname/)، و[XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateCDataSection](./createcdatasection/)(const String\&) | ينشئ [XmlCDataSection](../xmlcdatasection/) يحتوي على البيانات المحددة. |
| virtual [CreateComment](./createcomment/)(const String\&) | ينشئ [XmlComment](../xmlcomment/) يحتوي على البيانات المحددة. |
| virtual [CreateDocumentFragment](./createdocumentfragment/)() | ينشئ [XmlDocumentFragment](../xmldocumentfragment/). |
| virtual [CreateDocumentType](./createdocumenttype/)(const String\&, const String\&, const String\&, const String\&) | يرجع كائنًا جديدًا من نوع [XmlDocumentType](../xmldocumenttype/). |
| [CreateElement](./createelement/)(const String\&) | ينشئ عنصرًا بالاسم المحدد. |
| [CreateElement](./createelement/)(const String\&, const String\&) | ينشئ [XmlElement](../xmlelement/) بالاسم المؤهل و[XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateElement](./createelement/)(const String\&, const String\&, const String\&) | ينشئ عنصرًا بالـ[XmlNode::get_Prefix](../xmlnode/get_prefix/)، و[XmlDocument::get_LocalName](./get_localname/)، و[XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateEntityReference](./createentityreference/)(const String\&) | ينشئ [XmlEntityReference](../xmlentityreference/) بالاسم المحدد. |
| [CreateNavigator](./createnavigator/)() override | ينشئ كائن XPathNavigator جديدًا للتنقل في هذا المستند. |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&, const String\&) | ينشئ [XmlNode](../xmlnode/) بالـ[XmlNodeType](../xmlnodetype/)، و[XmlNode::get_Prefix](../xmlnode/get_prefix/)، و[XmlDocument::get_Name](./get_name/)، و[XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateNode](./createnode/)(const String\&, const String\&, const String\&) | ينشئ [XmlNode](../xmlnode/) بنوع العقدة المحدد، و[XmlDocument::get_Name](./get_name/)، و[XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&) | ينشئ [XmlNode](../xmlnode/) بالـ[XmlNodeType](../xmlnodetype/)، و[XmlDocument::get_Name](./get_name/)، و[XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateProcessingInstruction](./createprocessinginstruction/)(const String\&, const String\&) | ينشئ [XmlProcessingInstruction](../xmlprocessinginstruction/) بالاسم والبيانات المحددين. |
| virtual [CreateSignificantWhitespace](./createsignificantwhitespace/)(const String\&) | ينشئ عقدة [XmlSignificantWhitespace](../xmlsignificantwhitespace/). |
| virtual [CreateTextNode](./createtextnode/)(const String\&) | ينشئ [XmlText](../xmltext/) بالنص المحدد. |
| virtual [CreateWhitespace](./createwhitespace/)(const String\&) | ينشئ عقدة [XmlWhitespace](../xmlwhitespace/). |
| virtual [CreateXmlDeclaration](./createxmldeclaration/)(const String\&, const String\&, const String\&) | ينشئ عقدة [XmlDeclaration](../xmldeclaration/) بالقيم المحددة. |
| [get_BaseURI](./get_baseuri/)() override | يعيد عنوان URI الأساسي للعقدة الحالية. |
| [get_DocumentElement](./get_documentelement/)() | يعيد العنصر الجذر [XmlElement](../xmlelement/) للمستند. |
| virtual [get_DocumentType](./get_documenttype/)() | يعيد العقدة التي تحتوي على إعلان DOCTYPE. |
| [get_Implementation](./get_implementation/)() | يعيد كائن [XmlImplementation](../xmlimplementation/) للمستند الحالي. |
| [get_InnerXml](./get_innerxml/)() override | يعيد الترميز الذي يمثل أبناء العقدة الحالية. |
| [get_IsReadOnly](./get_isreadonly/)() override | يعيد قيمة تشير إلى ما إذا كانت العقدة الحالية للقراءة فقط. |
| [get_LocalName](./get_localname/)() override | يرجع الاسم المحلي للعقدة. |
| [get_Name](./get_name/)() override | يرجع الاسم المؤهل للعقدة. |
| [get_NameTable](./get_nametable/)() | يعيد [XmlNameTable](../xmlnametable/) المرتبط بهذا التنفيذ. |
| [get_NodeType](./get_nodetype/)() override | يرجع نوع العقدة الحالية. |
| [get_OwnerDocument](./get_ownerdocument/)() override | يعيد الـ [XmlDocument](./) الذي تنتمي إليه العقدة الحالية. |
| [get_PreserveWhitespace](./get_preservewhitespace/)() | يعيد قيمة تشير إلى ما إذا كان يجب الحفاظ على المسافات البيضاء في محتوى العنصر. |
| [get_SchemaInfo](./get_schemainfo/)() override | يعيد مجموعة معلومات ما بعد التحقق من المخطط (PSVI) للعقدة. |
| [get_Schemas](./get_schemas/)() | يعيد كائن XmlSchemaSet المرتبط بهذا الـ [XmlDocument](./). |
| virtual [GetElementById](./getelementbyid/)(String) | يعيد الـ [XmlElement](../xmlelement/) بالمعرف المحدد. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | يعيد [XmlNodeList](../xmlnodelist/) يحتوي على قائمة بجميع العناصر التابعة التي تطابق الاسم المحدد. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | يعيد [XmlNodeList](../xmlnodelist/) يحتوي على قائمة بجميع العناصر التابعة التي تطابق [XmlDocument::get_LocalName](./get_localname/) و [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [ImportNode](./importnode/)(SharedPtr\<XmlNode\>, bool) | يستورد عقدة من مستند آخر إلى المستند الحالي. |
| virtual [Load](./load/)(String) | يقوم بتحميل مستند XML من عنوان URL المحدد. |
| virtual [Load](./load/)(SharedPtr\<IO::Stream\>) | يقوم بتحميل مستند XML من الدفق المحدد. |
| virtual [Load](./load/)(SharedPtr\<IO::TextReader\>) | يقوم بتحميل مستند XML من الـ TextReader المحدد. |
| virtual [Load](./load/)(SharedPtr\<XmlReader\>) | يقوم بتحميل مستند XML من الـ [XmlReader](../xmlreader/) المحدد. |
| virtual [LoadXml](./loadxml/)(String) | يقوم بتحميل مستند XML من السلسلة المحددة. |
| virtual [ReadNode](./readnode/)(SharedPtr\<XmlReader\>) | ينشئ كائن [XmlNode](../xmlnode/) بناءً على المعلومات الموجودة في الـ [XmlReader](../xmlreader/). يجب أن يكون القارئ موجهًا إلى عقدة أو سمة. |
| virtual [Save](./save/)(String) | يحفظ مستند XML إلى الملف المحدد. إذا كان الملف المحدد موجودًا، فإن هذه الطريقة تستبدله. |
| virtual [Save](./save/)(SharedPtr\<IO::Stream\>) | يحفظ مستند XML إلى الدفق المحدد. |
| virtual [Save](./save/)(SharedPtr\<IO::TextWriter\>) | يحفظ مستند XML إلى الـ TextWriter المحدد. |
| virtual [Save](./save/)(SharedPtr\<XmlWriter\>) | يحفظ مستند XML إلى [XmlWriter](../xmlwriter/) المحدد. |
| [set_InnerText](./set_innertext/)(String) override | يرمي استثناء InvalidOperationException في جميع الحالات. |
| [set_InnerXml](./set_innerxml/)(String) override | يضبط الترميز الذي يمثل أبناء العقدة الحالية. |
| [set_PreserveWhitespace](./set_preservewhitespace/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب الحفاظ على المسافات البيضاء في محتوى العنصر. |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | يضبط كائن XmlSchemaSet المرتبط بـ [XmlDocument](./) هذا. |
| virtual [set_XmlResolver](./set_xmlresolver/)(SharedPtr\<System::Xml::XmlResolver\>) | يضبط [XmlResolver](../xmlresolver/) لاستخدامه في حل الموارد الخارجية. |
| [Validate](./validate/)(Schema::ValidationEventHandler) | يُصادق على [XmlDocument](./) مقابل مخططات لغة تعريف XML [Schema](../../system.xml.schema/) (XSD) الموجودة في قائمة [XmlDocument::get_Schemas](./get_schemas/). |
| [Validate](./validate/)(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) | يُصادق على كائن [XmlNode](../xmlnode/) المحدد مقابل مخططات لغة تعريف XML [Schema](../../system.xml.schema/) (XSD) الموجودة في قائمة [XmlDocument::get_Schemas](./get_schemas/). |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ جميع أبناء عقدة [XmlDocument](./) إلى [XmlWriter](../xmlwriter/) المحدد. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | يحفظ عقدة [XmlDocument](./) إلى [XmlWriter](../xmlwriter/) المحدد. |
| [XmlDocument](./xmldocument/)() | ينشئ مثيلاً جديداً من الفئة [XmlDocument](./). |
| [XmlDocument](./xmldocument/)(const SharedPtr\<XmlNameTable\>\&) | ينشئ مثيلاً جديداً من الفئة [XmlDocument](./) مع [XmlNameTable](../xmlnametable/) المحدد. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات



يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
