---
title: "System::Xml::XmlElement::SetAttributeNode Methode"
linktitle: "SetAttributeNode"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlElement::SetAttributeNode Methode. Fügt das angegebene XmlAttribute in C++ hinzu."
type: docs
weight: 2700
url: /de/cpp/system.xml/xmlelement/setattributenode/
---
## XmlElement::SetAttributeNode(SharedPtr\<XmlAttribute\>) method


Fügt das angegebene [XmlAttribute](../../xmlattribute/) hinzu.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(SharedPtr<XmlAttribute> newAttr)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| newAttr | SharedPtr\<XmlAttribute\> | Der [XmlAttribute](../../xmlattribute/)-Knoten, der zur Attributsammlung dieses Elements hinzugefügt werden soll. |

### ReturnValue

Wenn das Attribut ein vorhandenes Attribut mit demselben Namen ersetzt, wird das alte [XmlAttribute](../../xmlattribute/) zurückgegeben; andernfalls wird **nullptr** zurückgegeben.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlElement::SetAttributeNode(String, String) method


Fügt das angegebene [XmlAttribute](../../xmlattribute/) hinzu.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(String localName, String namespaceURI)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| localName | String | Der lokale Name des Attributs. |
| namespaceURI | String | Der Namespace-URI des Attributs. |

### ReturnValue

Das hinzuzufügende [XmlAttribute](../../xmlattribute/).

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
