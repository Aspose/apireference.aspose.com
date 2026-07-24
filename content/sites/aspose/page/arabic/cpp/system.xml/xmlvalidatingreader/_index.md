---
title: "الفئة System::Xml::XmlValidatingReader"
linktitle: "XmlValidatingReader"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Xml::XmlValidatingReader. تمثل قارئًا يوفر تعريف نوع المستند (DTD)، ومخطط XML-Data Reduced (XDR)، والتحقق من لغة تعريف مخطط XML (XSD) في C++."
type: docs
weight: 4200
url: /ar/cpp/system.xml/xmlvalidatingreader/
---
## XmlValidatingReader class


تمثل قارئًا يوفر تعريف نوع المستند (DTD)، ومخطط XML-Data Reduced (XDR)، والتحقق من لغة تعريف مخطط XML (XSD) باستخدام [Schema](../../system.xml.schema/).

```cpp
class XmlValidatingReader : public System::Xml::XmlReader,
                            public System::Xml::IXmlLineInfo,
                            public System::Xml::IXmlNamespaceResolver
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Close](./close/)() override | يغيّر [XmlReader::get_ReadState](../xmlreader/get_readstate/) إلى Closed. |
| [get_AttributeCount](./get_attributecount/)() override | يعيد عدد السمات في العقدة الحالية. |
| [get_BaseURI](./get_baseuri/)() override | يعيد عنوان URI الأساسي للعقدة الحالية. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | يعيد قيمة تشير إلى ما إذا كان [XmlValidatingReader](./) يطبق طرق قراءة المحتوى الثنائي. |
| [get_CanResolveEntity](./get_canresolveentity/)() override | يعيد قيمة تشير إلى ما إذا كان هذا القارئ يستطيع تحليل الكيانات وحلها. |
| [get_Depth](./get_depth/)() override | يعيد عمق العقدة الحالية في مستند XML. |
| [get_Encoding](./get_encoding/)() | يعيد سمة الترميز للمستند. |
| [get_EntityHandling](./get_entityhandling/)() | يرجع قيمة تحدد كيفية تعامل القارئ مع الكيانات. |
| [get_EOF](./get_eof/)() override | يعيد قيمة تشير إلى ما إذا كان القارئ في موضع نهاية الدفق. |
| [get_HasValue](./get_hasvalue/)() override | يعيد قيمة تشير إلى ما إذا كانت العقدة الحالية يمكن أن تحتوي على [XmlValidatingReader::get_Value](./get_value/) غير [String::Empty](../../system/string/empty/). |
| [get_IsDefault](./get_isdefault/)() override | يعيد قيمة تشير إلى ما إذا كانت العقدة الحالية سمة تم إنشاؤها من القيمة الافتراضية المعرفة في تعريف نوع المستند (DTD) أو المخطط. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | يعيد قيمة تشير إلى ما إذا كانت العقدة الحالية عنصرًا فارغًا (على سبيل المثال، **<MyElement/>**). |
| [get_LineNumber](./get_linenumber/)() override | يرجع رقم السطر الحالي. |
| [get_LinePosition](./get_lineposition/)() override | يرجع موضع السطر الحالي. |
| [get_LocalName](./get_localname/)() override | يرجع الاسم المحلي للعقدة الحالية. |
| [get_Name](./get_name/)() override | يعيد الاسم المؤهل للعقدة الحالية. |
| [get_Namespaces](./get_namespaces/)() | يعيد قيمة تشير إلى ما إذا كان يجب دعم المساحات الاسمية. |
| [get_NamespaceURI](./get_namespaceuri/)() override | يعيد معرف الموارد الموحد (URI) للمساحة الاسمية (كما هو معرف في مواصفة مساحة الأسماء للاتحاد العالمي للويب [Web](../../system.web/) (W3C)) للعقدة التي يقع عليها القارئ. |
| [get_NameTable](./get_nametable/)() override | يعيد [XmlNameTable](../xmlnametable/) المرتبط بهذا التنفيذ. |
| [get_NodeType](./get_nodetype/)() override | يرجع نوع العقدة الحالية. |
| [get_Prefix](./get_prefix/)() override | يعيد بادئة مساحة الاسم المرتبطة بالعقدة الحالية. |
| [get_QuoteChar](./get_quotechar/)() override | يرجع حرف علامة الاقتباس المستخدم لتغليف قيمة عقدة السمة. |
| [get_Reader](./get_reader/)() | يعيد [XmlReader](../xmlreader/) المستخدم لإنشاء هذا [XmlValidatingReader](./). |
| [get_ReadState](./get_readstate/)() override | يعيد حالة القارئ. |
| [get_Schemas](./get_schemas/)() | يعيد XmlSchemaCollection لاستخدامه في التحقق. |
| [get_SchemaType](./get_schematype/)() | يعيد كائن نوع المخطط. |
| [get_ValidationType](./get_validationtype/)() | يعيد قيمة تشير إلى نوع التحقق الذي يجب إجراؤه. |
| [get_Value](./get_value/)() override | يعيد القيمة النصية للعقدة الحالية. |
| [get_XmlLang](./get_xmllang/)() override | يعيد نطاق **xml:lang** الحالي. |
| [get_XmlSpace](./get_xmlspace/)() override | يعيد نطاق **xml:space** الحالي. |
| [GetAttribute](./getattribute/)(String) override | يعيد قيمة السمة ذات الاسم المحدد. |
| [GetAttribute](./getattribute/)(String, String) override | يعيد قيمة السمة ذات الاسم المحلي والمساحة الاسمية Uniform Resource Identifier (URI) المحددين. |
| [GetAttribute](./getattribute/)(int32_t) override | يعيد قيمة السمة ذات الفهرس المحدد. |
| [HasLineInfo](./haslineinfo/)() override | يرجع قيمة تشير إلى ما إذا كان الصنف يمكنه إرجاع معلومات السطر. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | يحلّ بادئة مساحة الاسم في نطاق العنصر الحالي. |
| [MoveToAttribute](./movetoattribute/)(String) override | ينتقل إلى السمة ذات الاسم المحدد. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | ينتقل إلى السمة ذات الاسم المحلي والمساحة الاسمية Uniform Resource Identifier (URI) المحددين. |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | ينتقل إلى السمة ذات الفهرس المحدد. |
| [MoveToElement](./movetoelement/)() override | ينتقل إلى العنصر الذي يحتوي على عقدة السمة الحالية. |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | ينتقل إلى السمة الأولى. |
| [MoveToNextAttribute](./movetonextattribute/)() override | ينتقل إلى السمة التالية. |
| [Read](./read/)() override | يقرأ العقدة التالية من الدفق. |
| [ReadAttributeValue](./readattributevalue/)() override | يقوم بتحليل قيمة السمة إلى واحد أو أكثر من **[Text](../../system.text/)**، **EntityReference**، أو **EndEntity** العقد. |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | يقرأ المحتوى ويعيد بايتات ثنائية مُفكّكة من Base64. |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | يقرأ المحتوى ويعيد بايتات ثنائية مُفكّكة من BinHex. |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | يقرأ العنصر ويفكّك محتوى Base64. |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | يقرأ العنصر ويفكّك محتوى BinHex. |
| [ReadString](./readstring/)() override | يقرأ محتويات عنصر أو عقدة نصية كسلسلة. |
| [ReadTypedValue](./readtypedvalue/)() | يعيد نوع وقت التشغيل للغة تعريف XML [Schema](../../system.xml.schema/) المحددة (XSD). |
| [ResolveEntity](./resolveentity/)() override | يحل مرجع الكيان لعقد **EntityReference**. |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | يضبط قيمة تحدد كيفية تعامل القارئ مع الكيانات. |
| [set_Namespaces](./set_namespaces/)(bool) | يضبط قيمة تشير إلى ما إذا كان سيتم دعم النطاقات. |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | يضبط قيمة تشير إلى نوع التحقق الذي سيتم إجراؤه. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | يضبط الـ [XmlResolver](../xmlresolver/) المستخدم لحل مراجع تعريف نوع المستند الخارجي (DTD) ومواقع المخطط. كما يُستخدم الـ [XmlResolver](../xmlresolver/) لمعالجة أي عناصر استيراد أو تضمين موجودة في مخطط XML [Schema](../../system.xml.schema/) (XSD). |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | يضيف معالج حدث لتلقي المعلومات حول تعريف نوع المستند (DTD)، مخطط XML-Data Reduced (XDR)، وأخطاء التحقق من مخطط XML [Schema](../../system.xml.schema/) (XSD). |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | يزيل معالج حدث لتلقي المعلومات حول تعريف نوع المستند (DTD)، مخطط XML-Data Reduced (XDR)، وأخطاء التحقق من مخطط XML [Schema](../../system.xml.schema/) (XSD). |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<XmlReader\>\&) | ينشئ مثيلاً جديداً من الفئة [XmlValidatingReader](./) التي تتحقق من صحة المحتوى المسترجع من الـ [XmlReader](../xmlreader/) المعطى. |
| [XmlValidatingReader](./xmlvalidatingreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | ينشئ مثيلاً جديداً من الفئة [XmlValidatingReader](./) بالقيم المحددة. |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | ينشئ مثيلاً جديداً من الفئة [XmlValidatingReader](./) بالقيم المحددة. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## ملاحظات


## Deprecated
هذه الفئة مهجورة. يُنصح باستخدام فئة XmlReaderSettings وطريقة XmlReader::Create لإنشاء قارئ XML يتحقق من صحة.

يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيلات من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
