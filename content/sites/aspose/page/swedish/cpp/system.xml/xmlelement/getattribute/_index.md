---
title: "System::Xml::XmlElement::GetAttribute-metod"
linktitle: "GetAttribute"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlElement::GetAttribute-metod. Returnerar värdet för attributet med det angivna lokala namnet och namnrymds-URI:n i C++."
type: docs
weight: 1300
url: /sv/cpp/system.xml/xmlelement/getattribute/
---
## XmlElement::GetAttribute(String, String) method


Returnerar värdet för attributet med det angivna lokala namnet och namnrymdens URI.

```cpp
virtual String System::Xml::XmlElement::GetAttribute(String localName, String namespaceURI)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| localName | String | Det lokala namnet på attributet som ska hämtas. |
| namespaceURI | String | Namnområdets URI för attributet som ska hämtas. |

### ReturnValue

Värdet för det angivna attributet. En tom sträng returneras om ett matchande attribut inte hittas eller om attributet inte har ett angivet eller standardvärde.

## Se även

* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetAttribute(String) method


Returnerar värdet för attributet med det angivna namnet.

```cpp
virtual String System::Xml::XmlElement::GetAttribute(String name)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| namn | String | Namnet på attributet som ska hämtas. Detta är ett kvalificerat namn. Det matchas mot värdet **get_Name** för den matchande noden. |

### ReturnValue

Värdet för det angivna attributet. En tom sträng returneras om ett matchande attribut inte hittas eller om attributet inte har ett angivet eller standardvärde.

## Se även

* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
