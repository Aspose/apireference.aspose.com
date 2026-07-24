---
title: "System::Xml::XPath::XPathNavigator::LookupPrefix 메서드"
linktitle: "LookupPrefix"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::LookupPrefix 메서드. 지정된 네임스페이스 URI에 대해 선언된 접두사를 C++에서 반환합니다."
type: docs
weight: 4800
url: /ko/cpp/system.xml.xpath/xpathnavigator/lookupprefix/
---
## XPathNavigator::LookupPrefix method


지정된 네임스페이스 URI에 대해 선언된 접두사를 반환합니다.

```cpp
String System::Xml::XPath::XPathNavigator::LookupPrefix(const String &namespaceURI) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| namespaceURI | const String\& | 접두사를 해결하기 위한 네임스페이스 URI입니다. |

### ReturnValue

지정된 네임스페이스 URI에 할당된 네임스페이스 접두사를 포함하는 [String](../../../system/string/)이며, 지정된 네임스페이스 URI에 접두사가 할당되지 않은 경우 [String::Empty](../../../system/string/empty/)을 반환합니다. 반환된 [String](../../../system/string/)은 원자화됩니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
