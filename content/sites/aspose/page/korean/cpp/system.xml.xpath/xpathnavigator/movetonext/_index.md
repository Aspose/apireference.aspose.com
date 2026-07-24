---
title: "System::Xml::XPath::XPathNavigator::MoveToNext 메서드"
linktitle: "MoveToNext"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::MoveToNext 메서드. 파생 클래스에서 재정의될 경우, C++에서 현재 노드의 다음 형제 노드로 XPathNavigator를 이동시킵니다."
type: docs
weight: 6000
url: /ko/cpp/system.xml.xpath/xpathnavigator/movetonext/
---
## XPathNavigator::MoveToNext() method


파생 클래스에서 재정의될 경우, 현재 노드의 다음 형제 노드로 [XPathNavigator](../)를 이동시킵니다.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext()=0
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 또 보기

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToNext(String, String) method


[XPathNavigator](../)를 지정된 로컬 이름 및 네임스페이스 URI를 가진 다음 형제 노드로 이동시킵니다.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(String localName, String namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | String | 이동할 다음 형제 노드의 로컬 이름. |
| namespaceURI | String | 이동할 다음 형제 노드의 네임스페이스 URI. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; **false** if there are no more siblings, or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 또 보기

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToNext(XPathNodeType) method


[XPathNavigator](../)를 현재 노드의 다음 형제 노드 중 지정된 [XPathNodeType](../../xpathnodetype/)와 일치하는 노드로 이동시킵니다.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(XPathNodeType type)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| type | XPathNodeType | 이동할 형제 노드의 [XPathNodeType](../../xpathnodetype/). |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise, **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 또 보기

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
