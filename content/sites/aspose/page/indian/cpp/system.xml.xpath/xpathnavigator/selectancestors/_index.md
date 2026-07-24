---
title: "System::Xml::XPath::XPathNavigator::SelectAncestors मेथड"
linktitle: "SelectAncestors"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNavigator::SelectAncestors मेथड। C++ में वर्तमान नोड के सभी पूर्वज नोड्स को चुनता है जिनका निर्दिष्ट स्थानीय नाम और नेमस्पेस URI है।"
type: docs
weight: 7200
url: /hi/cpp/system.xml.xpath/xpathnavigator/selectancestors/
---
## XPathNavigator::SelectAncestors(String, String, bool) method


वर्तमान नोड के सभी ऐसे पूर्वज नोड्स को चुनता है जिनका निर्दिष्ट लोकल नाम और नेमस्पेस URI हो।

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(String name, String namespaceURI, bool matchSelf)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | पूर्वज नोड्स का स्थानीय नाम। |
| namespaceURI | String | पूर्वज नोड्स का नेमस्पेस URI। |
| matchSelf | bool | चयन में संदर्भ नोड को शामिल करने के लिए, **true**; अन्यथा, **false**. |

### ReturnValue

एक [XPathNodeIterator](../../xpathnodeiterator/) जो चयनित नोड्स को समाहित करता है। लौटाए गए नोड्स उल्टे दस्तावेज़ क्रम में होते हैं।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectAncestors(XPathNodeType, bool) method


वर्तमान नोड के सभी पूर्वज नोड्स को चुनता है जिनका मेल खाने वाला [XPathNodeType](../../xpathnodetype/) है।

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(XPathNodeType type, bool matchSelf)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| type | XPathNodeType | पूर्वज नोड्स का [XPathNodeType](../../xpathnodetype/)। |
| matchSelf | bool | चयन में संदर्भ नोड को शामिल करने के लिए, **true**; अन्यथा, **false**. |

### ReturnValue

एक [XPathNodeIterator](../../xpathnodeiterator/) जो चयनित नोड्स को समाहित करता है। लौटाए गए नोड्स उल्टे दस्तावेज़ क्रम में होते हैं।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
