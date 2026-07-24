---
title: "System::Xml::XPath::XPathNavigator::CreateAttribute 메서드"
linktitle: "CreateAttribute"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::CreateAttribute 메서드. 현재 요소 노드에 네임스페이스 접두사, 로컬 이름 및 네임스페이스 URI를 사용하여 지정된 값을 C++에서 지정하여 속성 노드를 생성합니다."
type: docs
weight: 700
url: /ko/cpp/system.xml.xpath/xpathnavigator/createattribute/
---
## XPathNavigator::CreateAttribute method


지정된 네임스페이스 접두사, 로컬 이름 및 네임스페이스 URI와 값을 사용하여 현재 요소 노드에 속성 노드를 생성합니다.

```cpp
virtual void System::Xml::XPath::XPathNavigator::CreateAttribute(String prefix, String localName, String namespaceURI, String value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 접두사 | String | 새 속성 노드의 네임스페이스 접두사(있는 경우). |
| localName | String | 새 속성 노드의 로컬 이름으로, [String::Empty](../../../system/string/empty/) 또는 **nullptr**일 수 없습니다. |
| namespaceURI | String | 새 속성 노드의 네임스페이스 URI(있는 경우). |
| value | String | 새 속성 노드의 값입니다. [String::Empty](../../../system/string/empty/) 또는 **nullptr**가 전달되면 빈 속성 노드가 생성됩니다. |

## 또 보기

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
