---
title: "System::Xml::XPath::XPathNavigator::SelectDescendants मेथड"
linktitle: "SelectDescendants"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNavigator::SelectDescendants मेथड। C++ में निर्दिष्ट स्थानीय नाम और नेमस्पेस URI के साथ वर्तमान नोड के सभी वंशज नोड्स का चयन करता है।"
type: docs
weight: 7400
url: /hi/cpp/system.xml.xpath/xpathnavigator/selectdescendants/
---
## XPathNavigator::SelectDescendants(String, String, bool) method


वर्तमान नोड के सभी ऐसे वंशज नोड्स को चुनता है जिनका लोकल नाम और नेमस्पेस URI निर्दिष्ट है।

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(String name, String namespaceURI, bool matchSelf)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | वंशज नोड्स का स्थानीय नाम। |
| namespaceURI | String | वंशज नोड्स का नेमस्पेस URI। |
| matchSelf | bool | **true** चयन में कॉन्टेक्स्ट नोड को शामिल करने के लिए; अन्यथा, **false**। |

### ReturnValue

चयनित नोड्स को शामिल करने वाला एक [XPathNodeIterator](../../xpathnodeiterator/)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectDescendants(XPathNodeType, bool) method


वर्तमान नोड के सभी वंशज नोड्स का चयन करता है जिनका मिलते-जुलते [XPathNodeType](../../xpathnodetype/) हो।

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(XPathNodeType type, bool matchSelf)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| type | XPathNodeType | वंशज नोड्स का [XPathNodeType](../../xpathnodetype/)। |
| matchSelf | bool | **true** चयन में कॉन्टेक्स्ट नोड को शामिल करने के लिए; अन्यथा, **false**। |

### ReturnValue

चयनित नोड्स को शामिल करने वाला एक [XPathNodeIterator](../../xpathnodeiterator/)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
