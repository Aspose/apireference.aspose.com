---
title: "System::Xml::XmlNodeReader::get_Value метод"
linktitle: "get_Value"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlNodeReader::get_Value метод. Возвращает текстовое значение текущего узла в C++."
type: docs
weight: 2100
url: /ru/cpp/system.xml/xmlnodereader/get_value/
---
## XmlNodeReader::get_Value method


Возвращает текстовое значение текущего узла.

```cpp
String System::Xml::XmlNodeReader::get_Value() override
```


### ReturnValue

Возвращаемое значение зависит от [XmlNodeReader::get_NodeType](../get_nodetype/) узла.
## Примечания



В следующей таблице перечислены типы узлов, которые имеют возвращаемое значение. Все остальные типы узлов возвращают [String::Empty](../../../system/string/empty/). |||
|-|-|
| Тип узла | Значение |
| Attribute | Значение атрибута. |
| CDATA | Содержимое секции CDATA. |
| Comment | Содержимое комментария. |
| DocumentType | Внутренний набор. |
| ProcessingInstruction | Всё содержимое, за исключением цели. |
| SignificantWhitespace | Пробельные символы между разметкой в модели смешанного содержимого. |
| Text | Содержимое текстового узла. |
| Пробелы | Пробельные символы между разметкой. |
| XmlDeclaration | Содержимое декларации. |

## См. также

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
