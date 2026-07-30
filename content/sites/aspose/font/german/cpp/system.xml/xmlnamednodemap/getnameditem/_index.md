---
title: "System::Xml::XmlNamedNodeMap::GetNamedItem-Methode"
linktitle: "GetNamedItem"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNamedNodeMap::GetNamedItem-Methode. Ruft einen Knoten mit den passenden XmlNode::get_LocalName- und XmlNode::get_NamespaceURI-Werten ab in C++."
type: docs
weight: 700
url: /de/cpp/system.xml/xmlnamednodemap/getnameditem/
---
## XmlNamedNodeMap::GetNamedItem(String, String) method


Ruft einen Knoten mit den passenden [XmlNode::get_LocalName](../../xmlnode/get_localname/) und [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) Werten ab.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String localName, String namespaceURI)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| localName | String | Der lokale Name des abzurufenden Knotens. |
| namespaceURI | String | Der Namespace Uniform Resource Identifier (URI) des abzurufenden Knotens. |

### ReturnValue

Ein [XmlNode](../../xmlnode/) mit dem passenden lokalen Namen und Namespace-URI oder **nullptr**, falls kein passender Knoten gefunden wurde.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNamedNodeMap::GetNamedItem(String) method


Ruft ein [XmlNode](../../xmlnode/) anhand des Namens ab.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String name)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| name | String | Der qualifizierte Name des abzurufenden Knotens. Er wird mit dem Wert von [XmlNode::get_Name](../../xmlnode/get_name/) des passenden Knotens verglichen. |

### ReturnValue

Ein [XmlNode](../../xmlnode/) mit dem angegebenen Namen oder **nullptr**, falls kein passender Knoten gefunden wird.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
