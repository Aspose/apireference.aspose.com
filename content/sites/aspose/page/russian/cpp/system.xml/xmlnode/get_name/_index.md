---
title: "System::Xml::XmlNode::get_Name метод"
linktitle: "get_Name"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlNode::get_Name метод. Возвращает квалифицированное имя узла, когда переопределён в производном классе в C++."
type: docs
weight: 1500
url: /ru/cpp/system.xml/xmlnode/get_name/
---
## XmlNode::get_Name method


Возвращает квалифицированное имя узла, когда переопределено в производном классе.

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
| Element | Полное имя элемента. |
| Entity | Имя сущности. |
| EntityReference | Имя ссылки на сущность. |
| Нотация | Имя нотации. |
| ProcessingInstruction | Цель инструкции обработки. |
| Text | #text |
| Пробелы | #whitespace |
| SignificantWhitespace | #significant-whitespace |
| XmlDeclaration | #xml-declaration |

## См. также

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
