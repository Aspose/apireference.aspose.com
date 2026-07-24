---
title: "System::Xml::XmlNamedNodeMap::GetNamedItem method"
linktitle: "GetNamedItem"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNamedNodeMap::GetNamedItem method. Haalt een knooppunt op met de overeenkomende XmlNode::get_LocalName- en XmlNode::get_NamespaceURI-waarden in C++."
type: docs
weight: 700
url: /nl/cpp/system.xml/xmlnamednodemap/getnameditem/
---
## XmlNamedNodeMap::GetNamedItem(String, String) method


Haalt een knooppunt op met de overeenkomende [XmlNode::get_LocalName](../../xmlnode/get_localname/) en [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) waarden.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String localName, String namespaceURI)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| localName | String | De lokale naam van het knooppunt om op te halen. |
| namespaceURI | String | De namespace Uniform Resource Identifier (URI) van het knooppunt om op te halen. |

### ReturnValue

Een [XmlNode](../../xmlnode/) met de overeenkomende lokale naam en namespace-URI of **nullptr** als er geen overeenkomend knooppunt werd gevonden.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNamedNodeMap::GetNamedItem(String) method


Haalt een [XmlNode](../../xmlnode/) op die gespecificeerd is door naam.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String name)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | De gekwalificeerde naam van het knooppunt om op te halen. Deze wordt vergeleken met de [XmlNode::get_Name](../../xmlnode/get_name/)-waarde van het overeenkomende knooppunt. |

### ReturnValue

Een [XmlNode](../../xmlnode/) met de opgegeven naam of **nullptr** als er geen overeenkomend knooppunt wordt gevonden.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
