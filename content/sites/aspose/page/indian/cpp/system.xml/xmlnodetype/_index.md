---
title: "System::Xml::XmlNodeType enum"
linktitle: "XmlNodeType"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNodeType enum. C++ में नोड के प्रकार को निर्दिष्ट करता है।"
type: docs
weight: 6200
url: /hi/cpp/system.xml/xmlnodetype/
---
## XmlNodeType enum


नोड के प्रकार को निर्दिष्ट करता है।

```cpp
enum class XmlNodeType
```

### मान

| नाम | मान | विवरण |
| --- | --- | --- |
| None | 0 | यदि **Read** मेथड को नहीं बुलाया गया है तो यह [XmlReader](../xmlreader/) द्वारा लौटाया जाता है। |
| Element | 1 | एक तत्व (उदाहरण के लिए, **<item>**). |
| Attribute | 2 | एक गुण (उदाहरण के लिए, **id='123'**). |
| Text | 3 | एक नोड की पाठ सामग्री। एक [XmlNodeType::Text](./) नोड के कोई चाइल्ड नोड नहीं हो सकते। यह [XmlNodeType::Attribute](./), [XmlNodeType::DocumentFragment](./), [XmlNodeType::Element](./), और [XmlNodeType::EntityReference](./) नोड्स के चाइल्ड नोड के रूप में प्रकट हो सकता है। |
| CDATA | 4 | एक CDATA अनुभाग (उदाहरण के लिए, **my escaped text**). |
| EntityReference | 5 | एक इकाई का संदर्भ (उदाहरण के लिए, **&num;**). |
| Entity | 6 | एक इकाई घोषणा (उदाहरण के लिए, **<!ENTITY...>**). |
| ProcessingInstruction | 7 | एक प्रोसेसिंग इंस्ट्रक्शन (उदाहरण के लिए, **<?pi test?>**). |
| Comment | 8 | एक टिप्पणी (उदाहरण के लिए, ****). |
| Document | 9 | एक दस्तावेज़ वस्तु जो दस्तावेज़ वृक्ष की जड़ के रूप में पूरी XML दस्तावेज़ तक पहुँच प्रदान करती है। |
| DocumentType | 10 | दस्तावेज़ प्रकार घोषणा, निम्न टैग द्वारा संकेतित (उदाहरण के लिए, **<!DOCTYPE...>**). |
| DocumentFragment | 11 | एक दस्तावेज़ फ्रैगमेंट। |
| नोटेशन | 12 | दस्तावेज़ प्रकार घोषणा में एक नोटेशन (उदाहरण के लिए, **<!NOTATION...>**). |
| रिक्त स्थान | 13 | मार्कअप के बीच का रिक्त स्थान। |
| SignificantWhitespace | 14 | मिश्रित सामग्री मॉडल में मार्कअप के बीच का रिक्त स्थान या **xml:space=\"preserve\"** स्कोप के भीतर का रिक्त स्थान। |
| EndElement | 15 | एक अंत तत्व टैग (उदाहरण के लिए, ****). |
| EndEntity | 16 | जब [XmlReader](../xmlreader/) इकाई प्रतिस्थापन के अंत तक पहुँचता है, तो [XmlReader::ResolveEntity](../xmlreader/resolveentity/) कॉल के परिणामस्वरूप यह लौटाया जाता है। |
| XmlDeclaration | 17 | XML घोषणा (उदाहरण के लिए, **<?xml version='1.0'?>**). [XmlNodeType::XmlDeclaration](./) नोड दस्तावेज़ में पहला नोड होना चाहिए। इसमें बच्चे नहीं हो सकते। यह [XmlNodeType::Document](./) नोड का बच्चा है। इसमें ऐसे गुण हो सकते हैं जो संस्करण और एन्कोडिंग जानकारी प्रदान करते हैं। |

## संबंधित देखें

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
