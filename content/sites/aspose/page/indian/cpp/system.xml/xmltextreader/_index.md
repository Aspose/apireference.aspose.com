---
title: "System::Xml::XmlTextReader वर्ग"
linktitle: "XmlTextReader"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlTextReader वर्ग। एक रीडर का प्रतिनिधित्व करता है जो C++ में XML डेटा तक तेज़, गैर-कैश्ड, केवल-फ़ॉरवर्ड एक्सेस प्रदान करता है।"
type: docs
weight: 3900
url: /hi/cpp/system.xml/xmltextreader/
---
## XmlTextReader class


XML डेटा तक तेज, गैर‑कैश्ड, केवल‑आगे की पहुँच प्रदान करने वाला रीडर दर्शाता है।

```cpp
class XmlTextReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlLineInfo,
                      public System::Xml::IXmlNamespaceResolver
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Close](./close/)() override | परिवर्तित करता है [XmlReader::get_ReadState](../xmlreader/get_readstate/) को **Closed**। |
| [get_AttributeCount](./get_attributecount/)() override | वर्तमान नोड पर एट्रिब्यूट्स की संख्या लौटाता है। |
| [get_BaseURI](./get_baseuri/)() override | वर्तमान नोड का बेस URI लौटाता है। |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | एक मान लौटाता है जो दर्शाता है कि क्या [XmlTextReader](./) बाइनरी सामग्री पढ़ने की विधियों को लागू करता है। |
| [get_CanReadValueChunk](./get_canreadvaluechunk/)() override | एक मान लौटाता है जो दर्शाता है कि क्या [XmlTextReader](./) [XmlReader::ReadValueChunk](../xmlreader/readvaluechunk/) विधि को लागू करता है। |
| [get_CanResolveEntity](./get_canresolveentity/)() override | यह दर्शाने वाला मान लौटाता है कि यह रीडर एंटिटीज़ को पार्स और रिजॉल्व कर सकता है या नहीं। |
| [get_Depth](./get_depth/)() override | वापस देता है XML दस्तावेज़ में वर्तमान नोड की गहराई। |
| [get_DtdProcessing](./get_dtdprocessing/)() | [DtdProcessing](../dtdprocessing/) enumeration लौटाता है। |
| [get_Encoding](./get_encoding/)() | दस्तावेज़ की एन्कोडिंग लौटाता है। |
| [get_EntityHandling](./get_entityhandling/)() | एक मान लौटाता है जो निर्दिष्ट करता है कि रीडर संस्थाओं को कैसे संभालता है। |
| [get_EOF](./get_eof/)() override | वापस देता है एक मान जो दर्शाता है कि रीडर स्ट्रीम के अंत में स्थित है या नहीं। |
| [get_HasValue](./get_hasvalue/)() override | एक मान लौटाता है जो दर्शाता है कि क्या वर्तमान नोड के पास [XmlTextReader::get_Value](./get_value/) हो सकता है जो [String::Empty](../../system/string/empty/) से अलग हो। |
| [get_IsDefault](./get_isdefault/)() override | एक मान लौटाता है जो दर्शाता है कि क्या वर्तमान नोड वह विशेषता है जो DTD या स्कीमा में परिभाषित डिफ़ॉल्ट मान से उत्पन्न हुई है। |
| [get_IsEmptyElement](./get_isemptyelement/)() override | वापस देता है एक मान जो दर्शाता है कि वर्तमान नोड एक खाली तत्व है (उदाहरण के लिए, **<MyElement/>**)। |
| [get_LineNumber](./get_linenumber/)() override | वर्तमान पंक्ति संख्या लौटाता है। |
| [get_LinePosition](./get_lineposition/)() override | वर्तमान पंक्ति स्थिति लौटाता है। |
| [get_LocalName](./get_localname/)() override | वर्तमान नोड का स्थानीय नाम लौटाता है। |
| [get_Name](./get_name/)() override | वापस देता है वर्तमान नोड का योग्य नाम। |
| [get_Namespaces](./get_namespaces/)() | एक मान लौटाता है जो दर्शाता है कि नेमस्पेस समर्थन करना है या नहीं। |
| [get_NamespaceURI](./get_namespaceuri/)() override | वापस देता है उस नोड का नेमस्पेस URI (जैसा कि W3C नेमस्पेस विनिर्देशन में परिभाषित है) जिस पर रीडर स्थित है। |
| [get_NameTable](./get_nametable/)() override | वापस देता है इस कार्यान्वयन से जुड़ा [XmlNameTable](../xmlnametable/)। |
| [get_NodeType](./get_nodetype/)() override | वर्तमान नोड का प्रकार लौटाता है। |
| [get_Normalization](./get_normalization/)() | एक मान लौटाता है जो दर्शाता है कि क्या व्हाइटस्पेस और विशेषता मानों को सामान्यीकृत किया जाए। |
| [get_Prefix](./get_prefix/)() override | वापस देता है वर्तमान नोड से जुड़ा नेमस्पेस उपसर्ग। |
| [get_ProhibitDtd](./get_prohibitdtd/)() | एक मान लौटाता है जो दर्शाता है कि क्या DTD प्रोसेसिंग की अनुमति दी जाए। |
| [get_QuoteChar](./get_quotechar/)() override | एक विशेषता नोड के मान को घेरने के लिए उपयोग किए जाने वाले उद्धरण चिह्न अक्षर को लौटाता है। |
| [get_ReadState](./get_readstate/)() override | वापस देता है रीडर की स्थिति। |
| [get_Value](./get_value/)() override | वापस देता है वर्तमान नोड का पाठ मान। |
| [get_WhitespaceHandling](./get_whitespacehandling/)() | एक मान लौटाता है जो निर्दिष्ट करता है कि व्हाइटस्पेस को कैसे संभाला जाता है। |
| [get_XmlLang](./get_xmllang/)() override | वर्तमान **xml:lang** स्कोप लौटाता है। |
| [get_XmlSpace](./get_xmlspace/)() override | वापस देता है वर्तमान **xml:space** स्कोप। |
| [GetAttribute](./getattribute/)(String) override | वापस देता है निर्दिष्ट नाम वाले गुण का मान। |
| [GetAttribute](./getattribute/)(String, String) override | वापस देता है निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले गुण का मान। |
| [GetAttribute](./getattribute/)(int32_t) override | वापस देता है निर्दिष्ट अनुक्रमांक वाले गुण का मान। |
| [GetNamespacesInScope](./getnamespacesinscope/)(XmlNamespaceScope) override | एक संग्रह लौटाता है जिसमें वर्तमान में स्कोप में सभी नेमस्पेस शामिल होते हैं। |
| [GetRemainder](./getremainder/)() | बफ़र किए गए XML का शेष भाग लौटाता है। |
| [HasLineInfo](./haslineinfo/)() override | एक मान लौटाता है जो दर्शाता है कि क्या क्लास लाइन जानकारी लौटा सकती है। |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | वर्तमान तत्व के स्कोप में नेमस्पेस उपसर्ग को हल करता है। |
| [MoveToAttribute](./movetoattribute/)(String) override | निर्दिष्ट नाम वाले गुण पर जाता है। |
| [MoveToAttribute](./movetoattribute/)(String, String) override | निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले गुण पर जाता है। |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | निर्दिष्ट अनुक्रमांक वाले गुण पर जाता है। |
| [MoveToElement](./movetoelement/)() override | वर्तमान गुण नोड को सम्मिलित करने वाले तत्व पर जाता है। |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | पहले गुण पर जाता है। |
| [MoveToNextAttribute](./movetonextattribute/)() override | अगले गुण पर जाता है। |
| [Read](./read/)() override | स्ट्रीम से अगला नोड पढ़ता है। |
| [ReadAttributeValue](./readattributevalue/)() override | विशेषता मान को एक या अधिक **[Text](../../system.text/)**, **EntityReference**, या **EndEntity** नोड्स में पार्स करता है। |
| [ReadBase64](./readbase64/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Base64 को डिकोड करता है और डिकोड किए गए बाइनरी बाइट्स लौटाता है। |
| [ReadBinHex](./readbinhex/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | **BinHex** को डिकोड करता है और डिकोड किए गए बाइनरी बाइट्स लौटाता है। |
| [ReadChars](./readchars/)(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) | एक तत्व की पाठ सामग्री को कैरेक्टर बफ़र में पढ़ता है। यह विधि बड़े एम्बेडेड टेक्स्ट स्ट्रीम को क्रमिक रूप से कॉल करके पढ़ने के लिए डिज़ाइन की गई है। |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | सामग्री पढ़ता है और **Base64** डिकोड किए गए बाइनरी बाइट्स लौटाता है। |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | सामग्री पढ़ता है और **BinHex** डिकोड किए गए बाइनरी बाइट्स लौटाता है। |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | तत्व को पढ़ता है और Base64 सामग्री को डिकोड करता है। |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | तत्व को पढ़ता है और **BinHex** सामग्री को डिकोड करता है। |
| [ReadString](./readstring/)() override | एक तत्व या टेक्स्ट नोड की सामग्री को स्ट्रिंग के रूप में पढ़ता है। |
| [ResetState](./resetstate/)() | रीडर की स्थिति को [ReadState::Initial](../readstate/) पर रीसेट करता है। |
| [ResolveEntity](./resolveentity/)() override | **EntityReference** नोड्स के लिए एंटिटी रेफ़रेंस को हल करता है। |
| [set_DtdProcessing](./set_dtdprocessing/)(System::Xml::DtdProcessing) | सेट करता है [DtdProcessing](../dtdprocessing/) enumeration। |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | सेट करता है वह मान जो निर्दिष्ट करता है कि रीडर इकाइयों को कैसे संभालता है। |
| [set_Namespaces](./set_namespaces/)(bool) | एक मान सेट करता है जो दर्शाता है कि नेमस्पेस समर्थन करना है या नहीं। |
| [set_Normalization](./set_normalization/)(bool) | सेट करता है वह मान जो दर्शाता है कि क्या व्हाइट स्पेस और एट्रिब्यूट मानों को सामान्यीकृत किया जाए। |
| [set_ProhibitDtd](./set_prohibitdtd/)(bool) | सेट करता है वह मान जो दर्शाता है कि DTD प्रोसेसिंग की अनुमति दी जाए या नहीं। |
| [set_WhitespaceHandling](./set_whitespacehandling/)(System::Xml::WhitespaceHandling) | सेट करता है वह मान जो निर्दिष्ट करता है कि व्हाइट स्पेस को कैसे संभाला जाए। |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | सेट करता है वह [XmlResolver](../xmlresolver/) जिसका उपयोग DTD संदर्भों को हल करने के लिए किया जाता है। |
| [Skip](./skip/)() override | वर्तमान नोड के चाइल्ड नोड्स को छोड़ देता है। |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&) | निर्दिष्ट स्ट्रीम के साथ [XmlTextReader](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&) | निर्दिष्ट URL और स्ट्रीम के साथ [XmlTextReader](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | निर्दिष्ट स्ट्रीम और [XmlNameTable](../xmlnametable/) के साथ [XmlTextReader](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNameTable\>\&) | निर्दिष्ट URL, स्ट्रीम और [XmlNameTable](../xmlnametable/) के साथ [XmlTextReader](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&) | निर्दिष्ट TextReader के साथ [XmlTextReader](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&) | निर्दिष्ट URL और TextReader के साथ [XmlTextReader](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | निर्दिष्ट TextReader और [XmlNameTable](../xmlnametable/) के साथ [XmlTextReader](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<IO::TextReader\>\&, const SharedPtr\<XmlNameTable\>\&) | निर्दिष्ट URL, TextReader और [XmlNameTable](../xmlnametable/) के साथ [XmlTextReader](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
| [XmlTextReader](./xmltextreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | निर्दिष्ट स्ट्रीम, [XmlNodeType](../xmlnodetype/) और [XmlParserContext](../xmlparsercontext/) के साथ [XmlTextReader](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
| [XmlTextReader](./xmltextreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | निर्दिष्ट स्ट्रिंग, [XmlNodeType](../xmlnodetype/) और [XmlParserContext](../xmlparsercontext/) के साथ [XmlTextReader](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
| [XmlTextReader](./xmltextreader/)(const String\&) | निर्दिष्ट फ़ाइल के साथ [XmlTextReader](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
| [XmlTextReader](./xmltextreader/)(const String\&, const SharedPtr\<XmlNameTable\>\&) | निर्दिष्ट फ़ाइल और [XmlNameTable](../xmlnametable/) के साथ [XmlTextReader](./) क्लास का नया इंस्टेंस इनिशियलाइज़ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



सिफ़ारिश की जाती है कि इसके बजाय [XmlReader](../xmlreader/) क्लास का उपयोग किया जाए।

इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
