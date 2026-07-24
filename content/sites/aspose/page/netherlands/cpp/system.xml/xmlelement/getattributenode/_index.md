---
title: "System::Xml::XmlElement::GetAttributeNode method"
linktitle: "GetAttributeNode"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlElement::GetAttributeNode method. Retourneert de XmlAttribute met de opgegeven lokale naam en namespace-URI in C++."
type: docs
weight: 1400
url: /nl/cpp/system.xml/xmlelement/getattributenode/
---
## XmlElement::GetAttributeNode(String, String) method


Retourneert de [XmlAttribute](../../xmlattribute/) met de opgegeven lokale naam en namespace-URI.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String localName, String namespaceURI)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| localName | String | De lokale naam van het attribuut. |
| namespaceURI | String | De namespace-URI van het attribuut. |

### ReturnValue

De opgegeven [XmlAttribute](../../xmlattribute/) of **nullptr** als een overeenkomend attribuut niet werd gevonden.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetAttributeNode(String) method


Retourneert de [XmlAttribute](../../xmlattribute/) met de opgegeven naam.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String name)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | De naam van het attribuut om op te halen. Dit is een gekwalificeerde naam. Het wordt vergeleken met de **get_Name**-waarde van het overeenkomende knooppunt. |

### ReturnValue

De opgegeven [XmlAttribute](../../xmlattribute/) of **nullptr** als een overeenkomend attribuut niet werd gevonden.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
