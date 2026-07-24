---
title: "System::Xml::XPath::XPathNavigator::MoveToNamespace 메서드"
linktitle: "MoveToNamespace"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::MoveToNamespace 메서드. C++에서 지정된 네임스페이스 접두사와 일치하는 네임스페이스 노드로 XPathNavigator를 이동합니다."
type: docs
weight: 5900
url: /ko/cpp/system.xml.xpath/xpathnavigator/movetonamespace/
---
## XPathNavigator::MoveToNamespace method


지정된 네임스페이스 접두사가 있는 네임스페이스 노드로 [XPathNavigator](../)를 이동합니다.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNamespace(String name)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 네임스페이스 노드의 네임스페이스 접두사입니다. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the specified namespace; **false** if a matching namespace node was not found, or if the [XPathNavigator](../) is not positioned on an element node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 또 보기

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
