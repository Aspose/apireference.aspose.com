---
title: "System::Xml::XmlReader::ReadToNextSibling-Methode"
linktitle: "ReadToNextSibling"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlReader::ReadToNextSibling-Methode. Bewegt den XmlReader zum nächsten Geschwisterelement mit dem angegebenen lokalen Namen und Namespace-URI in C++."
type: docs
weight: 7300
url: /de/cpp/system.xml/xmlreader/readtonextsibling/
---
## XmlReader::ReadToNextSibling(String, String) method


Bewegt den [XmlReader](../) zum nächsten Geschwisterelement mit dem angegebenen lokalen Namen und Namespace-URI.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String localName, String namespaceURI)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| localName | String | Der lokale Name des Geschwisterelements, zu dem Sie wechseln möchten. |
| namespaceURI | String | Der Namespace-URI des Geschwisterelements, zu dem Sie wechseln möchten. |

### ReturnValue

**true** if a matching sibling element is found; otherwise, **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadToNextSibling(String) method


Verschiebt den [XmlReader](../) zum nächsten Geschwisterelement mit dem angegebenen qualifizierten Namen.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String name)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Der qualifizierte Name des Geschwisterelements, zu dem Sie wechseln möchten. |

### ReturnValue

**true** if a matching sibling element is found; otherwise **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
