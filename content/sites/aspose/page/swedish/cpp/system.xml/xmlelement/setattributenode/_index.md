---
title: "System::Xml::XmlElement::SetAttributeNode metod"
linktitle: "SetAttributeNode"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlElement::SetAttributeNode metod. Lägger till den angivna XmlAttribute i C++."
type: docs
weight: 2700
url: /sv/cpp/system.xml/xmlelement/setattributenode/
---
## XmlElement::SetAttributeNode(SharedPtr\<XmlAttribute\>) method


Lägger till den angivna [XmlAttribute](../../xmlattribute/).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(SharedPtr<XmlAttribute> newAttr)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| newAttr | SharedPtr\<XmlAttribute\> | Den [XmlAttribute](../../xmlattribute/) noden att lägga till i attributsamlingen för detta element. |

### ReturnValue

Om attributet ersätter ett befintligt attribut med samma namn, returneras det gamla [XmlAttribute](../../xmlattribute/); annars returneras **nullptr**.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::SetAttributeNode(String, String) method


Lägger till den angivna [XmlAttribute](../../xmlattribute/).

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::SetAttributeNode(String localName, String namespaceURI)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| localName | String | Det lokala namnet på attributet. |
| namespaceURI | String | Namnrymd‑URI:n för attributet. |

### ReturnValue

Den [XmlAttribute](../../xmlattribute/) att lägga till.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
