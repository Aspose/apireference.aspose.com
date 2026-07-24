---
title: "enum System::Xml::XPath::XPathNodeType"
linktitle: "XPathNodeType"
second_title: "Aspose.Page для C++"
description: "enum System::Xml::XPath::XPathNodeType. Определяет типы узлов XPath, которые могут быть возвращены классом XPathNavigator в C++."
type: docs
weight: 1100
url: /ru/cpp/system.xml.xpath/xpathnodetype/
---
## XPathNodeType enum


Определяет типы узлов [XPath](../), которые могут быть возвращены классом [XPathNavigator](../xpathnavigator/).

```cpp
enum class XPathNodeType
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| Корень | 0 | Корневой узел XML‑документа или дерева узлов. |
| Element | 1 | Элемент, например **<element>**. |
| Attribute | 2 | Атрибут, например **id='123'**. |
| Пространство имён | 3 | Пространство имён, например **xmlns="namespace"**. |
| Text | 4 | Текстовое содержимое узла. Эквивалентно типам узлов Document [Object](../../system/object/) Model (DOM) [Text](../../system.text/) и CDATA. Содержит как минимум один символ. |
| SignificantWhitespace | 5 | Узел с символами пробела и установленным **xml:space** в значение **preserve**. |
| Пробелы | 6 | Узел, содержащий только символы пробела и без значимых пробельных символов. Символы пробела: **'\\x20'**, **'\\x0d'**, **'\\x0a'**, **'\\x09'**. |
| ProcessingInstruction | 7 | Инструкция обработки, например **<?pi test?>**. Это не включает объявления XML, которые не видны классу [XPathNavigator](../xpathnavigator/). |
| Comment | 8 | Комментарий, например ****. |
| All | 9 | Любой из типов узлов [XPathNodeType](./). |

## См. также

* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
