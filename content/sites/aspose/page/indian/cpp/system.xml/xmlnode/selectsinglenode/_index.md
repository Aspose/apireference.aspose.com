---
title: "System::Xml::XmlNode::SelectSingleNode मेथड"
linktitle: "SelectSingleNode"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNode::SelectSingleNode मेथड। C++ में XPath अभिव्यक्ति से मेल खाने वाले पहले XmlNode को चुनता है।"
type: docs
weight: 3900
url: /hi/cpp/system.xml/xmlnode/selectsinglenode/
---
## XmlNode::SelectSingleNode(const String\&) method


पहले [XmlNode](../) को चुनता है जो [XPath](../../../system.xml.xpath/) अभिव्यक्ति से मेल खाता है।

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xpath | const String\& | यह [XPath](../../../system.xml.xpath/) अभिव्यक्ति। |

### ReturnValue

पहला [XmlNode](../) जो [XPath](../../../system.xml.xpath/) क्वेरी से मेल खाता है या **nullptr** यदि कोई मेल खाने वाला नोड नहीं मिला।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::SelectSingleNode(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


पहले [XmlNode](../) को चुनता है जो [XPath](../../../system.xml.xpath/) अभिव्यक्ति से मेल खाता है। [XPath](../../../system.xml.xpath/) अभिव्यक्ति में पाए गए किसी भी उपसर्ग को प्रदान किए गए [XmlNamespaceManager](../../xmlnamespacemanager/) का उपयोग करके हल किया जाता है।

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xpath | const String\& | यह [XPath](../../../system.xml.xpath/) अभिव्यक्ति। |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | [XPath](../../../system.xml.xpath/) अभिव्यक्ति में उपसर्गों के लिए नेमस्पेस को हल करने हेतु एक [XmlNamespaceManager](../../xmlnamespacemanager/)। |

### ReturnValue

पहला [XmlNode](../) जो [XPath](../../../system.xml.xpath/) क्वेरी से मेल खाता है या **nullptr** यदि कोई मेल खाने वाला नोड नहीं मिला।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
