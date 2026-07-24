---
title: "System::Xml::XmlElement::SetAttributeNode method"
linktitle: "SetAttributeNode"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlElement::SetAttributeNode methode. Voegt het opgegeven XmlAttribute toe in C++."
type: docs
weight: 2700
url: /nl/cpp/system.xml/xmlelement/setattributenode/
---
## XmlElement::SetAttributeNode(SharedPtr\<XmlAttribute\>) method


Voegt het opgegeven [XmlAttribute](../../xmlattribute/) toe.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(SharedPtr<XmlAttribute> newAttr)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| newAttr | SharedPtr\<XmlAttribute\> | De [XmlAttribute](../../xmlattribute/) knoop die moet worden toegevoegd aan de attributencollectie voor dit element. |

### ReturnValue

Als het attribuut een bestaand attribuut met dezelfde naam vervangt, wordt het oude [XmlAttribute](../../xmlattribute/) geretourneerd; anders wordt **nullptr** geretourneerd.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::SetAttributeNode(String, String) method


Voegt het opgegeven [XmlAttribute](../../xmlattribute/) toe.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(String localName, String namespaceURI)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| localName | String | De lokale naam van het attribuut. |
| namespaceURI | String | De namespace-URI van het attribuut. |

### ReturnValue

De [XmlAttribute](../../xmlattribute/) om toe te voegen.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
