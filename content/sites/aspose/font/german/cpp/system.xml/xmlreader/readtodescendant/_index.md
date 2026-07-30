---
title: "System::Xml::XmlReader::ReadToDescendant-Methode"
linktitle: "ReadToDescendant"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlReader::ReadToDescendant-Methode. Führt den XmlReader zum nächsten Nachfahren-Element mit dem angegebenen lokalen Namen und Namespace-URI in C++."
type: docs
weight: 7100
url: /de/cpp/system.xml/xmlreader/readtodescendant/
---
## XmlReader::ReadToDescendant(String, String) method


Führt den [XmlReader](../) zum nächsten Nachfahren-Element mit dem angegebenen lokalen Namen und Namespace-URI.

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String localName, String namespaceURI)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| localName | String | Der lokale Name des Elements, zu dem Sie wechseln möchten. |
| namespaceURI | String | Der Namespace-URI des Elements, zu dem Sie wechseln möchten. |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String,String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadToDescendant(String) method


Führt den [XmlReader](../) zum nächsten Nachfahren-Element mit dem angegebenen qualifizierten Namen.

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String name)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Name | String | Der qualifizierte Name des Elements, zu dem Sie wechseln möchten. |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
