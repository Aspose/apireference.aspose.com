---
title: "Метод System::Xml::XPath::XPathNavigator::SelectDescendants"
linktitle: "SelectDescendants"
second_title: "Aspose.Font для C++"
description: "System::Xml::XPath::XPathNavigator::SelectDescendants method. Выбирает все дочерние узлы текущего узла с локальным именем и URI пространства имён, указанными в C++."
type: docs
weight: 7400
url: /ru/cpp/system.xml.xpath/xpathnavigator/selectdescendants/
---
## XPathNavigator::SelectDescendants(String, String, bool) method


Выбирает все потомки текущего узла, имеющие указанные локальное имя и URI пространства имен.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(String name, String namespaceURI, bool matchSelf)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| имя | String | Локальное имя дочерних узлов. |
| namespaceURI | String | URI пространства имён дочерних узлов. |
| matchSelf | bool | **true** чтобы включить контекстный узел в выборку; иначе **false**. |

### ReturnValue

Объект [XPathNodeIterator](../../xpathnodeiterator/), содержащий выбранные узлы.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectDescendants(XPathNodeType, bool) method


Выбирает все дочерние узлы текущего узла, которые имеют соответствующий [XPathNodeType](../../xpathnodetype/).

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(XPathNodeType type, bool matchSelf)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| type | XPathNodeType | Тип [XPathNodeType](../../xpathnodetype/) дочерних узлов. |
| matchSelf | bool | **true** чтобы включить контекстный узел в выборку; иначе **false**. |

### ReturnValue

Объект [XPathNodeIterator](../../xpathnodeiterator/), содержащий выбранные узлы.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
