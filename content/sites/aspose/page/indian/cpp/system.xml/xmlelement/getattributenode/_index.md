---
title: "System::Xml::XmlElement::GetAttributeNode विधि"
linktitle: "GetAttributeNode"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlElement::GetAttributeNode विधि। निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाला XmlAttribute C++ में लौटाता है।"
type: docs
weight: 1400
url: /hi/cpp/system.xml/xmlelement/getattributenode/
---
## XmlElement::GetAttributeNode(String, String) method


निर्दिष्ट स्थानीय नाम और नेमस्पेस URI वाला [XmlAttribute](../../xmlattribute/) लौटाता है।

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String localName, String namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | String | एट्रिब्यूट का स्थानीय नाम। |
| namespaceURI | String | एट्रिब्यूट का नेमस्पेस URI। |

### ReturnValue

निर्दिष्ट [XmlAttribute](../../xmlattribute/) या **nullptr** यदि मिलते-जुलते गुणधर्म नहीं मिला।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetAttributeNode(String) method


निर्दिष्ट नाम वाला [XmlAttribute](../../xmlattribute/) लौटाता है।

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String name)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| नाम | String | प्राप्त करने के लिए गुणधर्म का नाम। यह एक योग्य नाम है। यह मिलते-जुलते नोड के **get_Name** मान के विरुद्ध मिलान किया जाता है। |

### ReturnValue

निर्दिष्ट [XmlAttribute](../../xmlattribute/) या **nullptr** यदि मिलते-जुलते गुणधर्म नहीं मिला।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
