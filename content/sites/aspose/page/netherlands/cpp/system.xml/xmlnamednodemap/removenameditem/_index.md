---
title: "System::Xml::XmlNamedNodeMap::RemoveNamedItem method"
linktitle: "RemoveNamedItem"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNamedNodeMap::RemoveNamedItem method. Verwijdert een knooppunt met de overeenkomende XmlNode::get_LocalName- en XmlNode::get_NamespaceURI-waarden in C++."
type: docs
weight: 900
url: /nl/cpp/system.xml/xmlnamednodemap/removenameditem/
---
## XmlNamedNodeMap::RemoveNamedItem(String, String) method


Verwijdert een knooppunt met de overeenkomende [XmlNode::get_LocalName](../../xmlnode/get_localname/) en [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) waarden.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String localName, String namespaceURI)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| localName | String | De lokale naam van het knooppunt om te verwijderen. |
| namespaceURI | String | De namespace-URI van het knooppunt om te verwijderen. |

### ReturnValue

De [XmlNode](../../xmlnode/) verwijderd of **nullptr** als er geen overeenkomend knooppunt werd gevonden.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNamedNodeMap::RemoveNamedItem(String) method


Verwijdert het knooppunt uit de [XmlNamedNodeMap](../).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String name)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | De gekwalificeerde naam van het knooppunt om te verwijderen. De naam wordt vergeleken met de [XmlNode::get_Name](../../xmlnode/get_name/)-waarde van het overeenkomende knooppunt. |

### ReturnValue

De [XmlNode](../../xmlnode/) verwijderd uit deze [XmlNamedNodeMap](../) of **nullptr** als er geen overeenkomend knooppunt werd gevonden.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
