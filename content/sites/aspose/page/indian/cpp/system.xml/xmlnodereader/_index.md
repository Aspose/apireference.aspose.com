---
title: "System::Xml::XmlNodeReader क्लास"
linktitle: "XmlNodeReader"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNodeReader क्लास। एक रीडर का प्रतिनिधित्व करता है जो C++ में XmlNode में XML डेटा तक तेज़, गैर-कैश्ड, केवल-फ़ॉरवर्ड एक्सेस प्रदान करता है।"
type: docs
weight: 2800
url: /hi/cpp/system.xml/xmlnodereader/
---
## XmlNodeReader class


एक रीडर का प्रतिनिधित्व करता है जो [XmlNode](../xmlnode/) में XML डेटा तक तेज़, गैर-कैश्ड, केवल-फ़ॉरवर्ड एक्सेस प्रदान करता है।

```cpp
class XmlNodeReader : public System::Xml::XmlReader,
                      public System::Xml::IXmlNamespaceResolver
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [Close](./close/)() override | [XmlNodeReader::get_ReadState](./get_readstate/) को [ReadState::Closed](../readstate/) में बदलता है। |
| [get_AttributeCount](./get_attributecount/)() override | वर्तमान नोड पर एट्रिब्यूट्स की संख्या लौटाता है। |
| [get_BaseURI](./get_baseuri/)() override | वर्तमान नोड का बेस URI लौटाता है। |
| [get_CanReadBinaryContent](./get_canreadbinarycontent/)() override | [XmlNodeReader](./) बाइनरी कंटेंट रीड मेथड्स को लागू करता है या नहीं, यह दर्शाने वाला मान लौटाता है। |
| [get_CanResolveEntity](./get_canresolveentity/)() override | यह दर्शाने वाला मान लौटाता है कि यह रीडर एंटिटीज़ को पार्स और रिजॉल्व कर सकता है या नहीं। |
| [get_Depth](./get_depth/)() override | वापस देता है XML दस्तावेज़ में वर्तमान नोड की गहराई। |
| [get_EOF](./get_eof/)() override | वापस देता है एक मान जो दर्शाता है कि रीडर स्ट्रीम के अंत में स्थित है या नहीं। |
| [get_HasAttributes](./get_hasattributes/)() override | वापस देता है एक मान जो दर्शाता है कि वर्तमान नोड के कोई गुण हैं या नहीं। |
| [get_HasValue](./get_hasvalue/)() override | वापस देता है एक मान जो दर्शाता है कि वर्तमान नोड के पास एक [XmlNodeReader::get_Value](./get_value/) मान हो सकता है या नहीं। |
| [get_IsDefault](./get_isdefault/)() override | वापस देता है एक मान जो दर्शाता है कि वर्तमान नोड एक ऐसा गुण है जो दस्तावेज़ प्रकार परिभाषा (DTD) या स्कीमा में परिभाषित डिफ़ॉल्ट मान से उत्पन्न हुआ है या नहीं। |
| [get_IsEmptyElement](./get_isemptyelement/)() override | वापस देता है एक मान जो दर्शाता है कि वर्तमान नोड एक खाली तत्व है (उदाहरण के लिए, **<MyElement/>**)। |
| [get_LocalName](./get_localname/)() override | वर्तमान नोड का स्थानीय नाम लौटाता है। |
| [get_Name](./get_name/)() override | वापस देता है वर्तमान नोड का योग्य नाम। |
| [get_NamespaceURI](./get_namespaceuri/)() override | वापस देता है उस नोड का नेमस्पेस URI (जैसा कि W3C नेमस्पेस विनिर्देशन में परिभाषित है) जिस पर रीडर स्थित है। |
| [get_NameTable](./get_nametable/)() override | वापस देता है इस कार्यान्वयन से जुड़ा [XmlNameTable](../xmlnametable/)। |
| [get_NodeType](./get_nodetype/)() override | वर्तमान नोड का प्रकार लौटाता है। |
| [get_Prefix](./get_prefix/)() override | वापस देता है वर्तमान नोड से जुड़ा नेमस्पेस उपसर्ग। |
| [get_ReadState](./get_readstate/)() override | वापस देता है रीडर की स्थिति। |
| [get_SchemaInfo](./get_schemainfo/)() override | वापस देता है वर्तमान नोड को सौंपा गया स्कीमा जानकारी। |
| [get_Value](./get_value/)() override | वापस देता है वर्तमान नोड का पाठ मान। |
| [get_XmlLang](./get_xmllang/)() override | वर्तमान **xml:lang** स्कोप लौटाता है। |
| [get_XmlSpace](./get_xmlspace/)() override | वापस देता है वर्तमान **xml:space** स्कोप। |
| [GetAttribute](./getattribute/)(String) override | वापस देता है निर्दिष्ट नाम वाले गुण का मान। |
| [GetAttribute](./getattribute/)(String, String) override | वापस देता है निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले गुण का मान। |
| [GetAttribute](./getattribute/)(int32_t) override | वापस देता है निर्दिष्ट अनुक्रमांक वाले गुण का मान। |
| [LookupNamespace](./lookupnamespace/)(const String\&) override | वर्तमान तत्व के स्कोप में नेमस्पेस उपसर्ग को हल करता है। |
| [MoveToAttribute](./movetoattribute/)(String) override | निर्दिष्ट नाम वाले गुण पर जाता है। |
| [MoveToAttribute](./movetoattribute/)(String, String) override | निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले गुण पर जाता है। |
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
| [ResolveEntity](./resolveentity/)() override | **EntityReference** नोड्स के लिए एंटिटी रेफ़रेंस को हल करता है। |
| [Skip](./skip/)() override | वर्तमान नोड के चाइल्ड नोड्स को छोड़ देता है। |
| [XmlNodeReader](./xmlnodereader/)(const SharedPtr\<XmlNode\>\&) | निर्दिष्ट [XmlNode](../xmlnode/) का उपयोग करके [XmlNodeReader](./) क्लास का एक इंस्टेंस बनाता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [XmlReader](../xmlreader/)
* Class [IXmlNamespaceResolver](../ixmlnamespaceresolver/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
