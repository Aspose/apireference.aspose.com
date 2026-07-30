---
title: "System::Xml::XmlReader::ReadToNextSibling yöntemi"
linktitle: "ReadToNextSibling"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlReader::ReadToNextSibling yöntemi. C++'ta XmlReader'ı belirtilen yerel ad ve ad alanı URI'sine sahip bir sonraki kardeş öğeye ilerletir."
type: docs
weight: 7300
url: /tr/cpp/system.xml/xmlreader/readtonextsibling/
---
## XmlReader::ReadToNextSibling(String, String) method


[XmlReader](../) öğesini belirtilen yerel ad ve ad alanı URI'sine sahip bir sonraki kardeş öğeye ilerletir.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String localName, String namespaceURI)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| localName | Dize | Gitmek istediğiniz kardeş öğenin yerel adı. |
| namespaceURI | Dize | Taşımak istediğiniz kardeş öğenin ad alanı URI'si. |

### ReturnValue

**true** if a matching sibling element is found; otherwise, **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlReader::ReadToNextSibling(String) method


[XmlReader](../) öğesini belirtilen nitelikli ada sahip bir sonraki kardeş öğeye ilerletir.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String name)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ad | Dize | Taşımak istediğiniz kardeş öğenin nitelikli adı. |

### ReturnValue

**true** if a matching sibling element is found; otherwise **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
