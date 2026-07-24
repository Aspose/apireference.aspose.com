---
title: "System::Xml::XmlNode::SelectNodes विधि"
linktitle: "SelectNodes"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNode::SelectNodes विधि. C++ में XPath अभिव्यक्ति से मेल खाने वाले नोड्स की सूची का चयन करता है।"
type: docs
weight: 3800
url: /hi/cpp/system.xml/xmlnode/selectnodes/
---
## XmlNode::SelectNodes(const String\&) method


[XPath](../../../system.xml.xpath/) अभिव्यक्ति से मेल खाने वाले नोड्स की सूची का चयन करता है।

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xpath | const String\& | यह [XPath](../../../system.xml.xpath/) अभिव्यक्ति। |

### ReturnValue

[XmlNodeList](../../xmlnodelist/) जिसमें [XPath](../../../system.xml.xpath/) क्वेरी से मेल खाने वाले नोड्स का संग्रह है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::SelectNodes(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


[XPath](../../../system.xml.xpath/) अभिव्यक्ति से मेल खाने वाले नोड्स की सूची का चयन करता है। [XPath](../../../system.xml.xpath/) अभिव्यक्ति में पाए गए किसी भी उपसर्ग को प्रदान किए गए [XmlNamespaceManager](../../xmlnamespacemanager/) का उपयोग करके हल किया जाता है।

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| xpath | const String\& | यह [XPath](../../../system.xml.xpath/) अभिव्यक्ति। |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | [XPath](../../../system.xml.xpath/) अभिव्यक्ति में उपसर्गों के लिए नेमस्पेस को हल करने हेतु एक [XmlNamespaceManager](../../xmlnamespacemanager/)। |

### ReturnValue

[XmlNodeList](../../xmlnodelist/) जिसमें [XPath](../../../system.xml.xpath/) क्वेरी से मेल खाने वाले नोड्स का संग्रह है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
