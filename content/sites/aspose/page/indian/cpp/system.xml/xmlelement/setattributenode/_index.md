---
title: "System::Xml::XmlElement::SetAttributeNode विधि"
linktitle: "SetAttributeNode"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlElement::SetAttributeNode मेथड। निर्दिष्ट XmlAttribute को C++ में जोड़ता है।"
type: docs
weight: 2700
url: /hi/cpp/system.xml/xmlelement/setattributenode/
---
## XmlElement::SetAttributeNode(SharedPtr\<XmlAttribute\>) method


निर्दिष्ट [XmlAttribute](../../xmlattribute/) को जोड़ता है।

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(SharedPtr<XmlAttribute> newAttr)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| newAttr | SharedPtr\<XmlAttribute\> | इस तत्व के लिए एट्रिब्यूट संग्रह में जोड़ने हेतु [XmlAttribute](../../xmlattribute/) नोड। |

### ReturnValue

यदि एट्रिब्यूट समान नाम वाले मौजूदा एट्रिब्यूट को बदलता है, तो पुराना [XmlAttribute](../../xmlattribute/) लौटाया जाता है; अन्यथा, **nullptr** लौटाया जाता है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::SetAttributeNode(String, String) method


निर्दिष्ट [XmlAttribute](../../xmlattribute/) को जोड़ता है।

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(String localName, String namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | String | एट्रिब्यूट का स्थानीय नाम। |
| namespaceURI | String | एट्रिब्यूट का नेमस्पेस URI। |

### ReturnValue

जोड़ने के लिए [XmlAttribute](../../xmlattribute/)।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
