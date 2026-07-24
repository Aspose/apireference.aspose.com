---
title: "System::Xml::XmlReader::ReadToDescendant metod"
linktitle: "ReadToDescendant"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlReader::ReadToDescendant metod. Flyttar XmlReader fram till nästa ättlingselement med det angivna lokala namnet och namnrymds‑URI:n i C++."
type: docs
weight: 7100
url: /sv/cpp/system.xml/xmlreader/readtodescendant/
---
## XmlReader::ReadToDescendant(String, String) method


Flyttar [XmlReader](../) till nästa efterföljande element med det angivna lokala namnet och namnrymds-URI:n.

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String localName, String namespaceURI)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| localName | String | Det lokala namnet på elementet du vill flytta till. |
| namespaceURI | String | Namnområdets URI för elementet du vill flytta till. |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String,String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## Se även

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadToDescendant(String) method


Flyttar [XmlReader](../) till nästa efterföljande element med det angivna kvalificerade namnet.

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String name)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| namn | String | Det kvalificerade namnet på elementet du vill flytta till. |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## Se även

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
