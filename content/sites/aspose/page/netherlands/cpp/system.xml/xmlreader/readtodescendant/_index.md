---
title: "System::Xml::XmlReader::ReadToDescendant methode"
linktitle: "ReadToDescendant"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlReader::ReadToDescendant methode. Verplaatst de XmlReader naar het volgende afstammings‑element met de opgegeven lokale naam en namespace‑URI in C++."
type: docs
weight: 7100
url: /nl/cpp/system.xml/xmlreader/readtodescendant/
---
## XmlReader::ReadToDescendant(String, String) method


Verplaatst de [XmlReader](../) naar het volgende afstammings‑element met de opgegeven lokale naam en namespace‑URI.

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String localName, String namespaceURI)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| localName | String | De lokale naam van het element waarnaar u wilt verplaatsen. |
| namespaceURI | String | De namespace‑URI van het element waarnaar u wilt verplaatsen. |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String,String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadToDescendant(String) method


Verplaatst de [XmlReader](../) naar het volgende afstammings‑element met de opgegeven gekwalificeerde naam.

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String name)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | De gekwalificeerde naam van het element waarnaar u wilt verplaatsen. |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
