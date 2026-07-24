---
title: "System::Xml::XmlReader क्लास"
linktitle: "XmlReader"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlReader क्लास। C++ में XML डेटा तक तेज, गैर-कैश्ड, केवल-फ़ॉरवर्ड एक्सेस प्रदान करने वाला रीडर दर्शाता है।"
type: docs
weight: 3300
url: /hi/cpp/system.xml/xmlreader/
---
## XmlReader class


XML डेटा तक तेज, गैर‑कैश्ड, केवल‑आगे की पहुँच प्रदान करने वाला रीडर दर्शाता है।

```cpp
class XmlReader : public System::IDisposable
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| virtual [Close](./close/)() | जब किसी व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो [XmlReader::get_ReadState](./get_readstate/) को [ReadState::Closed](../readstate/) में बदल देता है। |
| static [Create](./create/)(const String\&) | निर्दिष्ट URI के साथ एक नया [XmlReader](./) इंस्टेंस बनाता है। |
| static [Create](./create/)(const String\&, const SharedPtr\<XmlReaderSettings\>\&) | निर्दिष्ट URI और सेटिंग्स का उपयोग करके एक नया [XmlReader](./) इंस्टेंस बनाता है। |
| static [Create](./create/)(const String\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | निर्दिष्ट URI, सेटिंग्स और पार्सिंग के लिए संदर्भ जानकारी का उपयोग करके एक नया [XmlReader](./) इंस्टेंस बनाता है। |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&) | निर्दिष्ट स्ट्रीम को डिफ़ॉल्ट सेटिंग्स के साथ उपयोग करके एक नया [XmlReader](./) इंस्टेंस बनाता है। |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlReaderSettings\>\&) | निर्दिष्ट स्ट्रीम और सेटिंग्स के साथ एक नया [XmlReader](./) इंस्टेंस बनाता है। |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | निर्दिष्ट स्ट्रीम, बेस URI और सेटिंग्स का उपयोग करके एक नया [XmlReader](./) इंस्टेंस बनाता है। |
| static [Create](./create/)(const SharedPtr\<IO::Stream\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | निर्दिष्ट स्ट्रीम, सेटिंग्स और पार्सिंग के लिए संदर्भ जानकारी का उपयोग करके एक नया [XmlReader](./) इंस्टेंस बनाता है। |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&) | निर्दिष्ट टेक्स्ट रीडर का उपयोग करके एक नया [XmlReader](./) इंस्टेंस बनाता है। |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlReaderSettings\>\&) | निर्दिष्ट टेक्स्ट रीडर और सेटिंग्स का उपयोग करके एक नया [XmlReader](./) इंस्टेंस बनाता है। |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const String\&) | निर्दिष्ट टेक्स्ट रीडर, सेटिंग्स और बेस URI का उपयोग करके एक नया [XmlReader](./) इंस्टेंस बनाता है। |
| static [Create](./create/)(const SharedPtr\<IO::TextReader\>\&, SharedPtr\<XmlReaderSettings\>, const SharedPtr\<XmlParserContext\>\&) | निर्दिष्ट टेक्स्ट रीडर, सेटिंग्स और पार्सिंग के लिए संदर्भ जानकारी का उपयोग करके एक नया [XmlReader](./) इंस्टेंस बनाता है। |
| static [Create](./create/)(const SharedPtr\<XmlReader\>\&, SharedPtr\<XmlReaderSettings\>) | निर्दिष्ट XML रीडर और सेटिंग्स का उपयोग करके एक नया [XmlReader](./) इंस्टेंस बनाता है। |
| [Dispose](./dispose/)() override | वर्तमान [XmlReader](./) क्लास के इंस्टेंस द्वारा उपयोग किए गए सभी संसाधनों को मुक्त करता है। |
| virtual [get_AttributeCount](./get_attributecount/)() | जब डेराइव्ड क्लास में ओवरराइड किया जाता है, तो वर्तमान नोड पर एट्रिब्यूट्स की संख्या प्राप्त करता है। |
| virtual [get_BaseURI](./get_baseuri/)() | जब डेराइव्ड क्लास में ओवरराइड किया जाता है, तो वर्तमान नोड का बेस URI प्राप्त करता है। |
| virtual [get_CanReadBinaryContent](./get_canreadbinarycontent/)() | एक मान लौटाता है जो दर्शाता है कि क्या [XmlReader](./) बाइनरी कंटेंट रीड मेथड्स को लागू करता है। |
| virtual [get_CanReadValueChunk](./get_canreadvaluechunk/)() | एक मान लौटाता है जो दर्शाता है कि क्या [XmlReader](./) [XmlReader::ReadValueChunk](./readvaluechunk/) मेथड को लागू करता है। |
| virtual [get_CanResolveEntity](./get_canresolveentity/)() | यह दर्शाने वाला मान लौटाता है कि यह रीडर एंटिटीज़ को पार्स और रिजॉल्व कर सकता है या नहीं। |
| virtual [get_Depth](./get_depth/)() | जब डेराइव्ड क्लास में ओवरराइड किया जाता है, तो XML दस्तावेज़ में वर्तमान नोड की गहराई प्राप्त करता है। |
| virtual [get_EOF](./get_eof/)() | जब डेराइव्ड क्लास में ओवरराइड किया जाता है, तो यह दर्शाता है कि रीडर स्ट्रीम के अंत में स्थित है या नहीं, इसका मान प्राप्त करता है। |
| virtual [get_HasAttributes](./get_hasattributes/)() | वापस देता है एक मान जो दर्शाता है कि वर्तमान नोड के कोई गुण हैं या नहीं। |
| virtual [get_HasValue](./get_hasvalue/)() | जब डेराइव्ड क्लास में ओवरराइड किया जाता है, तो यह दर्शाता है कि क्या वर्तमान नोड में [XmlReader::get_Value](./get_value/) मान हो सकता है, इसका मान प्राप्त करता है। |
| virtual [get_IsDefault](./get_isdefault/)() | जब डेराइव्ड क्लास में ओवरराइड किया जाता है, तो यह दर्शाता है कि क्या वर्तमान नोड वह एट्रिब्यूट है जो DTD या स्कीमा में परिभाषित डिफ़ॉल्ट मान से उत्पन्न हुआ है, इसका मान प्राप्त करता है। |
| virtual [get_IsEmptyElement](./get_isemptyelement/)() | जब डेराइव्ड क्लास में ओवरराइड किया जाता है, तो यह दर्शाता है कि क्या वर्तमान नोड एक खाली एलिमेंट है (उदाहरण के लिए, **<MyElement/>**), इसका मान प्राप्त करता है। |
| virtual [get_LocalName](./get_localname/)() | जब डेराइव्ड क्लास में ओवरराइड किया जाता है, तो वर्तमान नोड का लोकल नाम प्राप्त करता है। |
| virtual [get_Name](./get_name/)() | जब डेराइव्ड क्लास में ओवरराइड किया जाता है, तो वर्तमान नोड का क्वालिफाइड नाम प्राप्त करता है। |
| virtual [get_NamespaceURI](./get_namespaceuri/)() | जब डेराइव्ड क्लास में ओवरराइड किया जाता है, तो उस नोड का नेमस्पेस URI (W3C नेमस्पेस स्पेसिफिकेशन में परिभाषित अनुसार) प्राप्त करता है, जिस पर रीडर स्थित है। |
| virtual [get_NameTable](./get_nametable/)() | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो इस कार्यान्वयन से जुड़ी [XmlNameTable](../xmlnametable/) प्राप्त करता है। |
| virtual [get_NodeType](./get_nodetype/)() | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो वर्तमान नोड का प्रकार प्राप्त करता है। |
| virtual [get_Prefix](./get_prefix/)() | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो वर्तमान नोड से जुड़ा नेमस्पेस उपसर्ग प्राप्त करता है। |
| virtual [get_QuoteChar](./get_quotechar/)() | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो एक गुण नोड के मान को घेरने के लिए प्रयुक्त उद्धरण चिह्न अक्षर प्राप्त करता है। |
| virtual [get_ReadState](./get_readstate/)() | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो रीडर की स्थिति प्राप्त करता है। |
| virtual [get_SchemaInfo](./get_schemainfo/)() | वर्तमान नोड को स्कीमा वैधता के परिणामस्वरूप सौंपा गया स्कीमा जानकारी लौटाता है। |
| virtual [get_Settings](./get_settings/)() | इस [XmlReader](./) उदाहरण को बनाने के लिए प्रयुक्त [XmlReaderSettings](../xmlreadersettings/) ऑब्जेक्ट लौटाता है। |
| virtual [get_Value](./get_value/)() | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो वर्तमान नोड का पाठ मान प्राप्त करता है। |
| virtual [get_ValueType](./get_valuetype/)() | वर्तमान नोड के प्रकार को लौटाता है। |
| virtual [get_XmlLang](./get_xmllang/)() | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो वर्तमान **xml:lang** स्कोप प्राप्त करता है। |
| virtual [get_XmlSpace](./get_xmlspace/)() | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो वर्तमान **xml:space** स्कोप प्राप्त करता है। |
| virtual [GetAttribute](./getattribute/)(String) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट [XmlReader::get_Name](./get_name/) मान वाले गुण का मान प्राप्त करता है। |
| virtual [GetAttribute](./getattribute/)(String, String) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट [XmlReader::get_LocalName](./get_localname/) और [XmlReader::get_NamespaceURI](./get_namespaceuri/) मानों वाले गुण का मान प्राप्त करता है। |
| virtual [GetAttribute](./getattribute/)(int32_t) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट अनुक्रमांक वाले गुण का मान प्राप्त करता है। |
| virtual [idx_get](./idx_get/)(int32_t) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट अनुक्रमांक वाले गुण का मान प्राप्त करता है। |
| virtual [idx_get](./idx_get/)(String) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट [XmlReader::get_Name](./get_name/) मान वाले गुण का मान प्राप्त करता है। |
| virtual [idx_get](./idx_get/)(String, String) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट [XmlReader::get_LocalName](./get_localname/) और [XmlReader::get_NamespaceURI](./get_namespaceuri/) मानों वाले गुण का मान प्राप्त करता है। |
| static [IsName](./isname/)(const String\&) | एक मान लौटाता है जो दर्शाता है कि स्ट्रिंग तर्क एक वैध XML नाम है या नहीं। |
| static [IsNameToken](./isnametoken/)(const String\&) | एक मान लौटाता है जो दर्शाता है कि स्ट्रिंग तर्क एक वैध XML नाम टोकन है या नहीं। |
| virtual [IsStartElement](./isstartelement/)() | [XmlReader::MoveToContent](./movetocontent/) को कॉल करता है और जांचता है कि वर्तमान कंटेंट नोड एक प्रारंभ टैग है या खाली तत्व टैग। |
| virtual [IsStartElement](./isstartelement/)(String) | [XmlReader::MoveToContent](./movetocontent/) को कॉल करता है और जांचता है कि वर्तमान कंटेंट नोड एक प्रारंभ टैग है या खाली तत्व टैग, और पाए गए तत्व का [XmlReader::get_Name](./get_name/) मान दिए गए तर्क से मेल खाता है या नहीं। |
| virtual [IsStartElement](./isstartelement/)(String, String) | [XmlReader::MoveToContent](./movetocontent/) को कॉल करता है और जांचता है कि वर्तमान कंटेंट नोड एक प्रारंभ टैग है या खाली तत्व टैग, और पाए गए तत्व के [XmlReader::get_LocalName](./get_localname/) और [XmlReader::get_NamespaceURI](./get_namespaceuri/) मान दिए गए स्ट्रिंग्स से मेल खाते हैं या नहीं। |
| virtual [LookupNamespace](./lookupnamespace/)(const String\&) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो वर्तमान तत्व के स्कोप में नेमस्पेस उपसर्ग को हल करता है। |
| virtual [MoveToAttribute](./movetoattribute/)(String) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट [XmlReader::get_Name](./get_name/) मान वाले गुण पर जाता है। |
| virtual [MoveToAttribute](./movetoattribute/)(String, String) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट [XmlReader::get_LocalName](./get_localname/) और [XmlReader::get_NamespaceURI](./get_namespaceuri/) मानों वाले गुण पर जाता है। |
| virtual [MoveToAttribute](./movetoattribute/)(int32_t) | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो निर्दिष्ट अनुक्रमांक वाले गुण पर जाता है। |
| virtual [MoveToContent](./movetocontent/)() | जाँचता है कि वर्तमान नोड एक कंटेंट (गैर-खाली स्थान पाठ, **CDATA**, **Element**, **EndElement**, **EntityReference**, या **EndEntity**) नोड है या नहीं। यदि नोड कंटेंट नोड नहीं है, तो रीडर अगले कंटेंट नोड या फ़ाइल के अंत तक आगे बढ़ जाता है। यह निम्न प्रकार के नोड्स को छोड़ देता है: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace**, या **SignificantWhitespace**। |
| virtual [MoveToElement](./movetoelement/)() | जब एक व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो वर्तमान गुण नोड को सम्मिलित करने वाले तत्व पर जाता है। |
| virtual [MoveToFirstAttribute](./movetofirstattribute/)() | जब व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो पहले गुण पर जाता है। |
| virtual [MoveToNextAttribute](./movetonextattribute/)() | जब व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो अगले गुण पर जाता है। |
| virtual [Read](./read/)() | जब व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो स्ट्रीम से अगला नोड पढ़ता है। |
| virtual [ReadAttributeValue](./readattributevalue/)() | जब व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो गुण मान को एक या अधिक **[Text](../../system.text/)**, **EntityReference**, या **EndEntity** नोड्स में पार्स करता है। |
| virtual [ReadContentAs](./readcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | निर्दिष्ट प्रकार की वस्तु के रूप में सामग्री पढ़ता है। |
| virtual [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | सामग्री को पढ़ता है और Base64 डिकोड किए गए बाइनरी बाइट्स लौटाता है। |
| virtual [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | सामग्री पढ़ता है और **BinHex** डिकोड किए गए बाइनरी बाइट्स लौटाता है। |
| virtual [ReadContentAsBoolean](./readcontentasboolean/)() | वर्तमान स्थिति पर पाठ सामग्री को एक [Boolean](../../system/boolean/) के रूप में पढ़ता है। |
| virtual [ReadContentAsDateTime](./readcontentasdatetime/)() | वर्तमान स्थिति पर पाठ सामग्री को एक [DateTime](../../system/datetime/) वस्तु के रूप में पढ़ता है। |
| virtual [ReadContentAsDateTimeOffset](./readcontentasdatetimeoffset/)() | वर्तमान स्थिति पर पाठ सामग्री को एक [DateTimeOffset](../../system/datetimeoffset/) वस्तु के रूप में पढ़ता है। |
| virtual [ReadContentAsDecimal](./readcontentasdecimal/)() | वर्तमान स्थिति पर पाठ सामग्री को एक [Decimal](../../system/decimal/) वस्तु के रूप में पढ़ता है। |
| virtual [ReadContentAsDouble](./readcontentasdouble/)() | वर्तमान स्थिति पर पाठ सामग्री को दोहरी-प्रेसिशन फ्लोटिंग-पॉइंट संख्या के रूप में पढ़ता है। |
| virtual [ReadContentAsFloat](./readcontentasfloat/)() | वर्तमान स्थिति पर पाठ सामग्री को एकल-प्रेसिशन फ्लोटिंग पॉइंट संख्या के रूप में पढ़ता है। |
| virtual [ReadContentAsInt](./readcontentasint/)() | वर्तमान स्थिति पर पाठ सामग्री को 32-बिट साइन्ड इंटीजर के रूप में पढ़ता है। |
| virtual [ReadContentAsLong](./readcontentaslong/)() | वर्तमान स्थिति पर पाठ सामग्री को 64-बिट साइन्ड इंटीजर के रूप में पढ़ता है। |
| virtual [ReadContentAsObject](./readcontentasobject/)() | वर्तमान स्थिति पर पाठ सामग्री को एक [Object](../../system/object/) के रूप में पढ़ता है। |
| virtual [ReadContentAsString](./readcontentasstring/)() | वर्तमान स्थिति पर पाठ सामग्री को एक [String](../../system/string/) वस्तु के रूप में पढ़ता है। |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>) | तत्व सामग्री को अनुरोधित प्रकार के रूप में पढ़ता है। |
| virtual [ReadElementContentAs](./readelementcontentas/)(const TypeInfo\&, SharedPtr\<IXmlNamespaceResolver\>, String, String) | जाँचता है कि निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वर्तमान तत्व से मेल खाता है, फिर तत्व सामग्री को अनुरोधित प्रकार के रूप में पढ़ता है। |
| virtual [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | तत्व को पढ़ता है और **Base64** सामग्री को डिकोड करता है। |
| virtual [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) | तत्व को पढ़ता है और **BinHex** सामग्री को डिकोड करता है। |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)() | वर्तमान तत्व को पढ़ता है और सामग्री को एक [Boolean](../../system/boolean/) वस्तु के रूप में लौटाता है। |
| virtual [ReadElementContentAsBoolean](./readelementcontentasboolean/)(String, String) | जाँचता है कि निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वर्तमान तत्व से मेल खाता है, फिर वर्तमान तत्व को पढ़ता है और सामग्री को एक [Boolean](../../system/boolean/) वस्तु के रूप में लौटाता है। |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)() | वर्तमान तत्व को पढ़ता है और सामग्री को एक [DateTime](../../system/datetime/) वस्तु के रूप में लौटाता है। |
| virtual [ReadElementContentAsDateTime](./readelementcontentasdatetime/)(String, String) | जाँचता है कि निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वर्तमान तत्व से मेल खाता है, फिर वर्तमान तत्व को पढ़ता है और सामग्री को एक [DateTime](../../system/datetime/) वस्तु के रूप में लौटाता है। |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)() | वर्तमान तत्व को पढ़ता है और सामग्री को एक [Decimal](../../system/decimal/) वस्तु के रूप में लौटाता है। |
| virtual [ReadElementContentAsDecimal](./readelementcontentasdecimal/)(String, String) | जाँचता है कि निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वर्तमान तत्व से मेल खाता है, फिर वर्तमान तत्व को पढ़ता है और सामग्री को एक [Decimal](../../system/decimal/) वस्तु के रूप में लौटाता है। |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)() | वर्तमान तत्व को पढ़ता है और सामग्री को दोहरी-प्रेसिशन फ्लोटिंग-पॉइंट संख्या के रूप में लौटाता है। |
| virtual [ReadElementContentAsDouble](./readelementcontentasdouble/)(String, String) | जाँचता है कि निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वर्तमान तत्व के समान है, फिर वर्तमान तत्व को पढ़ता है और सामग्री को डबल-प्रेसिशन फ्लोटिंग पॉइंट संख्या के रूप में लौटाता है। |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)() | वर्तमान तत्व को पढ़ता है और सामग्री को सिंगल-प्रेसिशन फ्लोटिंग पॉइंट संख्या के रूप में लौटाता है। |
| virtual [ReadElementContentAsFloat](./readelementcontentasfloat/)(String, String) | जाँचता है कि निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वर्तमान तत्व के समान है, फिर वर्तमान तत्व को पढ़ता है और सामग्री को सिंगल-प्रेसिशन फ्लोटिंग पॉइंट संख्या के रूप में लौटाता है। |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)() | वर्तमान तत्व को पढ़ता है और सामग्री को 32-बिट साइन्ड इंटेजर के रूप में लौटाता है। |
| virtual [ReadElementContentAsInt](./readelementcontentasint/)(String, String) | जाँचता है कि निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वर्तमान तत्व के समान है, फिर वर्तमान तत्व को पढ़ता है और सामग्री को 32-बिट साइन्ड इंटेजर के रूप में लौटाता है। |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)() | वर्तमान तत्व को पढ़ता है और सामग्री को 64-बिट साइन्ड इंटेजर के रूप में लौटाता है। |
| virtual [ReadElementContentAsLong](./readelementcontentaslong/)(String, String) | जाँचता है कि निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वर्तमान तत्व के समान है, फिर वर्तमान तत्व को पढ़ता है और सामग्री को 64-बिट साइन्ड इंटेजर के रूप में लौटाता है। |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)() | वर्तमान तत्व को पढ़ता है और सामग्री को एक [Object](../../system/object/) के रूप में लौटाता है। |
| virtual [ReadElementContentAsObject](./readelementcontentasobject/)(String, String) | जाँचता है कि निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वर्तमान तत्व के समान है, फिर वर्तमान तत्व को पढ़ता है और सामग्री को एक [Object](../../system/object/) के रूप में लौटाता है। |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)() | वर्तमान तत्व को पढ़ता है और सामग्री को एक [String](../../system/string/) ऑब्जेक्ट के रूप में लौटाता है। |
| virtual [ReadElementContentAsString](./readelementcontentasstring/)(String, String) | जाँचता है कि निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वर्तमान तत्व के समान है, फिर वर्तमान तत्व को पढ़ता है और सामग्री को एक [String](../../system/string/) ऑब्जेक्ट के रूप में लौटाता है। |
| virtual [ReadElementString](./readelementstring/)() | केवल‑पाठ तत्व को पढ़ता है। हालांकि, इस ऑपरेशन को संभालने का अधिक सरल तरीका प्रदान करने के कारण, इसे बदलने के लिए [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) मेथड का उपयोग करने की सलाह दी जाती है। |
| virtual [ReadElementString](./readelementstring/)(String) | पाठ‑केवल तत्व को पढ़ने से पहले यह जाँचता है कि पाए गए तत्व का [XmlReader::get_Name](./get_name/) मान दिए गए स्ट्रिंग से मेल खाता है। हालांकि, इस ऑपरेशन को संभालने का अधिक सरल तरीका प्रदान करने के कारण, इसे बदलने के लिए [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) मेथड का उपयोग करने की सलाह दी जाती है। |
| virtual [ReadElementString](./readelementstring/)(String, String) | पाठ‑केवल तत्व को पढ़ने से पहले यह जाँचता है कि पाए गए तत्व के [XmlReader::get_LocalName](./get_localname/) और [XmlReader::get_NamespaceURI](./get_namespaceuri/) मान दिए गए स्ट्रिंग्स से मेल खाते हैं। हालांकि, इस ऑपरेशन को संभालने का अधिक सरल तरीका प्रदान करने के कारण, इसे बदलने के लिए [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) मेथड का उपयोग करने की सलाह दी जाती है। |
| virtual [ReadEndElement](./readendelement/)() | जाँचता है कि वर्तमान कंटेंट नोड एक एंड टैग है और रीडर को अगले नोड पर ले जाता है। |
| virtual [ReadInnerXml](./readinnerxml/)() | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो सभी सामग्री, मार्कअप सहित, को स्ट्रिंग के रूप में पढ़ता है। |
| virtual [ReadOuterXml](./readouterxml/)() | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो इस नोड और इसकी सभी चाइल्ड नोड्स का प्रतिनिधित्व करने वाली सामग्री, मार्कअप सहित, को पढ़ता है। |
| virtual [ReadStartElement](./readstartelement/)() | जाँचता है कि वर्तमान नोड एक एलिमेंट है और रीडर को अगले नोड पर ले जाता है। |
| virtual [ReadStartElement](./readstartelement/)(String) | जाँचता है कि वर्तमान कंटेंट नोड दिया गया [XmlReader::get_Name](./get_name/) मान वाला एक एलिमेंट है और रीडर को अगले नोड पर ले जाता है। |
| virtual [ReadStartElement](./readstartelement/)(String, String) | जाँचता है कि वर्तमान कंटेंट नोड दिया गया [XmlReader::get_LocalName](./get_localname/) और [XmlReader::get_NamespaceURI](./get_namespaceuri/) मान वाला एक एलिमेंट है और रीडर को अगले नोड पर ले जाता है। |
| virtual [ReadString](./readstring/)() | जब एक व्युत्पन्न क्लास में ओवरराइड किया जाता है, तो एक एलिमेंट या टेक्स्ट नोड की सामग्री को स्ट्रिंग के रूप में पढ़ता है। हालांकि, इस ऑपरेशन को संभालने का अधिक सरल तरीका प्रदान करने के कारण, इसे बदलने के लिए [XmlReader::ReadElementContentAsString](./readelementcontentasstring/) मेथड का उपयोग करने की सलाह दी जाती है। |
| virtual [ReadSubtree](./readsubtree/)() | एक नया [XmlReader](./) इंस्टेंस लौटाता है जिसका उपयोग वर्तमान नोड और उसकी सभी संतानों को पढ़ने के लिए किया जा सकता है। |
| virtual [ReadToDescendant](./readtodescendant/)(String) | [XmlReader](./) को निर्दिष्ट क्वालिफाइड नाम वाले अगले डिसेंडेंट एलिमेंट पर ले जाता है। |
| virtual [ReadToDescendant](./readtodescendant/)(String, String) | [XmlReader](./) को निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले अगले डिसेंडेंट एलिमेंट पर ले जाता है। |
| virtual [ReadToFollowing](./readtofollowing/)(String) | जब तक निर्दिष्ट क्वालिफाइड नाम वाला एलिमेंट नहीं मिल जाता, तब तक पढ़ता रहता है। |
| virtual [ReadToFollowing](./readtofollowing/)(String, String) | निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले तत्व को मिलने तक पढ़ता है। |
| virtual [ReadToNextSibling](./readtonextsibling/)(String) | निर्दिष्ट योग्य नाम वाले अगले सहोदर तत्व तक [XmlReader](./) को आगे बढ़ाता है। |
| virtual [ReadToNextSibling](./readtonextsibling/)(String, String) | निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले अगले सहोदर तत्व तक [XmlReader](./) को आगे बढ़ाता है। |
| virtual [ReadValueChunk](./readvaluechunk/)(ArrayPtr\<char16_t\>, int32_t, int32_t) | XML दस्तावेज़ में एम्बेडेड बड़े टेक्स्ट स्ट्रीम को पढ़ता है। |
| virtual [ResolveEntity](./resolveentity/)() | जब व्युत्पन्न वर्ग में ओवरराइड किया जाता है, तो **EntityReference** नोड्स के लिए एंटिटी रेफ़रेंस को हल करता है। |
| virtual [Skip](./skip/)() | वर्तमान नोड के चाइल्ड नोड्स को छोड़ देता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## संबंधित देखें

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
