---
title: "System::Xml::XmlElement::GetAttributeNode metod"
linktitle: "GetAttributeNode"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlElement::GetAttributeNode metod. Returnerar XmlAttribute med det angivna lokala namnet och namnområdets URI i C++."
type: docs
weight: 1400
url: /sv/cpp/system.xml/xmlelement/getattributenode/
---
## XmlElement::GetAttributeNode(String, String) method


Returnerar [XmlAttribute](../../xmlattribute/) med det angivna lokala namnet och namnområdets URI.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String localName, String namespaceURI)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| localName | String | Det lokala namnet på attributet. |
| namespaceURI | String | Namnrymd‑URI:n för attributet. |

### ReturnValue

Den angivna [XmlAttribute](../../xmlattribute/) eller **nullptr** om ett matchande attribut inte hittades.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetAttributeNode(String) method


Returnerar [XmlAttribute](../../xmlattribute/) med det angivna namnet.

```cpp
virtual SharedPtr<XmlAttribute> System::Xml::XmlElement::GetAttributeNode(String name)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| namn | String | Namnet på attributet som ska hämtas. Detta är ett kvalificerat namn. Det matchas mot värdet **get_Name** för den matchande noden. |

### ReturnValue

Den angivna [XmlAttribute](../../xmlattribute/) eller **nullptr** om ett matchande attribut inte hittades.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttribute](../../xmlattribute/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
