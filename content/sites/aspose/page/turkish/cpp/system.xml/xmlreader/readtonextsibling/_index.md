---
title: "System::Xml::XmlReader::ReadToNextSibling yöntemi"
linktitle: "ReadToNextSibling"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlReader::ReadToNextSibling yöntemi. C++'da XmlReader'ı belirtilen yerel ad ve ad alanı URI'sine sahip bir sonraki kardeş öğeye ilerletir."
type: docs
weight: 7300
url: /tr/cpp/system.xml/xmlreader/readtonextsibling/
---
## XmlReader::ReadToNextSibling(String, String) method


[XmlReader](../) öğesini belirtilen yerel ad ve ad alanı URI'sine sahip bir sonraki kardeş öğeye ilerletir.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String localName, String namespaceURI)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| localName | String | Gitmek istediğiniz kardeş öğenin yerel adı. |
| namespaceURI | String | Gitmek istediğiniz kardeş öğenin ad alanı URI'si. |

### ReturnValue

**true** if a matching sibling element is found; otherwise, **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlReader::ReadToNextSibling(String) method


[XmlReader](../) öğesini belirtilen nitelikli ada sahip bir sonraki kardeş öğeye ilerletir.

```cpp
virtual bool System::Xml::XmlReader::ReadToNextSibling(String name)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ad | String | Gitmek istediğiniz kardeş öğenin nitelikli adı. |

### ReturnValue

**true** if a matching sibling element is found; otherwise **false**. If a matching sibling element is not found, the [XmlReader](../) is positioned on the end tag ([XmlReader::get_NodeType](../get_nodetype/) value is [XmlNodeType::EndElement](../../xmlnodetype/)) of the parent element.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
