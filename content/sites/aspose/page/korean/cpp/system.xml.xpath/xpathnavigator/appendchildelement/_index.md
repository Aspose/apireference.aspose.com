---
title: "System::Xml::XPath::XPathNavigator::AppendChildElement method"
linktitle: "AppendChildElement"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::AppendChildElement method. 지정된 네임스페이스 접두사, 로컬 이름 및 네임스페이스 URI와 C++에서 지정된 값을 사용하여 현재 노드의 자식 노드 목록 끝에 새로운 자식 요소 노드를 생성합니다."
type: docs
weight: 200
url: /ko/cpp/system.xml.xpath/xpathnavigator/appendchildelement/
---
## XPathNavigator::AppendChildElement method


지정된 네임스페이스 접두사, 로컬 이름 및 네임스페이스 URI와 값을 사용하여 현재 노드의 자식 노드 목록 끝에 새 자식 요소 노드를 생성합니다.

```cpp
virtual void System::Xml::XPath::XPathNavigator::AppendChildElement(String prefix, String localName, String namespaceURI, String value)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 접두사 | String | 새로운 자식 요소 노드의 네임스페이스 접두사(있는 경우). |
| localName | String | 새로운 자식 요소 노드의 로컬 이름(있는 경우). |
| namespaceURI | String | 새 자식 요소 노드의 네임스페이스 URI (있는 경우). [String::Empty](../../../system/string/empty/)와 **nullptr**는 동일합니다. |
| value | String | 새 자식 요소 노드의 값입니다. [String::Empty](../../../system/string/empty/) 또는 **nullptr**가 전달되면 빈 요소가 생성됩니다. |

## 또 보기

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
