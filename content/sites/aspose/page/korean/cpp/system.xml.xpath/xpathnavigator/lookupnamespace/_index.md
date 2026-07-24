---
title: "System::Xml::XPath::XPathNavigator::LookupNamespace 메서드"
linktitle: "LookupNamespace"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::LookupNamespace 메서드. 지정된 접두사에 대한 네임스페이스 URI를 반환합니다(C++)."
type: docs
weight: 4700
url: /ko/cpp/system.xml.xpath/xpathnavigator/lookupnamespace/
---
## XPathNavigator::LookupNamespace method


지정된 접두사에 대한 네임스페이스 URI를 반환합니다.

```cpp
String System::Xml::XPath::XPathNavigator::LookupNamespace(const String &prefix) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| prefix | const String\& | 네임스페이스 URI를 확인하려는 접두사입니다. 기본 네임스페이스와 일치시키려면 [String::Empty](../../../system/string/empty/)를 전달하십시오. |

### ReturnValue

지정된 네임스페이스 접두사에 할당된 네임스페이스 URI를 포함하는 [String](../../../system/string/)이며, 해당 접두사에 네임스페이스 URI가 할당되지 않은 경우 **nullptr**를 반환합니다. 반환된 [String](../../../system/string/)은 원자화됩니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
