---
title: "System::Xml::XmlNamedNodeMap::RemoveNamedItem-Methode"
linktitle: "RemoveNamedItem"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNamedNodeMap::RemoveNamedItem-Methode. Entfernt ein Knoten mit den passenden XmlNode::get_LocalName- und XmlNode::get_NamespaceURI-Werten in C++."
type: docs
weight: 900
url: /de/cpp/system.xml/xmlnamednodemap/removenameditem/
---
## XmlNamedNodeMap::RemoveNamedItem(String, String) method


Entfernt einen Knoten mit den passenden [XmlNode::get_LocalName](../../xmlnode/get_localname/) und [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) Werten.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String localName, String namespaceURI)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| localName | String | Der lokale Name des zu entfernenden Knotens. |
| namespaceURI | String | Der Namespace-URI des zu entfernenden Knotens. |

### ReturnValue

Der [XmlNode](../../xmlnode/) entfernt oder **nullptr**, falls kein passender Knoten gefunden wurde.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNamedNodeMap::RemoveNamedItem(String) method


Entfernt den Knoten aus dem [XmlNamedNodeMap](../).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String name)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| name | String | Der qualifizierte Name des zu entfernenden Knotens. Der Name wird mit dem Wert von [XmlNode::get_Name](../../xmlnode/get_name/) des passenden Knotens verglichen. |

### ReturnValue

Der [XmlNode](../../xmlnode/) aus diesem [XmlNamedNodeMap](../) entfernt oder **nullptr**, falls kein passender Knoten gefunden wurde.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
