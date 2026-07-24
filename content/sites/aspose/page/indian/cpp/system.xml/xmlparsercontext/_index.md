---
title: "System::Xml::XmlParserContext क्लास"
linktitle: "XmlParserContext"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlParserContext क्लास। C++ में XML फ्रैगमेंट को पार्स करने के लिए XmlReader द्वारा आवश्यक सभी संदर्भ जानकारी प्रदान करता है।"
type: docs
weight: 3000
url: /hi/cpp/system.xml/xmlparsercontext/
---
## XmlParserContext class


XML फ्रैगमेंट को पार्स करने के लिए [XmlReader](../xmlreader/) द्वारा आवश्यक सभी संदर्भ जानकारी प्रदान करता है।

```cpp
class XmlParserContext : public System::Object
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| [get_BaseURI](./get_baseuri/)() | बेस URI लौटाता है। |
| [get_DocTypeName](./get_doctypename/)() | डॉक्यूमेंट टाइप डिक्लेरेशन का नाम लौटाता है। |
| [get_Encoding](./get_encoding/)() | एन्कोडिंग प्रकार लौटाता है। |
| [get_InternalSubset](./get_internalsubset/)() | आंतरिक DTD उपसमुच्चय लौटाता है। |
| [get_NamespaceManager](./get_namespacemanager/)() | [XmlNamespaceManager](../xmlnamespacemanager/) लौटाता है। |
| [get_NameTable](./get_nametable/)() | [XmlNameTable](../xmlnametable/) लौटाता है जो स्ट्रिंग्स को एटॉमाइज़ करने के लिए उपयोग किया जाता है। एटॉमाइज़्ड स्ट्रिंग्स के बारे में अधिक जानकारी के लिए, देखें [XmlNameTable](../xmlnametable/). |
| [get_PublicId](./get_publicid/)() | पब्लिक आइडेंटिफ़ायर लौटाता है। |
| [get_SystemId](./get_systemid/)() | सिस्टम आइडेंटिफ़ायर लौटाता है। |
| [get_XmlLang](./get_xmllang/)() | वर्तमान **xml:lang** स्कोप लौटाता है। |
| [get_XmlSpace](./get_xmlspace/)() | वापस देता है वर्तमान **xml:space** स्कोप। |
| [set_BaseURI](./set_baseuri/)(const String\&) | बेस URI सेट करता है। |
| [set_DocTypeName](./set_doctypename/)(const String\&) | डॉक्यूमेंट टाइप डिक्लेरेशन का नाम सेट करता है। |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | एन्कोडिंग प्रकार सेट करता है। |
| [set_InternalSubset](./set_internalsubset/)(const String\&) | आंतरिक DTD उपसमुच्चय सेट करता है। |
| [set_NamespaceManager](./set_namespacemanager/)(const SharedPtr\<XmlNamespaceManager\>\&) | [XmlNamespaceManager](../xmlnamespacemanager/) सेट करता है। |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | [XmlNameTable](../xmlnametable/) सेट करता है जो स्ट्रिंग्स को एटॉमाइज़ करने के लिए उपयोग किया जाता है। एटॉमाइज़्ड स्ट्रिंग्स के बारे में अधिक जानकारी के लिए, देखें [XmlNameTable](../xmlnametable/). |
| [set_PublicId](./set_publicid/)(const String\&) | पब्लिक आइडेंटिफ़ायर सेट करता है। |
| [set_SystemId](./set_systemid/)(const String\&) | सिस्टम आइडेंटिफ़ायर सेट करता है। |
| [set_XmlLang](./set_xmllang/)(const String\&) | वर्तमान **xml:lang** स्कोप सेट करता है। |
| [set_XmlSpace](./set_xmlspace/)(System::Xml::XmlSpace) | वर्तमान **xml:space** स्कोप सेट करता है। |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) | [XmlParserContext](./) क्लास का नया इंस्टेंस निर्दिष्ट [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), **xml:lang**, और **xml:space** मानों के साथ इनिशियलाइज़ करता है। |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | [XmlParserContext](./) क्लास का नया इंस्टेंस निर्दिष्ट [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), **xml:lang**, **xml:space**, और एन्कोडिंग के साथ इनिशियलाइज़ करता है। |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) | [XmlParserContext](./) क्लास का नया इंस्टेंस निर्दिष्ट [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), बेस URI, **xml:lang**, **xml:space**, और डॉक्यूमेंट टाइप मानों के साथ इनिशियलाइज़ करता है। |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | निर्दिष्ट [XmlParserContext](./) वर्ग की नई इंस्टेंस को निर्दिष्ट [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), बेस URI, **xml:lang**, **xml:space**, एन्कोडिंग, और दस्तावेज़ प्रकार मानों के साथ आरंभ करता है। |
## Typedefs

| टाइपडिफ़ | विवरण |
| --- | --- |
| [Ptr](./ptr/) | इस क्लास के इंस्टेंस के लिए शेयर्ड पॉइंटर का एक उपनाम। |
## टिप्पणियाँ



इस क्लास की ऑब्जेक्ट्स को केवल [System::MakeObject()](../../system/makeobject/) फ़ंक्शन का उपयोग करके अलोकेट किया जाना चाहिए। इस प्रकार के इंस्टेंस को स्टैक पर या ऑपरेटर new का उपयोग करके कभी न बनाएं, क्योंकि इससे रनटाइम एरर और/या असर्शन फॉल्ट्स हो सकते हैं। हमेशा इस क्लास को [System::SmartPtr](../../system/smartptr/) पॉइंटर में रैप करें और इस पॉइंटर का उपयोग फ़ंक्शन को आर्ग्यूमेंट के रूप में पास करने के लिए करें।

## संबंधित देखें

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
