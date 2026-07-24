---
title: "System::Xml::XPath::XPathNavigator::CreateAttribute метод"
linktitle: "CreateAttribute"
second_title: "Aspose.Page для C++"
description: "System::Xml::XPath::XPathNavigator::CreateAttribute метод. Создает узел атрибута в текущем элементе, используя указанный префикс пространства имен, локальное имя и URI пространства имен со значением, указанным в C++."
type: docs
weight: 700
url: /ru/cpp/system.xml.xpath/xpathnavigator/createattribute/
---
## XPathNavigator::CreateAttribute method


Создает узел атрибута в текущем элементном узле, используя указанный префикс пространства имен, локальное имя и URI пространства имен со значением.

```cpp
virtual void System::Xml::XPath::XPathNavigator::CreateAttribute(String prefix, String localName, String namespaceURI, String value)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| префикс | String | Префикс пространства имен нового узла атрибута (если есть). |
| localName | String | Локальное имя нового узла атрибута, которое не может быть [String::Empty](../../../system/string/empty/) или **nullptr**. |
| namespaceURI | String | URI пространства имен для нового узла атрибута (если есть). |
| value | String | Значение нового узла атрибута. Если передано [String::Empty](../../../system/string/empty/) или **nullptr**, создаётся пустой узел атрибута. |

## См. также

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
