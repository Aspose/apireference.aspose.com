---
title: "System::Xml::XmlReader::ReadToNextSibling methode"
linktitle: "ReadToNextSibling"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlReader::ReadToNextSibling methode. Verplaatst de XmlReader naar het volgende broerelement met de opgegeven lokale naam en namespace-URI in C++."
type: docs
weight: 7300
url: /nl/cpp/system.xml/xmlreader/readtonextsibling/
---
## XmlReader::ReadToNextSibling(String, String) method


Verplaatst de [XmlReader](../) naar het volgende broerelement met de opgegeven lokale naam en namespace-URI.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String localName, String namespaceURI)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| localName | String | De lokale naam van het broerelement waarnaar u wilt verplaatsen. |
| namespaceURI | String | De namespace-URI van het broerelement waarnaar u wilt verplaatsen. |

### ReturnValue

**true** if a matching sibling element is found; otherwise, **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadToNextSibling(String) method


Verplaatst de [XmlReader](../) naar het volgende broerelement met de opgegeven gekwalificeerde naam.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String name)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| name | String | De gekwalificeerde naam van het broerelement waarnaar u wilt verplaatsen. |

### ReturnValue

**true** if a matching sibling element is found; otherwise **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
