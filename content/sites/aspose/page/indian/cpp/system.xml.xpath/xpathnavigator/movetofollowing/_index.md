---
title: "System::Xml::XPath::XPathNavigator::MoveToFollowing मेथड"
linktitle: "MoveToFollowing"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XPath::XPathNavigator::MoveToFollowing मेथड। दस्तावेज़ क्रम में निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले एलिमेंट पर XPathNavigator को ले जाता है C++ में।"
type: docs
weight: 5700
url: /hi/cpp/system.xml.xpath/xpathnavigator/movetofollowing/
---
## XPathNavigator::MoveToFollowing(String, String) method


दस्तावेज़ क्रम में निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले एलिमेंट पर [XPathNavigator](../) को ले जाता है।

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | String | एलिमेंट का स्थानीय नाम। |
| namespaceURI | String | एलिमेंट का नेमस्पेस URI। |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## संबंधित देखें

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(String, String, SharedPtr\<XPathNavigator\>) method


दस्तावेज़ क्रम में निर्दिष्ट सीमा तक, निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाले एलिमेंट पर [XPathNavigator](../) को ले जाता है।

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI, SharedPtr<XPathNavigator> end)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | String | एलिमेंट का स्थानीय नाम। |
| namespaceURI | String | एलिमेंट का नेमस्पेस URI। |
| end | SharedPtr\<XPathNavigator\> | वर्तमान [XPathNavigator](../) द्वारा अगले एलिमेंट की खोज के दौरान पार नहीं किया जा सकेगा, उस एलिमेंट सीमा पर स्थित [XPathNavigator](../) ऑब्जेक्ट। |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## संबंधित देखें

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType) method


दस्तावेज़ क्रम में निर्दिष्ट [XPathNodeType](../../xpathnodetype/) के अगले एलिमेंट पर [XPathNavigator](../) को ले जाता है।

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| type | XPathNodeType | एलिमेंट का [XPathNodeType](../../xpathnodetype/)। [XPathNodeType](../../xpathnodetype/) को [XPathNodeType::Attribute](../../xpathnodetype/) या [XPathNodeType::Namespace](../../xpathnodetype/) नहीं हो सकता। |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## संबंधित देखें

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType, SharedPtr\<XPathNavigator\>) method


[XPathNavigator](../) को निर्दिष्ट [XPathNodeType](../../xpathnodetype/) के अगले एलिमेंट पर, निर्दिष्ट सीमा तक, दस्तावेज़ क्रम में ले जाता है।

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type, SharedPtr<XPathNavigator> end)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| type | XPathNodeType | एलिमेंट का [XPathNodeType](../../xpathnodetype/)। [XPathNodeType](../../xpathnodetype/) को [XPathNodeType::Attribute](../../xpathnodetype/) या [XPathNodeType::Namespace](../../xpathnodetype/) नहीं हो सकता। |
| end | SharedPtr\<XPathNavigator\> | वर्तमान [XPathNavigator](../) द्वारा अगले एलिमेंट की खोज के दौरान पार नहीं किया जा सकेगा, उस एलिमेंट सीमा पर स्थित [XPathNavigator](../) ऑब्जेक्ट। |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## संबंधित देखें

* Enum [XPathNodeType](../../xpathnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
