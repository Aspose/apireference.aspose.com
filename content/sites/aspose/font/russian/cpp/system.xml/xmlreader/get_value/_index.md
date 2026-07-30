---
title: "System::Xml::XmlReader::get_Value метод"
linktitle: "get_Value"
second_title: "Aspose.Font для C++"
description: "System::Xml::XmlReader::get_Value метод. При переопределении в производном классе получает текстовое значение текущего узла в C++."
type: docs
weight: 2400
url: /ru/cpp/system.xml/xmlreader/get_value/
---
## XmlReader::get_Value method


При переопределении в производном классе получает текстовое значение текущего узла.

```cpp
virtual String System::Xml::XmlReader::get_Value()=0
```


### ReturnValue

Возвращаемое значение зависит от значения [XmlReader::get_NodeType](../get_nodetype/) узла.
## Примечания



В следующей таблице перечислены типы узлов, имеющие значение для возврата. Все остальные типы узлов возвращают [String::Empty](../../../system/string/empty/). |||
|-|-|
| Тип узла | Значение |
| Attribute | Значение атрибута. |
| CDATA | Содержимое секции CDATA. |
| Comment | Содержимое комментария. |
| DocumentType | Внутреннее подмножество. |
| ProcessingInstruction | Весь контент, за исключением цели. |
| SignificantWhitespace | Пробелы между разметкой в модели смешанного контента. |
| Text | Содержимое текстового узла. |
| Whitespace | Пробелы между разметкой. |
| XmlDeclaration | Содержимое декларации. |

## См. также

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
