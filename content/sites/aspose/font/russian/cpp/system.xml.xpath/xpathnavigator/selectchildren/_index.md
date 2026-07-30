---
title: "Метод System::Xml::XPath::XPathNavigator::SelectChildren"
linktitle: "SelectChildren"
second_title: "Aspose.Font для C++"
description: "Метод System::Xml::XPath::XPathNavigator::SelectChildren. Выбирает все дочерние узлы текущего узла, у которых локальное имя и URI пространства имён указаны в C++."
type: docs
weight: 7300
url: /ru/cpp/system.xml.xpath/xpathnavigator/selectchildren/
---
## XPathNavigator::SelectChildren(String, String) method


Выбирает все дочерние узлы текущего узла, имеющие указанные локальное имя и URI пространства имен.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectChildren(String name, String namespaceURI)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| имя | String | Локальное имя дочерних узлов. |
| namespaceURI | String | URI пространства имён дочерних узлов. |

### ReturnValue

Объект [XPathNodeIterator](../../xpathnodeiterator/), содержащий выбранные узлы.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectChildren(XPathNodeType) method


Выбирает все дочерние узлы текущего узла, соответствующие [XPathNodeType](../../xpathnodetype/).

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectChildren(XPathNodeType type)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| type | XPathNodeType | Тип [XPathNodeType](../../xpathnodetype/) дочерних узлов. |

### ReturnValue

Объект [XPathNodeIterator](../../xpathnodeiterator/), содержащий выбранные узлы.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
