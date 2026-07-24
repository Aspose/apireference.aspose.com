---
title: "System::Xml::XPath::XPathNavigator::PrependChildElement метод"
linktitle: "PrependChildElement"
second_title: "Aspose.Page для C++"
description: "System::Xml::XPath::XPathNavigator::PrependChildElement метод. Создаёт новый дочерний элемент в начале списка дочерних узлов текущего узла, используя указанные префикс пространства имён, локальное имя и URI пространства имён в C++."
type: docs
weight: 6700
url: /ru/cpp/system.xml.xpath/xpathnavigator/prependchildelement/
---
## XPathNavigator::PrependChildElement method


Создаёт новый дочерний элемент в начале списка дочерних узлов текущего узла, используя указанные префикс пространства имён, локальное имя и URI пространства имён со значением.

```cpp
virtual void System::Xml::XPath::XPathNavigator::PrependChildElement(String prefix, String localName, String namespaceURI, String value)
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
