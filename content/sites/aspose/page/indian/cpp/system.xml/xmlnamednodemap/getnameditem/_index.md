---
title: "System::Xml::XmlNamedNodeMap::GetNamedItem method"
linktitle: "GetNamedItem"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNamedNodeMap::GetNamedItem method. C++ में मिलते‑जुलते XmlNode::get_LocalName और XmlNode::get_NamespaceURI मानों के साथ एक नोड प्राप्त करता है।"
type: docs
weight: 700
url: /hi/cpp/system.xml/xmlnamednodemap/getnameditem/
---
## XmlNamedNodeMap::GetNamedItem(String, String) method


मिलते‑जुलते [XmlNode::get_LocalName](../../xmlnode/get_localname/) और [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) मानों के साथ एक नोड प्राप्त करता है।

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String localName, String namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | String | प्राप्त करने के लिए नोड का स्थानीय नाम। |
| namespaceURI | String | प्राप्त करने के लिए नोड का नेमस्पेस यूनिफॉर्म रिसोर्स आइडेंटिफायर (URI)। |

### ReturnValue

एक [XmlNode](../../xmlnode/) जिसमें मिलते‑जुलते स्थानीय नाम और नेमस्पेस URI हों, या **nullptr** यदि मिलते‑जुलते नोड नहीं मिला।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNamedNodeMap::GetNamedItem(String) method


नाम द्वारा निर्दिष्ट एक [XmlNode](../../xmlnode/) प्राप्त करता है।

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String name)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| name | String | प्राप्त करने के लिए नोड का योग्य नाम। यह मिलते‑जुलते नोड के [XmlNode::get_Name](../../xmlnode/get_name/) मान से तुलना किया जाता है। |

### ReturnValue

निर्दिष्ट नाम वाला एक [XmlNode](../../xmlnode/), या **nullptr** यदि मिलते‑जुलते नोड नहीं मिला।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
