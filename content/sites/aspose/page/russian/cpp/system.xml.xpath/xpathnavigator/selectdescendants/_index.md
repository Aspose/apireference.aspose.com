---
title: "System::Xml::XPath::XPathNavigator::SelectDescendants метод"
linktitle: "SelectDescendants"
second_title: "Aspose.Page для C++"
description: "System::Xml::XPath::XPathNavigator::SelectDescendants метод. Выбирает все узлы-потомки текущего узла с указанными локальным именем и URI пространства имен в C++."
type: docs
weight: 7400
url: /ru/cpp/system.xml.xpath/xpathnavigator/selectdescendants/
---
## XPathNavigator::SelectDescendants(String, String, bool) method


Выбирает все потомки текущего узла с указанным локальным именем и URI пространства имён.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(String name, String namespaceURI, bool matchSelf)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| name | String | Локальное имя узлов-потомков. |
| namespaceURI | String | URI пространства имен узлов-потомков. |
| matchSelf | bool | **true** чтобы включить контекстный узел в выборку; иначе **false**. |

### ReturnValue

Объект [XPathNodeIterator](../../xpathnodeiterator/), содержащий выбранные узлы.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectDescendants(XPathNodeType, bool) method


Выбирает все узлы-потомки текущего узла, имеющие соответствующий [XPathNodeType](../../xpathnodetype/).

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(XPathNodeType type, bool matchSelf)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| type | XPathNodeType | Тип [XPathNodeType](../../xpathnodetype/) узлов-потомков. |
| matchSelf | bool | **true** чтобы включить контекстный узел в выборку; иначе **false**. |

### ReturnValue

Объект [XPathNodeIterator](../../xpathnodeiterator/), содержащий выбранные узлы.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
