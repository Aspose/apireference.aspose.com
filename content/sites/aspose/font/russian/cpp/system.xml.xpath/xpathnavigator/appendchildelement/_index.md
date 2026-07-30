---
title: "System::Xml::XPath::XPathNavigator::AppendChildElement метод"
linktitle: "AppendChildElement"
second_title: "Aspose.Font для C++"
description: "System::Xml::XPath::XPathNavigator::AppendChildElement метод. Создаёт новый дочерний элемент в конце списка дочерних узлов текущего узла, используя указанные префикс пространства имён, локальное имя и URI пространства имён, заданные значением в C++."
type: docs
weight: 200
url: /ru/cpp/system.xml.xpath/xpathnavigator/appendchildelement/
---
## XPathNavigator::AppendChildElement method


Создаёт новый дочерний элементный узел в конце списка дочерних узлов текущего узла, используя указанные префикс пространства имён, локальное имя и URI пространства имён с заданным значением.

```cpp
virtual void System::Xml::XPath::XPathNavigator::AppendChildElement(String prefix, String localName, String namespaceURI, String value)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| префикс | String | Префикс пространства имён нового дочернего элементного узла (если указан). |
| localName | String | Локальное имя нового дочернего элементного узла (если указано). |
| namespaceURI | String | URI пространства имён нового дочернего элементного узла (если указано). [String::Empty](../../../system/string/empty/) и **nullptr** эквивалентны. |
| value | String | Значение нового дочернего элементного узла. Если переданы [String::Empty](../../../system/string/empty/) или **nullptr**, создаётся пустой элемент. |

## См. также

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
