---
title: "System::Xml::XPath::XPathNavigator::MoveToChild метод"
linktitle: "MoveToChild"
second_title: "Aspose.Font для C++"
description: "System::Xml::XPath::XPathNavigator::MoveToChild метод. Перемещает XPathNavigator к дочернему узлу с указанным локальным именем и URI пространства имён в C++."
type: docs
weight: 5200
url: /ru/cpp/system.xml.xpath/xpathnavigator/movetochild/
---
## XPathNavigator::MoveToChild(String, String) method


Перемещает [XPathNavigator](../) к дочернему узлу с указанным локальным именем и URI пространства имён.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToChild(String localName, String namespaceURI)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| localName | String | Локальное имя дочернего узла, к которому нужно переместиться. |
| namespaceURI | String | URI пространства имён дочернего узла, к которому нужно переместиться. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the child node; otherwise, **false**. If **false**, the position of the [XPathNavigator](../) is unchanged.

## См. также

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToChild(XPathNodeType) method


Перемещает [XPathNavigator](../) к дочернему узлу указанного типа [XPathNodeType](../../xpathnodetype/).

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToChild(XPathNodeType type)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| type | XPathNodeType | [XPathNodeType](../../xpathnodetype/) дочернего узла, к которому нужно переместиться. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the child node; otherwise, **false**. If **false**, the position of the [XPathNavigator](../) is unchanged.

## См. также

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
