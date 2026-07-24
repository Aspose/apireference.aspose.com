---
title: "System::Xml::XPath::XPathNavigator::GetAttribute method"
linktitle: "GetAttribute"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::GetAttribute method. 지정된 로컬 이름과 네임스페이스 URI를 가진 속성의 값을 C++에서 반환합니다."
type: docs
weight: 3800
url: /ko/cpp/system.xml.xpath/xpathnavigator/getattribute/
---
## XPathNavigator::GetAttribute method


지정된 로컬 이름 및 네임스페이스 URI를 가진 속성의 값을 반환합니다.

```cpp
virtual String System::Xml::XPath::XPathNavigator::GetAttribute(String localName, String namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | String | 속성의 로컬 이름입니다. **localName**은 대소문자를 구분합니다. |
| namespaceURI | String | 속성의 네임스페이스 URI입니다. |

### ReturnValue

지정된 속성의 값을 포함하는 [String](../../../system/string/); 일치하는 속성을 찾을 수 없거나 [XPathNavigator](../)가 요소 노드에 위치하지 않은 경우 [String::Empty](../../../system/string/empty/).

## 또 보기

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
