---
title: "System::Xml::XmlElement::RemoveAttributeNode methode"
linktitle: "RemoveAttributeNode"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlElement::RemoveAttributeNode methode. Verwijdert de opgegeven XmlAttribute in C++."
type: docs
weight: 2100
url: /nl/cpp/system.xml/xmlelement/removeattributenode/
---
## XmlElement::RemoveAttributeNode(SharedPtr\<XmlAttribute\>) method


Verwijdert de opgegeven [XmlAttribute](../../xmlattribute/).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(SharedPtr<XmlAttribute> oldAttr)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| oldAttr | SharedPtr\<XmlAttribute\> | Het [XmlAttribute](../../xmlattribute/) knooppunt dat moet worden verwijderd. Als het verwijderde attribuut een standaardwaarde heeft, wordt deze onmiddellijk vervangen. |

### ReturnValue

Het verwijderde [XmlAttribute](../../xmlattribute/) of **nullptr** als **oldAttr** geen attribuutknooppunt is van het [XmlElement](../).

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::RemoveAttributeNode(String, String) method


Verwijdert het [XmlAttribute](../../xmlattribute/) dat is gespecificeerd door de lokale naam en namespace-URI. (Als het verwijderde attribuut een standaardwaarde heeft, wordt deze onmiddellijk vervangen).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(String localName, String namespaceURI)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| localName | String | De lokale naam van het attribuut. |
| namespaceURI | String | De namespace-URI van het attribuut. |

### ReturnValue

Het verwijderde [XmlAttribute](../../xmlattribute/) of **nullptr** als het [XmlElement](../) geen overeenkomend attribuutknooppunt heeft.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
