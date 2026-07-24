---
title: "System::Xml::XmlNamespaceManager::LookupNamespace 메서드"
linktitle: "LookupNamespace"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNamespaceManager::LookupNamespace 메서드. C++에서 지정된 접두사에 대한 네임스페이스 URI를 반환합니다."
type: docs
weight: 800
url: /ko/cpp/system.xml/xmlnamespacemanager/lookupnamespace/
---
## XmlNamespaceManager::LookupNamespace method


지정된 접두사에 대한 네임스페이스 URI를 반환합니다.

```cpp
String System::Xml::XmlNamespaceManager::LookupNamespace(const String &prefix) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| prefix | const String\& | 네임스페이스 URI를 확인하려는 접두사입니다. 기본 네임스페이스와 일치시키려면 [String::Empty](../../../system/string/empty/)를 전달하십시오. |

### ReturnValue

**prefix** 또는 매핑된 네임스페이스가 없을 경우 **nullptr**에 대한 네임스페이스 URI입니다. 반환된 문자열은 원자화됩니다. 원자화된 문자열에 대한 자세한 내용은 [XmlNameTable](../../xmlnametable/) 클래스를 참조하십시오.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
