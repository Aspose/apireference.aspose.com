---
title: "System::Xml::XmlNamespaceManager::AddNamespace 메서드"
linktitle: "AddNamespace"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNamespaceManager::AddNamespace 메서드. C++에서 지정된 네임스페이스를 컬렉션에 추가합니다."
type: docs
weight: 200
url: /ko/cpp/system.xml/xmlnamespacemanager/addnamespace/
---
## XmlNamespaceManager::AddNamespace method


주어진 네임스페이스를 컬렉션에 추가합니다.

```cpp
virtual void System::Xml::XmlNamespaceManager::AddNamespace(String prefix, String uri)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| prefix | String | 추가되는 네임스페이스와 연결할 접두사입니다. 기본 네임스페이스를 추가하려면 [String::Empty](../../../system/string/empty/)을 사용하십시오. [XmlNamespaceManager](../)가 XML 경로 언어([XPath](../../../system.xml.xpath/)) 식에서 네임스페이스를 해결하는 데 사용될 경우, 접두사를 지정해야 합니다. [XPath](../../../system.xml.xpath/) 식에 접두사가 포함되지 않으면 해당 네임스페이스의 Uniform Resource Identifier(URI)가 빈 네임스페이스라고 가정합니다. [XPath](../../../system.xml.xpath/) 식 및 [XmlNamespaceManager](../)에 대한 자세한 내용은 XmlNode::SelectNodes(String) 및 XPathExpression::SetContext(SharedPtr<XmlNamespaceManager>) 메서드를 참조하십시오. |
| uri | String | 추가할 네임스페이스입니다. |

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
