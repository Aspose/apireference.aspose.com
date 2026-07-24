---
title: "System::Xml::XmlDocument::CreateNode метод"
linktitle: "CreateNode"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlDocument::CreateNode метод. Создаёт XmlNode с указанным типом узла, XmlDocument::get_Name и XmlNode::get_NamespaceURI в C++."
type: docs
weight: 1100
url: /ru/cpp/system.xml/xmldocument/createnode/
---
## XmlDocument::CreateNode(const String\&, const String\&, const String\&) method


Создаёт [XmlNode](../../xmlnode/) с указанным типом узла, [XmlDocument::get_Name](../get_name/) и [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(const String &nodeTypeString, const String &name, const String &namespaceURI)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| nodeTypeString | const String\& | [String](../../../system/string/) версия [XmlNodeType](../../xmlnodetype/) нового узла. Этот параметр должен быть одним из значений, перечисленных в таблице ниже. |
| name | const String\& | Квалифицированное имя нового узла. Если имя содержит двоеточие, оно разбивается на компоненты [XmlNode::get_Prefix](../../xmlnode/get_prefix/) и [XmlDocument::get_LocalName](../get_localname/). |
| namespaceURI | const String\& | URI пространства имён нового узла. |

### ReturnValue

Новый [XmlNode](../../xmlnode/).
## Примечания



Параметр **nodeTypeString** чувствителен к регистру и должен быть одним из значений в следующей таблице: |||
|-|-|
| nodeTypeString | XmlNodeType |
| attribute | Attribute |
| cdatasection | CDATA |
| comment | Comment |
| document | Document |
| documentfragment | DocumentFragment |
| documenttype | DocumentType |
| element | Element |
| entityreference | EntityReference |
| processinginstruction | ProcessingInstruction |
| significantwhitespace | SignificantWhitespace |
| text | Text |
| whitespace | Пробелы |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&) method


Создает [XmlNode](../../xmlnode/) с указанным [XmlNodeType](../../xmlnodetype/), [XmlDocument::get_Name](../get_name/) и [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &name, const String &namespaceURI)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| type | XmlNodeType | Тип [XmlNodeType](../../xmlnodetype/) нового узла. |
| name | const String\& | Полное имя нового узла. Если имя содержит двоеточие, оно разбивается на компоненты [XmlNode::get_Prefix](../../xmlnode/get_prefix/) и [XmlDocument::get_LocalName](../get_localname/). |
| namespaceURI | const String\& | URI пространства имён нового узла. |

### ReturnValue

Новый [XmlNode](../../xmlnode/).

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::CreateNode(XmlNodeType, const String\&, const String\&, const String\&) method


Создает [XmlNode](../../xmlnode/) с указанным [XmlNodeType](../../xmlnodetype/), [XmlNode::get_Prefix](../../xmlnode/get_prefix/), [XmlDocument::get_Name](../get_name/) и [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlDocument::CreateNode(XmlNodeType type, const String &prefix, const String &name, const String &namespaceURI)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| type | XmlNodeType | Тип [XmlNodeType](../../xmlnodetype/) нового узла. |
| префикс | const String\& | Префикс нового узла. |
| name | const String\& | Локальное имя нового узла. |
| namespaceURI | const String\& | URI пространства имён нового узла. |

### ReturnValue

Новый [XmlNode](../../xmlnode/).

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
