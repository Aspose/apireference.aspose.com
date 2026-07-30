---
title: "الفئة System::Xml::XmlTextReader"
linktitle: "XmlTextReader"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Xml::XmlTextReader. تمثّل قارئًا يوفر وصولًا سريعًا غير مخزن وموجهًا للأمام إلى بيانات XML في C++."
type: docs
weight: 3900
url: /ar/cpp/system.xml/xmltextreader/
---
## XmlTextReader class


يمثل قارئًا يوفر وصولًا سريعًا غير مخزن مؤقتًا إلى بيانات XML باتجاه أمامي فقط.

```cpp
class XmlTextReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlLineInfo,
                      public System::Xml::IXmlNamespaceResolver
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Close](./close/)() override | يغيّر الـ[XmlReader::get_ReadState](../xmlreader/get_readstate/) إلى **Closed**. |
| [get_AttributeCount](./get_attributecount/)() override | يعيد عدد السمات في العقدة الحالية. |
| [get_BaseURI](./get_baseuri/)() override | يعيد عنوان URI الأساسي للعقدة الحالية. |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | يعيد قيمة تشير إلى ما إذا كان الـ[XmlTextReader](./) يطبق طرق قراءة المحتوى الثنائي. |
| [get_CanReadValueChunk](./get_canreadvaluechunk/)() override | يعيد قيمة تشير إلى ما إذا كان الـ[XmlTextReader](./) يطبق طريقة [XmlReader::ReadValueChunk](../xmlreader/readvaluechunk/). |
| [get_CanResolveEntity](./get_canresolveentity/)() override | يعيد قيمة تشير إلى ما إذا كان هذا القارئ يستطيع تحليل الكيانات وحلها. |
| [get_Depth](./get_depth/)() override | يعيد عمق العقدة الحالية في مستند XML. |
| [get_DtdProcessing](./get_dtdprocessing/)() | يعيد تعداد [DtdProcessing](../dtdprocessing/). |
| [get_Encoding](./get_encoding/)() | يعيد ترميز المستند. |
| [get_EntityHandling](./get_entityhandling/)() | يعيد قيمة تحدد كيفية معالجة القارئ للكيانات. |
| [get_EOF](./get_eof/)() override | يعيد قيمة تشير إلى ما إذا كان القارئ في نهاية الدفق. |
| [get_HasValue](./get_hasvalue/)() override | يعيد قيمة تشير إلى ما إذا كان العقدة الحالية يمكن أن تحتوي على [XmlTextReader::get_Value](./get_value/) غير [String::Empty](../../system/string/empty/). |
| [get_IsDefault](./get_isdefault/)() override | يعيد قيمة تشير إلى ما إذا كانت العقدة الحالية سمة تم توليدها من القيمة الافتراضية المعرفة في DTD أو المخطط. |
| [get_IsEmptyElement](./get_isemptyelement/)() override | يعيد قيمة تشير إلى ما إذا كانت العقدة الحالية عنصرًا فارغًا (على سبيل المثال، **<MyElement/>**). |
| [get_LineNumber](./get_linenumber/)() override | يعيد رقم السطر الحالي. |
| [get_LinePosition](./get_lineposition/)() override | يعيد موضع السطر الحالي. |
| [get_LocalName](./get_localname/)() override | يعيد الاسم المحلي للعقدة الحالية. |
| [get_Name](./get_name/)() override | يعيد الاسم المؤهل للعقدة الحالية. |
| [get_Namespaces](./get_namespaces/)() | يعيد قيمة تشير إلى ما إذا كان يجب دعم النطاقات. |
| [get_NamespaceURI](./get_namespaceuri/)() override | يعيد عنوان URI للمساحة الاسمية (كما هو معرف في مواصفة مساحة الأسماء W3C) للعقدة التي يقع عليها القارئ. |
| [get_NameTable](./get_nametable/)() override | يعيد [XmlNameTable](../xmlnametable/) المرتبط بهذا التنفيذ. |
| [get_NodeType](./get_nodetype/)() override | يعيد نوع العقدة الحالية. |
| [get_Normalization](./get_normalization/)() | يعيد قيمة تشير إلى ما إذا كان يجب تطبيع المسافات البيضاء وقيم السمات. |
| [get_Prefix](./get_prefix/)() override | يعيد بادئة مساحة الاسم المرتبطة بالعقدة الحالية. |
| [get_ProhibitDtd](./get_prohibitdtd/)() | يعيد قيمة تشير إلى ما إذا كان يجب السماح بمعالجة DTD. |
| [get_QuoteChar](./get_quotechar/)() override | يعيد حرف علامة الاقتباس المستخدم لإحاطة قيمة عقدة السمة. |
| [get_ReadState](./get_readstate/)() override | يعيد حالة القارئ. |
| [get_Value](./get_value/)() override | يعيد القيمة النصية للعقدة الحالية. |
| [get_WhitespaceHandling](./get_whitespacehandling/)() | يعيد قيمة تحدد كيفية معالجة المسافات البيضاء. |
| [get_XmlLang](./get_xmllang/)() override | يعيد نطاق **xml:lang** الحالي. |
| [get_XmlSpace](./get_xmlspace/)() override | يعيد نطاق **xml:space** الحالي. |
| [GetAttribute](./getattribute/)(String) override | يعيد قيمة السمة ذات الاسم المحدد. |
| [GetAttribute](./getattribute/)(String, String) override | يعيد قيمة السمة ذات الاسم المحلي المحدد ومسار URI مساحة الاسم. |
| [GetAttribute](./getattribute/)(int32_t) override | يعيد قيمة السمة ذات الفهرس المحدد. |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | يرجع مجموعة تحتوي على جميع المساحات الاسمية الحالية في النطاق. |
| [GetRemainder](./getremainder/)() | يرجع المتبقي من XML المخزن في الذاكرة المؤقتة. |
| [HasLineInfo](./haslineinfo/)() override | يرجع قيمة تشير إلى ما إذا كانت الفئة يمكنها إرجاع معلومات السطر. |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | يحلّ صفة مساحة الاسم في نطاق العنصر الحالي. |
| [MoveToAttribute](./movetoattribute/)(String) override | ينتقل إلى السمة ذات الاسم المحدد. |
| [MoveToAttribute](./movetoattribute/)(String, String) override | ينتقل إلى السمة ذات الاسم المحلي المحدد ومسار URI مساحة الاسم. |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | ينتقل إلى السمة ذات الفهرس المحدد. |
| [MoveToElement](./movetoelement/)() override | ينتقل إلى العنصر الذي يحتوي على عقدة السمة الحالية. |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | ينتقل إلى السمة الأولى. |
| [MoveToNextAttribute](./movetonextattribute/)() override | ينتقل إلى السمة التالية. |
| [Read](./read/)() override | يقرأ العقدة التالية من التدفق. |
| [ReadAttributeValue](./readattributevalue/)() override | يقوم بتحليل قيمة السمة إلى واحد أو أكثر من العقد **[Text](../../system.text/)**، **EntityReference** أو **EndEntity**. |
| [ReadBase64](./readbase64/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | يفك تشفير Base64 ويُرجع البايتات الثنائية المفكوكة. |
| [ReadBinHex](./readbinhex/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | يفك تشفير **BinHex** ويُرجع البايتات الثنائية المفكوكة. |
| [ReadChars](./readchars/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) | يقرأ محتوى النص لعنصر إلى مخزن أحرف. تم تصميم هذه الطريقة لقراءة تدفقات نصية مدمجة كبيرة عن طريق استدعائها بشكل متتابع. |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | يقرأ المحتوى ويُرجع البايتات الثنائية المفكوكة من **Base64**. |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | يقرأ المحتوى ويُرجع البايتات الثنائية المفكوكة من **BinHex**. |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | يقرأ العنصر ويفكّ تشفير محتوى Base64. |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | يقرأ العنصر ويفك تشفير محتوى **BinHex**. |
| [ReadString](./readstring/)() override | يقرأ محتويات عنصر أو عقدة نصية كسلسلة. |
| [ResetState](./resetstate/)() | يعيد ضبط حالة القارئ إلى [ReadState::Initial](../readstate/). |
| [ResolveEntity](./resolveentity/)() override | يحلّ مرجع الكيان لعقد **EntityReference**. |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | يضبط تعداد [DtdProcessing](../dtdprocessing/). |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | يضبط قيمة تحدد كيفية تعامل القارئ مع الكيانات. |
| [set_Namespaces](./set_namespaces/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب دعم النطاقات. |
| [set_Normalization](./set_normalization/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب تطبيع الفراغات وقيم السمات. |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | يضبط قيمة تشير إلى ما إذا كان يجب السماح بمعالجة DTD. |
| [set_WhitespaceHandling](./set_whitespacehandling/)(System::Xml::WhitespaceHandling) | يضبط قيمة تحدد كيفية معالجة الفراغات. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | يضبط الـ [XmlResolver](../xmlresolver/) المستخدم لحل مراجع DTD. |
| [Skip](./skip/)() override | يتخطى أبناء العقدة الحالية. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&) | يُهيئ نسخة جديدة من الفئة [XmlTextReader](./) باستخدام الدفق المحدد. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&) | يُهيئ نسخة جديدة من الفئة [XmlTextReader](./) باستخدام عنوان URL المحدد والدفق. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | يُهيئ نسخة جديدة من الفئة [XmlTextReader](./) باستخدام الدفق المحدد و[XmlNameTable](../xmlnametable/). |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | يُهيئ نسخة جديدة من الفئة [XmlTextReader](./) باستخدام عنوان URL المحدد، الدفق و[XmlNameTable](../xmlnametable/). |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&) | يُهيئ نسخة جديدة من الفئة [XmlTextReader](./) باستخدام الـ TextReader المحدد. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&) | يُهيئ نسخة جديدة من الفئة [XmlTextReader](./) باستخدام عنوان URL والـ TextReader المحدد. |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | يُهيئ نسخة جديدة من الفئة [XmlTextReader](./) باستخدام الـ TextReader المحدد و[XmlNameTable](../xmlnametable/). |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | يُهيئ نسخة جديدة من الفئة [XmlTextReader](./) باستخدام عنوان URL والـ TextReader و[XmlNameTable](../xmlnametable/). |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | يُنشئ مثيلاً جديدًا من فئة [XmlTextReader](./) باستخدام الدفق المحدد، و[XmlNodeType](../xmlnodetype/)، و[XmlParserContext](../xmlparsercontext/). |
| [XmlTextReader](./xmltextreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | يُنشئ مثيلاً جديدًا من فئة [XmlTextReader](./) باستخدام السلسلة المحددة، و[XmlNodeType](../xmlnodetype/)، و[XmlParserContext](../xmlparsercontext/). |
| [XmlTextReader](./xmltextreader/)(const String\&) | يُنشئ مثيلاً جديدًا من فئة [XmlTextReader](./) باستخدام الملف المحدد. |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<XmlNameTable\>\&) | يُنشئ مثيلاً جديدًا من فئة [XmlTextReader](./) باستخدام الملف المحدد و[XmlNameTable](../xmlnametable/). |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | اسم مستعار لمؤشر مشترك إلى نسخة من هذه الفئة. |
## ملاحظات



يوصى باستخدام فئة [XmlReader](../xmlreader/) بدلاً من ذلك.

يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخ من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. قم دائمًا بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

## انظر أيضًا

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
