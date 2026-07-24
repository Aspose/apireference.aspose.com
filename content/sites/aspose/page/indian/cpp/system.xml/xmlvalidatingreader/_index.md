---
title: "System::Xml::XmlValidatingReader वर्ग"
linktitle: "XmlValidatingReader"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlValidatingReader वर्ग। एक रीडर का प्रतिनिधित्व करता है जो C++ में दस्तावेज़ प्रकार परिभाषा (DTD), XML-डेटा रिड्यूस्ड (XDR) स्कीमा, और XML स्कीमा परिभाषा भाषा (XSD) सत्यापन प्रदान करता है।"
type: docs
weight: 4200
url: /hi/cpp/system.xml/xmlvalidatingreader/
---
## XmlValidatingReader class


एक रीडर का प्रतिनिधित्व करता है जो दस्तावेज़ प्रकार परिभाषा (DTD), XML-डेटा रिड्यूस्ड (XDR) स्कीमा, और XML [Schema](../../system.xml.schema/) परिभाषा भाषा (XSD) सत्यापन प्रदान करता है।

```cpp
class XmlValidatingReader : public System::Xml::XmlReader,
                            public System::Xml::IXmlLineInfo,
                            public System::Xml::IXmlNamespaceResolver
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Close](./close/)() override | बदलता है [XmlReader::get_ReadState](../xmlreader/get_readstate/) को बंद में। |
| [get_AttributeCount](./get_attributecount/)() override | वर्तमान नोड पर एट्रिब्यूट्स की संख्या लौटाता है। |
| [get_BaseURI](./get_baseuri/)() override | वर्तमान नोड का बेस URI लौटाता है। |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | एक मान लौटाता है जो दर्शाता है कि क्या [XmlValidatingReader](./) बाइनरी कंटेंट पढ़ने की विधियों को लागू करता है। |
| [get_CanResolveEntity](./get_canresolveentity/)() override | यह दर्शाने वाला मान लौटाता है कि यह रीडर एंटिटीज़ को पार्स और रिजॉल्व कर सकता है या नहीं। |
| [get_Depth](./get_depth/)() override | वापस देता है XML दस्तावेज़ में वर्तमान नोड की गहराई। |
| [get_Encoding](./get_encoding/)() | दस्तावेज़ के लिए एन्कोडिंग गुण लौटाता है। |
| [get_EntityHandling](./get_entityhandling/)() | एक मान लौटाता है जो निर्दिष्ट करता है कि रीडर संस्थाओं को कैसे संभालता है। |
| [get_EOF](./get_eof/)() override | वापस देता है एक मान जो दर्शाता है कि रीडर स्ट्रीम के अंत में स्थित है या नहीं। |
| [get_HasValue](./get_hasvalue/)() override | एक मान लौटाता है जो दर्शाता है कि क्या वर्तमान नोड के पास [XmlValidatingReader::get_Value](./get_value/) [String::Empty](../../system/string/empty/) के अलावा कोई अन्य मान हो सकता है। |
| [get_IsDefault](./get_isdefault/)() override | वापस देता है एक मान जो दर्शाता है कि वर्तमान नोड एक ऐसा गुण है जो दस्तावेज़ प्रकार परिभाषा (DTD) या स्कीमा में परिभाषित डिफ़ॉल्ट मान से उत्पन्न हुआ है या नहीं। |
| [get_IsEmptyElement](./get_isemptyelement/)() override | वापस देता है एक मान जो दर्शाता है कि वर्तमान नोड एक खाली तत्व है (उदाहरण के लिए, **<MyElement/>**)। |
| [get_LineNumber](./get_linenumber/)() override | वर्तमान पंक्ति संख्या लौटाता है। |
| [get_LinePosition](./get_lineposition/)() override | वर्तमान पंक्ति स्थिति लौटाता है। |
| [get_LocalName](./get_localname/)() override | वर्तमान नोड का स्थानीय नाम लौटाता है। |
| [get_Name](./get_name/)() override | वापस देता है वर्तमान नोड का योग्य नाम। |
| [get_Namespaces](./get_namespaces/)() | एक मान लौटाता है जो दर्शाता है कि नेमस्पेस समर्थन करना है या नहीं। |
| [get_NamespaceURI](./get_namespaceuri/)() override | रीडर जिस नोड पर स्थित है, उसके नेमस्पेस यूनिफॉर्म रिसोर्स आइडेंटिफायर (URI) (जैसा कि वर्ल्ड वाइड [Web](../../system.web/) कंसोर्टियम (W3C) नेमस्पेस विनिर्देशन में परिभाषित है) को लौटाता है। |
| [get_NameTable](./get_nametable/)() override | वापस देता है इस कार्यान्वयन से जुड़ा [XmlNameTable](../xmlnametable/)। |
| [get_NodeType](./get_nodetype/)() override | वर्तमान नोड का प्रकार लौटाता है। |
| [get_Prefix](./get_prefix/)() override | वापस देता है वर्तमान नोड से जुड़ा नेमस्पेस उपसर्ग। |
| [get_QuoteChar](./get_quotechar/)() override | एक विशेषता नोड के मान को घेरने के लिए उपयोग किए जाने वाले उद्धरण चिह्न अक्षर को लौटाता है। |
| [get_Reader](./get_reader/)() | इस [XmlValidatingReader](./) को बनाने के लिए उपयोग किए गए [XmlReader](../xmlreader/) को लौटाता है। |
| [get_ReadState](./get_readstate/)() override | वापस देता है रीडर की स्थिति। |
| [get_Schemas](./get_schemas/)() | सत्यापन के लिए उपयोग करने हेतु एक XmlSchemaCollection लौटाता है। |
| [get_SchemaType](./get_schematype/)() | एक स्कीमा टाइप ऑब्जेक्ट लौटाता है। |
| [get_ValidationType](./get_validationtype/)() | किया जाने वाला सत्यापन प्रकार दर्शाने वाला मान लौटाता है। |
| [get_Value](./get_value/)() override | वापस देता है वर्तमान नोड का पाठ मान। |
| [get_XmlLang](./get_xmllang/)() override | वर्तमान **xml:lang** स्कोप लौटाता है। |
| [get_XmlSpace](./get_xmlspace/)() override | वापस देता है वर्तमान **xml:space** स्कोप। |
| [GetAttribute](./getattribute/)(String) override | वापस देता है निर्दिष्ट नाम वाले गुण का मान। |
| [GetAttribute](./getattribute/)(String, String) override | निर्दिष्ट स्थानीय नाम और नेमस्पेस यूनिफॉर्म रिसोर्स आइडेंटिफायर (URI) के साथ गुण का मान लौटाता है। |
| [GetAttribute](./getattribute/)(int32_t) override | वापस देता है निर्दिष्ट अनुक्रमांक वाले गुण का मान। |
| [HasLineInfo](./haslineinfo/)() override | एक मान लौटाता है जो दर्शाता है कि क्या क्लास लाइन जानकारी लौटा सकती है। |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | वर्तमान तत्व के स्कोप में नेमस्पेस उपसर्ग को हल करता है। |
| [MoveToAttribute](./movetoattribute/)(String) override | निर्दिष्ट नाम वाले गुण पर जाता है। |
| [MoveToAttribute](./movetoattribute/)(String, String) override | निर्दिष्ट स्थानीय नाम और नेमस्पेस यूनिफॉर्म रिसोर्स आइडेंटिफायर (URI) के साथ गुण पर जाता है। |
| [MoveToAttribute](./movetoattribute/)(int32_t) override | निर्दिष्ट अनुक्रमांक वाले गुण पर जाता है। |
| [MoveToElement](./movetoelement/)() override | वर्तमान गुण नोड को सम्मिलित करने वाले तत्व पर जाता है। |
| [MoveToFirstAttribute](./movetofirstattribute/)() override | पहले गुण पर जाता है। |
| [MoveToNextAttribute](./movetonextattribute/)() override | अगले गुण पर जाता है। |
| [Read](./read/)() override | स्ट्रीम से अगला नोड पढ़ता है। |
| [ReadAttributeValue](./readattributevalue/)() override | विशेषता मान को एक या अधिक **[Text](../../system.text/)**, **EntityReference**, या **EndEntity** नोड्स में पार्स करता है। |
| [ReadContentAsBase64](./readcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | सामग्री को पढ़ता है और Base64 डिकोड किए गए बाइनरी बाइट्स लौटाता है। |
| [ReadContentAsBinHex](./readcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | सामग्री को पढ़ता है और BinHex डिकोड किए गए बाइनरी बाइट्स लौटाता है। |
| [ReadElementContentAsBase64](./readelementcontentasbase64/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | तत्व को पढ़ता है और Base64 सामग्री को डिकोड करता है। |
| [ReadElementContentAsBinHex](./readelementcontentasbinhex/)(ArrayPtr\<uint8_t\>, int32_t, int32_t) override | तत्व को पढ़ता है और BinHex सामग्री को डिकोड करता है। |
| [ReadString](./readstring/)() override | एक तत्व या टेक्स्ट नोड की सामग्री को स्ट्रिंग के रूप में पढ़ता है। |
| [ReadTypedValue](./readtypedvalue/)() | निर्दिष्ट XML [Schema](../../system.xml.schema/) परिभाषा भाषा (XSD) प्रकार के लिए रनटाइम प्रकार लौटाता है। |
| [ResolveEntity](./resolveentity/)() override | **EntityReference** नोड्स के लिए एंटिटी रेफ़रेंस को हल करता है। |
| [set_EntityHandling](./set_entityhandling/)(System::Xml::EntityHandling) | सेट करता है वह मान जो निर्दिष्ट करता है कि रीडर इकाइयों को कैसे संभालता है। |
| [set_Namespaces](./set_namespaces/)(bool) | एक मान सेट करता है जो दर्शाता है कि नेमस्पेस समर्थन करना है या नहीं। |
| [set_ValidationType](./set_validationtype/)(System::Xml::ValidationType) | प्रदर्शन करने वाले सत्यापन प्रकार को दर्शाने वाला मान सेट करता है। |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | बाहरी दस्तावेज़ प्रकार परिभाषा (DTD) और स्कीमा स्थान संदर्भों को हल करने के लिए उपयोग किए जाने वाले [XmlResolver](../xmlresolver/) को सेट करता है। [XmlResolver](../xmlresolver/) का उपयोग XML [Schema](../../system.xml.schema/) परिभाषा भाषा (XSD) स्कीमा में पाए जाने वाले किसी भी आयात या सम्मिलित तत्वों को संभालने के लिए भी किया जाता है। |
| [ValidationEventHandler_add](./validationeventhandler_add/)(Args...) | दस्तावेज़ प्रकार परिभाषा (DTD), XML-Data Reduced (XDR) स्कीमा, और XML [Schema](../../system.xml.schema/) परिभाषा भाषा (XSD) स्कीमा सत्यापन त्रुटियों के बारे में जानकारी प्राप्त करने के लिए एक इवेंट हैंडलर जोड़ता है। |
| [ValidationEventHandler_remove](./validationeventhandler_remove/)(Args...) | दस्तावेज़ प्रकार परिभाषा (DTD), XML-Data Reduced (XDR) स्कीमा, और XML [Schema](../../system.xml.schema/) परिभाषा भाषा (XSD) स्कीमा सत्यापन त्रुटियों के बारे में जानकारी प्राप्त करने के लिए इवेंट हैंडलर को हटाता है। |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<XmlReader\>\&) | दिए गए [XmlReader](../xmlreader/) से लौटाए गए सामग्री को सत्यापित करने वाले [XmlValidatingReader](./) वर्ग की नई इंस्टेंस को प्रारंभ करता है। |
| [XmlValidatingReader](./xmlvalidatingreader/)(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | निर्दिष्ट मानों के साथ [XmlValidatingReader](./) वर्ग की नई इंस्टेंस को प्रारंभ करता है। |
| [XmlValidatingReader](./xmlvalidatingreader/)(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) | निर्दिष्ट मानों के साथ [XmlValidatingReader](./) वर्ग की नई इंस्टेंस को प्रारंभ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ


## Deprecated
यह वर्ग अब अप्रचलित है। वैध XML रीडर बनाने के लिए XmlReaderSettings वर्ग और XmlReader::Create मेथड का उपयोग करने की सलाह दी जाती है।

इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlReader](../xmlreader/)
* Class [IXmlLineInfo](../ixmllineinfo/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
