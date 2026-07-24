---
title: "System::Xml::XPath::XPathNavigator::SelectChildren method"
linktitle: "SelectChildren"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNavigator::SelectChildren method. C++ में निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले वर्तमान नोड के सभी चाइल्ड नोड्स को चुनता है।"
type: docs
weight: 7300
url: /hi/cpp/system.xml.xpath/xpathnavigator/selectchildren/
---
## XPathNavigator::SelectChildren(String, String) method


वर्तमान नोड के सभी ऐसे चाइल्ड नोड्स को चुनता है जिनका लोकल नाम और नेमस्पेस URI निर्दिष्ट है।

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectChildren(String name, String namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | चाइल्ड नोड्स का स्थानीय नाम। |
| namespaceURI | String | चाइल्ड नोड्स का नेमस्पेस URI। |

### ReturnValue

चयनित नोड्स को शामिल करने वाला एक [XPathNodeIterator](../../xpathnodeiterator/)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectChildren(XPathNodeType) method


वर्तमान नोड के सभी चाइल्ड नोड्स को चुनता है जिनका [XPathNodeType](../../xpathnodetype/) मेल खाता है।

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectChildren(XPathNodeType type)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| type | XPathNodeType | चाइल्ड नोड्स का [XPathNodeType](../../xpathnodetype/)। |

### ReturnValue

चयनित नोड्स को शामिल करने वाला एक [XPathNodeIterator](../../xpathnodeiterator/)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
