---
title: "System::Xml::XPath::XPathNavigator::AppendChildElement метод"
linktitle: "AppendChildElement"
second_title: "Aspose.Page для C++"
description: "System::Xml::XPath::XPathNavigator::AppendChildElement метод. Создаёт новый дочерний элемент в конце списка дочерних узлов текущего узла, используя указанные префикс пространства имён, локальное имя и URI пространства имён со значением, указанным в C++."
type: docs
weight: 200
url: /ru/cpp/system.xml.xpath/xpathnavigator/appendchildelement/
---
## XPathNavigator::AppendChildElement method


Создает новый дочерний элементный узел в конце списка дочерних узлов текущего узла, используя указанный префикс пространства имен, локальное имя и URI пространства имен со значением.

```cpp
virtual void System::Xml::XPath::XPathNavigator::AppendChildElement(String prefix, String localName, String namespaceURI, String value)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| префикс | String | Префикс пространства имён нового дочернего элемента (если есть). |
| localName | String | Локальное имя нового дочернего элемента (если есть). |
| namespaceURI | String | URI пространства имён нового дочернего элемента (если есть). [String::Empty](../../../system/string/empty/) и **nullptr** эквивалентны. |
| value | String | Значение нового дочернего элемента. Если переданы [String::Empty](../../../system/string/empty/) или **nullptr**, создаётся пустой элемент. |

## См. также

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
