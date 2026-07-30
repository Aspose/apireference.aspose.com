---
title: "System::Xml::XmlReader::ReadToDescendant metodu"
linktitle: "ReadToDescendant"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlReader::ReadToDescendant metodu. XmlReader'ı belirtilen yerel ada ve ad alanı URI'sine sahip bir sonraki alt öğeye C++'ta ilerletir."
type: docs
weight: 7100
url: /tr/cpp/system.xml/xmlreader/readtodescendant/
---
## XmlReader::ReadToDescendant(String, String) method


[XmlReader](../) öğesini belirtilen yerel ada ve ad alanı URI'sine sahip bir sonraki alt öğeye ilerletir.

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String localName, String namespaceURI)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| localName | Dize | Gitmek istediğiniz öğenin yerel adı. |
| namespaceURI | Dize | Gitmek istediğiniz öğenin ad alanı URI'si. |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String,String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadToDescendant(String) method


[XmlReader](../) öğesini belirtilen nitelikli ada sahip bir sonraki alt öğeye ilerletir.

```cpp
virtual bool System::Xml::XmlReader::ReadToDescendant(String name)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Gitmek istediğiniz öğenin nitelikli adı. |

### ReturnValue

**true** if a matching descendant element is found; otherwise **false**. If a matching child element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the element. If the [XmlReader](../) is not positioned on an element when [XmlReader::ReadToDescendant(String)](./) was called, this method returns **false** and the position of the [XmlReader](../) is not changed.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
