---
title: "System::Xml::XmlReader فئة"
linktitle: "XmlReader"
second_title: "Aspose.Font لـ C++"
description: "System::Xml::XmlReader فئة. تمثل قارئًا يوفر وصولًا سريعًا، غير مخزن مؤقتًا، وإلى الأمام فقط إلى بيانات XML في C++."
type: docs
weight: 3300
url: /ar/cpp/system.xml/xmlreader/
---
## XmlReader class


يمثل قارئًا يوفر وصولًا سريعًا غير مخزن مؤقتًا إلى بيانات XML باتجاه أمامي فقط.

```cpp
class XmlReader : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Close](./close/)() | عند تجاوزها في فئة مشتقة، تغير [XmlReader::get_ReadState](./get_readstate/) إلى [ReadState::Closed](../readstate/). |
| static [Create](./create/)(const String\&) | ينشئ نسخة جديدة من [XmlReader](./) باستخدام URI المحدد. |
| static [Create](./create/)(const String\&, const SharedPtr\<XmlReaderSettings\>\&) | ينشئ نسخة جديدة من [XmlReader](./) باستخدام URI والإعدادات المحددة. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | ينشئ نسخة جديدة من [XmlReader](./) باستخدام URI والإعدادات ومعلومات السياق المحددة للتحليل. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | ينشئ نسخة جديدة من [XmlReader](./) باستخدام الدفق المحدد مع الإعدادات الافتراضية. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) | ينشئ نسخة جديدة من [XmlReader](./) باستخدام الدفق والإعدادات المحددة. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | ينشئ نسخة جديدة من [XmlReader](./) باستخدام الدفق المحدد، URI الأساسي، والإعدادات. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | ينشئ نسخة جديدة من [XmlReader](./) باستخدام الدفق المحدد، الإعدادات، ومعلومات السياق للتحليل. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&) | ينشئ نسخة جديدة من [XmlReader](./) باستخدام قارئ النص المحدد. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) | ينشئ نسخة جديدة من [XmlReader](./) باستخدام قارئ النص المحدد والإعدادات. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | ينشئ نسخة جديدة من [XmlReader](./) باستخدام قارئ النص المحدد، الإعدادات، وURI الأساسي. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | ينشئ نسخة جديدة من [XmlReader](./) باستخدام قارئ النص المحدد، الإعدادات، ومعلومات السياق للتحليل. |
| static [Create](./create/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) | ينشئ نسخة جديدة من [XmlReader](./) باستخدام قارئ XML المحدد والإعدادات. |
| [Dispose](./dispose/)() override | يطلق جميع الموارد المستخدمة من قبل النسخة الحالية من فئة [XmlReader](./). |
| virtual [get_AttributeCount](./get_attributecount/)() | عند تجاوزها في فئة مشتقة، يحصل على عدد السمات في العقدة الحالية. |
| virtual [get_BaseURI](./get_baseuri/)() | عند تجاوزها في فئة مشتقة، تحصل على عنوان URI الأساسي للعقدة الحالية. |
| virtual [get_CanReadBinaryContent](./get_canreadbinarycontent/)() | يرجع قيمة تشير إلى ما إذا كان [XmlReader](./) يطبق طرق قراءة المحتوى الثنائي. |
| virtual [get_CanReadValueChunk](./get_canreadvaluechunk/)() | يرجع قيمة تشير إلى ما إذا كان [XmlReader](./) يطبق طريقة [XmlReader::ReadValueChunk](./readvaluechunk/). |
| virtual [get_CanResolveEntity](./get_canresolveentity/)() | يعيد قيمة تشير إلى ما إذا كان هذا القارئ يستطيع تحليل الكيانات وحلها. |
| virtual [get_Depth](./get_depth/)() | عند تجاوزها في فئة مشتقة، تحصل على عمق العقدة الحالية في مستند XML. |
| virtual [get_EOF](./get_eof/)() | عند تجاوزها في فئة مشتقة، تحصل على قيمة تشير إلى ما إذا كان القارئ في وضعية النهاية في الدفق. |
| virtual [get_HasAttributes](./get_hasattributes/)() | يعيد قيمة تشير إلى ما إذا كانت العقدة الحالية تحتوي على أي سمات. |
| virtual [get_HasValue](./get_hasvalue/)() | عند تجاوزها في فئة مشتقة، تحصل على قيمة تشير إلى ما إذا كانت العقدة الحالية يمكن أن تحتوي على قيمة [XmlReader::get_Value](./get_value/). |
| virtual [get_IsDefault](./get_isdefault/)() | عند تجاوزها في فئة مشتقة، تحصل على قيمة تشير إلى ما إذا كانت العقدة الحالية سمة تم إنشاؤها من القيمة الافتراضية المعرفة في DTD أو المخطط. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | عند تجاوزها في فئة مشتقة، تحصل على قيمة تشير إلى ما إذا كانت العقدة الحالية عنصرًا فارغًا (على سبيل المثال، **<MyElement/>**). |
| virtual [get_LocalName](./get_localname/)() | عند تجاوزها في فئة مشتقة، تحصل على الاسم المحلي للعقدة الحالية. |
| virtual [get_Name](./get_name/)() | عند تجاوزها في فئة مشتقة، تحصل على الاسم المؤهل للعقدة الحالية. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | عند تجاوزها في فئة مشتقة، تحصل على عنوان URI للمساحة الاسمية (كما هو معرف في مواصفة مساحة الأسماء الخاصة بـ W3C) للعقدة التي يقع عليها القارئ. |
| virtual [get_NameTable](./get_nametable/)() | عند تجاوزها في فئة مشتقة، تحصل على [XmlNameTable](../xmlnametable/) المرتبط بهذا التنفيذ. |
| virtual [get_NodeType](./get_nodetype/)() | عند تجاوزها في فئة مشتقة، تحصل على نوع العقدة الحالية. |
| virtual [get_Prefix](./get_prefix/)() | عند تجاوزها في فئة مشتقة، تحصل على بادئة مساحة الاسم المرتبطة بالعقدة الحالية. |
| virtual [get_QuoteChar](./get_quotechar/)() | عند تجاوزها في فئة مشتقة، تحصل على حرف علامة الاقتباس المستخدم لإحاطة قيمة عقدة السمة. |
| virtual [get_ReadState](./get_readstate/)() | عند تجاوزها في فئة مشتقة، تحصل على حالة القارئ. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | يرجع معلومات المخطط التي تم تعيينها للعقدة الحالية نتيجة للتحقق من صحة المخطط. |
| virtual [get_Settings](./get_settings/)() | يرجع كائن [XmlReaderSettings](../xmlreadersettings/) المستخدم لإنشاء هذه المثيلة من [XmlReader](./). |
| virtual [get_Value](./get_value/)() | عند تجاوزها في فئة مشتقة، تحصل على القيمة النصية للعقدة الحالية. |
| virtual [get_ValueType](./get_valuetype/)() | يرجع النوع للعقدة الحالية. |
| virtual [get_XmlLang](./get_xmllang/)() | عند تجاوزها في فئة مشتقة، تحصل على نطاق **xml:lang** الحالي. |
| virtual [get_XmlSpace](./get_xmlspace/)() | عند تجاوزها في فئة مشتقة، تحصل على نطاق **xml:space** الحالي. |
| virtual [GetAttribute](./getattribute/)(String) | عند تجاوزها في فئة مشتقة، تحصل على قيمة السمة ذات القيمة المحددة لـ [XmlReader::get_Name](./get_name/). |
| virtual [GetAttribute](./getattribute/)(String, String) | عند تجاوزها في فئة مشتقة، تحصل على قيمة السمة ذات القيم المحددة لـ [XmlReader::get_LocalName](./get_localname/) و [XmlReader::get_NamespaceURI](./get_namespaceuri/). |
| virtual [GetAttribute](./getattribute/)(int32_t) | عند تجاوزها في فئة مشتقة، تحصل على قيمة السمة ذات الفهرس المحدد. |
| virtual [idx_get](./idx_get/)(int32_t) | عند تجاوزها في فئة مشتقة، تحصل على قيمة السمة ذات الفهرس المحدد. |
| virtual [idx_get](./idx_get/)(String) | عند تجاوزها في فئة مشتقة، تحصل على قيمة السمة ذات القيمة المحددة لـ [XmlReader::get_Name](./get_name/). |
| virtual [idx_get](./idx_get/)(String, String) | عند تجاوزها في فئة مشتقة، تحصل على قيمة السمة ذات القيم المحددة لـ [XmlReader::get_LocalName](./get_localname/) و [XmlReader::get_NamespaceURI](./get_namespaceuri/). |
| static [IsName](./isname/)(const String\&) | يعيد قيمة تشير إلى ما إذا كان معامل السلسلة نصًا صالحًا كاسم XML. |
| static [IsNameToken](./isnametoken/)(const String\&) | يعيد قيمة تشير إلى ما إذا كان معامل السلسلة نصًا صالحًا كرمز اسم XML أو لا. |
| virtual [IsStartElement](./isstartelement/)() | ينادي [XmlReader::MoveToContent](./movetocontent/) ويختبر ما إذا كانت عقدة المحتوى الحالية علامة بداية أو علامة عنصر فارغ. |
| virtual [IsStartElement](./isstartelement/)(String) | ينادي [XmlReader::MoveToContent](./movetocontent/) ويختبر ما إذا كانت عقدة المحتوى الحالية علامة بداية أو علامة عنصر فارغ وما إذا كانت قيمة [XmlReader::get_Name](./get_name/) للعنصر الموجود تطابق المعامل المعطى. |
| virtual [IsStartElement](./isstartelement/)(String, String) | ينادي [XmlReader::MoveToContent](./movetocontent/) ويختبر ما إذا كانت عقدة المحتوى الحالية علامة بداية أو علامة عنصر فارغ وما إذا كانت قيمتي [XmlReader::get_LocalName](./get_localname/) و[XmlReader::get_NamespaceURI](./get_namespaceuri/) للعنصر الموجود تطابق السلاسل المعطاة. |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | عند تجاوزها في فئة مشتقة، تحلّ إشارة بادئة مساحة الاسم في نطاق العنصر الحالي. |
| virtual [MoveToAttribute](./movetoattribute/)(String) | عند تجاوزها في فئة مشتقة، تنتقل إلى السمة التي لها قيمة [XmlReader::get_Name](./get_name/) المحددة. |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | عند تجاوزها في فئة مشتقة، تنتقل إلى السمة التي لها قيمتي [XmlReader::get_LocalName](./get_localname/) و[XmlReader::get_NamespaceURI](./get_namespaceuri/) المحددتين. |
| virtual [MoveToAttribute](./movetoattribute/)(int32_t) | عند تجاوزها في فئة مشتقة، تنتقل إلى السمة ذات الفهرس المحدد. |
| virtual [MoveToContent](./movetocontent/)() | يتحقق مما إذا كانت العقدة الحالية عقدة محتوى (نص غير مسافة بيضاء، **CDATA**، **Element**، **EndElement**، **EntityReference**، أو **EndEntity**). إذا لم تكن العقدة عقدة محتوى، يتخطى القارئ إلى عقدة المحتوى التالية أو إلى نهاية الملف. يتخطى العقد من النوع التالي: **ProcessingInstruction**، **DocumentType**، **Comment**، **Whitespace**، أو **SignificantWhitespace**. |
| virtual [MoveToElement](./movetoelement/)() | عند تجاوزها في فئة مشتقة، تنتقل إلى العنصر الذي يحتوي على عقدة السمة الحالية. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | عند تجاوزها في فئة مشتقة، تنتقل إلى السمة الأولى. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | عند تجاوزها في فئة مشتقة، تنتقل إلى السمة التالية. |
| virtual [Read](./read/)() | عند تجاوزها في فئة مشتقة، تقرأ العقدة التالية من التدفق. |
| virtual [ReadAttributeValue](./readattributevalue/)() | عند تجاوزها في فئة مشتقة، تحلل قيمة السمة إلى واحدة أو أكثر من عقد **[Text](../../system.text/)**، **EntityReference**، أو **EndEntity**. |
| virtual [ReadContentAs](./readcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | يقرأ المحتوى ككائن من النوع المحدد. |
| virtual [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | يقرأ المحتوى ويعيد بايتات ثنائية مفككة من Base64. |
| virtual [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | يقرأ المحتوى ويُرجع البايتات الثنائية المفكوكة من **BinHex**. |
| virtual [ReadContentAsBoolean](./readcontentasboolean/)() | يقرأ محتوى النص في الموضع الحالي كـ [Boolean](../../system/boolean/). |
| virtual [ReadContentAsDateTime](./readcontentasdatetime/)() | يقرأ محتوى النص في الموضع الحالي ككائن [DateTime](../../system/datetime/). |
| virtual [ReadContentAsDateTimeOffset](./readcontentasdatetimeoffset/)() | يقرأ محتوى النص في الموضع الحالي ككائن [DateTimeOffset](../../system/datetimeoffset/). |
| virtual [ReadContentAsDecimal](./readcontentasdecimal/)() | يقرأ محتوى النص في الموضع الحالي ككائن [Decimal](../../system/decimal/). |
| virtual [ReadContentAsDouble](./readcontentasdouble/)() | يقرأ محتوى النص في الموضع الحالي كعدد عائم بدقة مزدوجة. |
| virtual [ReadContentAsFloat](./readcontentasfloat/)() | يقرأ محتوى النص في الموضع الحالي كعدد عائم بدقة أحادية. |
| virtual [ReadContentAsInt](./readcontentasint/)() | يقرأ محتوى النص في الموضع الحالي كعدد صحيح موقّع 32-بت. |
| virtual [ReadContentAsLong](./readcontentaslong/)() | يقرأ محتوى النص في الموضع الحالي كعدد صحيح موقّع 64-بت. |
| virtual [ReadContentAsObject](./readcontentasobject/)() | يقرأ محتوى النص في الموضع الحالي كـ [Object](../../system/object/). |
| virtual [ReadContentAsString](./readcontentasstring/)() | يقرأ محتوى النص في الموضع الحالي ككائن [String](../../system/string/). |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | يقرأ محتوى العنصر كنوع مطلوب. |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) | يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ محتوى العنصر كنوع مطلوب. |
| virtual [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | يقرأ العنصر ويفكّ شفرة محتوى **Base64**. |
| virtual [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | يقرأ العنصر ويفك تشفير محتوى **BinHex**. |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)() | يقرأ العنصر الحالي ويعيد المحتويات ككائن [Boolean](../../system/boolean/). |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)(String, String) | يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ العنصر الحالي ويعيد المحتويات ككائن [Boolean](../../system/boolean/). |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)() | يقرأ العنصر الحالي ويعيد المحتويات ككائن [DateTime](../../system/datetime/). |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)(String, String) | يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ العنصر الحالي ويعيد المحتويات ككائن [DateTime](../../system/datetime/). |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)() | يقرأ العنصر الحالي ويعيد المحتويات ككائن [Decimal](../../system/decimal/). |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)(String, String) | يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ العنصر الحالي ويعيد المحتويات ككائن [Decimal](../../system/decimal/). |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)() | يقرأ العنصر الحالي ويعيد المحتويات كعدد عائم بدقة مزدوجة. |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)(String, String) | يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ العنصر الحالي ويعيد المحتويات كعدد عائم بدقة مزدوجة. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)() | يقرأ العنصر الحالي ويعيد المحتويات كعدد عائم بدقة أحادية. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)(String, String) | يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ العنصر الحالي ويعيد المحتويات كعدد عائم بدقة أحادية. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)() | يقرأ العنصر الحالي ويعيد المحتويات كعدد صحيح موقّع 32-بت. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)(String, String) | يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ العنصر الحالي ويعيد المحتويات كعدد صحيح موقّع 32-بت. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)() | يقرأ العنصر الحالي ويعيد المحتويات كعدد صحيح موقّع 64-بت. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)(String, String) | يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ العنصر الحالي ويعيد المحتويات كعدد صحيح موقّع 64-بت. |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)() | يقرأ العنصر الحالي ويعيد المحتويات ككائن [Object](../../system/object/). |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)(String, String) | يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ العنصر الحالي ويعيد المحتويات ككائن [Object](../../system/object/). |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)() | يقرأ العنصر الحالي ويعيد المحتويات ككائن [String](../../system/string/). |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)(String, String) | يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ العنصر الحالي ويعيد المحتويات ككائن [String](../../system/string/). |
| virtual [ReadElementString](./readelementstring/)() | يقرأ عنصرًا نصيًا فقط. ومع ذلك، يُنصح باستخدام طريقة [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) بدلاً من ذلك، لأنها توفر طريقة أكثر بساطة للتعامل مع هذه العملية. |
| virtual [ReadElementString](./readelementstring/)(String) | يتحقق من أن قيمة [XmlReader::get_Name](./get_name/) للعنصر الموجود تطابق السلسلة المعطاة قبل قراءة عنصر نصي فقط. ومع ذلك، يُنصح باستخدام طريقة [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) بدلاً من ذلك، لأنها توفر طريقة أكثر بساطة للتعامل مع هذه العملية. |
| virtual [ReadElementString](./readelementstring/)(String, String) | يتحقق من أن قيمتي [XmlReader::get_LocalName](./get_localname/) و[XmlReader::get_NamespaceURI](./get_namespaceuri/) للعنصر الموجود تطابق السلاسل المعطاة قبل قراءة عنصر نصي فقط. ومع ذلك، يُنصح باستخدام طريقة [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) بدلاً من ذلك، لأنها توفر طريقة أكثر بساطة للتعامل مع هذه العملية. |
| virtual [ReadEndElement](./readendelement/)() | يتحقق من أن عقدة المحتوى الحالية هي علامة إغلاق ويُقدِّم القارئ إلى العقدة التالية. |
| virtual [ReadInnerXml](./readinnerxml/)() | عند تجاوزها في فئة مشتقة، تقرأ جميع المحتويات، بما في ذلك العلامات، كسلسلة نصية. |
| virtual [ReadOuterXml](./readouterxml/)() | عند تجاوزها في فئة مشتقة، تقرأ المحتوى، بما في ذلك العلامات، الذي يمثل هذه العقدة وجميع أبنائها. |
| virtual [ReadStartElement](./readstartelement/)() | يتحقق من أن العقدة الحالية عنصر ويُقدِّم القارئ إلى العقدة التالية. |
| virtual [ReadStartElement](./readstartelement/)(String) | يتحقق من أن عقدة المحتوى الحالية عنصر بالقيمة [XmlReader::get_Name](./get_name/) المحددة ويُقدِّم القارئ إلى العقدة التالية. |
| virtual [ReadStartElement](./readstartelement/)(String, String) | يتحقق من أن عقدة المحتوى الحالية عنصر بالقيم [XmlReader::get_LocalName](./get_localname/) و[XmlReader::get_NamespaceURI](./get_namespaceuri/) المحددة ويُقدِّم القارئ إلى العقدة التالية. |
| virtual [ReadString](./readstring/)() | عند تجاوزها في فئة مشتقة، تقرأ محتويات عنصر أو عقدة نصية كسلسلة نصية. ومع ذلك، يُنصَح باستخدام طريقة [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) بدلاً منها، لأنها توفر طريقة أكثر بساطة لمعالجة هذه العملية. |
| virtual [ReadSubtree](./readsubtree/)() | تُعيد كائنًا جديدًا من نوع [XmlReader](./) يمكن استخدامه لقراءة العقدة الحالية وجميع العقد التابعة لها. |
| virtual [ReadToDescendant](./readtodescendant/)(String) | يُقدِّم [XmlReader](./) إلى العنصر التالي المتفرع بالاسم المؤهل المحدد. |
| virtual [ReadToDescendant](./readtodescendant/)(String, String) | يُقدِّم [XmlReader](./) إلى العنصر التالي المتفرع بالاسم المحلي وURI مساحة الاسم المحددين. |
| virtual [ReadToFollowing](./readtofollowing/)(String) | يقرأ حتى يتم العثور على عنصر بالاسم المؤهل المحدد. |
| virtual [ReadToFollowing](./readtofollowing/)(String, String) | يقرأ حتى يتم العثور على عنصر بالاسم المحلي وURI مساحة الاسم المحددين. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String) | يُقدِّم [XmlReader](./) إلى العنصر الشقيق التالي بالاسم المؤهل المحدد. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String, String) | يُقدِّم [XmlReader](./) إلى العنصر الشقيق التالي بالاسم المحلي وURI مساحة الاسم المحددين. |
| virtual [ReadValueChunk](./readvaluechunk/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | يقرأ تدفقات نصية كبيرة مدمجة في مستند XML. |
| virtual [ResolveEntity](./resolveentity/)() | عند تجاوزها في فئة مشتقة، تحل مرجع الكيان لعقد **EntityReference**. |
| virtual [Skip](./skip/)() | يتخطى أبناء العقدة الحالية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
