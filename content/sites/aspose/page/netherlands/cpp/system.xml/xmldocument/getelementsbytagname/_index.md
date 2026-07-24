---
title: "System::Xml::XmlDocument::GetElementsByTagName methode"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlDocument::GetElementsByTagName methode. Retourneert een XmlNodeList met een lijst van alle afstammings-elementen die overeenkomen met de opgegeven XmlDocument::get_LocalName en XmlNode::get_NamespaceURI in C++."
type: docs
weight: 3200
url: /nl/cpp/system.xml/xmldocument/getelementsbytagname/
---
## XmlDocument::GetElementsByTagName(String, String) method


Retourneert een [XmlNodeList](../../xmlnodelist/) met een lijst van alle afstammings-elementen die overeenkomen met de opgegeven [XmlDocument::get_LocalName](../get_localname/) en [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String localName, String namespaceURI)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| localName | String | De LocalName om te vergelijken. De speciale waarde **\"*\"** komt overeen met alle tags. |
| namespaceURI | String | NamespaceURI om te vergelijken. |

### ReturnValue

Een [XmlNodeList](../../xmlnodelist/) met een lijst van alle overeenkomende knooppunten. Als er geen knooppunten overeenkomen met de opgegeven **localName** en **namespaceURI**, zal de geretourneerde collectie leeg zijn.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::GetElementsByTagName(String) method


Retourneert een [XmlNodeList](../../xmlnodelist/) met een lijst van alle afstammings-elementen die overeenkomen met de opgegeven naam.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String name)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | De gekwalificeerde naam om te vergelijken. Deze wordt vergeleken met de **get_Name**‑waarde van het overeenkomende knooppunt. De speciale waarde **\"*\"** komt overeen met alle tags. |

### ReturnValue

Een [XmlNodeList](../../xmlnodelist/) met een lijst van alle overeenkomende knooppunten. Als er geen knooppunten overeenkomen met **name**, zal de geretourneerde collectie leeg zijn.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
