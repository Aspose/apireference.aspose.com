---
title: "System::Xml::XmlElement::GetElementsByTagName methode"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlElement::GetElementsByTagName methode. Retourneert een XmlNodeList met een lijst van alle afstammings‑elementen die overeenkomen met de opgegeven XmlElement::get_LocalName- en XmlElement::get_NamespaceURI-waarden in C++."
type: docs
weight: 1500
url: /nl/cpp/system.xml/xmlelement/getelementsbytagname/
---
## XmlElement::GetElementsByTagName(String, String) method


Retourneert een [XmlNodeList](../../xmlnodelist/) met een lijst van alle afstammings‑elementen die overeenkomen met de opgegeven [XmlElement::get_LocalName](../get_localname/) en [XmlElement::get_NamespaceURI](../get_namespaceuri/) waarden.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String localName, String namespaceURI)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| localName | String | De lokale naam om te matchen. Het sterretje (*) is een speciale waarde die alle tags overeenkomt. |
| namespaceURI | String | De namespace-URI om te matchen. |

### ReturnValue

Een [XmlNodeList](../../xmlnodelist/) die een lijst bevat van alle overeenkomende knooppunten. De lijst is leeg als er geen overeenkomende knooppunten zijn.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetElementsByTagName(String) method


Retourneert een [XmlNodeList](../../xmlnodelist/) die een lijst bevat van alle afstammende elementen die overeenkomen met de opgegeven [XmlElement::get_Name](../get_name/).

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String name)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | De naam-tag om te matchen. Dit is een gekwalificeerde naam. Het wordt vergeleken met de **get_Name**-waarde van het overeenkomende knooppunt. Het sterretje (*) is een speciale waarde die alle tags matcht. |

### ReturnValue

Een [XmlNodeList](../../xmlnodelist/) die een lijst bevat van alle overeenkomende knooppunten. De lijst is leeg als er geen overeenkomende knooppunten zijn.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
