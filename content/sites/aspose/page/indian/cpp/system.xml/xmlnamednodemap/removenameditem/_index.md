---
title: "System::Xml::XmlNamedNodeMap::RemoveNamedItem method"
linktitle: "RemoveNamedItem"
second_title: "Aspose.Page C++ के लिए"
description: "System::Xml::XmlNamedNodeMap::RemoveNamedItem method. C++ में मिलते‑जुलते XmlNode::get_LocalName और XmlNode::get_NamespaceURI मानों वाले नोड को हटाता है।"
type: docs
weight: 900
url: /hi/cpp/system.xml/xmlnamednodemap/removenameditem/
---
## XmlNamedNodeMap::RemoveNamedItem(String, String) method


मिलते‑जुलते [XmlNode::get_LocalName](../../xmlnode/get_localname/) और [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) मानों वाले नोड को हटाता है।

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String localName, String namespaceURI)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| localName | String | हटाने के लिए नोड का स्थानीय नाम। |
| namespaceURI | String | हटाने के लिए नोड का नेमस्पेस URI। |

### ReturnValue

हटाया गया [XmlNode](../../xmlnode/) या **nullptr** यदि मिलते‑जुलते नोड नहीं मिला।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNamedNodeMap::RemoveNamedItem(String) method


नोड को [XmlNamedNodeMap](../) से हटाता है।

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String name)
```


| पैरामीटर | प्रकार | विवरण |
| --- | --- | --- |
| name | String | हटाने के लिए नोड का योग्य नाम। यह नाम मिलते‑जुलते नोड के [XmlNode::get_Name](../../xmlnode/get_name/) मान से तुलना किया जाता है। |

### ReturnValue

इस [XmlNamedNodeMap](../) से हटाया गया [XmlNode](../../xmlnode/) या **nullptr** यदि मिलते‑जुलते नोड नहीं मिला।

## संबंधित देखें

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
