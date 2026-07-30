---
title: "System::Xml::XmlElement::RemoveAttributeNode Methode"
linktitle: "RemoveAttributeNode"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlElement::RemoveAttributeNode Methode. Entfernt das angegebene XmlAttribute in C++."
type: docs
weight: 2100
url: /de/cpp/system.xml/xmlelement/removeattributenode/
---
## XmlElement::RemoveAttributeNode(SharedPtr\<XmlAttribute\>) method


Entfernt das angegebene [XmlAttribute](../../xmlattribute/).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(SharedPtr<XmlAttribute> oldAttr)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| oldAttr | SharedPtr\<XmlAttribute\> | Der zu entfernende [XmlAttribute](../../xmlattribute/)-Knoten. Hat das entfernte Attribut einen Standardwert, wird dieser sofort ersetzt. |

### ReturnValue

Das entfernte [XmlAttribute](../../xmlattribute/) oder **nullptr**, wenn **oldAttr** kein Attributknoten des [XmlElement](../) ist.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::RemoveAttributeNode(String, String) method


Entfernt das [XmlAttribute](../../xmlattribute/) anhand des lokalen Namens und des Namespace-URI. (Hat das entfernte Attribut einen Standardwert, wird dieser sofort ersetzt).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::RemoveAttributeNode(String localName, String namespaceURI)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| localName | String | Der lokale Name des Attributs. |
| namespaceURI | String | Der Namespace-URI des Attributs. |

### ReturnValue

Das entfernte [XmlAttribute](../../xmlattribute/) oder **nullptr**, falls das [XmlElement](../) keinen passenden Attributknoten hat.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
