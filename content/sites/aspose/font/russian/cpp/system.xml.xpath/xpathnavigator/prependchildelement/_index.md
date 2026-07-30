---
title: "System::Xml::XPath::XPathNavigator::PrependChildElement метод"
linktitle: "PrependChildElement"
second_title: "Aspose.Font для C++"
description: "System::Xml::XPath::XPathNavigator::PrependChildElement метод. Создаёт новый дочерний элемент в начале списка дочерних узлов текущего узла, используя указанные префикс пространства имён, локальное имя и URI пространства имён со значением, указанным в C++."
type: docs
weight: 6700
url: /ru/cpp/system.xml.xpath/xpathnavigator/prependchildelement/
---
## XPathNavigator::PrependChildElement method


Создает новый дочерний элемент в начале списка дочерних узлов текущего узла, используя указанный префикс пространства имен, локальное имя и URI пространства имен, а также указанное значение.

```cpp
virtual void System::Xml::XPath::XPathNavigator::PrependChildElement(String prefix, String localName, String namespaceURI, String value)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| префикс | String | Префикс пространства имён нового дочернего элемента (если указан). |
| localName | String | Локальное имя нового дочернего элемента (если указано). |
| namespaceURI | String | URI пространства имён нового дочернего элемента (если указан). [String::Empty](../../../system/string/empty/) и **nullptr** эквивалентны. |
| value | String | Значение нового дочернего элемента. Если передано [String::Empty](../../../system/string/empty/) или **nullptr**, создаётся пустой элемент. |

## См. также

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
