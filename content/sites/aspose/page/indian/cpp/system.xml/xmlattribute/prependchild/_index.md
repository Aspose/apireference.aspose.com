---
title: "System::Xml::XmlAttribute::PrependChild मेथड"
linktitle: "PrependChild"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlAttribute::PrependChild मेथड। निर्दिष्ट नोड को इस नोड के चाइल्ड नोड्स की सूची की शुरुआत में जोड़ता है C++ में।"
type: docs
weight: 1600
url: /hi/cpp/system.xml/xmlattribute/prependchild/
---
## XmlAttribute::PrependChild method


इस नोड के चाइल्ड नोड्स की सूची की शुरुआत में निर्दिष्ट नोड को जोड़ता है।

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::PrependChild(SharedPtr<XmlNode> newChild) override
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | जोड़ने के लिए [XmlNode](../../xmlnode/)। यदि यह एक [XmlDocumentFragment](../../xmldocumentfragment/) है, तो दस्तावेज़ फ्रैगमेंट की पूरी सामग्री इस नोड की चाइल्ड सूची में स्थानांतरित हो जाती है। |

### ReturnValue

जोड़ा गया [XmlNode](../../xmlnode/)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
