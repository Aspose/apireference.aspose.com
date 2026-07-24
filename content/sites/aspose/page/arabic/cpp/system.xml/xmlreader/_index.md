---
title: "System::Xml::XmlReader class"
linktitle: "XmlReader"
second_title: "Aspose.Page لـ C++"
description: "System::Xml::XmlReader class. يمثل قارئًا يوفر وصولًا سريعًا، غير مخزن مؤقتًا، وإلى الأمام فقط إلى بيانات XML في C++."
type: docs
weight: 3300
url: /ar/cpp/system.xml/xmlreader/
---
## XmlReader class


يمثل قارئًا يوفر وصولًا سريعًا غير مخزن مؤقتًا إلى بيانات XML.

```cpp
class XmlReader : public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Close](./close/)() | عند تجاوزها في فئة مشتقة، تغير [XmlReader::get_ReadState](./get_readstate/) إلى [ReadState::Closed](../readstate/). |
| static [Create](./create/)(const String\&) | ينشئ مثيلًا جديدًا من [XmlReader](./) مع عنوان URI المحدد. |
| static [Create](./create/)(const String\&, const SharedPtr\<XmlReaderSettings\>\&) | ينشئ مثيلًا جديدًا من [XmlReader](./) باستخدام عنوان URI والإعدادات المحددة. |
| static [Create](./create/)(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | ينشئ مثيلًا جديدًا من [XmlReader](./) باستخدام عنوان URI والإعدادات ومعلومات السياق للتحليل. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | ينشئ مثيلًا جديدًا من [XmlReader](./) باستخدام الدفق المحدد مع الإعدادات الافتراضية. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) | ينشئ مثيلًا جديدًا من [XmlReader](./) مع الدفق المحدد والإعدادات. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | ينشئ مثيلًا جديدًا من [XmlReader](./) باستخدام الدفق المحدد وعنوان URI الأساسي والإعدادات. |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | ينشئ مثيلًا جديدًا من [XmlReader](./) باستخدام الدفق المحدد والإعدادات ومعلومات السياق للتحليل. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&) | ينشئ مثيلًا جديدًا من [XmlReader](./) باستخدام قارئ النص المحدد. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) | ينشئ مثيلًا جديدًا من [XmlReader](./) باستخدام قارئ النص المحدد والإعدادات. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | ينشئ مثيلًا جديدًا من [XmlReader](./) باستخدام قارئ النص المحدد والإعدادات وعنوان URI الأساسي. |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | ينشئ مثيلًا جديدًا من [XmlReader](./) باستخدام قارئ النص المحدد والإعدادات ومعلومات السياق للتحليل. |
| static [Create](./create/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) | ينشئ مثيلًا جديدًا من [XmlReader](./) باستخدام قارئ XML المحدد والإعدادات. |
| [Dispose](./dispose/)() override | يطلق جميع الموارد المستخدمة من قبل المثيل الحالي لفئة [XmlReader](./). |
| virtual [get_AttributeCount](./get_attributecount/)() | عند تجاوزها في فئة مشتقة، تُعيد عدد السمات في العقدة الحالية. |
| virtual [get_BaseURI](./get_baseuri/)() | عند تجاوزها في فئة مشتقة، تُعيد عنوان URI الأساسي للعقدة الحالية. |
| virtual [get_CanReadBinaryContent](./get_canreadbinarycontent/)() | يرجع قيمة تُشير إلى ما إذا كان [XmlReader](./) يطبق طرق قراءة المحتوى الثنائي. |
| virtual [get_CanReadValueChunk](./get_canreadvaluechunk/)() | يرجع قيمة تُشير إلى ما إذا كان [XmlReader](./) يطبق طريقة [XmlReader::ReadValueChunk](./readvaluechunk/). |
| virtual [get_CanResolveEntity](./get_canresolveentity/)() | يعيد قيمة تشير إلى ما إذا كان هذا القارئ يستطيع تحليل الكيانات وحلها. |
| virtual [get_Depth](./get_depth/)() | عند تجاوزها في فئة مشتقة، تُعيد عمق العقدة الحالية في مستند XML. |
| virtual [get_EOF](./get_eof/)() | عند تجاوزها في فئة مشتقة، تُعيد قيمة تُشير إلى ما إذا كان القارئ في نهاية الدفق. |
| virtual [get_HasAttributes](./get_hasattributes/)() | يعيد قيمة تشير إلى ما إذا كانت العقدة الحالية تحتوي على أي سمات. |
| virtual [get_HasValue](./get_hasvalue/)() | عند تجاوزها في فئة مشتقة، تُعيد قيمة تُشير إلى ما إذا كان بإمكان العقدة الحالية الحصول على قيمة [XmlReader::get_Value](./get_value/). |
| virtual [get_IsDefault](./get_isdefault/)() | عند تجاوزها في فئة مشتقة، تُعيد قيمة تُشير إلى ما إذا كانت العقدة الحالية سمة تم إنشاؤها من القيمة الافتراضية المعرفة في DTD أو المخطط. |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | عند تجاوزها في فئة مشتقة، تُعيد قيمة تُشير إلى ما إذا كانت العقدة الحالية عنصرًا فارغًا (على سبيل المثال، **<MyElement/>**). |
| virtual [get_LocalName](./get_localname/)() | عند تجاوزها في فئة مشتقة، تُعيد الاسم المحلي للعقدة الحالية. |
| virtual [get_Name](./get_name/)() | عند تجاوزها في فئة مشتقة، تُعيد الاسم المؤهل للعقدة الحالية. |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | عند تجاوزها في فئة مشتقة، تُعيد عنوان URI للمساحة الاسمية (كما هو معرف في مواصفة مساحة الأسماء الخاصة بـ W3C) للعقدة التي يقع عليها القارئ. |
| virtual [get_NameTable](./get_nametable/)() | عند تجاوزها في فئة مشتقة، تحصل على [XmlNameTable](../xmlnametable/) المرتبطة بهذا التنفيذ. |
| virtual [get_NodeType](./get_nodetype/)() | عند تجاوزها في فئة مشتقة، تحصل على نوع العقدة الحالية. |
| virtual [get_Prefix](./get_prefix/)() | عند تجاوزها في فئة مشتقة، تحصل على بادئة مساحة الاسم المرتبطة بالعقدة الحالية. |
| virtual [get_QuoteChar](./get_quotechar/)() | عند تجاوزها في فئة مشتقة، تحصل على حرف علامة الاقتباس المستخدم لإحاطة قيمة عقدة السمة. |
| virtual [get_ReadState](./get_readstate/)() | عند تجاوزها في فئة مشتقة، تحصل على حالة القارئ. |
| virtual [get_SchemaInfo](./get_schemainfo/)() | يعيد معلومات المخطط التي تم تعيينها للعقدة الحالية نتيجةً للتحقق من صحة المخطط. |
| virtual [get_Settings](./get_settings/)() | يعيد كائن [XmlReaderSettings](../xmlreadersettings/) المستخدم لإنشاء هذه المثيلة من [XmlReader](./). |
| virtual [get_Value](./get_value/)() | عند تجاوزها في فئة مشتقة، تحصل على القيمة النصية للعقدة الحالية. |
| virtual [get_ValueType](./get_valuetype/)() | يعيد النوع للعقدة الحالية. |
| virtual [get_XmlLang](./get_xmllang/)() | عند تجاوزها في فئة مشتقة، تحصل على نطاق **xml:lang** الحالي. |
| virtual [get_XmlSpace](./get_xmlspace/)() | عند تجاوزها في فئة مشتقة، تحصل على نطاق **xml:space** الحالي. |
| virtual [GetAttribute](./getattribute/)(String) | عند تجاوزها في فئة مشتقة، تحصل على قيمة السمة ذات القيمة المحددة لـ [XmlReader::get_Name](./get_name/). |
| virtual [GetAttribute](./getattribute/)(String, String) | عند تجاوزها في فئة مشتقة، تحصل على قيمة السمة ذات القيم المحددة لـ [XmlReader::get_LocalName](./get_localname/) و [XmlReader::get_NamespaceURI](./get_namespaceuri/). |
| virtual [GetAttribute](./getattribute/)(int32_t) | عند تجاوزها في فئة مشتقة، تحصل على قيمة السمة ذات الفهرس المحدد. |
| virtual [idx_get](./idx_get/)(int32_t) | عند تجاوزها في فئة مشتقة، تحصل على قيمة السمة ذات الفهرس المحدد. |
| virtual [idx_get](./idx_get/)(String) | عند تجاوزها في فئة مشتقة، تحصل على قيمة السمة ذات القيمة المحددة لـ [XmlReader::get_Name](./get_name/). |
| virtual [idx_get](./idx_get/)(String, String) | عند تجاوزها في فئة مشتقة، تحصل على قيمة السمة ذات القيم المحددة لـ [XmlReader::get_LocalName](./get_localname/) و [XmlReader::get_NamespaceURI](./get_namespaceuri/). |
| static [IsName](./isname/)(const String\&) | يعيد قيمة تشير إلى ما إذا كان معامل السلسلة نصًا صالحًا كاسم XML. |
| static [IsNameToken](./isnametoken/)(const String\&) | يعيد قيمة تشير إلى ما إذا كان معامل السلسلة نصًا صالحًا كرمز اسم XML أم لا. |
| virtual [IsStartElement](./isstartelement/)() | ينادي [XmlReader::MoveToContent](./movetocontent/) ويختبر ما إذا كانت عقدة المحتوى الحالية علامة بدء أو علامة عنصر فارغ. |
| virtual [IsStartElement](./isstartelement/)(String) | ينادي [XmlReader::MoveToContent](./movetocontent/) ويختبر ما إذا كانت عقدة المحتوى الحالية علامة بدء أو علامة عنصر فارغ وما إذا كانت قيمة [XmlReader::get_Name](./get_name/) للعنصر الموجود تطابق الوسيط المعطى. |
| virtual [IsStartElement](./isstartelement/)(String, String) | ينادي [XmlReader::MoveToContent](./movetocontent/) ويختبر ما إذا كانت عقدة المحتوى الحالية علامة بدء أو علامة عنصر فارغ وما إذا كانت قيم [XmlReader::get_LocalName](./get_localname/) و [XmlReader::get_NamespaceURI](./get_namespaceuri/) للعنصر الموجود تطابق السلاسل المعطاة. |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | عند تجاوزها في فئة مشتقة، تحلّ بادئة مساحة الاسم في نطاق العنصر الحالي. |
| virtual [MoveToAttribute](./movetoattribute/)(String) | عند تجاوزها في فئة مشتقة، ينتقل إلى السمة ذات القيمة المحددة لـ [XmlReader::get_Name](./get_name/). |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | عند تجاوزها في فئة مشتقة، ينتقل إلى السمة ذات القيم المحددة لـ [XmlReader::get_LocalName](./get_localname/) و [XmlReader::get_NamespaceURI](./get_namespaceuri/). |
| virtual [MoveToAttribute](./movetoattribute/)(int32_t) | عند تجاوزها في فئة مشتقة، ينتقل إلى السمة ذات الفهرس المحدد. |
| virtual [MoveToContent](./movetocontent/)() | يتحقق مما إذا كانت العقدة الحالية عقدة محتوى (نص غير مساحة بيضاء، **CDATA**, **Element**, **EndElement**, **EntityReference**, أو **EndEntity**). إذا لم تكن العقدة عقدة محتوى، يتخطى القارئ إلى العقدة المحتوى التالية أو إلى نهاية الملف. يتخطى العقد من الأنواع التالية: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace**, أو **SignificantWhitespace**. |
| virtual [MoveToElement](./movetoelement/)() | عند تجاوزها في فئة مشتقة، ينتقل إلى العنصر الذي يحتوي على عقدة السمة الحالية. |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | عند تجاوزها في فئة مشتقة، تنتقل إلى السمة الأولى. |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | عند تجاوزها في فئة مشتقة، تنتقل إلى السمة التالية. |
| virtual [Read](./read/)() | عند تجاوزها في فئة مشتقة، تقرأ العقدة التالية من الدفق. |
| virtual [ReadAttributeValue](./readattributevalue/)() | عند تجاوزها في فئة مشتقة، تحلل قيمة السمة إلى واحد أو أكثر من عقد **[Text](../../system.text/)**، **EntityReference**، أو **EndEntity**. |
| virtual [ReadContentAs](./readcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | يقرأ المحتوى ككائن من النوع المحدد. |
| virtual [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | يقرأ المحتوى ويعيد بايتات ثنائية مُفكّكة من Base64. |
| virtual [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | يقرأ المحتوى ويرجع البايتات الثنائية المفكوكة من **BinHex**. |
| virtual [ReadContentAsBoolean](./readcontentasboolean/)() | يقرأ محتوى النص في الموضع الحالي كـ [Boolean](../../system/boolean/). |
| virtual [ReadContentAsDateTime](./readcontentasdatetime/)() | يقرأ محتوى النص في الموضع الحالي ككائن [DateTime](../../system/datetime/). |
| virtual [ReadContentAsDateTimeOffset](./readcontentasdatetimeoffset/)() | يقرأ محتوى النص في الموضع الحالي ككائن [DateTimeOffset](../../system/datetimeoffset/). |
| virtual [ReadContentAsDecimal](./readcontentasdecimal/)() | يقرأ محتوى النص في الموضع الحالي ككائن [Decimal](../../system/decimal/). |
| virtual [ReadContentAsDouble](./readcontentasdouble/)() | يقرأ محتوى النص في الموضع الحالي كعدد عائم مزدوج الدقة. |
| virtual [ReadContentAsFloat](./readcontentasfloat/)() | يقرأ محتوى النص في الموضع الحالي كعدد عائم أحادي الدقة. |
| virtual [ReadContentAsInt](./readcontentasint/)() | يقرأ محتوى النص في الموضع الحالي كعدد صحيح موقّع 32‑بت. |
| virtual [ReadContentAsLong](./readcontentaslong/)() | يقرأ محتوى النص في الموضع الحالي كعدد صحيح موقّع 64‑بت. |
| virtual [ReadContentAsObject](./readcontentasobject/)() | يقرأ محتوى النص في الموضع الحالي كـ [Object](../../system/object/). |
| virtual [ReadContentAsString](./readcontentasstring/)() | يقرأ محتوى النص في الموضع الحالي ككائن [String](../../system/string/). |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | يقرأ محتوى العنصر كالنوع المطلوب. |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) | يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ محتوى العنصر كالنوع المطلوب. |
| virtual [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | يقرأ العنصر ويفكّ تشفير محتوى **Base64**. |
| virtual [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | يقرأ العنصر ويفكّ تشفير محتوى **BinHex**. |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)() | يقرأ العنصر الحالي ويعيد المحتويات ككائن [Boolean](../../system/boolean/). |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)(String, String) | يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ العنصر الحالي ويعيد المحتويات ككائن [Boolean](../../system/boolean/). |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)() | يقرأ العنصر الحالي ويعيد المحتويات ككائن [DateTime](../../system/datetime/). |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)(String, String) | يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ العنصر الحالي ويعيد المحتويات ككائن [DateTime](../../system/datetime/). |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)() | يقرأ العنصر الحالي ويعيد المحتويات ككائن [Decimal](../../system/decimal/). |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)(String, String) | يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ العنصر الحالي ويعيد المحتويات ككائن [Decimal](../../system/decimal/). |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)() | يقرأ العنصر الحالي ويعيد المحتويات كعدد عائم مزدوج الدقة. |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)(String, String) | يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ العنصر الحالي ويعيد المحتوى كعدد عائم بدقة مزدوجة. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)() | يقرأ العنصر الحالي ويعيد المحتوى كعدد عائم بدقة مفردة. |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)(String, String) | يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ العنصر الحالي ويعيد المحتوى كعدد عائم بدقة مفردة. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)() | يقرأ العنصر الحالي ويعيد المحتوى كعدد صحيح موقع 32‑بت. |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)(String, String) | يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ العنصر الحالي ويعيد المحتوى كعدد صحيح موقع 32‑بت. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)() | يقرأ العنصر الحالي ويعيد المحتوى كعدد صحيح موقع 64‑بت. |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)(String, String) | يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ العنصر الحالي ويعيد المحتوى كعدد صحيح موقع 64‑بت. |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)() | يقرأ العنصر الحالي ويعيد المحتوى كـ [Object](../../system/object/). |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)(String, String) | يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ العنصر الحالي ويعيد المحتوى كـ [Object](../../system/object/). |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)() | يقرأ العنصر الحالي ويعيد المحتوى ككائن [String](../../system/string/). |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)(String, String) | يتحقق من أن الاسم المحلي المحدد ومسار URI للمساحة الاسمية يطابقان العنصر الحالي، ثم يقرأ العنصر الحالي ويعيد المحتوى ككائن [String](../../system/string/). |
| virtual [ReadElementString](./readelementstring/)() | يقرأ عنصرًا نصيًا فقط. ومع ذلك، يُنصح باستخدام طريقة [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) بدلاً من ذلك، لأنها توفر طريقة أكثر بساطة للتعامل مع هذه العملية. |
| virtual [ReadElementString](./readelementstring/)(String) | يتحقق من أن قيمة [XmlReader::get_Name](./get_name/) للعنصر الموجود تطابق السلسلة المعطاة قبل قراءة عنصر نصي فقط. ومع ذلك، يُنصح باستخدام طريقة [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) بدلاً من ذلك، لأنها توفر طريقة أكثر بساطة للتعامل مع هذه العملية. |
| virtual [ReadElementString](./readelementstring/)(String, String) | يتحقق من أن قيمتي [XmlReader::get_LocalName](./get_localname/) و[XmlReader::get_NamespaceURI](./get_namespaceuri/) للعنصر الموجود تطابق السلاسل المعطاة قبل قراءة عنصر نصي فقط. ومع ذلك، يُنصح باستخدام طريقة [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) بدلاً من ذلك، لأنها توفر طريقة أكثر بساطة للتعامل مع هذه العملية. |
| virtual [ReadEndElement](./readendelement/)() | يتحقق من أن عقدة المحتوى الحالية هي علامة إغلاق ويُقدِّم القارئ إلى العقدة التالية. |
| virtual [ReadInnerXml](./readinnerxml/)() | عند تجاوزها في فئة مشتقة، تقرأ كل المحتوى، بما في ذلك العلامات، كسلسلة نصية. |
| virtual [ReadOuterXml](./readouterxml/)() | عند تجاوزها في فئة مشتقة، تقرأ المحتوى، بما في ذلك العلامات، التي تمثل هذه العقدة وجميع أبنائها. |
| virtual [ReadStartElement](./readstartelement/)() | يتحقق من أن العقدة الحالية عنصر ويُقدِّم القارئ إلى العقدة التالية. |
| virtual [ReadStartElement](./readstartelement/)(String) | يتحقق من أن عقدة المحتوى الحالية عنصر يحمل القيمة [XmlReader::get_Name](./get_name/) المعطاة ويُقدِّم القارئ إلى العقدة التالية. |
| virtual [ReadStartElement](./readstartelement/)(String, String) | يتحقق من أن عقدة المحتوى الحالية عنصر يحمل القيمتين [XmlReader::get_LocalName](./get_localname/) و[XmlReader::get_NamespaceURI](./get_namespaceuri/) المعطاة ويُقدِّم القارئ إلى العقدة التالية. |
| virtual [ReadString](./readstring/)() | عند تجاوزها في فئة مشتقة، تقرأ محتويات عنصر أو عقدة نصية كسلسلة نصية. ومع ذلك، يُنصح باستخدام طريقة [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) بدلاً من ذلك، لأنها توفر طريقة أكثر بساطة للتعامل مع هذه العملية. |
| virtual [ReadSubtree](./readsubtree/)() | يعيد نسخة جديدة من [XmlReader](./) يمكن استخدامها لقراءة العقدة الحالية وجميع فروعها. |
| virtual [ReadToDescendant](./readtodescendant/)(String) | يُقدِّم [XmlReader](./) إلى العنصر السليل التالي الذي يحمل الاسم المؤهل المحدد. |
| virtual [ReadToDescendant](./readtodescendant/)(String, String) | يُقدِّم [XmlReader](./) إلى العنصر السليل التالي الذي يحمل الاسم المحلي ومسار URI للمساحة الاسمية المحددين. |
| virtual [ReadToFollowing](./readtofollowing/)(String) | يقرأ حتى يتم العثور على عنصر يحمل الاسم المؤهل المحدد. |
| virtual [ReadToFollowing](./readtofollowing/)(String, String) | يقرأ حتى يتم العثور على عنصر بالاسم المحلي المحدد ومسار مساحة الاسم URI. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String) | يتقدم بـ [XmlReader](./) إلى العنصر الشقيق التالي بالاسم المؤهل المحدد. |
| virtual [ReadToNextSibling](./readtonextsibling/)(String, String) | يتقدم بـ [XmlReader](./) إلى العنصر الشقيق التالي بالاسم المحلي المحدد ومسار مساحة الاسم URI. |
| virtual [ReadValueChunk](./readvaluechunk/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | يقرأ تدفقات نصية كبيرة مدمجة في مستند XML. |
| virtual [ResolveEntity](./resolveentity/)() | عند تجاوزها في فئة مشتقة، تحل إشارة الكيان لعقد **EntityReference**. |
| virtual [Skip](./skip/)() | يتخطى أبناء العقدة الحالية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى مثيل من هذه الفئة. |
## انظر أيضًا

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
