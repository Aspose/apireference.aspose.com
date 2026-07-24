---
title: "System::Xml::XmlElement::GetElementsByTagName‑metod"
linktitle: "GetElementsByTagName"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlElement::GetElementsByTagName‑metod. Returnerar en XmlNodeList som innehåller en lista över alla underordnade element som matchar de angivna XmlElement::get_LocalName‑ och XmlElement::get_NamespaceURI‑värdena i C++."
type: docs
weight: 1500
url: /sv/cpp/system.xml/xmlelement/getelementsbytagname/
---
## XmlElement::GetElementsByTagName(String, String) method


Returnerar en [XmlNodeList](../../xmlnodelist/) som innehåller en lista över alla underordnade element som matchar de angivna [XmlElement::get_LocalName](../get_localname/)- och [XmlElement::get_NamespaceURI](../get_namespaceuri/)-värdena.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String localName, String namespaceURI)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| localName | String | Det lokala namnet att matcha. Asterisken (*) är ett specialvärde som matchar alla taggar. |
| namespaceURI | String | Namespace‑URI:n att matcha. |

### ReturnValue

En [XmlNodeList](../../xmlnodelist/) som innehåller en lista över alla matchande noder. Listan är tom om det inte finns några matchande noder.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetElementsByTagName(String) method


Returnerar en [XmlNodeList](../../xmlnodelist/) som innehåller en lista över alla underordnade element som matchar den angivna [XmlElement::get_Name](../get_name/).

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String name)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| namn | String | Namnet på taggen att matcha. Detta är ett kvalificerat namn. Det matchas mot **get_Name**‑värdet för den matchande noden. Asterisken (*) är ett specialvärde som matchar alla taggar. |

### ReturnValue

En [XmlNodeList](../../xmlnodelist/) som innehåller en lista över alla matchande noder. Listan är tom om det inte finns några matchande noder.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
