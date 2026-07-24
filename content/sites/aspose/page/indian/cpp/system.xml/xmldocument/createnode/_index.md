---
title: "System::Xml::XmlDocument::CreateNode मेथड"
linktitle: "CreateNode"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlDocument::CreateNode मेथड। C++ में निर्दिष्ट नोड प्रकार, XmlDocument::get_Name और XmlNode::get_NamespaceURI के साथ एक XmlNode बनाता है।"
type: docs
weight: 1100
url: /hi/cpp/system.xml/xmldocument/createnode/
---
## XmlDocument::CreateNode(const String\&, const String\&, const String\&) method


निर्दिष्ट नोड प्रकार, [XmlDocument::get_Name](../get_name/) और [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) के साथ एक [XmlNode](../../xmlnode/) बनाता है।

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(const String &nodeTypeString, const String &name, const String &namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| nodeTypeString | const String\& | नए नोड का [String](../../../system/string/) संस्करण, जो [XmlNodeType](../../xmlnodetype/) है। यह पैरामीटर नीचे तालिका में सूचीबद्ध मानों में से एक होना चाहिए। |
| name | const String\& | नए नोड का योग्य नाम। यदि नाम में कोलन हो, तो इसे [XmlNode::get_Prefix](../../xmlnode/get_prefix/) और [XmlDocument::get_LocalName](../get_localname/) घटकों में विभाजित किया जाता है। |
| namespaceURI | const String\& | नए नोड का नेमस्पेस URI। |

### ReturnValue

नया [XmlNode](../../xmlnode/)।
## टिप्पणियाँ



**nodeTypeString** पैरामीटर केस‑सेंसिटिव है और नीचे दी गई तालिका में से किसी एक मान होना चाहिए: |||
|-|-|
| nodeTypeString | XmlNodeType |
| attribute | Attribute |
| cdatasection | CDATA |
| comment | Comment |
| document | Document |
| documentfragment | DocumentFragment |
| documenttype | DocumentType |
| element | Element |
| entityreference | EntityReference |
| processinginstruction | ProcessingInstruction |
| significantwhitespace | SignificantWhitespace |
| text | Text |
| whitespace | रिक्त स्थान |

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&) method


निर्दिष्ट [XmlNodeType](../../xmlnodetype/), [XmlDocument::get_Name](../get_name/) और [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) के साथ एक [XmlNode](../../xmlnode/) बनाता है।

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &name, const String &namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| type | XmlNodeType | नए नोड का [XmlNodeType](../../xmlnodetype/)। |
| name | const String\& | नए नोड का योग्य नाम। यदि नाम में कोलन है तो इसे [XmlNode::get_Prefix](../../xmlnode/get_prefix/) और [XmlDocument::get_LocalName](../get_localname/) घटकों में विभाजित किया जाता है। |
| namespaceURI | const String\& | नए नोड का नेमस्पेस URI। |

### ReturnValue

नया [XmlNode](../../xmlnode/)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&, const String\&) method


निर्दिष्ट [XmlNodeType](../../xmlnodetype/), [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_Name](../get_name/) और [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) के साथ एक [XmlNode](../../xmlnode/) बनाता है।

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &prefix, const String &name, const String &namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| type | XmlNodeType | नए नोड का [XmlNodeType](../../xmlnodetype/)। |
| उपसर्ग | const String\& | नए नोड का उपसर्ग। |
| नाम | const String\& | नए नोड का स्थानीय नाम। |
| namespaceURI | const String\& | नए नोड का नेमस्पेस URI। |

### ReturnValue

नया [XmlNode](../../xmlnode/)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
