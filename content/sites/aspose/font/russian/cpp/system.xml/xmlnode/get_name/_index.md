---
title: "Метод System::Xml::XmlNode::get_Name"
linktitle: "get_Name"
second_title: "Aspose.Font для C++"
description: "Метод System::Xml::XmlNode::get_Name. Возвращает квалифицированное имя узла, когда переопределён в производном классе на C++."
type: docs
weight: 1500
url: /ru/cpp/system.xml/xmlnode/get_name/
---
## XmlNode::get_Name method


Возвращает полное (квалифицированное) имя узла, когда переопределяется в производном классе.

```cpp
virtual String System::Xml::XmlNode::get_Name()=0
```


### ReturnValue

Квалифицированное имя узла.
## Примечания



Возвращаемое имя зависит от [XmlNode::get_NodeType](../get_nodetype/) узла: |||
|-|-|
| Тип | Имя |
| Attribute | Полное имя атрибута. |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | Имя типа документа. |
| Element | Квалифицированное имя элемента. |
| Entity | Имя сущности. |
| EntityReference | Имя ссылки на сущность. |
| Notation | Имя нотации. |
| ProcessingInstruction | Цель инструкции обработки. |
| Text | #text |
| Whitespace | #whitespace |
| SignificantWhitespace | #significant-whitespace |
| XmlDeclaration | #xml-declaration |

## См. также

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
