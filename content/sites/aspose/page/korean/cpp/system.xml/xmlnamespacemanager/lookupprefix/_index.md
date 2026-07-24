---
title: "System::Xml::XmlNamespaceManager::LookupPrefix 메서드"
linktitle: "LookupPrefix"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNamespaceManager::LookupPrefix 메서드. C++에서 지정된 네임스페이스 URI에 선언된 접두사를 찾습니다."
type: docs
weight: 900
url: /ko/cpp/system.xml/xmlnamespacemanager/lookupprefix/
---
## XmlNamespaceManager::LookupPrefix method


주어진 네임스페이스 URI에 선언된 접두사를 찾습니다.

```cpp
String System::Xml::XmlNamespaceManager::LookupPrefix(const String &uri) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| uri | const String\& | 접두사를 해결할 네임스페이스입니다. |

### ReturnValue

일치하는 접두사입니다. 매핑된 접두사가 없으면 메서드는 [String::Empty](../../../system/string/empty/)을 반환합니다. null 값이 제공되면 **nullptr**이 반환됩니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
