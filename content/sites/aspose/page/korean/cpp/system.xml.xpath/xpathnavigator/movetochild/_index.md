---
title: "System::Xml::XPath::XPathNavigator::MoveToChild 메서드"
linktitle: "MoveToChild"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::MoveToChild 메서드. 지정된 로컬 이름과 네임스페이스 URI를 가진 자식 노드로 XPathNavigator를 이동합니다 (C++)."
type: docs
weight: 5200
url: /ko/cpp/system.xml.xpath/xpathnavigator/movetochild/
---
## XPathNavigator::MoveToChild(String, String) method


지정된 로컬 이름과 네임스페이스 URI를 가진 자식 노드로 [XPathNavigator](../)를 이동합니다.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToChild(String localName, String namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | String | 이동할 자식 노드의 로컬 이름. |
| namespaceURI | String | 이동할 자식 노드의 네임스페이스 URI. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the child node; otherwise, **false**. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 또 보기

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToChild(XPathNodeType) method


지정된 [XPathNodeType](../../xpathnodetype/)의 자식 노드로 [XPathNavigator](../)를 이동합니다.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToChild(XPathNodeType type)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| type | XPathNodeType | 이동할 자식 노드의 [XPathNodeType](../../xpathnodetype/). |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the child node; otherwise, **false**. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 또 보기

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
