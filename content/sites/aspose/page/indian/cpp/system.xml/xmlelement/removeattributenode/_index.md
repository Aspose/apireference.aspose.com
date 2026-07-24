---
title: "System::Xml::XmlElement::RemoveAttributeNode method"
linktitle: "RemoveAttributeNode"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlElement::RemoveAttributeNode मेथड। निर्दिष्ट XmlAttribute को C++ में हटाता है।"
type: docs
weight: 2100
url: /hi/cpp/system.xml/xmlelement/removeattributenode/
---
## XmlElement::RemoveAttributeNode(SharedPtr\<XmlAttribute\>) method


निर्दिष्ट [XmlAttribute](../../xmlattribute/) को हटाता है।

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(SharedPtr<XmlAttribute> oldAttr)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| oldAttr | SharedPtr\<XmlAttribute\> | [XmlAttribute](../../xmlattribute/) नोड जिसे हटाना है। यदि हटाए गए एट्रिब्यूट का डिफ़ॉल्ट मान है, तो वह तुरंत प्रतिस्थापित किया जाता है। |

### ReturnValue

हटाया गया [XmlAttribute](../../xmlattribute/) या **nullptr** यदि **oldAttr** [XmlElement](../) का एट्रिब्यूट नोड नहीं है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::RemoveAttributeNode(String, String) method


[XmlAttribute](../../xmlattribute/) को स्थानीय नाम और नेमस्पेस URI द्वारा निर्दिष्ट करके हटाता है। (यदि हटाए गए एट्रिब्यूट का डिफ़ॉल्ट मान है, तो वह तुरंत प्रतिस्थापित किया जाता है)।

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(String localName, String namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | String | एट्रिब्यूट का स्थानीय नाम। |
| namespaceURI | String | एट्रिब्यूट का नेमस्पेस URI। |

### ReturnValue

हटाया गया [XmlAttribute](../../xmlattribute/) या **nullptr** यदि [XmlElement](../) के पास मिलते-जुलते एट्रिब्यूट नोड नहीं है।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
