---
title: "System::Xml::XPath::XPathNavigator::MoveToAttribute 메서드"
linktitle: "MoveToAttribute"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::MoveToAttribute 메서드. 일치하는 로컬 이름과 네임스페이스 URI를 가진 속성으로 XPathNavigator를 이동합니다 (C++)."
type: docs
weight: 5100
url: /ko/cpp/system.xml.xpath/xpathnavigator/movetoattribute/
---
## XPathNavigator::MoveToAttribute method


지정된 로컬 이름과 네임스페이스 URI가 일치하는 속성으로 [XPathNavigator](../)를 이동합니다.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToAttribute(String localName, String namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | String | 속성의 로컬 이름입니다. |
| namespaceURI | String | 속성의 네임스페이스 URI; 빈 네임스페이스의 경우 **nullptr**. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the attribute; otherwise, **false**. If **false**, the position of the [XPathNavigator](../) is unchanged.

## 또 보기

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
