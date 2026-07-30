---
title: "System::Xml::XPath::XPathNavigator::SelectAncestors метод"
linktitle: "SelectAncestors"
second_title: "Aspose.Font для C++"
description: "System::Xml::XPath::XPathNavigator::SelectAncestors метод. Выбирает все узлы‑предки текущего узла, имеющие указанное локальное имя и URI пространства имён в C++."
type: docs
weight: 7200
url: /ru/cpp/system.xml.xpath/xpathnavigator/selectancestors/
---
## XPathNavigator::SelectAncestors(String, String, bool) method


Выбирает все предковые узлы текущего узла, имеющие указанные локальное имя и URI пространства имен.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(String name, String namespaceURI, bool matchSelf)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| имя | String | Локальное имя узлов‑предков. |
| namespaceURI | String | URI пространства имён узлов‑предков. |
| matchSelf | bool | Чтобы включить контекстный узел в выборку, **true**; иначе, **false**. |

### ReturnValue

Экземпляр [XPathNodeIterator](../../xpathnodeiterator/), содержащий выбранные узлы. Возвращённые узлы находятся в обратном порядке документа.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::SelectAncestors(XPathNodeType, bool) method


Выбирает все узлы‑предки текущего узла, имеющие соответствующий [XPathNodeType](../../xpathnodetype/).

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(XPathNodeType type, bool matchSelf)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| type | XPathNodeType | Тип [XPathNodeType](../../xpathnodetype/) узлов‑предков. |
| matchSelf | bool | Чтобы включить контекстный узел в выборку, **true**; иначе, **false**. |

### ReturnValue

Экземпляр [XPathNodeIterator](../../xpathnodeiterator/), содержащий выбранные узлы. Возвращённые узлы находятся в обратном порядке документа.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
