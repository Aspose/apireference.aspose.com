---
title: "Метод System::Xml::XPath::XPathNavigator::SelectAncestors"
linktitle: "SelectAncestors"
second_title: "Aspose.Page для C++"
description: "Метод System::Xml::XPath::XPathNavigator::SelectAncestors. Выбирает все узлы‑предки текущего узла, имеющие указанные локальное имя и URI пространства имён в C++."
type: docs
weight: 7200
url: /ru/cpp/system.xml.xpath/xpathnavigator/selectancestors/
---
## XPathNavigator::SelectAncestors(String, String, bool) method


Выбирает все предковые узлы текущего узла с указанным локальным именем и URI пространства имён.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(String name, String namespaceURI, bool matchSelf)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| name | String | Локальное имя узлов‑предков. |
| namespaceURI | String | URI пространства имён узлов‑предков. |
| matchSelf | bool | Чтобы включить контекстный узел в выборку, **true**; иначе, **false**. |

### ReturnValue

Объект [XPathNodeIterator](../../xpathnodeiterator/) содержащий выбранные узлы. Возвращаемые узлы находятся в обратном порядке документа.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectAncestors(XPathNodeType, bool) method


Выбирает все предковые узлы текущего узла, которые соответствуют [XPathNodeType](../../xpathnodetype/).

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(XPathNodeType type, bool matchSelf)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| type | XPathNodeType | Тип [XPathNodeType](../../xpathnodetype/) предковых узлов. |
| matchSelf | bool | Чтобы включить контекстный узел в выборку, **true**; иначе, **false**. |

### ReturnValue

Объект [XPathNodeIterator](../../xpathnodeiterator/) содержащий выбранные узлы. Возвращаемые узлы находятся в обратном порядке документа.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
