---
title: "System::Xml::XmlNamespaceManager::AddNamespace method"
linktitle: "AddNamespace"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNamespaceManager::AddNamespace method. C++ में दिए गए नेमस्पेस को संग्रह में जोड़ता है।"
type: docs
weight: 200
url: /hi/cpp/system.xml/xmlnamespacemanager/addnamespace/
---
## XmlNamespaceManager::AddNamespace method


दिए गए नेमस्पेस को संग्रह में जोड़ता है।

```cpp
virtual void System::Xml::XmlNamespaceManager::AddNamespace(String prefix, String uri)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| prefix | String | जो प्रीफ़िक्स जोड़े जा रहे नेमस्पेस के साथ संबद्ध किया जाना है। डिफ़ॉल्ट नेमस्पेस जोड़ने के लिए [String::Empty](../../../system/string/empty/) का उपयोग करें। यदि [XmlNamespaceManager](../) को XML पाथ लैंग्वेज ([XPath](../../../system.xml.xpath/)) अभिव्यक्ति में नेमस्पेस को हल करने के लिए उपयोग किया जाएगा, तो एक प्रीफ़िक्स निर्दिष्ट करना आवश्यक है। यदि किसी [XPath](../../../system.xml.xpath/) अभिव्यक्ति में प्रीफ़िक्स शामिल नहीं है, तो माना जाता है कि नेमस्पेस यूनिफ़ॉर्म रिसोर्स आइडेंटिफ़ायर (URI) खाली नेमस्पेस है। अधिक जानकारी के लिए [XPath](../../../system.xml.xpath/) अभिव्यक्तियों और [XmlNamespaceManager](../) के बारे में, XmlNode::SelectNodes(String) और XPathExpression::SetContext(SharedPtr<XmlNamespaceManager>) मेथड्स देखें। |
| uri | String | जोड़ने के लिए नेमस्पेस। |

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
