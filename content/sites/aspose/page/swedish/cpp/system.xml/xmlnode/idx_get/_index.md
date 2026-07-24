---
title: "System::Xml::XmlNode::idx_get metod"
linktitle: "idx_get"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlNode::idx_get metod. Returnerar det första barn‑elementet med de angivna XmlNode::get_LocalName‑ och XmlNode::get_NamespaceURI‑värdena i C++."
type: docs
weight: 3000
url: /sv/cpp/system.xml/xmlnode/idx_get/
---
## XmlNode::idx_get(String, String) method


Returnerar det första barn‑elementet med de angivna [XmlNode::get_LocalName](../get_localname/)‑ och [XmlNode::get_NamespaceURI](../get_namespaceuri/)‑värdena.

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String localname, String ns)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| localname | String | Det lokala namnet på elementet. |
| ns | String | Namespace‑URI för elementet. |

### ReturnValue

Det första [XmlElement](../../xmlelement/) med matchande **localname** och **ns**. Det returnerar **nullptr** om ingen matchning finns.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::idx_get(String) method


Returnerar det första barn‑elementet med den angivna [XmlNode::get_Name](../get_name/).

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String name)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| namn | String | Det kvalificerade namnet på elementet som ska hämtas. |

### ReturnValue

Det första [XmlElement](../../xmlelement/) som matchar det angivna namnet. Det returnerar **nullptr** om ingen matchning finns.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
